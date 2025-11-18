package cm.aptoide.p092pt;

import cm.aptoide.p092pt.app.mmpcampaigns.CampaignMapper;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideCampaignMapperFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideCampaignMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideCampaignMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideCampaignMapperFactory(applicationModule);
    }

    public static CampaignMapper provideCampaignMapper(ApplicationModule applicationModule) {
        return (CampaignMapper) C9055b.m29112c(applicationModule.provideCampaignMapper());
    }

    @Override // javax.inject.Provider
    public CampaignMapper get() {
        return provideCampaignMapper(this.module);
    }
}
