package cm.aptoide.p092pt;

import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.p092pt.utils.p106q.QManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class ApplicationModule_ProvideQManagerFactory implements Provider {
    private final ApplicationModule module;
    private final Provider<Resources> resourcesProvider;
    private final Provider<WindowManager> windowManagerProvider;

    public ApplicationModule_ProvideQManagerFactory(ApplicationModule applicationModule, Provider<Resources> provider, Provider<WindowManager> provider2) {
        this.module = applicationModule;
        this.resourcesProvider = provider;
        this.windowManagerProvider = provider2;
    }

    public static ApplicationModule_ProvideQManagerFactory create(ApplicationModule applicationModule, Provider<Resources> provider, Provider<WindowManager> provider2) {
        return new ApplicationModule_ProvideQManagerFactory(applicationModule, provider, provider2);
    }

    public static QManager provideQManager(ApplicationModule applicationModule, Resources resources, WindowManager windowManager) {
        return (QManager) C9055b.m29112c(applicationModule.provideQManager(resources, windowManager));
    }

    @Override // javax.inject.Provider
    public QManager get() {
        return provideQManager(this.module, this.resourcesProvider.get(), this.windowManagerProvider.get());
    }
}
