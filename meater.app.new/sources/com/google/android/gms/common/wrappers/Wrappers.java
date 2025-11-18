package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Wrappers {

    /* renamed from: a */
    private static Wrappers f18013a = new Wrappers();

    /* renamed from: b */
    private PackageManagerWrapper f18014b = null;

    @KeepForSdk
    /* renamed from: a */
    public static PackageManagerWrapper m14674a(Context context) {
        return f18013a.m14675b(context);
    }

    @VisibleForTesting
    /* renamed from: b */
    public final synchronized PackageManagerWrapper m14675b(Context context) {
        if (this.f18014b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f18014b = new PackageManagerWrapper(context);
        }
        return this.f18014b;
    }
}
