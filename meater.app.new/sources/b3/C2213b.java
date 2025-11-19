package b3;

import b3.L;
import v2.C4796b;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;

/* compiled from: Ac3Extractor.java */
/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2213b implements InterfaceC4810p {

    /* renamed from: d, reason: collision with root package name */
    public static final v2.u f30209d = new v2.u() { // from class: b3.a
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return C2213b.f();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C2214c f30210a = new C2214c();

    /* renamed from: b, reason: collision with root package name */
    private final X1.y f30211b = new X1.y(2786);

    /* renamed from: c, reason: collision with root package name */
    private boolean f30212c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] f() {
        return new InterfaceC4810p[]{new C2213b()};
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f30212c = false;
        this.f30210a.a();
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        X1.y yVar = new X1.y(10);
        int i10 = 0;
        while (true) {
            interfaceC4811q.p(yVar.e(), 0, 10);
            yVar.W(0);
            if (yVar.K() != 4801587) {
                break;
            }
            yVar.X(3);
            int iG = yVar.G();
            i10 += iG + 10;
            interfaceC4811q.j(iG);
        }
        interfaceC4811q.m();
        interfaceC4811q.j(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC4811q.p(yVar.e(), 0, 6);
            yVar.W(0);
            if (yVar.P() != 2935) {
                interfaceC4811q.m();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC4811q.j(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = C4796b.g(yVar.e());
                if (iG2 == -1) {
                    return false;
                }
                interfaceC4811q.j(iG2 - 6);
            }
        }
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        this.f30210a.d(rVar, new L.d(0, 1));
        rVar.n();
        rVar.f(new J.b(-9223372036854775807L));
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, v2.I i10) {
        int iE = interfaceC4811q.e(this.f30211b.e(), 0, 2786);
        if (iE == -1) {
            return -1;
        }
        this.f30211b.W(0);
        this.f30211b.V(iE);
        if (!this.f30212c) {
            this.f30210a.e(0L, 4);
            this.f30212c = true;
        }
        this.f30210a.b(this.f30211b);
        return 0;
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
