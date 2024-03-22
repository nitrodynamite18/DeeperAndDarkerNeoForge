package com.kyanite.deeperdarker;

import com.kyanite.deeperdarker.content.blocks.DDBlocks;
import com.kyanite.deeperdarker.content.items.DDItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod("deeperdarker")
public class DeeperDarker {
    public static final String MODID = "deeperdarker";

    public DeeperDarker(IEventBus eventBus) {
        DDItems.CREATIVE_MODE_TABS.register(eventBus);
        DDBlocks.BLOCKS.register(eventBus);
        DDItems.ITEMS.register(eventBus);
    }
}
