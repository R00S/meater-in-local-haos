package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

/* loaded from: classes2.dex */
public final class zzcdb extends zzbpc {

    /* renamed from: f */
    private final Context f24097f;

    /* renamed from: g */
    private final zzbwz f24098g;

    /* renamed from: h */
    private final zzbup f24099h;

    /* renamed from: i */
    private final zzbrp f24100i;

    /* renamed from: j */
    private final zzbpv f24101j;

    /* renamed from: k */
    private final zzatq f24102k;

    /* renamed from: l */
    private final zzdan f24103l;

    /* renamed from: m */
    private boolean f24104m = false;

    zzcdb(Context context, zzbwz zzbwzVar, zzbup zzbupVar, zzbrp zzbrpVar, zzbry zzbryVar, zzbpv zzbpvVar, zzcxm zzcxmVar, zzdan zzdanVar) {
        this.f24097f = context;
        this.f24098g = zzbwzVar;
        this.f24099h = zzbupVar;
        this.f24100i = zzbrpVar;
        this.f23441c = zzbryVar;
        this.f24101j = zzbpvVar;
        this.f24103l = zzdanVar;
        this.f24102k = new zzaup(zzcxmVar.f25254l);
    }

    /* renamed from: g */
    public final boolean m18674g() {
        return this.f24101j.m18249a();
    }

    /* renamed from: h */
    public final zzbry m18675h() {
        return this.f23441c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context] */
    /* renamed from: i */
    public final void m18676i(boolean z, Activity activity) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21659L0)).booleanValue()) {
            zzk.zzlg();
            if (zzaxi.m17121A(this.f24097f)) {
                zzbad.m17353i("Rewarded ad can not be shown when app is not in foreground.");
                this.f24100i.mo18300R(3);
                if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21665M0)).booleanValue()) {
                    this.f24103l.m19147a(this.f23439a.f25289b.f25284b.f25273b);
                    return;
                }
                return;
            }
        }
        if (this.f24104m) {
            zzbad.m17353i("The rewarded ad have been showed.");
            this.f24100i.mo18300R(1);
            return;
        }
        this.f24104m = true;
        this.f24099h.mo18380y();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f24097f;
        }
        this.f24098g.mo14951a(z, activity2);
    }

    /* renamed from: j */
    public final zzatq m18677j() {
        return this.f24102k;
    }
}
