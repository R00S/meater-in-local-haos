package a1;

import a1.e;
import b1.C2197b;
import b1.C2200e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: O0, reason: collision with root package name */
    private int f19872O0;

    /* renamed from: S0, reason: collision with root package name */
    int f19876S0;

    /* renamed from: T0, reason: collision with root package name */
    int f19877T0;

    /* renamed from: U0, reason: collision with root package name */
    int f19878U0;

    /* renamed from: V0, reason: collision with root package name */
    int f19879V0;

    /* renamed from: M0, reason: collision with root package name */
    C2197b f19870M0 = new C2197b(this);

    /* renamed from: N0, reason: collision with root package name */
    public C2200e f19871N0 = new C2200e(this);

    /* renamed from: P0, reason: collision with root package name */
    protected C2197b.InterfaceC0421b f19873P0 = null;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f19874Q0 = false;

    /* renamed from: R0, reason: collision with root package name */
    protected X0.d f19875R0 = new X0.d();

    /* renamed from: W0, reason: collision with root package name */
    public int f19880W0 = 0;

    /* renamed from: X0, reason: collision with root package name */
    public int f19881X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    c[] f19882Y0 = new c[4];

    /* renamed from: Z0, reason: collision with root package name */
    c[] f19883Z0 = new c[4];

    /* renamed from: a1, reason: collision with root package name */
    public boolean f19884a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f19885b1 = false;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f19886c1 = false;

    /* renamed from: d1, reason: collision with root package name */
    public int f19887d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    public int f19888e1 = 0;

    /* renamed from: f1, reason: collision with root package name */
    private int f19889f1 = 257;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f19890g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f19891h1 = false;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f19892i1 = false;

    /* renamed from: j1, reason: collision with root package name */
    int f19893j1 = 0;

    /* renamed from: k1, reason: collision with root package name */
    private WeakReference<d> f19894k1 = null;

    /* renamed from: l1, reason: collision with root package name */
    private WeakReference<d> f19895l1 = null;

    /* renamed from: m1, reason: collision with root package name */
    private WeakReference<d> f19896m1 = null;

    /* renamed from: n1, reason: collision with root package name */
    private WeakReference<d> f19897n1 = null;

    /* renamed from: o1, reason: collision with root package name */
    HashSet<e> f19898o1 = new HashSet<>();

    /* renamed from: p1, reason: collision with root package name */
    public C2197b.a f19899p1 = new C2197b.a();

    private void B1(d dVar, X0.i iVar) {
        this.f19875R0.h(iVar, this.f19875R0.q(dVar), 0, 5);
    }

    private void C1(d dVar, X0.i iVar) {
        this.f19875R0.h(this.f19875R0.q(dVar), iVar, 0, 5);
    }

    private void D1(e eVar) {
        int i10 = this.f19881X0 + 1;
        c[] cVarArr = this.f19882Y0;
        if (i10 >= cVarArr.length) {
            this.f19882Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f19882Y0[this.f19881X0] = new c(eVar, 1, R1());
        this.f19881X0++;
    }

    public static boolean U1(int i10, e eVar, C2197b.InterfaceC0421b interfaceC0421b, C2197b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0421b == null) {
            return false;
        }
        if (eVar.V() == 8 || (eVar instanceof h) || (eVar instanceof C1883a)) {
            aVar.f30004e = 0;
            aVar.f30005f = 0;
            return false;
        }
        aVar.f30000a = eVar.A();
        aVar.f30001b = eVar.T();
        aVar.f30002c = eVar.W();
        aVar.f30003d = eVar.x();
        aVar.f30008i = false;
        aVar.f30009j = i11;
        e.b bVar = aVar.f30000a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f30001b == bVar2;
        boolean z12 = z10 && eVar.f19819d0 > 0.0f;
        boolean z13 = z11 && eVar.f19819d0 > 0.0f;
        if (z10 && eVar.a0(0) && eVar.f19856w == 0 && !z12) {
            aVar.f30000a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f19858x == 0) {
                aVar.f30000a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.a0(1) && eVar.f19858x == 0 && !z13) {
            aVar.f30001b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f19856w == 0) {
                aVar.f30001b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.n0()) {
            aVar.f30000a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.o0()) {
            aVar.f30001b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f19860y[0] == 4) {
                aVar.f30000a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f30001b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f30003d;
                } else {
                    aVar.f30000a = e.b.WRAP_CONTENT;
                    interfaceC0421b.b(eVar, aVar);
                    i13 = aVar.f30005f;
                }
                aVar.f30000a = bVar4;
                aVar.f30002c = (int) (eVar.v() * i13);
            }
        }
        if (z13) {
            if (eVar.f19860y[1] == 4) {
                aVar.f30001b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f30000a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f30002c;
                } else {
                    aVar.f30001b = e.b.WRAP_CONTENT;
                    interfaceC0421b.b(eVar, aVar);
                    i12 = aVar.f30004e;
                }
                aVar.f30001b = bVar6;
                if (eVar.w() == -1) {
                    aVar.f30003d = (int) (i12 / eVar.v());
                } else {
                    aVar.f30003d = (int) (eVar.v() * i12);
                }
            }
        }
        interfaceC0421b.b(eVar, aVar);
        eVar.l1(aVar.f30004e);
        eVar.M0(aVar.f30005f);
        eVar.L0(aVar.f30007h);
        eVar.B0(aVar.f30006g);
        aVar.f30009j = C2197b.a.f29997k;
        return aVar.f30008i;
    }

    private void W1() {
        this.f19880W0 = 0;
        this.f19881X0 = 0;
    }

    private void y1(e eVar) {
        int i10 = this.f19880W0 + 1;
        c[] cVarArr = this.f19883Z0;
        if (i10 >= cVarArr.length) {
            this.f19883Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f19883Z0[this.f19880W0] = new c(eVar, 0, R1());
        this.f19880W0++;
    }

    public void A1(d dVar) {
        WeakReference<d> weakReference = this.f19895l1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f19895l1.get().e()) {
            this.f19895l1 = new WeakReference<>(dVar);
        }
    }

    void E1(d dVar) {
        WeakReference<d> weakReference = this.f19896m1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f19896m1.get().e()) {
            this.f19896m1 = new WeakReference<>(dVar);
        }
    }

    void F1(d dVar) {
        WeakReference<d> weakReference = this.f19894k1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f19894k1.get().e()) {
            this.f19894k1 = new WeakReference<>(dVar);
        }
    }

    public boolean G1(boolean z10) {
        return this.f19871N0.f(z10);
    }

    public boolean H1(boolean z10) {
        return this.f19871N0.g(z10);
    }

    public boolean I1(boolean z10, int i10) {
        return this.f19871N0.h(z10, i10);
    }

    public void J1(X0.e eVar) {
        this.f19875R0.v(eVar);
    }

    public C2197b.InterfaceC0421b K1() {
        return this.f19873P0;
    }

    public int L1() {
        return this.f19889f1;
    }

    public X0.d M1() {
        return this.f19875R0;
    }

    public boolean N1() {
        return false;
    }

    @Override // a1.e
    public void O(StringBuilder sb2) {
        sb2.append(this.f19840o + ":{\n");
        sb2.append("  actualWidth:" + this.f19815b0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f19817c0);
        sb2.append("\n");
        Iterator<e> it = s1().iterator();
        while (it.hasNext()) {
            it.next().O(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public void O1() {
        this.f19871N0.j();
    }

    public void P1() {
        this.f19871N0.k();
    }

    public boolean Q1() {
        return this.f19892i1;
    }

    public boolean R1() {
        return this.f19874Q0;
    }

    public boolean S1() {
        return this.f19891h1;
    }

    public long T1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f19876S0 = i17;
        this.f19877T0 = i18;
        return this.f19870M0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean V1(int i10) {
        return (this.f19889f1 & i10) == i10;
    }

    public void X1(C2197b.InterfaceC0421b interfaceC0421b) {
        this.f19873P0 = interfaceC0421b;
        this.f19871N0.n(interfaceC0421b);
    }

    public void Y1(int i10) {
        this.f19889f1 = i10;
        X0.d.f18533s = V1(512);
    }

    public void Z1(int i10) {
        this.f19872O0 = i10;
    }

    public void a2(boolean z10) {
        this.f19874Q0 = z10;
    }

    public boolean b2(X0.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zV1 = V1(64);
        r1(dVar, zV1);
        int size = this.f19968L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f19968L0.get(i10);
            eVar.r1(dVar, zV1);
            if (eVar.c0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void c2() {
        this.f19870M0.e(this);
    }

    @Override // a1.e
    public void q1(boolean z10, boolean z11) {
        super.q1(z10, z11);
        int size = this.f19968L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19968L0.get(i10).q1(z10, z11);
        }
    }

    @Override // a1.m, a1.e
    public void t0() {
        this.f19875R0.E();
        this.f19876S0 = 0;
        this.f19878U0 = 0;
        this.f19877T0 = 0;
        this.f19879V0 = 0;
        this.f19890g1 = false;
        super.t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0307 A[PHI: r2 r16
      0x0307: PHI (r2v15 boolean) = (r2v14 boolean), (r2v19 boolean), (r2v19 boolean), (r2v19 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // a1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t1() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.f.t1():void");
    }

    void w1(e eVar, int i10) {
        if (i10 == 0) {
            y1(eVar);
        } else if (i10 == 1) {
            D1(eVar);
        }
    }

    public boolean x1(X0.d dVar) {
        boolean zV1 = V1(64);
        g(dVar, zV1);
        int size = this.f19968L0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f19968L0.get(i10);
            eVar.T0(0, false);
            eVar.T0(1, false);
            if (eVar instanceof C1883a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.f19968L0.get(i11);
                if (eVar2 instanceof C1883a) {
                    ((C1883a) eVar2).z1();
                }
            }
        }
        this.f19898o1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.f19968L0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof l) {
                    this.f19898o1.add(eVar3);
                } else {
                    eVar3.g(dVar, zV1);
                }
            }
        }
        while (this.f19898o1.size() > 0) {
            int size2 = this.f19898o1.size();
            Iterator<e> it = this.f19898o1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                if (lVar.w1(this.f19898o1)) {
                    lVar.g(dVar, zV1);
                    this.f19898o1.remove(lVar);
                    break;
                }
            }
            if (size2 == this.f19898o1.size()) {
                Iterator<e> it2 = this.f19898o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, zV1);
                }
                this.f19898o1.clear();
            }
        }
        if (X0.d.f18533s) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.f19968L0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, A() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.a(this, dVar, next);
                next.g(dVar, zV1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar5 = this.f19968L0.get(i14);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.f19811Z;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.Q0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.h1(e.b.FIXED);
                    }
                    eVar5.g(dVar, zV1);
                    if (bVar == bVar3) {
                        eVar5.Q0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.h1(bVar2);
                    }
                } else {
                    k.a(this, dVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar, zV1);
                    }
                }
            }
        }
        if (this.f19880W0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.f19881X0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    public void z1(d dVar) {
        WeakReference<d> weakReference = this.f19897n1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > this.f19897n1.get().e()) {
            this.f19897n1 = new WeakReference<>(dVar);
        }
    }
}
