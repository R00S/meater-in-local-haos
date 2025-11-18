package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: classes.dex */
class C0638s {

    /* renamed from: a */
    final b f4217a;

    /* renamed from: b */
    a f4218b = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* renamed from: androidx.recyclerview.widget.s$a */
    static class a {

        /* renamed from: a */
        int f4219a = 0;

        /* renamed from: b */
        int f4220b;

        /* renamed from: c */
        int f4221c;

        /* renamed from: d */
        int f4222d;

        /* renamed from: e */
        int f4223e;

        a() {
        }

        /* renamed from: a */
        void m4557a(int i2) {
            this.f4219a = i2 | this.f4219a;
        }

        /* renamed from: b */
        boolean m4558b() {
            int i2 = this.f4219a;
            if ((i2 & 7) != 0 && (i2 & (m4559c(this.f4222d, this.f4220b) << 0)) == 0) {
                return false;
            }
            int i3 = this.f4219a;
            if ((i3 & 112) != 0 && (i3 & (m4559c(this.f4222d, this.f4221c) << 4)) == 0) {
                return false;
            }
            int i4 = this.f4219a;
            if ((i4 & 1792) != 0 && (i4 & (m4559c(this.f4223e, this.f4220b) << 8)) == 0) {
                return false;
            }
            int i5 = this.f4219a;
            return (i5 & 28672) == 0 || (i5 & (m4559c(this.f4223e, this.f4221c) << 12)) != 0;
        }

        /* renamed from: c */
        int m4559c(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        /* renamed from: d */
        void m4560d() {
            this.f4219a = 0;
        }

        /* renamed from: e */
        void m4561e(int i2, int i3, int i4, int i5) {
            this.f4220b = i2;
            this.f4221c = i3;
            this.f4222d = i4;
            this.f4223e = i5;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* renamed from: androidx.recyclerview.widget.s$b */
    interface b {
        /* renamed from: a */
        View mo4232a(int i2);

        /* renamed from: b */
        int mo4233b(View view);

        /* renamed from: c */
        int mo4234c();

        /* renamed from: d */
        int mo4235d();

        /* renamed from: e */
        int mo4236e(View view);
    }

    C0638s(b bVar) {
        this.f4217a = bVar;
    }

    /* renamed from: a */
    View m4555a(int i2, int i3, int i4, int i5) {
        int iMo4234c = this.f4217a.mo4234c();
        int iMo4235d = this.f4217a.mo4235d();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View viewMo4232a = this.f4217a.mo4232a(i2);
            this.f4218b.m4561e(iMo4234c, iMo4235d, this.f4217a.mo4233b(viewMo4232a), this.f4217a.mo4236e(viewMo4232a));
            if (i4 != 0) {
                this.f4218b.m4560d();
                this.f4218b.m4557a(i4);
                if (this.f4218b.m4558b()) {
                    return viewMo4232a;
                }
            }
            if (i5 != 0) {
                this.f4218b.m4560d();
                this.f4218b.m4557a(i5);
                if (this.f4218b.m4558b()) {
                    view = viewMo4232a;
                }
            }
            i2 += i6;
        }
        return view;
    }

    /* renamed from: b */
    boolean m4556b(View view, int i2) {
        this.f4218b.m4561e(this.f4217a.mo4234c(), this.f4217a.mo4235d(), this.f4217a.mo4233b(view), this.f4217a.mo4236e(view));
        if (i2 == 0) {
            return false;
        }
        this.f4218b.m4560d();
        this.f4218b.m4557a(i2);
        return this.f4218b.m4558b();
    }
}
