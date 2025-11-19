package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import v2.F;
import v2.O;

/* compiled from: MpegAudioReader.java */
/* loaded from: classes.dex */
public final class t implements InterfaceC2224m {

    /* renamed from: a, reason: collision with root package name */
    private final X1.y f30457a;

    /* renamed from: b, reason: collision with root package name */
    private final F.a f30458b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30459c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30460d;

    /* renamed from: e, reason: collision with root package name */
    private O f30461e;

    /* renamed from: f, reason: collision with root package name */
    private String f30462f;

    /* renamed from: g, reason: collision with root package name */
    private int f30463g;

    /* renamed from: h, reason: collision with root package name */
    private int f30464h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30465i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f30466j;

    /* renamed from: k, reason: collision with root package name */
    private long f30467k;

    /* renamed from: l, reason: collision with root package name */
    private int f30468l;

    /* renamed from: m, reason: collision with root package name */
    private long f30469m;

    public t() {
        this(null, 0);
    }

    private void f(X1.y yVar) {
        byte[] bArrE = yVar.e();
        int iG = yVar.g();
        for (int iF = yVar.f(); iF < iG; iF++) {
            byte b10 = bArrE[iF];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f30466j && (b10 & 224) == 224;
            this.f30466j = z10;
            if (z11) {
                yVar.W(iF + 1);
                this.f30466j = false;
                this.f30457a.e()[1] = bArrE[iF];
                this.f30464h = 2;
                this.f30463g = 1;
                return;
            }
        }
        yVar.W(iG);
    }

    private void g(X1.y yVar) {
        int iMin = Math.min(yVar.a(), this.f30468l - this.f30464h);
        this.f30461e.d(yVar, iMin);
        int i10 = this.f30464h + iMin;
        this.f30464h = i10;
        if (i10 < this.f30468l) {
            return;
        }
        C1804a.g(this.f30469m != -9223372036854775807L);
        this.f30461e.e(this.f30469m, 1, this.f30468l, 0, null);
        this.f30469m += this.f30467k;
        this.f30464h = 0;
        this.f30463g = 0;
    }

    private void h(X1.y yVar) {
        int iMin = Math.min(yVar.a(), 4 - this.f30464h);
        yVar.l(this.f30457a.e(), this.f30464h, iMin);
        int i10 = this.f30464h + iMin;
        this.f30464h = i10;
        if (i10 < 4) {
            return;
        }
        this.f30457a.W(0);
        if (!this.f30458b.a(this.f30457a.q())) {
            this.f30464h = 0;
            this.f30463g = 1;
            return;
        }
        this.f30468l = this.f30458b.f51043c;
        if (!this.f30465i) {
            this.f30467k = (r8.f51047g * 1000000) / r8.f51044d;
            this.f30461e.f(new s.b().e0(this.f30462f).s0(this.f30458b.f51042b).j0(4096).Q(this.f30458b.f51045e).t0(this.f30458b.f51044d).i0(this.f30459c).q0(this.f30460d).M());
            this.f30465i = true;
        }
        this.f30457a.W(0);
        this.f30461e.d(this.f30457a, 4);
        this.f30463g = 2;
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30463g = 0;
        this.f30464h = 0;
        this.f30466j = false;
        this.f30469m = -9223372036854775807L;
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        C1804a.i(this.f30461e);
        while (yVar.a() > 0) {
            int i10 = this.f30463g;
            if (i10 == 0) {
                f(yVar);
            } else if (i10 == 1) {
                h(yVar);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(yVar);
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30462f = dVar.b();
        this.f30461e = rVar.a(dVar.c(), 1);
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30469m = j10;
    }

    public t(String str, int i10) {
        this.f30463g = 0;
        X1.y yVar = new X1.y(4);
        this.f30457a = yVar;
        yVar.e()[0] = -1;
        this.f30458b = new F.a();
        this.f30469m = -9223372036854775807L;
        this.f30459c = str;
        this.f30460d = i10;
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
    }
}
