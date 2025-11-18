package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FlavourApplicationModule_ProvidePartnerIDFactory implements Provider {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvidePartnerIDFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvidePartnerIDFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvidePartnerIDFactory(flavourApplicationModule);
    }

    public static String providePartnerID(FlavourApplicationModule flavourApplicationModule) {
        return (String) C9055b.m29112c(flavourApplicationModule.providePartnerID());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providePartnerID(this.module);
    }
}
