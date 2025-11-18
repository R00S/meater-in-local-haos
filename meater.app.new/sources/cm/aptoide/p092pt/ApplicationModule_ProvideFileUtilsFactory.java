package cm.aptoide.p092pt;

import cm.aptoide.p092pt.utils.FileUtils;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideFileUtilsFactory implements Provider {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFileUtilsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFileUtilsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFileUtilsFactory(applicationModule);
    }

    public static FileUtils provideFileUtils(ApplicationModule applicationModule) {
        return (FileUtils) C9055b.m29112c(applicationModule.provideFileUtils());
    }

    @Override // javax.inject.Provider
    public FileUtils get() {
        return provideFileUtils(this.module);
    }
}
