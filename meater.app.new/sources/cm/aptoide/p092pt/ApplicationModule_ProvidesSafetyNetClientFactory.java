package cm.aptoide.p092pt;

import com.google.android.gms.safetynet.SafetyNetClient;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesSafetyNetClientFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSafetyNetClientFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesSafetyNetClientFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesSafetyNetClientFactory(applicationModule);
    }

    public static SafetyNetClient providesSafetyNetClient(ApplicationModule applicationModule) {
        return (SafetyNetClient) C9055b.m29112c(applicationModule.providesSafetyNetClient());
    }

    @Override // javax.inject.Provider
    public SafetyNetClient get() {
        return providesSafetyNetClient(this.module);
    }
}
