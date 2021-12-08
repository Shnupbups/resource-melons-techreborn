package com.shnupbups.resourcemelonstechreborn;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;

import net.fabricmc.fabric.api.tag.TagFactory;

import com.shnupbups.resourcemelons.RMCommon;

public class RMTRTags {
	public static class BlockTags {
		public static final Tag.Identified<Block> PERIDOT_MELON_CATALYSTS = create("peridot_melon_catalysts");
		public static final Tag.Identified<Block> RED_GARNET_MELON_CATALYSTS = create("red_garnet_melon_catalysts");
		public static final Tag.Identified<Block> RUBY_MELON_CATALYSTS = create("ruby_melon_catalysts");
		public static final Tag.Identified<Block> SAPPHIRE_MELON_CATALYSTS = create("sapphire_melon_catalysts");
		public static final Tag.Identified<Block> YELLOW_GARNET_MELON_CATALYSTS = create("yellow_garnet_melon_catalysts");
		public static final Tag.Identified<Block> ALUMINUM_MELON_CATALYSTS = create("aluminum_melon_catalysts");
		public static final Tag.Identified<Block> IRIDIUM_MELON_CATALYSTS = create("iridium_melon_catalysts");
		public static final Tag.Identified<Block> LEAD_MELON_CATALYSTS = create("lead_melon_catalysts");
		public static final Tag.Identified<Block> NICKEL_MELON_CATALYSTS = create("nickel_melon_catalysts");
		public static final Tag.Identified<Block> PLATINUM_MELON_CATALYSTS = create("platinum_melon_catalysts");
		public static final Tag.Identified<Block> SILVER_MELON_CATALYSTS = create("silver_melon_catalysts");
		public static final Tag.Identified<Block> TIN_MELON_CATALYSTS = create("tin_melon_catalysts");
		public static final Tag.Identified<Block> TITANIUM_MELON_CATALYSTS = create("titanium_melon_catalysts");
		public static final Tag.Identified<Block> TUNGSTEN_MELON_CATALYSTS = create("tungsten_melon_catalysts");
		public static final Tag.Identified<Block> ZINC_MELON_CATALYSTS = create("zinc_melon_catalysts");

		public static void init() {

		}

		public static Tag.Identified<Block> create(String id) {
			return TagFactory.BLOCK.create(RMTRCommon.id(id));
		}
	}

	public static class ItemTags {
		public static void init() {

		}

		public static Tag.Identified<Item> create(String id) {
			return TagFactory.ITEM.create(RMTRCommon.id(id));
		}
	}
}
