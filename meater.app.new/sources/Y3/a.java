package Y3;

import L3.i;
import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final i f19386a;

    /* renamed from: b, reason: collision with root package name */
    public final T f19387b;

    /* renamed from: c, reason: collision with root package name */
    public T f19388c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f19389d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f19390e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f19391f;

    /* renamed from: g, reason: collision with root package name */
    public final float f19392g;

    /* renamed from: h, reason: collision with root package name */
    public Float f19393h;

    /* renamed from: i, reason: collision with root package name */
    private float f19394i;

    /* renamed from: j, reason: collision with root package name */
    private float f19395j;

    /* renamed from: k, reason: collision with root package name */
    private int f19396k;

    /* renamed from: l, reason: collision with root package name */
    private int f19397l;

    /* renamed from: m, reason: collision with root package name */
    private float f19398m;

    /* renamed from: n, reason: collision with root package name */
    private float f19399n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f19400o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f19401p;

    public a(i iVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.f19394i = -3987645.8f;
        this.f19395j = -3987645.8f;
        this.f19396k = 784923401;
        this.f19397l = 784923401;
        this.f19398m = Float.MIN_VALUE;
        this.f19399n = Float.MIN_VALUE;
        this.f19400o = null;
        this.f19401p = null;
        this.f19386a = iVar;
        this.f19387b = t10;
        this.f19388c = t11;
        this.f19389d = interpolator;
        this.f19390e = null;
        this.f19391f = null;
        this.f19392g = f10;
        this.f19393h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a<T> b(T t10, T t11) {
        return new a<>(t10, t11);
    }

    public float c() {
        if (this.f19386a == null) {
            return 1.0f;
        }
        if (this.f19399n == Float.MIN_VALUE) {
            if (this.f19393h == null) {
                this.f19399n = 1.0f;
            } else {
                this.f19399n = f() + ((this.f19393h.floatValue() - this.f19392g) / this.f19386a.e());
            }
        }
        return this.f19399n;
    }

    public float d() {
        if (this.f19395j == -3987645.8f) {
            this.f19395j = ((Float) this.f19388c).floatValue();
        }
        return this.f19395j;
    }

    public int e() {
        if (this.f19397l == 784923401) {
            this.f19397l = ((Integer) this.f19388c).intValue();
        }
        return this.f19397l;
    }

    public float f() {
        i iVar = this.f19386a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f19398m == Float.MIN_VALUE) {
            this.f19398m = (this.f19392g - iVar.p()) / this.f19386a.e();
        }
        return this.f19398m;
    }

    public float g() {
        if (this.f19394i == -3987645.8f) {
            this.f19394i = ((Float) this.f19387b).floatValue();
        }
        return this.f19394i;
    }

    public int h() {
        if (this.f19396k == 784923401) {
            this.f19396k = ((Integer) this.f19387b).intValue();
        }
        return this.f19396k;
    }

    public boolean i() {
        return this.f19389d == null && this.f19390e == null && this.f19391f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f19387b + ", endValue=" + this.f19388c + ", startFrame=" + this.f19392g + ", endFrame=" + this.f19393h + ", interpolator=" + this.f19389d + '}';
    }

    public a(i iVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f19394i = -3987645.8f;
        this.f19395j = -3987645.8f;
        this.f19396k = 784923401;
        this.f19397l = 784923401;
        this.f19398m = Float.MIN_VALUE;
        this.f19399n = Float.MIN_VALUE;
        this.f19400o = null;
        this.f19401p = null;
        this.f19386a = iVar;
        this.f19387b = t10;
        this.f19388c = t11;
        this.f19389d = null;
        this.f19390e = interpolator;
        this.f19391f = interpolator2;
        this.f19392g = f10;
        this.f19393h = f11;
    }

    protected a(i iVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f19394i = -3987645.8f;
        this.f19395j = -3987645.8f;
        this.f19396k = 784923401;
        this.f19397l = 784923401;
        this.f19398m = Float.MIN_VALUE;
        this.f19399n = Float.MIN_VALUE;
        this.f19400o = null;
        this.f19401p = null;
        this.f19386a = iVar;
        this.f19387b = t10;
        this.f19388c = t11;
        this.f19389d = interpolator;
        this.f19390e = interpolator2;
        this.f19391f = interpolator3;
        this.f19392g = f10;
        this.f19393h = f11;
    }

    public a(T t10) {
        this.f19394i = -3987645.8f;
        this.f19395j = -3987645.8f;
        this.f19396k = 784923401;
        this.f19397l = 784923401;
        this.f19398m = Float.MIN_VALUE;
        this.f19399n = Float.MIN_VALUE;
        this.f19400o = null;
        this.f19401p = null;
        this.f19386a = null;
        this.f19387b = t10;
        this.f19388c = t10;
        this.f19389d = null;
        this.f19390e = null;
        this.f19391f = null;
        this.f19392g = Float.MIN_VALUE;
        this.f19393h = Float.valueOf(Float.MAX_VALUE);
    }

    private a(T t10, T t11) {
        this.f19394i = -3987645.8f;
        this.f19395j = -3987645.8f;
        this.f19396k = 784923401;
        this.f19397l = 784923401;
        this.f19398m = Float.MIN_VALUE;
        this.f19399n = Float.MIN_VALUE;
        this.f19400o = null;
        this.f19401p = null;
        this.f19386a = null;
        this.f19387b = t10;
        this.f19388c = t11;
        this.f19389d = null;
        this.f19390e = null;
        this.f19391f = null;
        this.f19392g = Float.MIN_VALUE;
        this.f19393h = Float.valueOf(Float.MAX_VALUE);
    }
}
