package u2;

import X1.D;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;

/* compiled from: FrameRotationQueue.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f50337a = new float[16];

    /* renamed from: b, reason: collision with root package name */
    private final float[] f50338b = new float[16];

    /* renamed from: c, reason: collision with root package name */
    private final D<float[]> f50339c = new D<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f50340d;

    public static void a(float[] fArr, float[] fArr2) {
        GlUtil.k(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            GlUtil.k(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArrJ = this.f50339c.j(j10);
        if (fArrJ == null) {
            return false;
        }
        b(this.f50338b, fArrJ);
        if (!this.f50340d) {
            a(this.f50337a, this.f50338b);
            this.f50340d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f50337a, 0, this.f50338b, 0);
        return true;
    }

    public void d() {
        this.f50339c.c();
        this.f50340d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f50339c.a(j10, fArr);
    }
}
