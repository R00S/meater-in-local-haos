package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.editorial.EditorialAnalytics;
import cm.aptoide.p092pt.editorial.EditorialManager;
import cm.aptoide.p092pt.editorial.EditorialNavigator;
import cm.aptoide.p092pt.editorial.EditorialPresenter;
import cm.aptoide.p092pt.socialmedia.SocialMediaAnalytics;
import javax.inject.Provider;
import p317f.p318b.C9055b;

/* loaded from: classes.dex */
public final class FragmentModule_ProvidesEditorialPresenterFactory implements Provider {
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<EditorialAnalytics> editorialAnalyticsProvider;
    private final Provider<EditorialManager> editorialManagerProvider;
    private final Provider<EditorialNavigator> editorialNavigatorProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<SocialMediaAnalytics> socialMediaAnalyticsProvider;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public FragmentModule_ProvidesEditorialPresenterFactory(FragmentModule fragmentModule, Provider<EditorialManager> provider, Provider<CrashReport> provider2, Provider<EditorialAnalytics> provider3, Provider<EditorialNavigator> provider4, Provider<UserFeedbackAnalytics> provider5, Provider<MoPubAdsManager> provider6, Provider<SocialMediaAnalytics> provider7) {
        this.module = fragmentModule;
        this.editorialManagerProvider = provider;
        this.crashReportProvider = provider2;
        this.editorialAnalyticsProvider = provider3;
        this.editorialNavigatorProvider = provider4;
        this.userFeedbackAnalyticsProvider = provider5;
        this.moPubAdsManagerProvider = provider6;
        this.socialMediaAnalyticsProvider = provider7;
    }

    public static FragmentModule_ProvidesEditorialPresenterFactory create(FragmentModule fragmentModule, Provider<EditorialManager> provider, Provider<CrashReport> provider2, Provider<EditorialAnalytics> provider3, Provider<EditorialNavigator> provider4, Provider<UserFeedbackAnalytics> provider5, Provider<MoPubAdsManager> provider6, Provider<SocialMediaAnalytics> provider7) {
        return new FragmentModule_ProvidesEditorialPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static EditorialPresenter providesEditorialPresenter(FragmentModule fragmentModule, EditorialManager editorialManager, CrashReport crashReport, EditorialAnalytics editorialAnalytics, EditorialNavigator editorialNavigator, UserFeedbackAnalytics userFeedbackAnalytics, MoPubAdsManager moPubAdsManager, SocialMediaAnalytics socialMediaAnalytics) {
        return (EditorialPresenter) C9055b.m29112c(fragmentModule.providesEditorialPresenter(editorialManager, crashReport, editorialAnalytics, editorialNavigator, userFeedbackAnalytics, moPubAdsManager, socialMediaAnalytics));
    }

    @Override // javax.inject.Provider
    public EditorialPresenter get() {
        return providesEditorialPresenter(this.module, this.editorialManagerProvider.get(), this.crashReportProvider.get(), this.editorialAnalyticsProvider.get(), this.editorialNavigatorProvider.get(), this.userFeedbackAnalyticsProvider.get(), this.moPubAdsManagerProvider.get(), this.socialMediaAnalyticsProvider.get());
    }
}
