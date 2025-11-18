package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.zzbad;

@Deprecated
/* loaded from: classes2.dex */
public final class NativeContentAdView extends NativeAdView {
    public NativeContentAdView(Context context) {
        super(context);
    }

    public final View getAdvertiserView() {
        return super.zzbj(NativeContentAd.ASSET_ADVERTISER);
    }

    public final View getBodyView() {
        return super.zzbj(NativeContentAd.ASSET_BODY);
    }

    public final View getCallToActionView() {
        return super.zzbj(NativeContentAd.ASSET_CALL_TO_ACTION);
    }

    public final View getHeadlineView() {
        return super.zzbj(NativeContentAd.ASSET_HEADLINE);
    }

    public final View getImageView() {
        return super.zzbj(NativeContentAd.ASSET_IMAGE);
    }

    public final View getLogoView() {
        return super.zzbj(NativeContentAd.ASSET_LOGO);
    }

    public final MediaView getMediaView() {
        View viewZzbj = super.zzbj(NativeContentAd.ASSET_MEDIA_VIDEO);
        if (viewZzbj instanceof MediaView) {
            return (MediaView) viewZzbj;
        }
        if (viewZzbj == null) {
            return null;
        }
        zzbad.m17349e("View is not an instance of MediaView");
        return null;
    }

    public final void setAdvertiserView(View view) {
        super.zza(NativeContentAd.ASSET_ADVERTISER, view);
    }

    public final void setBodyView(View view) {
        super.zza(NativeContentAd.ASSET_BODY, view);
    }

    public final void setCallToActionView(View view) {
        super.zza(NativeContentAd.ASSET_CALL_TO_ACTION, view);
    }

    public final void setHeadlineView(View view) {
        super.zza(NativeContentAd.ASSET_HEADLINE, view);
    }

    public final void setImageView(View view) {
        super.zza(NativeContentAd.ASSET_IMAGE, view);
    }

    public final void setLogoView(View view) {
        super.zza(NativeContentAd.ASSET_LOGO, view);
    }

    public final void setMediaView(MediaView mediaView) {
        super.zza(NativeContentAd.ASSET_MEDIA_VIDEO, mediaView);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public NativeContentAdView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
