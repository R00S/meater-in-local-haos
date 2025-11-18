package cm.aptoide.p092pt;

import cm.aptoide.p092pt.search.suggestions.TrendingManager;
import cm.aptoide.p092pt.search.suggestions.TrendingService;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesTrendingManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<TrendingService> trendingServiceProvider;

    public ApplicationModule_ProvidesTrendingManagerFactory(ApplicationModule applicationModule, Provider<TrendingService> provider) {
        this.module = applicationModule;
        this.trendingServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesTrendingManagerFactory create(ApplicationModule applicationModule, Provider<TrendingService> provider) {
        return new ApplicationModule_ProvidesTrendingManagerFactory(applicationModule, provider);
    }

    public static TrendingManager providesTrendingManager(ApplicationModule applicationModule, TrendingService trendingService) {
        return (TrendingManager) C9055b.m29112c(applicationModule.providesTrendingManager(trendingService));
    }

    @Override // javax.inject.Provider
    public TrendingManager get() {
        return providesTrendingManager(this.module, this.trendingServiceProvider.get());
    }
}
