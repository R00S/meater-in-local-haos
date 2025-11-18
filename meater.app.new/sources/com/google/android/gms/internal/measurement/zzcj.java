package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzcj {

    /* renamed from: a */
    private static volatile zzcy<Boolean> f28005a = zzcy.m22128d();

    /* renamed from: b */
    private static final Object f28006b = new Object();

    /* renamed from: a */
    private static boolean m22102a(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
    }

    /* renamed from: b */
    public static boolean m22103b(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (f28005a.mo21475b()) {
            return f28005a.mo21476c().booleanValue();
        }
        synchronized (f28006b) {
            if (f28005a.mo21475b()) {
                return f28005a.mo21476c().booleanValue();
            }
            if (("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) && m22102a(context)) {
                z = true;
            }
            f28005a = zzcy.m22127a(Boolean.valueOf(z));
            return f28005a.mo21476c().booleanValue();
        }
    }
}
