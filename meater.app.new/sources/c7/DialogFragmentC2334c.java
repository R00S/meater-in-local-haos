package c7;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: c7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class DialogFragmentC2334c extends DialogFragment {

    /* renamed from: B, reason: collision with root package name */
    private Dialog f31072B;

    /* renamed from: C, reason: collision with root package name */
    private DialogInterface.OnCancelListener f31073C;

    /* renamed from: D, reason: collision with root package name */
    private Dialog f31074D;

    public static DialogFragmentC2334c a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC2334c dialogFragmentC2334c = new DialogFragmentC2334c();
        Dialog dialog2 = (Dialog) C3445p.l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC2334c.f31072B = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC2334c.f31073C = onCancelListener;
        }
        return dialogFragmentC2334c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f31073C;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f31072B;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f31074D == null) {
            this.f31074D = new AlertDialog.Builder((Context) C3445p.k(getActivity())).create();
        }
        return this.f31074D;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
