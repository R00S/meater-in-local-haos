package N3;

import L3.y;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import s.C4411v;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public class i extends a {

    /* renamed from: A, reason: collision with root package name */
    private final O3.a<PointF, PointF> f12432A;

    /* renamed from: B, reason: collision with root package name */
    private O3.q f12433B;

    /* renamed from: r, reason: collision with root package name */
    private final String f12434r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f12435s;

    /* renamed from: t, reason: collision with root package name */
    private final C4411v<LinearGradient> f12436t;

    /* renamed from: u, reason: collision with root package name */
    private final C4411v<RadialGradient> f12437u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f12438v;

    /* renamed from: w, reason: collision with root package name */
    private final S3.g f12439w;

    /* renamed from: x, reason: collision with root package name */
    private final int f12440x;

    /* renamed from: y, reason: collision with root package name */
    private final O3.a<S3.d, S3.d> f12441y;

    /* renamed from: z, reason: collision with root package name */
    private final O3.a<PointF, PointF> f12442z;

    public i(com.airbnb.lottie.n nVar, T3.b bVar, S3.f fVar) {
        super(nVar, bVar, fVar.b().j(), fVar.g().j(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f12436t = new C4411v<>();
        this.f12437u = new C4411v<>();
        this.f12438v = new RectF();
        this.f12434r = fVar.j();
        this.f12439w = fVar.f();
        this.f12435s = fVar.n();
        this.f12440x = (int) (nVar.I().d() / 32.0f);
        O3.a<S3.d, S3.d> aVarH = fVar.e().h();
        this.f12441y = aVarH;
        aVarH.a(this);
        bVar.j(aVarH);
        O3.a<PointF, PointF> aVarH2 = fVar.l().h();
        this.f12442z = aVarH2;
        aVarH2.a(this);
        bVar.j(aVarH2);
        O3.a<PointF, PointF> aVarH3 = fVar.d().h();
        this.f12432A = aVarH3;
        aVarH3.a(this);
        bVar.j(aVarH3);
    }

    private int[] k(int[] iArr) {
        O3.q qVar = this.f12433B;
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

    private int l() {
        int iRound = Math.round(this.f12442z.f() * this.f12440x);
        int iRound2 = Math.round(this.f12432A.f() * this.f12440x);
        int iRound3 = Math.round(this.f12441y.f() * this.f12440x);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    private LinearGradient m() {
        long jL = l();
        LinearGradient linearGradientF = this.f12436t.f(jL);
        if (linearGradientF != null) {
            return linearGradientF;
        }
        PointF pointFH = this.f12442z.h();
        PointF pointFH2 = this.f12432A.h();
        S3.d dVarH = this.f12441y.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, k(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f12436t.k(jL, linearGradient);
        return linearGradient;
    }

    private RadialGradient n() {
        long jL = l();
        RadialGradient radialGradientF = this.f12437u.f(jL);
        if (radialGradientF != null) {
            return radialGradientF;
        }
        PointF pointFH = this.f12442z.h();
        PointF pointFH2 = this.f12432A.h();
        S3.d dVarH = this.f12441y.h();
        int[] iArrK = k(dVarH.d());
        float[] fArrE = dVarH.e();
        RadialGradient radialGradient = new RadialGradient(pointFH.x, pointFH.y, (float) Math.hypot(pointFH2.x - r7, pointFH2.y - r8), iArrK, fArrE, Shader.TileMode.CLAMP);
        this.f12437u.k(jL, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // N3.a, Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        super.c(t10, cVar);
        if (t10 == y.f9217L) {
            O3.q qVar = this.f12433B;
            if (qVar != null) {
                this.f12364f.I(qVar);
            }
            if (cVar == null) {
                this.f12433B = null;
                return;
            }
            O3.q qVar2 = new O3.q(cVar);
            this.f12433B = qVar2;
            qVar2.a(this);
            this.f12364f.j(this.f12433B);
        }
    }

    @Override // N3.a, N3.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        if (this.f12435s) {
            return;
        }
        e(this.f12438v, matrix, false);
        Shader shaderM = this.f12439w == S3.g.LINEAR ? m() : n();
        shaderM.setLocalMatrix(matrix);
        this.f12367i.setShader(shaderM);
        super.g(canvas, matrix, i10);
    }

    @Override // N3.c
    public String getName() {
        return this.f12434r;
    }
}
