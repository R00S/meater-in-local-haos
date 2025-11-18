package p024c.p044g.p048b.p049k;

import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p024c.p044g.p048b.C0881d;
import p024c.p044g.p048b.C0882e;
import p024c.p044g.p048b.C0886i;
import p024c.p044g.p048b.p049k.C0892e;
import p024c.p044g.p048b.p049k.p050m.C0901b;
import p024c.p044g.p048b.p049k.p050m.C0904e;

/* compiled from: ConstraintWidgetContainer.java */
/* renamed from: c.g.b.k.f */
/* loaded from: classes.dex */
public class C0893f extends C0899l {

    /* renamed from: I0 */
    public C0882e f6031I0;

    /* renamed from: K0 */
    int f6033K0;

    /* renamed from: L0 */
    int f6034L0;

    /* renamed from: M0 */
    int f6035M0;

    /* renamed from: N0 */
    int f6036N0;

    /* renamed from: E0 */
    C0901b f6027E0 = new C0901b(this);

    /* renamed from: F0 */
    public C0904e f6028F0 = new C0904e(this);

    /* renamed from: G0 */
    protected C0901b.b f6029G0 = null;

    /* renamed from: H0 */
    private boolean f6030H0 = false;

    /* renamed from: J0 */
    protected C0881d f6032J0 = new C0881d();

    /* renamed from: O0 */
    public int f6037O0 = 0;

    /* renamed from: P0 */
    public int f6038P0 = 0;

    /* renamed from: Q0 */
    C0890c[] f6039Q0 = new C0890c[4];

    /* renamed from: R0 */
    C0890c[] f6040R0 = new C0890c[4];

    /* renamed from: S0 */
    public boolean f6041S0 = false;

    /* renamed from: T0 */
    public boolean f6042T0 = false;

    /* renamed from: U0 */
    public boolean f6043U0 = false;

    /* renamed from: V0 */
    public int f6044V0 = 0;

    /* renamed from: W0 */
    public int f6045W0 = 0;

    /* renamed from: X0 */
    private int f6046X0 = 257;

    /* renamed from: Y0 */
    public boolean f6047Y0 = false;

    /* renamed from: Z0 */
    private boolean f6048Z0 = false;

    /* renamed from: a1 */
    private boolean f6049a1 = false;

    /* renamed from: b1 */
    int f6050b1 = 0;

    /* renamed from: c1 */
    private WeakReference<C0891d> f6051c1 = null;

    /* renamed from: d1 */
    private WeakReference<C0891d> f6052d1 = null;

    /* renamed from: e1 */
    private WeakReference<C0891d> f6053e1 = null;

    /* renamed from: f1 */
    private WeakReference<C0891d> f6054f1 = null;

    /* renamed from: g1 */
    public C0901b.a f6055g1 = new C0901b.a();

    /* renamed from: A1 */
    public static boolean m5746A1(C0892e c0892e, C0901b.b bVar, C0901b.a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        aVar.f6087d = c0892e.m5742y();
        aVar.f6088e = c0892e.m5680O();
        aVar.f6089f = c0892e.m5686R();
        aVar.f6090g = c0892e.m5736v();
        aVar.f6095l = false;
        aVar.f6096m = i2;
        C0892e.b bVar2 = aVar.f6087d;
        C0892e.b bVar3 = C0892e.b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.f6088e == bVar3;
        boolean z3 = z && c0892e.f5966X > 0.0f;
        boolean z4 = z2 && c0892e.f5966X > 0.0f;
        if (z && c0892e.m5694V(0) && c0892e.f6000q == 0 && !z3) {
            aVar.f6087d = C0892e.b.WRAP_CONTENT;
            if (z2 && c0892e.f6002r == 0) {
                aVar.f6087d = C0892e.b.FIXED;
            }
            z = false;
        }
        if (z2 && c0892e.m5694V(1) && c0892e.f6002r == 0 && !z4) {
            aVar.f6088e = C0892e.b.WRAP_CONTENT;
            if (z && c0892e.f6000q == 0) {
                aVar.f6088e = C0892e.b.FIXED;
            }
            z2 = false;
        }
        if (c0892e.mo5614e0()) {
            aVar.f6087d = C0892e.b.FIXED;
            z = false;
        }
        if (c0892e.mo5616f0()) {
            aVar.f6088e = C0892e.b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (c0892e.f6004s[0] == 4) {
                aVar.f6087d = C0892e.b.FIXED;
            } else if (!z2) {
                C0892e.b bVar4 = aVar.f6088e;
                C0892e.b bVar5 = C0892e.b.FIXED;
                if (bVar4 == bVar5) {
                    i4 = aVar.f6090g;
                } else {
                    aVar.f6087d = C0892e.b.WRAP_CONTENT;
                    bVar.mo1336b(c0892e, aVar);
                    i4 = aVar.f6092i;
                }
                aVar.f6087d = bVar5;
                int i5 = c0892e.f5967Y;
                if (i5 == 0 || i5 == -1) {
                    aVar.f6089f = (int) (c0892e.m5732t() * i4);
                } else {
                    aVar.f6089f = (int) (c0892e.m5732t() / i4);
                }
            }
        }
        if (z4) {
            if (c0892e.f6004s[1] == 4) {
                aVar.f6088e = C0892e.b.FIXED;
            } else if (!z) {
                C0892e.b bVar6 = aVar.f6087d;
                C0892e.b bVar7 = C0892e.b.FIXED;
                if (bVar6 == bVar7) {
                    i3 = aVar.f6089f;
                } else {
                    aVar.f6088e = C0892e.b.WRAP_CONTENT;
                    bVar.mo1336b(c0892e, aVar);
                    i3 = aVar.f6091h;
                }
                aVar.f6088e = bVar7;
                int i6 = c0892e.f5967Y;
                if (i6 == 0 || i6 == -1) {
                    aVar.f6090g = (int) (i3 / c0892e.m5732t());
                } else {
                    aVar.f6090g = (int) (i3 * c0892e.m5732t());
                }
            }
        }
        bVar.mo1336b(c0892e, aVar);
        c0892e.m5693U0(aVar.f6091h);
        c0892e.m5737v0(aVar.f6092i);
        c0892e.m5735u0(aVar.f6094k);
        c0892e.m5715k0(aVar.f6093j);
        aVar.f6096m = C0901b.a.f6084a;
        return aVar.f6095l;
    }

    /* renamed from: C1 */
    private void m5747C1() {
        this.f6037O0 = 0;
        this.f6038P0 = 0;
    }

    /* renamed from: g1 */
    private void m5748g1(C0892e c0892e) {
        int i2 = this.f6037O0 + 1;
        C0890c[] c0890cArr = this.f6040R0;
        if (i2 >= c0890cArr.length) {
            this.f6040R0 = (C0890c[]) Arrays.copyOf(c0890cArr, c0890cArr.length * 2);
        }
        this.f6040R0[this.f6037O0] = new C0890c(c0892e, 0, m5774x1());
        this.f6037O0++;
    }

    /* renamed from: j1 */
    private void m5749j1(C0891d c0891d, C0886i c0886i) {
        this.f6032J0.m5573h(c0886i, this.f6032J0.m5580q(c0891d), 0, 5);
    }

    /* renamed from: k1 */
    private void m5750k1(C0891d c0891d, C0886i c0886i) {
        this.f6032J0.m5573h(this.f6032J0.m5580q(c0891d), c0886i, 0, 5);
    }

    /* renamed from: l1 */
    private void m5751l1(C0892e c0892e) {
        int i2 = this.f6038P0 + 1;
        C0890c[] c0890cArr = this.f6039Q0;
        if (i2 >= c0890cArr.length) {
            this.f6039Q0 = (C0890c[]) Arrays.copyOf(c0890cArr, c0890cArr.length * 2);
        }
        this.f6039Q0[this.f6038P0] = new C0890c(c0892e, 1, m5774x1());
        this.f6038P0++;
    }

    /* renamed from: B1 */
    public boolean m5752B1(int i2) {
        return (this.f6046X0 & i2) == i2;
    }

    /* renamed from: D1 */
    public void m5753D1(C0901b.b bVar) {
        this.f6029G0 = bVar;
        this.f6028F0.m5827n(bVar);
    }

    /* renamed from: E1 */
    public void m5754E1(int i2) {
        this.f6046X0 = i2;
        C0881d.f5816a = m5752B1(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    /* renamed from: F1 */
    public void m5755F1(boolean z) {
        this.f6030H0 = z;
    }

    /* renamed from: G1 */
    public void m5756G1(C0881d c0881d, boolean[] zArr) {
        zArr[2] = false;
        boolean zM5752B1 = m5752B1(64);
        mo5702Z0(c0881d, zM5752B1);
        int size = this.f6080D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6080D0.get(i2).mo5702Z0(c0881d, zM5752B1);
        }
    }

    /* renamed from: H1 */
    public void m5757H1() {
        this.f6027E0.m5804e(this);
    }

    @Override // p024c.p044g.p048b.p049k.C0892e
    /* renamed from: Y0 */
    public void mo5700Y0(boolean z, boolean z2) {
        super.mo5700Y0(z, z2);
        int size = this.f6080D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6080D0.get(i2).mo5700Y0(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x02fb A[PHI: r0 r6
      0x02fb: PHI (r0v20 boolean) = (r0v19 boolean), (r0v22 boolean), (r0v22 boolean), (r0v22 boolean) binds: [B:139:0x02bf, B:147:0x02e3, B:148:0x02e5, B:150:0x02eb] A[DONT_GENERATE, DONT_INLINE]
      0x02fb: PHI (r6v11 boolean) = (r6v10 boolean), (r6v13 boolean), (r6v13 boolean), (r6v13 boolean) binds: [B:139:0x02bf, B:147:0x02e3, B:148:0x02e5, B:150:0x02eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // p024c.p044g.p048b.p049k.C0899l
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5758b1() {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p044g.p048b.p049k.C0893f.mo5758b1():void");
    }

    /* renamed from: e1 */
    void m5759e1(C0892e c0892e, int i2) {
        if (i2 == 0) {
            m5748g1(c0892e);
        } else if (i2 == 1) {
            m5751l1(c0892e);
        }
    }

    /* renamed from: f1 */
    public boolean m5760f1(C0881d c0881d) {
        boolean zM5752B1 = m5752B1(64);
        mo5618g(c0881d, zM5752B1);
        int size = this.f6080D0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0892e c0892e = this.f6080D0.get(i2);
            c0892e.m5657C0(0, false);
            c0892e.m5657C0(1, false);
            if (c0892e instanceof C0888a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C0892e c0892e2 = this.f6080D0.get(i3);
                if (c0892e2 instanceof C0888a) {
                    ((C0888a) c0892e2).m5621h1();
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C0892e c0892e3 = this.f6080D0.get(i4);
            if (c0892e3.m5708f()) {
                c0892e3.mo5618g(c0881d, zM5752B1);
            }
        }
        if (C0881d.f5816a) {
            HashSet<C0892e> hashSet = new HashSet<>();
            for (int i5 = 0; i5 < size; i5++) {
                C0892e c0892e4 = this.f6080D0.get(i5);
                if (!c0892e4.m5708f()) {
                    hashSet.add(c0892e4);
                }
            }
            m5707e(this, c0881d, hashSet, m5742y() == C0892e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<C0892e> it = hashSet.iterator();
            while (it.hasNext()) {
                C0892e next = it.next();
                C0897j.m5792a(this, c0881d, next);
                next.mo5618g(c0881d, zM5752B1);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                C0892e c0892e5 = this.f6080D0.get(i6);
                if (c0892e5 instanceof C0893f) {
                    C0892e.b[] bVarArr = c0892e5.f5962T;
                    C0892e.b bVar = bVarArr[0];
                    C0892e.b bVar2 = bVarArr[1];
                    C0892e.b bVar3 = C0892e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        c0892e5.m5745z0(C0892e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        c0892e5.m5685Q0(C0892e.b.FIXED);
                    }
                    c0892e5.mo5618g(c0881d, zM5752B1);
                    if (bVar == bVar3) {
                        c0892e5.m5745z0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        c0892e5.m5685Q0(bVar2);
                    }
                } else {
                    C0897j.m5792a(this, c0881d, c0892e5);
                    if (!c0892e5.m5708f()) {
                        c0892e5.mo5618g(c0881d, zM5752B1);
                    }
                }
            }
        }
        if (this.f6037O0 > 0) {
            C0889b.m5626b(this, c0881d, null, 0);
        }
        if (this.f6038P0 > 0) {
            C0889b.m5626b(this, c0881d, null, 1);
        }
        return true;
    }

    @Override // p024c.p044g.p048b.p049k.C0899l, p024c.p044g.p048b.p049k.C0892e
    /* renamed from: h0 */
    public void mo5710h0() {
        this.f6032J0.m5566D();
        this.f6033K0 = 0;
        this.f6035M0 = 0;
        this.f6034L0 = 0;
        this.f6036N0 = 0;
        this.f6047Y0 = false;
        super.mo5710h0();
    }

    /* renamed from: h1 */
    public void m5761h1(C0891d c0891d) {
        WeakReference<C0891d> weakReference = this.f6054f1;
        if (weakReference == null || weakReference.get() == null || c0891d.m5633d() > this.f6054f1.get().m5633d()) {
            this.f6054f1 = new WeakReference<>(c0891d);
        }
    }

    /* renamed from: i1 */
    public void m5762i1(C0891d c0891d) {
        WeakReference<C0891d> weakReference = this.f6052d1;
        if (weakReference == null || weakReference.get() == null || c0891d.m5633d() > this.f6052d1.get().m5633d()) {
            this.f6052d1 = new WeakReference<>(c0891d);
        }
    }

    /* renamed from: m1 */
    void m5763m1(C0891d c0891d) {
        WeakReference<C0891d> weakReference = this.f6053e1;
        if (weakReference == null || weakReference.get() == null || c0891d.m5633d() > this.f6053e1.get().m5633d()) {
            this.f6053e1 = new WeakReference<>(c0891d);
        }
    }

    /* renamed from: n1 */
    void m5764n1(C0891d c0891d) {
        WeakReference<C0891d> weakReference = this.f6051c1;
        if (weakReference == null || weakReference.get() == null || c0891d.m5633d() > this.f6051c1.get().m5633d()) {
            this.f6051c1 = new WeakReference<>(c0891d);
        }
    }

    /* renamed from: o1 */
    public boolean m5765o1(boolean z) {
        return this.f6028F0.m5821f(z);
    }

    /* renamed from: p1 */
    public boolean m5766p1(boolean z) {
        return this.f6028F0.m5822g(z);
    }

    /* renamed from: q1 */
    public boolean m5767q1(boolean z, int i2) {
        return this.f6028F0.m5823h(z, i2);
    }

    /* renamed from: r1 */
    public C0901b.b m5768r1() {
        return this.f6029G0;
    }

    /* renamed from: s1 */
    public int m5769s1() {
        return this.f6046X0;
    }

    /* renamed from: t1 */
    public C0881d m5770t1() {
        return this.f6032J0;
    }

    /* renamed from: u1 */
    public void m5771u1() {
        this.f6028F0.m5824j();
    }

    /* renamed from: v1 */
    public void m5772v1() {
        this.f6028F0.m5825k();
    }

    /* renamed from: w1 */
    public boolean m5773w1() {
        return this.f6049a1;
    }

    /* renamed from: x1 */
    public boolean m5774x1() {
        return this.f6030H0;
    }

    /* renamed from: y1 */
    public boolean m5775y1() {
        return this.f6048Z0;
    }

    /* renamed from: z1 */
    public long m5776z1(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f6033K0 = i9;
        this.f6034L0 = i10;
        return this.f6027E0.m5803d(this, i2, i9, i10, i3, i4, i5, i6, i7, i8);
    }
}
