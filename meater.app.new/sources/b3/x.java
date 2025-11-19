package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import v2.O;

/* compiled from: PassthroughSectionPayloadReader.java */
/* loaded from: classes.dex */
public final class x implements D {

    /* renamed from: a, reason: collision with root package name */
    private U1.s f30503a;

    /* renamed from: b, reason: collision with root package name */
    private X1.E f30504b;

    /* renamed from: c, reason: collision with root package name */
    private O f30505c;

    public x(String str) {
        this.f30503a = new s.b().s0(str).M();
    }

    private void a() {
        C1804a.i(this.f30504b);
        X1.L.i(this.f30505c);
    }

    @Override // b3.D
    public void b(X1.y yVar) {
        a();
        long jE = this.f30504b.e();
        long jF = this.f30504b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        U1.s sVar = this.f30503a;
        if (jF != sVar.f17167t) {
            U1.s sVarM = sVar.b().w0(jF).M();
            this.f30503a = sVarM;
            this.f30505c.f(sVarM);
        }
        int iA = yVar.a();
        this.f30505c.d(yVar, iA);
        this.f30505c.e(jE, 1, iA, 0, null);
    }

    @Override // b3.D
    public void c(X1.E e10, v2.r rVar, L.d dVar) {
        this.f30504b = e10;
        dVar.a();
        O oA = rVar.a(dVar.c(), 5);
        this.f30505c = oA;
        oA.f(this.f30503a);
    }
}
