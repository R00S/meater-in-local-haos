package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.C6225a;
import com.google.ads.mediation.InterfaceC6227c;
import com.google.ads.mediation.InterfaceC6233d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbad;
import p241e.p254e.p255a.C8783c;
import p241e.p254e.p255a.EnumC8781a;

@KeepName
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, C6232c>, MediationInterstitialAdapter<CustomEventExtras, C6232c> {

    /* renamed from: a */
    private View f16564a;

    /* renamed from: b */
    @VisibleForTesting
    private CustomEventBanner f16565b;

    /* renamed from: c */
    @VisibleForTesting
    private CustomEventInterstitial f16566c;

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C6228a implements InterfaceC6230a {

        /* renamed from: a */
        private final CustomEventAdapter f16567a;

        /* renamed from: b */
        private final InterfaceC6227c f16568b;

        public C6228a(CustomEventAdapter customEventAdapter, InterfaceC6227c interfaceC6227c) {
            this.f16567a = customEventAdapter;
            this.f16568b = interfaceC6227c;
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C6229b implements InterfaceC6231b {

        /* renamed from: a */
        private final CustomEventAdapter f16569a;

        /* renamed from: b */
        private final InterfaceC6233d f16570b;

        public C6229b(CustomEventAdapter customEventAdapter, InterfaceC6233d interfaceC6233d) {
            this.f16569a = customEventAdapter;
            this.f16570b = interfaceC6233d;
        }
    }

    /* renamed from: a */
    private static <T> T m13393a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzbad.m17353i(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.InterfaceC6226b
    public final void destroy() {
        CustomEventBanner customEventBanner = this.f16565b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f16566c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.InterfaceC6226b
    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f16564a;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.InterfaceC6226b
    public final Class<C6232c> getServerParametersType() {
        return C6232c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(InterfaceC6227c interfaceC6227c, Activity activity, C6232c c6232c, C8783c c8783c, C6225a c6225a, CustomEventExtras customEventExtras) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m13393a(c6232c.f16573b);
        this.f16565b = customEventBanner;
        if (customEventBanner == null) {
            interfaceC6227c.mo13392a(this, EnumC8781a.INTERNAL_ERROR);
        } else {
            this.f16565b.requestBannerAd(new C6228a(this, interfaceC6227c), activity, c6232c.f16572a, c6232c.f16574c, c8783c, c6225a, customEventExtras == null ? null : customEventExtras.getExtra(c6232c.f16572a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(InterfaceC6233d interfaceC6233d, Activity activity, C6232c c6232c, C6225a c6225a, CustomEventExtras customEventExtras) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m13393a(c6232c.f16573b);
        this.f16566c = customEventInterstitial;
        if (customEventInterstitial == null) {
            interfaceC6233d.mo13394b(this, EnumC8781a.INTERNAL_ERROR);
        } else {
            this.f16566c.requestInterstitialAd(new C6229b(this, interfaceC6233d), activity, c6232c.f16572a, c6232c.f16574c, c6225a, customEventExtras == null ? null : customEventExtras.getExtra(c6232c.f16572a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f16566c.showInterstitial();
    }
}
