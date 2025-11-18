package p241e.p254e.p256b.p271c.p273m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: MatrixEvaluator.java */
/* renamed from: e.e.b.c.m.g */
/* loaded from: classes2.dex */
public class C8925g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f34380a = new float[9];

    /* renamed from: b */
    private final float[] f34381b = new float[9];

    /* renamed from: c */
    private final Matrix f34382c = new Matrix();

    /* renamed from: a */
    public Matrix mo24566a(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f34380a);
        matrix2.getValues(this.f34381b);
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = this.f34381b;
            float f3 = fArr[i2];
            float[] fArr2 = this.f34380a;
            fArr[i2] = fArr2[i2] + ((f3 - fArr2[i2]) * f2);
        }
        this.f34382c.setValues(this.f34381b);
        return this.f34382c;
    }
}
