package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public class SupportErrorDialogFragment extends DialogInterfaceOnCancelListenerC0466c {

    /* renamed from: f */
    private Dialog f17230f = null;

    /* renamed from: g */
    private DialogInterface.OnCancelListener f17231g = null;

    /* renamed from: d */
    public static SupportErrorDialogFragment m13837d(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.m14373l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.f17230f = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f17231g = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f17231g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f17230f == null) {
            setShowsDialog(false);
        }
        return this.f17230f;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
