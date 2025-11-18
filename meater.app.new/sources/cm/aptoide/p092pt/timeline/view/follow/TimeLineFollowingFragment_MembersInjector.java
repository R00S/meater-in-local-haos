package cm.aptoide.p092pt.timeline.view.follow;

import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeWithToolbarFragment_MembersInjector;
import javax.inject.Provider;
import p317f.InterfaceC9053a;

/* loaded from: classes.dex */
public final class TimeLineFollowingFragment_MembersInjector implements InterfaceC9053a<TimeLineFollowingFragment> {
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public TimeLineFollowingFragment_MembersInjector(Provider<String> provider, Provider<ThemeManager> provider2) {
        this.marketNameProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static InterfaceC9053a<TimeLineFollowingFragment> create(Provider<String> provider, Provider<ThemeManager> provider2) {
        return new TimeLineFollowingFragment_MembersInjector(provider, provider2);
    }

    public static void injectThemeManager(TimeLineFollowingFragment timeLineFollowingFragment, ThemeManager themeManager) {
        timeLineFollowingFragment.themeManager = themeManager;
    }

    public void injectMembers(TimeLineFollowingFragment timeLineFollowingFragment) {
        GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowingFragment, this.marketNameProvider.get());
        injectThemeManager(timeLineFollowingFragment, this.themeManagerProvider.get());
    }
}
