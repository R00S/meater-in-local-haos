package cm.aptoide.p092pt;

import javax.inject.Provider;
import okhttp3.Interceptor;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideRetrofitLogInterceptorFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideRetrofitLogInterceptorFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideRetrofitLogInterceptorFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideRetrofitLogInterceptorFactory(applicationModule);
    }

    public static Interceptor provideRetrofitLogInterceptor(ApplicationModule applicationModule) {
        return (Interceptor) C9055b.m29112c(applicationModule.provideRetrofitLogInterceptor());
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return provideRetrofitLogInterceptor(this.module);
    }
}
