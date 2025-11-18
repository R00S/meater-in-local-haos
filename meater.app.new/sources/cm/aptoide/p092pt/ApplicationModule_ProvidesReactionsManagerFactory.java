package cm.aptoide.p092pt;

import cm.aptoide.p092pt.reactions.ReactionsManager;
import cm.aptoide.p092pt.reactions.network.ReactionsService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesReactionsManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<ReactionsService> reactionsServiceProvider;

    public ApplicationModule_ProvidesReactionsManagerFactory(ApplicationModule applicationModule, Provider<ReactionsService> provider) {
        this.module = applicationModule;
        this.reactionsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesReactionsManagerFactory create(ApplicationModule applicationModule, Provider<ReactionsService> provider) {
        return new ApplicationModule_ProvidesReactionsManagerFactory(applicationModule, provider);
    }

    public static ReactionsManager providesReactionsManager(ApplicationModule applicationModule, ReactionsService reactionsService) {
        return (ReactionsManager) C9055b.m29112c(applicationModule.providesReactionsManager(reactionsService));
    }

    @Override // javax.inject.Provider
    public ReactionsManager get() {
        return providesReactionsManager(this.module, this.reactionsServiceProvider.get());
    }
}
