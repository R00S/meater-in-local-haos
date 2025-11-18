package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.PlatformVersion;
import p024c.p038c.p039b.C0859c;

@zzard
/* loaded from: classes2.dex */
public final class zzapl implements MediationInterstitialAdapter {

    /* renamed from: a */
    private Activity f22220a;

    /* renamed from: b */
    private MediationInterstitialListener f22221b;

    /* renamed from: c */
    private Uri f22222c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzbad.m17349e("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzbad.m17349e("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzbad.m17349e("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f22221b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzbad.m17353i("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzbad.m17353i("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f22221b.onAdFailedToLoad(this, 0);
            return;
        }
        if (!(PlatformVersion.m14638b() && zzads.m16458a(context))) {
            zzbad.m17353i("Default browser does not support custom tabs. Bailing out.");
            this.f22221b.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzbad.m17353i("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f22221b.onAdFailedToLoad(this, 0);
        } else {
            this.f22220a = (Activity) context;
            this.f22222c = Uri.parse(string);
            this.f22221b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        C0859c c0859cM5400c = new C0859c.a().m5400c();
        c0859cM5400c.f5675a.setData(this.f22222c);
        zzaxi.f22654a.post(new RunnableC6696g3(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(c0859cM5400c.f5675a), null, new C6659f3(this), null, new zzbai(0, 0, false))));
        zzk.zzlk().m17057n();
    }
}
