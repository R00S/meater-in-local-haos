package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.mmpcampaigns.CampaignRepository;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideCampaignRepositoryFactory implements Provider {
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideCampaignRepositoryFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
    }

    public static ApplicationModule_ProvideCampaignRepositoryFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider) {
        return new ApplicationModule_ProvideCampaignRepositoryFactory(applicationModule, provider);
    }

    public static CampaignRepository provideCampaignRepository(ApplicationModule applicationModule, OkHttpClient okHttpClient) {
        return (CampaignRepository) C9055b.m29112c(applicationModule.provideCampaignRepository(okHttpClient));
    }

    @Override // javax.inject.Provider
    public CampaignRepository get() {
        return provideCampaignRepository(this.module, this.httpClientProvider.get());
    }
}
