package net.opneo.sophisticatedwaterbreathing.item.upgrade;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.p3pp3rf1y.sophisticatedcore.api.IStorageWrapper;
import net.p3pp3rf1y.sophisticatedcore.upgrades.ITickableUpgrade;
import net.p3pp3rf1y.sophisticatedcore.upgrades.UpgradeWrapperBase;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class WaterBreathingUpgradeWrapper extends UpgradeWrapperBase<WaterBreathingUpgradeWrapper, WaterBreathingUpgradeItem> implements ITickableUpgrade {
    private final int APPLY_INTERVAL = 100;
    private int ticksSinceLastApplication = 0;

    protected WaterBreathingUpgradeWrapper(IStorageWrapper storageWrapper, ItemStack upgrade, Consumer<ItemStack> upgradeSaveHandler) {
        super(storageWrapper, upgrade, upgradeSaveHandler);
    }

    @Override
    public void tick(@Nullable Entity entity, Level level, BlockPos pos) {
        if (!level.isClientSide() && entity instanceof LivingEntity livingEntity && ticksSinceLastApplication >= APPLY_INTERVAL) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0, false, false));
            ticksSinceLastApplication = 0;
        }
        ticksSinceLastApplication++;
    }
}
