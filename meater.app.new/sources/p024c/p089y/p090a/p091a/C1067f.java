package p024c.p089y.p090a.p091a;

import android.animation.TypeEvaluator;

/* compiled from: ArgbEvaluator.java */
/* renamed from: c.y.a.a.f */
/* loaded from: classes.dex */
public class C1067f implements TypeEvaluator {

    /* renamed from: a */
    private static final C1067f f6980a = new C1067f();

    /* renamed from: a */
    public static C1067f m6720a() {
        return f6980a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f2, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f3 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f4 = f3 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f3) * f2);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f2);
        float fPow6 = fPow3 + (f2 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f2), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f4 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
