package com.shnupbups.resourcemelonstechreborn;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.fabricmc.api.ModInitializer;

import com.shnupbups.resourcemelons.RMCommon;
import com.shnupbups.resourcemelons.core.MelonType;

public class RMTRCommon implements ModInitializer {
	public static final String MOD_ID = "resourcemelonstechreborn";

	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}

	@Override
	public void onInitialize() {

	}

	public static TagKey<Item> getCommonItemTag(String path) {
		return TagKey.of(Registry.ITEM_KEY, new Identifier("c", path));
	}

	public static TagKey<Block> getCommonBlockTag(String path) {
		return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", path));
	}
}
