package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideHomePromotionsIdFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideHomePromotionsIdFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideHomePromotionsIdFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideHomePromotionsIdFactory(applicationModule);
    }

    public static String provideHomePromotionsId(ApplicationModule applicationModule) {
        return (String) C9055b.m29112c(applicationModule.provideHomePromotionsId());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideHomePromotionsId(this.module);
    }
}
