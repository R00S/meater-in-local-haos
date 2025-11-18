package androidx.media3.exoplayer.source;

import U1.s;
import X1.C1804a;
import androidx.media3.exoplayer.W;
import androidx.media3.exoplayer.source.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import l8.InterfaceC3914g;
import n2.InterfaceC4057e;
import o2.AbstractC4103e;

/* compiled from: MergingMediaPeriod.java */
/* loaded from: classes.dex */
final class v implements q, q.a {

    /* renamed from: B, reason: collision with root package name */
    private final q[] f27823B;

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC4057e f27825D;

    /* renamed from: G, reason: collision with root package name */
    private q.a f27828G;

    /* renamed from: H, reason: collision with root package name */
    private n2.x f27829H;

    /* renamed from: J, reason: collision with root package name */
    private G f27831J;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList<q> f27826E = new ArrayList<>();

    /* renamed from: F, reason: collision with root package name */
    private final HashMap<U1.H, U1.H> f27827F = new HashMap<>();

    /* renamed from: C, reason: collision with root package name */
    private final IdentityHashMap<n2.s, Integer> f27824C = new IdentityHashMap<>();

    /* renamed from: I, reason: collision with root package name */
    private q[] f27830I = new q[0];

    /* compiled from: MergingMediaPeriod.java */
    private static final class a implements q2.x {

        /* renamed from: a, reason: collision with root package name */
        private final q2.x f27832a;

        /* renamed from: b, reason: collision with root package name */
        private final U1.H f27833b;

        public a(q2.x xVar, U1.H h10) {
            this.f27832a = xVar;
            this.f27833b = h10;
        }

        @Override // q2.x
        public boolean a(int i10, long j10) {
            return this.f27832a.a(i10, j10);
        }

        @Override // q2.InterfaceC4268A
        public U1.H b() {
            return this.f27833b;
        }

        @Override // q2.x
        public int c() {
            return this.f27832a.c();
        }

        @Override // q2.x
        public void d(long j10, long j11, long j12, List<? extends o2.l> list, o2.m[] mVarArr) {
            this.f27832a.d(j10, j11, j12, list, mVarArr);
        }

        @Override // q2.x
        public void e(boolean z10) {
            this.f27832a.e(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27832a.equals(aVar.f27832a) && this.f27833b.equals(aVar.f27833b);
        }

        @Override // q2.InterfaceC4268A
        public U1.s f(int i10) {
            return this.f27833b.a(this.f27832a.i(i10));
        }

        @Override // q2.x
        public void g() {
            this.f27832a.g();
        }

        @Override // q2.x
        public void h() {
            this.f27832a.h();
        }

        public int hashCode() {
            return ((527 + this.f27833b.hashCode()) * 31) + this.f27832a.hashCode();
        }

        @Override // q2.InterfaceC4268A
        public int i(int i10) {
            return this.f27832a.i(i10);
        }

        @Override // q2.x
        public int j(long j10, List<? extends o2.l> list) {
            return this.f27832a.j(j10, list);
        }

        @Override // q2.x
        public boolean k(long j10, AbstractC4103e abstractC4103e, List<? extends o2.l> list) {
            return this.f27832a.k(j10, abstractC4103e, list);
        }

        @Override // q2.InterfaceC4268A
        public int l(U1.s sVar) {
            return this.f27832a.u(this.f27833b.b(sVar));
        }

        @Override // q2.InterfaceC4268A
        public int length() {
            return this.f27832a.length();
        }

        @Override // q2.x
        public int m() {
            return this.f27832a.m();
        }

        @Override // q2.x
        public U1.s n() {
            return this.f27833b.a(this.f27832a.m());
        }

        @Override // q2.x
        public int o() {
            return this.f27832a.o();
        }

        @Override // q2.x
        public boolean p(int i10, long j10) {
            return this.f27832a.p(i10, j10);
        }

        @Override // q2.x
        public void q(float f10) {
            this.f27832a.q(f10);
        }

        @Override // q2.x
        public Object r() {
            return this.f27832a.r();
        }

        @Override // q2.x
        public void s() {
            this.f27832a.s();
        }

        @Override // q2.x
        public void t() {
            this.f27832a.t();
        }

        @Override // q2.InterfaceC4268A
        public int u(int i10) {
            return this.f27832a.u(i10);
        }
    }

    public v(InterfaceC4057e interfaceC4057e, long[] jArr, q... qVarArr) {
        this.f27825D = interfaceC4057e;
        this.f27823B = qVarArr;
        this.f27831J = interfaceC4057e.b();
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f27823B[i10] = new K(qVarArr[i10], j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List n(q qVar) {
        return qVar.s().c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(W w10) {
        if (this.f27826E.isEmpty()) {
            return this.f27831J.b(w10);
        }
        int size = this.f27826E.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27826E.get(i10).b(w10);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return this.f27831J.c();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long d(long j10, d2.I i10) {
        q[] qVarArr = this.f27830I;
        return (qVarArr.length > 0 ? qVarArr[0] : this.f27823B[0]).d(j10, i10);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean e() {
        return this.f27831J.e();
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        this.f27826E.remove(qVar);
        if (!this.f27826E.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (q qVar2 : this.f27823B) {
            i10 += qVar2.s().f45677a;
        }
        U1.H[] hArr = new U1.H[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            q[] qVarArr = this.f27823B;
            if (i11 >= qVarArr.length) {
                this.f27829H = new n2.x(hArr);
                ((q.a) C1804a.e(this.f27828G)).f(this);
                return;
            }
            n2.x xVarS = qVarArr[i11].s();
            int i13 = xVarS.f45677a;
            int i14 = 0;
            while (i14 < i13) {
                U1.H hB = xVarS.b(i14);
                U1.s[] sVarArr = new U1.s[hB.f16862a];
                for (int i15 = 0; i15 < hB.f16862a; i15++) {
                    U1.s sVarA = hB.a(i15);
                    s.b bVarB = sVarA.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str = sVarA.f17148a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    sVarArr[i15] = bVarB.e0(sb2.toString()).M();
                }
                U1.H h10 = new U1.H(i11 + ":" + hB.f16863b, sVarArr);
                this.f27827F.put(h10, hB);
                hArr[i12] = h10;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long g() {
        return this.f27831J.g();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void h(long j10) {
        this.f27831J.h(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // androidx.media3.exoplayer.source.q
    public long j(q2.x[] xVarArr, boolean[] zArr, n2.s[] sVarArr, boolean[] zArr2, long j10) {
        n2.s sVar;
        int[] iArr = new int[xVarArr.length];
        int[] iArr2 = new int[xVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sVar = null;
            if (i11 >= xVarArr.length) {
                break;
            }
            n2.s sVar2 = sVarArr[i11];
            Integer num = sVar2 != null ? this.f27824C.get(sVar2) : null;
            iArr[i11] = num == null ? -1 : num.intValue();
            q2.x xVar = xVarArr[i11];
            if (xVar != null) {
                String str = xVar.b().f16863b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.f27824C.clear();
        int length = xVarArr.length;
        n2.s[] sVarArr2 = new n2.s[length];
        n2.s[] sVarArr3 = new n2.s[xVarArr.length];
        q2.x[] xVarArr2 = new q2.x[xVarArr.length];
        ArrayList arrayList = new ArrayList(this.f27823B.length);
        long j11 = j10;
        int i12 = 0;
        q2.x[] xVarArr3 = xVarArr2;
        while (i12 < this.f27823B.length) {
            for (int i13 = i10; i13 < xVarArr.length; i13++) {
                sVarArr3[i13] = iArr[i13] == i12 ? sVarArr[i13] : sVar;
                if (iArr2[i13] == i12) {
                    q2.x xVar2 = (q2.x) C1804a.e(xVarArr[i13]);
                    xVarArr3[i13] = new a(xVar2, (U1.H) C1804a.e(this.f27827F.get(xVar2.b())));
                } else {
                    xVarArr3[i13] = sVar;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            q2.x[] xVarArr4 = xVarArr3;
            long j12 = this.f27823B[i12].j(xVarArr3, zArr, sVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = j12;
            } else if (j12 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < xVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    n2.s sVar3 = (n2.s) C1804a.e(sVarArr3[i15]);
                    sVarArr2[i15] = sVarArr3[i15];
                    this.f27824C.put(sVar3, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    C1804a.g(sVarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f27823B[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            xVarArr3 = xVarArr4;
            i10 = 0;
            sVar = null;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(sVarArr2, i16, sVarArr, i16, length);
        this.f27830I = (q[]) arrayList3.toArray(new q[i16]);
        this.f27831J = this.f27825D.a(arrayList3, m8.H.l(arrayList3, new InterfaceC3914g() { // from class: androidx.media3.exoplayer.source.u
            @Override // l8.InterfaceC3914g
            public final Object apply(Object obj) {
                return v.n((q) obj);
            }
        }));
        return j11;
    }

    public q k(int i10) {
        q qVar = this.f27823B[i10];
        return qVar instanceof K ? ((K) qVar).a() : qVar;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void l() {
        for (q qVar : this.f27823B) {
            qVar.l();
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j10) {
        long jM = this.f27830I[0].m(j10);
        int i10 = 1;
        while (true) {
            q[] qVarArr = this.f27830I;
            if (i10 >= qVarArr.length) {
                return jM;
            }
            if (qVarArr[i10].m(jM) != jM) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(q qVar) {
        ((q.a) C1804a.e(this.f27828G)).i(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long q() {
        long j10 = -9223372036854775807L;
        for (q qVar : this.f27830I) {
            long jQ = qVar.q();
            if (jQ == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && qVar.m(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (q qVar2 : this.f27830I) {
                    if (qVar2 == qVar) {
                        break;
                    }
                    if (qVar2.m(jQ) != jQ) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jQ;
            } else if (jQ != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void r(q.a aVar, long j10) {
        this.f27828G = aVar;
        Collections.addAll(this.f27826E, this.f27823B);
        for (q qVar : this.f27823B) {
            qVar.r(this, j10);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public n2.x s() {
        return (n2.x) C1804a.e(this.f27829H);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        for (q qVar : this.f27830I) {
            qVar.u(j10, z10);
        }
    }
}
