package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.vp */
/* loaded from: classes2.dex */
final /* synthetic */ class CallableC7273vp implements Callable {

    /* renamed from: f */
    static final Callable f20754f = new CallableC7273vp();

    private CallableC7273vp() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map = new HashMap();
        String str = (String) zzyt.m20848e().m16421c(zzacu.f21694R);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzyt.m20848e().m16421c(zzacu.f21700S)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, zzazr.m17291b(str2));
                }
            }
        }
        return new zzcxg(map);
    }
}
