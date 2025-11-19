package v2;

import U1.s;
import X1.C1804a;

/* compiled from: SingleSampleExtractor.java */
/* loaded from: classes.dex */
public final class L implements InterfaceC4810p {

    /* renamed from: a, reason: collision with root package name */
    private final int f51056a;

    /* renamed from: b, reason: collision with root package name */
    private final int f51057b;

    /* renamed from: c, reason: collision with root package name */
    private final String f51058c;

    /* renamed from: d, reason: collision with root package name */
    private int f51059d;

    /* renamed from: e, reason: collision with root package name */
    private int f51060e;

    /* renamed from: f, reason: collision with root package name */
    private r f51061f;

    /* renamed from: g, reason: collision with root package name */
    private O f51062g;

    public L(int i10, int i11, String str) {
        this.f51056a = i10;
        this.f51057b = i11;
        this.f51058c = str;
    }

    private void a(String str) {
        O oA = this.f51061f.a(1024, 4);
        this.f51062g = oA;
        oA.f(new s.b().s0(str).M());
        this.f51061f.n();
        this.f51061f.f(new M(-9223372036854775807L));
        this.f51060e = 1;
    }

    private void f(InterfaceC4811q interfaceC4811q) {
        int iC = ((O) C1804a.e(this.f51062g)).c(interfaceC4811q, 1024, true);
        if (iC != -1) {
            this.f51059d += iC;
            return;
        }
        this.f51060e = 2;
        this.f51062g.e(0L, 1, this.f51059d, 0, null);
        this.f51059d = 0;
    }

    @Override // v2.InterfaceC4810p
    public void b(long j10, long j11) {
        if (j10 == 0 || this.f51060e == 1) {
            this.f51060e = 1;
            this.f51059d = 0;
        }
    }

    @Override // v2.InterfaceC4810p
    public boolean d(InterfaceC4811q interfaceC4811q) {
        C1804a.g((this.f51056a == -1 || this.f51057b == -1) ? false : true);
        X1.y yVar = new X1.y(this.f51057b);
        interfaceC4811q.p(yVar.e(), 0, this.f51057b);
        return yVar.P() == this.f51056a;
    }

    @Override // v2.InterfaceC4810p
    public void h(r rVar) {
        this.f51061f = rVar;
        a(this.f51058c);
    }

    @Override // v2.InterfaceC4810p
    public int i(InterfaceC4811q interfaceC4811q, I i10) {
        int i11 = this.f51060e;
        if (i11 == 1) {
            f(interfaceC4811q);
            return 0;
        }
        if (i11 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // v2.InterfaceC4810p
    public void c() {
    }
}
