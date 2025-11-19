package b3;

import b3.L;
import v2.C4797c;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;
import v2.J;

/* compiled from: Ac4Extractor.java */
/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2216e implements InterfaceC4810p {

    /* renamed from: d, reason: collision with root package name */
    public static final v2.u f30226d = new v2.u() { // from class: b3.d
        @Override // v2.u
        public final InterfaceC4810p[] d() {
            return C2216e.f();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C2217f f30227a = new C2217f();

    /* renamed from: b, reason: collision with root package name */
    private final X1.y f30228b = new X1.y(16384);

    /* renamed from: c, reason: collision with root package name */
    private boolean f30229c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC4810p[] f() {
        return new InterfaceC4810p[]{new C2216e()};
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        this.f30229c = false;
        this.f30227a.a();
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
            interfaceC4811q.p(yVar.e(), 0, 7);
            yVar.W(0);
            int iP = yVar.P();
            if (iP == 44096 || iP == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = C4797c.g(yVar.e(), iP);
                if (iG2 == -1) {
                    return false;
                }
                interfaceC4811q.j(iG2 - 7);
            } else {
                interfaceC4811q.m();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC4811q.j(i12);
                i11 = 0;
            }
        }
    }

    @Override // v2.InterfaceC4810p
    public void h(v2.r rVar) {
        this.f30227a.d(rVar, new L.d(0, 1));
        rVar.n();
        rVar.f(new J.b(-9223372036854775807L));
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, v2.I i10) {
        int iE = interfaceC4811q.e(this.f30228b.e(), 0, 16384);
        if (iE == -1) {
            return -1;
        }
        this.f30228b.W(0);
        this.f30228b.V(iE);
        if (!this.f30229c) {
            this.f30227a.e(0L, 4);
            this.f30229c = true;
        }
        this.f30227a.b(this.f30228b);
        return 0;
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
