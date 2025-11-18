package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState.java */
/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
class C0628i {

    /* renamed from: b */
    int f4198b;

    /* renamed from: c */
    int f4199c;

    /* renamed from: d */
    int f4200d;

    /* renamed from: e */
    int f4201e;

    /* renamed from: h */
    boolean f4204h;

    /* renamed from: i */
    boolean f4205i;

    /* renamed from: a */
    boolean f4197a = true;

    /* renamed from: f */
    int f4202f = 0;

    /* renamed from: g */
    int f4203g = 0;

    C0628i() {
    }

    /* renamed from: a */
    boolean m4522a(RecyclerView.C0613z c0613z) {
        int i2 = this.f4199c;
        return i2 >= 0 && i2 < c0613z.m4306b();
    }

    /* renamed from: b */
    View m4523b(RecyclerView.C0609v c0609v) {
        View viewM4288o = c0609v.m4288o(this.f4199c);
        this.f4199c += this.f4200d;
        return viewM4288o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4198b + ", mCurrentPosition=" + this.f4199c + ", mItemDirection=" + this.f4200d + ", mLayoutDirection=" + this.f4201e + ", mStartLine=" + this.f4202f + ", mEndLine=" + this.f4203g + '}';
    }
}
