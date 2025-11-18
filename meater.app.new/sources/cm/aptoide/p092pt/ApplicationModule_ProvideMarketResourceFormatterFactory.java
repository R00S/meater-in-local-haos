package cm.aptoide.p092pt;

import cm.aptoide.p092pt.util.MarketResourceFormatter;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideMarketResourceFormatterFactory implements Provider {
    private final Provider<String> marketNameProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideMarketResourceFormatterFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.marketNameProvider = provider;
    }

    public static ApplicationModule_ProvideMarketResourceFormatterFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvideMarketResourceFormatterFactory(applicationModule, provider);
    }

    public static MarketResourceFormatter provideMarketResourceFormatter(ApplicationModule applicationModule, String str) {
        return (MarketResourceFormatter) C9055b.m29112c(applicationModule.provideMarketResourceFormatter(str));
    }

    @Override // javax.inject.Provider
    public MarketResourceFormatter get() {
        return provideMarketResourceFormatter(this.module, this.marketNameProvider.get());
    }
}
