package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzcpm extends zzzl {

    /* renamed from: f */
    private final Context f24864f;

    /* renamed from: g */
    private final zzyz f24865g;

    /* renamed from: h */
    private final zzcxv f24866h;

    /* renamed from: i */
    private final zzbnf f24867i;

    /* renamed from: j */
    private final ViewGroup f24868j;

    public zzcpm(Context context, zzyz zzyzVar, zzcxv zzcxvVar, zzbnf zzbnfVar) {
        this.f24864f = context;
        this.f24865g = zzyzVar;
        this.f24866h = zzcxvVar;
        this.f24867i = zzbnfVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(zzbnfVar.mo16098i(), zzk.zzli().mo17206t());
        frameLayout.setMinimumHeight(mo16344C5().f27449h);
        frameLayout.setMinimumWidth(mo16344C5().f27452k);
        this.f24868j = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: B */
    public final boolean mo16341B() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C2 */
    public final void mo16342C2(zzyd zzydVar) throws RemoteException {
        zzbnf zzbnfVar = this.f24867i;
        if (zzbnfVar != null) {
            zzbnfVar.mo16097h(this.f24868j, zzydVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C3 */
    public final void mo16343C3(zzaqt zzaqtVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C5 */
    public final zzyd mo16344C5() {
        return zzcxy.m19058a(this.f24864f, Collections.singletonList(this.f24867i.mo16099j()));
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: H6 */
    public final void mo16345H6(zzado zzadoVar) throws RemoteException {
        zzbad.m17352h("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: I4 */
    public final zzzs mo16346I4() throws RemoteException {
        return this.f24866h.f25303n;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: J4 */
    public final boolean mo16347J4(zzxz zzxzVar) throws RemoteException {
        zzbad.m17352h("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: L0 */
    public final void mo16348L0(zzyz zzyzVar) throws RemoteException {
        zzbad.m17352h("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: P5 */
    public final void mo16349P5(zzzs zzzsVar) throws RemoteException {
        zzbad.m17352h("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: S0 */
    public final IObjectWrapper mo16350S0() throws RemoteException {
        return ObjectWrapper.m14708E0(this.f24868j);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: U5 */
    public final void mo16351U5(zzaqn zzaqnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: W6 */
    public final void mo16352W6(zzacd zzacdVar) throws RemoteException {
        zzbad.m17352h("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: X5 */
    public final void mo16353X5(zzaax zzaaxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: c0 */
    public final String mo16354c0() throws RemoteException {
        return this.f24867i.m18229f();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void destroy() throws RemoteException {
        Preconditions.m14367f("destroy must be called on the main UI thread.");
        this.f24867i.mo18226a();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: f6 */
    public final String mo16355f6() throws RemoteException {
        return this.f24866h.f25295f;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final Bundle getAdMetadata() throws RemoteException {
        zzbad.m17352h("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.f24867i.m18227b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final zzaar getVideoController() throws RemoteException {
        return this.f24867i.mo16096g();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: h0 */
    public final void mo16356h0(zzatb zzatbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: k4 */
    public final void mo16357k4() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: m4 */
    public final void mo16358m4(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: p0 */
    public final boolean mo16359p0() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void pause() throws RemoteException {
        Preconditions.m14367f("destroy must be called on the main UI thread.");
        this.f24867i.m18228d().m18304f0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void resume() throws RemoteException {
        Preconditions.m14367f("destroy must be called on the main UI thread.");
        this.f24867i.m18228d().m18305g0(null);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void showInterstitial() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: t1 */
    public final void mo16360t1(boolean z) throws RemoteException {
        zzbad.m17352h("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: v4 */
    public final void mo16361v4(zzzy zzzyVar) throws RemoteException {
        zzbad.m17352h("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: w4 */
    public final void mo16362w4(zzyw zzywVar) throws RemoteException {
        zzbad.m17352h("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: x5 */
    public final zzyz mo16363x5() throws RemoteException {
        return this.f24865g;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: x6 */
    public final void mo16364x6() throws RemoteException {
        this.f24867i.mo16101l();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: z0 */
    public final void mo16365z0(zzzp zzzpVar) throws RemoteException {
        zzbad.m17352h("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
