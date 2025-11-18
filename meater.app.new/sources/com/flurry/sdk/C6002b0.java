package com.flurry.sdk;

import android.content.Context;

/* renamed from: com.flurry.sdk.b0 */
/* loaded from: classes2.dex */
public final class C6002b0 {

    /* renamed from: a */
    private static Context f15676a;

    /* renamed from: a */
    public static Context m12964a() {
        return f15676a;
    }

    /* renamed from: b */
    public static void m12965b(Context context) {
        f15676a = context.getApplicationContext();
    }
}
