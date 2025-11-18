package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaem;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzyt;

/* loaded from: classes2.dex */
public final class UnifiedNativeAdView extends FrameLayout {
    private final FrameLayout zzbqi;
    private final zzaem zzbqj;

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.zzbqi = zzd(context);
        this.zzbqj = zzks();
    }

    private final void zza(String str, View view) {
        try {
            this.zzbqj.mo16369d5(str, ObjectWrapper.m14708E0(view));
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to call setAssetView on delegate", e2);
        }
    }

    private final View zzbj(String str) {
        try {
            IObjectWrapper iObjectWrapperMo16370n4 = this.zzbqj.mo16370n4(str);
            if (iObjectWrapperMo16370n4 != null) {
                return (View) ObjectWrapper.m14709k0(iObjectWrapperMo16370n4);
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to call getAssetView on delegate", e2);
            return null;
        }
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzaem zzks() {
        Preconditions.m14373l(this.zzbqi, "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzyt.m20845b().m20839a(this.zzbqi.getContext(), this, this.zzbqi);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        super.bringChildToFront(this.zzbqi);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbqi;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final void destroy() {
        try {
            this.zzbqj.destroy();
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to destroy native ad view", e2);
        }
    }

    public final AdChoicesView getAdChoicesView() {
        View viewZzbj = zzbj(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (viewZzbj instanceof AdChoicesView) {
            return (AdChoicesView) viewZzbj;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getBodyView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_BODY);
    }

    public final View getCallToActionView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getHeadlineView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getIconView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_ICON);
    }

    public final View getImageView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_IMAGE);
    }

    public final MediaView getMediaView() {
        View viewZzbj = zzbj(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO);
        if (viewZzbj instanceof MediaView) {
            return (MediaView) viewZzbj;
        }
        if (viewZzbj == null) {
            return null;
        }
        zzbad.m17349e("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_PRICE);
    }

    public final View getStarRatingView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_STAR_RATING);
    }

    public final View getStoreView() {
        return zzbj(UnifiedNativeAdAssetNames.ASSET_STORE);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        zzaem zzaemVar = this.zzbqj;
        if (zzaemVar != null) {
            try {
                zzaemVar.mo16368X0(ObjectWrapper.m14708E0(view), i2);
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbqi);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.zzbqi == view) {
            return;
        }
        super.removeView(view);
    }

    public final void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ADVERTISER, view);
    }

    public final void setBodyView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_BODY, view);
    }

    public final void setCallToActionView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_CALL_TO_ACTION, view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzbqj.mo16371x0(ObjectWrapper.m14708E0(view));
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    public final void setHeadlineView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_HEADLINE, view);
    }

    public final void setIconView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_ICON, view);
    }

    public final void setImageView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_IMAGE, view);
    }

    public final void setMediaView(MediaView mediaView) {
        zza(UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO, mediaView);
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        try {
            this.zzbqj.mo16367V((IObjectWrapper) unifiedNativeAd.zzkq());
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to call setNativeAd on delegate", e2);
        }
    }

    public final void setPriceView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_PRICE, view);
    }

    public final void setStarRatingView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STAR_RATING, view);
    }

    public final void setStoreView(View view) {
        zza(UnifiedNativeAdAssetNames.ASSET_STORE, view);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbqi = zzd(context);
        this.zzbqj = zzks();
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.zzbqi = zzd(context);
        this.zzbqj = zzks();
    }

    @TargetApi(21)
    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.zzbqi = zzd(context);
        this.zzbqj = zzks();
    }
}
