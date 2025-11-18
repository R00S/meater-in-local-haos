package N3;

import L3.y;
import O3.a;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c, reason: collision with root package name */
    private final String f12471c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12472d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.n f12473e;

    /* renamed from: f, reason: collision with root package name */
    private final O3.a<?, PointF> f12474f;

    /* renamed from: g, reason: collision with root package name */
    private final O3.a<?, PointF> f12475g;

    /* renamed from: h, reason: collision with root package name */
    private final O3.a<?, Float> f12476h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12479k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f12469a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f12470b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final b f12477i = new b();

    /* renamed from: j, reason: collision with root package name */
    private O3.a<Float, Float> f12478j = null;

    public o(com.airbnb.lottie.n nVar, T3.b bVar, S3.l lVar) {
        this.f12471c = lVar.c();
        this.f12472d = lVar.f();
        this.f12473e = nVar;
        O3.a<PointF, PointF> aVarH = lVar.d().h();
        this.f12474f = aVarH;
        O3.a<PointF, PointF> aVarH2 = lVar.e().h();
        this.f12475g = aVarH2;
        O3.a<Float, Float> aVarH3 = lVar.b().h();
        this.f12476h = aVarH3;
        bVar.j(aVarH);
        bVar.j(aVarH2);
        bVar.j(aVarH3);
        aVarH.a(this);
        aVarH2.a(this);
        aVarH3.a(this);
    }

    private void f() {
        this.f12479k = false;
        this.f12473e.invalidateSelf();
    }

    @Override // O3.a.b
    public void a() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // N3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.util.List<N3.c> r5, java.util.List<N3.c> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            N3.c r0 = (N3.c) r0
            boolean r1 = r0 instanceof N3.u
            if (r1 == 0) goto L25
            r1 = r0
            N3.u r1 = (N3.u) r1
            S3.t$a r2 = r1.k()
            S3.t$a r3 = S3.t.a.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            N3.b r0 = r4.f12477i
            r0.a(r1)
            r1.c(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof N3.q
            if (r1 == 0) goto L31
            N3.q r0 = (N3.q) r0
            O3.a r0 = r0.f()
            r4.f12478j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.o.b(java.util.List, java.util.List):void");
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        if (t10 == y.f9233l) {
            this.f12475g.o(cVar);
        } else if (t10 == y.f9235n) {
            this.f12474f.o(cVar);
        } else if (t10 == y.f9234m) {
            this.f12476h.o(cVar);
        }
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        X3.i.k(eVar, i10, list, eVar2, this);
    }

    @Override // N3.c
    public String getName() {
        return this.f12471c;
    }

    @Override // N3.m
    public Path h() {
        O3.a<Float, Float> aVar;
        if (this.f12479k) {
            return this.f12469a;
        }
        this.f12469a.reset();
        if (this.f12472d) {
            this.f12479k = true;
            return this.f12469a;
        }
        PointF pointFH = this.f12475g.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        O3.a<?, Float> aVar2 = this.f12476h;
        float fQ = aVar2 == null ? 0.0f : ((O3.d) aVar2).q();
        if (fQ == 0.0f && (aVar = this.f12478j) != null) {
            fQ = Math.min(aVar.h().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fQ > fMin) {
            fQ = fMin;
        }
        PointF pointFH2 = this.f12474f.h();
        this.f12469a.moveTo(pointFH2.x + f10, (pointFH2.y - f11) + fQ);
        this.f12469a.lineTo(pointFH2.x + f10, (pointFH2.y + f11) - fQ);
        if (fQ > 0.0f) {
            RectF rectF = this.f12470b;
            float f12 = pointFH2.x;
            float f13 = fQ * 2.0f;
            float f14 = pointFH2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f12469a.arcTo(this.f12470b, 0.0f, 90.0f, false);
        }
        this.f12469a.lineTo((pointFH2.x - f10) + fQ, pointFH2.y + f11);
        if (fQ > 0.0f) {
            RectF rectF2 = this.f12470b;
            float f15 = pointFH2.x;
            float f16 = pointFH2.y;
            float f17 = fQ * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f12469a.arcTo(this.f12470b, 90.0f, 90.0f, false);
        }
        this.f12469a.lineTo(pointFH2.x - f10, (pointFH2.y - f11) + fQ);
        if (fQ > 0.0f) {
            RectF rectF3 = this.f12470b;
            float f18 = pointFH2.x;
            float f19 = pointFH2.y;
            float f20 = fQ * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f12469a.arcTo(this.f12470b, 180.0f, 90.0f, false);
        }
        this.f12469a.lineTo((pointFH2.x + f10) - fQ, pointFH2.y - f11);
        if (fQ > 0.0f) {
            RectF rectF4 = this.f12470b;
            float f21 = pointFH2.x;
            float f22 = fQ * 2.0f;
            float f23 = pointFH2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f12469a.arcTo(this.f12470b, 270.0f, 90.0f, false);
        }
        this.f12469a.close();
        this.f12477i.b(this.f12469a);
        this.f12479k = true;
        return this.f12469a;
    }
}
