package com.spu.futurearmour.content.client.rendering.costumes;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderPlayerEvent;

@OnlyIn(Dist.CLIENT)
public class CostumeRenderingHandler {

    public static void onPlayerRender(RenderPlayerEvent.Pre event){
        event.setCanceled(true);
    }
}