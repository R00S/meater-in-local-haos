package cm.aptoide.p092pt.view.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ImagePickerDialog implements DialogInterface {
    public static final int LAYOUT = 2131492969;
    private final RxAlertDialog dialog;
    private View selectFromCamera;
    private View selectFromGallery;

    public static class Builder {
        private final RxAlertDialog.Builder builder;
        private int cameraButtonRes;
        private int galleryButtonRes;
        private final LayoutInflater layoutInflater;
        private int viewRes;

        public Builder(Context context, ThemeManager themeManager) {
            this.builder = new RxAlertDialog.Builder(context, themeManager);
            this.layoutInflater = LayoutInflater.from(context);
        }

        public ImagePickerDialog build() {
            int i2 = this.viewRes;
            if (i2 == 0 || this.cameraButtonRes == 0 || this.galleryButtonRes == 0) {
                throw new IllegalArgumentException("View and edit text resource ids must be provided");
            }
            View viewInflate = this.layoutInflater.inflate(i2, (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(this.cameraButtonRes);
            TextView textView2 = (TextView) viewInflate.findViewById(this.galleryButtonRes);
            this.builder.setView(viewInflate);
            return new ImagePickerDialog(this.builder.build(), textView, textView2);
        }

        public Builder setCameraButton(int i2) {
            this.cameraButtonRes = i2;
            return this;
        }

        public Builder setGalleryButton(int i2) {
            this.galleryButtonRes = i2;
            return this;
        }

        public Builder setNegativeButton(int i2) {
            this.builder.setNegativeButton(i2);
            return this;
        }

        public Builder setTitle(int i2) {
            this.builder.setTitle(i2);
            return this;
        }

        public Builder setViewRes(int i2) {
            this.viewRes = i2;
            return this;
        }
    }

    private /* synthetic */ DialogInterface lambda$cameraSelected$0(Void r1) {
        return this;
    }

    private /* synthetic */ DialogInterface lambda$gallerySelected$1(Void r1) {
        return this;
    }

    /* renamed from: a */
    public /* synthetic */ DialogInterface m8984a(Void r1) {
        lambda$cameraSelected$0(r1);
        return this;
    }

    /* renamed from: b */
    public /* synthetic */ DialogInterface m8985b(Void r1) {
        lambda$gallerySelected$1(r1);
        return this;
    }

    public C11234e<DialogInterface> cameraSelected() {
        return C8975a.m28573a(this.selectFromCamera).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.dialog.q
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                ImagePickerDialog imagePickerDialog = this.f11827f;
                imagePickerDialog.m8984a((Void) obj);
                return imagePickerDialog;
            }
        });
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        this.dialog.cancel();
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        this.dialog.dismiss();
    }

    public C11234e<DialogInterface> gallerySelected() {
        return C8975a.m28573a(this.selectFromGallery).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.view.dialog.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                ImagePickerDialog imagePickerDialog = this.f11826f;
                imagePickerDialog.m8985b((Void) obj);
                return imagePickerDialog;
            }
        });
    }

    public void show() {
        this.dialog.show();
    }

    private ImagePickerDialog(RxAlertDialog rxAlertDialog, TextView textView, TextView textView2) {
        this.dialog = rxAlertDialog;
        this.selectFromCamera = textView;
        this.selectFromGallery = textView2;
    }
}
