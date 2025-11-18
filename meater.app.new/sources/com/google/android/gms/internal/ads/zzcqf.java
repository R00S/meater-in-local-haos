package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;

/* loaded from: classes2.dex */
public final class zzcqf extends zzatu {

    /* renamed from: f */
    private zzbbh<zzcdb> f24919f;

    /* renamed from: g */
    private zzcdb f24920g;

    /* renamed from: h */
    private final zzbjm f24921h;

    /* renamed from: i */
    private final Context f24922i;

    /* renamed from: m */
    private zzbss f24926m;

    /* renamed from: n */
    private final String f24927n;

    /* renamed from: p */
    private final zzcxx f24929p;

    /* renamed from: j */
    private final zzcqa f24923j = new zzcqa();

    /* renamed from: k */
    private final zzcqb f24924k = new zzcqb();

    /* renamed from: l */
    private final zzcpz f24925l = new zzcpz();

    /* renamed from: o */
    private boolean f24928o = false;

    public zzcqf(zzbjm zzbjmVar, Context context, String str) {
        zzcxx zzcxxVar = new zzcxx();
        zzcxxVar.f25320p.add("new_rewarded");
        this.f24929p = zzcxxVar;
        this.f24921h = zzbjmVar;
        this.f24922i = context;
        this.f24927n = str;
    }

    /* renamed from: i7 */
    static /* synthetic */ zzbbh m18937i7(zzcqf zzcqfVar, zzbbh zzbbhVar) {
        zzcqfVar.f24919f = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: G5 */
    public final void mo16375G5(zzaao zzaaoVar) throws RemoteException {
        this.f24925l.m18928a(new BinderC6642en(this, zzaaoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: K2 */
    public final void mo16376K2(zzaue zzaueVar) throws RemoteException {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        this.f24923j.m18930c(zzaueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: L5 */
    public final void mo16377L5(zzatw zzatwVar) throws RemoteException {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        this.f24923j.m18929b(zzatwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: O6 */
    public final zzatq mo16378O6() {
        zzcdb zzcdbVar;
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        if (!this.f24928o || (zzcdbVar = this.f24920g) == null) {
            return null;
        }
        return zzcdbVar.m18677j();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: W1 */
    public final synchronized void mo16379W1(zzxz zzxzVar, zzaub zzaubVar) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        this.f24924k.m18931a(zzaubVar);
        this.f24928o = false;
        if (this.f24919f != null) {
            return;
        }
        if (this.f24920g != null) {
            return;
        }
        zzcya.m19067b(this.f24922i, zzxzVar.f27407k);
        zzcdf zzcdfVarMo15370b = this.f24921h.mo17788m().mo15369a(new zzbqy.zza().m18288e(this.f24922i).m18286b(this.f24929p.m19054t(this.f24927n).m19051n(zzyd.m20823e0()).m19057w(zzxzVar).m19043d()).m18287c()).mo15371c(new zzbtv.zza().m18353c(this.f24923j, this.f24921h.mo17780e()).m18357g(new C6679fn(this, this.f24924k), this.f24921h.mo17780e()).m18354d(this.f24924k, this.f24921h.mo17780e()).m18355e(this.f24923j, this.f24921h.mo17780e()).m18352b(this.f24925l, this.f24921h.mo17780e()).m18351a(new zzcpy(), this.f24921h.mo17780e()).m18360k()).mo15370b();
        this.f24926m = zzcdfVarMo15370b.mo15436d();
        zzbbh<zzcdb> zzbbhVarMo15435c = zzcdfVarMo15370b.mo15435c();
        this.f24919f = zzbbhVarMo15435c;
        zzbar.m17369f(zzbbhVarMo15435c, new C6605dn(this, zzcdfVarMo15370b), this.f24921h.mo17780e());
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: e7 */
    public final synchronized void mo16380e7(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        if (this.f24920g == null) {
            zzbad.m17353i("Rewarded can not be shown before loaded");
            this.f24923j.mo18300R(2);
        } else {
            this.f24920g.m18676i(z, (Activity) ObjectWrapper.m14709k0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: f5 */
    public final synchronized void mo16381f5(IObjectWrapper iObjectWrapper) throws RemoteException {
        mo16380e7(iObjectWrapper, false);
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final Bundle getAdMetadata() throws RemoteException {
        zzbss zzbssVar;
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        return (!this.f24928o || (zzbssVar = this.f24926m) == null) ? new Bundle() : zzbssVar.m18317Y();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        zzcdb zzcdbVar = this.f24920g;
        if (zzcdbVar == null) {
            return null;
        }
        return zzcdbVar.m18227b();
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    public final boolean isLoaded() throws RemoteException {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        return this.f24928o;
    }

    /* renamed from: l7 */
    final void m18940l7() {
        this.f24928o = true;
    }

    @Override // com.google.android.gms.internal.ads.zzatt
    /* renamed from: m2 */
    public final synchronized void mo16382m2(zzaum zzaumVar) throws RemoteException {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        this.f24929p.m19055u(zzaumVar.f22523f);
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21771d1)).booleanValue()) {
            this.f24929p.m19056v(zzaumVar.f22524g);
        }
    }

    /* renamed from: m7 */
    final void m18941m7() {
        this.f24925l.onAdMetadataChanged();
    }
}
