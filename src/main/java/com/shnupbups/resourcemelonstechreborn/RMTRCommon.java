package com.shnupbups.resourcemelonstechreborn;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagFactory;

import com.shnupbups.resourcemelons.RMCommon;
import com.shnupbups.resourcemelons.core.MelonType;

public class RMTRCommon implements ModInitializer {
	public static final String MOD_ID = "resourcemelonstechreborn";

	public static Identifier id(String id) {
		return new Identifier(MOD_ID, id);
	}

	@Override
	public void onInitialize() {
		for (TRMelonTypes melonBuilder : TRMelonTypes.values()) {
			MelonType type = melonBuilder.build();
			type.register();
			RMCommon.MELONS.add(type);
		}
	}

	public static Tag.Identified<Item> getCommonItemTag(String path) {
		return TagFactory.ITEM.create(new Identifier("c", path));
	}

	public static Tag.Identified<Block> getCommonBlockTag(String path) {
		return TagFactory.BLOCK.create(new Identifier("c", path));
	}
}
