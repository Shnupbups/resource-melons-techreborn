package com.shnupbups.resourcemelonstechreborn;

import com.shnupbups.resourcemelons.core.MelonType;
import com.shnupbups.resourcemelons.core.MelonTypeBuilder;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import techreborn.init.TRContent;

public enum TRMelonTypes implements MelonTypeBuilder {
	PERIDOT("peridot", TRContent.Gems.PERIDOT.asItem(), TRContent.StorageBlocks.PERIDOT.getBlock(), 0xACD570, getCatalystTag("peridot"), MiningLevels.DIAMOND, RMTRCommon.getCommonItemTag("peridots"), RMTRCommon.getCommonItemTag("peridot_blocks"), RMTRCommon.getCommonBlockTag("peridot_blocks")),
	RED_GARNET("red_garnet", TRContent.Gems.RED_GARNET.asItem(), TRContent.StorageBlocks.RED_GARNET.getBlock(), 0xE96D68, getCatalystTag("red_garnet"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("red_garnets"), RMTRCommon.getCommonItemTag("red_garnet_blocks"), RMTRCommon.getCommonBlockTag("red_garnet_blocks")),
	RUBY("ruby", TRContent.Gems.RUBY.asItem(), TRContent.StorageBlocks.RUBY.getBlock(), 0xD98796, getCatalystTag("ruby"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("rubies"), RMTRCommon.getCommonItemTag("ruby_blocks"), RMTRCommon.getCommonBlockTag("ruby_blocks")),
	SAPPHIRE("sapphire", TRContent.Gems.SAPPHIRE.asItem(), TRContent.StorageBlocks.SAPPHIRE.getBlock(), 0xAACBFF, getCatalystTag("sapphire"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("sapphires"), RMTRCommon.getCommonItemTag("sapphire_blocks"), RMTRCommon.getCommonBlockTag("sapphire_blocks")),
	YELLOW_GARNET("yellow_garnet", TRContent.Gems.YELLOW_GARNET.asItem(), TRContent.StorageBlocks.YELLOW_GARNET.getBlock(), 0xFBE98B, getCatalystTag("yellow_garnet"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("yellow_garnets"), RMTRCommon.getCommonItemTag("yellow_garnet_blocks"), RMTRCommon.getCommonBlockTag("yellow_garnet_blocks")),
	ALUMINUM("aluminum", TRContent.Ingots.ALUMINUM.asItem(), TRContent.StorageBlocks.ALUMINUM.getBlock(), 0xDCDFDF, getCatalystTag("aluminum"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("aluminum_ingots"), RMTRCommon.getCommonItemTag("aluminum_blocks"), RMTRCommon.getCommonBlockTag("aluminum_blocks")),
	IRIDIUM("iridium", TRContent.Ingots.IRIDIUM.asItem(), TRContent.StorageBlocks.IRIDIUM.getBlock(), 0x91A09C, getCatalystTag("iridium"), MiningLevels.DIAMOND, RMTRCommon.getCommonItemTag("iridium_ingots"), RMTRCommon.getCommonItemTag("iridium_blocks"), RMTRCommon.getCommonBlockTag("iridium_blocks")),
	LEAD("lead", TRContent.Ingots.LEAD.asItem(), TRContent.StorageBlocks.LEAD.getBlock(), 0x635F6B, getCatalystTag("lead"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("lead_ingots"), RMTRCommon.getCommonItemTag("lead_blocks"), RMTRCommon.getCommonBlockTag("lead_blocks")),
	NICKEL("nickel", TRContent.Ingots.NICKEL.asItem(), TRContent.StorageBlocks.NICKEL.getBlock(), 0xB0AE8E, getCatalystTag("nickel"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("nickel_ingots"), RMTRCommon.getCommonItemTag("nickel_blocks"), RMTRCommon.getCommonBlockTag("nickel_blocks")),
	PLATINUM("platinum", TRContent.Ingots.PLATINUM.asItem(), TRContent.StorageBlocks.PLATINUM.getBlock(), 0xACBDC9, getCatalystTag("platinum"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("platinum_ingots"), RMTRCommon.getCommonItemTag("platinum_blocks"), RMTRCommon.getCommonBlockTag("platinum_blocks")),
	SILVER("silver", TRContent.Ingots.SILVER.asItem(), TRContent.StorageBlocks.SILVER.getBlock(), 0xD7E4E5, getCatalystTag("silver"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("silver_ingots"), RMTRCommon.getCommonItemTag("silver_blocks"), RMTRCommon.getCommonBlockTag("silver_blocks")),
	TIN("tin", TRContent.Ingots.TIN.asItem(), TRContent.StorageBlocks.TIN.getBlock(), 0xDCDCD7, getCatalystTag("tin"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("tin_ingots"), RMTRCommon.getCommonItemTag("tin_blocks"), RMTRCommon.getCommonBlockTag("tin_blocks")),
	TITANIUM("titanium", TRContent.Ingots.TITANIUM.asItem(), TRContent.StorageBlocks.TITANIUM.getBlock(), 0xC1C2CF, getCatalystTag("titanium"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("titanium_ingots"), RMTRCommon.getCommonItemTag("titanium_blocks"), RMTRCommon.getCommonBlockTag("titanium_blocks")),
	TUNGSTEN("tungsten", TRContent.Ingots.TUNGSTEN.asItem(), TRContent.StorageBlocks.TUNGSTEN.getBlock(), 0x5F6569, getCatalystTag("tungsten"), MiningLevels.DIAMOND, RMTRCommon.getCommonItemTag("tungsten_ingots"), RMTRCommon.getCommonItemTag("tungsten_blocks"), RMTRCommon.getCommonBlockTag("tungsten_blocks")),
	ZINC("zinc", TRContent.Ingots.ZINC.asItem(), TRContent.StorageBlocks.ZINC.getBlock(), 0xD3D6D0, getCatalystTag("zinc"), MiningLevels.IRON, RMTRCommon.getCommonItemTag("zinc_ingots"), RMTRCommon.getCommonItemTag("zinc_blocks"), RMTRCommon.getCommonBlockTag("zinc_blocks")),
	;

	final Info info;
	MelonType type;
	final TagKey<Item> resourceCommonTag;
	final TagKey<Item> resourceBlockCommonItemTag;
	final TagKey<Block> resourceBlockCommonBlockTag;

	TRMelonTypes(String id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(RMTRCommon.id(id), resource, resourceBlock, colour, catalyst, 0, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(String id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, float chanceMultiplier, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(RMTRCommon.id(id), resource, resourceBlock, colour, catalyst, chanceMultiplier, chanceMultiplier, 0, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(String id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, float resourceChanceMultiplier, float seedsChanceMultiplier, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(RMTRCommon.id(id), resource, resourceBlock, colour, catalyst, resourceChanceMultiplier, seedsChanceMultiplier, 0, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(Identifier id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(id, resource, resourceBlock, colour, catalyst, 1.0f, 0, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(Identifier id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, float chanceMultiplier, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(id, resource, resourceBlock, colour, catalyst, chanceMultiplier, chanceMultiplier, 0, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(String id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, int miningLevel, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(RMTRCommon.id(id), resource, resourceBlock, colour, catalyst, miningLevel, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(String id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, float chanceMultiplier, int miningLevel, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(RMTRCommon.id(id), resource, resourceBlock, colour, catalyst, chanceMultiplier, chanceMultiplier, miningLevel, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(String id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, float resourceChanceMultiplier, float seedsChanceMultiplier, int miningLevel, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(RMTRCommon.id(id), resource, resourceBlock, colour, catalyst, resourceChanceMultiplier, seedsChanceMultiplier, miningLevel, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(Identifier id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, int miningLevel, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(id, resource, resourceBlock, colour, catalyst, 1.0f, miningLevel, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(Identifier id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, float chanceMultiplier, int miningLevel, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this(id, resource, resourceBlock, colour, catalyst, chanceMultiplier, chanceMultiplier, miningLevel, resourceCommonTag, resourceBlockCommonItemTag, resourceBlockCommonBlockTag);
	}

	TRMelonTypes(Identifier id, Item resource, Block resourceBlock, int colour, TagKey<Block> catalyst, float resourceChanceMultiplier, float seedsChanceMultiplier, int miningLevel, TagKey<Item> resourceCommonTag, TagKey<Item> resourceBlockCommonItemTag, TagKey<Block> resourceBlockCommonBlockTag) {
		this.info = new Info(id, resource, resourceBlock, catalyst, colour, resourceChanceMultiplier, seedsChanceMultiplier, miningLevel);
		this.resourceCommonTag = resourceCommonTag;
		this.resourceBlockCommonItemTag = resourceBlockCommonItemTag;
		this.resourceBlockCommonBlockTag = resourceBlockCommonBlockTag;
	}

	public TagKey<Item> getResourceCommonTag() {
		return resourceCommonTag;
	}

	public TagKey<Item> getResourceBlockCommonItemTag() {
		return resourceBlockCommonItemTag;
	}

	public TagKey<Block> getResourceBlockCommonBlockTag() {
		return resourceBlockCommonBlockTag;
	}

	@Override
	public Info getInfo() {
		return info;
	}

	@Override
	public MelonType getTypeRaw() {
		return type;
	}

	@Override
	public void setType(MelonType type) {
		this.type = type;
	}
	
	public static TagKey<Block> getCatalystTag(String name) {
		return TagKey.of(Registry.BLOCK_KEY, RMTRCommon.id(name+"_melon_catalysts"));
	}
}
