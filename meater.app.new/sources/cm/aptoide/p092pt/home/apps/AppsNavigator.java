package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.home.AptoideBottomNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.view.settings.MyAccountFragment;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class AppsNavigator {
    private final AppNavigator appNavigator;
    private final AptoideBottomNavigator aptoideBottomNavigator;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final FragmentNavigator fragmentNavigator;

    public AppsNavigator(FragmentNavigator fragmentNavigator, AptoideBottomNavigator aptoideBottomNavigator, BottomNavigationMapper bottomNavigationMapper, AppNavigator appNavigator) {
        this.fragmentNavigator = fragmentNavigator;
        this.aptoideBottomNavigator = aptoideBottomNavigator;
        this.bottomNavigationMapper = bottomNavigationMapper;
        this.appNavigator = appNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bottomNavigation$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m7974a(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.APPS));
    }

    public C11234e<Integer> bottomNavigation() {
        return this.aptoideBottomNavigator.navigationEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.apps.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f9464f.m7974a((Integer) obj);
            }
        });
    }

    public void navigateToAppView(long j2, String str) {
        this.appNavigator.navigateWithAppId(j2, str, AppViewFragment.OpenType.OPEN_ONLY, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void navigateToMyAccount() {
        this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
    }

    public void navigateToAppView(String str) {
        this.appNavigator.navigateWithMd5(str);
    }
}
