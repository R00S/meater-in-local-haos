package androidx.core.view.p005e0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* compiled from: PathInterpolatorApi14.java */
/* renamed from: androidx.core.view.e0.a */
/* loaded from: classes.dex */
class InterpolatorC0294a implements Interpolator {

    /* renamed from: a */
    private final float[] f2387a;

    /* renamed from: b */
    private final float[] f2388b;

    InterpolatorC0294a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i2 = ((int) (length / 0.002f)) + 1;
        this.f2387a = new float[i2];
        this.f2388b = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / (i2 - 1), fArr, null);
            this.f2387a[i3] = fArr[0];
            this.f2388b[i3] = fArr[1];
        }
    }

    /* renamed from: a */
    private static Path m2040a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f2387a.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f2 < this.f2387a[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float[] fArr = this.f2387a;
        float f3 = fArr[length] - fArr[i2];
        if (f3 == 0.0f) {
            return this.f2388b[i2];
        }
        float f4 = (f2 - fArr[i2]) / f3;
        float[] fArr2 = this.f2388b;
        float f5 = fArr2[i2];
        return f5 + (f4 * (fArr2[length] - f5));
    }

    InterpolatorC0294a(float f2, float f3, float f4, float f5) {
        this(m2040a(f2, f3, f4, f5));
    }
}
