package Q3;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* compiled from: CubicCurveData.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f14282a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f14283b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f14284c;

    public a() {
        this.f14282a = new PointF();
        this.f14283b = new PointF();
        this.f14284c = new PointF();
    }

    public PointF a() {
        return this.f14282a;
    }

    public PointF b() {
        return this.f14283b;
    }

    public PointF c() {
        return this.f14284c;
    }

    public void d(float f10, float f11) {
        this.f14282a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f14283b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f14284c.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f14284c.x), Float.valueOf(this.f14284c.y), Float.valueOf(this.f14282a.x), Float.valueOf(this.f14282a.y), Float.valueOf(this.f14283b.x), Float.valueOf(this.f14283b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f14282a = pointF;
        this.f14283b = pointF2;
        this.f14284c = pointF3;
    }
}
