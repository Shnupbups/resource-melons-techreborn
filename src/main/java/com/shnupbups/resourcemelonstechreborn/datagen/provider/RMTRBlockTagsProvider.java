package com.shnupbups.resourcemelonstechreborn.datagen.provider;

import com.shnupbups.resourcemelons.RMCommon;
import com.shnupbups.resourcemelons.core.MelonType;
import com.shnupbups.resourcemelons.datagen.provider.RMBlockTagsProvider;
import com.shnupbups.resourcemelons.misc.RMTags;
import com.shnupbups.resourcemelonstechreborn.TRMelonTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;

public class RMTRBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
	public RMTRBlockTagsProvider(FabricDataGenerator dataGenerator) {
		super(dataGenerator);
	}

	@Override
	protected void generateTags() {
		RMCommon.LOGGER.info("Generating block tags...");

		FabricTagBuilder<Block> resourceMelons = getOrCreateTagBuilder(RMTags.BlockTags.RESOURCE_MELONS);
		FabricTagBuilder<Block> resourceMelonUnattachedStems = getOrCreateTagBuilder(RMTags.BlockTags.RESOURCE_MELON_UNATTACHED_STEMS);
		FabricTagBuilder<Block> resourceMelonAttachedStems = getOrCreateTagBuilder(RMTags.BlockTags.RESOURCE_MELON_ATTACHED_STEMS);

		for (TRMelonTypes melonBuilder : TRMelonTypes.values()) {
			MelonType melonType = melonBuilder.getType();

			RMCommon.LOGGER.info("Generating for " + melonType.id());

			resourceMelons.add(melonType.melon());
			resourceMelonUnattachedStems.add(melonType.stem());
			resourceMelonAttachedStems.add(melonType.attachedStem());
			TagKey<Block> miningLevelTag = RMBlockTagsProvider.getMiningLevelTag(melonType.miningLevel());
			if (miningLevelTag != null) {
				getOrCreateTagBuilder(miningLevelTag).add(melonType.stem(), melonType.attachedStem(), melonType.melon());
			}
			getOrCreateTagBuilder(melonBuilder.getResourceBlockCommonBlockTag()).add(melonType.resourceBlock()); // needed or else datagen crashes
			getOrCreateTagBuilder(melonType.catalyst()).addTag(melonBuilder.getResourceBlockCommonBlockTag());
		}

		RMCommon.LOGGER.info("Finished generating block tags!");
	}
}
