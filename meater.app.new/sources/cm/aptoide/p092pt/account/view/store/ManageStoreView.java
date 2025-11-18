package cm.aptoide.p092pt.account.view.store;

import cm.aptoide.p092pt.account.view.ImagePickerView;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface ManageStoreView extends ImagePickerView {
    C11234e<ManageStoreViewModel> cancelClick();

    void dismissWaitProgressBar();

    void loadImageStateless(String str);

    C11234e<ManageStoreViewModel> saveDataClick();

    void showError(String str);

    void showSuccessMessage();

    void showWaitProgressBar();
}
