package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.ads.zzdap;
import com.google.android.gms.internal.ads.zzdau;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzdan {

    /* renamed from: a */
    private final Context f25437a;

    /* renamed from: b */
    private final Looper f25438b;

    public zzdan(Context context, Looper looper) {
        this.f25437a = context;
        this.f25438b = looper;
    }

    /* renamed from: a */
    public final void m19147a(String str) {
        new C7163sq(this.f25437a, this.f25438b, (zzdau) ((zzdob) zzdau.m19160C().m19168w(this.f25437a.getPackageName()).m19167v(zzdau.zzb.BLOCKED_IMPRESSION).m19166u(zzdap.m19148A().m19157v(str).m19156u(zzdap.zza.BLOCKED_REASON_BACKGROUND)).mo19736p0())).m15847b();
    }
}
