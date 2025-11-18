package cm.aptoide.p092pt.home;

import android.os.Bundle;
import cm.aptoide.p092pt.BuildConfig;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppCoinsInfoFragment;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.editorial.EditorialFragment;
import cm.aptoide.p092pt.home.bundles.base.AppBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.link.CustomTabsHelper;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.promotions.PromotionsFragment;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.settings.MyAccountFragment;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class HomeNavigator {
    private static final String TAG = "HomeNavigator";
    private final AccountNavigator accountNavigator;
    private final ActivityNavigator activityNavigator;
    private final AppNavigator appNavigator;
    private final AptoideBottomNavigator aptoideBottomNavigator;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final FragmentNavigator fragmentNavigator;
    private final ThemeManager themeManager;

    public HomeNavigator(FragmentNavigator fragmentNavigator, AptoideBottomNavigator aptoideBottomNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator, ActivityNavigator activityNavigator, AccountNavigator accountNavigator, ThemeManager themeManager) {
        this.fragmentNavigator = fragmentNavigator;
        this.aptoideBottomNavigator = aptoideBottomNavigator;
        this.bottomNavigationMapper = bottomNavigationMapper;
        this.appNavigator = appNavigator;
        this.activityNavigator = activityNavigator;
        this.accountNavigator = accountNavigator;
        this.themeManager = themeManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bottomNavigation$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7868a(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.HOME));
    }

    public C11234e<Integer> bottomNavigation() {
        return this.aptoideBottomNavigator.navigationEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.w3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10019f.m7868a((Integer) obj);
            }
        });
    }

    public void navigateToAppCoinsInformationView() {
        this.fragmentNavigator.navigateTo(AppCoinsInfoFragment.newInstance(), true);
    }

    public void navigateToAppView(long j2, String str, String str2) {
        this.appNavigator.navigateWithAppId(j2, str, AppViewFragment.OpenType.OPEN_ONLY, str2);
    }

    public void navigateToEditorial(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("cardId", str);
        bundle.putBoolean(EditorialFragment.FROM_HOME, true);
        EditorialFragment editorialFragment = new EditorialFragment();
        editorialFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(editorialFragment, true);
    }

    public void navigateToLogIn() {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.EDITORIAL);
    }

    public void navigateToMyAccount() {
        this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
    }

    public void navigateToPrivacyPolicy() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(C1146R.string.all_url_privacy_policy), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).resourceId);
    }

    public void navigateToPromotions() {
        this.fragmentNavigator.navigateTo(new PromotionsFragment(), true);
    }

    public void navigateToTermsAndConditions() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(C1146R.string.all_url_terms_conditions), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).resourceId);
    }

    public void navigateWithAction(HomeEvent homeEvent) {
        String tag = homeEvent.getBundle().getTag();
        if (homeEvent.getBundle() instanceof AppBundle) {
            tag = ((AppBundle) homeEvent.getBundle()).getActionTag();
        }
        this.fragmentNavigator.navigateTo(StoreTabGridRecyclerFragment.newInstance(homeEvent.getBundle().getEvent(), homeEvent.getType(), homeEvent.getBundle().getTitle(), BuildConfig.APTOIDE_THEME, tag, StoreContext.home, true), true);
    }

    public void navigateWithDownloadUrlAndReward(long j2, String str, String str2, String str3, float f2) {
        this.appNavigator.navigateWithDownloadUrlAndReward(j2, str, str2, str3, f2);
    }

    public void navigateWithEditorsPosition(long j2, String str, String str2, String str3, String str4, String str5) {
        this.appNavigator.navigatewithEditorsPosition(j2, str, str2, str3, str4, str5);
    }

    public void navigateToAppView(String str, SearchAdResult searchAdResult) {
        this.appNavigator.navigateWithAdAndTag(searchAdResult, str);
    }
}
