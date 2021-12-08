package com.shnupbups.resourcemelonstechreborn.datagen.provider;

import java.util.function.Consumer;

import net.minecraft.data.server.RecipesProvider;
import net.minecraft.data.server.recipe.CraftingRecipeJsonFactory;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonFactory;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonFactory;
import net.minecraft.item.Items;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipesProvider;

import com.shnupbups.resourcemelons.RMCommon;
import com.shnupbups.resourcemelons.core.MelonType;
import com.shnupbups.resourcemelonstechreborn.TRMelonTypes;

public class RMTRRecipesProvider extends FabricRecipesProvider {
	public RMTRRecipesProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
		RMCommon.LOGGER.info("Generating recipes...");

		for (TRMelonTypes melonBuilder : TRMelonTypes.values()) {
			MelonType melonType = melonBuilder.getType();

			RMCommon.LOGGER.info("Generating for " + melonType.id());

			offerRecipes(melonType, melonBuilder, exporter);
		}

		RMCommon.LOGGER.info("Finished generating recipes!");
	}

	public static void offerRecipes(MelonType melonType, TRMelonTypes melonBuilder, Consumer<RecipeJsonProvider> exporter) {
		createSeedsRecipe(melonType, melonBuilder).criterion(RecipesProvider.hasItem(melonType.resourceBlock()), RecipesProvider.conditionsFromTag(melonBuilder.getResourceBlockCommonItemTag())).offerTo(exporter);
		createAltSeedsRecipe(melonType, melonBuilder).criterion(RecipesProvider.hasItem(melonType.resourceBlock()), RecipesProvider.conditionsFromTag(melonBuilder.getResourceBlockCommonItemTag())).offerTo(exporter, CraftingRecipeJsonFactory.getItemId(melonType.seeds()) + "_alt");
		createSeedsFromMelonRecipe(melonType).criterion(RecipesProvider.hasItem(melonType.melon()), RecipesProvider.conditionsFromItem(melonType.melon())).offerTo(exporter, CraftingRecipeJsonFactory.getItemId(melonType.seeds()) + "_from_melon");
		createMelonRecipe(melonType).criterion(RecipesProvider.hasItem(melonType.slice()), RecipesProvider.conditionsFromItem(melonType.slice())).offerTo(exporter);
	}

	public static CraftingRecipeJsonFactory createSeedsRecipe(MelonType melonType, TRMelonTypes melonBuilder) {
		return ShapedRecipeJsonFactory.create(melonType.seeds()).input('r', melonBuilder.getResourceCommonTag()).input('b', melonBuilder.getResourceBlockCommonItemTag()).input('s', Items.MELON_SEEDS).pattern("rbr").pattern("bsb").pattern("rbr").group(CraftingRecipeJsonFactory.getItemId(melonType.seeds()).getPath());
	}

	public static CraftingRecipeJsonFactory createAltSeedsRecipe(MelonType melonType, TRMelonTypes melonBuilder) {
		return ShapedRecipeJsonFactory.create(melonType.seeds()).input('r', melonBuilder.getResourceCommonTag()).input('b', melonBuilder.getResourceBlockCommonItemTag()).input('s', Items.MELON_SEEDS).pattern("brb").pattern("rsr").pattern("brb").group(CraftingRecipeJsonFactory.getItemId(melonType.seeds()).getPath());
	}

	public static CraftingRecipeJsonFactory createMelonRecipe(MelonType melonType) {
		return ShapedRecipeJsonFactory.create(melonType.melon()).input('s', melonType.slice()).pattern("sss").pattern("sss").pattern("sss");
	}

	public static CraftingRecipeJsonFactory createSeedsFromMelonRecipe(MelonType melonType) {
		return ShapelessRecipeJsonFactory.create(melonType.seeds()).input(melonType.melon());
	}
}
