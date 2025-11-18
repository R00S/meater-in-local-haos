package com.flurry.sdk;

import android.content.Context;

/* renamed from: com.flurry.sdk.o2 */
/* loaded from: classes2.dex */
public final class C6122o2 {
    /* renamed from: a */
    public static boolean m13225a(String str) {
        Context contextM12964a = C6002b0.m12964a();
        if (contextM12964a != null) {
            return contextM12964a.checkCallingOrSelfPermission(str) == 0;
        }
        C6021d1.m13030c(6, "PermissionUtil", "Context is null when checking permission.");
        return false;
    }
}
