package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.home.more.appcoins.EarnAppcListManager;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import cm.aptoide.p092pt.wallet.WalletInstallManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvideEarnAppcListManagerFactory implements Provider {
    private final FragmentModule module;
    private final Provider<WalletAppProvider> walletAppProvider;
    private final Provider<WalletInstallManager> walletInstallManagerProvider;

    public FragmentModule_ProvideEarnAppcListManagerFactory(FragmentModule fragmentModule, Provider<WalletAppProvider> provider, Provider<WalletInstallManager> provider2) {
        this.module = fragmentModule;
        this.walletAppProvider = provider;
        this.walletInstallManagerProvider = provider2;
    }

    public static FragmentModule_ProvideEarnAppcListManagerFactory create(FragmentModule fragmentModule, Provider<WalletAppProvider> provider, Provider<WalletInstallManager> provider2) {
        return new FragmentModule_ProvideEarnAppcListManagerFactory(fragmentModule, provider, provider2);
    }

    public static EarnAppcListManager provideEarnAppcListManager(FragmentModule fragmentModule, WalletAppProvider walletAppProvider, WalletInstallManager walletInstallManager) {
        return (EarnAppcListManager) C9055b.m29112c(fragmentModule.provideEarnAppcListManager(walletAppProvider, walletInstallManager));
    }

    @Override // javax.inject.Provider
    public EarnAppcListManager get() {
        return provideEarnAppcListManager(this.module, this.walletAppProvider.get(), this.walletInstallManagerProvider.get());
    }
}
