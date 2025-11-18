package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper.java */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes.dex */
class C0623d {

    /* renamed from: a */
    final b f4082a;

    /* renamed from: b */
    final a f4083b = new a();

    /* renamed from: c */
    final List<View> f4084c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.d$a */
    static class a {

        /* renamed from: a */
        long f4085a = 0;

        /* renamed from: b */
        a f4086b;

        a() {
        }

        /* renamed from: c */
        private void m4461c() {
            if (this.f4086b == null) {
                this.f4086b = new a();
            }
        }

        /* renamed from: a */
        void m4462a(int i2) {
            if (i2 < 64) {
                this.f4085a &= (1 << i2) ^ (-1);
                return;
            }
            a aVar = this.f4086b;
            if (aVar != null) {
                aVar.m4462a(i2 - 64);
            }
        }

        /* renamed from: b */
        int m4463b(int i2) {
            a aVar = this.f4086b;
            return aVar == null ? i2 >= 64 ? Long.bitCount(this.f4085a) : Long.bitCount(this.f4085a & ((1 << i2) - 1)) : i2 < 64 ? Long.bitCount(this.f4085a & ((1 << i2) - 1)) : aVar.m4463b(i2 - 64) + Long.bitCount(this.f4085a);
        }

        /* renamed from: d */
        boolean m4464d(int i2) {
            if (i2 < 64) {
                return (this.f4085a & (1 << i2)) != 0;
            }
            m4461c();
            return this.f4086b.m4464d(i2 - 64);
        }

        /* renamed from: e */
        void m4465e(int i2, boolean z) {
            if (i2 >= 64) {
                m4461c();
                this.f4086b.m4465e(i2 - 64, z);
                return;
            }
            long j2 = this.f4085a;
            boolean z2 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.f4085a = ((j2 & (j3 ^ (-1))) << 1) | (j2 & j3);
            if (z) {
                m4468h(i2);
            } else {
                m4462a(i2);
            }
            if (z2 || this.f4086b != null) {
                m4461c();
                this.f4086b.m4465e(0, z2);
            }
        }

        /* renamed from: f */
        boolean m4466f(int i2) {
            if (i2 >= 64) {
                m4461c();
                return this.f4086b.m4466f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f4085a;
            boolean z = (j3 & j2) != 0;
            long j4 = j3 & (j2 ^ (-1));
            this.f4085a = j4;
            long j5 = j2 - 1;
            this.f4085a = (j4 & j5) | Long.rotateRight((j5 ^ (-1)) & j4, 1);
            a aVar = this.f4086b;
            if (aVar != null) {
                if (aVar.m4464d(0)) {
                    m4468h(63);
                }
                this.f4086b.m4466f(0);
            }
            return z;
        }

        /* renamed from: g */
        void m4467g() {
            this.f4085a = 0L;
            a aVar = this.f4086b;
            if (aVar != null) {
                aVar.m4467g();
            }
        }

        /* renamed from: h */
        void m4468h(int i2) {
            if (i2 < 64) {
                this.f4085a |= 1 << i2;
            } else {
                m4461c();
                this.f4086b.m4468h(i2 - 64);
            }
        }

        public String toString() {
            if (this.f4086b == null) {
                return Long.toBinaryString(this.f4085a);
            }
            return this.f4086b.toString() + "xx" + Long.toBinaryString(this.f4085a);
        }
    }

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.d$b */
    interface b {
        /* renamed from: a */
        View mo4199a(int i2);

        /* renamed from: b */
        void mo4200b(View view);

        /* renamed from: c */
        int mo4201c();

        /* renamed from: d */
        void mo4202d();

        /* renamed from: e */
        int mo4203e(View view);

        /* renamed from: f */
        RecyclerView.AbstractC0590c0 mo4204f(View view);

        /* renamed from: g */
        void mo4205g(int i2);

        /* renamed from: h */
        void mo4206h(View view);

        /* renamed from: i */
        void mo4207i(View view, int i2);

        /* renamed from: j */
        void mo4208j(int i2);

        /* renamed from: k */
        void mo4209k(View view, int i2, ViewGroup.LayoutParams layoutParams);
    }

    C0623d(b bVar) {
        this.f4082a = bVar;
    }

    /* renamed from: h */
    private int m4441h(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int iMo4201c = this.f4082a.mo4201c();
        int i3 = i2;
        while (i3 < iMo4201c) {
            int iM4463b = i2 - (i3 - this.f4083b.m4463b(i3));
            if (iM4463b == 0) {
                while (this.f4083b.m4464d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iM4463b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m4442l(View view) {
        this.f4084c.add(view);
        this.f4082a.mo4200b(view);
    }

    /* renamed from: t */
    private boolean m4443t(View view) {
        if (!this.f4084c.remove(view)) {
            return false;
        }
        this.f4082a.mo4206h(view);
        return true;
    }

    /* renamed from: a */
    void m4444a(View view, int i2, boolean z) {
        int iMo4201c = i2 < 0 ? this.f4082a.mo4201c() : m4441h(i2);
        this.f4083b.m4465e(iMo4201c, z);
        if (z) {
            m4442l(view);
        }
        this.f4082a.mo4207i(view, iMo4201c);
    }

    /* renamed from: b */
    void m4445b(View view, boolean z) {
        m4444a(view, -1, z);
    }

    /* renamed from: c */
    void m4446c(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iMo4201c = i2 < 0 ? this.f4082a.mo4201c() : m4441h(i2);
        this.f4083b.m4465e(iMo4201c, z);
        if (z) {
            m4442l(view);
        }
        this.f4082a.mo4209k(view, iMo4201c, layoutParams);
    }

    /* renamed from: d */
    void m4447d(int i2) {
        int iM4441h = m4441h(i2);
        this.f4083b.m4466f(iM4441h);
        this.f4082a.mo4205g(iM4441h);
    }

    /* renamed from: e */
    View m4448e(int i2) {
        int size = this.f4084c.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f4084c.get(i3);
            RecyclerView.AbstractC0590c0 abstractC0590c0Mo4204f = this.f4082a.mo4204f(view);
            if (abstractC0590c0Mo4204f.getLayoutPosition() == i2 && !abstractC0590c0Mo4204f.isInvalid() && !abstractC0590c0Mo4204f.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    View m4449f(int i2) {
        return this.f4082a.mo4199a(m4441h(i2));
    }

    /* renamed from: g */
    int m4450g() {
        return this.f4082a.mo4201c() - this.f4084c.size();
    }

    /* renamed from: i */
    View m4451i(int i2) {
        return this.f4082a.mo4199a(i2);
    }

    /* renamed from: j */
    int m4452j() {
        return this.f4082a.mo4201c();
    }

    /* renamed from: k */
    void m4453k(View view) {
        int iMo4203e = this.f4082a.mo4203e(view);
        if (iMo4203e >= 0) {
            this.f4083b.m4468h(iMo4203e);
            m4442l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: m */
    int m4454m(View view) {
        int iMo4203e = this.f4082a.mo4203e(view);
        if (iMo4203e == -1 || this.f4083b.m4464d(iMo4203e)) {
            return -1;
        }
        return iMo4203e - this.f4083b.m4463b(iMo4203e);
    }

    /* renamed from: n */
    boolean m4455n(View view) {
        return this.f4084c.contains(view);
    }

    /* renamed from: o */
    void m4456o() {
        this.f4083b.m4467g();
        for (int size = this.f4084c.size() - 1; size >= 0; size--) {
            this.f4082a.mo4206h(this.f4084c.get(size));
            this.f4084c.remove(size);
        }
        this.f4082a.mo4202d();
    }

    /* renamed from: p */
    void m4457p(View view) {
        int iMo4203e = this.f4082a.mo4203e(view);
        if (iMo4203e < 0) {
            return;
        }
        if (this.f4083b.m4466f(iMo4203e)) {
            m4443t(view);
        }
        this.f4082a.mo4208j(iMo4203e);
    }

    /* renamed from: q */
    void m4458q(int i2) {
        int iM4441h = m4441h(i2);
        View viewMo4199a = this.f4082a.mo4199a(iM4441h);
        if (viewMo4199a == null) {
            return;
        }
        if (this.f4083b.m4466f(iM4441h)) {
            m4443t(viewMo4199a);
        }
        this.f4082a.mo4208j(iM4441h);
    }

    /* renamed from: r */
    boolean m4459r(View view) {
        int iMo4203e = this.f4082a.mo4203e(view);
        if (iMo4203e == -1) {
            m4443t(view);
            return true;
        }
        if (!this.f4083b.m4464d(iMo4203e)) {
            return false;
        }
        this.f4083b.m4466f(iMo4203e);
        m4443t(view);
        this.f4082a.mo4208j(iMo4203e);
        return true;
    }

    /* renamed from: s */
    void m4460s(View view) {
        int iMo4203e = this.f4082a.mo4203e(view);
        if (iMo4203e < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f4083b.m4464d(iMo4203e)) {
            this.f4083b.m4462a(iMo4203e);
            m4443t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4083b.toString() + ", hidden list:" + this.f4084c.size();
    }
}
