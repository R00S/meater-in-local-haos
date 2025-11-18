package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
class l {

    /* renamed from: b, reason: collision with root package name */
    int f28984b;

    /* renamed from: c, reason: collision with root package name */
    int f28985c;

    /* renamed from: d, reason: collision with root package name */
    int f28986d;

    /* renamed from: e, reason: collision with root package name */
    int f28987e;

    /* renamed from: h, reason: collision with root package name */
    boolean f28990h;

    /* renamed from: i, reason: collision with root package name */
    boolean f28991i;

    /* renamed from: a, reason: collision with root package name */
    boolean f28983a = true;

    /* renamed from: f, reason: collision with root package name */
    int f28988f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f28989g = 0;

    l() {
    }

    boolean a(RecyclerView.C c10) {
        int i10 = this.f28985c;
        return i10 >= 0 && i10 < c10.b();
    }

    View b(RecyclerView.x xVar) {
        View viewO = xVar.o(this.f28985c);
        this.f28985c += this.f28986d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f28984b + ", mCurrentPosition=" + this.f28985c + ", mItemDirection=" + this.f28986d + ", mLayoutDirection=" + this.f28987e + ", mStartLine=" + this.f28988f + ", mEndLine=" + this.f28989g + '}';
    }
}
