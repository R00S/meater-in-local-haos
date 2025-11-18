package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.p092pt.presenter.View;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
interface ProfileStepTwoView extends View {
    C11234e<Boolean> continueButtonClick();

    void dismissWaitDialog();

    C11234e<Boolean> makePrivateProfileButtonClick();

    C11231b showGenericErrorMessage();

    void showWaitDialog();
}
