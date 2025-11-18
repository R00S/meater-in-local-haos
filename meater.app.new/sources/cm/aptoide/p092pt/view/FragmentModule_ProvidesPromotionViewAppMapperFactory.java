package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.app.DownloadStateParser;
import cm.aptoide.p092pt.promotions.PromotionViewAppMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesPromotionViewAppMapperFactory implements Provider {
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesPromotionViewAppMapperFactory(FragmentModule fragmentModule, Provider<DownloadStateParser> provider) {
        this.module = fragmentModule;
        this.downloadStateParserProvider = provider;
    }

    public static FragmentModule_ProvidesPromotionViewAppMapperFactory create(FragmentModule fragmentModule, Provider<DownloadStateParser> provider) {
        return new FragmentModule_ProvidesPromotionViewAppMapperFactory(fragmentModule, provider);
    }

    public static PromotionViewAppMapper providesPromotionViewAppMapper(FragmentModule fragmentModule, DownloadStateParser downloadStateParser) {
        return (PromotionViewAppMapper) C9055b.m29112c(fragmentModule.providesPromotionViewAppMapper(downloadStateParser));
    }

    @Override // javax.inject.Provider
    public PromotionViewAppMapper get() {
        return providesPromotionViewAppMapper(this.module, this.downloadStateParserProvider.get());
    }
}
