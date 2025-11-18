package N3;

import L3.C1360e;
import L3.y;
import O3.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.n f12363e;

    /* renamed from: f, reason: collision with root package name */
    protected final T3.b f12364f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f12366h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f12367i;

    /* renamed from: j, reason: collision with root package name */
    private final O3.a<?, Float> f12368j;

    /* renamed from: k, reason: collision with root package name */
    private final O3.a<?, Integer> f12369k;

    /* renamed from: l, reason: collision with root package name */
    private final List<O3.a<?, Float>> f12370l;

    /* renamed from: m, reason: collision with root package name */
    private final O3.a<?, Float> f12371m;

    /* renamed from: n, reason: collision with root package name */
    private O3.a<ColorFilter, ColorFilter> f12372n;

    /* renamed from: o, reason: collision with root package name */
    private O3.a<Float, Float> f12373o;

    /* renamed from: p, reason: collision with root package name */
    float f12374p;

    /* renamed from: q, reason: collision with root package name */
    private O3.c f12375q;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f12359a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f12360b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f12361c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f12362d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f12365g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<m> f12376a;

        /* renamed from: b, reason: collision with root package name */
        private final u f12377b;

        private b(u uVar) {
            this.f12376a = new ArrayList();
            this.f12377b = uVar;
        }
    }

    a(com.airbnb.lottie.n nVar, T3.b bVar, Paint.Cap cap, Paint.Join join, float f10, R3.d dVar, R3.b bVar2, List<R3.b> list, R3.b bVar3) {
        M3.a aVar = new M3.a(1);
        this.f12367i = aVar;
        this.f12374p = 0.0f;
        this.f12363e = nVar;
        this.f12364f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f12369k = dVar.h();
        this.f12368j = bVar2.h();
        if (bVar3 == null) {
            this.f12371m = null;
        } else {
            this.f12371m = bVar3.h();
        }
        this.f12370l = new ArrayList(list.size());
        this.f12366h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f12370l.add(list.get(i10).h());
        }
        bVar.j(this.f12369k);
        bVar.j(this.f12368j);
        for (int i11 = 0; i11 < this.f12370l.size(); i11++) {
            bVar.j(this.f12370l.get(i11));
        }
        O3.a<?, Float> aVar2 = this.f12371m;
        if (aVar2 != null) {
            bVar.j(aVar2);
        }
        this.f12369k.a(this);
        this.f12368j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f12370l.get(i12).a(this);
        }
        O3.a<?, Float> aVar3 = this.f12371m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            O3.a<Float, Float> aVarH = bVar.x().a().h();
            this.f12373o = aVarH;
            aVarH.a(this);
            bVar.j(this.f12373o);
        }
        if (bVar.z() != null) {
            this.f12375q = new O3.c(this, bVar, bVar.z());
        }
    }

    private void f(Matrix matrix) {
        if (C1360e.g()) {
            C1360e.b("StrokeContent#applyDashPattern");
        }
        if (this.f12370l.isEmpty()) {
            if (C1360e.g()) {
                C1360e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        float fG = X3.j.g(matrix);
        for (int i10 = 0; i10 < this.f12370l.size(); i10++) {
            this.f12366h[i10] = this.f12370l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f12366h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f12366h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f12366h;
            fArr3[i10] = fArr3[i10] * fG;
        }
        O3.a<?, Float> aVar = this.f12371m;
        this.f12367i.setPathEffect(new DashPathEffect(this.f12366h, aVar == null ? 0.0f : fG * aVar.h().floatValue()));
        if (C1360e.g()) {
            C1360e.c("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void j(android.graphics.Canvas r17, N3.a.b r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.a.j(android.graphics.Canvas, N3.a$b, android.graphics.Matrix):void");
    }

    @Override // O3.a.b
    public void a() {
        this.f12363e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // N3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.util.List<N3.c> r8, java.util.List<N3.c> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            N3.c r3 = (N3.c) r3
            boolean r4 = r3 instanceof N3.u
            if (r4 == 0) goto L1f
            N3.u r3 = (N3.u) r3
            S3.t$a r4 = r3.k()
            S3.t$a r5 = S3.t.a.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.c(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            N3.c r3 = (N3.c) r3
            boolean r4 = r3 instanceof N3.u
            if (r4 == 0) goto L55
            r4 = r3
            N3.u r4 = (N3.u) r4
            S3.t$a r5 = r4.k()
            S3.t$a r6 = S3.t.a.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<N3.a$b> r3 = r7.f12365g
            r3.add(r0)
        L4c:
            N3.a$b r0 = new N3.a$b
            r0.<init>(r4)
            r4.c(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof N3.m
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            N3.a$b r0 = new N3.a$b
            r0.<init>(r2)
        L60:
            java.util.List r4 = N3.a.b.a(r0)
            N3.m r3 = (N3.m) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<N3.a$b> r8 = r7.f12365g
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.a.b(java.util.List, java.util.List):void");
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        O3.c cVar2;
        O3.c cVar3;
        O3.c cVar4;
        O3.c cVar5;
        O3.c cVar6;
        if (t10 == y.f9225d) {
            this.f12369k.o(cVar);
            return;
        }
        if (t10 == y.f9240s) {
            this.f12368j.o(cVar);
            return;
        }
        if (t10 == y.f9216K) {
            O3.a<ColorFilter, ColorFilter> aVar = this.f12372n;
            if (aVar != null) {
                this.f12364f.I(aVar);
            }
            if (cVar == null) {
                this.f12372n = null;
                return;
            }
            O3.q qVar = new O3.q(cVar);
            this.f12372n = qVar;
            qVar.a(this);
            this.f12364f.j(this.f12372n);
            return;
        }
        if (t10 == y.f9231j) {
            O3.a<Float, Float> aVar2 = this.f12373o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            O3.q qVar2 = new O3.q(cVar);
            this.f12373o = qVar2;
            qVar2.a(this);
            this.f12364f.j(this.f12373o);
            return;
        }
        if (t10 == y.f9226e && (cVar6 = this.f12375q) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t10 == y.f9212G && (cVar5 = this.f12375q) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t10 == y.f9213H && (cVar4 = this.f12375q) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t10 == y.f9214I && (cVar3 = this.f12375q) != null) {
            cVar3.e(cVar);
        } else {
            if (t10 != y.f9215J || (cVar2 = this.f12375q) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        X3.i.k(eVar, i10, list, eVar2, this);
    }

    @Override // N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        if (C1360e.g()) {
            C1360e.b("StrokeContent#getBounds");
        }
        this.f12360b.reset();
        for (int i10 = 0; i10 < this.f12365g.size(); i10++) {
            b bVar = this.f12365g.get(i10);
            for (int i11 = 0; i11 < bVar.f12376a.size(); i11++) {
                this.f12360b.addPath(((m) bVar.f12376a.get(i11)).h(), matrix);
            }
        }
        this.f12360b.computeBounds(this.f12362d, false);
        float fQ = ((O3.d) this.f12368j).q();
        RectF rectF2 = this.f12362d;
        float f10 = fQ / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f12362d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (C1360e.g()) {
            C1360e.c("StrokeContent#getBounds");
        }
    }

    @Override // N3.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (C1360e.g()) {
            C1360e.b("StrokeContent#draw");
        }
        if (X3.j.h(matrix)) {
            if (C1360e.g()) {
                C1360e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        this.f12367i.setAlpha(X3.i.c((int) ((((i10 / 255.0f) * ((O3.f) this.f12369k).q()) / 100.0f) * 255.0f), 0, 255));
        this.f12367i.setStrokeWidth(((O3.d) this.f12368j).q() * X3.j.g(matrix));
        if (this.f12367i.getStrokeWidth() <= 0.0f) {
            if (C1360e.g()) {
                C1360e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        f(matrix);
        O3.a<ColorFilter, ColorFilter> aVar = this.f12372n;
        if (aVar != null) {
            this.f12367i.setColorFilter(aVar.h());
        }
        O3.a<Float, Float> aVar2 = this.f12373o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f12367i.setMaskFilter(null);
            } else if (fFloatValue != this.f12374p) {
                this.f12367i.setMaskFilter(this.f12364f.y(fFloatValue));
            }
            this.f12374p = fFloatValue;
        }
        O3.c cVar = this.f12375q;
        if (cVar != null) {
            cVar.b(this.f12367i);
        }
        for (int i11 = 0; i11 < this.f12365g.size(); i11++) {
            b bVar = this.f12365g.get(i11);
            if (bVar.f12377b != null) {
                j(canvas, bVar, matrix);
            } else {
                if (C1360e.g()) {
                    C1360e.b("StrokeContent#buildPath");
                }
                this.f12360b.reset();
                for (int size = bVar.f12376a.size() - 1; size >= 0; size--) {
                    this.f12360b.addPath(((m) bVar.f12376a.get(size)).h(), matrix);
                }
                if (C1360e.g()) {
                    C1360e.c("StrokeContent#buildPath");
                    C1360e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f12360b, this.f12367i);
                if (C1360e.g()) {
                    C1360e.c("StrokeContent#drawPath");
                }
            }
        }
        if (C1360e.g()) {
            C1360e.c("StrokeContent#draw");
        }
    }
}
