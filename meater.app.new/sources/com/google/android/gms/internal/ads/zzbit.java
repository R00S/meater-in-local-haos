package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

@zzard
/* loaded from: classes2.dex */
public final class zzbit {
    /* renamed from: a */
    public static zzbgz m17767a(final Context context, final zzbin zzbinVar, final String str, final boolean z, final boolean z2, final zzdh zzdhVar, final zzbai zzbaiVar, zzadi zzadiVar, final zzj zzjVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzwj zzwjVar) throws zzbhj {
        try {
            final zzadi zzadiVar2 = null;
            return (zzbgz) zzazl.m17283b(new Callable(context, zzbinVar, str, z, z2, zzdhVar, zzbaiVar, zzadiVar2, zzjVar, zzaVar, zzwjVar) { // from class: com.google.android.gms.internal.ads.nb

                /* renamed from: f */
                private final Context f19999f;

                /* renamed from: g */
                private final zzbin f20000g;

                /* renamed from: h */
                private final String f20001h;

                /* renamed from: i */
                private final boolean f20002i;

                /* renamed from: j */
                private final boolean f20003j;

                /* renamed from: k */
                private final zzdh f20004k;

                /* renamed from: l */
                private final zzbai f20005l;

                /* renamed from: m */
                private final zzadi f20006m;

                /* renamed from: n */
                private final zzj f20007n;

                /* renamed from: o */
                private final com.google.android.gms.ads.internal.zza f20008o;

                /* renamed from: p */
                private final zzwj f20009p;

                {
                    this.f19999f = context;
                    this.f20000g = zzbinVar;
                    this.f20001h = str;
                    this.f20002i = z;
                    this.f20003j = z2;
                    this.f20004k = zzdhVar;
                    this.f20005l = zzbaiVar;
                    this.f20006m = zzadiVar2;
                    this.f20007n = zzjVar;
                    this.f20008o = zzaVar;
                    this.f20009p = zzwjVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = this.f19999f;
                    zzbin zzbinVar2 = this.f20000g;
                    String str2 = this.f20001h;
                    boolean z3 = this.f20002i;
                    boolean z4 = this.f20003j;
                    zzdh zzdhVar2 = this.f20004k;
                    zzbai zzbaiVar2 = this.f20005l;
                    zzadi zzadiVar3 = this.f20006m;
                    zzj zzjVar2 = this.f20007n;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.f20008o;
                    zzwj zzwjVar2 = this.f20009p;
                    zzbio zzbioVar = new zzbio();
                    ViewTreeObserverOnGlobalLayoutListenerC7000ob viewTreeObserverOnGlobalLayoutListenerC7000ob = new ViewTreeObserverOnGlobalLayoutListenerC7000ob(new zzbim(context2), zzbioVar, zzbinVar2, str2, z3, z4, zzdhVar2, zzbaiVar2, zzadiVar3, zzjVar2, zzaVar2, zzwjVar2);
                    zzbhk zzbhkVar = new zzbhk(viewTreeObserverOnGlobalLayoutListenerC7000ob);
                    viewTreeObserverOnGlobalLayoutListenerC7000ob.setWebChromeClient(new zzbgr(zzbhkVar));
                    zzbioVar.m17766y(zzbhkVar, z4);
                    return zzbhkVar;
                }
            });
        } catch (Throwable th) {
            zzk.zzlk().m17052e(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbhj("Webview initialization failed.", th);
        }
    }
}
