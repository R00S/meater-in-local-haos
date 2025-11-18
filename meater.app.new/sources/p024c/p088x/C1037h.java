package p024c.p088x;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty.java */
/* renamed from: c.x.h */
/* loaded from: classes.dex */
class C1037h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f6834a;

    /* renamed from: b */
    private final PathMeasure f6835b;

    /* renamed from: c */
    private final float f6836c;

    /* renamed from: d */
    private final float[] f6837d;

    /* renamed from: e */
    private final PointF f6838e;

    /* renamed from: f */
    private float f6839f;

    C1037h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f6837d = new float[2];
        this.f6838e = new PointF();
        this.f6834a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f6835b = pathMeasure;
        this.f6836c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t) {
        return Float.valueOf(this.f6839f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f2) {
        this.f6839f = f2.floatValue();
        this.f6835b.getPosTan(this.f6836c * f2.floatValue(), this.f6837d, null);
        PointF pointF = this.f6838e;
        float[] fArr = this.f6837d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f6834a.set(t, pointF);
    }
}
