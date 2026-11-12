package net.opneo.sophisticatedwaterbreathing.item.upgrade;

import net.p3pp3rf1y.sophisticatedcore.upgrades.IUpgradeCountLimitConfig;
import net.p3pp3rf1y.sophisticatedcore.upgrades.UpgradeItemBase;
import net.p3pp3rf1y.sophisticatedcore.upgrades.UpgradeType;

import java.util.List;

public class WaterBreathingUpgradeItem extends UpgradeItemBase<WaterBreathingUpgradeWrapper> {
    private static final UpgradeType<WaterBreathingUpgradeWrapper> TYPE = new UpgradeType<>(WaterBreathingUpgradeWrapper::new);

    public WaterBreathingUpgradeItem(IUpgradeCountLimitConfig upgradeTypeLimitConfig) {
        super(upgradeTypeLimitConfig);
    }

    @Override
    public UpgradeType<WaterBreathingUpgradeWrapper> getType() {
        return TYPE;
    }

    @Override
    public List<UpgradeConflictDefinition> getUpgradeConflicts() {
        return List.of();
    }
}
