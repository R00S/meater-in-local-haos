package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzanl extends zzamt {

    /* renamed from: f */
    private final Object f22185f;

    /* renamed from: g */
    private zzano f22186g;

    /* renamed from: h */
    private zzatk f22187h;

    /* renamed from: i */
    private IObjectWrapper f22188i;

    /* renamed from: j */
    private MediationRewardedAd f22189j;

    public zzanl(MediationAdapter mediationAdapter) {
        this.f22185f = mediationAdapter;
    }

    /* renamed from: h7 */
    private final Bundle m16797h7(String str, zzxz zzxzVar, String str2) throws RemoteException {
        String strValueOf = String.valueOf(str);
        zzbad.m17349e(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f22185f instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzxzVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzxzVar.f27408l);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    /* renamed from: j7 */
    private static String m16799j7(String str, zzxz zzxzVar) {
        String str2 = zzxzVar.f27422z;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* renamed from: k7 */
    private static boolean m16800k7(zzxz zzxzVar) {
        if (zzxzVar.f27407k) {
            return true;
        }
        zzyt.m20844a();
        return zzazt.m17317v();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: F2 */
    public final zzafe mo16697F2() {
        NativeCustomTemplateAd nativeCustomTemplateAdM16804d = this.f22186g.m16804d();
        if (nativeCustomTemplateAdM16804d instanceof zzafh) {
            return ((zzafh) nativeCustomTemplateAdM16804d).m16513b();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: G4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo16698G4(com.google.android.gms.dynamic.IObjectWrapper r7, com.google.android.gms.internal.ads.zzaiq r8, java.util.List<com.google.android.gms.internal.ads.zzaiw> r9) throws android.os.RemoteException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f22185f
            boolean r0 = r0 instanceof com.google.android.gms.ads.mediation.Adapter
            if (r0 == 0) goto L86
            com.google.android.gms.internal.ads.t2 r0 = new com.google.android.gms.internal.ads.t2
            r0.<init>(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L14:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r9.next()
            com.google.android.gms.internal.ads.zzaiw r1 = (com.google.android.gms.internal.ads.zzaiw) r1
            com.google.android.gms.ads.mediation.MediationConfiguration r2 = new com.google.android.gms.ads.mediation.MediationConfiguration
            java.lang.String r3 = r1.f22065f
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1396342996: goto L51;
                case -1052618729: goto L46;
                case -239580146: goto L3b;
                case 604727084: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L5b
        L30:
            java.lang.String r5 = "interstitial"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L39
            goto L5b
        L39:
            r4 = 3
            goto L5b
        L3b:
            java.lang.String r5 = "rewarded"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L44
            goto L5b
        L44:
            r4 = 2
            goto L5b
        L46:
            java.lang.String r5 = "native"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L4f
            goto L5b
        L4f:
            r4 = 1
            goto L5b
        L51:
            java.lang.String r5 = "banner"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L5a
            goto L5b
        L5a:
            r4 = 0
        L5b:
            switch(r4) {
                case 0: goto L6d;
                case 1: goto L6a;
                case 2: goto L67;
                case 3: goto L64;
                default: goto L5e;
            }
        L5e:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        L64:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            goto L6f
        L67:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.REWARDED
            goto L6f
        L6a:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.NATIVE
            goto L6f
        L6d:
            com.google.android.gms.ads.AdFormat r3 = com.google.android.gms.ads.AdFormat.BANNER
        L6f:
            android.os.Bundle r1 = r1.f22066g
            r2.<init>(r3, r1)
            r8.add(r2)
            goto L14
        L78:
            java.lang.Object r9 = r6.f22185f
            com.google.android.gms.ads.mediation.Adapter r9 = (com.google.android.gms.ads.mediation.Adapter) r9
            java.lang.Object r7 = com.google.android.gms.dynamic.ObjectWrapper.m14709k0(r7)
            android.content.Context r7 = (android.content.Context) r7
            r9.initialize(r7, r0, r8)
            return
        L86:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            goto L8d
        L8c:
            throw r7
        L8d:
            goto L8c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanl.mo16698G4(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzaiq, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: H4 */
    public final void mo16699H4(IObjectWrapper iObjectWrapper, zzatk zzatkVar, List<String> list) throws RemoteException {
        if (!(this.f22185f instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f22185f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m17353i(sb.toString());
            throw new RemoteException();
        }
        zzbad.m17349e("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f22185f;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m16797h7(it.next(), null, null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.m14709k0(iObjectWrapper), new zzatn(zzatkVar), arrayList);
        } catch (Throwable th) {
            zzbad.m17348d("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: M3 */
    public final void mo16700M3(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar, zzady zzadyVar, List<String> list) throws RemoteException {
        Object obj = this.f22185f;
        if (!(obj instanceof MediationNativeAdapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f22185f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m17353i(sb.toString());
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
            zzans zzansVar = new zzans(zzxzVar.f27403g == -1 ? null : new Date(zzxzVar.f27403g), zzxzVar.f27405i, zzxzVar.f27406j != null ? new HashSet(zzxzVar.f27406j) : null, zzxzVar.f27412p, m16800k7(zzxzVar), zzxzVar.f27408l, zzadyVar, list, zzxzVar.f27419w, zzxzVar.f27421y, m16799j7(str, zzxzVar));
            Bundle bundle = zzxzVar.f27414r;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f22186g = new zzano(zzamvVar);
            mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.m14709k0(iObjectWrapper), this.f22186g, m16797h7(str, zzxzVar, str2), zzansVar, bundle2);
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: P1 */
    public final zzang mo16701P1() {
        UnifiedNativeAdMapper unifiedNativeAdMapperM16803c = this.f22186g.m16803c();
        if (unifiedNativeAdMapperM16803c != null) {
            return new zzaoi(unifiedNativeAdMapperM16803c);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: Q2 */
    public final void mo16702Q2(zzxz zzxzVar, String str, String str2) throws RemoteException {
        Object obj = this.f22185f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.m17349e("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f22185f;
                zzank zzankVar = new zzank(zzxzVar.f27403g == -1 ? null : new Date(zzxzVar.f27403g), zzxzVar.f27405i, zzxzVar.f27406j != null ? new HashSet(zzxzVar.f27406j) : null, zzxzVar.f27412p, m16800k7(zzxzVar), zzxzVar.f27408l, zzxzVar.f27419w, zzxzVar.f27421y, m16799j7(str, zzxzVar));
                Bundle bundle = zzxzVar.f27414r;
                mediationRewardedVideoAdAdapter.loadAd(zzankVar, m16797h7(str, zzxzVar, str2), bundle != null ? bundle.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            mo16708f2(this.f22188i, zzxzVar, str, new zzanp((Adapter) obj, this.f22187h));
            return;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzbad.m17353i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: Y2 */
    public final void mo16703Y2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        mo16706c6(iObjectWrapper, zzxzVar, str, null, zzamvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: a4 */
    public final void mo16704a4(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f22185f instanceof Adapter) {
            zzbad.m17349e("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f22189j;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.m14709k0(iObjectWrapper));
                return;
            } else {
                zzbad.m17351g("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = Adapter.class.getCanonicalName();
        String canonicalName2 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.m17353i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: b7 */
    public final zzana mo16705b7() {
        NativeAdMapper nativeAdMapperM16802b = this.f22186g.m16802b();
        if (nativeAdMapperM16802b instanceof NativeAppInstallAdMapper) {
            return new zzanq((NativeAppInstallAdMapper) nativeAdMapperM16802b);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: c6 */
    public final void mo16706c6(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        if (!(this.f22185f instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f22185f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m17353i(sb.toString());
            throw new RemoteException();
        }
        zzbad.m17349e("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f22185f;
            zzank zzankVar = new zzank(zzxzVar.f27403g == -1 ? null : new Date(zzxzVar.f27403g), zzxzVar.f27405i, zzxzVar.f27406j != null ? new HashSet(zzxzVar.f27406j) : null, zzxzVar.f27412p, m16800k7(zzxzVar), zzxzVar.f27408l, zzxzVar.f27419w, zzxzVar.f27421y, m16799j7(str, zzxzVar));
            Bundle bundle = zzxzVar.f27414r;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.m14709k0(iObjectWrapper), new zzano(zzamvVar), m16797h7(str, zzxzVar, str2), zzankVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void destroy() throws RemoteException {
        Object obj = this.f22185f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: e6 */
    public final zzand mo16707e6() {
        NativeAdMapper nativeAdMapperM16802b = this.f22186g.m16802b();
        if (nativeAdMapperM16802b instanceof NativeContentAdMapper) {
            return new zzanr((NativeContentAdMapper) nativeAdMapperM16802b);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: f2 */
    public final void mo16708f2(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        Bundle bundle;
        if (!(this.f22185f instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f22185f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m17353i(sb.toString());
            throw new RemoteException();
        }
        zzbad.m17349e("Requesting rewarded ad from adapter.");
        try {
            Adapter adapter = (Adapter) this.f22185f;
            C7139s2 c7139s2 = new C7139s2(this, zzamvVar, adapter);
            Context context = (Context) ObjectWrapper.m14709k0(iObjectWrapper);
            Bundle bundleM16797h7 = m16797h7(str, zzxzVar, null);
            Bundle bundle2 = zzxzVar.f27414r;
            if (bundle2 == null || (bundle = bundle2.getBundle(this.f22185f.getClass().getName())) == null) {
                bundle = new Bundle();
            }
            adapter.loadRewardedAd(new MediationRewardedAdConfiguration(context, HttpUrl.FRAGMENT_ENCODE_SET, bundleM16797h7, bundle, m16800k7(zzxzVar), zzxzVar.f27412p, zzxzVar.f27408l, zzxzVar.f27421y, m16799j7(str, zzxzVar)), c7139s2);
        } catch (Exception e2) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.f22185f;
        if (obj instanceof zzbjl) {
            return ((zzbjl) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbjl.class.getCanonicalName();
        String canonicalName2 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.m17353i(sb.toString());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final zzaar getVideoController() {
        Object obj = this.f22185f;
        if (!(obj instanceof com.google.android.gms.ads.mediation.zza)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: h4 */
    public final void mo16709h4(IObjectWrapper iObjectWrapper, zzxz zzxzVar, String str, zzatk zzatkVar, String str2) throws RemoteException {
        zzank zzankVar;
        Bundle bundle;
        Object obj = this.f22185f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.m17349e("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f22185f;
                Bundle bundleM16797h7 = m16797h7(str2, zzxzVar, null);
                if (zzxzVar != null) {
                    zzank zzankVar2 = new zzank(zzxzVar.f27403g == -1 ? null : new Date(zzxzVar.f27403g), zzxzVar.f27405i, zzxzVar.f27406j != null ? new HashSet(zzxzVar.f27406j) : null, zzxzVar.f27412p, m16800k7(zzxzVar), zzxzVar.f27408l, zzxzVar.f27419w, zzxzVar.f27421y, m16799j7(str2, zzxzVar));
                    Bundle bundle2 = zzxzVar.f27414r;
                    bundle = bundle2 != null ? bundle2.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    zzankVar = zzankVar2;
                } else {
                    zzankVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.m14709k0(iObjectWrapper), zzankVar, str, new zzatn(zzatkVar), bundleM16797h7, bundle);
                return;
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            this.f22188i = iObjectWrapper;
            this.f22187h = zzatkVar;
            zzatkVar.mo15309c3(ObjectWrapper.m14708E0(obj));
            return;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzbad.m17353i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final boolean isInitialized() throws RemoteException {
        Object obj = this.f22185f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.m17349e("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f22185f).isInitialized();
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return this.f22187h != null;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzbad.m17353i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: o6 */
    public final void mo16710o6(zzxz zzxzVar, String str) throws RemoteException {
        mo16702Q2(zzxzVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void pause() throws RemoteException {
        Object obj = this.f22185f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: r4 */
    public final Bundle mo16711r4() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void resume() throws RemoteException {
        Object obj = this.f22185f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: s4 */
    public final void mo16712s4(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, String str2, zzamv zzamvVar) throws RemoteException {
        if (!(this.f22185f instanceof MediationBannerAdapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f22185f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m17353i(sb.toString());
            throw new RemoteException();
        }
        zzbad.m17349e("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f22185f;
            zzank zzankVar = new zzank(zzxzVar.f27403g == -1 ? null : new Date(zzxzVar.f27403g), zzxzVar.f27405i, zzxzVar.f27406j != null ? new HashSet(zzxzVar.f27406j) : null, zzxzVar.f27412p, m16800k7(zzxzVar), zzxzVar.f27408l, zzxzVar.f27419w, zzxzVar.f27421y, m16799j7(str, zzxzVar));
            Bundle bundle = zzxzVar.f27414r;
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.m14709k0(iObjectWrapper), new zzano(zzamvVar), m16797h7(str, zzxzVar, str2), com.google.android.gms.ads.zzb.zza(zzydVar.f27451j, zzydVar.f27448g, zzydVar.f27447f), zzankVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.f22185f;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                return;
            }
        }
        String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
        String canonicalName2 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.m17353i(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showInterstitial() throws RemoteException {
        if (this.f22185f instanceof MediationInterstitialAdapter) {
            zzbad.m17349e("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f22185f).showInterstitial();
                return;
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.m17353i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final void showVideo() throws RemoteException {
        Object obj = this.f22185f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.m17349e("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f22185f).showVideo();
                return;
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f22189j;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.m14709k0(this.f22188i));
                return;
            } else {
                zzbad.m17351g("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = Adapter.class.getCanonicalName();
        String canonicalName3 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        zzbad.m17353i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: w0 */
    public final void mo16713w0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.m14709k0(iObjectWrapper);
        Object obj = this.f22185f;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: x1 */
    public final IObjectWrapper mo16714x1() throws RemoteException {
        Object obj = this.f22185f;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.m14708E0(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzbad.m17347c(HttpUrl.FRAGMENT_ENCODE_SET, th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.m17353i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: x3 */
    public final boolean mo16715x3() {
        return this.f22185f instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzams
    /* renamed from: y2 */
    public final void mo16716y2(IObjectWrapper iObjectWrapper, zzyd zzydVar, zzxz zzxzVar, String str, zzamv zzamvVar) throws RemoteException {
        mo16712s4(iObjectWrapper, zzydVar, zzxzVar, str, null, zzamvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzams
    public final Bundle zzsh() {
        Object obj = this.f22185f;
        if (obj instanceof zzbjk) {
            return ((zzbjk) obj).zzsh();
        }
        String canonicalName = zzbjk.class.getCanonicalName();
        String canonicalName2 = this.f22185f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.m17353i(sb.toString());
        return new Bundle();
    }

    public zzanl(Adapter adapter) {
        this.f22185f = adapter;
    }
}
