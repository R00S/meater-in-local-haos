package o2;

import S2.r;
import U1.InterfaceC1734j;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.L;
import X1.y;
import android.util.SparseArray;
import e2.v1;
import java.util.List;
import java.util.Objects;
import o2.InterfaceC4104f;
import v2.C4801g;
import v2.C4807m;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.O;
import v2.r;

/* compiled from: BundledChunkExtractor.java */
/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4102d implements r, InterfaceC4104f {

    /* renamed from: K, reason: collision with root package name */
    public static final b f46325K = new b();

    /* renamed from: L, reason: collision with root package name */
    private static final I f46326L = new I();

    /* renamed from: B, reason: collision with root package name */
    private final InterfaceC4810p f46327B;

    /* renamed from: C, reason: collision with root package name */
    private final int f46328C;

    /* renamed from: D, reason: collision with root package name */
    private final s f46329D;

    /* renamed from: E, reason: collision with root package name */
    private final SparseArray<a> f46330E = new SparseArray<>();

    /* renamed from: F, reason: collision with root package name */
    private boolean f46331F;

    /* renamed from: G, reason: collision with root package name */
    private InterfaceC4104f.b f46332G;

    /* renamed from: H, reason: collision with root package name */
    private long f46333H;

    /* renamed from: I, reason: collision with root package name */
    private J f46334I;

    /* renamed from: J, reason: collision with root package name */
    private s[] f46335J;

    /* compiled from: BundledChunkExtractor.java */
    /* renamed from: o2.d$a */
    private static final class a implements O {

        /* renamed from: a, reason: collision with root package name */
        private final int f46336a;

        /* renamed from: b, reason: collision with root package name */
        private final int f46337b;

        /* renamed from: c, reason: collision with root package name */
        private final s f46338c;

        /* renamed from: d, reason: collision with root package name */
        private final C4807m f46339d = new C4807m();

        /* renamed from: e, reason: collision with root package name */
        public s f46340e;

        /* renamed from: f, reason: collision with root package name */
        private O f46341f;

        /* renamed from: g, reason: collision with root package name */
        private long f46342g;

        public a(int i10, int i11, s sVar) {
            this.f46336a = i10;
            this.f46337b = i11;
            this.f46338c = sVar;
        }

        @Override // v2.O
        public int a(InterfaceC1734j interfaceC1734j, int i10, boolean z10, int i11) {
            return ((O) L.i(this.f46341f)).c(interfaceC1734j, i10, z10);
        }

        @Override // v2.O
        public void b(y yVar, int i10, int i11) {
            ((O) L.i(this.f46341f)).d(yVar, i10);
        }

        @Override // v2.O
        public void e(long j10, int i10, int i11, int i12, O.a aVar) {
            long j11 = this.f46342g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f46341f = this.f46339d;
            }
            ((O) L.i(this.f46341f)).e(j10, i10, i11, i12, aVar);
        }

        @Override // v2.O
        public void f(s sVar) {
            s sVar2 = this.f46338c;
            if (sVar2 != null) {
                sVar = sVar.j(sVar2);
            }
            this.f46340e = sVar;
            ((O) L.i(this.f46341f)).f(this.f46340e);
        }

        public void g(InterfaceC4104f.b bVar, long j10) {
            if (bVar == null) {
                this.f46341f = this.f46339d;
                return;
            }
            this.f46342g = j10;
            O oA = bVar.a(this.f46336a, this.f46337b);
            this.f46341f = oA;
            s sVar = this.f46340e;
            if (sVar != null) {
                oA.f(sVar);
            }
        }
    }

    /* compiled from: BundledChunkExtractor.java */
    /* renamed from: o2.d$b */
    public static final class b implements InterfaceC4104f.a {

        /* renamed from: a, reason: collision with root package name */
        private r.a f46343a = new S2.h();

        /* renamed from: b, reason: collision with root package name */
        private boolean f46344b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f46345c;

        @Override // o2.InterfaceC4104f.a
        public s c(s sVar) {
            String str;
            if (!this.f46344b || !this.f46343a.a(sVar)) {
                return sVar;
            }
            s.b bVarV = sVar.b().s0("application/x-media3-cues").V(this.f46343a.c(sVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sVar.f17162o);
            if (sVar.f17158k != null) {
                str = " " + sVar.f17158k;
            } else {
                str = "";
            }
            sb2.append(str);
            return bVarV.R(sb2.toString()).w0(Long.MAX_VALUE).M();
        }

        @Override // o2.InterfaceC4104f.a
        public InterfaceC4104f d(int i10, s sVar, boolean z10, List<s> list, O o10, v1 v1Var) {
            InterfaceC4810p hVar;
            String str = sVar.f17161n;
            if (!z.r(str)) {
                if (z.q(str)) {
                    hVar = new N2.e(this.f46343a, this.f46344b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hVar = new D2.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    hVar = new R2.a();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.f46344b) {
                        i11 |= 32;
                    }
                    if (this.f46345c) {
                        i11 |= 64;
                    }
                    hVar = new P2.h(this.f46343a, i11, null, null, list, o10);
                }
            } else {
                if (!this.f46344b) {
                    return null;
                }
                hVar = new S2.n(this.f46343a.b(sVar), sVar);
            }
            return new C4102d(hVar, i10, sVar);
        }

        @Override // o2.InterfaceC4104f.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b b(boolean z10) {
            this.f46344b = z10;
            return this;
        }

        @Override // o2.InterfaceC4104f.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b a(r.a aVar) {
            this.f46343a = (r.a) C1804a.e(aVar);
            return this;
        }
    }

    public C4102d(InterfaceC4810p interfaceC4810p, int i10, s sVar) {
        this.f46327B = interfaceC4810p;
        this.f46328C = i10;
        this.f46329D = sVar;
    }

    @Override // v2.r
    public O a(int i10, int i11) {
        a aVar = this.f46330E.get(i10);
        if (aVar == null) {
            C1804a.g(this.f46335J == null);
            aVar = new a(i10, i11, i11 == this.f46328C ? this.f46329D : null);
            aVar.g(this.f46332G, this.f46333H);
            this.f46330E.put(i10, aVar);
        }
        return aVar;
    }

    @Override // o2.InterfaceC4104f
    public s[] b() {
        return this.f46335J;
    }

    @Override // o2.InterfaceC4104f
    public void c() {
        this.f46327B.c();
    }

    @Override // o2.InterfaceC4104f
    public boolean d(InterfaceC4811q interfaceC4811q) {
        int i10 = this.f46327B.i(interfaceC4811q, f46326L);
        C1804a.g(i10 != 1);
        return i10 == 0;
    }

    @Override // o2.InterfaceC4104f
    public void e(InterfaceC4104f.b bVar, long j10, long j11) {
        this.f46332G = bVar;
        this.f46333H = j11;
        if (!this.f46331F) {
            this.f46327B.h(this);
            if (j10 != -9223372036854775807L) {
                this.f46327B.b(0L, j10);
            }
            this.f46331F = true;
            return;
        }
        InterfaceC4810p interfaceC4810p = this.f46327B;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        interfaceC4810p.b(0L, j10);
        for (int i10 = 0; i10 < this.f46330E.size(); i10++) {
            this.f46330E.valueAt(i10).g(bVar, j11);
        }
    }

    @Override // v2.r
    public void f(J j10) {
        this.f46334I = j10;
    }

    @Override // o2.InterfaceC4104f
    public C4801g g() {
        J j10 = this.f46334I;
        if (j10 instanceof C4801g) {
            return (C4801g) j10;
        }
        return null;
    }

    @Override // v2.r
    public void n() {
        s[] sVarArr = new s[this.f46330E.size()];
        for (int i10 = 0; i10 < this.f46330E.size(); i10++) {
            sVarArr[i10] = (s) C1804a.i(this.f46330E.valueAt(i10).f46340e);
        }
        this.f46335J = sVarArr;
    }
}
