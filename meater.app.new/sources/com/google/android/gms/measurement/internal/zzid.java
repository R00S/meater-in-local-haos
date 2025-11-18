package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzid {
    /* renamed from: a */
    public static String m23327a(String str, String[] strArr, String[] strArr2) {
        Preconditions.m14372k(strArr);
        Preconditions.m14372k(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            String str2 = strArr[i2];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i2];
            }
        }
        return null;
    }
}
