package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.download.view.DownloadDialogProvider;
import cm.aptoide.p092pt.themes.ThemeManager;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesDownloadDialogManagerFactory implements Provider {
    private final FragmentModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public FragmentModule_ProvidesDownloadDialogManagerFactory(FragmentModule fragmentModule, Provider<ThemeManager> provider) {
        this.module = fragmentModule;
        this.themeManagerProvider = provider;
    }

    public static FragmentModule_ProvidesDownloadDialogManagerFactory create(FragmentModule fragmentModule, Provider<ThemeManager> provider) {
        return new FragmentModule_ProvidesDownloadDialogManagerFactory(fragmentModule, provider);
    }

    public static DownloadDialogProvider providesDownloadDialogManager(FragmentModule fragmentModule, ThemeManager themeManager) {
        return (DownloadDialogProvider) C9055b.m29112c(fragmentModule.providesDownloadDialogManager(themeManager));
    }

    @Override // javax.inject.Provider
    public DownloadDialogProvider get() {
        return providesDownloadDialogManager(this.module, this.themeManagerProvider.get());
    }
}
