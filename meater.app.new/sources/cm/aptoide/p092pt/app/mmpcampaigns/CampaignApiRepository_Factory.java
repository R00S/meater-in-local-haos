package cm.aptoide.p092pt.app.mmpcampaigns;

import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class CampaignApiRepository_Factory implements Provider {
    private final Provider<OkHttpClient> clientProvider;

    public CampaignApiRepository_Factory(Provider<OkHttpClient> provider) {
        this.clientProvider = provider;
    }

    public static CampaignApiRepository_Factory create(Provider<OkHttpClient> provider) {
        return new CampaignApiRepository_Factory(provider);
    }

    public static CampaignApiRepository newInstance(OkHttpClient okHttpClient) {
        return new CampaignApiRepository(okHttpClient);
    }

    @Override // javax.inject.Provider
    public CampaignApiRepository get() {
        return newInstance(this.clientProvider.get());
    }
}
