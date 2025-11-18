package cm.aptoide.p092pt.view;

import cm.aptoide.p092pt.FlavourFragmentModule;
import cm.aptoide.p092pt.analytics.view.AnalyticsActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.view.dialog.DialogUtils;
import cm.aptoide.p092pt.view.fragment.BaseBottomSheetDialogFragment;
import cm.aptoide.p092pt.view.fragment.BaseDialogFragment;
import cm.aptoide.p092pt.view.settings.SettingsFragment;
import cm.aptoide.p092pt.wallet.WalletInstallActivity;

@ActivityScope
/* loaded from: classes.dex */
public interface ActivityComponent {
    void inject(AnalyticsActivity analyticsActivity);

    void inject(BottomNavigationActivity bottomNavigationActivity);

    void inject(ActivityResultNavigator activityResultNavigator);

    void inject(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment);

    void inject(BaseActivity baseActivity);

    void inject(MainActivity mainActivity);

    void inject(ThemedActivityView themedActivityView);

    void inject(DialogUtils dialogUtils);

    void inject(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment);

    void inject(BaseDialogFragment baseDialogFragment);

    void inject(SettingsFragment settingsFragment);

    void inject(WalletInstallActivity walletInstallActivity);

    FragmentComponent plus(FragmentModule fragmentModule, FlavourFragmentModule flavourFragmentModule);
}
