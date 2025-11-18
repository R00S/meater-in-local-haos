package cm.aptoide.p092pt.promotions;

import android.text.Editable;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.presenter.View;
import p241e.p294g.p295a.p305d.C8982b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface ClaimPromotionDialogView extends View {
    C11234e<ClaimPromotionsClickWrapper> continueWalletClick();

    void dismissDialog();

    C11234e<Void> dismissGenericErrorClick();

    C11234e<ClaimDialogResultWrapper> dismissGenericMessage();

    C11234e<C8982b> editTextChanges();

    void fetchWalletAddressByClipboard();

    void fetchWalletAddressByIntent();

    C11234e<Result> getActivityResults();

    C11234e<String> getWalletClick();

    void handleEmptyEditText(Editable editable);

    C11234e<Void> onCancelWalletUpdate();

    C11234e<Void> onUpdateWalletClick();

    void sendWalletIntent();

    void showCanceledVerificationError();

    void showClaimSuccess();

    void showGenericError();

    void showInvalidWalletAddress();

    void showLoading();

    void showPromotionAlreadyClaimed();

    void showUpdateWalletDialog();

    void updateWalletText(String str);

    void verifyWallet();

    C11234e<String> walletCancelClick();
}
