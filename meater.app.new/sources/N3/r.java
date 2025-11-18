package N3;

import L3.y;
import O3.a;
import android.graphics.Path;
import java.util.List;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public class r implements m, a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f12495b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12496c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.n f12497d;

    /* renamed from: e, reason: collision with root package name */
    private final O3.m f12498e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12499f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f12494a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f12500g = new b();

    public r(com.airbnb.lottie.n nVar, T3.b bVar, S3.r rVar) {
        this.f12495b = rVar.b();
        this.f12496c = rVar.d();
        this.f12497d = nVar;
        O3.m mVarH = rVar.c().h();
        this.f12498e = mVarH;
        bVar.j(mVarH);
        mVarH.a(this);
    }

    private void f() {
        this.f12499f = false;
        this.f12497d.invalidateSelf();
    }

    @Override // O3.a.b
    public void a() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // N3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.util.List<N3.c> r6, java.util.List<N3.c> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L39
            java.lang.Object r1 = r6.get(r0)
            N3.c r1 = (N3.c) r1
            boolean r2 = r1 instanceof N3.u
            if (r2 == 0) goto L26
            r2 = r1
            N3.u r2 = (N3.u) r2
            S3.t$a r3 = r2.k()
            S3.t$a r4 = S3.t.a.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            N3.b r1 = r5.f12500g
            r1.a(r2)
            r2.c(r5)
            goto L36
        L26:
            boolean r2 = r1 instanceof N3.s
            if (r2 == 0) goto L36
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            N3.s r1 = (N3.s) r1
            r7.add(r1)
        L36:
            int r0 = r0 + 1
            goto L2
        L39:
            O3.m r6 = r5.f12498e
            r6.r(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.r.b(java.util.List, java.util.List):void");
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        if (t10 == y.f9221P) {
            this.f12498e.o(cVar);
        }
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        X3.i.k(eVar, i10, list, eVar2, this);
    }

    @Override // N3.c
    public String getName() {
        return this.f12495b;
    }

    @Override // N3.m
    public Path h() {
        if (this.f12499f && !this.f12498e.k()) {
            return this.f12494a;
        }
        this.f12494a.reset();
        if (this.f12496c) {
            this.f12499f = true;
            return this.f12494a;
        }
        Path pathH = this.f12498e.h();
        if (pathH == null) {
            return this.f12494a;
        }
        this.f12494a.set(pathH);
        this.f12494a.setFillType(Path.FillType.EVEN_ODD);
        this.f12500g.b(this.f12494a);
        this.f12499f = true;
        return this.f12494a;
    }
}
