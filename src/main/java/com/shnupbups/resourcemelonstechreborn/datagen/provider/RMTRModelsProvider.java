package com.shnupbups.resourcemelonstechreborn.datagen.provider;

import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockStateDefinitionProvider;

import com.shnupbups.resourcemelons.RMCommon;
import com.shnupbups.resourcemelons.core.MelonType;
import com.shnupbups.resourcemelons.datagen.provider.RMModelsProvider;
import com.shnupbups.resourcemelonstechreborn.TRMelonTypes;

public class RMTRModelsProvider extends FabricBlockStateDefinitionProvider {
	public RMTRModelsProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		RMCommon.LOGGER.info("Generating block state models...");

		for (TRMelonTypes melonBuilder : TRMelonTypes.values()) {
			MelonType melonType = melonBuilder.getType();

			RMCommon.LOGGER.info("Generating for " + melonType.id());

			RMModelsProvider.registerResourceMelonBlockStateModels(blockStateModelGenerator, melonType);
		}

		RMCommon.LOGGER.info("Finished generating block state models!");
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		RMCommon.LOGGER.info("Generating item models...");
		for (TRMelonTypes melonBuilder : TRMelonTypes.values()) {
			MelonType melonType = melonBuilder.getType();

			RMCommon.LOGGER.info("Generating for " + melonType.id());

			itemModelGenerator.register(melonType.slice(), Models.GENERATED);
		}
		RMCommon.LOGGER.info("Finished generating item models!");
	}

	@Override
	public String getName() {
		return "Resource Melons BlockState Definition Provider";
	}
}
