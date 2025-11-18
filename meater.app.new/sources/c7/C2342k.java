package c7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: c7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2342k extends androidx.fragment.app.n {

    /* renamed from: W0, reason: collision with root package name */
    private Dialog f31094W0;

    /* renamed from: X0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f31095X0;

    /* renamed from: Y0, reason: collision with root package name */
    private Dialog f31096Y0;

    public static C2342k O2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C2342k c2342k = new C2342k();
        Dialog dialog2 = (Dialog) C3445p.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c2342k.f31094W0 = dialog2;
        if (onCancelListener != null) {
            c2342k.f31095X0 = onCancelListener;
        }
        return c2342k;
    }

    @Override // androidx.fragment.app.n
    public Dialog F2(Bundle bundle) {
        Dialog dialog = this.f31094W0;
        if (dialog != null) {
            return dialog;
        }
        L2(false);
        if (this.f31096Y0 == null) {
            this.f31096Y0 = new AlertDialog.Builder((Context) C3445p.k(Z())).create();
        }
        return this.f31096Y0;
    }

    @Override // androidx.fragment.app.n
    public void N2(androidx.fragment.app.v vVar, String str) {
        super.N2(vVar, str);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f31095X0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
