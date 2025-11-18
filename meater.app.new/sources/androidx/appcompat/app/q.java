package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class q extends androidx.fragment.app.n {
    @Override // androidx.fragment.app.n
    public Dialog F2(Bundle bundle) {
        return new p(Z(), E2());
    }

    @Override // androidx.fragment.app.n
    public void M2(Dialog dialog, int i10) {
        if (!(dialog instanceof p)) {
            super.M2(dialog, i10);
            return;
        }
        p pVar = (p) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        pVar.l(1);
    }
}
