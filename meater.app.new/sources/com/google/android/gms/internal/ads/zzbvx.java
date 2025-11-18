package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzbvx extends zzbpc {

    /* renamed from: f */
    private final Context f23610f;

    /* renamed from: g */
    private final zzbup f23611g;

    /* renamed from: h */
    private final zzbwz f23612h;

    /* renamed from: i */
    private final zzbpv f23613i;

    /* renamed from: j */
    private final zzdan f23614j;

    /* renamed from: k */
    private boolean f23615k = false;

    zzbvx(Context context, zzbry zzbryVar, zzbup zzbupVar, zzbwz zzbwzVar, zzbpv zzbpvVar, zzdan zzdanVar) {
        this.f23610f = context;
        this.f23441c = zzbryVar;
        this.f23611g = zzbupVar;
        this.f23612h = zzbwzVar;
        this.f23613i = zzbpvVar;
        this.f23614j = zzdanVar;
    }

    /* renamed from: g */
    public final boolean m18400g() {
        return this.f23613i.m18249a();
    }

    /* renamed from: h */
    public final void m18401h(boolean z) {
        this.f23611g.mo18380y();
        this.f23612h.mo14951a(z, this.f23610f);
        this.f23615k = true;
    }

    /* renamed from: i */
    public final zzbry m18402i() {
        return this.f23441c;
    }

    /* renamed from: j */
    public final boolean m18403j() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21659L0)).booleanValue()) {
            zzk.zzlg();
            if (zzaxi.m17121A(this.f23610f)) {
                zzbad.m17353i("It is not recommended to show an interstitial when app is not in foreground.");
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21665M0)).booleanValue()) {
                    this.f23614j.m19147a(this.f23439a.f25289b.f25284b.f25273b);
                }
                return false;
            }
        }
        return !this.f23615k;
    }
}
