package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAccountSettingsBodyInterceptorPoolV7Factory */
/* loaded from: classes.dex */
public final class C1136xe98d65dc implements Provider {
    private final Provider<AdultContent> adultContentProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorProvider;
    private final ApplicationModule module;

    public C1136xe98d65dc(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<AdultContent> provider2) {
        this.module = applicationModule;
        this.bodyInterceptorProvider = provider;
        this.adultContentProvider = provider2;
    }

    public static C1136xe98d65dc create(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<AdultContent> provider2) {
        return new C1136xe98d65dc(applicationModule, provider, provider2);
    }

    public static BodyInterceptor<BaseBody> provideAccountSettingsBodyInterceptorPoolV7(ApplicationModule applicationModule, BodyInterceptor<BaseBody> bodyInterceptor, AdultContent adultContent) {
        return (BodyInterceptor) C9055b.m29112c(applicationModule.provideAccountSettingsBodyInterceptorPoolV7(bodyInterceptor, adultContent));
    }

    @Override // javax.inject.Provider
    public BodyInterceptor<BaseBody> get() {
        return provideAccountSettingsBodyInterceptorPoolV7(this.module, this.bodyInterceptorProvider.get(), this.adultContentProvider.get());
    }
}
