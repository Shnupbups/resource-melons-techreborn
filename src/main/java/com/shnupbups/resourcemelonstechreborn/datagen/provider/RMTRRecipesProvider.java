package com.shnupbups.resourcemelonstechreborn.datagen.provider;

import java.util.function.Consumer;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
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
		createSeedsRecipe(melonType, melonBuilder).criterion(RecipeProvider.hasItem(melonType.resourceBlock()), RecipeProvider.conditionsFromTag(melonBuilder.getResourceBlockCommonItemTag())).offerTo(exporter);
		createAltSeedsRecipe(melonType, melonBuilder).criterion(RecipeProvider.hasItem(melonType.resourceBlock()), RecipeProvider.conditionsFromTag(melonBuilder.getResourceBlockCommonItemTag())).offerTo(exporter, CraftingRecipeJsonBuilder.getItemId(melonType.seeds()) + "_alt");
		createSeedsFromMelonRecipe(melonType).criterion(RecipeProvider.hasItem(melonType.melon()), RecipeProvider.conditionsFromItem(melonType.melon())).offerTo(exporter, CraftingRecipeJsonBuilder.getItemId(melonType.seeds()) + "_from_melon");
		createMelonRecipe(melonType).criterion(RecipeProvider.hasItem(melonType.slice()), RecipeProvider.conditionsFromItem(melonType.slice())).offerTo(exporter);
	}

	public static CraftingRecipeJsonBuilder createSeedsRecipe(MelonType melonType, TRMelonTypes melonBuilder) {
		return ShapedRecipeJsonBuilder.create(melonType.seeds()).input('r', melonBuilder.getResourceCommonTag()).input('b', melonBuilder.getResourceBlockCommonItemTag()).input('s', Items.MELON_SEEDS).pattern("rbr").pattern("bsb").pattern("rbr").group(CraftingRecipeJsonBuilder.getItemId(melonType.seeds()).getPath());
	}

	public static CraftingRecipeJsonBuilder createAltSeedsRecipe(MelonType melonType, TRMelonTypes melonBuilder) {
		return ShapedRecipeJsonBuilder.create(melonType.seeds()).input('r', melonBuilder.getResourceCommonTag()).input('b', melonBuilder.getResourceBlockCommonItemTag()).input('s', Items.MELON_SEEDS).pattern("brb").pattern("rsr").pattern("brb").group(CraftingRecipeJsonBuilder.getItemId(melonType.seeds()).getPath());
	}

	public static CraftingRecipeJsonBuilder createMelonRecipe(MelonType melonType) {
		return ShapedRecipeJsonBuilder.create(melonType.melon()).input('s', melonType.slice()).pattern("sss").pattern("sss").pattern("sss");
	}

	public static CraftingRecipeJsonBuilder createSeedsFromMelonRecipe(MelonType melonType) {
		return ShapelessRecipeJsonBuilder.create(melonType.seeds()).input(melonType.melon());
	}
}
