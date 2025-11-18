package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaaz;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzagm;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.ads.zzago;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagq;
import com.google.android.gms.internal.ads.zzags;
import com.google.android.gms.internal.ads.zzamo;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzxv;
import com.google.android.gms.internal.ads.zzyc;
import com.google.android.gms.internal.ads.zzyd;
import com.google.android.gms.internal.ads.zzyt;
import com.google.android.gms.internal.ads.zzzc;
import com.google.android.gms.internal.ads.zzzf;

/* loaded from: classes2.dex */
public class AdLoader {
    private final zzyc zzaaj;
    private final zzzc zzaak;
    private final Context zzlj;

    AdLoader(Context context, zzzc zzzcVar) {
        this(context, zzzcVar, zzyc.f27446a);
    }

    private final void zza(zzaaz zzaazVar) {
        try {
            this.zzaak.mo15085j2(zzyc.m20820a(this.zzlj, zzaazVar));
        } catch (RemoteException e2) {
            zzbad.m17347c("Failed to load ad.", e2);
        }
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.zzaak.mo15084c0();
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to get the mediation adapter class name.", e2);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzaak.mo15086p0();
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to check if ad is loading.", e2);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzde());
    }

    public void loadAds(AdRequest adRequest, int i2) {
        try {
            this.zzaak.mo15083F5(zzyc.m20820a(this.zzlj, adRequest.zzde()), i2);
        } catch (RemoteException e2) {
            zzbad.m17347c("Failed to load ads.", e2);
        }
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzde());
    }

    private AdLoader(Context context, zzzc zzzcVar, zzyc zzycVar) {
        this.zzlj = context;
        this.zzaak = zzzcVar;
        this.zzaaj = zzycVar;
    }

    public static class Builder {
        private final zzzf zzaal;
        private final Context zzlj;

        public Builder(Context context, String str) {
            this((Context) Preconditions.m14373l(context, "context cannot be null"), zzyt.m20845b().m20842g(context, str, new zzamo()));
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zzlj, this.zzaal.mo16330J1());
            } catch (RemoteException e2) {
                zzbad.m17347c("Failed to build AdLoader.", e2);
                return null;
            }
        }

        @Deprecated
        public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzaal.mo16329G3(new zzagm(onAppInstallAdLoadedListener));
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to add app install ad listener", e2);
            }
            return this;
        }

        @Deprecated
        public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzaal.mo16339y1(new zzagn(onContentAdLoadedListener));
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to add content ad listener", e2);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            try {
                this.zzaal.mo16328D5(str, new zzagp(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new zzago(onCustomClickListener));
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to add custom template ad listener", e2);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzaal.mo16336i1(new zzagq(onPublisherAdViewLoadedListener), new zzyd(this.zzlj, adSizeArr));
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to add publisher banner ad listener", e2);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzaal.mo16334Z3(new zzags(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to add google native ad listener", e2);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzaal.mo16335e2(new zzxv(adListener));
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to set AdListener.", e2);
            }
            return this;
        }

        public Builder withCorrelator(Correlator correlator) {
            Preconditions.m14372k(correlator);
            try {
                this.zzaal.mo16338q5(correlator.zzaar);
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to set correlator.", e2);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzaal.mo16337k6(new zzady(nativeAdOptions));
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to specify native ad options", e2);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.zzaal.mo16333X1(publisherAdViewOptions);
            } catch (RemoteException e2) {
                zzbad.m17348d("Failed to specify DFP banner ad options", e2);
            }
            return this;
        }

        private Builder(Context context, zzzf zzzfVar) {
            this.zzlj = context;
            this.zzaal = zzzfVar;
        }
    }
}
