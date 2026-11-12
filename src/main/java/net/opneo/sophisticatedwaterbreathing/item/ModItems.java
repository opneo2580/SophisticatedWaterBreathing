package net.opneo.sophisticatedwaterbreathing.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.opneo.sophisticatedwaterbreathing.SophisticatedWaterBreathing;
import net.opneo.sophisticatedwaterbreathing.item.upgrade.WaterBreathingUpgradeItem;
import net.p3pp3rf1y.sophisticatedbackpacks.Config;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, SophisticatedWaterBreathing.MOD_ID);

    public static final DeferredHolder<Item, WaterBreathingUpgradeItem> WATER_BREATHING_UPGRADE = ITEMS.register("water_breathing_upgrade",
            () -> new WaterBreathingUpgradeItem(Config.SERVER.maxUpgradesPerStorage));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
