package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;

/* compiled from: AppCompatDialogFragment.java */
/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes.dex */
public class C0072i extends DialogInterfaceOnCancelListenerC0466c {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC0071h(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public void setupDialog(Dialog dialog, int i2) {
        if (!(dialog instanceof DialogC0071h)) {
            super.setupDialog(dialog, i2);
            return;
        }
        DialogC0071h dialogC0071h = (DialogC0071h) dialog;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC0071h.m390d(1);
    }
}
