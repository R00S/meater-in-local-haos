package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzbhf {
    /* renamed from: a */
    public static zzbbh<zzbgz> m17702a(final Context context, final zzbai zzbaiVar, final String str, final zzdh zzdhVar, final com.google.android.gms.ads.internal.zza zzaVar) {
        return zzbar.m17366c(zzbar.m17378o(null), new zzbal(context, zzdhVar, zzbaiVar, zzaVar, str) { // from class: com.google.android.gms.internal.ads.xa

            /* renamed from: a */
            private final Context f20955a;

            /* renamed from: b */
            private final zzdh f20956b;

            /* renamed from: c */
            private final zzbai f20957c;

            /* renamed from: d */
            private final com.google.android.gms.ads.internal.zza f20958d;

            /* renamed from: e */
            private final String f20959e;

            {
                this.f20955a = context;
                this.f20956b = zzdhVar;
                this.f20957c = zzbaiVar;
                this.f20958d = zzaVar;
                this.f20959e = str;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) throws zzbhj {
                Context context2 = this.f20955a;
                zzdh zzdhVar2 = this.f20956b;
                zzbai zzbaiVar2 = this.f20957c;
                com.google.android.gms.ads.internal.zza zzaVar2 = this.f20958d;
                String str2 = this.f20959e;
                zzk.zzlh();
                zzbgz zzbgzVarM17703b = zzbhf.m17703b(context2, zzbin.m17735b(), HttpUrl.FRAGMENT_ENCODE_SET, false, false, zzdhVar2, zzbaiVar2, null, null, zzaVar2, zzwj.m20694f());
                final zzbbq zzbbqVarM17382e = zzbbq.m17382e(zzbgzVarM17703b);
                zzbgzVarM17703b.mo14926p().mo17687i(new zzbij(zzbbqVarM17382e) { // from class: com.google.android.gms.internal.ads.za

                    /* renamed from: a */
                    private final zzbbq f21381a;

                    {
                        this.f21381a = zzbbqVarM17382e;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbij
                    public final void zzae(boolean z) {
                        this.f21381a.m17383f();
                    }
                });
                zzbgzVarM17703b.loadUrl(str2);
                return zzbbqVarM17382e;
            }
        }, zzbbm.f22757a);
    }

    /* renamed from: b */
    public static zzbgz m17703b(final Context context, final zzbin zzbinVar, final String str, final boolean z, final boolean z2, final zzdh zzdhVar, final zzbai zzbaiVar, zzadi zzadiVar, final zzj zzjVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzwj zzwjVar) throws zzbhj {
        zzacu.m16423a(context);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21683P0)).booleanValue()) {
            return zzbit.m17767a(context, zzbinVar, str, z, z2, zzdhVar, zzbaiVar, null, zzjVar, zzaVar, zzwjVar);
        }
        try {
            final zzadi zzadiVar2 = null;
            return (zzbgz) zzazl.m17283b(new Callable(context, zzbinVar, str, z, z2, zzdhVar, zzbaiVar, zzadiVar2, zzjVar, zzaVar, zzwjVar) { // from class: com.google.android.gms.internal.ads.ya

                /* renamed from: f */
                private final Context f21110f;

                /* renamed from: g */
                private final zzbin f21111g;

                /* renamed from: h */
                private final String f21112h;

                /* renamed from: i */
                private final boolean f21113i;

                /* renamed from: j */
                private final boolean f21114j;

                /* renamed from: k */
                private final zzdh f21115k;

                /* renamed from: l */
                private final zzbai f21116l;

                /* renamed from: m */
                private final zzadi f21117m = null;

                /* renamed from: n */
                private final zzj f21118n;

                /* renamed from: o */
                private final com.google.android.gms.ads.internal.zza f21119o;

                /* renamed from: p */
                private final zzwj f21120p;

                {
                    this.f21110f = context;
                    this.f21111g = zzbinVar;
                    this.f21112h = str;
                    this.f21113i = z;
                    this.f21114j = z2;
                    this.f21115k = zzdhVar;
                    this.f21116l = zzbaiVar;
                    this.f21118n = zzjVar;
                    this.f21119o = zzaVar;
                    this.f21120p = zzwjVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.f21110f;
                    zzbin zzbinVar2 = this.f21111g;
                    String str2 = this.f21112h;
                    boolean z3 = this.f21113i;
                    boolean z4 = this.f21114j;
                    zzdh zzdhVar2 = this.f21115k;
                    zzbai zzbaiVar2 = this.f21116l;
                    zzadi zzadiVar3 = this.f21117m;
                    zzj zzjVar2 = this.f21118n;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.f21119o;
                    zzwj zzwjVar2 = this.f21120p;
                    zzbhk zzbhkVar = new zzbhk(ViewTreeObserverOnGlobalLayoutListenerC6519bb.m14864L0(context2, zzbinVar2, str2, z3, z4, zzdhVar2, zzbaiVar2, zzadiVar3, zzjVar2, zzaVar2, zzwjVar2));
                    zzbhkVar.setWebViewClient(zzk.zzli().mo17196g(zzbhkVar, zzwjVar2, z4));
                    zzbhkVar.setWebChromeClient(new zzbgr(zzbhkVar));
                    return zzbhkVar;
                }
            });
        } catch (Throwable th) {
            throw new zzbhj("Webview initialization failed.", th);
        }
    }
}
