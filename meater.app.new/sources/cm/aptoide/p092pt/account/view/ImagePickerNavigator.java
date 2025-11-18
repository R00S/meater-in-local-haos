package cm.aptoide.p092pt.account.view;

import android.net.Uri;
import android.provider.MediaStore;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import cm.aptoide.p092pt.navigator.Result;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ImagePickerNavigator {
    private final ActivityNavigator activityNavigator;

    public ImagePickerNavigator(ActivityNavigator activityNavigator) {
        this.activityNavigator = activityNavigator;
    }

    static /* synthetic */ Void lambda$navigateToCameraWithImageUri$3(Result result) {
        return null;
    }

    public C11234e<Void> navigateToCameraWithImageUri(int i2, Uri uri) {
        return this.activityNavigator.navigateForResultWithOutput("android.media.action.IMAGE_CAPTURE", uri, i2).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Result) obj).getResultCode() == -1);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                ImagePickerNavigator.lambda$navigateToCameraWithImageUri$3((Result) obj);
                return null;
            }
        });
    }

    public C11234e<String> navigateToGalleryForImageUri(int i2) {
        return this.activityNavigator.navigateForResult("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI, i2).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Result) obj).getResultCode() == -1);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((Result) obj).getData().getData().toString();
            }
        });
    }
}
