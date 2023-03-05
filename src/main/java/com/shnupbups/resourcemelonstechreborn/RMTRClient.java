package com.shnupbups.resourcemelonstechreborn;

import com.shnupbups.resourcemelons.RMCommon;
import com.shnupbups.resourcemelons.core.MelonType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;
import techreborn.TechReborn;

public class RMTRClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		if (FabricLoader.getInstance().isModLoaded(TechReborn.MOD_ID)) {
			for (TRMelonTypes melonBuilder : TRMelonTypes.values()) {
				MelonType type = melonBuilder.build();
				type.register();
				ColorProviderRegistry.BLOCK.register((block, pos, world, layer) -> type.colour(), type.stem(), type.attachedStem());
				BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), type.stem(), type.attachedStem());
				RMCommon.MELONS.add(type);
			}
		}
	}
}
