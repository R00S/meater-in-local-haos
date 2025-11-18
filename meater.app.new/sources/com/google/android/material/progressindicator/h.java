package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.e;
import m1.C3946a;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes2.dex */
final class h extends e<k> {

    /* renamed from: b, reason: collision with root package name */
    private float f36955b;

    /* renamed from: c, reason: collision with root package name */
    private float f36956c;

    /* renamed from: d, reason: collision with root package name */
    private float f36957d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f36958e;

    /* renamed from: f, reason: collision with root package name */
    private float f36959f;

    h(k kVar) {
        super(kVar);
        this.f36955b = 300.0f;
    }

    private void h(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        float fA = C3946a.a(f10, 0.0f, 1.0f);
        float fA2 = C3946a.a(f11, 0.0f, 1.0f);
        float fC = Q7.a.c(1.0f - this.f36959f, 1.0f, fA);
        float fC2 = Q7.a.c(1.0f - this.f36959f, 1.0f, fA2);
        int iA = (int) ((i11 * C3946a.a(fC, 0.0f, 0.01f)) / 0.01f);
        int iA2 = (int) ((i12 * (1.0f - C3946a.a(fC2, 0.99f, 1.0f))) / 0.01f);
        float f12 = this.f36955b;
        int i13 = (int) ((fC * f12) + iA);
        int i14 = (int) ((fC2 * f12) - iA2);
        float f13 = (-f12) / 2.0f;
        if (i13 <= i14) {
            float f14 = this.f36957d;
            float f15 = i13 + f14;
            float f16 = i14 - f14;
            float f17 = f14 * 2.0f;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f36956c);
            if (f15 >= f16) {
                j(canvas, paint, new PointF(f15 + f13, 0.0f), new PointF(f16 + f13, 0.0f), f17, this.f36956c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f36958e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f18 = f15 + f13;
            float f19 = f16 + f13;
            canvas.drawLine(f18, 0.0f, f19, 0.0f, paint);
            if (this.f36958e || this.f36957d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f15 > 0.0f) {
                i(canvas, paint, new PointF(f18, 0.0f), f17, this.f36956c);
            }
            if (f16 < this.f36955b) {
                i(canvas, paint, new PointF(f19, 0.0f), f17, this.f36956c);
            }
        }
    }

    private void i(Canvas canvas, Paint paint, PointF pointF, float f10, float f11) {
        j(canvas, paint, pointF, null, f10, f11);
    }

    private void j(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f10, float f11) {
        float fMin = Math.min(f11, this.f36956c);
        float f12 = f10 / 2.0f;
        float fMin2 = Math.min(f12, (this.f36957d * fMin) / this.f36956c);
        RectF rectF = new RectF((-f10) / 2.0f, (-fMin) / 2.0f, f12, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.e
    void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        this.f36955b = rect.width();
        float f11 = ((k) this.f36945a).f36915a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f11) / 2.0f));
        if (((k) this.f36945a).f36983j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f12 = this.f36955b / 2.0f;
        float f13 = f11 / 2.0f;
        canvas.clipRect(-f12, -f13, f12, f13);
        S s10 = this.f36945a;
        this.f36958e = ((k) s10).f36915a / 2 == ((k) s10).f36916b;
        this.f36956c = ((k) s10).f36915a * f10;
        this.f36957d = Math.min(((k) s10).f36915a / 2, ((k) s10).f36916b) * f10;
        if (z10 || z11) {
            if ((z10 && ((k) this.f36945a).f36919e == 2) || (z11 && ((k) this.f36945a).f36920f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && ((k) this.f36945a).f36920f != 3)) {
                canvas.translate(0.0f, (((k) this.f36945a).f36915a * (1.0f - f10)) / 2.0f);
            }
        }
        if (z11 && ((k) this.f36945a).f36920f == 3) {
            this.f36959f = f10;
        } else {
            this.f36959f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.e
    void b(Canvas canvas, Paint paint, int i10, int i11) {
        int iA = M7.a.a(i10, i11);
        if (((k) this.f36945a).f36984k <= 0 || iA == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
        PointF pointF = new PointF((this.f36955b / 2.0f) - (this.f36956c / 2.0f), 0.0f);
        S s10 = this.f36945a;
        i(canvas, paint, pointF, ((k) s10).f36984k, ((k) s10).f36984k);
    }

    @Override // com.google.android.material.progressindicator.e
    void c(Canvas canvas, Paint paint, e.a aVar, int i10) {
        int iA = M7.a.a(aVar.f36948c, i10);
        float f10 = aVar.f36946a;
        float f11 = aVar.f36947b;
        int i11 = aVar.f36949d;
        h(canvas, paint, f10, f11, iA, i11, i11);
    }

    @Override // com.google.android.material.progressindicator.e
    void d(Canvas canvas, Paint paint, float f10, float f11, int i10, int i11, int i12) {
        h(canvas, paint, f10, f11, M7.a.a(i10, i11), i12, i12);
    }

    @Override // com.google.android.material.progressindicator.e
    int e() {
        return ((k) this.f36945a).f36915a;
    }

    @Override // com.google.android.material.progressindicator.e
    int f() {
        return -1;
    }
}
