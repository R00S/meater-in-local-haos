package b3;

import U1.s;
import X1.C1804a;
import b3.L;
import java.util.List;
import v2.C4800f;
import v2.O;

/* compiled from: UserDataReader.java */
/* loaded from: classes.dex */
final class N {

    /* renamed from: a, reason: collision with root package name */
    private final List<U1.s> f30207a;

    /* renamed from: b, reason: collision with root package name */
    private final O[] f30208b;

    public N(List<U1.s> list) {
        this.f30207a = list;
        this.f30208b = new O[list.size()];
    }

    public void a(long j10, X1.y yVar) {
        if (yVar.a() < 9) {
            return;
        }
        int iQ = yVar.q();
        int iQ2 = yVar.q();
        int iH = yVar.H();
        if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
            C4800f.b(j10, yVar, this.f30208b);
        }
    }

    public void b(v2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f30208b.length; i10++) {
            dVar.a();
            O oA = rVar.a(dVar.c(), 3);
            U1.s sVar = this.f30207a.get(i10);
            String str = sVar.f17162o;
            C1804a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            oA.f(new s.b().e0(dVar.b()).s0(str).u0(sVar.f17152e).i0(sVar.f17151d).N(sVar.f17142I).f0(sVar.f17165r).M());
            this.f30208b[i10] = oA;
        }
    }
}
