package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: com.google.android.gms.common.b */
/* loaded from: classes2.dex */
final class C6408b {
    /* renamed from: a */
    static int m14256a(int i2) {
        int[] iArr = {1, 2, 3};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }
}
