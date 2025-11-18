package cm.aptoide.p092pt.promotions;

import android.content.Intent;
import android.net.Uri;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;

/* loaded from: classes.dex */
public class ClaimPromotionsNavigator {
    private final ActivityResultNavigator activityResultNavigator;
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;

    public ClaimPromotionsNavigator(FragmentNavigator fragmentNavigator, ActivityResultNavigator activityResultNavigator, AppNavigator appNavigator) {
        this.fragmentNavigator = fragmentNavigator;
        this.activityResultNavigator = activityResultNavigator;
        this.appNavigator = appNavigator;
    }

    public void fetchWalletAddressByIntent(String str, int i2, String str2, String str3) {
        this.activityResultNavigator.navigateForResult("android.intent.action.VIEW", Uri.parse(str), i2, str2, str3);
    }

    public void navigateToWalletAppView() {
        this.appNavigator.navigateWithPackageName(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME, AppViewFragment.OpenType.OPEN_AND_INSTALL);
    }

    public void popDialogWithResult(String str, int i2) {
        this.fragmentNavigator.popDialogWithResult(new Result(6666, i2, new Intent().setPackage(str)));
    }

    public void validateWallet(String str, int i2) {
        this.activityResultNavigator.navigateForResult("android.intent.action.VIEW", Uri.parse(str), i2);
    }
}
