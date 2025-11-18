package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;
import p024c.p038c.p039b.C0859c;

/* loaded from: classes2.dex */
public final class zzckr implements zzcjv<zzbvx> {

    /* renamed from: a */
    private final Context f24447a;

    /* renamed from: b */
    private final zzbws f24448b;

    /* renamed from: c */
    private final Executor f24449c;

    /* renamed from: d */
    private final zzcxk f24450d;

    public zzckr(Context context, Executor executor, zzbws zzbwsVar, zzcxk zzcxkVar) {
        this.f24447a = context;
        this.f24448b = zzbwsVar;
        this.f24449c = executor;
        this.f24450d = zzcxkVar;
    }

    /* renamed from: d */
    private static String m18856d(zzcxm zzcxmVar) {
        try {
            return zzcxmVar.f25261s.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<zzbvx> mo18846a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        String strM18856d = m18856d(zzcxmVar);
        final Uri uri = strM18856d != null ? Uri.parse(strM18856d) : null;
        return zzbar.m17366c(zzbar.m17378o(null), new zzbal(this, uri, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.pk

            /* renamed from: a */
            private final zzckr f20309a;

            /* renamed from: b */
            private final Uri f20310b;

            /* renamed from: c */
            private final zzcxu f20311c;

            /* renamed from: d */
            private final zzcxm f20312d;

            {
                this.f20309a = this;
                this.f20310b = uri;
                this.f20311c = zzcxuVar;
                this.f20312d = zzcxmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f20309a.m18857c(this.f20310b, this.f20311c, this.f20312d, obj);
            }
        }, this.f24449c);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        return (this.f24447a instanceof Activity) && PlatformVersion.m14638b() && zzads.m16458a(this.f24447a) && !TextUtils.isEmpty(m18856d(zzcxmVar));
    }

    /* renamed from: c */
    final /* synthetic */ zzbbh m18857c(Uri uri, zzcxu zzcxuVar, zzcxm zzcxmVar, Object obj) throws Exception {
        try {
            C0859c c0859cM5400c = new C0859c.a().m5400c();
            c0859cM5400c.f5675a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(c0859cM5400c.f5675a);
            final zzbbr zzbbrVar = new zzbbr();
            zzbvy zzbvyVarMo15300a = this.f24448b.mo15300a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbvz(new zzbwz(zzbbrVar) { // from class: com.google.android.gms.internal.ads.qk

                /* renamed from: a */
                private final zzbbr f20398a;

                {
                    this.f20398a = zzbbrVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbwz
                /* renamed from: a */
                public final void mo14951a(boolean z, Context context) {
                    zzbbr zzbbrVar2 = this.f20398a;
                    try {
                        zzk.zzlf();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzbbrVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }));
            zzbbrVar.m17385a(new AdOverlayInfoParcel(zzcVar, null, zzbvyVarMo15300a.mo15338i(), null, new zzbai(0, 0, false)));
            this.f24450d.m19021f();
            return zzbar.m17378o(zzbvyVarMo15300a.mo15337h());
        } catch (Throwable th) {
            zzbad.m17347c("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
