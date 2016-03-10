package net.minecraftforge.test;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayer.EnumStatus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTBase.NBTPrimitive;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.event.entity.player.SleepingLocationCheckEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = NoBedSleepingTest.MODID, version = NoBedSleepingTest.VERSION)
public class NoBedSleepingTest
{
    public static final String MODID = "ForgeDebugNoBedSleeping";
    public static final String VERSION = "1.0";
    @CapabilityInject(IExtraSleeping.class)
    private static final Capability<IExtraSleeping> SLEEP_CAP = null;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerItem(ItemSleepingPill.instance, ItemSleepingPill.name);
        CapabilityManager.INSTANCE.register(IExtraSleeping.class, new Storage(), DefaultImpl.class);
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    public static class EventHandler
    {
        @SubscribeEvent
        public void onEntityConstruct(AttachCapabilitiesEvent evt)
        {
            evt.addCapability(new ResourceLocation(MODID, "IExtraSleeping"), new ICapabilitySerializable<NBTPrimitive>()
            {
                IExtraSleeping inst = SLEEP_CAP.getDefaultInstance();
                @Override
                public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
                    return capability == SLEEP_CAP;
                }

                @SuppressWarnings("unchecked")
                @Override
                public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
                    return capability == SLEEP_CAP ? (T)inst : null;
                }

                @Override
                public NBTPrimitive serializeNBT() {
                    return (NBTPrimitive)SLEEP_CAP.getStorage().writeNBT(SLEEP_CAP, inst, null);
                }

                @Override
                public void deserializeNBT(NBTPrimitive nbt) {
                    SLEEP_CAP.getStorage().readNBT(SLEEP_CAP, inst, null, nbt);
                }
            });
        }

        @SubscribeEvent
        public void onBedCheck(SleepingLocationCheckEvent evt)
        {
            final IExtraSleeping sleep = evt.entityPlayer.getCapability(SLEEP_CAP, null);
            if (sleep != null && sleep.isSleeping())
                evt.setResult(Result.ALLOW);
        }

        @SubscribeEvent
        public void onWakeUp(PlayerWakeUpEvent evt)
        {
            final IExtraSleeping sleep = evt.entityPlayer.getCapability(SLEEP_CAP, null);
            if (sleep != null)
                sleep.setSleeping(false);
        }
    }

    public interface IExtraSleeping {
        boolean isSleeping();
        void setSleeping(boolean value);
    }

    public static class Storage implements IStorage<IExtraSleeping>
    {
        @Override
        public NBTBase writeNBT(Capability<IExtraSleeping> capability, IExtraSleeping instance, EnumFacing side)
        {
            return new NBTTagByte((byte)(instance.isSleeping() ? 1 : 0));
        }

        @Override
        public void readNBT(Capability<IExtraSleeping> capability, IExtraSleeping instance, EnumFacing side, NBTBase nbt)
        {
            instance.setSleeping(((NBTPrimitive)nbt).getByte() == 1);
        }
    }

    public static class DefaultImpl implements IExtraSleeping
    {
        private boolean isSleeping = false;
        @Override public boolean isSleeping() { return isSleeping; }
        @Override public void setSleeping(boolean value) { this.isSleeping = value; }
    }

    public static class ItemSleepingPill extends Item
    {
        public static final ItemSleepingPill instance = new ItemSleepingPill();
        public static final String name = "sleeping_pill";

        private ItemSleepingPill()
        {
            setCreativeTab(CreativeTabs.tabMisc);
            setUnlocalizedName(MODID + ":" + name);
        }

        @Override
        public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand)
        {
            if (!world.isRemote)
            {
                final EnumStatus result = player.trySleep(player.getPosition());
                if (result == EnumStatus.OK)
                {
                    final IExtraSleeping sleep = player.getCapability(SLEEP_CAP, null);
                    if (sleep != null)
                        sleep.setSleeping(true);
                    return ActionResult.newResult(EnumActionResult.SUCCESS, stack);
                }
            }
            return ActionResult.newResult(EnumActionResult.PASS, stack);
        }
    }
}