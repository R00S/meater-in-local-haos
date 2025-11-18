package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.q;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes2.dex */
public class b extends q {

    /* renamed from: W0, reason: collision with root package name */
    private boolean f36105W0;

    /* JADX INFO: Access modifiers changed from: private */
    public void P2() {
        if (this.f36105W0) {
            super.B2();
        } else {
            super.A2();
        }
    }

    private void Q2(BottomSheetBehavior<?> bottomSheetBehavior, boolean z10) {
        this.f36105W0 = z10;
        if (bottomSheetBehavior.u0() == 5) {
            P2();
            return;
        }
        if (D2() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) D2()).t();
        }
        bottomSheetBehavior.c0(new C0463b());
        bottomSheetBehavior.W0(5);
    }

    private boolean R2(boolean z10) {
        Dialog dialogD2 = D2();
        if (!(dialogD2 instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogD2;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorR = aVar.r();
        if (!bottomSheetBehaviorR.A0() || !aVar.s()) {
            return false;
        }
        Q2(bottomSheetBehaviorR, z10);
        return true;
    }

    @Override // androidx.fragment.app.n
    public void A2() {
        if (R2(false)) {
            return;
        }
        super.A2();
    }

    @Override // androidx.fragment.app.n
    public void B2() {
        if (R2(true)) {
            return;
        }
        super.B2();
    }

    @Override // androidx.appcompat.app.q, androidx.fragment.app.n
    public Dialog F2(Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(Z(), E2());
    }

    /* compiled from: BottomSheetDialogFragment.java */
    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    private class C0463b extends BottomSheetBehavior.g {
        private C0463b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (i10 == 5) {
                b.this.P2();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }
    }
}
