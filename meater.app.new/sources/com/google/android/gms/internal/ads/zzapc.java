package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzapc extends zzaow {

    /* renamed from: f */
    private final RtbAdapter f22214f;

    /* renamed from: g */
    private MediationInterstitialAd f22215g;

    /* renamed from: h */
    private MediationRewardedAd f22216h;

    public zzapc(RtbAdapter rtbAdapter) {
        this.f22214f = rtbAdapter;
    }

    /* renamed from: k7 */
    private static String m16826k7(String str, zzxz zzxzVar) {
        String str2 = zzxzVar.f27422z;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* renamed from: l7 */
    private static boolean m16827l7(zzxz zzxzVar) {
        if (zzxzVar.f27407k) {
            return true;
        }
        zzyt.m20844a();
        return zzazt.m17317v();
    }

    /* renamed from: m7 */
    private final Bundle m16828m7(zzxz zzxzVar) {
        Bundle bundle;
        Bundle bundle2 = zzxzVar.f27414r;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f22214f.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    /* renamed from: n7 */
    private static Bundle m16829n7(String str) throws RemoteException {
        String strValueOf = String.valueOf(str);
        zzbad.m17353i(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: K4 */
    public final void mo16810K4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaoj zzaojVar, zzamv zzamvVar, zzyd zzydVar) throws RemoteException {
        try {
            this.f22214f.loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.m14709k0(iObjectWrapper), str, m16829n7(str2), m16828m7(zzxzVar), m16827l7(zzxzVar), zzxzVar.f27412p, zzxzVar.f27408l, zzxzVar.f27421y, m16826k7(str2, zzxzVar), com.google.android.gms.ads.zzb.zza(zzydVar.f27451j, zzydVar.f27448g, zzydVar.f27447f)), new C7398z2(this, zzaojVar, zzamvVar));
        } catch (Throwable th) {
            zzbad.m17347c("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: L2 */
    public final boolean mo16811L2(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.f22216h;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.m14709k0(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: a6 */
    public final zzapj mo16812a6() throws RemoteException {
        return zzapj.m16830y(this.f22214f.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: g4 */
    public final void mo16813g4(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaop zzaopVar, zzamv zzamvVar) throws RemoteException {
        try {
            this.f22214f.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.m14709k0(iObjectWrapper), str, m16829n7(str2), m16828m7(zzxzVar), m16827l7(zzxzVar), zzxzVar.f27412p, zzxzVar.f27408l, zzxzVar.f27421y, m16826k7(str2, zzxzVar)), new C6548c3(this, zzaopVar, zzamvVar));
        } catch (Throwable th) {
            zzbad.m17347c("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    public final zzaar getVideoController() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f22214f;
        if (!(mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: h5 */
    public final void mo16814h5(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaos zzaosVar, zzamv zzamvVar) throws RemoteException {
        try {
            this.f22214f.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.m14709k0(iObjectWrapper), str, m16829n7(str2), m16828m7(zzxzVar), m16827l7(zzxzVar), zzxzVar.f27412p, zzxzVar.f27408l, zzxzVar.f27421y, m16826k7(str2, zzxzVar)), new C6511b3(this, zzaosVar, zzamvVar));
        } catch (Throwable th) {
            zzbad.m17347c("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: i5 */
    public final zzapj mo16815i5() throws RemoteException {
        return zzapj.m16830y(this.f22214f.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: j5 */
    public final void mo16816j5(String[] strArr, Bundle[] bundleArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: o3 */
    public final void mo16817o3(IObjectWrapper iObjectWrapper) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: u3 */
    public final void mo16818u3(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzyd zzydVar, zzaoy zzaoyVar) throws RemoteException {
        AdFormat adFormat;
        try {
            C6585d3 c6585d3 = new C6585d3(this, zzaoyVar);
            RtbAdapter rtbAdapter = this.f22214f;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c2 == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c2 == 2) {
                adFormat = AdFormat.REWARDED;
            } else {
                if (c2 != 3) {
                    throw new IllegalArgumentException("Internal Error");
                }
                adFormat = AdFormat.NATIVE;
            }
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.m14709k0(iObjectWrapper), new MediationConfiguration(adFormat, bundle2), bundle, com.google.android.gms.ads.zzb.zza(zzydVar.f27451j, zzydVar.f27448g, zzydVar.f27447f)), c6585d3);
        } catch (Throwable th) {
            zzbad.m17347c("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: x2 */
    public final boolean mo16819x2(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.f22215g;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.m14709k0(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaov
    /* renamed from: y6 */
    public final void mo16820y6(String str, String str2, zzxz zzxzVar, IObjectWrapper iObjectWrapper, zzaom zzaomVar, zzamv zzamvVar) throws RemoteException {
        try {
            this.f22214f.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.m14709k0(iObjectWrapper), str, m16829n7(str2), m16828m7(zzxzVar), m16827l7(zzxzVar), zzxzVar.f27412p, zzxzVar.f27408l, zzxzVar.f27421y, m16826k7(str2, zzxzVar)), new C6474a3(this, zzaomVar, zzamvVar));
        } catch (Throwable th) {
            zzbad.m17347c("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }
}
