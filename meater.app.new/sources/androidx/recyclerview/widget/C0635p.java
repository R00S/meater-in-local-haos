package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes.dex */
class C0635p {
    /* renamed from: a */
    static int m4552a(RecyclerView.C0613z c0613z, AbstractC0633n abstractC0633n, View view, View view2, RecyclerView.AbstractC0602o abstractC0602o, boolean z) {
        if (abstractC0602o.getChildCount() == 0 || c0613z.m4306b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC0602o.getPosition(view) - abstractC0602o.getPosition(view2)) + 1;
        }
        return Math.min(abstractC0633n.mo4543n(), abstractC0633n.mo4533d(view2) - abstractC0633n.mo4536g(view));
    }

    /* renamed from: b */
    static int m4553b(RecyclerView.C0613z c0613z, AbstractC0633n abstractC0633n, View view, View view2, RecyclerView.AbstractC0602o abstractC0602o, boolean z, boolean z2) {
        if (abstractC0602o.getChildCount() == 0 || c0613z.m4306b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c0613z.m4306b() - Math.max(abstractC0602o.getPosition(view), abstractC0602o.getPosition(view2))) - 1) : Math.max(0, Math.min(abstractC0602o.getPosition(view), abstractC0602o.getPosition(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0633n.mo4533d(view2) - abstractC0633n.mo4536g(view)) / (Math.abs(abstractC0602o.getPosition(view) - abstractC0602o.getPosition(view2)) + 1))) + (abstractC0633n.mo4542m() - abstractC0633n.mo4536g(view)));
        }
        return iMax;
    }

    /* renamed from: c */
    static int m4554c(RecyclerView.C0613z c0613z, AbstractC0633n abstractC0633n, View view, View view2, RecyclerView.AbstractC0602o abstractC0602o, boolean z) {
        if (abstractC0602o.getChildCount() == 0 || c0613z.m4306b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0613z.m4306b();
        }
        return (int) (((abstractC0633n.mo4533d(view2) - abstractC0633n.mo4536g(view)) / (Math.abs(abstractC0602o.getPosition(view) - abstractC0602o.getPosition(view2)) + 1)) * c0613z.m4306b());
    }
}
