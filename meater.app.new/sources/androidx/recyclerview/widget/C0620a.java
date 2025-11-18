package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0632m;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p024c.p052i.p059j.C0957g;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: AdapterHelper.java */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
class C0620a implements C0632m.a {

    /* renamed from: a */
    private InterfaceC0956f<b> f4064a;

    /* renamed from: b */
    final ArrayList<b> f4065b;

    /* renamed from: c */
    final ArrayList<b> f4066c;

    /* renamed from: d */
    final a f4067d;

    /* renamed from: e */
    Runnable f4068e;

    /* renamed from: f */
    final boolean f4069f;

    /* renamed from: g */
    final C0632m f4070g;

    /* renamed from: h */
    private int f4071h;

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a */
    interface a {
        /* renamed from: a */
        void mo4210a(int i2, int i3);

        /* renamed from: b */
        void mo4211b(b bVar);

        /* renamed from: c */
        void mo4212c(int i2, int i3, Object obj);

        /* renamed from: d */
        void mo4213d(b bVar);

        /* renamed from: e */
        RecyclerView.AbstractC0590c0 mo4214e(int i2);

        /* renamed from: f */
        void mo4215f(int i2, int i3);

        /* renamed from: g */
        void mo4216g(int i2, int i3);

        /* renamed from: h */
        void mo4217h(int i2, int i3);
    }

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$b */
    static class b {

        /* renamed from: a */
        int f4072a;

        /* renamed from: b */
        int f4073b;

        /* renamed from: c */
        Object f4074c;

        /* renamed from: d */
        int f4075d;

        b(int i2, int i3, int i4, Object obj) {
            this.f4072a = i2;
            this.f4073b = i3;
            this.f4075d = i4;
            this.f4074c = obj;
        }

        /* renamed from: a */
        String m4435a() {
            int i2 = this.f4072a;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.f4072a;
            if (i2 != bVar.f4072a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f4075d - this.f4073b) == 1 && this.f4075d == bVar.f4073b && this.f4073b == bVar.f4075d) {
                return true;
            }
            if (this.f4075d != bVar.f4075d || this.f4073b != bVar.f4073b) {
                return false;
            }
            Object obj2 = this.f4074c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4074c)) {
                    return false;
                }
            } else if (bVar.f4074c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4072a * 31) + this.f4073b) * 31) + this.f4075d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m4435a() + ",s:" + this.f4073b + "c:" + this.f4075d + ",p:" + this.f4074c + "]";
        }
    }

    C0620a(a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m4409c(b bVar) {
        m4415v(bVar);
    }

    /* renamed from: d */
    private void m4410d(b bVar) {
        m4415v(bVar);
    }

    /* renamed from: f */
    private void m4411f(b bVar) {
        boolean z;
        char c2;
        int i2 = bVar.f4073b;
        int i3 = bVar.f4075d + i2;
        char c3 = 65535;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.f4067d.mo4214e(i4) != null || m4413h(i4)) {
                if (c3 == 0) {
                    m4414k(mo4418b(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    m4415v(mo4418b(2, i2, i5, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            c3 = c2;
        }
        if (i5 != bVar.f4075d) {
            mo4417a(bVar);
            bVar = mo4418b(2, i2, i5, null);
        }
        if (c3 == 0) {
            m4414k(bVar);
        } else {
            m4415v(bVar);
        }
    }

    /* renamed from: g */
    private void m4412g(b bVar) {
        int i2 = bVar.f4073b;
        int i3 = bVar.f4075d + i2;
        int i4 = i2;
        char c2 = 65535;
        int i5 = 0;
        while (i2 < i3) {
            if (this.f4067d.mo4214e(i2) != null || m4413h(i2)) {
                if (c2 == 0) {
                    m4414k(mo4418b(4, i4, i5, bVar.f4074c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    m4415v(mo4418b(4, i4, i5, bVar.f4074c));
                    i4 = i2;
                    i5 = 0;
                }
                c2 = 0;
            }
            i5++;
            i2++;
        }
        if (i5 != bVar.f4075d) {
            Object obj = bVar.f4074c;
            mo4417a(bVar);
            bVar = mo4418b(4, i4, i5, obj);
        }
        if (c2 == 0) {
            m4414k(bVar);
        } else {
            m4415v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m4413h(int i2) {
        int size = this.f4066c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f4066c.get(i3);
            int i4 = bVar.f4072a;
            if (i4 == 8) {
                if (m4424n(bVar.f4075d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f4073b;
                int i6 = bVar.f4075d + i5;
                while (i5 < i6) {
                    if (m4424n(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m4414k(b bVar) {
        int i2;
        int i3 = bVar.f4072a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM4416z = m4416z(bVar.f4073b, i3);
        int i4 = bVar.f4073b;
        int i5 = bVar.f4072a;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f4075d; i7++) {
            int iM4416z2 = m4416z(bVar.f4073b + (i2 * i7), bVar.f4072a);
            int i8 = bVar.f4072a;
            if (i8 == 2 ? iM4416z2 == iM4416z : i8 == 4 && iM4416z2 == iM4416z + 1) {
                i6++;
            } else {
                b bVarMo4418b = mo4418b(i8, iM4416z, i6, bVar.f4074c);
                m4422l(bVarMo4418b, i4);
                mo4417a(bVarMo4418b);
                if (bVar.f4072a == 4) {
                    i4 += i6;
                }
                iM4416z = iM4416z2;
                i6 = 1;
            }
        }
        Object obj = bVar.f4074c;
        mo4417a(bVar);
        if (i6 > 0) {
            b bVarMo4418b2 = mo4418b(bVar.f4072a, iM4416z, i6, obj);
            m4422l(bVarMo4418b2, i4);
            mo4417a(bVarMo4418b2);
        }
    }

    /* renamed from: v */
    private void m4415v(b bVar) {
        this.f4066c.add(bVar);
        int i2 = bVar.f4072a;
        if (i2 == 1) {
            this.f4067d.mo4216g(bVar.f4073b, bVar.f4075d);
            return;
        }
        if (i2 == 2) {
            this.f4067d.mo4215f(bVar.f4073b, bVar.f4075d);
            return;
        }
        if (i2 == 4) {
            this.f4067d.mo4212c(bVar.f4073b, bVar.f4075d, bVar.f4074c);
        } else {
            if (i2 == 8) {
                this.f4067d.mo4210a(bVar.f4073b, bVar.f4075d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: z */
    private int m4416z(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.f4066c.size() - 1; size >= 0; size--) {
            b bVar = this.f4066c.get(size);
            int i6 = bVar.f4072a;
            if (i6 == 8) {
                int i7 = bVar.f4073b;
                int i8 = bVar.f4075d;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            bVar.f4073b = i7 + 1;
                            bVar.f4075d = i8 + 1;
                        } else if (i3 == 2) {
                            bVar.f4073b = i7 - 1;
                            bVar.f4075d = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        bVar.f4075d = i8 + 1;
                    } else if (i3 == 2) {
                        bVar.f4075d = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        bVar.f4073b = i7 + 1;
                    } else if (i3 == 2) {
                        bVar.f4073b = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = bVar.f4073b;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= bVar.f4075d;
                    } else if (i6 == 2) {
                        i2 += bVar.f4075d;
                    }
                } else if (i3 == 1) {
                    bVar.f4073b = i9 + 1;
                } else if (i3 == 2) {
                    bVar.f4073b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f4066c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f4066c.get(size2);
            if (bVar2.f4072a == 8) {
                int i10 = bVar2.f4075d;
                if (i10 == bVar2.f4073b || i10 < 0) {
                    this.f4066c.remove(size2);
                    mo4417a(bVar2);
                }
            } else if (bVar2.f4075d <= 0) {
                this.f4066c.remove(size2);
                mo4417a(bVar2);
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.C0632m.a
    /* renamed from: a */
    public void mo4417a(b bVar) {
        if (this.f4069f) {
            return;
        }
        bVar.f4074c = null;
        this.f4064a.mo6060a(bVar);
    }

    @Override // androidx.recyclerview.widget.C0632m.a
    /* renamed from: b */
    public b mo4418b(int i2, int i3, int i4, Object obj) {
        b bVarMo6061b = this.f4064a.mo6061b();
        if (bVarMo6061b == null) {
            return new b(i2, i3, i4, obj);
        }
        bVarMo6061b.f4072a = i2;
        bVarMo6061b.f4073b = i3;
        bVarMo6061b.f4075d = i4;
        bVarMo6061b.f4074c = obj;
        return bVarMo6061b;
    }

    /* renamed from: e */
    public int m4419e(int i2) {
        int size = this.f4065b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f4065b.get(i3);
            int i4 = bVar.f4072a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.f4073b;
                    if (i5 <= i2) {
                        int i6 = bVar.f4075d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.f4073b;
                    if (i7 == i2) {
                        i2 = bVar.f4075d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.f4075d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.f4073b <= i2) {
                i2 += bVar.f4075d;
            }
        }
        return i2;
    }

    /* renamed from: i */
    void m4420i() {
        int size = this.f4066c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4067d.mo4213d(this.f4066c.get(i2));
        }
        m4433x(this.f4066c);
        this.f4071h = 0;
    }

    /* renamed from: j */
    void m4421j() {
        m4420i();
        int size = this.f4065b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f4065b.get(i2);
            int i3 = bVar.f4072a;
            if (i3 == 1) {
                this.f4067d.mo4213d(bVar);
                this.f4067d.mo4216g(bVar.f4073b, bVar.f4075d);
            } else if (i3 == 2) {
                this.f4067d.mo4213d(bVar);
                this.f4067d.mo4217h(bVar.f4073b, bVar.f4075d);
            } else if (i3 == 4) {
                this.f4067d.mo4213d(bVar);
                this.f4067d.mo4212c(bVar.f4073b, bVar.f4075d, bVar.f4074c);
            } else if (i3 == 8) {
                this.f4067d.mo4213d(bVar);
                this.f4067d.mo4210a(bVar.f4073b, bVar.f4075d);
            }
            Runnable runnable = this.f4068e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m4433x(this.f4065b);
        this.f4071h = 0;
    }

    /* renamed from: l */
    void m4422l(b bVar, int i2) {
        this.f4067d.mo4211b(bVar);
        int i3 = bVar.f4072a;
        if (i3 == 2) {
            this.f4067d.mo4217h(i2, bVar.f4075d);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f4067d.mo4212c(i2, bVar.f4075d, bVar.f4074c);
        }
    }

    /* renamed from: m */
    int m4423m(int i2) {
        return m4424n(i2, 0);
    }

    /* renamed from: n */
    int m4424n(int i2, int i3) {
        int size = this.f4066c.size();
        while (i3 < size) {
            b bVar = this.f4066c.get(i3);
            int i4 = bVar.f4072a;
            if (i4 == 8) {
                int i5 = bVar.f4073b;
                if (i5 == i2) {
                    i2 = bVar.f4075d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f4075d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f4073b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f4075d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f4075d;
                }
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: o */
    boolean m4425o(int i2) {
        return (i2 & this.f4071h) != 0;
    }

    /* renamed from: p */
    boolean m4426p() {
        return this.f4065b.size() > 0;
    }

    /* renamed from: q */
    boolean m4427q() {
        return (this.f4066c.isEmpty() || this.f4065b.isEmpty()) ? false : true;
    }

    /* renamed from: r */
    boolean m4428r(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.f4065b.add(mo4418b(4, i2, i3, obj));
        this.f4071h |= 4;
        return this.f4065b.size() == 1;
    }

    /* renamed from: s */
    boolean m4429s(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f4065b.add(mo4418b(1, i2, i3, null));
        this.f4071h |= 1;
        return this.f4065b.size() == 1;
    }

    /* renamed from: t */
    boolean m4430t(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f4065b.add(mo4418b(8, i2, i3, null));
        this.f4071h |= 8;
        return this.f4065b.size() == 1;
    }

    /* renamed from: u */
    boolean m4431u(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f4065b.add(mo4418b(2, i2, i3, null));
        this.f4071h |= 2;
        return this.f4065b.size() == 1;
    }

    /* renamed from: w */
    void m4432w() {
        this.f4070g.m4527b(this.f4065b);
        int size = this.f4065b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f4065b.get(i2);
            int i3 = bVar.f4072a;
            if (i3 == 1) {
                m4409c(bVar);
            } else if (i3 == 2) {
                m4411f(bVar);
            } else if (i3 == 4) {
                m4412g(bVar);
            } else if (i3 == 8) {
                m4410d(bVar);
            }
            Runnable runnable = this.f4068e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4065b.clear();
    }

    /* renamed from: x */
    void m4433x(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo4417a(list.get(i2));
        }
        list.clear();
    }

    /* renamed from: y */
    void m4434y() {
        m4433x(this.f4065b);
        m4433x(this.f4066c);
        this.f4071h = 0;
    }

    C0620a(a aVar, boolean z) {
        this.f4064a = new C0957g(30);
        this.f4065b = new ArrayList<>();
        this.f4066c = new ArrayList<>();
        this.f4071h = 0;
        this.f4067d = aVar;
        this.f4069f = z;
        this.f4070g = new C0632m(this);
    }
}
