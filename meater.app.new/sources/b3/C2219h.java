package b3;

import X1.C1804a;
import androidx.media3.common.ParserException;
import b3.L;
import java.io.EOFException;
import v2.C4802h;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;

/* compiled from: AdtsExtractor.java */
/* renamed from: b3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219h implements InterfaceC4810p {

    /* renamed from: m, reason: collision with root package name */
    public static final v2.u f30244m = new v2.u() { // from class: b3.g
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return C2219h.l();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f30245a;

    /* renamed from: b, reason: collision with root package name */
    private final C2220i f30246b;

    /* renamed from: c, reason: collision with root package name */
    private final X1.y f30247c;

    /* renamed from: d, reason: collision with root package name */
    private final X1.y f30248d;

    /* renamed from: e, reason: collision with root package name */
    private final X1.x f30249e;

    /* renamed from: f, reason: collision with root package name */
    private v2.r f30250f;

    /* renamed from: g, reason: collision with root package name */
    private long f30251g;

    /* renamed from: h, reason: collision with root package name */
    private long f30252h;

    /* renamed from: i, reason: collision with root package name */
    private int f30253i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30254j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30255k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30256l;

    public C2219h() {
        this(0);
    }

    private void f(InterfaceC4811q interfaceC4811q) throws ParserException {
        int iH;
        if (this.f30254j) {
            return;
        }
        this.f30253i = -1;
        interfaceC4811q.m();
        long j10 = 0;
        if (interfaceC4811q.getPosition() == 0) {
            n(interfaceC4811q);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!interfaceC4811q.h(this.f30248d.e(), 0, 2, true)) {
                    break;
                }
                this.f30248d.W(0);
                if (!C2220i.m(this.f30248d.P())) {
                    break;
                }
                if (!interfaceC4811q.h(this.f30248d.e(), 0, 4, true)) {
                    break;
                }
                this.f30249e.p(14);
                iH = this.f30249e.h(13);
                if (iH <= 6) {
                    this.f30254j = true;
                    throw ParserException.a("Malformed ADTS stream", null);
                }
                j10 += iH;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC4811q.o(iH - 6, true));
        i10 = i11;
        interfaceC4811q.m();
        if (i10 > 0) {
            this.f30253i = (int) (j10 / i10);
        } else {
            this.f30253i = -1;
        }
        this.f30254j = true;
    }

    private static int g(int i10, long j10) {
        return (int) ((i10 * 8000000) / j10);
    }

    private v2.J k(long j10, boolean z10) {
        return new C4802h(j10, this.f30252h, g(this.f30253i, this.f30246b.k()), this.f30253i, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] l() {
        return new InterfaceC4810p[]{new C2219h()};
    }

    private void m(long j10, boolean z10) {
        if (this.f30256l) {
            return;
        }
        boolean z11 = (this.f30245a & 1) != 0 && this.f30253i > 0;
        if (z11 && this.f30246b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f30246b.k() == -9223372036854775807L) {
            this.f30250f.f(new J.b(-9223372036854775807L));
        } else {
            this.f30250f.f(k(j10, (this.f30245a & 2) != 0));
        }
        this.f30256l = true;
    }

    private int n(InterfaceC4811q interfaceC4811q) {
        int i10 = 0;
        while (true) {
            interfaceC4811q.p(this.f30248d.e(), 0, 10);
            this.f30248d.W(0);
            if (this.f30248d.K() != 4801587) {
                break;
            }
            this.f30248d.X(3);
            int iG = this.f30248d.G();
            i10 += iG + 10;
            interfaceC4811q.j(iG);
        }
        interfaceC4811q.m();
        interfaceC4811q.j(i10);
        if (this.f30252h == -1) {
            this.f30252h = i10;
        }
        return i10;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f30255k = false;
        this.f30246b.a();
        this.f30251g = j11;
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        int iN = n(interfaceC4811q);
        int i10 = iN;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC4811q.p(this.f30248d.e(), 0, 2);
            this.f30248d.W(0);
            if (C2220i.m(this.f30248d.P())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC4811q.p(this.f30248d.e(), 0, 4);
                this.f30249e.p(14);
                int iH = this.f30249e.h(13);
                if (iH <= 6) {
                    i10++;
                    interfaceC4811q.m();
                    interfaceC4811q.j(i10);
                } else {
                    interfaceC4811q.j(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                interfaceC4811q.m();
                interfaceC4811q.j(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iN < 8192);
        return false;
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        this.f30250f = rVar;
        this.f30246b.d(rVar, new L.d(0, 1));
        rVar.n();
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, v2.I i10) throws ParserException {
        C1804a.i(this.f30250f);
        long jA = interfaceC4811q.a();
        int i11 = this.f30245a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && jA != -1)) {
            f(interfaceC4811q);
        }
        int iE = interfaceC4811q.e(this.f30247c.e(), 0, 2048);
        boolean z10 = iE == -1;
        m(jA, z10);
        if (z10) {
            return -1;
        }
        this.f30247c.W(0);
        this.f30247c.V(iE);
        if (!this.f30255k) {
            this.f30246b.e(this.f30251g, 4);
            this.f30255k = true;
        }
        this.f30246b.b(this.f30247c);
        return 0;
    }

    public C2219h(int i10) {
        this.f30245a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f30246b = new C2220i(true);
        this.f30247c = new X1.y(2048);
        this.f30253i = -1;
        this.f30252h = -1L;
        X1.y yVar = new X1.y(10);
        this.f30248d = yVar;
        this.f30249e = new X1.x(yVar.e());
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
