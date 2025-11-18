package cm.aptoide.p092pt.promotions;

import android.os.Bundle;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceDialogFragment;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.home.HomeContainerFragment;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.navigator.Result;
import okhttp3.HttpUrl;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class PromotionsNavigator {
    static final int CLAIM_REQUEST_CODE = 6666;
    private final AppNavigator appNavigator;
    private final FragmentNavigator fragmentNavigator;

    public PromotionsNavigator(FragmentNavigator fragmentNavigator, AppNavigator appNavigator) {
        this.fragmentNavigator = fragmentNavigator;
        this.appNavigator = appNavigator;
    }

    static /* synthetic */ ClaimDialogResultWrapper lambda$claimDialogResults$0(Result result) {
        return new ClaimDialogResultWrapper(result.getData() != null ? result.getData().getPackage() : HttpUrl.FRAGMENT_ENCODE_SET, result.getResultCode() == -1);
    }

    static /* synthetic */ OutOfSpaceNavigatorWrapper lambda$outOfSpaceDialogResult$1(Result result) {
        return new OutOfSpaceNavigatorWrapper(result.getResultCode() == -1, result.getData() != null ? result.getData().getPackage() : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public C11234e<ClaimDialogResultWrapper> claimDialogResults() {
        return this.fragmentNavigator.results(CLAIM_REQUEST_CODE).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.t2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return PromotionsNavigator.lambda$claimDialogResults$0((Result) obj);
            }
        });
    }

    public void navigateToAppView(long j2, String str) {
        this.appNavigator.navigateWithAppId(j2, str, AppViewFragment.OpenType.OPEN_ONLY, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public void navigateToClaimDialog(String str, String str2) {
        ClaimPromotionDialogFragment claimPromotionDialogFragment = new ClaimPromotionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        bundle.putString("promotion_id", str2);
        claimPromotionDialogFragment.setArguments(bundle);
        this.fragmentNavigator.navigateToDialogForResult(claimPromotionDialogFragment, CLAIM_REQUEST_CODE);
    }

    public void navigateToHome() {
        this.fragmentNavigator.navigateToCleaningBackStack(new HomeContainerFragment(), true);
    }

    public void navigateToOutOfSpaceDialog(long j2, String str) {
        this.fragmentNavigator.navigateToDialogForResult(OutOfSpaceDialogFragment.INSTANCE.newInstance(j2, str), 1994);
    }

    public C11234e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        return this.fragmentNavigator.results(1994).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.promotions.u2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return PromotionsNavigator.lambda$outOfSpaceDialogResult$1((Result) obj);
            }
        });
    }
}
