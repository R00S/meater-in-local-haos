package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import v2.O;

/* compiled from: Id3Reader.java */
/* loaded from: classes.dex */
public final class r implements InterfaceC2224m {

    /* renamed from: b, reason: collision with root package name */
    private O f30430b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30431c;

    /* renamed from: e, reason: collision with root package name */
    private int f30433e;

    /* renamed from: f, reason: collision with root package name */
    private int f30434f;

    /* renamed from: a, reason: collision with root package name */
    private final X1.y f30429a = new X1.y(10);

    /* renamed from: d, reason: collision with root package name */
    private long f30432d = -9223372036854775807L;

    @Override // b3.InterfaceC2224m
    public void a() {
        this.f30431c = false;
        this.f30432d = -9223372036854775807L;
    }

    @Override // b3.InterfaceC2224m
    public void b(X1.y yVar) {
        C1804a.i(this.f30430b);
        if (this.f30431c) {
            int iA = yVar.a();
            int i10 = this.f30434f;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(yVar.e(), yVar.f(), this.f30429a.e(), this.f30434f, iMin);
                if (this.f30434f + iMin == 10) {
                    this.f30429a.W(0);
                    if (73 != this.f30429a.H() || 68 != this.f30429a.H() || 51 != this.f30429a.H()) {
                        X1.n.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f30431c = false;
                        return;
                    } else {
                        this.f30429a.X(3);
                        this.f30433e = this.f30429a.G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f30433e - this.f30434f);
            this.f30430b.d(yVar, iMin2);
            this.f30434f += iMin2;
        }
    }

    @Override // b3.InterfaceC2224m
    public void c(boolean z10) {
        int i10;
        C1804a.i(this.f30430b);
        if (this.f30431c && (i10 = this.f30433e) != 0 && this.f30434f == i10) {
            C1804a.g(this.f30432d != -9223372036854775807L);
            this.f30430b.e(this.f30432d, 1, this.f30433e, 0, null);
            this.f30431c = false;
        }
    }

    @Override // b3.InterfaceC2224m
    public void d(v2.r rVar, L.d dVar) {
        dVar.a();
        O oA = rVar.a(dVar.c(), 5);
        this.f30430b = oA;
        oA.f(new s.b().e0(dVar.b()).s0("application/id3").M());
    }

    @Override // b3.InterfaceC2224m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f30431c = true;
        this.f30432d = j10;
        this.f30433e = 0;
        this.f30434f = 0;
    }
}
