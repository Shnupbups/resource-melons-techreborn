package com.shnupbups.resourcemelonstechreborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import com.shnupbups.resourcemelons.RMCommon;
import com.shnupbups.resourcemelonstechreborn.datagen.provider.RMTRBlockLootTablesProvider;
import com.shnupbups.resourcemelonstechreborn.datagen.provider.RMTRBlockTagsProvider;
import com.shnupbups.resourcemelonstechreborn.datagen.provider.RMTRItemTagsProvider;
import com.shnupbups.resourcemelonstechreborn.datagen.provider.RMTRModelsProvider;
import com.shnupbups.resourcemelonstechreborn.datagen.provider.RMTRRecipesProvider;

public class RMTRDatagen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator dataGenerator) {
		RMCommon.LOGGER.info("Starting Resource Melons Tech Reborn Datagen...");

		dataGenerator.addProvider(RMTRModelsProvider::new);
		dataGenerator.addProvider(RMTRRecipesProvider::new);
		dataGenerator.addProvider(RMTRBlockTagsProvider::new);
		dataGenerator.addProvider(RMTRItemTagsProvider::new);
		dataGenerator.addProvider(RMTRBlockLootTablesProvider::new);
	}
}
