package cm.aptoide.p092pt;

import android.telephony.TelephonyManager;
import cm.aptoide.p092pt.dataprovider.NetworkOperatorManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesNetworkOperatorManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<TelephonyManager> telephonyManagerProvider;

    public ApplicationModule_ProvidesNetworkOperatorManagerFactory(ApplicationModule applicationModule, Provider<TelephonyManager> provider) {
        this.module = applicationModule;
        this.telephonyManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesNetworkOperatorManagerFactory create(ApplicationModule applicationModule, Provider<TelephonyManager> provider) {
        return new ApplicationModule_ProvidesNetworkOperatorManagerFactory(applicationModule, provider);
    }

    public static NetworkOperatorManager providesNetworkOperatorManager(ApplicationModule applicationModule, TelephonyManager telephonyManager) {
        return (NetworkOperatorManager) C9055b.m29112c(applicationModule.providesNetworkOperatorManager(telephonyManager));
    }

    @Override // javax.inject.Provider
    public NetworkOperatorManager get() {
        return providesNetworkOperatorManager(this.module, this.telephonyManagerProvider.get());
    }
}
