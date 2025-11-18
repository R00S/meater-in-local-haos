package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.p092pt.account.view.ImagePickerView;
import cm.aptoide.p092pt.account.view.user.ManageUserFragment;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface ManageUserView extends ImagePickerView {
    C11234e<Void> cancelButtonClick();

    void hideProgressDialog();

    void loadImageStateless(String str);

    C11234e<ManageUserFragment.ViewModel> saveUserDataButtonClick();

    void setUserName(String str);

    C11231b showErrorMessage(String str);

    void showProgressDialog();
}
