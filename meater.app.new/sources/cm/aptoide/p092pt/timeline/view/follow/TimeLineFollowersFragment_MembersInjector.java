package cm.aptoide.p092pt.timeline.view.follow;

import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeWithToolbarFragment_MembersInjector;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class TimeLineFollowersFragment_MembersInjector implements InterfaceC9053a<TimeLineFollowersFragment> {
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public TimeLineFollowersFragment_MembersInjector(Provider<String> provider, Provider<ThemeManager> provider2) {
        this.marketNameProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static InterfaceC9053a<TimeLineFollowersFragment> create(Provider<String> provider, Provider<ThemeManager> provider2) {
        return new TimeLineFollowersFragment_MembersInjector(provider, provider2);
    }

    public static void injectThemeManager(TimeLineFollowersFragment timeLineFollowersFragment, ThemeManager themeManager) {
        timeLineFollowersFragment.themeManager = themeManager;
    }

    public void injectMembers(TimeLineFollowersFragment timeLineFollowersFragment) {
        GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowersFragment, this.marketNameProvider.get());
        injectThemeManager(timeLineFollowersFragment, this.themeManagerProvider.get());
    }
}
