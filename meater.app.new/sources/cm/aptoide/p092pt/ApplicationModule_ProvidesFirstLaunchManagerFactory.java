package cm.aptoide.p092pt;

import android.content.SharedPreferences;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesFirstLaunchManagerFactory implements Provider {
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<FollowedStoresManager> followedStoresManagerProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<AptoideShortcutManager> shortcutManagerProvider;

    public ApplicationModule_ProvidesFirstLaunchManagerFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<IdsRepository> provider2, Provider<FollowedStoresManager> provider3, Provider<RootAvailabilityManager> provider4, Provider<AptoideAccountManager> provider5, Provider<AptoideShortcutManager> provider6) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.idsRepositoryProvider = provider2;
        this.followedStoresManagerProvider = provider3;
        this.rootAvailabilityManagerProvider = provider4;
        this.aptoideAccountManagerProvider = provider5;
        this.shortcutManagerProvider = provider6;
    }

    public static ApplicationModule_ProvidesFirstLaunchManagerFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<IdsRepository> provider2, Provider<FollowedStoresManager> provider3, Provider<RootAvailabilityManager> provider4, Provider<AptoideAccountManager> provider5, Provider<AptoideShortcutManager> provider6) {
        return new ApplicationModule_ProvidesFirstLaunchManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static FirstLaunchManager providesFirstLaunchManager(ApplicationModule applicationModule, SharedPreferences sharedPreferences, IdsRepository idsRepository, FollowedStoresManager followedStoresManager, RootAvailabilityManager rootAvailabilityManager, AptoideAccountManager aptoideAccountManager, AptoideShortcutManager aptoideShortcutManager) {
        return (FirstLaunchManager) C9055b.m29112c(applicationModule.providesFirstLaunchManager(sharedPreferences, idsRepository, followedStoresManager, rootAvailabilityManager, aptoideAccountManager, aptoideShortcutManager));
    }

    @Override // javax.inject.Provider
    public FirstLaunchManager get() {
        return providesFirstLaunchManager(this.module, this.defaultSharedPreferencesProvider.get(), this.idsRepositoryProvider.get(), this.followedStoresManagerProvider.get(), this.rootAvailabilityManagerProvider.get(), this.aptoideAccountManagerProvider.get(), this.shortcutManagerProvider.get());
    }
}
