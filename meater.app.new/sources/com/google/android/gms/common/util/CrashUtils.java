package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class CrashUtils {

    /* renamed from: a */
    private static final String[] f17978a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @KeepForSdk
    /* renamed from: a */
    public static boolean m14619a(Context context, Throwable th) {
        try {
            Preconditions.m14372k(context);
            Preconditions.m14372k(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}
