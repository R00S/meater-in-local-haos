package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.q f29008a;

    /* renamed from: b, reason: collision with root package name */
    private int f29009b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f29010c;

    /* compiled from: OrientationHelper.java */
    class a extends q {
        a(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.q
        public int d(View view) {
            return this.f29008a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f29008a.X(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f29008a.W(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int g(View view) {
            return this.f29008a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int h() {
            return this.f29008a.s0();
        }

        @Override // androidx.recyclerview.widget.q
        public int i() {
            return this.f29008a.s0() - this.f29008a.j0();
        }

        @Override // androidx.recyclerview.widget.q
        public int j() {
            return this.f29008a.j0();
        }

        @Override // androidx.recyclerview.widget.q
        public int k() {
            return this.f29008a.t0();
        }

        @Override // androidx.recyclerview.widget.q
        public int l() {
            return this.f29008a.c0();
        }

        @Override // androidx.recyclerview.widget.q
        public int m() {
            return this.f29008a.i0();
        }

        @Override // androidx.recyclerview.widget.q
        public int n() {
            return (this.f29008a.s0() - this.f29008a.i0()) - this.f29008a.j0();
        }

        @Override // androidx.recyclerview.widget.q
        public int p(View view) {
            this.f29008a.r0(view, true, this.f29010c);
            return this.f29010c.right;
        }

        @Override // androidx.recyclerview.widget.q
        public int q(View view) {
            this.f29008a.r0(view, true, this.f29010c);
            return this.f29010c.left;
        }

        @Override // androidx.recyclerview.widget.q
        public void r(int i10) {
            this.f29008a.H0(i10);
        }
    }

    /* compiled from: OrientationHelper.java */
    class b extends q {
        b(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.q
        public int d(View view) {
            return this.f29008a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f29008a.W(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f29008a.X(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int g(View view) {
            return this.f29008a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.q
        public int h() {
            return this.f29008a.b0();
        }

        @Override // androidx.recyclerview.widget.q
        public int i() {
            return this.f29008a.b0() - this.f29008a.h0();
        }

        @Override // androidx.recyclerview.widget.q
        public int j() {
            return this.f29008a.h0();
        }

        @Override // androidx.recyclerview.widget.q
        public int k() {
            return this.f29008a.c0();
        }

        @Override // androidx.recyclerview.widget.q
        public int l() {
            return this.f29008a.t0();
        }

        @Override // androidx.recyclerview.widget.q
        public int m() {
            return this.f29008a.k0();
        }

        @Override // androidx.recyclerview.widget.q
        public int n() {
            return (this.f29008a.b0() - this.f29008a.k0()) - this.f29008a.h0();
        }

        @Override // androidx.recyclerview.widget.q
        public int p(View view) {
            this.f29008a.r0(view, true, this.f29010c);
            return this.f29010c.bottom;
        }

        @Override // androidx.recyclerview.widget.q
        public int q(View view) {
            this.f29008a.r0(view, true, this.f29010c);
            return this.f29010c.top;
        }

        @Override // androidx.recyclerview.widget.q
        public void r(int i10) {
            this.f29008a.I0(i10);
        }
    }

    /* synthetic */ q(RecyclerView.q qVar, a aVar) {
        this(qVar);
    }

    public static q a(RecyclerView.q qVar) {
        return new a(qVar);
    }

    public static q b(RecyclerView.q qVar, int i10) {
        if (i10 == 0) {
            return a(qVar);
        }
        if (i10 == 1) {
            return c(qVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static q c(RecyclerView.q qVar) {
        return new b(qVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f29009b) {
            return 0;
        }
        return n() - this.f29009b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f29009b = n();
    }

    private q(RecyclerView.q qVar) {
        this.f29009b = Integer.MIN_VALUE;
        this.f29010c = new Rect();
        this.f29008a = qVar;
    }
}
