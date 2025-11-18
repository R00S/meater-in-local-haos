package b3;

import U1.s;
import X1.C1804a;
import androidx.media3.common.ParserException;
import b3.L;
import java.util.concurrent.atomic.AtomicInteger;
import v2.C4809o;
import v2.O;

/* compiled from: DtsReader.java */
/* renamed from: b3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2222k implements InterfaceC2224m {

    /* renamed from: a, reason: collision with root package name */
    private final X1.y f30282a;

    /* renamed from: c, reason: collision with root package name */
    private final String f30284c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30285d;

    /* renamed from: e, reason: collision with root package name */
    private String f30286e;

    /* renamed from: f, reason: collision with root package name */
    private O f30287f;

    /* renamed from: h, reason: collision with root package name */
    private int f30289h;

    /* renamed from: i, reason: collision with root package name */
    private int f30290i;

    /* renamed from: j, reason: collision with root package name */
    private long f30291j;

    /* renamed from: k, reason: collision with root package name */
    private U1.s f30292k;

    /* renamed from: l, reason: collision with root package name */
    private int f30293l;

    /* renamed from: m, reason: collision with root package name */
    private int f30294m;

    /* renamed from: g, reason: collision with root package name */
    private int f30288g = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f30297p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f30283b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    private int f30295n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f30296o = -1;

    public C2222k(String str, int i10, int i11) {
        this.f30282a = new X1.y(new byte[i11]);
        this.f30284c = str;
        this.f30285d = i10;
    }

    private boolean f(X1.y yVar, byte[] bArr, int i10) {
        int iMin = Math.min(yVar.a(), i10 - this.f30289h);
        yVar.l(bArr, this.f30289h, iMin);
        int i11 = this.f30289h + iMin;
        this.f30289h = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] bArrE = this.f30282a.e();
        if (this.f30292k == null) {
            U1.s sVarH = C4809o.h(bArrE, this.f30286e, this.f30284c, this.f30285d, null);
            this.f30292k = sVarH;
            this.f30287f.f(sVarH);
        }
        this.f30293l = C4809o.b(bArrE);
        this.f30291j = p8.f.d(X1.L.c1(C4809o.g(bArrE), this.f30292k.f17138E));
    }

    private void h() throws ParserException {
        C4809o.b bVarI = C4809o.i(this.f30282a.e());
        k(bVarI);
        this.f30293l = bVarI.f51220d;
        long j10 = bVarI.f51221e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f30291j = j10;
    }

    private void i() throws ParserException {
        C4809o.b bVarK = C4809o.k(this.f30282a.e(), this.f30283b);
        if (this.f30294m == 3) {
            k(bVarK);
        }
        this.f30293l = bVarK.f51220d;
        long j10 = bVarK.f51221e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f30291j = j10;
    }

    private boolean j(X1.y yVar) {
        while (yVar.a() > 0) {
            int i10 = this.f30290i << 8;
            this.f30290i = i10;
            int iH = i10 | yVar.H();
            this.f30290i = iH;
            int iC = C4809o.c(iH);
            this.f30294m = iC;
            if (iC != 0) {
                byte[] bArrE = this.f30282a.e();
                int i11 = this.f30290i;
                bArrE[0] = (byte) ((i11 >> 24) & 255);
                bArrE[1] = (byte) ((i11 >> 16) & 255);
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                this.f30289h = 4;
                this.f30290i = 0;
                return true;
            }
        }
        return false;
    }

    private void k(C4809o.b bVar) {
        int i10;
        int i11 = bVar.f51218b;
        if (i11 == -2147483647 || (i10 = bVar.f51219c) == -1) {
            return;
        }
        U1.s sVar = this.f30292k;
        if (sVar != null && i10 == sVar.f17137D && i11 == sVar.f17138E && X1.L.d(bVar.f51217a, sVar.f17162o)) {
            return;
        }
        U1.s sVar2 = this.f30292k;
        U1.s sVarM = (sVar2 == null ? new s.b() : sVar2.b()).e0(this.f30286e).s0(bVar.f51217a).Q(bVar.f51219c).t0(bVar.f51218b).i0(this.f30284c).q0(this.f30285d).M();
        this.f30292k = sVarM;
        this.f30287f.f(sVarM);
    }

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30288g = 0;
        this.f30289h = 0;
        this.f30290i = 0;
        this.f30297p = -9223372036854775807L;
        this.f30283b.set(0);
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) throws ParserException {
        C1804a.i(this.f30287f);
        while (yVar.a() > 0) {
            switch (this.f30288g) {
                case 0:
                    if (!j(yVar)) {
                        break;
                    } else {
                        int i10 = this.f30294m;
                        if (i10 != 3 && i10 != 4) {
                            if (i10 != 1) {
                                this.f30288g = 2;
                                break;
                            } else {
                                this.f30288g = 1;
                                break;
                            }
                        } else {
                            this.f30288g = 4;
                            break;
                        }
                    }
                    break;
                case 1:
                    if (!f(yVar, this.f30282a.e(), 18)) {
                        break;
                    } else {
                        g();
                        this.f30282a.W(0);
                        this.f30287f.d(this.f30282a, 18);
                        this.f30288g = 6;
                        break;
                    }
                case 2:
                    if (!f(yVar, this.f30282a.e(), 7)) {
                        break;
                    } else {
                        this.f30295n = C4809o.j(this.f30282a.e());
                        this.f30288g = 3;
                        break;
                    }
                case 3:
                    if (!f(yVar, this.f30282a.e(), this.f30295n)) {
                        break;
                    } else {
                        h();
                        this.f30282a.W(0);
                        this.f30287f.d(this.f30282a, this.f30295n);
                        this.f30288g = 6;
                        break;
                    }
                case 4:
                    if (!f(yVar, this.f30282a.e(), 6)) {
                        break;
                    } else {
                        int iL = C4809o.l(this.f30282a.e());
                        this.f30296o = iL;
                        int i11 = this.f30289h;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f30289h = i11 - i12;
                            yVar.W(yVar.f() - i12);
                        }
                        this.f30288g = 5;
                        break;
                    }
                case 5:
                    if (!f(yVar, this.f30282a.e(), this.f30296o)) {
                        break;
                    } else {
                        i();
                        this.f30282a.W(0);
                        this.f30287f.d(this.f30282a, this.f30296o);
                        this.f30288g = 6;
                        break;
                    }
                case 6:
                    int iMin = Math.min(yVar.a(), this.f30293l - this.f30289h);
                    this.f30287f.d(yVar, iMin);
                    int i13 = this.f30289h + iMin;
                    this.f30289h = i13;
                    if (i13 == this.f30293l) {
                        C1804a.g(this.f30297p != -9223372036854775807L);
                        this.f30287f.e(this.f30297p, this.f30294m == 4 ? 0 : 1, this.f30293l, 0, null);
                        this.f30297p += this.f30291j;
                        this.f30288g = 0;
                        break;
                    } else {
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        this.f30286e = dVar.b();
        this.f30287f = rVar.a(dVar.c(), 1);
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        this.f30297p = j10;
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
    }
}
