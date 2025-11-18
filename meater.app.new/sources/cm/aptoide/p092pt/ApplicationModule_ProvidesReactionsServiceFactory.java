package cm.aptoide.p092pt;

import cm.aptoide.p092pt.reactions.network.ReactionsRemoteService;
import cm.aptoide.p092pt.reactions.network.ReactionsService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesReactionsServiceFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<ReactionsRemoteService.ServiceV8> reactionServiceV8Provider;

    public ApplicationModule_ProvidesReactionsServiceFactory(ApplicationModule applicationModule, Provider<ReactionsRemoteService.ServiceV8> provider) {
        this.module = applicationModule;
        this.reactionServiceV8Provider = provider;
    }

    public static ApplicationModule_ProvidesReactionsServiceFactory create(ApplicationModule applicationModule, Provider<ReactionsRemoteService.ServiceV8> provider) {
        return new ApplicationModule_ProvidesReactionsServiceFactory(applicationModule, provider);
    }

    public static ReactionsService providesReactionsService(ApplicationModule applicationModule, ReactionsRemoteService.ServiceV8 serviceV8) {
        return (ReactionsService) C9055b.m29112c(applicationModule.providesReactionsService(serviceV8));
    }

    @Override // javax.inject.Provider
    public ReactionsService get() {
        return providesReactionsService(this.module, this.reactionServiceV8Provider.get());
    }
}
