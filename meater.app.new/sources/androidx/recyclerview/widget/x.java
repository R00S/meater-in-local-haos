package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    final b f29031a;

    /* renamed from: b, reason: collision with root package name */
    a f29032b = new a();

    /* compiled from: ViewBoundsCheck.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f29033a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f29034b;

        /* renamed from: c, reason: collision with root package name */
        int f29035c;

        /* renamed from: d, reason: collision with root package name */
        int f29036d;

        /* renamed from: e, reason: collision with root package name */
        int f29037e;

        a() {
        }

        void a(int i10) {
            this.f29033a = i10 | this.f29033a;
        }

        boolean b() {
            int i10 = this.f29033a;
            if ((i10 & 7) != 0 && (i10 & c(this.f29036d, this.f29034b)) == 0) {
                return false;
            }
            int i11 = this.f29033a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f29036d, this.f29035c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f29033a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f29037e, this.f29034b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f29033a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f29037e, this.f29035c) << 12)) != 0;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f29033a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f29034b = i10;
            this.f29035c = i11;
            this.f29036d = i12;
            this.f29037e = i13;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    x(b bVar) {
        this.f29031a = bVar;
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f29031a.c();
        int iD = this.f29031a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f29031a.a(i10);
            this.f29032b.e(iC, iD, this.f29031a.b(viewA), this.f29031a.e(viewA));
            if (i12 != 0) {
                this.f29032b.d();
                this.f29032b.a(i12);
                if (this.f29032b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f29032b.d();
                this.f29032b.a(i13);
                if (this.f29032b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f29032b.e(this.f29031a.c(), this.f29031a.d(), this.f29031a.b(view), this.f29031a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f29032b.d();
        this.f29032b.a(i10);
        return this.f29032b.b();
    }
}
