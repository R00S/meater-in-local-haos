package com.airbnb.lottie.p119w;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C5180d;

/* compiled from: Keyframe.java */
/* renamed from: com.airbnb.lottie.w.a */
/* loaded from: classes.dex */
public class C5321a<T> {

    /* renamed from: a */
    private final C5180d f12931a;

    /* renamed from: b */
    public final T f12932b;

    /* renamed from: c */
    public final T f12933c;

    /* renamed from: d */
    public final Interpolator f12934d;

    /* renamed from: e */
    public final float f12935e;

    /* renamed from: f */
    public Float f12936f;

    /* renamed from: g */
    private float f12937g;

    /* renamed from: h */
    private float f12938h;

    /* renamed from: i */
    public PointF f12939i;

    /* renamed from: j */
    public PointF f12940j;

    public C5321a(C5180d c5180d, T t, T t2, Interpolator interpolator, float f2, Float f3) {
        this.f12937g = Float.MIN_VALUE;
        this.f12938h = Float.MIN_VALUE;
        this.f12939i = null;
        this.f12940j = null;
        this.f12931a = c5180d;
        this.f12932b = t;
        this.f12933c = t2;
        this.f12934d = interpolator;
        this.f12935e = f2;
        this.f12936f = f3;
    }

    /* renamed from: a */
    public boolean m9891a(float f2) {
        return f2 >= m9893c() && f2 < m9892b();
    }

    /* renamed from: b */
    public float m9892b() {
        if (this.f12931a == null) {
            return 1.0f;
        }
        if (this.f12938h == Float.MIN_VALUE) {
            if (this.f12936f == null) {
                this.f12938h = 1.0f;
            } else {
                this.f12938h = m9893c() + ((this.f12936f.floatValue() - this.f12935e) / this.f12931a.m9399e());
            }
        }
        return this.f12938h;
    }

    /* renamed from: c */
    public float m9893c() {
        C5180d c5180d = this.f12931a;
        if (c5180d == null) {
            return 0.0f;
        }
        if (this.f12937g == Float.MIN_VALUE) {
            this.f12937g = (this.f12935e - c5180d.m9407m()) / this.f12931a.m9399e();
        }
        return this.f12937g;
    }

    /* renamed from: d */
    public boolean m9894d() {
        return this.f12934d == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f12932b + ", endValue=" + this.f12933c + ", startFrame=" + this.f12935e + ", endFrame=" + this.f12936f + ", interpolator=" + this.f12934d + '}';
    }

    public C5321a(T t) {
        this.f12937g = Float.MIN_VALUE;
        this.f12938h = Float.MIN_VALUE;
        this.f12939i = null;
        this.f12940j = null;
        this.f12931a = null;
        this.f12932b = t;
        this.f12933c = t;
        this.f12934d = null;
        this.f12935e = Float.MIN_VALUE;
        this.f12936f = Float.valueOf(Float.MAX_VALUE);
    }
}
