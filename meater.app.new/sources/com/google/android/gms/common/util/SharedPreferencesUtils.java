package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static void m14654a(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
