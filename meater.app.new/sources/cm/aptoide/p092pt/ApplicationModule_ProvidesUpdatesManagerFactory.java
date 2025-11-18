package cm.aptoide.p092pt;

import cm.aptoide.p092pt.home.apps.UpdatesManager;
import cm.aptoide.p092pt.updates.UpdateRepository;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesUpdatesManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<UpdateRepository> updateRepositoryProvider;

    public ApplicationModule_ProvidesUpdatesManagerFactory(ApplicationModule applicationModule, Provider<UpdateRepository> provider) {
        this.module = applicationModule;
        this.updateRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesUpdatesManagerFactory create(ApplicationModule applicationModule, Provider<UpdateRepository> provider) {
        return new ApplicationModule_ProvidesUpdatesManagerFactory(applicationModule, provider);
    }

    public static UpdatesManager providesUpdatesManager(ApplicationModule applicationModule, UpdateRepository updateRepository) {
        return (UpdatesManager) C9055b.m29112c(applicationModule.providesUpdatesManager(updateRepository));
    }

    @Override // javax.inject.Provider
    public UpdatesManager get() {
        return providesUpdatesManager(this.module, this.updateRepositoryProvider.get());
    }
}
