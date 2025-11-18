package b3;

import U1.s;
import X1.C1804a;
import Y1.g;
import b3.L;
import java.util.List;
import v2.C4800f;
import v2.O;

/* compiled from: SeiReader.java */
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final List<U1.s> f30149a;

    /* renamed from: b, reason: collision with root package name */
    private final O[] f30150b;

    /* renamed from: c, reason: collision with root package name */
    private final Y1.g f30151c = new Y1.g(new g.b() { // from class: b3.F
        @Override // Y1.g.b
        public final void a(long j10, X1.y yVar) {
            this.f30148a.e(j10, yVar);
        }
    });

    public G(List<U1.s> list) {
        this.f30149a = list;
        this.f30150b = new O[list.size()];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(long j10, X1.y yVar) {
        C4800f.a(j10, yVar, this.f30150b);
    }

    public void b(long j10, X1.y yVar) {
        this.f30151c.a(j10, yVar);
    }

    public void c(v2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f30150b.length; i10++) {
            dVar.a();
            O oA = rVar.a(dVar.c(), 3);
            U1.s sVar = this.f30149a.get(i10);
            String str = sVar.f17162o;
            C1804a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = sVar.f17148a;
            if (strB == null) {
                strB = dVar.b();
            }
            oA.f(new s.b().e0(strB).s0(str).u0(sVar.f17152e).i0(sVar.f17151d).N(sVar.f17142I).f0(sVar.f17165r).M());
            this.f30150b[i10] = oA;
        }
    }

    public void d() {
        this.f30151c.c();
    }

    public void f(int i10) {
        this.f30151c.f(i10);
    }
}
