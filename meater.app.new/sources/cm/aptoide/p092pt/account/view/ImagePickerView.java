package cm.aptoide.p092pt.account.view;

import android.content.DialogInterface;
import cm.aptoide.p092pt.account.view.exception.InvalidImageException;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface ImagePickerView extends View {
    C11234e<DialogInterface> dialogCameraSelected();

    C11234e<DialogInterface> dialogGallerySelected();

    void dismissLoadImageDialog();

    void loadImage(String str);

    C11234e<Void> selectStoreImageClick();

    void showIconPropertiesError(InvalidImageException invalidImageException);

    void showImagePickerDialog();
}
