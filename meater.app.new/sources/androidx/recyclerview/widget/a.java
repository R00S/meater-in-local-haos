package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import java.util.ArrayList;
import java.util.List;
import r1.C4340g;
import r1.InterfaceC4339f;

/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
final class a implements p.a {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4339f<b> f28808a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f28809b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f28810c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0389a f28811d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f28812e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f28813f;

    /* renamed from: g, reason: collision with root package name */
    final p f28814g;

    /* renamed from: h, reason: collision with root package name */
    private int f28815h;

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0389a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(int i10, int i11, Object obj);

        void d(b bVar);

        RecyclerView.G e(int i10);

        void f(int i10, int i11);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* compiled from: AdapterHelper.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f28816a;

        /* renamed from: b, reason: collision with root package name */
        int f28817b;

        /* renamed from: c, reason: collision with root package name */
        Object f28818c;

        /* renamed from: d, reason: collision with root package name */
        int f28819d;

        b(int i10, int i11, int i12, Object obj) {
            this.f28816a = i10;
            this.f28817b = i11;
            this.f28819d = i12;
            this.f28818c = obj;
        }

        String a() {
            int i10 = this.f28816a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f28816a;
            if (i10 != bVar.f28816a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f28819d - this.f28817b) == 1 && this.f28819d == bVar.f28817b && this.f28817b == bVar.f28819d) {
                return true;
            }
            if (this.f28819d != bVar.f28819d || this.f28817b != bVar.f28817b) {
                return false;
            }
            Object obj2 = this.f28818c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f28818c)) {
                    return false;
                }
            } else if (bVar.f28818c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f28816a * 31) + this.f28817b) * 31) + this.f28819d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f28817b + "c:" + this.f28819d + ",p:" + this.f28818c + "]";
        }
    }

    a(InterfaceC0389a interfaceC0389a) {
        this(interfaceC0389a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f28817b;
        int i11 = bVar.f28819d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f28811d.e(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f28819d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f28817b;
        int i11 = bVar.f28819d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f28811d.e(i10) != null || h(i10)) {
                if (!z10) {
                    k(b(4, i13, i12, bVar.f28818c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    v(b(4, i13, i12, bVar.f28818c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f28819d) {
            Object obj = bVar.f28818c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (z10) {
            v(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f28810c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f28810c.get(i11);
            int i12 = bVar.f28816a;
            if (i12 == 8) {
                if (n(bVar.f28819d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f28817b;
                int i14 = bVar.f28819d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f28816a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f28817b, i11);
        int i12 = bVar.f28817b;
        int i13 = bVar.f28816a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f28819d; i15++) {
            int iZ2 = z(bVar.f28817b + (i10 * i15), bVar.f28816a);
            int i16 = bVar.f28816a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                b bVarB = b(i16, iZ, i14, bVar.f28818c);
                l(bVarB, i12);
                a(bVarB);
                if (bVar.f28816a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f28818c;
        a(bVar);
        if (i14 > 0) {
            b bVarB2 = b(bVar.f28816a, iZ, i14, obj);
            l(bVarB2, i12);
            a(bVarB2);
        }
    }

    private void v(b bVar) {
        this.f28810c.add(bVar);
        int i10 = bVar.f28816a;
        if (i10 == 1) {
            this.f28811d.g(bVar.f28817b, bVar.f28819d);
            return;
        }
        if (i10 == 2) {
            this.f28811d.f(bVar.f28817b, bVar.f28819d);
            return;
        }
        if (i10 == 4) {
            this.f28811d.c(bVar.f28817b, bVar.f28819d, bVar.f28818c);
        } else {
            if (i10 == 8) {
                this.f28811d.a(bVar.f28817b, bVar.f28819d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f28810c.size() - 1; size >= 0; size--) {
            b bVar = this.f28810c.get(size);
            int i14 = bVar.f28816a;
            if (i14 == 8) {
                int i15 = bVar.f28817b;
                int i16 = bVar.f28819d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f28817b = i15 + 1;
                            bVar.f28819d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f28817b = i15 - 1;
                            bVar.f28819d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f28819d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f28819d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f28817b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f28817b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f28817b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f28819d;
                    } else if (i14 == 2) {
                        i10 += bVar.f28819d;
                    }
                } else if (i11 == 1) {
                    bVar.f28817b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f28817b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f28810c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f28810c.get(size2);
            if (bVar2.f28816a == 8) {
                int i18 = bVar2.f28819d;
                if (i18 == bVar2.f28817b || i18 < 0) {
                    this.f28810c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f28819d <= 0) {
                this.f28810c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.p.a
    public void a(b bVar) {
        if (this.f28813f) {
            return;
        }
        bVar.f28818c = null;
        this.f28808a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.p.a
    public b b(int i10, int i11, int i12, Object obj) {
        b bVarB = this.f28808a.b();
        if (bVarB == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarB.f28816a = i10;
        bVarB.f28817b = i11;
        bVarB.f28819d = i12;
        bVarB.f28818c = obj;
        return bVarB;
    }

    public int e(int i10) {
        int size = this.f28809b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f28809b.get(i11);
            int i12 = bVar.f28816a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f28817b;
                    if (i13 <= i10) {
                        int i14 = bVar.f28819d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f28817b;
                    if (i15 == i10) {
                        i10 = bVar.f28819d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f28819d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f28817b <= i10) {
                i10 += bVar.f28819d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f28810c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f28811d.d(this.f28810c.get(i10));
        }
        x(this.f28810c);
        this.f28815h = 0;
    }

    void j() {
        i();
        int size = this.f28809b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f28809b.get(i10);
            int i11 = bVar.f28816a;
            if (i11 == 1) {
                this.f28811d.d(bVar);
                this.f28811d.g(bVar.f28817b, bVar.f28819d);
            } else if (i11 == 2) {
                this.f28811d.d(bVar);
                this.f28811d.h(bVar.f28817b, bVar.f28819d);
            } else if (i11 == 4) {
                this.f28811d.d(bVar);
                this.f28811d.c(bVar.f28817b, bVar.f28819d, bVar.f28818c);
            } else if (i11 == 8) {
                this.f28811d.d(bVar);
                this.f28811d.a(bVar.f28817b, bVar.f28819d);
            }
            Runnable runnable = this.f28812e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f28809b);
        this.f28815h = 0;
    }

    void l(b bVar, int i10) {
        this.f28811d.b(bVar);
        int i11 = bVar.f28816a;
        if (i11 == 2) {
            this.f28811d.h(i10, bVar.f28819d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f28811d.c(i10, bVar.f28819d, bVar.f28818c);
        }
    }

    int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f28810c.size();
        while (i11 < size) {
            b bVar = this.f28810c.get(i11);
            int i12 = bVar.f28816a;
            if (i12 == 8) {
                int i13 = bVar.f28817b;
                if (i13 == i10) {
                    i10 = bVar.f28819d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f28819d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f28817b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f28819d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f28819d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f28815h) != 0;
    }

    boolean p() {
        return this.f28809b.size() > 0;
    }

    boolean q() {
        return (this.f28810c.isEmpty() || this.f28809b.isEmpty()) ? false : true;
    }

    boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f28809b.add(b(4, i10, i11, obj));
        this.f28815h |= 4;
        return this.f28809b.size() == 1;
    }

    boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f28809b.add(b(1, i10, i11, null));
        this.f28815h |= 1;
        return this.f28809b.size() == 1;
    }

    boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f28809b.add(b(8, i10, i11, null));
        this.f28815h |= 8;
        return this.f28809b.size() == 1;
    }

    boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f28809b.add(b(2, i10, i11, null));
        this.f28815h |= 2;
        return this.f28809b.size() == 1;
    }

    void w() {
        this.f28814g.b(this.f28809b);
        int size = this.f28809b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f28809b.get(i10);
            int i11 = bVar.f28816a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f28812e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f28809b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(list.get(i10));
        }
        list.clear();
    }

    void y() {
        x(this.f28809b);
        x(this.f28810c);
        this.f28815h = 0;
    }

    a(InterfaceC0389a interfaceC0389a, boolean z10) {
        this.f28808a = new C4340g(30);
        this.f28809b = new ArrayList<>();
        this.f28810c = new ArrayList<>();
        this.f28815h = 0;
        this.f28811d = interfaceC0389a;
        this.f28813f = z10;
        this.f28814g = new p(this);
    }
}
