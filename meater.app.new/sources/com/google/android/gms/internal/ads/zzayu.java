package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzayu {

    /* renamed from: a */
    private static zzv f22699a;

    /* renamed from: b */
    private static final Object f22700b = new Object();

    /* renamed from: c */
    @Deprecated
    private static final zzayy<Void> f22701c = new C7253v5();

    public zzayu(Context context) {
        m17255b(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    @VisibleForTesting
    /* renamed from: b */
    private static zzv m17255b(Context context) {
        zzv zzvVar;
        zzv zzvVar2;
        synchronized (f22700b) {
            if (f22699a == null) {
                zzacu.m16423a(context);
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21608C3)).booleanValue()) {
                    zzvVar2 = zzayl.m17244d(context);
                } else {
                    zzvVar2 = new zzv(new zzan(new File(context.getCacheDir(), "volley")), new zzak((zzaj) new zzat()));
                    zzvVar2.m20645a();
                }
                f22699a = zzvVar2;
            }
            zzvVar = f22699a;
        }
        return zzvVar;
    }

    /* renamed from: d */
    public static zzbbh<zzp> m17256d(String str) {
        zzbbr zzbbrVar = new zzbbr();
        f22699a.m20647c(new zzaza(str, zzbbrVar));
        return zzbbrVar;
    }

    /* renamed from: a */
    public final zzbbh<String> m17257a(int i2, String str, Map<String, String> map, byte[] bArr) throws IOException {
        C7364y5 c7364y5 = new C7364y5(null);
        C7290w5 c7290w5 = new C7290w5(this, str, c7364y5);
        zzazx zzazxVar = new zzazx(null);
        C7327x5 c7327x5 = new C7327x5(this, i2, str, c7364y5, c7290w5, bArr, map, zzazxVar);
        if (zzazx.m17324a()) {
            try {
                zzazxVar.m17339f(str, "GET", c7327x5.mo16038g(), c7327x5.mo16036O());
            } catch (zza e2) {
                zzbad.m17353i(e2.getMessage());
            }
        }
        f22699a.m20647c(c7327x5);
        return c7364y5;
    }

    /* renamed from: c */
    public final zzbbh<String> m17258c(String str, Map<String, String> map) {
        return m17257a(0, str, map, null);
    }
}
