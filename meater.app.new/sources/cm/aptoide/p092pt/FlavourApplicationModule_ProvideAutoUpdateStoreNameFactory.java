package cm.aptoide.p092pt;

import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory implements Provider {
    private final FlavourApplicationModule module;

    public FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory(FlavourApplicationModule flavourApplicationModule) {
        this.module = flavourApplicationModule;
    }

    public static FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory create(FlavourApplicationModule flavourApplicationModule) {
        return new FlavourApplicationModule_ProvideAutoUpdateStoreNameFactory(flavourApplicationModule);
    }

    public static String provideAutoUpdateStoreName(FlavourApplicationModule flavourApplicationModule) {
        return (String) C9055b.m29112c(flavourApplicationModule.provideAutoUpdateStoreName());
    }

    @Override // javax.inject.Provider
    public String get() {
        return provideAutoUpdateStoreName(this.module);
    }
}
