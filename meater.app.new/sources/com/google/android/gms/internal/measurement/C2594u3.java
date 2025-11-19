package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2594u3 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile l8.l<Boolean> f34394a = l8.l.a();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f34395b = new Object();

    private static boolean a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    public static boolean b(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (f34394a.c()) {
            return f34394a.b().booleanValue();
        }
        synchronized (f34395b) {
            try {
                if (f34394a.c()) {
                    return f34394a.b().booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    f34394a = l8.l.d(Boolean.valueOf(z10));
                    return f34394a.b().booleanValue();
                }
                if (a(context)) {
                    z10 = true;
                }
                f34394a = l8.l.d(Boolean.valueOf(z10));
                return f34394a.b().booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
