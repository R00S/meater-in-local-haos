package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2699w extends C2701x {
    static /* bridge */ /* synthetic */ int a(float[] fArr, float f10, int i10, int i11) {
        while (i10 < i11) {
            if (fArr[i10] == f10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List b(float... fArr) {
        int length = fArr.length;
        return length == 0 ? Collections.emptyList() : new C2697v(fArr, 0, length);
    }
}
