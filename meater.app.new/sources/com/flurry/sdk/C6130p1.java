package com.flurry.sdk;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: com.flurry.sdk.p1 */
/* loaded from: classes2.dex */
public final class C6130p1 {

    /* renamed from: a */
    private static String[] f16247a = {"resource", "http"};

    /* renamed from: b */
    private static int[] f16248b = {4, 8};

    /* renamed from: c */
    private static int f16249c = 4 | 8;

    /* renamed from: a */
    public static ActivityManager.MemoryInfo m13251a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }
}
