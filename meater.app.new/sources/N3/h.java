package N3;

import L3.C1360e;
import L3.y;
import O3.a;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import s.C4411v;

/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final String f12411a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12412b;

    /* renamed from: c, reason: collision with root package name */
    private final T3.b f12413c;

    /* renamed from: d, reason: collision with root package name */
    private final C4411v<LinearGradient> f12414d = new C4411v<>();

    /* renamed from: e, reason: collision with root package name */
    private final C4411v<RadialGradient> f12415e = new C4411v<>();

    /* renamed from: f, reason: collision with root package name */
    private final Path f12416f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f12417g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f12418h;

    /* renamed from: i, reason: collision with root package name */
    private final List<m> f12419i;

    /* renamed from: j, reason: collision with root package name */
    private final S3.g f12420j;

    /* renamed from: k, reason: collision with root package name */
    private final O3.a<S3.d, S3.d> f12421k;

    /* renamed from: l, reason: collision with root package name */
    private final O3.a<Integer, Integer> f12422l;

    /* renamed from: m, reason: collision with root package name */
    private final O3.a<PointF, PointF> f12423m;

    /* renamed from: n, reason: collision with root package name */
    private final O3.a<PointF, PointF> f12424n;

    /* renamed from: o, reason: collision with root package name */
    private O3.a<ColorFilter, ColorFilter> f12425o;

    /* renamed from: p, reason: collision with root package name */
    private O3.q f12426p;

    /* renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.n f12427q;

    /* renamed from: r, reason: collision with root package name */
    private final int f12428r;

    /* renamed from: s, reason: collision with root package name */
    private O3.a<Float, Float> f12429s;

    /* renamed from: t, reason: collision with root package name */
    float f12430t;

    /* renamed from: u, reason: collision with root package name */
    private O3.c f12431u;

    public h(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar, S3.e eVar) {
        Path path = new Path();
        this.f12416f = path;
        this.f12417g = new M3.a(1);
        this.f12418h = new RectF();
        this.f12419i = new ArrayList();
        this.f12430t = 0.0f;
        this.f12413c = bVar;
        this.f12411a = eVar.f();
        this.f12412b = eVar.i();
        this.f12427q = nVar;
        this.f12420j = eVar.e();
        path.setFillType(eVar.c());
        this.f12428r = (int) (iVar.d() / 32.0f);
        O3.a<S3.d, S3.d> aVarH = eVar.d().h();
        this.f12421k = aVarH;
        aVarH.a(this);
        bVar.j(aVarH);
        O3.a<Integer, Integer> aVarH2 = eVar.g().h();
        this.f12422l = aVarH2;
        aVarH2.a(this);
        bVar.j(aVarH2);
        O3.a<PointF, PointF> aVarH3 = eVar.h().h();
        this.f12423m = aVarH3;
        aVarH3.a(this);
        bVar.j(aVarH3);
        O3.a<PointF, PointF> aVarH4 = eVar.b().h();
        this.f12424n = aVarH4;
        aVarH4.a(this);
        bVar.j(aVarH4);
        if (bVar.x() != null) {
            O3.a<Float, Float> aVarH5 = bVar.x().a().h();
            this.f12429s = aVarH5;
            aVarH5.a(this);
            bVar.j(this.f12429s);
        }
        if (bVar.z() != null) {
            this.f12431u = new O3.c(this, bVar, bVar.z());
        }
    }

    private int[] f(int[] iArr) {
        O3.q qVar = this.f12426p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int iRound = Math.round(this.f12423m.f() * this.f12428r);
        int iRound2 = Math.round(this.f12424n.f() * this.f12428r);
        int iRound3 = Math.round(this.f12421k.f() * this.f12428r);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient k() {
        long j10 = j();
        LinearGradient linearGradientF = this.f12414d.f(j10);
        if (linearGradientF != null) {
            return linearGradientF;
        }
        PointF pointFH = this.f12423m.h();
        PointF pointFH2 = this.f12424n.h();
        S3.d dVarH = this.f12421k.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, f(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f12414d.k(j10, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        long j10 = j();
        RadialGradient radialGradientF = this.f12415e.f(j10);
        if (radialGradientF != null) {
            return radialGradientF;
        }
        PointF pointFH = this.f12423m.h();
        PointF pointFH2 = this.f12424n.h();
        S3.d dVarH = this.f12421k.h();
        int[] iArrF = f(dVarH.d());
        float[] fArrE = dVarH.e();
        float f10 = pointFH.x;
        float f11 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f10, pointFH2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArrF, fArrE, Shader.TileMode.CLAMP);
        this.f12415e.k(j10, radialGradient);
        return radialGradient;
    }

    @Override // O3.a.b
    public void a() {
        this.f12427q.invalidateSelf();
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f12419i.add((m) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        O3.c cVar2;
        O3.c cVar3;
        O3.c cVar4;
        O3.c cVar5;
        O3.c cVar6;
        if (t10 == y.f9225d) {
            this.f12422l.o(cVar);
            return;
        }
        if (t10 == y.f9216K) {
            O3.a<ColorFilter, ColorFilter> aVar = this.f12425o;
            if (aVar != null) {
                this.f12413c.I(aVar);
            }
            if (cVar == null) {
                this.f12425o = null;
                return;
            }
            O3.q qVar = new O3.q(cVar);
            this.f12425o = qVar;
            qVar.a(this);
            this.f12413c.j(this.f12425o);
            return;
        }
        if (t10 == y.f9217L) {
            O3.q qVar2 = this.f12426p;
            if (qVar2 != null) {
                this.f12413c.I(qVar2);
            }
            if (cVar == null) {
                this.f12426p = null;
                return;
            }
            this.f12414d.b();
            this.f12415e.b();
            O3.q qVar3 = new O3.q(cVar);
            this.f12426p = qVar3;
            qVar3.a(this);
            this.f12413c.j(this.f12426p);
            return;
        }
        if (t10 == y.f9231j) {
            O3.a<Float, Float> aVar2 = this.f12429s;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            O3.q qVar4 = new O3.q(cVar);
            this.f12429s = qVar4;
            qVar4.a(this);
            this.f12413c.j(this.f12429s);
            return;
        }
        if (t10 == y.f9226e && (cVar6 = this.f12431u) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t10 == y.f9212G && (cVar5 = this.f12431u) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t10 == y.f9213H && (cVar4 = this.f12431u) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t10 == y.f9214I && (cVar3 = this.f12431u) != null) {
            cVar3.e(cVar);
        } else {
            if (t10 != y.f9215J || (cVar2 = this.f12431u) == null) {
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
        this.f12416f.reset();
        for (int i10 = 0; i10 < this.f12419i.size(); i10++) {
            this.f12416f.addPath(this.f12419i.get(i10).h(), matrix);
        }
        this.f12416f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // N3.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f12412b) {
            return;
        }
        if (C1360e.g()) {
            C1360e.b("GradientFillContent#draw");
        }
        this.f12416f.reset();
        for (int i11 = 0; i11 < this.f12419i.size(); i11++) {
            this.f12416f.addPath(this.f12419i.get(i11).h(), matrix);
        }
        this.f12416f.computeBounds(this.f12418h, false);
        Shader shaderK = this.f12420j == S3.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f12417g.setShader(shaderK);
        O3.a<ColorFilter, ColorFilter> aVar = this.f12425o;
        if (aVar != null) {
            this.f12417g.setColorFilter(aVar.h());
        }
        O3.a<Float, Float> aVar2 = this.f12429s;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f12417g.setMaskFilter(null);
            } else if (fFloatValue != this.f12430t) {
                this.f12417g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f12430t = fFloatValue;
        }
        O3.c cVar = this.f12431u;
        if (cVar != null) {
            cVar.b(this.f12417g);
        }
        this.f12417g.setAlpha(X3.i.c((int) ((((i10 / 255.0f) * this.f12422l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f12416f, this.f12417g);
        if (C1360e.g()) {
            C1360e.c("GradientFillContent#draw");
        }
    }

    @Override // N3.c
    public String getName() {
        return this.f12411a;
    }
}
