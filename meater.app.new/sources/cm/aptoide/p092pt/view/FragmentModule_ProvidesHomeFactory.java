package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.blacklist.BlacklistManager;
import cm.aptoide.p092pt.home.Home;
import cm.aptoide.p092pt.home.bundles.BundlesRepository;
import cm.aptoide.p092pt.notification.ComingSoonNotificationManager;
import cm.aptoide.p092pt.promotions.PromotionsManager;
import cm.aptoide.p092pt.promotions.PromotionsPreferencesManager;
import cm.aptoide.p092pt.reactions.ReactionsManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesHomeFactory implements Provider {
    private final Provider<BlacklistManager> blacklistManagerProvider;
    private final Provider<BundlesRepository> bundlesRepositoryProvider;
    private final Provider<ComingSoonNotificationManager> comingSoonNotificationManagerProvider;
    private final FragmentModule module;
    private final Provider<PromotionsManager> promotionsManagerProvider;
    private final Provider<PromotionsPreferencesManager> promotionsPreferencesManagerProvider;
    private final Provider<String> promotionsTypeProvider;
    private final Provider<ReactionsManager> reactionsManagerProvider;

    public FragmentModule_ProvidesHomeFactory(FragmentModule fragmentModule, Provider<BundlesRepository> provider, Provider<PromotionsManager> provider2, Provider<PromotionsPreferencesManager> provider3, Provider<BlacklistManager> provider4, Provider<String> provider5, Provider<ReactionsManager> provider6, Provider<ComingSoonNotificationManager> provider7) {
        this.module = fragmentModule;
        this.bundlesRepositoryProvider = provider;
        this.promotionsManagerProvider = provider2;
        this.promotionsPreferencesManagerProvider = provider3;
        this.blacklistManagerProvider = provider4;
        this.promotionsTypeProvider = provider5;
        this.reactionsManagerProvider = provider6;
        this.comingSoonNotificationManagerProvider = provider7;
    }

    public static FragmentModule_ProvidesHomeFactory create(FragmentModule fragmentModule, Provider<BundlesRepository> provider, Provider<PromotionsManager> provider2, Provider<PromotionsPreferencesManager> provider3, Provider<BlacklistManager> provider4, Provider<String> provider5, Provider<ReactionsManager> provider6, Provider<ComingSoonNotificationManager> provider7) {
        return new FragmentModule_ProvidesHomeFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static Home providesHome(FragmentModule fragmentModule, BundlesRepository bundlesRepository, PromotionsManager promotionsManager, PromotionsPreferencesManager promotionsPreferencesManager, BlacklistManager blacklistManager, String str, ReactionsManager reactionsManager, ComingSoonNotificationManager comingSoonNotificationManager) {
        return (Home) C9055b.m29112c(fragmentModule.providesHome(bundlesRepository, promotionsManager, promotionsPreferencesManager, blacklistManager, str, reactionsManager, comingSoonNotificationManager));
    }

    @Override // javax.inject.Provider
    public Home get() {
        return providesHome(this.module, this.bundlesRepositoryProvider.get(), this.promotionsManagerProvider.get(), this.promotionsPreferencesManagerProvider.get(), this.blacklistManagerProvider.get(), this.promotionsTypeProvider.get(), this.reactionsManagerProvider.get(), this.comingSoonNotificationManagerProvider.get());
    }
}
