package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.wallet.WalletInstallConfiguration;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ActivityModule_ProvidesWalletInstallConfigurationFactory implements Provider {
    private final ActivityModule module;

    public ActivityModule_ProvidesWalletInstallConfigurationFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvidesWalletInstallConfigurationFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvidesWalletInstallConfigurationFactory(activityModule);
    }

    public static WalletInstallConfiguration providesWalletInstallConfiguration(ActivityModule activityModule) {
        return (WalletInstallConfiguration) C9055b.m29112c(activityModule.providesWalletInstallConfiguration());
    }

    @Override // javax.inject.Provider
    public WalletInstallConfiguration get() {
        return providesWalletInstallConfiguration(this.module);
    }
}
