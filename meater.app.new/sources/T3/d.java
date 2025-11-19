package T3;

import L3.u;
import L3.y;
import O3.q;
import X3.j;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.n;

/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: D, reason: collision with root package name */
    private final Paint f15911D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f15912E;

    /* renamed from: F, reason: collision with root package name */
    private final Rect f15913F;

    /* renamed from: G, reason: collision with root package name */
    private final u f15914G;

    /* renamed from: H, reason: collision with root package name */
    private O3.a<ColorFilter, ColorFilter> f15915H;

    /* renamed from: I, reason: collision with root package name */
    private O3.a<Bitmap, Bitmap> f15916I;

    d(n nVar, e eVar) {
        super(nVar, eVar);
        this.f15911D = new M3.a(3);
        this.f15912E = new Rect();
        this.f15913F = new Rect();
        this.f15914G = nVar.O(eVar.n());
    }

    private Bitmap Q() {
        Bitmap bitmapH;
        O3.a<Bitmap, Bitmap> aVar = this.f15916I;
        if (aVar != null && (bitmapH = aVar.h()) != null) {
            return bitmapH;
        }
        Bitmap bitmapF = this.f15890p.F(this.f15891q.n());
        if (bitmapF != null) {
            return bitmapF;
        }
        u uVar = this.f15914G;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    @Override // T3.b, Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        super.c(t10, cVar);
        if (t10 == y.f9216K) {
            if (cVar == null) {
                this.f15915H = null;
                return;
            } else {
                this.f15915H = new q(cVar);
                return;
            }
        }
        if (t10 == y.f9219N) {
            if (cVar == null) {
                this.f15916I = null;
            } else {
                this.f15916I = new q(cVar);
            }
        }
    }

    @Override // T3.b, N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        if (this.f15914G != null) {
            float fE = j.e();
            rectF.set(0.0f, 0.0f, this.f15914G.f() * fE, this.f15914G.d() * fE);
            this.f15889o.mapRect(rectF);
        }
    }

    @Override // T3.b
    public void u(Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmapQ = Q();
        if (bitmapQ == null || bitmapQ.isRecycled() || this.f15914G == null) {
            return;
        }
        float fE = j.e();
        this.f15911D.setAlpha(i10);
        O3.a<ColorFilter, ColorFilter> aVar = this.f15915H;
        if (aVar != null) {
            this.f15911D.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f15912E.set(0, 0, bitmapQ.getWidth(), bitmapQ.getHeight());
        if (this.f15890p.P()) {
            this.f15913F.set(0, 0, (int) (this.f15914G.f() * fE), (int) (this.f15914G.d() * fE));
        } else {
            this.f15913F.set(0, 0, (int) (bitmapQ.getWidth() * fE), (int) (bitmapQ.getHeight() * fE));
        }
        canvas.drawBitmap(bitmapQ, this.f15912E, this.f15913F, this.f15911D);
        canvas.restore();
    }
}
