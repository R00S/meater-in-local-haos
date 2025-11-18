package p024c.p068n.p069a.p070a;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* renamed from: c.n.a.a.d */
/* loaded from: classes.dex */
abstract class AbstractInterpolatorC0990d implements Interpolator {

    /* renamed from: a */
    private final float[] f6524a;

    /* renamed from: b */
    private final float f6525b;

    protected AbstractInterpolatorC0990d(float[] fArr) {
        this.f6524a = fArr;
        this.f6525b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f6524a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f6525b;
        float f4 = (f2 - (iMin * f3)) / f3;
        float[] fArr2 = this.f6524a;
        return fArr2[iMin] + (f4 * (fArr2[iMin + 1] - fArr2[iMin]));
    }
}
