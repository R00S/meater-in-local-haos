package com.flurry.sdk;

import android.text.TextUtils;

/* renamed from: com.flurry.sdk.r2 */
/* loaded from: classes2.dex */
public final class C6149r2 {
    /* renamed from: a */
    public static boolean m13290a(Object... objArr) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (objArr[i2] == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m13291b(String... strArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                return false;
            }
        }
        return true;
    }
}
