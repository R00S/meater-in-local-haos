package D7;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator.java */
/* loaded from: classes2.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f3496a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f3497b = new float[9];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f3498c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f3496a);
        matrix2.getValues(this.f3497b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f3497b;
            float f11 = fArr[i10];
            float f12 = this.f3496a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f3498c.setValues(this.f3497b);
        return this.f3498c;
    }
}
