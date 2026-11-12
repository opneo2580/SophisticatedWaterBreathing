package net.opneo.sophisticatedwaterbreathing.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.opneo.sophisticatedwaterbreathing.SophisticatedWaterBreathing;
import net.opneo.sophisticatedwaterbreathing.item.upgrade.WaterBreathingUpgradeItem;
import net.p3pp3rf1y.sophisticatedbackpacks.Config;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SophisticatedWaterBreathing.MODID);

    public static final RegistryObject<WaterBreathingUpgradeItem> WATER_BREATHING_UPGRADE = ITEMS.register("water_breathing_upgrade",
            () -> new WaterBreathingUpgradeItem(Config.SERVER.maxUpgradesPerStorage));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
