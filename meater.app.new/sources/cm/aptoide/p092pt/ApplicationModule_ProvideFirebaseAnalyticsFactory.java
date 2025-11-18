package cm.aptoide.p092pt;

import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideFirebaseAnalyticsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFirebaseAnalyticsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFirebaseAnalyticsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFirebaseAnalyticsFactory(applicationModule);
    }

    public static FirebaseAnalytics provideFirebaseAnalytics(ApplicationModule applicationModule) {
        return (FirebaseAnalytics) C9055b.m29112c(applicationModule.provideFirebaseAnalytics());
    }

    @Override // javax.inject.Provider
    public FirebaseAnalytics get() {
        return provideFirebaseAnalytics(this.module);
    }
}
