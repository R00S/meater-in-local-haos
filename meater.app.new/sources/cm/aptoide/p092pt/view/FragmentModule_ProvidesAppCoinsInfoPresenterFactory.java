package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.socialmedia.SocialMediaAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesAppCoinsInfoPresenterFactory implements Provider {
    private final Provider<AppCoinsInfoNavigator> appCoinsInfoNavigatorProvider;
    private final Provider<AppCoinsManager> appCoinsManagerProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final FragmentModule module;
    private final Provider<SocialMediaAnalytics> socialMediaAnalyticsProvider;

    public FragmentModule_ProvidesAppCoinsInfoPresenterFactory(FragmentModule fragmentModule, Provider<AppCoinsInfoNavigator> provider, Provider<InstallManager> provider2, Provider<CrashReport> provider3, Provider<SocialMediaAnalytics> provider4, Provider<AppCoinsManager> provider5) {
        this.module = fragmentModule;
        this.appCoinsInfoNavigatorProvider = provider;
        this.installManagerProvider = provider2;
        this.crashReportProvider = provider3;
        this.socialMediaAnalyticsProvider = provider4;
        this.appCoinsManagerProvider = provider5;
    }

    public static FragmentModule_ProvidesAppCoinsInfoPresenterFactory create(FragmentModule fragmentModule, Provider<AppCoinsInfoNavigator> provider, Provider<InstallManager> provider2, Provider<CrashReport> provider3, Provider<SocialMediaAnalytics> provider4, Provider<AppCoinsManager> provider5) {
        return new FragmentModule_ProvidesAppCoinsInfoPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AppCoinsInfoPresenter providesAppCoinsInfoPresenter(FragmentModule fragmentModule, AppCoinsInfoNavigator appCoinsInfoNavigator, InstallManager installManager, CrashReport crashReport, SocialMediaAnalytics socialMediaAnalytics, AppCoinsManager appCoinsManager) {
        return (AppCoinsInfoPresenter) C9055b.m29112c(fragmentModule.providesAppCoinsInfoPresenter(appCoinsInfoNavigator, installManager, crashReport, socialMediaAnalytics, appCoinsManager));
    }

    @Override // javax.inject.Provider
    public AppCoinsInfoPresenter get() {
        return providesAppCoinsInfoPresenter(this.module, this.appCoinsInfoNavigatorProvider.get(), this.installManagerProvider.get(), this.crashReportProvider.get(), this.socialMediaAnalyticsProvider.get(), this.appCoinsManagerProvider.get());
    }
}
