package cm.aptoide.p092pt.reviews;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class LatestReviewsFragment_MembersInjector implements InterfaceC9053a<LatestReviewsFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;

    public LatestReviewsFragment_MembersInjector(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<StoreCredentialsProvider> provider3) {
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.storeCredentialsProvider = provider3;
    }

    public static InterfaceC9053a<LatestReviewsFragment> create(Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<StoreCredentialsProvider> provider3) {
        return new LatestReviewsFragment_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAnalyticsManager(LatestReviewsFragment latestReviewsFragment, AnalyticsManager analyticsManager) {
        latestReviewsFragment.analyticsManager = analyticsManager;
    }

    public static void injectNavigationTracker(LatestReviewsFragment latestReviewsFragment, NavigationTracker navigationTracker) {
        latestReviewsFragment.navigationTracker = navigationTracker;
    }

    public static void injectStoreCredentialsProvider(LatestReviewsFragment latestReviewsFragment, StoreCredentialsProvider storeCredentialsProvider) {
        latestReviewsFragment.storeCredentialsProvider = storeCredentialsProvider;
    }

    public void injectMembers(LatestReviewsFragment latestReviewsFragment) {
        injectAnalyticsManager(latestReviewsFragment, this.analyticsManagerProvider.get());
        injectNavigationTracker(latestReviewsFragment, this.navigationTrackerProvider.get());
        injectStoreCredentialsProvider(latestReviewsFragment, this.storeCredentialsProvider.get());
    }
}
