package cm.aptoide.p092pt;

import com.google.android.gms.common.api.GoogleApiClient;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideGoogleApiClientFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideGoogleApiClientFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideGoogleApiClientFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideGoogleApiClientFactory(applicationModule);
    }

    public static GoogleApiClient provideGoogleApiClient(ApplicationModule applicationModule) {
        return (GoogleApiClient) C9055b.m29112c(applicationModule.provideGoogleApiClient());
    }

    @Override // javax.inject.Provider
    public GoogleApiClient get() {
        return provideGoogleApiClient(this.module);
    }
}
