package p353j.p354g0;

import kotlin.jvm.internal.C9801m;
import p353j.C9694a0;

/* compiled from: SegmentedByteString.kt */
/* renamed from: j.g0.c */
/* loaded from: classes3.dex */
public final class C9708c {
    /* renamed from: a */
    public static final int m32082a(int[] iArr, int i2, int i3, int i4) {
        C9801m.m32346f(iArr, "$this$binarySearch");
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else {
                if (i7 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return (-i3) - 1;
    }

    /* renamed from: b */
    public static final int m32083b(C9694a0 c9694a0, int i2) {
        C9801m.m32346f(c9694a0, "$this$segment");
        int iM32082a = m32082a(c9694a0.m31974U(), i2 + 1, 0, c9694a0.m31975V().length);
        return iM32082a >= 0 ? iM32082a : iM32082a ^ (-1);
    }
}
