package cm.aptoide.p092pt.store.view.p104my;

import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.home.AptoideBottomNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.view.settings.MyAccountFragment;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class MyStoresNavigator {
    private final AptoideBottomNavigator aptoideBottomNavigator;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final FragmentNavigator fragmentNavigator;

    public MyStoresNavigator(FragmentNavigator fragmentNavigator, AptoideBottomNavigator aptoideBottomNavigator, BottomNavigationMapper bottomNavigationMapper) {
        this.fragmentNavigator = fragmentNavigator;
        this.aptoideBottomNavigator = aptoideBottomNavigator;
        this.bottomNavigationMapper = bottomNavigationMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bottomNavigationEvent$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8833a(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.STORES));
    }

    public C11234e<Integer> bottomNavigationEvent() {
        return this.aptoideBottomNavigator.navigationEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.my.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11376f.m8833a((Integer) obj);
            }
        });
    }

    public void navigateToMyAccount() {
        this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
    }
}
