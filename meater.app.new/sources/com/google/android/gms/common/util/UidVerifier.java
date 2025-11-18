package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m14656a(Context context, int i2) throws PackageManager.NameNotFoundException {
        if (!m14657b(context, i2, "com.google.android.gms")) {
            return false;
        }
        try {
            return GoogleSignatureVerifier.m13830a(context).m13834b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @KeepForSdk
    @TargetApi(19)
    /* renamed from: b */
    public static boolean m14657b(Context context, int i2, String str) {
        return Wrappers.m14674a(context).m14673g(i2, str);
    }
}
