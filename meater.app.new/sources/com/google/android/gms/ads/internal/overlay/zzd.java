package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacu;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagx;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbai;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzwj;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyt;
import java.util.Collections;
import okhttp3.internal.http2.Http2Connection;

@zzard
/* loaded from: classes2.dex */
public class zzd extends zzaqh implements zzx {

    @VisibleForTesting
    private static final int zzdjk = Color.argb(0, 0, 0, 0);
    protected final Activity mActivity;

    @VisibleForTesting
    AdOverlayInfoParcel zzdjl;

    @VisibleForTesting
    zzbgz zzdjm;

    @VisibleForTesting
    private zzj zzdjn;

    @VisibleForTesting
    private zzp zzdjo;

    @VisibleForTesting
    private FrameLayout zzdjq;

    @VisibleForTesting
    private WebChromeClient.CustomViewCallback zzdjr;

    @VisibleForTesting
    private zzi zzdju;
    private Runnable zzdjy;
    private boolean zzdjz;
    private boolean zzdka;

    @VisibleForTesting
    private boolean zzdjp = false;

    @VisibleForTesting
    private boolean zzdjs = false;

    @VisibleForTesting
    private boolean zzdjt = false;

    @VisibleForTesting
    private boolean zzdjv = false;

    @VisibleForTesting
    int zzdjw = 0;
    private final Object zzdjx = new Object();
    private boolean zzdkb = false;
    private boolean zzdkc = false;
    private boolean zzdkd = true;

    public zzd(Activity activity) {
        this.mActivity = activity;
    }

    private final void zzad(boolean z) throws zzh {
        if (!this.zzdka) {
            this.mActivity.requestWindowFeature(1);
        }
        Window window = this.mActivity.getWindow();
        if (window == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        zzbgz zzbgzVar = this.zzdjl.zzdbs;
        zzbii zzbiiVarMo14926p = zzbgzVar != null ? zzbgzVar.mo14926p() : null;
        boolean z2 = zzbiiVarMo14926p != null && zzbiiVarMo14926p.mo17691m();
        this.zzdjv = false;
        if (z2) {
            int i2 = this.zzdjl.orientation;
            com.google.android.gms.ads.internal.zzk.zzli();
            if (i2 == 6) {
                this.zzdjv = this.mActivity.getResources().getConfiguration().orientation == 1;
            } else {
                int i3 = this.zzdjl.orientation;
                com.google.android.gms.ads.internal.zzk.zzli();
                if (i3 == 7) {
                    this.zzdjv = this.mActivity.getResources().getConfiguration().orientation == 2;
                }
            }
        }
        boolean z3 = this.zzdjv;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z3);
        zzbad.m17349e(sb.toString());
        setRequestedOrientation(this.zzdjl.orientation);
        com.google.android.gms.ads.internal.zzk.zzli();
        window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        zzbad.m17349e("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzdjt) {
            this.zzdju.setBackgroundColor(zzdjk);
        } else {
            this.zzdju.setBackgroundColor(-16777216);
        }
        this.mActivity.setContentView(this.zzdju);
        this.zzdka = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzk.zzlh();
                Activity activity = this.mActivity;
                zzbgz zzbgzVar2 = this.zzdjl.zzdbs;
                zzbin zzbinVarMo14925o = zzbgzVar2 != null ? zzbgzVar2.mo14925o() : null;
                zzbgz zzbgzVar3 = this.zzdjl.zzdbs;
                String strMo14934v = zzbgzVar3 != null ? zzbgzVar3.mo14934v() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
                zzbai zzbaiVar = adOverlayInfoParcel.zzbtc;
                zzbgz zzbgzVar4 = adOverlayInfoParcel.zzdbs;
                zzbgz zzbgzVarM17703b = zzbhf.m17703b(activity, zzbinVarMo14925o, strMo14934v, true, z2, null, zzbaiVar, null, null, zzbgzVar4 != null ? zzbgzVar4.mo14901c() : null, zzwj.m20694f());
                this.zzdjm = zzbgzVarM17703b;
                zzbii zzbiiVarMo14926p2 = zzbgzVarM17703b.mo14926p();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjl;
                zzagv zzagvVar = adOverlayInfoParcel2.zzczo;
                zzagx zzagxVar = adOverlayInfoParcel2.zzczp;
                zzu zzuVar = adOverlayInfoParcel2.zzdkq;
                zzbgz zzbgzVar5 = adOverlayInfoParcel2.zzdbs;
                zzbiiVarMo14926p2.mo17681c(null, zzagvVar, null, zzagxVar, zzuVar, true, null, zzbgzVar5 != null ? zzbgzVar5.mo14926p().mo17693o() : null, null, null);
                this.zzdjm.mo14926p().mo17687i(new zzbij(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                    private final zzd zzdke;

                    {
                        this.zzdke = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbij
                    public final void zzae(boolean z4) {
                        zzbgz zzbgzVar6 = this.zzdke.zzdjm;
                        if (zzbgzVar6 != null) {
                            zzbgzVar6.mo14902c0();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzdjl;
                String str = adOverlayInfoParcel3.url;
                if (str != null) {
                    this.zzdjm.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzdkp;
                    if (str2 == null) {
                        throw new zzh("No URL or HTML to display in ad overlay.");
                    }
                    this.zzdjm.loadDataWithBaseURL(adOverlayInfoParcel3.zzdkn, str2, "text/html", "UTF-8", null);
                }
                zzbgz zzbgzVar6 = this.zzdjl.zzdbs;
                if (zzbgzVar6 != null) {
                    zzbgzVar6.mo14898a0(this);
                }
            } catch (Exception e2) {
                zzbad.m17347c("Error obtaining webview.", e2);
                throw new zzh("Could not obtain webview for the overlay.");
            }
        } else {
            zzbgz zzbgzVar7 = this.zzdjl.zzdbs;
            this.zzdjm = zzbgzVar7;
            zzbgzVar7.mo14894W(this.mActivity);
        }
        this.zzdjm.mo14912h0(this);
        zzbgz zzbgzVar8 = this.zzdjl.zzdbs;
        if (zzbgzVar8 != null) {
            zzb(zzbgzVar8.mo14896Z(), this.zzdju);
        }
        ViewParent parent = this.zzdjm.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.zzdjm.getView());
        }
        if (this.zzdjt) {
            this.zzdjm.mo14906e0();
        }
        this.zzdju.addView(this.zzdjm.getView(), -1, -1);
        if (!z && !this.zzdjv) {
            zztl();
        }
        zzac(z2);
        if (this.zzdjm.mo14878E()) {
            zza(z2, true);
        }
    }

    private static void zzb(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzk.zzlv().m16872d(iObjectWrapper, view);
    }

    private final void zzti() {
        if (!this.mActivity.isFinishing() || this.zzdkb) {
            return;
        }
        this.zzdkb = true;
        zzbgz zzbgzVar = this.zzdjm;
        if (zzbgzVar != null) {
            zzbgzVar.mo14900b0(this.zzdjw);
            synchronized (this.zzdjx) {
                if (!this.zzdjz && this.zzdjm.mo14930s()) {
                    Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zzf
                        private final zzd zzdke;

                        {
                            this.zzdke = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdke.zztj();
                        }
                    };
                    this.zzdjy = runnable;
                    zzaxi.f22654a.postDelayed(runnable, ((Long) zzyt.m20848e().m16421c(zzacu.f21816k1)).longValue());
                    return;
                }
            }
        }
        zztj();
    }

    private final void zztl() {
        this.zzdjm.mo14902c0();
    }

    public final void close() {
        this.zzdjw = 2;
        this.mActivity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onBackPressed() {
        this.zzdjw = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public void onCreate(Bundle bundle) throws zzh {
        zzxr zzxrVar;
        this.mActivity.requestWindowFeature(1);
        this.zzdjs = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZzc = AdOverlayInfoParcel.zzc(this.mActivity.getIntent());
            this.zzdjl = adOverlayInfoParcelZzc;
            if (adOverlayInfoParcelZzc == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZzc.zzbtc.f22752h > 7500000) {
                this.zzdjw = 3;
            }
            if (this.mActivity.getIntent() != null) {
                this.zzdkd = this.mActivity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            com.google.android.gms.ads.internal.zzh zzhVar = this.zzdjl.zzdkt;
            if (zzhVar != null) {
                this.zzdjt = zzhVar.zzbre;
            } else {
                this.zzdjt = false;
            }
            if (this.zzdjt && zzhVar.zzbrj != -1) {
                new zzk(this).zzvi();
            }
            if (bundle == null) {
                zzo zzoVar = this.zzdjl.zzdkm;
                if (zzoVar != null && this.zzdkd) {
                    zzoVar.zzta();
                }
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
                if (adOverlayInfoParcel.zzdkr != 1 && (zzxrVar = adOverlayInfoParcel.zzcgi) != null) {
                    zzxrVar.onAdClicked();
                }
            }
            Activity activity = this.mActivity;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjl;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel2.zzdks, adOverlayInfoParcel2.zzbtc.f22750f);
            this.zzdju = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzk.zzli().mo17204r(this.mActivity);
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzdjl;
            int i2 = adOverlayInfoParcel3.zzdkr;
            if (i2 == 1) {
                zzad(false);
                return;
            }
            if (i2 == 2) {
                this.zzdjn = new zzj(adOverlayInfoParcel3.zzdbs);
                zzad(false);
            } else {
                if (i2 != 3) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                zzad(true);
            }
        } catch (zzh e2) {
            zzbad.m17353i(e2.getMessage());
            this.zzdjw = 3;
            this.mActivity.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onDestroy() {
        zzbgz zzbgzVar = this.zzdjm;
        if (zzbgzVar != null) {
            this.zzdju.removeView(zzbgzVar.getView());
        }
        zzti();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onPause() {
        zzte();
        zzo zzoVar = this.zzdjl.zzdkm;
        if (zzoVar != null) {
            zzoVar.onPause();
        }
        if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21686P3)).booleanValue() && this.zzdjm != null && (!this.mActivity.isFinishing() || this.zzdjn == null)) {
            com.google.android.gms.ads.internal.zzk.zzli();
            zzaxo.m17186l(this.zzdjm);
        }
        zzti();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onRestart() {
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onResume() {
        zzo zzoVar = this.zzdjl.zzdkm;
        if (zzoVar != null) {
            zzoVar.onResume();
        }
        zza(this.mActivity.getResources().getConfiguration());
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21686P3)).booleanValue()) {
            return;
        }
        zzbgz zzbgzVar = this.zzdjm;
        if (zzbgzVar == null || zzbgzVar.mo14919l()) {
            zzbad.m17353i("The webview does not exist. Ignoring action.");
        } else {
            com.google.android.gms.ads.internal.zzk.zzli();
            zzaxo.m17187p(this.zzdjm);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdjs);
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onStart() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21686P3)).booleanValue()) {
            zzbgz zzbgzVar = this.zzdjm;
            if (zzbgzVar == null || zzbgzVar.mo14919l()) {
                zzbad.m17353i("The webview does not exist. Ignoring action.");
            } else {
                com.google.android.gms.ads.internal.zzk.zzli();
                zzaxo.m17187p(this.zzdjm);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void onStop() {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21686P3)).booleanValue() && this.zzdjm != null && (!this.mActivity.isFinishing() || this.zzdjn == null)) {
            com.google.android.gms.ads.internal.zzk.zzli();
            zzaxo.m17186l(this.zzdjm);
        }
        zzti();
    }

    public final void setRequestedOrientation(int i2) {
        if (this.mActivity.getApplicationInfo().targetSdkVersion >= ((Integer) zzyt.m20848e().m16421c(zzacu.f21675N4)).intValue()) {
            if (this.mActivity.getApplicationInfo().targetSdkVersion <= ((Integer) zzyt.m20848e().m16421c(zzacu.f21681O4)).intValue()) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= ((Integer) zzyt.m20848e().m16421c(zzacu.f21687P4)).intValue()) {
                    if (i3 <= ((Integer) zzyt.m20848e().m16421c(zzacu.f21693Q4)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.mActivity.setRequestedOrientation(i2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzk.zzlk().m17053h(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzh zzhVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzh zzhVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21822l1)).booleanValue() && (adOverlayInfoParcel2 = this.zzdjl) != null && (zzhVar2 = adOverlayInfoParcel2.zzdkt) != null && zzhVar2.zzbrl;
        boolean z5 = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21828m1)).booleanValue() && (adOverlayInfoParcel = this.zzdjl) != null && (zzhVar = adOverlayInfoParcel.zzdkt) != null && zzhVar.zzbrm;
        if (z && z2 && z4 && !z5) {
            new zzaqb(this.zzdjm, "useCustomClose").m16865e("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzp zzpVar = this.zzdjo;
        if (zzpVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzpVar.zzaf(z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zzac(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final void zzdd() {
        this.zzdka = true;
    }

    public final void zzte() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
        if (adOverlayInfoParcel != null && this.zzdjp) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdjq != null) {
            this.mActivity.setContentView(this.zzdju);
            this.zzdka = true;
            this.zzdjq.removeAllViews();
            this.zzdjq = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdjr;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdjr = null;
        }
        this.zzdjp = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zztf() {
        this.zzdjw = 1;
        this.mActivity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaqg
    public final boolean zztg() {
        this.zzdjw = 0;
        zzbgz zzbgzVar = this.zzdjm;
        if (zzbgzVar == null) {
            return true;
        }
        boolean zMo14933t0 = zzbgzVar.mo14933t0();
        if (!zMo14933t0) {
            this.zzdjm.mo14940y("onbackblocked", Collections.emptyMap());
        }
        return zMo14933t0;
    }

    public final void zzth() {
        this.zzdju.removeView(this.zzdjo);
        zzac(true);
    }

    @VisibleForTesting
    final void zztj() {
        zzbgz zzbgzVar;
        zzo zzoVar;
        if (this.zzdkc) {
            return;
        }
        this.zzdkc = true;
        zzbgz zzbgzVar2 = this.zzdjm;
        if (zzbgzVar2 != null) {
            this.zzdju.removeView(zzbgzVar2.getView());
            zzj zzjVar = this.zzdjn;
            if (zzjVar != null) {
                this.zzdjm.mo14894W(zzjVar.zzlj);
                this.zzdjm.mo14916j0(false);
                ViewGroup viewGroup = this.zzdjn.parent;
                View view = this.zzdjm.getView();
                zzj zzjVar2 = this.zzdjn;
                viewGroup.addView(view, zzjVar2.index, zzjVar2.zzdkh);
                this.zzdjn = null;
            } else if (this.mActivity.getApplicationContext() != null) {
                this.zzdjm.mo14894W(this.mActivity.getApplicationContext());
            }
            this.zzdjm = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjl;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzdkm) != null) {
            zzoVar.zzsz();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjl;
        if (adOverlayInfoParcel2 == null || (zzbgzVar = adOverlayInfoParcel2.zzdbs) == null) {
            return;
        }
        zzb(zzbgzVar.mo14896Z(), this.zzdjl.zzdbs.getView());
    }

    public final void zztk() {
        if (this.zzdjv) {
            this.zzdjv = false;
            zztl();
        }
    }

    public final void zztm() {
        this.zzdju.zzdkg = true;
    }

    public final void zztn() {
        synchronized (this.zzdjx) {
            this.zzdjz = true;
            Runnable runnable = this.zzdjy;
            if (runnable != null) {
                Handler handler = zzaxi.f22654a;
                handler.removeCallbacks(runnable);
                handler.post(this.zzdjy);
            }
        }
    }

    private final void zzac(boolean z) {
        int iIntValue = ((Integer) zzyt.m20848e().m16421c(zzacu.f21698R3)).intValue();
        zzq zzqVar = new zzq();
        zzqVar.size = 50;
        zzqVar.paddingLeft = z ? iIntValue : 0;
        zzqVar.paddingRight = z ? 0 : iIntValue;
        zzqVar.paddingTop = 0;
        zzqVar.paddingBottom = iIntValue;
        this.zzdjo = new zzp(this.mActivity, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdjl.zzdko);
        this.zzdju.addView(this.zzdjo, layoutParams);
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.mActivity);
        this.zzdjq = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzdjq.addView(view, -1, -1);
        this.mActivity.setContentView(this.zzdjq);
        this.zzdka = true;
        this.zzdjr = customViewCallback;
        this.zzdjp = true;
    }

    private final void zza(Configuration configuration) {
        com.google.android.gms.ads.internal.zzh zzhVar;
        com.google.android.gms.ads.internal.zzh zzhVar2 = this.zzdjl.zzdkt;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = zzhVar2 != null && zzhVar2.zzbrf;
        boolean zMo17199j = com.google.android.gms.ads.internal.zzk.zzli().mo17199j(this.mActivity, configuration);
        if ((this.zzdjt && !z3) || zMo17199j) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (zzhVar = this.zzdjl.zzdkt) != null && zzhVar.zzbrk) {
            z2 = true;
        }
        Window window = this.mActivity.getWindow();
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21834n1)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i2 = 256;
            if (z) {
                i2 = 5380;
                if (z2) {
                    i2 = 5894;
                }
            }
            decorView.setSystemUiVisibility(i2);
            return;
        }
        if (z) {
            window.addFlags(1024);
            window.clearFlags(RecyclerView.AbstractC0599l.FLAG_MOVED);
            if (Build.VERSION.SDK_INT < 19 || !z2) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(4098);
            return;
        }
        window.addFlags(RecyclerView.AbstractC0599l.FLAG_MOVED);
        window.clearFlags(1024);
    }
}
