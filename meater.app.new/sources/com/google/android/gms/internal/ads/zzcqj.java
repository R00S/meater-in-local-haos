package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

/* loaded from: classes2.dex */
public final class zzcqj extends zzasx {

    /* renamed from: f */
    private zzbbh<zzcdb> f24930f;

    /* renamed from: g */
    private zzcdb f24931g;

    /* renamed from: h */
    private final zzbjm f24932h;

    /* renamed from: i */
    private final Context f24933i;

    /* renamed from: m */
    private zzbss f24937m;

    /* renamed from: j */
    private final zzcqc f24934j = new zzcqc();

    /* renamed from: k */
    private final zzcpx f24935k = new zzcpx();

    /* renamed from: l */
    private final zzcpy f24936l = new zzcpy();

    /* renamed from: n */
    private boolean f24938n = false;

    /* renamed from: o */
    private final zzcxx f24939o = new zzcxx();

    /* renamed from: p */
    private boolean f24940p = false;

    public zzcqj(zzbjm zzbjmVar, Context context) {
        this.f24932h = zzbjmVar;
        this.f24933i = context;
    }

    /* renamed from: i7 */
    static /* synthetic */ zzbbh m18942i7(zzcqj zzcqjVar, zzbbh zzbbhVar) {
        zzcqjVar.f24930f = null;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /* renamed from: l7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized boolean m18945l7() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcdb r0 = r1.f24931g     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.m18674g()     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Le
            r0 = 1
        Lc:
            monitor-exit(r1)
            return r0
        Le:
            r0 = 0
            goto Lc
        L10:
            r0 = move-exception
            monitor-exit(r1)
            goto L14
        L13:
            throw r0
        L14:
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqj.m18945l7():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: M6 */
    public final synchronized void mo16384M6(IObjectWrapper iObjectWrapper) {
        Preconditions.m14367f("pause must be called on the main UI thread.");
        if (this.f24931g != null) {
            this.f24931g.m18675h().m18304f0(iObjectWrapper == null ? null : (Context) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: T4 */
    public final void mo16385T4(zzasu zzasuVar) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f24934j.m18932b(zzasuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: T5 */
    public final synchronized void mo16386T5(IObjectWrapper iObjectWrapper) {
        Preconditions.m14367f("resume must be called on the main UI thread.");
        if (this.f24931g != null) {
            this.f24931g.m18675h().m18305g0(iObjectWrapper == null ? null : (Context) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: d2 */
    public final synchronized void mo16387d2(IObjectWrapper iObjectWrapper) {
        Preconditions.m14367f("destroy must be called on the main UI thread.");
        Context context = null;
        this.f24935k.m18925a(null);
        this.f24938n = false;
        if (this.f24931g != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.m14709k0(iObjectWrapper);
            }
            this.f24931g.m18675h().m18306i0(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void destroy() throws RemoteException {
        mo16387d2(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: g5 */
    public final void mo16388g5(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final Bundle getAdMetadata() {
        zzbss zzbssVar;
        Preconditions.m14367f("getAdMetadata can only be called from the UI thread.");
        return (!this.f24938n || (zzbssVar = this.f24937m) == null) ? new Bundle() : zzbssVar.m18317Y();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        zzcdb zzcdbVar = this.f24931g;
        if (zzcdbVar == null) {
            return null;
        }
        return zzcdbVar.m18227b();
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: h0 */
    public final void mo16389h0(zzatb zzatbVar) throws RemoteException {
        Preconditions.m14367f("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f24934j.m18933c(zzatbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: i4 */
    public final synchronized void mo16390i4(zzath zzathVar) throws RemoteException {
        Preconditions.m14367f("loadAd must be called on the main UI thread.");
        this.f24938n = false;
        String str = zzathVar.f22508g;
        if (str == null) {
            zzbad.m17351g("Ad unit ID should not be null for rewarded video ad.");
            this.f24932h.mo17780e().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gn

                /* renamed from: f */
                private final zzcqj f18986f;

                {
                    this.f18986f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18986f.m18948o7();
                }
            });
            return;
        }
        if (zzacw.m16427a(str)) {
            return;
        }
        if (this.f24930f != null) {
            return;
        }
        if (m18945l7()) {
            if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21843o4)).booleanValue()) {
                return;
            }
        }
        zzcya.m19067b(this.f24933i, zzathVar.f22507f.f27407k);
        this.f24931g = null;
        zzcdf zzcdfVarMo15370b = this.f24932h.mo17788m().mo15369a(new zzbqy.zza().m18288e(this.f24933i).m18286b(this.f24939o.m19054t(zzathVar.f22508g).m19051n(zzyd.m20823e0()).m19057w(zzathVar.f22507f).m19043d()).m18290i(null).m18287c()).mo15371c(new zzbtv.zza().m18353c(this.f24934j, this.f24932h.mo17780e()).m18357g(new C6827jn(this, this.f24934j), this.f24932h.mo17780e()).m18354d(this.f24934j, this.f24932h.mo17780e()).m18352b(this.f24935k, this.f24932h.mo17780e()).m18351a(this.f24936l, this.f24932h.mo17780e()).m18360k()).mo15370b();
        this.f24937m = zzcdfVarMo15370b.mo15436d();
        zzbbh<zzcdb> zzbbhVarMo15435c = zzcdfVarMo15370b.mo15435c();
        this.f24930f = zzbbhVarMo15435c;
        zzbar.m17369f(zzbbhVarMo15435c, new C6753hn(this, zzcdfVarMo15370b), this.f24932h.mo17780e());
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final boolean isLoaded() throws RemoteException {
        Preconditions.m14367f("isLoaded must be called on the main UI thread.");
        return m18945l7();
    }

    /* renamed from: m7 */
    final void m18946m7() {
        this.f24938n = true;
    }

    /* renamed from: n7 */
    final void m18947n7() {
        this.f24935k.onAdMetadataChanged();
    }

    /* renamed from: o7 */
    final /* synthetic */ void m18948o7() {
        this.f24934j.onAdFailedToLoad(1);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void pause() throws RemoteException {
        mo16384M6(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final void resume() throws RemoteException {
        mo16386T5(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo16391s0(com.google.android.gms.dynamic.IObjectWrapper r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "showAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.m14367f(r0)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.ads.zzcdb r0 = r2.f24931g     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Lc
            monitor-exit(r2)
            return
        Lc:
            if (r3 == 0) goto L19
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.m14709k0(r3)     // Catch: java.lang.Throwable -> L23
            boolean r0 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L19
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L23
            goto L1a
        L19:
            r3 = 0
        L1a:
            com.google.android.gms.internal.ads.zzcdb r0 = r2.f24931g     // Catch: java.lang.Throwable -> L23
            boolean r1 = r2.f24940p     // Catch: java.lang.Throwable -> L23
            r0.m18676i(r1, r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L23:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcqj.mo16391s0(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21771d1)).booleanValue()) {
            Preconditions.m14367f("#008 Must be called on the main UI thread.: setCustomData");
            this.f24939o.m19056v(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.m14367f("setImmersiveMode must be called on the main UI thread.");
        this.f24940p = z;
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.m14367f("setUserId must be called on the main UI thread.");
        this.f24939o.m19055u(str);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    public final synchronized void show() throws RemoteException {
        mo16391s0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzasw
    /* renamed from: z0 */
    public final void mo16392z0(zzzp zzzpVar) {
        Preconditions.m14367f("setAdMetadataListener can only be called from the UI thread.");
        this.f24935k.m18925a(new BinderC6790in(this, zzzpVar));
    }
}
