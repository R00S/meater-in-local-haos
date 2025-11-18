package cm.aptoide.p092pt;

import android.content.ContentResolver;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideContentResolverFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideContentResolverFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideContentResolverFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideContentResolverFactory(applicationModule);
    }

    public static ContentResolver provideContentResolver(ApplicationModule applicationModule) {
        return (ContentResolver) C9055b.m29112c(applicationModule.provideContentResolver());
    }

    @Override // javax.inject.Provider
    public ContentResolver get() {
        return provideContentResolver(this.module);
    }
}
