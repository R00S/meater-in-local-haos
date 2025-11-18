package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.autoupdate.AutoUpdateDialogPresenter;
import cm.aptoide.p092pt.autoupdate.AutoUpdateManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesAutoUpdateDialogPresenterFactory implements Provider {
    private final Provider<AutoUpdateManager> autoUpdateManagerProvider;
    private final Provider<CrashReport> crashReporterProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesAutoUpdateDialogPresenterFactory(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<AutoUpdateManager> provider2) {
        this.module = fragmentModule;
        this.crashReporterProvider = provider;
        this.autoUpdateManagerProvider = provider2;
    }

    public static FragmentModule_ProvidesAutoUpdateDialogPresenterFactory create(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<AutoUpdateManager> provider2) {
        return new FragmentModule_ProvidesAutoUpdateDialogPresenterFactory(fragmentModule, provider, provider2);
    }

    public static AutoUpdateDialogPresenter providesAutoUpdateDialogPresenter(FragmentModule fragmentModule, CrashReport crashReport, AutoUpdateManager autoUpdateManager) {
        return (AutoUpdateDialogPresenter) C9055b.m29112c(fragmentModule.providesAutoUpdateDialogPresenter(crashReport, autoUpdateManager));
    }

    @Override // javax.inject.Provider
    public AutoUpdateDialogPresenter get() {
        return providesAutoUpdateDialogPresenter(this.module, this.crashReporterProvider.get(), this.autoUpdateManagerProvider.get());
    }
}
