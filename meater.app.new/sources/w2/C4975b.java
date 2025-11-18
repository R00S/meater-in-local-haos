package w2;

import U1.s;
import X1.C1804a;
import X1.L;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.util.Arrays;
import v2.C4802h;
import v2.C4807m;
import v2.E;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;
import v2.O;
import v2.r;
import v2.u;

/* compiled from: AmrExtractor.java */
/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4975b implements InterfaceC4810p {

    /* renamed from: s, reason: collision with root package name */
    public static final u f51799s = new u() { // from class: w2.a
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return C4975b.q();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f51800t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f51801u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f51802v = L.t0("#!AMR\n");

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f51803w = L.t0("#!AMR-WB\n");

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f51804a;

    /* renamed from: b, reason: collision with root package name */
    private final int f51805b;

    /* renamed from: c, reason: collision with root package name */
    private final O f51806c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f51807d;

    /* renamed from: e, reason: collision with root package name */
    private long f51808e;

    /* renamed from: f, reason: collision with root package name */
    private int f51809f;

    /* renamed from: g, reason: collision with root package name */
    private int f51810g;

    /* renamed from: h, reason: collision with root package name */
    private long f51811h;

    /* renamed from: i, reason: collision with root package name */
    private int f51812i;

    /* renamed from: j, reason: collision with root package name */
    private int f51813j;

    /* renamed from: k, reason: collision with root package name */
    private long f51814k;

    /* renamed from: l, reason: collision with root package name */
    private r f51815l;

    /* renamed from: m, reason: collision with root package name */
    private O f51816m;

    /* renamed from: n, reason: collision with root package name */
    private O f51817n;

    /* renamed from: o, reason: collision with root package name */
    private J f51818o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f51819p;

    /* renamed from: q, reason: collision with root package name */
    private long f51820q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f51821r;

    public C4975b() {
        this(0);
    }

    private void f() {
        C1804a.i(this.f51816m);
        L.i(this.f51815l);
    }

    private static int g(int i10, long j10) {
        return (int) ((i10 * 8000000) / j10);
    }

    private J k(long j10, boolean z10) {
        return new C4802h(j10, this.f51811h, g(this.f51812i, 20000L), this.f51812i, z10);
    }

    private int l(int i10) throws ParserException {
        if (o(i10)) {
            return this.f51807d ? f51801u[i10] : f51800t[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f51807d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw ParserException.a(sb2.toString(), null);
    }

    private boolean m(int i10) {
        return !this.f51807d && (i10 < 12 || i10 > 14);
    }

    private boolean n(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    private boolean o(int i10) {
        return i10 >= 0 && i10 <= 15 && (p(i10) || m(i10));
    }

    private boolean p(int i10) {
        return this.f51807d && (i10 < 10 || i10 > 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] q() {
        return new InterfaceC4810p[]{new C4975b()};
    }

    private void r() {
        if (this.f51821r) {
            return;
        }
        this.f51821r = true;
        boolean z10 = this.f51807d;
        this.f51817n.f(new s.b().s0(z10 ? "audio/amr-wb" : "audio/3gpp").j0(z10 ? f51801u[8] : f51800t[7]).Q(1).t0(z10 ? 16000 : 8000).M());
    }

    private void s(long j10, int i10) {
        int i11;
        if (this.f51818o != null) {
            return;
        }
        int i12 = this.f51805b;
        if ((i12 & 4) != 0) {
            this.f51818o = new E(new long[]{this.f51811h}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f51812i) == -1 || i11 == this.f51809f)) {
            this.f51818o = new J.b(-9223372036854775807L);
        } else if (this.f51813j >= 20 || i10 == -1) {
            this.f51818o = k(j10, (i12 & 2) != 0);
        }
        J j11 = this.f51818o;
        if (j11 != null) {
            this.f51815l.f(j11);
        }
    }

    private static boolean t(InterfaceC4811q interfaceC4811q, byte[] bArr) {
        interfaceC4811q.m();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC4811q.p(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int u(InterfaceC4811q interfaceC4811q) throws ParserException {
        interfaceC4811q.m();
        interfaceC4811q.p(this.f51804a, 0, 1);
        byte b10 = this.f51804a[0];
        if ((b10 & 131) <= 0) {
            return l((b10 >> 3) & 15);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean v(InterfaceC4811q interfaceC4811q) {
        byte[] bArr = f51802v;
        if (t(interfaceC4811q, bArr)) {
            this.f51807d = false;
            interfaceC4811q.n(bArr.length);
            return true;
        }
        byte[] bArr2 = f51803w;
        if (!t(interfaceC4811q, bArr2)) {
            return false;
        }
        this.f51807d = true;
        interfaceC4811q.n(bArr2.length);
        return true;
    }

    private int w(InterfaceC4811q interfaceC4811q) throws ParserException {
        if (this.f51810g == 0) {
            try {
                int iU = u(interfaceC4811q);
                this.f51809f = iU;
                this.f51810g = iU;
                if (this.f51812i == -1) {
                    this.f51811h = interfaceC4811q.getPosition();
                    this.f51812i = this.f51809f;
                }
                if (this.f51812i == this.f51809f) {
                    this.f51813j++;
                }
                J j10 = this.f51818o;
                if (j10 instanceof E) {
                    E e10 = (E) j10;
                    long j11 = this.f51814k + this.f51808e + 20000;
                    long position = interfaceC4811q.getPosition() + this.f51809f;
                    if (!e10.c(j11, 100000L)) {
                        e10.b(j11, position);
                    }
                    if (this.f51819p && n(j11, this.f51820q)) {
                        this.f51819p = false;
                        this.f51817n = this.f51816m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iC = this.f51817n.c(interfaceC4811q, this.f51810g, true);
        if (iC == -1) {
            return -1;
        }
        int i10 = this.f51810g - iC;
        this.f51810g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f51817n.e(this.f51814k + this.f51808e, 1, this.f51809f, 0, null);
        this.f51808e += 20000;
        return 0;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f51808e = 0L;
        this.f51809f = 0;
        this.f51810g = 0;
        this.f51820q = j11;
        J j12 = this.f51818o;
        if (!(j12 instanceof E)) {
            if (j10 == 0 || !(j12 instanceof C4802h)) {
                this.f51814k = 0L;
                return;
            } else {
                this.f51814k = ((C4802h) j12).c(j10);
                return;
            }
        }
        long jA = ((E) j12).a(j10);
        this.f51814k = jA;
        if (n(jA, this.f51820q)) {
            return;
        }
        this.f51819p = true;
        this.f51817n = this.f51806c;
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        return v(interfaceC4811q);
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f51815l = rVar;
        O oA = rVar.a(0, 1);
        this.f51816m = oA;
        this.f51817n = oA;
        rVar.n();
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) throws ParserException {
        f();
        if (interfaceC4811q.getPosition() == 0 && !v(interfaceC4811q)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        r();
        int iW = w(interfaceC4811q);
        s(interfaceC4811q.a(), iW);
        if (iW == -1) {
            J j10 = this.f51818o;
            if (j10 instanceof E) {
                ((E) j10).d(this.f51814k + this.f51808e);
                this.f51815l.f(this.f51818o);
            }
        }
        return iW;
    }

    public C4975b(int i10) {
        this.f51805b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f51804a = new byte[1];
        this.f51812i = -1;
        C4807m c4807m = new C4807m();
        this.f51806c = c4807m;
        this.f51817n = c4807m;
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
