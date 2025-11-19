package com.google.android.gms.common.util;

import android.os.StrictMode;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class v {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (l.i()) {
            StrictMode.setVmPolicy(u.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
