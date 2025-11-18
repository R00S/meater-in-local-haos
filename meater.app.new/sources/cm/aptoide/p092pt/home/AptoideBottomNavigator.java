package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface AptoideBottomNavigator {
    void hideBottomNavigation();

    C11234e<Integer> navigationEvent();

    void requestFocus(BottomNavigationItem bottomNavigationItem);

    void showFragment(Integer num);

    void toggleBottomNavigation();
}
