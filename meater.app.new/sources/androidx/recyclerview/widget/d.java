package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    final b f28826a;

    /* renamed from: e, reason: collision with root package name */
    private View f28830e;

    /* renamed from: d, reason: collision with root package name */
    private int f28829d = 0;

    /* renamed from: b, reason: collision with root package name */
    final a f28827b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f28828c = new ArrayList();

    /* compiled from: ChildHelper.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f28831a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f28832b;

        a() {
        }

        private void c() {
            if (this.f28832b == null) {
                this.f28832b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f28831a &= ~(1 << i10);
                return;
            }
            a aVar = this.f28832b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f28832b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f28831a) : Long.bitCount(this.f28831a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f28831a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f28831a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f28831a & (1 << i10)) != 0;
            }
            c();
            return this.f28832b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f28832b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f28831a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f28831a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f28832b != null) {
                c();
                this.f28832b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f28832b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f28831a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f28831a = j12;
            long j13 = j10 - 1;
            this.f28831a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f28832b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f28832b.f(0);
            }
            return z10;
        }

        void g() {
            this.f28831a = 0L;
            a aVar = this.f28832b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f28831a |= 1 << i10;
            } else {
                c();
                this.f28832b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f28832b == null) {
                return Long.toBinaryString(this.f28831a);
            }
            return this.f28832b.toString() + "xx" + Long.toBinaryString(this.f28831a);
        }
    }

    /* compiled from: ChildHelper.java */
    interface b {
        View a(int i10);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.G f(View view);

        void g(int i10);

        void h(View view);

        void i(View view, int i10);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    d(b bVar) {
        this.f28826a = bVar;
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f28826a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f28827b.b(i11));
            if (iB == 0) {
                while (this.f28827b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f28828c.add(view);
        this.f28826a.b(view);
    }

    private boolean t(View view) {
        if (!this.f28828c.remove(view)) {
            return false;
        }
        this.f28826a.h(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f28826a.c() : h(i10);
        this.f28827b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f28826a.i(view, iC);
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f28826a.c() : h(i10);
        this.f28827b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f28826a.k(view, iC, layoutParams);
    }

    void d(int i10) {
        int iH = h(i10);
        this.f28827b.f(iH);
        this.f28826a.g(iH);
    }

    View e(int i10) {
        int size = this.f28828c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f28828c.get(i11);
            RecyclerView.G gF = this.f28826a.f(view);
            if (gF.getLayoutPosition() == i10 && !gF.isInvalid() && !gF.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    View f(int i10) {
        return this.f28826a.a(h(i10));
    }

    int g() {
        return this.f28826a.c() - this.f28828c.size();
    }

    View i(int i10) {
        return this.f28826a.a(i10);
    }

    int j() {
        return this.f28826a.c();
    }

    void k(View view) {
        int iE = this.f28826a.e(view);
        if (iE >= 0) {
            this.f28827b.h(iE);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iE = this.f28826a.e(view);
        if (iE == -1 || this.f28827b.d(iE)) {
            return -1;
        }
        return iE - this.f28827b.b(iE);
    }

    boolean n(View view) {
        return this.f28828c.contains(view);
    }

    void o() {
        this.f28827b.g();
        for (int size = this.f28828c.size() - 1; size >= 0; size--) {
            this.f28826a.h(this.f28828c.get(size));
            this.f28828c.remove(size);
        }
        this.f28826a.d();
    }

    void p(View view) {
        int i10 = this.f28829d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f28829d = 1;
            this.f28830e = view;
            int iE = this.f28826a.e(view);
            if (iE < 0) {
                this.f28829d = 0;
                this.f28830e = null;
                return;
            }
            if (this.f28827b.f(iE)) {
                t(view);
            }
            this.f28826a.j(iE);
            this.f28829d = 0;
            this.f28830e = null;
        } catch (Throwable th) {
            this.f28829d = 0;
            this.f28830e = null;
            throw th;
        }
    }

    void q(int i10) {
        int i11 = this.f28829d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i10);
            View viewA = this.f28826a.a(iH);
            if (viewA == null) {
                this.f28829d = 0;
                this.f28830e = null;
                return;
            }
            this.f28829d = 1;
            this.f28830e = viewA;
            if (this.f28827b.f(iH)) {
                t(viewA);
            }
            this.f28826a.j(iH);
            this.f28829d = 0;
            this.f28830e = null;
        } catch (Throwable th) {
            this.f28829d = 0;
            this.f28830e = null;
            throw th;
        }
    }

    boolean r(View view) {
        int i10 = this.f28829d;
        if (i10 == 1) {
            if (this.f28830e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f28829d = 2;
            int iE = this.f28826a.e(view);
            if (iE == -1) {
                t(view);
                return true;
            }
            if (!this.f28827b.d(iE)) {
                return false;
            }
            this.f28827b.f(iE);
            t(view);
            this.f28826a.j(iE);
            return true;
        } finally {
            this.f28829d = 0;
        }
    }

    void s(View view) {
        int iE = this.f28826a.e(view);
        if (iE < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f28827b.d(iE)) {
            this.f28827b.a(iE);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f28827b.toString() + ", hidden list:" + this.f28828c.size();
    }
}
