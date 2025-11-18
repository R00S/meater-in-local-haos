package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyt;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza, MediationRewardedVideoAdAdapter, zzbjl {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzmd;
    private InterstitialAd zzme;
    private AdLoader zzmf;
    private Context zzmg;
    private InterstitialAd zzmh;
    private MediationRewardedVideoAdListener zzmi;

    @VisibleForTesting
    private final RewardedVideoAdListener zzmj = new C6235f(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C6218a extends NativeAppInstallAdMapper {

        /* renamed from: a */
        private final NativeAppInstallAd f16550a;

        public C6218a(NativeAppInstallAd nativeAppInstallAd) {
            this.f16550a = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f16550a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f16550a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C6219b extends NativeContentAdMapper {

        /* renamed from: a */
        private final NativeContentAd f16551a;

        public C6219b(NativeContentAd nativeContentAd) {
            this.f16551a = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f16551a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f16551a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C6220c extends UnifiedNativeAdMapper {

        /* renamed from: a */
        private final UnifiedNativeAd f16552a;

        public C6220c(UnifiedNativeAd unifiedNativeAd) {
            this.f16552a = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzp(unifiedNativeAd.zzkv());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.f16552a);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f16552a);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C6221d extends AdListener implements AppEventListener, zzxr {

        /* renamed from: f */
        @VisibleForTesting
        private final AbstractAdViewAdapter f16553f;

        /* renamed from: g */
        @VisibleForTesting
        private final MediationBannerListener f16554g;

        public C6221d(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f16553f = abstractAdViewAdapter;
            this.f16554g = mediationBannerListener;
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzxr
        public final void onAdClicked() {
            this.f16554g.onAdClicked(this.f16553f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.f16554g.onAdClosed(this.f16553f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i2) {
            this.f16554g.onAdFailedToLoad(this.f16553f, i2);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.f16554g.onAdLeftApplication(this.f16553f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.f16554g.onAdLoaded(this.f16553f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.f16554g.onAdOpened(this.f16553f);
        }

        @Override // com.google.android.gms.ads.doubleclick.AppEventListener
        public final void onAppEvent(String str, String str2) {
            this.f16554g.zza(this.f16553f, str, str2);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C6222e extends AdListener implements zzxr {

        /* renamed from: f */
        @VisibleForTesting
        private final AbstractAdViewAdapter f16555f;

        /* renamed from: g */
        @VisibleForTesting
        private final MediationInterstitialListener f16556g;

        public C6222e(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f16555f = abstractAdViewAdapter;
            this.f16556g = mediationInterstitialListener;
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzxr
        public final void onAdClicked() {
            this.f16556g.onAdClicked(this.f16555f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.f16556g.onAdClosed(this.f16555f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i2) {
            this.f16556g.onAdFailedToLoad(this.f16555f, i2);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.f16556g.onAdLeftApplication(this.f16555f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.f16556g.onAdLoaded(this.f16555f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.f16556g.onAdOpened(this.f16555f);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C6223f extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {

        /* renamed from: f */
        @VisibleForTesting
        private final AbstractAdViewAdapter f16557f;

        /* renamed from: g */
        @VisibleForTesting
        private final MediationNativeListener f16558g;

        public C6223f(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f16557f = abstractAdViewAdapter;
            this.f16558g = mediationNativeListener;
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzxr
        public final void onAdClicked() {
            this.f16558g.onAdClicked(this.f16557f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.f16558g.onAdClosed(this.f16557f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i2) {
            this.f16558g.onAdFailedToLoad(this.f16557f, i2);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdImpression() {
            this.f16558g.onAdImpression(this.f16557f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.f16558g.onAdLeftApplication(this.f16557f);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.f16558g.onAdOpened(this.f16557f);
        }

        @Override // com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f16558g.onAdLoaded(this.f16557f, new C6218a(nativeAppInstallAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f16558g.onAdLoaded(this.f16557f, new C6219b(nativeContentAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f16558g.zza(this.f16557f, nativeCustomTemplateAd, str);
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f16558g.zza(this.f16557f, nativeCustomTemplateAd);
        }

        @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.f16558g.onAdLoaded(this.f16557f, new C6220c(unifiedNativeAd));
        }
    }

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            Iterator<String> it = keywords.iterator();
            while (it.hasNext()) {
                builder.addKeyword(it.next());
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzyt.m20844a();
            builder.addTestDevice(zzazt.m17307l(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.tagForChildDirectedTreatment(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzmd;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdj(1).zzacc();
    }

    @Override // com.google.android.gms.ads.mediation.zza
    public zzaar getVideoController() {
        VideoController videoController;
        AdView adView = this.zzmd;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzdh();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzmg = context.getApplicationContext();
        this.zzmi = mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzmi != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Context context = this.zzmg;
        if (context == null || this.zzmi == null) {
            zzbad.m17351g("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzmh = interstitialAd;
        interstitialAd.zzc(true);
        this.zzmh.setAdUnitId(getAdUnitId(bundle));
        this.zzmh.setRewardedVideoAdListener(this.zzmj);
        this.zzmh.setAdMetadataListener(new C6236g(this));
        this.zzmh.loadAd(zza(this.zzmg, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.destroy();
            this.zzmd = null;
        }
        if (this.zzme != null) {
            this.zzme = null;
        }
        if (this.zzmf != null) {
            this.zzmf = null;
        }
        if (this.zzmh != null) {
            this.zzmh = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzme;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzmh;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.resume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzmd = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzmd.setAdUnitId(getAdUnitId(bundle));
        this.zzmd.setAdListener(new C6221d(this, mediationBannerListener));
        this.zzmd.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzme = interstitialAd;
        interstitialAd.setAdUnitId(getAdUnitId(bundle));
        this.zzme.setAdListener(new C6222e(this, mediationInterstitialListener));
        this.zzme.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        C6223f c6223f = new C6223f(this, mediationNativeListener);
        AdLoader.Builder builderWithAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(c6223f);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            builderWithAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            builderWithAdListener.forUnifiedNativeAd(c6223f);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            builderWithAdListener.forAppInstallAd(c6223f);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            builderWithAdListener.forContentAd(c6223f);
        }
        if (nativeMediationAdRequest.zzsu()) {
            for (String str : nativeMediationAdRequest.zzsv().keySet()) {
                builderWithAdListener.forCustomTemplateAd(str, c6223f, nativeMediationAdRequest.zzsv().get(str).booleanValue() ? c6223f : null);
            }
        }
        AdLoader adLoaderBuild = builderWithAdListener.build();
        this.zzmf = adLoaderBuild;
        adLoaderBuild.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzme.show();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzmh.show();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    static /* synthetic */ InterstitialAd zza(AbstractAdViewAdapter abstractAdViewAdapter, InterstitialAd interstitialAd) {
        abstractAdViewAdapter.zzmh = null;
        return null;
    }
}
