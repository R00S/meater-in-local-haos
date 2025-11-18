package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

@zzard
/* loaded from: classes2.dex */
public final class zzano implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a */
    private final zzamv f22190a;

    /* renamed from: b */
    private NativeAdMapper f22191b;

    /* renamed from: c */
    private UnifiedNativeAdMapper f22192c;

    /* renamed from: d */
    private NativeCustomTemplateAd f22193d;

    public zzano(zzamv zzamvVar) {
        this.f22190a = zzamvVar;
    }

    /* renamed from: a */
    private static void m16801a(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper, NativeAdMapper nativeAdMapper) {
        if (mediationNativeAdapter instanceof AdMobAdapter) {
            return;
        }
        VideoController videoController = new VideoController();
        videoController.zza(new zzanj());
        if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
            unifiedNativeAdMapper.zza(videoController);
        }
        if (nativeAdMapper == null || !nativeAdMapper.hasVideoContent()) {
            return;
        }
        nativeAdMapper.zza(videoController);
    }

    /* renamed from: b */
    public final NativeAdMapper m16802b() {
        return this.f22191b;
    }

    /* renamed from: c */
    public final UnifiedNativeAdMapper m16803c() {
        return this.f22192c;
    }

    /* renamed from: d */
    public final NativeCustomTemplateAd m16804d() {
        return this.f22193d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdClicked.");
        try {
            this.f22190a.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdClosed.");
        try {
            this.f22190a.onAdClosed();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i2) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i2);
        zzbad.m17349e(sb.toString());
        try {
            this.f22190a.onAdFailedToLoad(i2);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f22191b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f22192c;
        if (this.f22193d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzbad.m17350f("#007 Could not call remote method.", null);
                return;
            }
            if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzbad.m17349e("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                zzbad.m17349e("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzbad.m17349e("Adapter called onAdImpression.");
        try {
            this.f22190a.onAdImpression();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLeftApplication.");
        try {
            this.f22190a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLoaded.");
        try {
            this.f22190a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdOpened.");
        try {
            this.f22190a.onAdOpened();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onVideoEnd.");
        try {
            this.f22190a.mo16723n0();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAppEvent.");
        try {
            this.f22190a.onAppEvent(str, str2);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdClicked.");
        try {
            this.f22190a.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdClosed.");
        try {
            this.f22190a.onAdClosed();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i2) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i2);
        sb.append(".");
        zzbad.m17349e(sb.toString());
        try {
            this.f22190a.onAdFailedToLoad(i2);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLeftApplication.");
        try {
            this.f22190a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLoaded.");
        try {
            this.f22190a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdOpened.");
        try {
            this.f22190a.onAdOpened();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        String strValueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        zzbad.m17349e(strValueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(strValueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f22193d = nativeCustomTemplateAd;
        try {
            this.f22190a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f22191b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f22192c;
        if (this.f22193d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzbad.m17350f("#007 Could not call remote method.", null);
                return;
            }
            if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzbad.m17349e("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                zzbad.m17349e("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzbad.m17349e("Adapter called onAdClicked.");
        try {
            this.f22190a.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdClosed.");
        try {
            this.f22190a.onAdClosed();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i2) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i2);
        sb.append(".");
        zzbad.m17349e(sb.toString());
        try {
            this.f22190a.onAdFailedToLoad(i2);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLeftApplication.");
        try {
            this.f22190a.onAdLeftApplication();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLoaded.");
        this.f22191b = nativeAdMapper;
        this.f22192c = null;
        m16801a(mediationNativeAdapter, null, nativeAdMapper);
        try {
            this.f22190a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdOpened.");
        try {
            this.f22190a.onAdOpened();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzafh) {
            try {
                this.f22190a.mo16717F0(((zzafh) nativeCustomTemplateAd).m16513b(), str);
                return;
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
                return;
            }
        }
        zzbad.m17353i("Unexpected native custom template ad type.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        zzbad.m17349e("Adapter called onAdLoaded.");
        this.f22192c = unifiedNativeAdMapper;
        this.f22191b = null;
        m16801a(mediationNativeAdapter, unifiedNativeAdMapper, null);
        try {
            this.f22190a.onAdLoaded();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }
}
