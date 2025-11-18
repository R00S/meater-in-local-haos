package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.internal.zzk;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcfz implements AppEventListener, zzbrl, zzbro, zzbrw, zzbrx, zzbsr, zzbtk, zzczz, zzxr {

    /* renamed from: f */
    private final List<Object> f24257f;

    /* renamed from: g */
    private final zzcfn f24258g;

    /* renamed from: h */
    private long f24259h;

    public zzcfz(zzcfn zzcfnVar, zzbjm zzbjmVar) {
        this.f24258g = zzcfnVar;
        this.f24257f = Collections.singletonList(zzbjmVar);
    }

    /* renamed from: f */
    private final void m18755f(Class cls, String str, Object... objArr) throws IOException {
        zzcfn zzcfnVar = this.f24258g;
        List<Object> list = this.f24257f;
        String simpleName = cls.getSimpleName();
        zzcfnVar.m18734a(list, simpleName.length() != 0 ? "Event-".concat(simpleName) : new String("Event-"), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: N */
    public final void mo15437N(zzarx zzarxVar) throws IOException {
        this.f24259h = zzk.zzln().mo14609b();
        m18755f(zzbtk.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    /* renamed from: a */
    public final void mo17882a(zzasr zzasrVar, String str, String str2) throws IOException {
        m18755f(zzbrl.class, "onRewarded", zzasrVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: b */
    public final void mo18713b(zzczs zzczsVar, String str, Throwable th) throws IOException {
        m18755f(zzczr.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: c */
    public final void mo18714c(zzczs zzczsVar, String str) throws IOException {
        m18755f(zzczr.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: d */
    public final void mo18715d(zzczs zzczsVar, String str) throws IOException {
        m18755f(zzczr.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzczz
    /* renamed from: e */
    public final void mo18716e(zzczs zzczsVar, String str) throws IOException {
        m18755f(zzczr.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: j */
    public final void mo16103j(Context context) throws IOException {
        m18755f(zzbrx.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: k */
    public final void mo16104k(Context context) throws IOException {
        m18755f(zzbrx.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void onAdClicked() throws IOException {
        m18755f(zzxr.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdClosed() throws IOException {
        m18755f(zzbrl.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void onAdFailedToLoad(int i2) throws IOException {
        m18755f(zzbro.class, "onAdFailedToLoad", Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final void onAdImpression() throws IOException {
        m18755f(zzbrw.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdLeftApplication() throws IOException {
        m18755f(zzbrl.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() throws IOException {
        long jMo14609b = zzk.zzln().mo14609b() - this.f24259h;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(jMo14609b);
        zzawz.m17082m(sb.toString());
        m18755f(zzbsr.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onAdOpened() throws IOException {
        m18755f(zzbrl.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final void onAppEvent(String str, String str2) throws IOException {
        m18755f(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoCompleted() throws IOException {
        m18755f(zzbrl.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void onRewardedVideoStarted() throws IOException {
        m18755f(zzbrl.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: q */
    public final void mo15438q(zzcxu zzcxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrx
    /* renamed from: r */
    public final void mo16105r(Context context) throws IOException {
        m18755f(zzbrx.class, "onPause", context);
    }
}
