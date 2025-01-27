/*
 * Minecraft Forge
 * Copyright (c) 2016-2021.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.common;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag.Named;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

import javax.annotation.Nullable;
import java.util.Set;
import java.util.function.Supplier;

public class Tags
{
    public static void init ()
    {
        Blocks.init();
        Items.init();
        EntityTypes.init();
        Fluids.init();
    }

    public static class Blocks
    {
        private static void init(){}

        public static final IOptionalNamedTag<Block> BARRELS = tag("barrels");
        public static final IOptionalNamedTag<Block> BARRELS_WOODEN = tag("barrels/wooden");
        public static final IOptionalNamedTag<Block> CHESTS = tag("chests");
        public static final IOptionalNamedTag<Block> CHESTS_ENDER = tag("chests/ender");
        public static final IOptionalNamedTag<Block> CHESTS_TRAPPED = tag("chests/trapped");
        public static final IOptionalNamedTag<Block> CHESTS_WOODEN = tag("chests/wooden");
        public static final IOptionalNamedTag<Block> COBBLESTONE = tag("cobblestone");
        public static final IOptionalNamedTag<Block> COBBLESTONE_NORMAL = tag("cobblestone/normal");
        public static final IOptionalNamedTag<Block> COBBLESTONE_INFESTED = tag("cobblestone/infested");
        public static final IOptionalNamedTag<Block> COBBLESTONE_MOSSY = tag("cobblestone/mossy");
        public static final IOptionalNamedTag<Block> COBBLESTONE_DEEPSLATE = tag("cobblestone/deepslate");
        public static final IOptionalNamedTag<Block> END_STONES = tag("end_stones");
        public static final IOptionalNamedTag<Block> ENDERMAN_PLACE_ON_BLACKLIST = tag("enderman_place_on_blacklist");
        public static final IOptionalNamedTag<Block> FENCE_GATES = tag("fence_gates");
        public static final IOptionalNamedTag<Block> FENCE_GATES_WOODEN = tag("fence_gates/wooden");
        public static final IOptionalNamedTag<Block> FENCES = tag("fences");
        public static final IOptionalNamedTag<Block> FENCES_NETHER_BRICK = tag("fences/nether_brick");
        public static final IOptionalNamedTag<Block> FENCES_WOODEN = tag("fences/wooden");

        public static final IOptionalNamedTag<Block> GLASS = tag("glass");
        public static final IOptionalNamedTag<Block> GLASS_BLACK = tag("glass/black");
        public static final IOptionalNamedTag<Block> GLASS_BLUE = tag("glass/blue");
        public static final IOptionalNamedTag<Block> GLASS_BROWN = tag("glass/brown");
        public static final IOptionalNamedTag<Block> GLASS_COLORLESS = tag("glass/colorless");
        public static final IOptionalNamedTag<Block> GLASS_CYAN = tag("glass/cyan");
        public static final IOptionalNamedTag<Block> GLASS_GRAY = tag("glass/gray");
        public static final IOptionalNamedTag<Block> GLASS_GREEN = tag("glass/green");
        public static final IOptionalNamedTag<Block> GLASS_LIGHT_BLUE = tag("glass/light_blue");
        public static final IOptionalNamedTag<Block> GLASS_LIGHT_GRAY = tag("glass/light_gray");
        public static final IOptionalNamedTag<Block> GLASS_LIME = tag("glass/lime");
        public static final IOptionalNamedTag<Block> GLASS_MAGENTA = tag("glass/magenta");
        public static final IOptionalNamedTag<Block> GLASS_ORANGE = tag("glass/orange");
        public static final IOptionalNamedTag<Block> GLASS_PINK = tag("glass/pink");
        public static final IOptionalNamedTag<Block> GLASS_PURPLE = tag("glass/purple");
        public static final IOptionalNamedTag<Block> GLASS_RED = tag("glass/red");
        /**
         * Glass which is made from sand and only minor additional ingredients like dyes
         */
        public static final IOptionalNamedTag<Block> GLASS_SILICA = tag("glass/silica");
        public static final IOptionalNamedTag<Block> GLASS_TINTED = tag("glass/tinted");
        public static final IOptionalNamedTag<Block> GLASS_WHITE = tag("glass/white");
        public static final IOptionalNamedTag<Block> GLASS_YELLOW = tag("glass/yellow");

        public static final IOptionalNamedTag<Block> GLASS_PANES = tag("glass_panes");
        public static final IOptionalNamedTag<Block> GLASS_PANES_BLACK = tag("glass_panes/black");
        public static final IOptionalNamedTag<Block> GLASS_PANES_BLUE = tag("glass_panes/blue");
        public static final IOptionalNamedTag<Block> GLASS_PANES_BROWN = tag("glass_panes/brown");
        public static final IOptionalNamedTag<Block> GLASS_PANES_COLORLESS = tag("glass_panes/colorless");
        public static final IOptionalNamedTag<Block> GLASS_PANES_CYAN = tag("glass_panes/cyan");
        public static final IOptionalNamedTag<Block> GLASS_PANES_GRAY = tag("glass_panes/gray");
        public static final IOptionalNamedTag<Block> GLASS_PANES_GREEN = tag("glass_panes/green");
        public static final IOptionalNamedTag<Block> GLASS_PANES_LIGHT_BLUE = tag("glass_panes/light_blue");
        public static final IOptionalNamedTag<Block> GLASS_PANES_LIGHT_GRAY = tag("glass_panes/light_gray");
        public static final IOptionalNamedTag<Block> GLASS_PANES_LIME = tag("glass_panes/lime");
        public static final IOptionalNamedTag<Block> GLASS_PANES_MAGENTA = tag("glass_panes/magenta");
        public static final IOptionalNamedTag<Block> GLASS_PANES_ORANGE = tag("glass_panes/orange");
        public static final IOptionalNamedTag<Block> GLASS_PANES_PINK = tag("glass_panes/pink");
        public static final IOptionalNamedTag<Block> GLASS_PANES_PURPLE = tag("glass_panes/purple");
        public static final IOptionalNamedTag<Block> GLASS_PANES_RED = tag("glass_panes/red");
        public static final IOptionalNamedTag<Block> GLASS_PANES_WHITE = tag("glass_panes/white");
        public static final IOptionalNamedTag<Block> GLASS_PANES_YELLOW = tag("glass_panes/yellow");

        public static final IOptionalNamedTag<Block> GRAVEL = tag("gravel");
        public static final IOptionalNamedTag<Block> NETHERRACK = tag("netherrack");
        public static final IOptionalNamedTag<Block> OBSIDIAN = tag("obsidian");
        /**
         * Blocks which are often replaced by deepslate ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_DEEPSLATE}, during world generation
         */
        public static final IOptionalNamedTag<Block> ORE_BEARING_GROUND_DEEPSLATE = tag("ore_bearing_ground/deepslate");
        /**
         * Blocks which are often replaced by netherrack ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_NETHERRACK}, during world generation
         */
        public static final IOptionalNamedTag<Block> ORE_BEARING_GROUND_NETHERRACK = tag("ore_bearing_ground/netherrack");
        /**
         * Blocks which are often replaced by stone ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_STONE}, during world generation
         */
        public static final IOptionalNamedTag<Block> ORE_BEARING_GROUND_STONE = tag("ore_bearing_ground/stone");
        /**
         * Ores which on average result in more than one resource worth of materials
         */
        public static final IOptionalNamedTag<Block> ORE_RATES_DENSE = tag("ore_rates/dense");
        /**
         * Ores which on average result in one resource worth of materials
         */
        public static final IOptionalNamedTag<Block> ORE_RATES_SINGULAR = tag("ore_rates/singular");
        /**
         * Ores which on average result in less than one resource worth of materials
         */
        public static final IOptionalNamedTag<Block> ORE_RATES_SPARSE = tag("ore_rates/sparse");
        public static final IOptionalNamedTag<Block> ORES = tag("ores");
        public static final IOptionalNamedTag<Block> ORES_COAL = tag("ores/coal");
        public static final IOptionalNamedTag<Block> ORES_COPPER = tag("ores/copper");
        public static final IOptionalNamedTag<Block> ORES_DIAMOND = tag("ores/diamond");
        public static final IOptionalNamedTag<Block> ORES_EMERALD = tag("ores/emerald");
        public static final IOptionalNamedTag<Block> ORES_GOLD = tag("ores/gold");
        public static final IOptionalNamedTag<Block> ORES_IRON = tag("ores/iron");
        public static final IOptionalNamedTag<Block> ORES_LAPIS = tag("ores/lapis");
        public static final IOptionalNamedTag<Block> ORES_NETHERITE_SCRAP = tag("ores/netherite_scrap");
        public static final IOptionalNamedTag<Block> ORES_QUARTZ = tag("ores/quartz");
        public static final IOptionalNamedTag<Block> ORES_REDSTONE = tag("ores/redstone");
        /**
         * Ores in deepslate (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_DEEPSLATE}) which could logically use deepslate as recipe input or output
         */
        public static final IOptionalNamedTag<Block> ORES_IN_GROUND_DEEPSLATE = tag("ores_in_ground/deepslate");
        /**
         * Ores in netherrack (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_NETHERRACK}) which could logically use netherrack as recipe input or output
         */
        public static final IOptionalNamedTag<Block> ORES_IN_GROUND_NETHERRACK = tag("ores_in_ground/netherrack");
        /**
         * Ores in stone (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_STONE}) which could logically use stone as recipe input or output
         */
        public static final IOptionalNamedTag<Block> ORES_IN_GROUND_STONE = tag("ores_in_ground/stone");

        public static final IOptionalNamedTag<Block> SAND = tag("sand");
        public static final IOptionalNamedTag<Block> SAND_COLORLESS = tag("sand/colorless");
        public static final IOptionalNamedTag<Block> SAND_RED = tag("sand/red");

        public static final IOptionalNamedTag<Block> SANDSTONE = tag("sandstone");
        public static final IOptionalNamedTag<Block> STAINED_GLASS = tag("stained_glass");
        public static final IOptionalNamedTag<Block> STAINED_GLASS_PANES = tag("stained_glass_panes");
        public static final IOptionalNamedTag<Block> STONE = tag("stone");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS = tag("storage_blocks");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_AMETHYST = tag("storage_blocks/amethyst");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_COAL = tag("storage_blocks/coal");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_DIAMOND = tag("storage_blocks/diamond");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_EMERALD = tag("storage_blocks/emerald");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_GOLD = tag("storage_blocks/gold");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_IRON = tag("storage_blocks/iron");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_LAPIS = tag("storage_blocks/lapis");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_NETHERITE = tag("storage_blocks/netherite");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_QUARTZ = tag("storage_blocks/quartz");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_RAW_COPPER = tag("storage_blocks/raw_copper");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_RAW_GOLD = tag("storage_blocks/raw_gold");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_RAW_IRON = tag("storage_blocks/raw_iron");
        public static final IOptionalNamedTag<Block> STORAGE_BLOCKS_REDSTONE = tag("storage_blocks/redstone");

        public static final IOptionalNamedTag<Block> NEEDS_WOOD_TOOL = tag("needs_wood_tool");
        public static final IOptionalNamedTag<Block> NEEDS_GOLD_TOOL = tag("needs_gold_tool");
        public static final IOptionalNamedTag<Block> NEEDS_NETHERITE_TOOL = tag("needs_netherite_tool");

        private static IOptionalNamedTag<Block> tag(String name)
        {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items
    {
        private static void init(){}

        public static final IOptionalNamedTag<Item> BARRELS = tag("barrels");
        public static final IOptionalNamedTag<Item> BARRELS_WOODEN = tag("barrels/wooden");
        public static final IOptionalNamedTag<Item> BONES = tag("bones");
        public static final IOptionalNamedTag<Item> BOOKSHELVES = tag("bookshelves");
        public static final IOptionalNamedTag<Item> CHESTS = tag("chests");
        public static final IOptionalNamedTag<Item> CHESTS_ENDER = tag("chests/ender");
        public static final IOptionalNamedTag<Item> CHESTS_TRAPPED = tag("chests/trapped");
        public static final IOptionalNamedTag<Item> CHESTS_WOODEN = tag("chests/wooden");
        public static final IOptionalNamedTag<Item> COBBLESTONE = tag("cobblestone");
        public static final IOptionalNamedTag<Item> COBBLESTONE_NORMAL = tag("cobblestone/normal");
        public static final IOptionalNamedTag<Item> COBBLESTONE_INFESTED = tag("cobblestone/infested");
        public static final IOptionalNamedTag<Item> COBBLESTONE_MOSSY = tag("cobblestone/mossy");
        public static final IOptionalNamedTag<Item> COBBLESTONE_DEEPSLATE = tag("cobblestone/deepslate");
        public static final IOptionalNamedTag<Item> CROPS = tag("crops");
        public static final IOptionalNamedTag<Item> CROPS_BEETROOT = tag("crops/beetroot");
        public static final IOptionalNamedTag<Item> CROPS_CARROT = tag("crops/carrot");
        public static final IOptionalNamedTag<Item> CROPS_NETHER_WART = tag("crops/nether_wart");
        public static final IOptionalNamedTag<Item> CROPS_POTATO = tag("crops/potato");
        public static final IOptionalNamedTag<Item> CROPS_WHEAT = tag("crops/wheat");
        public static final IOptionalNamedTag<Item> DUSTS = tag("dusts");
        public static final IOptionalNamedTag<Item> DUSTS_PRISMARINE = tag("dusts/prismarine");
        public static final IOptionalNamedTag<Item> DUSTS_REDSTONE = tag("dusts/redstone");
        public static final IOptionalNamedTag<Item> DUSTS_GLOWSTONE = tag("dusts/glowstone");

        public static final IOptionalNamedTag<Item> DYES = tag("dyes");
        public static final IOptionalNamedTag<Item> DYES_BLACK = DyeColor.BLACK.getTag();
        public static final IOptionalNamedTag<Item> DYES_RED = DyeColor.RED.getTag();
        public static final IOptionalNamedTag<Item> DYES_GREEN = DyeColor.GREEN.getTag();
        public static final IOptionalNamedTag<Item> DYES_BROWN = DyeColor.BROWN.getTag();
        public static final IOptionalNamedTag<Item> DYES_BLUE = DyeColor.BLUE.getTag();
        public static final IOptionalNamedTag<Item> DYES_PURPLE = DyeColor.PURPLE.getTag();
        public static final IOptionalNamedTag<Item> DYES_CYAN = DyeColor.CYAN.getTag();
        public static final IOptionalNamedTag<Item> DYES_LIGHT_GRAY = DyeColor.LIGHT_GRAY.getTag();
        public static final IOptionalNamedTag<Item> DYES_GRAY = DyeColor.GRAY.getTag();
        public static final IOptionalNamedTag<Item> DYES_PINK = DyeColor.PINK.getTag();
        public static final IOptionalNamedTag<Item> DYES_LIME = DyeColor.LIME.getTag();
        public static final IOptionalNamedTag<Item> DYES_YELLOW = DyeColor.YELLOW.getTag();
        public static final IOptionalNamedTag<Item> DYES_LIGHT_BLUE = DyeColor.LIGHT_BLUE.getTag();
        public static final IOptionalNamedTag<Item> DYES_MAGENTA = DyeColor.MAGENTA.getTag();
        public static final IOptionalNamedTag<Item> DYES_ORANGE = DyeColor.ORANGE.getTag();
        public static final IOptionalNamedTag<Item> DYES_WHITE = DyeColor.WHITE.getTag();

        public static final IOptionalNamedTag<Item> EGGS = tag("eggs");
        public static final IOptionalNamedTag<Item> ENCHANTING_FUELS = tag("enchanting_fuels", Set.of(() -> net.minecraft.world.item.Items.LAPIS_LAZULI));
        public static final IOptionalNamedTag<Item> END_STONES = tag("end_stones");
        public static final IOptionalNamedTag<Item> ENDER_PEARLS = tag("ender_pearls");
        public static final IOptionalNamedTag<Item> FEATHERS = tag("feathers");
        public static final IOptionalNamedTag<Item> FENCE_GATES = tag("fence_gates");
        public static final IOptionalNamedTag<Item> FENCE_GATES_WOODEN = tag("fence_gates/wooden");
        public static final IOptionalNamedTag<Item> FENCES = tag("fences");
        public static final IOptionalNamedTag<Item> FENCES_NETHER_BRICK = tag("fences/nether_brick");
        public static final IOptionalNamedTag<Item> FENCES_WOODEN = tag("fences/wooden");
        public static final IOptionalNamedTag<Item> GEMS = tag("gems");
        public static final IOptionalNamedTag<Item> GEMS_DIAMOND = tag("gems/diamond");
        public static final IOptionalNamedTag<Item> GEMS_EMERALD = tag("gems/emerald");
        public static final IOptionalNamedTag<Item> GEMS_AMETHYST = tag("gems/amethyst");
        public static final IOptionalNamedTag<Item> GEMS_LAPIS = tag("gems/lapis");
        public static final IOptionalNamedTag<Item> GEMS_PRISMARINE = tag("gems/prismarine");
        public static final IOptionalNamedTag<Item> GEMS_QUARTZ = tag("gems/quartz");

        public static final IOptionalNamedTag<Item> GLASS = tag("glass");
        public static final IOptionalNamedTag<Item> GLASS_BLACK = tag("glass/black");
        public static final IOptionalNamedTag<Item> GLASS_BLUE = tag("glass/blue");
        public static final IOptionalNamedTag<Item> GLASS_BROWN = tag("glass/brown");
        public static final IOptionalNamedTag<Item> GLASS_COLORLESS = tag("glass/colorless");
        public static final IOptionalNamedTag<Item> GLASS_CYAN = tag("glass/cyan");
        public static final IOptionalNamedTag<Item> GLASS_GRAY = tag("glass/gray");
        public static final IOptionalNamedTag<Item> GLASS_GREEN = tag("glass/green");
        public static final IOptionalNamedTag<Item> GLASS_LIGHT_BLUE = tag("glass/light_blue");
        public static final IOptionalNamedTag<Item> GLASS_LIGHT_GRAY = tag("glass/light_gray");
        public static final IOptionalNamedTag<Item> GLASS_LIME = tag("glass/lime");
        public static final IOptionalNamedTag<Item> GLASS_MAGENTA = tag("glass/magenta");
        public static final IOptionalNamedTag<Item> GLASS_ORANGE = tag("glass/orange");
        public static final IOptionalNamedTag<Item> GLASS_PINK = tag("glass/pink");
        public static final IOptionalNamedTag<Item> GLASS_PURPLE = tag("glass/purple");
        public static final IOptionalNamedTag<Item> GLASS_RED = tag("glass/red");
        /**
         * Glass which is made from sand and only minor additional ingredients like dyes
         */
        public static final IOptionalNamedTag<Item> GLASS_SILICA = tag("glass/silica");
        public static final IOptionalNamedTag<Item> GLASS_TINTED = tag("glass/tinted");
        public static final IOptionalNamedTag<Item> GLASS_WHITE = tag("glass/white");
        public static final IOptionalNamedTag<Item> GLASS_YELLOW = tag("glass/yellow");

        public static final IOptionalNamedTag<Item> GLASS_PANES = tag("glass_panes");
        public static final IOptionalNamedTag<Item> GLASS_PANES_BLACK = tag("glass_panes/black");
        public static final IOptionalNamedTag<Item> GLASS_PANES_BLUE = tag("glass_panes/blue");
        public static final IOptionalNamedTag<Item> GLASS_PANES_BROWN = tag("glass_panes/brown");
        public static final IOptionalNamedTag<Item> GLASS_PANES_COLORLESS = tag("glass_panes/colorless");
        public static final IOptionalNamedTag<Item> GLASS_PANES_CYAN = tag("glass_panes/cyan");
        public static final IOptionalNamedTag<Item> GLASS_PANES_GRAY = tag("glass_panes/gray");
        public static final IOptionalNamedTag<Item> GLASS_PANES_GREEN = tag("glass_panes/green");
        public static final IOptionalNamedTag<Item> GLASS_PANES_LIGHT_BLUE = tag("glass_panes/light_blue");
        public static final IOptionalNamedTag<Item> GLASS_PANES_LIGHT_GRAY = tag("glass_panes/light_gray");
        public static final IOptionalNamedTag<Item> GLASS_PANES_LIME = tag("glass_panes/lime");
        public static final IOptionalNamedTag<Item> GLASS_PANES_MAGENTA = tag("glass_panes/magenta");
        public static final IOptionalNamedTag<Item> GLASS_PANES_ORANGE = tag("glass_panes/orange");
        public static final IOptionalNamedTag<Item> GLASS_PANES_PINK = tag("glass_panes/pink");
        public static final IOptionalNamedTag<Item> GLASS_PANES_PURPLE = tag("glass_panes/purple");
        public static final IOptionalNamedTag<Item> GLASS_PANES_RED = tag("glass_panes/red");
        public static final IOptionalNamedTag<Item> GLASS_PANES_WHITE = tag("glass_panes/white");
        public static final IOptionalNamedTag<Item> GLASS_PANES_YELLOW = tag("glass_panes/yellow");

        public static final IOptionalNamedTag<Item> GRAVEL = tag("gravel");
        public static final IOptionalNamedTag<Item> GUNPOWDER = tag("gunpowder");
        public static final IOptionalNamedTag<Item> HEADS = tag("heads");
        public static final IOptionalNamedTag<Item> INGOTS = tag("ingots");
        public static final IOptionalNamedTag<Item> INGOTS_BRICK = tag("ingots/brick");
        public static final IOptionalNamedTag<Item> INGOTS_COPPER = tag("ingots/copper");
        public static final IOptionalNamedTag<Item> INGOTS_GOLD = tag("ingots/gold");
        public static final IOptionalNamedTag<Item> INGOTS_IRON = tag("ingots/iron");
        public static final IOptionalNamedTag<Item> INGOTS_NETHERITE = tag("ingots/netherite");
        public static final IOptionalNamedTag<Item> INGOTS_NETHER_BRICK = tag("ingots/nether_brick");
        public static final IOptionalNamedTag<Item> LEATHER = tag("leather");
        public static final IOptionalNamedTag<Item> MUSHROOMS = tag("mushrooms");
        public static final IOptionalNamedTag<Item> NETHER_STARS = tag("nether_stars");
        public static final IOptionalNamedTag<Item> NETHERRACK = tag("netherrack");
        public static final IOptionalNamedTag<Item> NUGGETS = tag("nuggets");
        public static final IOptionalNamedTag<Item> NUGGETS_GOLD = tag("nuggets/gold");
        public static final IOptionalNamedTag<Item> NUGGETS_IRON = tag("nuggets/iron");
        public static final IOptionalNamedTag<Item> OBSIDIAN = tag("obsidian");
        /**
         * Blocks which are often replaced by deepslate ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_DEEPSLATE}, during world generation
         */
        public static final IOptionalNamedTag<Item> ORE_BEARING_GROUND_DEEPSLATE = tag("ore_bearing_ground/deepslate");
        /**
         * Blocks which are often replaced by netherrack ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_NETHERRACK}, during world generation
         */
        public static final IOptionalNamedTag<Item> ORE_BEARING_GROUND_NETHERRACK = tag("ore_bearing_ground/netherrack");
        /**
         * Blocks which are often replaced by stone ores, i.e. the ores in the tag {@link #ORES_IN_GROUND_STONE}, during world generation
         */
        public static final IOptionalNamedTag<Item> ORE_BEARING_GROUND_STONE = tag("ore_bearing_ground/stone");
        /**
         * Ores which on average result in more than one resource worth of materials
         */
        public static final IOptionalNamedTag<Item> ORE_RATES_DENSE = tag("ore_rates/dense");
        /**
         * Ores which on average result in one resource worth of materials
         */
        public static final IOptionalNamedTag<Item> ORE_RATES_SINGULAR = tag("ore_rates/singular");
        /**
         * Ores which on average result in less than one resource worth of materials
         */
        public static final IOptionalNamedTag<Item> ORE_RATES_SPARSE = tag("ore_rates/sparse");
        public static final IOptionalNamedTag<Item> ORES = tag("ores");
        public static final IOptionalNamedTag<Item> ORES_COAL = tag("ores/coal");
        public static final IOptionalNamedTag<Item> ORES_COPPER = tag("ores/copper");
        public static final IOptionalNamedTag<Item> ORES_DIAMOND = tag("ores/diamond");
        public static final IOptionalNamedTag<Item> ORES_EMERALD = tag("ores/emerald");
        public static final IOptionalNamedTag<Item> ORES_GOLD = tag("ores/gold");
        public static final IOptionalNamedTag<Item> ORES_IRON = tag("ores/iron");
        public static final IOptionalNamedTag<Item> ORES_LAPIS = tag("ores/lapis");
        public static final IOptionalNamedTag<Item> ORES_NETHERITE_SCRAP = tag("ores/netherite_scrap");
        public static final IOptionalNamedTag<Item> ORES_QUARTZ = tag("ores/quartz");
        public static final IOptionalNamedTag<Item> ORES_REDSTONE = tag("ores/redstone");
        /**
         * Ores in deepslate (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_DEEPSLATE}) which could logically use deepslate as recipe input or output
         */
        public static final IOptionalNamedTag<Item> ORES_IN_GROUND_DEEPSLATE = tag("ores_in_ground/deepslate");
        /**
         * Ores in netherrack (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_NETHERRACK}) which could logically use netherrack as recipe input or output
         */
        public static final IOptionalNamedTag<Item> ORES_IN_GROUND_NETHERRACK = tag("ores_in_ground/netherrack");
        /**
         * Ores in stone (or in equivalent blocks in the tag {@link #ORE_BEARING_GROUND_STONE}) which could logically use stone as recipe input or output
         */
        public static final IOptionalNamedTag<Item> ORES_IN_GROUND_STONE = tag("ores_in_ground/stone");
        public static final IOptionalNamedTag<Item> RAW_MATERIALS = tag("raw_materials");
        public static final IOptionalNamedTag<Item> RAW_MATERIALS_COPPER = tag("raw_materials/copper");
        public static final IOptionalNamedTag<Item> RAW_MATERIALS_GOLD = tag("raw_materials/gold");
        public static final IOptionalNamedTag<Item> RAW_MATERIALS_IRON = tag("raw_materials/iron");
        public static final IOptionalNamedTag<Item> RODS = tag("rods");
        public static final IOptionalNamedTag<Item> RODS_BLAZE = tag("rods/blaze");
        public static final IOptionalNamedTag<Item> RODS_WOODEN = tag("rods/wooden");

        public static final IOptionalNamedTag<Item> SAND = tag("sand");
        public static final IOptionalNamedTag<Item> SAND_COLORLESS = tag("sand/colorless");
        public static final IOptionalNamedTag<Item> SAND_RED = tag("sand/red");

        public static final IOptionalNamedTag<Item> SANDSTONE = tag("sandstone");
        public static final IOptionalNamedTag<Item> SEEDS = tag("seeds");
        public static final IOptionalNamedTag<Item> SEEDS_BEETROOT = tag("seeds/beetroot");
        public static final IOptionalNamedTag<Item> SEEDS_MELON = tag("seeds/melon");
        public static final IOptionalNamedTag<Item> SEEDS_PUMPKIN = tag("seeds/pumpkin");
        public static final IOptionalNamedTag<Item> SEEDS_WHEAT = tag("seeds/wheat");
        public static final IOptionalNamedTag<Item> SHEARS = tag("shears");
        public static final IOptionalNamedTag<Item> SLIMEBALLS = tag("slimeballs");
        public static final IOptionalNamedTag<Item> STAINED_GLASS = tag("stained_glass");
        public static final IOptionalNamedTag<Item> STAINED_GLASS_PANES = tag("stained_glass_panes");
        public static final IOptionalNamedTag<Item> STONE = tag("stone");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS = tag("storage_blocks");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_AMETHYST = tag("storage_blocks/amethyst");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_COAL = tag("storage_blocks/coal");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_COPPER = tag("storage_blocks/copper");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_DIAMOND = tag("storage_blocks/diamond");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_EMERALD = tag("storage_blocks/emerald");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_GOLD = tag("storage_blocks/gold");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_IRON = tag("storage_blocks/iron");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_LAPIS = tag("storage_blocks/lapis");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_NETHERITE = tag("storage_blocks/netherite");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_QUARTZ = tag("storage_blocks/quartz");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_RAW_COPPER = tag("storage_blocks/raw_copper");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_RAW_GOLD = tag("storage_blocks/raw_gold");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_RAW_IRON = tag("storage_blocks/raw_iron");
        public static final IOptionalNamedTag<Item> STORAGE_BLOCKS_REDSTONE = tag("storage_blocks/redstone");
        public static final IOptionalNamedTag<Item> STRING = tag("string");

        private static IOptionalNamedTag<Item> tag(String name, @Nullable Set<Supplier<Item>> defaults)
        {
            return ItemTags.createOptional(new ResourceLocation("forge", name), defaults);
        }

        private static IOptionalNamedTag<Item> tag(String name)
        {
            return tag(name, null);
        }
    }

    public static class EntityTypes
    {
        private static void init() {}

        public static final IOptionalNamedTag<EntityType<?>> AMPHIBIANS = tag("amphibians");
        public static final IOptionalNamedTag<EntityType<?>> AQUATIC = tag("aquatic");
        public static final IOptionalNamedTag<EntityType<?>> ARTHROPODS = tag("arthropods");
        public static final IOptionalNamedTag<EntityType<?>> AVIANS = tag("avians");
        public static final IOptionalNamedTag<EntityType<?>> AVIANS_FOWLS = tag("avians/fowls");
        public static final IOptionalNamedTag<EntityType<?>> BOSSES = tag("bosses");
        public static final IOptionalNamedTag<EntityType<?>> CEPHALOPODS = tag("cephalopods");
        public static final IOptionalNamedTag<EntityType<?>> CREEPERS = tag("creepers");
        public static final IOptionalNamedTag<EntityType<?>> DRAGONS = tag("dragons");

        /**
         * Mobs that are logically composed of a base element
         * If your mob is a combination of elements, feel free to add it to all appropriate tags
         */
        public static final IOptionalNamedTag<EntityType<?>> ELEMENTALS = tag("elementals");
        public static final IOptionalNamedTag<EntityType<?>> ELEMENTALS_FIRE = tag("elementals/fire");
        public static final IOptionalNamedTag<EntityType<?>> ELEMENTALS_ICE = tag("elementals/ice");
        /**
         * Mobs that are meant to be antagonistic to the player
         */
        public static final IOptionalNamedTag<EntityType<?>> ENEMIES = tag("enemies");
        /**
         * Mobs that have an associated item with the 'fish' tag
         */
        public static final IOptionalNamedTag<EntityType<?>> FISH = tag("fish");
        public static final IOptionalNamedTag<EntityType<?>> FLYING = tag("flying");
        public static final IOptionalNamedTag<EntityType<?>> LAND = tag("land");

        public static final IOptionalNamedTag<EntityType<?>> MAMMALS = tag("mammals");
        public static final IOptionalNamedTag<EntityType<?>> MAMMALS_BOVINES = tag("mammals/bovines");
        public static final IOptionalNamedTag<EntityType<?>> MAMMALS_CAMELIDS = tag("mammals/camelids");
        public static final IOptionalNamedTag<EntityType<?>> MAMMALS_CANIDS = tag("mammals/canids");
        public static final IOptionalNamedTag<EntityType<?>> MAMMALS_CAPRINES = tag("mammals/caprines");
        public static final IOptionalNamedTag<EntityType<?>> MAMMALS_EQUINES = tag("mammals/equines");
        public static final IOptionalNamedTag<EntityType<?>> MAMMALS_FELIDS = tag("mammals/felids");
        public static final IOptionalNamedTag<EntityType<?>> MAMMALS_SWINES = tag("mammals/swines");
        public static final IOptionalNamedTag<EntityType<?>> MAMMALS_URSIDS = tag("mammals/ursids");

        /**
         * Mobs that simulate an intelligent, independent relationship of some sort with the player
         */
        public static final IOptionalNamedTag<EntityType<?>> NPC = tag("npc");
        public static final IOptionalNamedTag<EntityType<?>> REPTILES = tag("reptiles");
        public static final IOptionalNamedTag<EntityType<?>> UNDEAD = tag("undead");
        public static final IOptionalNamedTag<EntityType<?>> UNDEAD_SKELETONS = tag("undead/skeletons");
        public static final IOptionalNamedTag<EntityType<?>> UNDEAD_ZOMBIES = tag("undead/zombies");
        /**
         * Mobs that prefer to live in lava
         */
        public static final IOptionalNamedTag<EntityType<?>> VOLCANIC = tag("volcanic");

        private static IOptionalNamedTag<EntityType<?>> tag(String name)
        {
            return EntityTypeTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Fluids
    {
        private static void init() {}

        public static final IOptionalNamedTag<Fluid> MILK = tag("milk");

        private static IOptionalNamedTag<Fluid> tag(String name)
        {
            return FluidTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public interface IOptionalNamedTag<T> extends Named<T>
    {
        /**
         * Returns true if the current state is defaulted. This means we have connected to a server that does not contain this tag.
         * The values referenced in this tag may be empty, or some values specified by the original tag creator.
         */
        boolean isDefaulted();
    }
}
