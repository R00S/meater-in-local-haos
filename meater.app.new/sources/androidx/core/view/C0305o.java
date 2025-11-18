package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* renamed from: androidx.core.view.o */
/* loaded from: classes.dex */
public class C0305o {

    /* renamed from: a */
    private int f2397a;

    /* renamed from: b */
    private int f2398b;

    public C0305o(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m2075a() {
        return this.f2397a | this.f2398b;
    }

    /* renamed from: b */
    public void m2076b(View view, View view2, int i2) {
        m2077c(view, view2, i2, 0);
    }

    /* renamed from: c */
    public void m2077c(View view, View view2, int i2, int i3) {
        if (i3 == 1) {
            this.f2398b = i2;
        } else {
            this.f2397a = i2;
        }
    }

    /* renamed from: d */
    public void m2078d(View view) {
        m2079e(view, 0);
    }

    /* renamed from: e */
    public void m2079e(View view, int i2) {
        if (i2 == 1) {
            this.f2398b = 0;
        } else {
            this.f2397a = 0;
        }
    }
}
