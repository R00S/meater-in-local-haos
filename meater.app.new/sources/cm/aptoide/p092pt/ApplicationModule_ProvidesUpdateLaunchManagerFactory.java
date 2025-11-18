package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesUpdateLaunchManagerFactory implements Provider {
    private final Provider<FollowedStoresManager> followedStoresManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdateLaunchManagerFactory(ApplicationModule applicationModule, Provider<FollowedStoresManager> provider) {
        this.module = applicationModule;
        this.followedStoresManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesUpdateLaunchManagerFactory create(ApplicationModule applicationModule, Provider<FollowedStoresManager> provider) {
        return new ApplicationModule_ProvidesUpdateLaunchManagerFactory(applicationModule, provider);
    }

    public static UpdateLaunchManager providesUpdateLaunchManager(ApplicationModule applicationModule, FollowedStoresManager followedStoresManager) {
        return (UpdateLaunchManager) C9055b.m29112c(applicationModule.providesUpdateLaunchManager(followedStoresManager));
    }

    @Override // javax.inject.Provider
    public UpdateLaunchManager get() {
        return providesUpdateLaunchManager(this.module, this.followedStoresManagerProvider.get());
    }
}
