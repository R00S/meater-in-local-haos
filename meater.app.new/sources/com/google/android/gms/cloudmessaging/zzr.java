package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzr {

    /* renamed from: a */
    private final Context f17192a;

    /* renamed from: b */
    private int f17193b;

    /* renamed from: c */
    private int f17194c = 0;

    public zzr(Context context) {
        this.f17192a = context;
    }

    /* renamed from: b */
    private final PackageInfo m13788b(String str) {
        try {
            return Wrappers.m14674a(this.f17192a).m14671e(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String strValueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(strValueOf);
            Log.w("Metadata", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized int m13789a() {
        int i2 = this.f17194c;
        if (i2 != 0) {
            return i2;
        }
        PackageManager packageManager = this.f17192a.getPackageManager();
        if (Wrappers.m14674a(this.f17192a).m14668b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.m14647k()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f17194c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f17194c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.m14647k()) {
            this.f17194c = 2;
        } else {
            this.f17194c = 1;
        }
        return this.f17194c;
    }

    /* renamed from: c */
    public final synchronized int m13790c() {
        PackageInfo packageInfoM13788b;
        if (this.f17193b == 0 && (packageInfoM13788b = m13788b("com.google.android.gms")) != null) {
            this.f17193b = packageInfoM13788b.versionCode;
        }
        return this.f17193b;
    }
}
