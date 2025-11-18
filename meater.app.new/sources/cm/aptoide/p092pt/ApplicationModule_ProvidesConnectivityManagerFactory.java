package cm.aptoide.p092pt;

import android.net.ConnectivityManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesConnectivityManagerFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesConnectivityManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesConnectivityManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesConnectivityManagerFactory(applicationModule);
    }

    public static ConnectivityManager providesConnectivityManager(ApplicationModule applicationModule) {
        return (ConnectivityManager) C9055b.m29112c(applicationModule.providesConnectivityManager());
    }

    @Override // javax.inject.Provider
    public ConnectivityManager get() {
        return providesConnectivityManager(this.module);
    }
}
