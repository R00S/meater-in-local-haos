package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
class t {
    static int a(RecyclerView.C c10, q qVar, View view, View view2, RecyclerView.q qVar2, boolean z10) {
        if (qVar2.O() == 0 || c10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(qVar2.l0(view) - qVar2.l0(view2)) + 1;
        }
        return Math.min(qVar.n(), qVar.d(view2) - qVar.g(view));
    }

    static int b(RecyclerView.C c10, q qVar, View view, View view2, RecyclerView.q qVar2, boolean z10, boolean z11) {
        if (qVar2.O() == 0 || c10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (c10.b() - Math.max(qVar2.l0(view), qVar2.l0(view2))) - 1) : Math.max(0, Math.min(qVar2.l0(view), qVar2.l0(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(qVar.d(view2) - qVar.g(view)) / (Math.abs(qVar2.l0(view) - qVar2.l0(view2)) + 1))) + (qVar.m() - qVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.C c10, q qVar, View view, View view2, RecyclerView.q qVar2, boolean z10) {
        if (qVar2.O() == 0 || c10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c10.b();
        }
        return (int) (((qVar.d(view2) - qVar.g(view)) / (Math.abs(qVar2.l0(view) - qVar2.l0(view2)) + 1)) * c10.b());
    }
}
