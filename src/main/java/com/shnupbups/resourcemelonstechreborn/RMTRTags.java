package com.shnupbups.resourcemelonstechreborn;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;

import com.shnupbups.resourcemelons.RMCommon;

public class RMTRTags {
	public static class BlockTags {
		public static final TagKey<Block> PERIDOT_MELON_CATALYSTS = create("peridot_melon_catalysts");
		public static final TagKey<Block> RED_GARNET_MELON_CATALYSTS = create("red_garnet_melon_catalysts");
		public static final TagKey<Block> RUBY_MELON_CATALYSTS = create("ruby_melon_catalysts");
		public static final TagKey<Block> SAPPHIRE_MELON_CATALYSTS = create("sapphire_melon_catalysts");
		public static final TagKey<Block> YELLOW_GARNET_MELON_CATALYSTS = create("yellow_garnet_melon_catalysts");
		public static final TagKey<Block> ALUMINUM_MELON_CATALYSTS = create("aluminum_melon_catalysts");
		public static final TagKey<Block> IRIDIUM_MELON_CATALYSTS = create("iridium_melon_catalysts");
		public static final TagKey<Block> LEAD_MELON_CATALYSTS = create("lead_melon_catalysts");
		public static final TagKey<Block> NICKEL_MELON_CATALYSTS = create("nickel_melon_catalysts");
		public static final TagKey<Block> PLATINUM_MELON_CATALYSTS = create("platinum_melon_catalysts");
		public static final TagKey<Block> SILVER_MELON_CATALYSTS = create("silver_melon_catalysts");
		public static final TagKey<Block> TIN_MELON_CATALYSTS = create("tin_melon_catalysts");
		public static final TagKey<Block> TITANIUM_MELON_CATALYSTS = create("titanium_melon_catalysts");
		public static final TagKey<Block> TUNGSTEN_MELON_CATALYSTS = create("tungsten_melon_catalysts");
		public static final TagKey<Block> ZINC_MELON_CATALYSTS = create("zinc_melon_catalysts");

		public static void init() {

		}

		public static TagKey<Block> create(String id) {
			return TagKey.of(Registry.BLOCK_KEY, RMTRCommon.id(id));
		}
	}

	public static class ItemTags {
		public static void init() {

		}

		public static TagKey<Item> create(String id) {
			return TagKey.of(Registry.ITEM_KEY, RMTRCommon.id(id));
		}
	}
}
