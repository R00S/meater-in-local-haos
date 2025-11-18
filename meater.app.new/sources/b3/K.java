package b3;

import S2.r;
import X1.C1804a;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import b3.L;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;

/* compiled from: TsExtractor.java */
/* loaded from: classes.dex */
public final class K implements InterfaceC4810p {

    /* renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final v2.u f30165v = new v2.u() { // from class: b3.J
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return K.z();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f30166a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30167b;

    /* renamed from: c, reason: collision with root package name */
    private final int f30168c;

    /* renamed from: d, reason: collision with root package name */
    private final List<X1.E> f30169d;

    /* renamed from: e, reason: collision with root package name */
    private final X1.y f30170e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseIntArray f30171f;

    /* renamed from: g, reason: collision with root package name */
    private final L.c f30172g;

    /* renamed from: h, reason: collision with root package name */
    private final r.a f30173h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray<L> f30174i;

    /* renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f30175j;

    /* renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f30176k;

    /* renamed from: l, reason: collision with root package name */
    private final I f30177l;

    /* renamed from: m, reason: collision with root package name */
    private H f30178m;

    /* renamed from: n, reason: collision with root package name */
    private v2.r f30179n;

    /* renamed from: o, reason: collision with root package name */
    private int f30180o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f30181p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30182q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f30183r;

    /* renamed from: s, reason: collision with root package name */
    private L f30184s;

    /* renamed from: t, reason: collision with root package name */
    private int f30185t;

    /* renamed from: u, reason: collision with root package name */
    private int f30186u;

    public K(int i10, r.a aVar) {
        this(1, i10, aVar, new X1.E(0L), new C2221j(0), 112800);
    }

    private void A(long j10) {
        if (this.f30182q) {
            return;
        }
        this.f30182q = true;
        if (this.f30177l.b() == -9223372036854775807L) {
            this.f30179n.f(new J.b(this.f30177l.b()));
            return;
        }
        H h10 = new H(this.f30177l.c(), this.f30177l.b(), j10, this.f30186u, this.f30168c);
        this.f30178m = h10;
        this.f30179n.f(h10.b());
    }

    private void B() {
        this.f30175j.clear();
        this.f30174i.clear();
        SparseArray<L> sparseArrayA = this.f30172g.a();
        int size = sparseArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f30174i.put(sparseArrayA.keyAt(i10), sparseArrayA.valueAt(i10));
        }
        this.f30174i.put(0, new E(new a()));
        this.f30184s = null;
    }

    private boolean C(int i10) {
        return this.f30166a == 2 || this.f30181p || !this.f30176k.get(i10, false);
    }

    static /* synthetic */ int n(K k10) {
        int i10 = k10.f30180o;
        k10.f30180o = i10 + 1;
        return i10;
    }

    private boolean x(InterfaceC4811q interfaceC4811q) {
        byte[] bArrE = this.f30170e.e();
        if (9400 - this.f30170e.f() < 188) {
            int iA = this.f30170e.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f30170e.f(), bArrE, 0, iA);
            }
            this.f30170e.U(bArrE, iA);
        }
        while (this.f30170e.a() < 188) {
            int iG = this.f30170e.g();
            int iE = interfaceC4811q.e(bArrE, iG, 9400 - iG);
            if (iE == -1) {
                return false;
            }
            this.f30170e.V(iG + iE);
        }
        return true;
    }

    private int y() throws ParserException {
        int iF = this.f30170e.f();
        int iG = this.f30170e.g();
        int iA = M.a(this.f30170e.e(), iF, iG);
        this.f30170e.W(iA);
        int i10 = iA + 188;
        if (i10 > iG) {
            int i11 = this.f30185t + (iA - iF);
            this.f30185t = i11;
            if (this.f30166a == 2 && i11 > 376) {
                throw ParserException.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f30185t = 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] z() {
        return new InterfaceC4810p[]{new K(1, r.a.f15292a)};
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        H h10;
        C1804a.g(this.f30166a != 2);
        int size = this.f30169d.size();
        for (int i10 = 0; i10 < size; i10++) {
            X1.E e10 = this.f30169d.get(i10);
            boolean z10 = e10.f() == -9223372036854775807L;
            if (!z10) {
                long jD = e10.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                e10.i(j11);
            }
        }
        if (j11 != 0 && (h10 = this.f30178m) != null) {
            h10.h(j11);
        }
        this.f30170e.S(0);
        this.f30171f.clear();
        for (int i11 = 0; i11 < this.f30174i.size(); i11++) {
            this.f30174i.valueAt(i11).a();
        }
        this.f30185t = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // v2.InterfaceC4810p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(v2.InterfaceC4811q r7) {
        /*
            r6 = this;
            X1.y r0 = r6.f30170e
            byte[] r0 = r0.e()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.p(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.n(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.K.d(v2.q):boolean");
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        if ((this.f30167b & 1) == 0) {
            rVar = new S2.s(rVar, this.f30173h);
        }
        this.f30179n = rVar;
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, v2.I i10) throws ParserException {
        long jA = interfaceC4811q.a();
        boolean z10 = this.f30166a == 2;
        if (this.f30181p) {
            if (jA != -1 && !z10 && !this.f30177l.d()) {
                return this.f30177l.e(interfaceC4811q, i10, this.f30186u);
            }
            A(jA);
            if (this.f30183r) {
                this.f30183r = false;
                b(0L, 0L);
                if (interfaceC4811q.getPosition() != 0) {
                    i10.f51048a = 0L;
                    return 1;
                }
            }
            H h10 = this.f30178m;
            if (h10 != null && h10.d()) {
                return this.f30178m.c(interfaceC4811q, i10);
            }
        }
        if (!x(interfaceC4811q)) {
            for (int i11 = 0; i11 < this.f30174i.size(); i11++) {
                L lValueAt = this.f30174i.valueAt(i11);
                if (lValueAt instanceof y) {
                    y yVar = (y) lValueAt;
                    if (yVar.d(z10)) {
                        yVar.b(new X1.y(), 1);
                    }
                }
            }
            return -1;
        }
        int iY = y();
        int iG = this.f30170e.g();
        if (iY > iG) {
            return 0;
        }
        int iQ = this.f30170e.q();
        if ((8388608 & iQ) != 0) {
            this.f30170e.W(iY);
            return 0;
        }
        int i12 = (4194304 & iQ) != 0 ? 1 : 0;
        int i13 = (2096896 & iQ) >> 8;
        boolean z11 = (iQ & 32) != 0;
        L l10 = (iQ & 16) != 0 ? this.f30174i.get(i13) : null;
        if (l10 == null) {
            this.f30170e.W(iY);
            return 0;
        }
        if (this.f30166a != 2) {
            int i14 = iQ & 15;
            int i15 = this.f30171f.get(i13, i14 - 1);
            this.f30171f.put(i13, i14);
            if (i15 == i14) {
                this.f30170e.W(iY);
                return 0;
            }
            if (i14 != ((i15 + 1) & 15)) {
                l10.a();
            }
        }
        if (z11) {
            int iH = this.f30170e.H();
            i12 |= (this.f30170e.H() & 64) != 0 ? 2 : 0;
            this.f30170e.X(iH - 1);
        }
        boolean z12 = this.f30181p;
        if (C(i13)) {
            this.f30170e.V(iY);
            l10.b(this.f30170e, i12);
            this.f30170e.V(iG);
        }
        if (this.f30166a != 2 && !z12 && this.f30181p && jA != -1) {
            this.f30183r = true;
        }
        this.f30170e.W(iY);
        return 0;
    }

    public K(int i10, int i11, r.a aVar, X1.E e10, L.c cVar, int i12) {
        this.f30172g = (L.c) C1804a.e(cVar);
        this.f30168c = i12;
        this.f30166a = i10;
        this.f30167b = i11;
        this.f30173h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f30169d = Collections.singletonList(e10);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f30169d = arrayList;
            arrayList.add(e10);
        }
        this.f30170e = new X1.y(new byte[9400], 0);
        this.f30175j = new SparseBooleanArray();
        this.f30176k = new SparseBooleanArray();
        this.f30174i = new SparseArray<>();
        this.f30171f = new SparseIntArray();
        this.f30177l = new I(i12);
        this.f30179n = v2.r.f51223A;
        this.f30186u = -1;
        B();
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }

    /* compiled from: TsExtractor.java */
    private class a implements D {

        /* renamed from: a, reason: collision with root package name */
        private final X1.x f30187a = new X1.x(new byte[4]);

        public a() {
        }

        @Override // b3.D
        public void b(X1.y yVar) {
            if (yVar.H() == 0 && (yVar.H() & 128) != 0) {
                yVar.X(6);
                int iA = yVar.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    yVar.k(this.f30187a, 4);
                    int iH = this.f30187a.h(16);
                    this.f30187a.r(3);
                    if (iH == 0) {
                        this.f30187a.r(13);
                    } else {
                        int iH2 = this.f30187a.h(13);
                        if (K.this.f30174i.get(iH2) == null) {
                            K.this.f30174i.put(iH2, new E(K.this.new b(iH2)));
                            K.n(K.this);
                        }
                    }
                }
                if (K.this.f30166a != 2) {
                    K.this.f30174i.remove(0);
                }
            }
        }

        @Override // b3.D
        public void c(X1.E e10, v2.r rVar, L.d dVar) {
        }
    }

    /* compiled from: TsExtractor.java */
    private class b implements D {

        /* renamed from: a, reason: collision with root package name */
        private final X1.x f30189a = new X1.x(new byte[5]);

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<L> f30190b = new SparseArray<>();

        /* renamed from: c, reason: collision with root package name */
        private final SparseIntArray f30191c = new SparseIntArray();

        /* renamed from: d, reason: collision with root package name */
        private final int f30192d;

        public b(int i10) {
            this.f30192d = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private b3.L.b a(X1.y r17, int r18) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: b3.K.b.a(X1.y, int):b3.L$b");
        }

        @Override // b3.D
        public void b(X1.y yVar) {
            X1.E e10;
            if (yVar.H() != 2) {
                return;
            }
            if (K.this.f30166a == 1 || K.this.f30166a == 2 || K.this.f30180o == 1) {
                e10 = (X1.E) K.this.f30169d.get(0);
            } else {
                e10 = new X1.E(((X1.E) K.this.f30169d.get(0)).d());
                K.this.f30169d.add(e10);
            }
            if ((yVar.H() & 128) == 0) {
                return;
            }
            yVar.X(1);
            int iP = yVar.P();
            int i10 = 3;
            yVar.X(3);
            yVar.k(this.f30189a, 2);
            this.f30189a.r(3);
            int i11 = 13;
            K.this.f30186u = this.f30189a.h(13);
            yVar.k(this.f30189a, 2);
            int i12 = 4;
            this.f30189a.r(4);
            yVar.X(this.f30189a.h(12));
            if (K.this.f30166a == 2 && K.this.f30184s == null) {
                L.b bVar = new L.b(21, null, 0, null, X1.L.f18631f);
                K k10 = K.this;
                k10.f30184s = k10.f30172g.b(21, bVar);
                if (K.this.f30184s != null) {
                    K.this.f30184s.c(e10, K.this.f30179n, new L.d(iP, 21, 8192));
                }
            }
            this.f30190b.clear();
            this.f30191c.clear();
            int iA = yVar.a();
            while (iA > 0) {
                yVar.k(this.f30189a, 5);
                int iH = this.f30189a.h(8);
                this.f30189a.r(i10);
                int iH2 = this.f30189a.h(i11);
                this.f30189a.r(i12);
                int iH3 = this.f30189a.h(12);
                L.b bVarA = a(yVar, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarA.f30197a;
                }
                iA -= iH3 + 5;
                int i13 = K.this.f30166a == 2 ? iH : iH2;
                if (!K.this.f30175j.get(i13)) {
                    L lB = (K.this.f30166a == 2 && iH == 21) ? K.this.f30184s : K.this.f30172g.b(iH, bVarA);
                    if (K.this.f30166a != 2 || iH2 < this.f30191c.get(i13, 8192)) {
                        this.f30191c.put(i13, iH2);
                        this.f30190b.put(i13, lB);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f30191c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f30191c.keyAt(i14);
                int iValueAt = this.f30191c.valueAt(i14);
                K.this.f30175j.put(iKeyAt, true);
                K.this.f30176k.put(iValueAt, true);
                L lValueAt = this.f30190b.valueAt(i14);
                if (lValueAt != null) {
                    if (lValueAt != K.this.f30184s) {
                        lValueAt.c(e10, K.this.f30179n, new L.d(iP, iKeyAt, 8192));
                    }
                    K.this.f30174i.put(iValueAt, lValueAt);
                }
            }
            if (K.this.f30166a == 2) {
                if (K.this.f30181p) {
                    return;
                }
                K.this.f30179n.n();
                K.this.f30180o = 0;
                K.this.f30181p = true;
                return;
            }
            K.this.f30174i.remove(this.f30192d);
            K k11 = K.this;
            k11.f30180o = k11.f30166a == 1 ? 0 : K.this.f30180o - 1;
            if (K.this.f30180o == 0) {
                K.this.f30179n.n();
                K.this.f30181p = true;
            }
        }

        @Override // b3.D
        public void c(X1.E e10, v2.r rVar, L.d dVar) {
        }
    }
}
