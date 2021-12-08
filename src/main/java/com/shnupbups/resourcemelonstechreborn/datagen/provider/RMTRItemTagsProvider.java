package com.shnupbups.resourcemelonstechreborn.datagen.provider;

import net.minecraft.item.Item;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import com.shnupbups.resourcemelons.RMCommon;
import com.shnupbups.resourcemelons.core.MelonType;
import com.shnupbups.resourcemelons.misc.RMTags;
import com.shnupbups.resourcemelonstechreborn.TRMelonTypes;

public class RMTRItemTagsProvider extends FabricTagProvider.ItemTagProvider {
	public RMTRItemTagsProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateTags() {
		RMCommon.LOGGER.info("Generating item tags...");

		FabricTagBuilder<Item> resourceMelons = getOrCreateTagBuilder(RMTags.ItemTags.RESOURCE_MELONS);
		FabricTagBuilder<Item> resourceMelonSeeds = getOrCreateTagBuilder(RMTags.ItemTags.RESOURCE_MELON_SEEDS);
		FabricTagBuilder<Item> resourceMelonSlices = getOrCreateTagBuilder(RMTags.ItemTags.RESOURCE_MELON_SLICES);

		for (TRMelonTypes melonBuilder : TRMelonTypes.values()) {
			MelonType melonType = melonBuilder.getType();

			RMCommon.LOGGER.info("Generating for " + melonType.id());

			resourceMelons.add(melonType.melon().asItem());
			resourceMelonSeeds.add(melonType.seeds());
			resourceMelonSlices.add(melonType.slice());
		}

		RMCommon.LOGGER.info("Finished generating item tags!");
	}
}
