package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbtv;
import java.util.Collections;

@zzard
/* loaded from: classes2.dex */
public final class zzcpt extends zzzl implements zzbtf {

    /* renamed from: f */
    private final zzbjm f24887f;

    /* renamed from: g */
    private final Context f24888g;

    /* renamed from: h */
    private final ViewGroup f24889h;

    /* renamed from: i */
    private final zzcpw f24890i = new zzcpw();

    /* renamed from: j */
    private final zzcpv f24891j = new zzcpv();

    /* renamed from: k */
    private final zzcpy f24892k = new zzcpy();

    /* renamed from: l */
    private final zzbtb f24893l;

    /* renamed from: m */
    private final zzcxx f24894m;

    /* renamed from: n */
    private zzado f24895n;

    /* renamed from: o */
    private zzbnf f24896o;

    /* renamed from: p */
    private zzbbh<zzbnf> f24897p;

    public zzcpt(zzbjm zzbjmVar, Context context, zzyd zzydVar, String str) {
        zzcxx zzcxxVar = new zzcxx();
        this.f24894m = zzcxxVar;
        this.f24889h = new FrameLayout(context);
        this.f24887f = zzbjmVar;
        this.f24888g = context;
        zzcxxVar.m19051n(zzydVar).m19054t(str);
        zzbtb zzbtbVarMo17782g = zzbjmVar.mo17782g();
        this.f24893l = zzbtbVarMo17782g;
        zzbtbVarMo17782g.m18332V(this, zzbjmVar.mo17780e());
    }

    /* renamed from: i7 */
    static /* synthetic */ zzbbh m18916i7(zzcpt zzcptVar, zzbbh zzbbhVar) {
        zzcptVar.f24897p = null;
        return null;
    }

    /* renamed from: m7 */
    private final synchronized zzboc m18920m7(zzcxv zzcxvVar) {
        return this.f24887f.mo17785j().mo14977f(new zzbqy.zza().m18288e(this.f24888g).m18286b(zzcxvVar).m18287c()).mo14972a(new zzbtv.zza().m18358h(this.f24890i, this.f24887f.mo17780e()).m18358h(this.f24891j, this.f24887f.mo17780e()).m18353c(this.f24890i, this.f24887f.mo17780e()).m18357g(this.f24890i, this.f24887f.mo17780e()).m18354d(this.f24890i, this.f24887f.mo17780e()).m18351a(this.f24892k, this.f24887f.mo17780e()).m18360k()).mo14976e(new zzcow(this.f24895n)).mo14978g(new zzbxk(zzbzc.f23850a, null)).mo14974c(new zzbox(this.f24893l)).mo14975d(new zzbnc(this.f24889h)).mo14973b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: B */
    public final boolean mo16341B() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C2 */
    public final synchronized void mo16342C2(zzyd zzydVar) {
        Preconditions.m14367f("setAdSize must be called on the main UI thread.");
        this.f24894m.m19051n(zzydVar);
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar != null) {
            zzbnfVar.mo16097h(this.f24889h, zzydVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C3 */
    public final void mo16343C3(zzaqt zzaqtVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: C5 */
    public final synchronized zzyd mo16344C5() {
        Preconditions.m14367f("getAdSize must be called on the main UI thread.");
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar != null) {
            return zzcxy.m19058a(this.f24888g, Collections.singletonList(zzbnfVar.mo16099j()));
        }
        return this.f24894m.m19040G();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: H6 */
    public final synchronized void mo16345H6(zzado zzadoVar) {
        Preconditions.m14367f("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f24895n = zzadoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: I4 */
    public final zzzs mo16346I4() {
        return this.f24892k.m18926a();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: J4 */
    public final synchronized boolean mo16347J4(zzxz zzxzVar) {
        Preconditions.m14367f("loadAd must be called on the main UI thread.");
        if (this.f24897p != null) {
            return false;
        }
        zzcya.m19067b(this.f24888g, zzxzVar.f27407k);
        zzboc zzbocVarM18920m7 = m18920m7(this.f24894m.m19057w(zzxzVar).m19043d());
        zzbbh<zzbnf> zzbbhVarMo15071d = zzbocVarM18920m7.mo15071d();
        this.f24897p = zzbbhVarMo15071d;
        zzbar.m17369f(zzbbhVarMo15071d, new C6494an(this, zzbocVarM18920m7), this.f24887f.mo17780e());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: L0 */
    public final void mo16348L0(zzyz zzyzVar) {
        Preconditions.m14367f("setAdListener must be called on the main UI thread.");
        this.f24890i.m18924c(zzyzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    /* renamed from: P */
    public final synchronized void mo18325P() {
        boolean zM17182q;
        Object parent = this.f24889h.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            zM17182q = zzk.zzlg().m17182q(view, view.getContext());
        } else {
            zM17182q = false;
        }
        if (zM17182q) {
            mo16347J4(this.f24894m.m19041b());
        } else {
            this.f24893l.m18324i0(60);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: P5 */
    public final void mo16349P5(zzzs zzzsVar) {
        Preconditions.m14367f("setAppEventListener must be called on the main UI thread.");
        this.f24892k.m18927b(zzzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: S0 */
    public final IObjectWrapper mo16350S0() {
        Preconditions.m14367f("destroy must be called on the main UI thread.");
        return ObjectWrapper.m14708E0(this.f24889h);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: U5 */
    public final void mo16351U5(zzaqn zzaqnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: W6 */
    public final synchronized void mo16352W6(zzacd zzacdVar) {
        Preconditions.m14367f("setVideoOptions must be called on the main UI thread.");
        this.f24894m.m19049k(zzacdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: X5 */
    public final void mo16353X5(zzaax zzaaxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: c0 */
    public final synchronized String mo16354c0() {
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar == null) {
            return null;
        }
        return zzbnfVar.m18229f();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void destroy() {
        Preconditions.m14367f("destroy must be called on the main UI thread.");
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar != null) {
            zzbnfVar.mo18226a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: f6 */
    public final synchronized String mo16355f6() {
        return this.f24894m.m19042c();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final Bundle getAdMetadata() {
        Preconditions.m14367f("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized String getMediationAdapterClassName() {
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar == null) {
            return null;
        }
        return zzbnfVar.m18227b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized zzaar getVideoController() {
        Preconditions.m14367f("getVideoController must be called from the main thread.");
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar == null) {
            return null;
        }
        return zzbnfVar.mo16096g();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: h0 */
    public final void mo16356h0(zzatb zzatbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: k4 */
    public final void mo16357k4() {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: m4 */
    public final void mo16358m4(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean mo16359p0() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbbh<com.google.android.gms.internal.ads.zzbnf> r0 = r1.f24897p     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L10
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcpt.mo16359p0():boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void pause() {
        Preconditions.m14367f("pause must be called on the main UI thread.");
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar != null) {
            zzbnfVar.m18228d().m18304f0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final synchronized void resume() {
        Preconditions.m14367f("resume must be called on the main UI thread.");
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar != null) {
            zzbnfVar.m18228d().m18305g0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: t1 */
    public final synchronized void mo16360t1(boolean z) {
        Preconditions.m14367f("setManualImpressionsEnabled must be called from the main thread.");
        this.f24894m.m19048j(z);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: v4 */
    public final synchronized void mo16361v4(zzzy zzzyVar) {
        Preconditions.m14367f("setCorrelationIdProvider must be called on the main UI thread");
        this.f24894m.m19052o(zzzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: w4 */
    public final void mo16362w4(zzyw zzywVar) {
        Preconditions.m14367f("setAdListener must be called on the main UI thread.");
        this.f24891j.m18922a(zzywVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: x5 */
    public final zzyz mo16363x5() {
        return this.f24890i.m18923b();
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: x6 */
    public final synchronized void mo16364x6() {
        Preconditions.m14367f("recordManualImpression must be called on the main UI thread.");
        zzbnf zzbnfVar = this.f24896o;
        if (zzbnfVar != null) {
            zzbnfVar.mo16101l();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzk
    /* renamed from: z0 */
    public final void mo16365z0(zzzp zzzpVar) {
        Preconditions.m14367f("setAdMetadataListener must be called on the main UI thread.");
    }
}
