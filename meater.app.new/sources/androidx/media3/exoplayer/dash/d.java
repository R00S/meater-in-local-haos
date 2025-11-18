package androidx.media3.exoplayer.dash;

import S2.r;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.G;
import X1.L;
import a2.n;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.f;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.b;
import d2.I;
import e2.v1;
import g2.C3382b;
import g2.g;
import h2.C3485a;
import h2.C3486b;
import h2.i;
import h2.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m8.AbstractC4010z;
import o2.AbstractC4100b;
import o2.AbstractC4103e;
import o2.C4102d;
import o2.C4108j;
import o2.InterfaceC4104f;
import o2.l;
import q2.x;
import r2.f;
import r2.k;
import v2.C4801g;

/* compiled from: DefaultDashChunkSource.java */
/* loaded from: classes.dex */
public class d implements androidx.media3.exoplayer.dash.a {

    /* renamed from: a, reason: collision with root package name */
    private final k f26980a;

    /* renamed from: b, reason: collision with root package name */
    private final C3382b f26981b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f26982c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26983d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.media3.datasource.a f26984e;

    /* renamed from: f, reason: collision with root package name */
    private final long f26985f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26986g;

    /* renamed from: h, reason: collision with root package name */
    private final f.c f26987h;

    /* renamed from: i, reason: collision with root package name */
    protected final b[] f26988i;

    /* renamed from: j, reason: collision with root package name */
    private x f26989j;

    /* renamed from: k, reason: collision with root package name */
    private h2.c f26990k;

    /* renamed from: l, reason: collision with root package name */
    private int f26991l;

    /* renamed from: m, reason: collision with root package name */
    private IOException f26992m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26993n;

    /* renamed from: o, reason: collision with root package name */
    private long f26994o = -9223372036854775807L;

    /* compiled from: DefaultDashChunkSource.java */
    public static final class a implements a.InterfaceC0377a {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0371a f26995a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26996b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC4104f.a f26997c;

        public a(a.InterfaceC0371a interfaceC0371a) {
            this(interfaceC0371a, 1);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0377a
        public s c(s sVar) {
            return this.f26997c.c(sVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0377a
        public androidx.media3.exoplayer.dash.a d(k kVar, h2.c cVar, C3382b c3382b, int i10, int[] iArr, x xVar, int i11, long j10, boolean z10, List<s> list, f.c cVar2, n nVar, v1 v1Var, r2.e eVar) {
            androidx.media3.datasource.a aVarA = this.f26995a.a();
            if (nVar != null) {
                aVarA.g(nVar);
            }
            return new d(this.f26997c, kVar, cVar, c3382b, i10, iArr, xVar, i11, aVarA, j10, this.f26996b, z10, list, cVar2, v1Var, eVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0377a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f26997c.b(z10);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0377a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(r.a aVar) {
            this.f26997c.a(aVar);
            return this;
        }

        public a(a.InterfaceC0371a interfaceC0371a, int i10) {
            this(C4102d.f46325K, interfaceC0371a, i10);
        }

        public a(InterfaceC4104f.a aVar, a.InterfaceC0371a interfaceC0371a, int i10) {
            this.f26997c = aVar;
            this.f26995a = interfaceC0371a;
            this.f26996b = i10;
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC4104f f26998a;

        /* renamed from: b, reason: collision with root package name */
        public final j f26999b;

        /* renamed from: c, reason: collision with root package name */
        public final C3486b f27000c;

        /* renamed from: d, reason: collision with root package name */
        public final g2.e f27001d;

        /* renamed from: e, reason: collision with root package name */
        private final long f27002e;

        /* renamed from: f, reason: collision with root package name */
        private final long f27003f;

        b(long j10, j jVar, C3486b c3486b, InterfaceC4104f interfaceC4104f, long j11, g2.e eVar) {
            this.f27002e = j10;
            this.f26999b = jVar;
            this.f27000c = c3486b;
            this.f27003f = j11;
            this.f26998a = interfaceC4104f;
            this.f27001d = eVar;
        }

        b b(long j10, j jVar) throws BehindLiveWindowException {
            long jF;
            g2.e eVarL = this.f26999b.l();
            g2.e eVarL2 = jVar.l();
            if (eVarL == null) {
                return new b(j10, jVar, this.f27000c, this.f26998a, this.f27003f, eVarL);
            }
            if (!eVarL.g()) {
                return new b(j10, jVar, this.f27000c, this.f26998a, this.f27003f, eVarL2);
            }
            long jI = eVarL.i(j10);
            if (jI == 0) {
                return new b(j10, jVar, this.f27000c, this.f26998a, this.f27003f, eVarL2);
            }
            C1804a.i(eVarL2);
            long jH = eVarL.h();
            long jA = eVarL.a(jH);
            long jF2 = jI + jH;
            long j11 = jF2 - 1;
            long jA2 = eVarL.a(j11) + eVarL.b(j11, j10);
            long jH2 = eVarL2.h();
            long jA3 = eVarL2.a(jH2);
            long j12 = this.f27003f;
            if (jA2 == jA3) {
                jF = j12 + (jF2 - jH2);
            } else {
                if (jA2 < jA3) {
                    throw new BehindLiveWindowException();
                }
                if (jA3 < jA) {
                    jF = j12 - (eVarL2.f(jA, j10) - jH);
                } else {
                    jF2 = eVarL.f(jA3, j10);
                    jF = j12 + (jF2 - jH2);
                }
            }
            return new b(j10, jVar, this.f27000c, this.f26998a, jF, eVarL2);
        }

        b c(g2.e eVar) {
            return new b(this.f27002e, this.f26999b, this.f27000c, this.f26998a, this.f27003f, eVar);
        }

        b d(C3486b c3486b) {
            return new b(this.f27002e, this.f26999b, c3486b, this.f26998a, this.f27003f, this.f27001d);
        }

        public long e(long j10) {
            return ((g2.e) C1804a.i(this.f27001d)).c(this.f27002e, j10) + this.f27003f;
        }

        public long f() {
            return ((g2.e) C1804a.i(this.f27001d)).h() + this.f27003f;
        }

        public long g(long j10) {
            return (e(j10) + ((g2.e) C1804a.i(this.f27001d)).j(this.f27002e, j10)) - 1;
        }

        public long h() {
            return ((g2.e) C1804a.i(this.f27001d)).i(this.f27002e);
        }

        public long i(long j10) {
            return k(j10) + ((g2.e) C1804a.i(this.f27001d)).b(j10 - this.f27003f, this.f27002e);
        }

        public long j(long j10) {
            return ((g2.e) C1804a.i(this.f27001d)).f(j10, this.f27002e) + this.f27003f;
        }

        public long k(long j10) {
            return ((g2.e) C1804a.i(this.f27001d)).a(j10 - this.f27003f);
        }

        public i l(long j10) {
            return ((g2.e) C1804a.i(this.f27001d)).e(j10 - this.f27003f);
        }

        public boolean m(long j10, long j11) {
            return ((g2.e) C1804a.i(this.f27001d)).g() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* compiled from: DefaultDashChunkSource.java */
    protected static final class c extends AbstractC4100b {

        /* renamed from: e, reason: collision with root package name */
        private final b f27004e;

        /* renamed from: f, reason: collision with root package name */
        private final long f27005f;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f27004e = bVar;
            this.f27005f = j12;
        }

        @Override // o2.m
        public long a() {
            c();
            return this.f27004e.k(d());
        }

        @Override // o2.m
        public long b() {
            c();
            return this.f27004e.i(d());
        }
    }

    public d(InterfaceC4104f.a aVar, k kVar, h2.c cVar, C3382b c3382b, int i10, int[] iArr, x xVar, int i11, androidx.media3.datasource.a aVar2, long j10, int i12, boolean z10, List<s> list, f.c cVar2, v1 v1Var, r2.e eVar) {
        this.f26980a = kVar;
        this.f26990k = cVar;
        this.f26981b = c3382b;
        this.f26982c = iArr;
        this.f26989j = xVar;
        this.f26983d = i11;
        this.f26984e = aVar2;
        this.f26991l = i10;
        this.f26985f = j10;
        this.f26986g = i12;
        this.f26987h = cVar2;
        long jG = cVar.g(i10);
        ArrayList<j> arrayListO = o();
        this.f26988i = new b[xVar.length()];
        int i13 = 0;
        while (i13 < this.f26988i.length) {
            j jVar = arrayListO.get(xVar.i(i13));
            C3486b c3486bJ = c3382b.j(jVar.f42268c);
            int i14 = i13;
            this.f26988i[i14] = new b(jG, jVar, c3486bJ == null ? jVar.f42268c.get(0) : c3486bJ, aVar.d(i11, jVar.f42267b, z10, list, cVar2, v1Var), 0L, jVar.l());
            i13 = i14 + 1;
        }
    }

    private b.a k(x xVar, List<C3486b> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = xVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (xVar.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int iF = C3382b.f(list);
        return new b.a(iF, iF - this.f26981b.g(list), length, i10);
    }

    private long l(long j10, long j11) {
        if (!this.f26990k.f42220d || this.f26988i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(n(j10), this.f26988i[0].i(this.f26988i[0].g(j10))) - j11);
    }

    private Pair<String, String> m(long j10, i iVar, b bVar) {
        long j11 = j10 + 1;
        if (j11 >= bVar.h()) {
            return null;
        }
        i iVarL = bVar.l(j11);
        String strA = G.a(iVar.b(bVar.f27000c.f42213a), iVarL.b(bVar.f27000c.f42213a));
        String str = iVarL.f42262a + "-";
        if (iVarL.f42263b != -1) {
            str = str + (iVarL.f42262a + iVarL.f42263b);
        }
        return new Pair<>(strA, str);
    }

    private long n(long j10) {
        h2.c cVar = this.f26990k;
        long j11 = cVar.f42217a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - L.Q0(j11 + cVar.d(this.f26991l).f42253b);
    }

    private ArrayList<j> o() {
        List<C3485a> list = this.f26990k.d(this.f26991l).f42254c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i10 : this.f26982c) {
            arrayList.addAll(list.get(i10).f42209c);
        }
        return arrayList;
    }

    private long p(b bVar, l lVar, long j10, long j11, long j12) {
        return lVar != null ? lVar.f() : L.q(bVar.j(j10), j11, j12);
    }

    private b s(int i10) {
        b bVar = this.f26988i[i10];
        C3486b c3486bJ = this.f26981b.j(bVar.f26999b.f42268c);
        if (c3486bJ == null || c3486bJ.equals(bVar.f27000c)) {
            return bVar;
        }
        b bVarD = bVar.d(c3486bJ);
        this.f26988i[i10] = bVarD;
        return bVarD;
    }

    @Override // o2.InterfaceC4107i
    public void a() throws IOException {
        IOException iOException = this.f26992m;
        if (iOException != null) {
            throw iOException;
        }
        this.f26980a.a();
    }

    @Override // o2.InterfaceC4107i
    public boolean b(long j10, AbstractC4103e abstractC4103e, List<? extends l> list) {
        if (this.f26992m != null) {
            return false;
        }
        return this.f26989j.k(j10, abstractC4103e, list);
    }

    @Override // o2.InterfaceC4107i
    public void c() {
        for (b bVar : this.f26988i) {
            InterfaceC4104f interfaceC4104f = bVar.f26998a;
            if (interfaceC4104f != null) {
                interfaceC4104f.c();
            }
        }
    }

    @Override // o2.InterfaceC4107i
    public long d(long j10, I i10) {
        for (b bVar : this.f26988i) {
            if (bVar.f27001d != null) {
                long jH = bVar.h();
                if (jH != 0) {
                    long j11 = bVar.j(j10);
                    long jK = bVar.k(j11);
                    return i10.a(j10, jK, (jK >= j10 || (jH != -1 && j11 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j11 + 1));
                }
            }
        }
        return j10;
    }

    @Override // o2.InterfaceC4107i
    public boolean e(AbstractC4103e abstractC4103e, boolean z10, b.c cVar, androidx.media3.exoplayer.upstream.b bVar) {
        b.C0381b c0381bD;
        if (!z10) {
            return false;
        }
        f.c cVar2 = this.f26987h;
        if (cVar2 != null && cVar2.j(abstractC4103e)) {
            return true;
        }
        if (!this.f26990k.f42220d && (abstractC4103e instanceof l)) {
            IOException iOException = cVar.f27868c;
            if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f26140E == 404) {
                b bVar2 = this.f26988i[this.f26989j.l(abstractC4103e.f46349d)];
                long jH = bVar2.h();
                if (jH != -1 && jH != 0) {
                    if (((l) abstractC4103e).f() > (bVar2.f() + jH) - 1) {
                        this.f26993n = true;
                        return true;
                    }
                }
            }
        }
        b bVar3 = this.f26988i[this.f26989j.l(abstractC4103e.f46349d)];
        C3486b c3486bJ = this.f26981b.j(bVar3.f26999b.f42268c);
        if (c3486bJ != null && !bVar3.f27000c.equals(c3486bJ)) {
            return true;
        }
        b.a aVarK = k(this.f26989j, bVar3.f26999b.f42268c);
        if ((!aVarK.a(2) && !aVarK.a(1)) || (c0381bD = bVar.d(aVarK, cVar)) == null || !aVarK.a(c0381bD.f27864a)) {
            return false;
        }
        int i10 = c0381bD.f27864a;
        if (i10 == 2) {
            x xVar = this.f26989j;
            return xVar.p(xVar.l(abstractC4103e.f46349d), c0381bD.f27865b);
        }
        if (i10 != 1) {
            return false;
        }
        this.f26981b.e(bVar3.f27000c, c0381bD.f27865b);
        return true;
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void f(x xVar) {
        this.f26989j = xVar;
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void g(h2.c cVar, int i10) {
        try {
            this.f26990k = cVar;
            this.f26991l = i10;
            long jG = cVar.g(i10);
            ArrayList<j> arrayListO = o();
            for (int i11 = 0; i11 < this.f26988i.length; i11++) {
                j jVar = arrayListO.get(this.f26989j.i(i11));
                b[] bVarArr = this.f26988i;
                bVarArr[i11] = bVarArr[i11].b(jG, jVar);
            }
        } catch (BehindLiveWindowException e10) {
            this.f26992m = e10;
        }
    }

    @Override // o2.InterfaceC4107i
    public void h(AbstractC4103e abstractC4103e) {
        C4801g c4801gG;
        if (abstractC4103e instanceof o2.k) {
            int iL = this.f26989j.l(((o2.k) abstractC4103e).f46349d);
            b bVar = this.f26988i[iL];
            if (bVar.f27001d == null && (c4801gG = ((InterfaceC4104f) C1804a.i(bVar.f26998a)).g()) != null) {
                this.f26988i[iL] = bVar.c(new g(c4801gG, bVar.f26999b.f42269d));
            }
        }
        f.c cVar = this.f26987h;
        if (cVar != null) {
            cVar.i(abstractC4103e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // o2.InterfaceC4107i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(androidx.media3.exoplayer.W r33, long r34, java.util.List<? extends o2.l> r36, o2.C4105g r37) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.d.i(androidx.media3.exoplayer.W, long, java.util.List, o2.g):void");
    }

    @Override // o2.InterfaceC4107i
    public int j(long j10, List<? extends l> list) {
        return (this.f26992m != null || this.f26989j.length() < 2) ? list.size() : this.f26989j.j(j10, list);
    }

    protected AbstractC4103e q(b bVar, androidx.media3.datasource.a aVar, s sVar, int i10, Object obj, i iVar, i iVar2, f.a aVar2) {
        i iVar3 = iVar;
        j jVar = bVar.f26999b;
        if (iVar3 != null) {
            i iVarA = iVar3.a(iVar2, bVar.f27000c.f42213a);
            if (iVarA != null) {
                iVar3 = iVarA;
            }
        } else {
            iVar3 = (i) C1804a.e(iVar2);
        }
        return new o2.k(aVar, g2.f.a(jVar, bVar.f27000c.f42213a, iVar3, 0, AbstractC4010z.l()), sVar, i10, obj, bVar.f26998a);
    }

    protected AbstractC4103e r(b bVar, androidx.media3.datasource.a aVar, int i10, s sVar, int i11, Object obj, long j10, int i12, long j11, long j12, f.a aVar2) {
        j jVar = bVar.f26999b;
        long jK = bVar.k(j10);
        i iVarL = bVar.l(j10);
        if (bVar.f26998a == null) {
            return new o2.n(aVar, g2.f.a(jVar, bVar.f27000c.f42213a, iVarL, bVar.m(j10, j12) ? 0 : 8, AbstractC4010z.l()), sVar, i11, obj, jK, bVar.i(j10), j10, i10, sVar);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            i iVarA = iVarL.a(bVar.l(i13 + j10), bVar.f27000c.f42213a);
            if (iVarA == null) {
                break;
            }
            i14++;
            i13++;
            iVarL = iVarA;
        }
        long j13 = (i14 + j10) - 1;
        long jI = bVar.i(j13);
        long j14 = bVar.f27002e;
        if (j14 == -9223372036854775807L || j14 > jI) {
            j14 = -9223372036854775807L;
        }
        a2.g gVarA = g2.f.a(jVar, bVar.f27000c.f42213a, iVarL, bVar.m(j13, j12) ? 0 : 8, AbstractC4010z.l());
        long j15 = -jVar.f42269d;
        if (z.p(sVar.f17162o)) {
            j15 += jK;
        }
        return new C4108j(aVar, gVarA, sVar, i11, obj, jK, jI, j11, j14, j10, i14, j15, bVar.f26998a);
    }
}
