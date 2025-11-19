package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2705z {
    static /* bridge */ /* synthetic */ int a(long[] jArr, long j10, int i10, int i11) {
        while (i10 < i11) {
            if (jArr[i10] == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static List b(long... jArr) {
        int length = jArr.length;
        return length == 0 ? Collections.emptyList() : new C2703y(jArr, 0, length);
    }
}
