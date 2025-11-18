package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class InstantApps {

    /* renamed from: a */
    private static Context f18010a;

    /* renamed from: b */
    private static Boolean f18011b;

    @KeepForSdk
    /* renamed from: a */
    public static synchronized boolean m14666a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f18010a;
        if (context2 != null && (bool = f18011b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f18011b = null;
        if (PlatformVersion.m14647k()) {
            f18011b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f18011b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f18011b = Boolean.FALSE;
            }
        }
        f18010a = applicationContext;
        return f18011b.booleanValue();
    }
}
