package cm.aptoide.p092pt;

import android.telephony.TelephonyManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesTelephonyManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesTelephonyManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesTelephonyManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesTelephonyManagerFactory(applicationModule);
    }

    public static TelephonyManager providesTelephonyManager(ApplicationModule applicationModule) {
        return (TelephonyManager) C9055b.m29112c(applicationModule.providesTelephonyManager());
    }

    @Override // javax.inject.Provider
    public TelephonyManager get() {
        return providesTelephonyManager(this.module);
    }
}
