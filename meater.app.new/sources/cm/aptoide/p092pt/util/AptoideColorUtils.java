package cm.aptoide.p092pt.util;

import p024c.p052i.p053e.C0923a;

/* loaded from: classes.dex */
public class AptoideColorUtils {
    public static int getChangedColorLightness(float[] fArr, float f2) {
        float f3 = fArr[2] * f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        fArr[2] = f3;
        return C0923a.m5873a(fArr);
    }
}
