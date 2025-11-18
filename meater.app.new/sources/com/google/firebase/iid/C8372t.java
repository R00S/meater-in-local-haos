package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
@KeepForSdk
/* renamed from: com.google.firebase.iid.t */
/* loaded from: classes2.dex */
public class C8372t {

    /* renamed from: a */
    private static C8372t f31758a;

    /* renamed from: b */
    private Boolean f31759b = null;

    /* renamed from: c */
    private Boolean f31760c = null;

    private C8372t() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static synchronized C8372t m26222a() {
        if (f31758a == null) {
            f31758a = new C8372t();
        }
        return f31758a;
    }

    /* renamed from: b */
    boolean m26223b(Context context) {
        if (this.f31760c == null) {
            this.f31760c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f31759b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f31760c.booleanValue();
    }

    /* renamed from: c */
    boolean m26224c(Context context) {
        if (this.f31759b == null) {
            this.f31759b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f31759b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f31759b.booleanValue();
    }
}
