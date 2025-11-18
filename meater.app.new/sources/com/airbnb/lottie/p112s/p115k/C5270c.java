package com.airbnb.lottie.p112s.p115k;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.InterfaceC5186j;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p108q.p110b.C5226p;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5323c;

/* compiled from: ImageLayer.java */
/* renamed from: com.airbnb.lottie.s.k.c */
/* loaded from: classes.dex */
public class C5270c extends AbstractC5268a {

    /* renamed from: w */
    private final Paint f12830w;

    /* renamed from: x */
    private final Rect f12831x;

    /* renamed from: y */
    private final Rect f12832y;

    /* renamed from: z */
    private AbstractC5211a<ColorFilter, ColorFilter> f12833z;

    C5270c(C5182f c5182f, C5271d c5271d) {
        super(c5182f, c5271d);
        this.f12830w = new Paint(3);
        this.f12831x = new Rect();
        this.f12832y = new Rect();
    }

    /* renamed from: D */
    private Bitmap m9731D() {
        return this.f12812n.m9470n(this.f12813o.m9742k());
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a, com.airbnb.lottie.p108q.p109a.InterfaceC5196d
    /* renamed from: d */
    public void mo9515d(RectF rectF, Matrix matrix) {
        super.mo9515d(rectF, matrix);
        if (m9731D() != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, r6.getWidth()), Math.min(rectF.bottom, r6.getHeight()));
            this.f12811m.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a, com.airbnb.lottie.p112s.InterfaceC5234f
    /* renamed from: h */
    public <T> void mo9517h(T t, C5323c<T> c5323c) {
        super.mo9517h(t, c5323c);
        if (t == InterfaceC5186j.f12418x) {
            if (c5323c == null) {
                this.f12833z = null;
            } else {
                this.f12833z = new C5226p(c5323c);
            }
        }
    }

    @Override // com.airbnb.lottie.p112s.p115k.AbstractC5268a
    /* renamed from: n */
    public void mo9724n(Canvas canvas, Matrix matrix, int i2) {
        Bitmap bitmapM9731D = m9731D();
        if (bitmapM9731D == null || bitmapM9731D.isRecycled()) {
            return;
        }
        float fM9887e = C5320f.m9887e();
        this.f12830w.setAlpha(i2);
        AbstractC5211a<ColorFilter, ColorFilter> abstractC5211a = this.f12833z;
        if (abstractC5211a != null) {
            this.f12830w.setColorFilter(abstractC5211a.mo9552h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f12831x.set(0, 0, bitmapM9731D.getWidth(), bitmapM9731D.getHeight());
        this.f12832y.set(0, 0, (int) (bitmapM9731D.getWidth() * fM9887e), (int) (bitmapM9731D.getHeight() * fM9887e));
        canvas.drawBitmap(bitmapM9731D, this.f12831x, this.f12832y, this.f12830w);
        canvas.restore();
    }
}
