package T3;

import L3.y;
import O3.q;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.n;

/* compiled from: SolidLayer.java */
/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: D, reason: collision with root package name */
    private final RectF f15959D;

    /* renamed from: E, reason: collision with root package name */
    private final Paint f15960E;

    /* renamed from: F, reason: collision with root package name */
    private final float[] f15961F;

    /* renamed from: G, reason: collision with root package name */
    private final Path f15962G;

    /* renamed from: H, reason: collision with root package name */
    private final e f15963H;

    /* renamed from: I, reason: collision with root package name */
    private O3.a<ColorFilter, ColorFilter> f15964I;

    /* renamed from: J, reason: collision with root package name */
    private O3.a<Integer, Integer> f15965J;

    h(n nVar, e eVar) {
        super(nVar, eVar);
        this.f15959D = new RectF();
        M3.a aVar = new M3.a();
        this.f15960E = aVar;
        this.f15961F = new float[8];
        this.f15962G = new Path();
        this.f15963H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // T3.b, Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        super.c(t10, cVar);
        if (t10 == y.f9216K) {
            if (cVar == null) {
                this.f15964I = null;
                return;
            } else {
                this.f15964I = new q(cVar);
                return;
            }
        }
        if (t10 == y.f9222a) {
            if (cVar != null) {
                this.f15965J = new q(cVar);
            } else {
                this.f15965J = null;
                this.f15960E.setColor(this.f15963H.p());
            }
        }
    }

    @Override // T3.b, N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.f15959D.set(0.0f, 0.0f, this.f15963H.r(), this.f15963H.q());
        this.f15889o.mapRect(this.f15959D);
        rectF.set(this.f15959D);
    }

    @Override // T3.b
    public void u(Canvas canvas, Matrix matrix, int i10) {
        int iAlpha = Color.alpha(this.f15963H.p());
        if (iAlpha == 0) {
            return;
        }
        O3.a<Integer, Integer> aVar = this.f15965J;
        Integer numH = aVar == null ? null : aVar.h();
        if (numH != null) {
            this.f15960E.setColor(numH.intValue());
        } else {
            this.f15960E.setColor(this.f15963H.p());
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.f15898x.h() == null ? 100 : this.f15898x.h().h().intValue())) / 100.0f) * 255.0f);
        this.f15960E.setAlpha(iIntValue);
        O3.a<ColorFilter, ColorFilter> aVar2 = this.f15964I;
        if (aVar2 != null) {
            this.f15960E.setColorFilter(aVar2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f15961F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f15963H.r();
            float[] fArr2 = this.f15961F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f15963H.r();
            this.f15961F[5] = this.f15963H.q();
            float[] fArr3 = this.f15961F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f15963H.q();
            matrix.mapPoints(this.f15961F);
            this.f15962G.reset();
            Path path = this.f15962G;
            float[] fArr4 = this.f15961F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f15962G;
            float[] fArr5 = this.f15961F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f15962G;
            float[] fArr6 = this.f15961F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f15962G;
            float[] fArr7 = this.f15961F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f15962G;
            float[] fArr8 = this.f15961F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f15962G.close();
            canvas.drawPath(this.f15962G, this.f15960E);
        }
    }
}
