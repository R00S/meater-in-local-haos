package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.internal.ads.zzard;
import java.util.List;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public class UnifiedNativeAdMapper {
    private Bundle extras = new Bundle();
    private VideoController zzcje;
    private String zzdnh;
    private View zzena;
    private boolean zzenb;
    private String zzenc;
    private List<NativeAd.Image> zzend;
    private NativeAd.Image zzene;
    private String zzenf;
    private String zzenh;
    private String zzeni;
    private String zzenk;
    private Double zzenl;
    private View zzenm;
    private Object zzenn;
    private boolean zzeno;
    private boolean zzenp;

    public View getAdChoicesContent() {
        return this.zzenm;
    }

    public final String getAdvertiser() {
        return this.zzenk;
    }

    public final String getBody() {
        return this.zzdnh;
    }

    public final String getCallToAction() {
        return this.zzenf;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getHeadline() {
        return this.zzenc;
    }

    public final NativeAd.Image getIcon() {
        return this.zzene;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzend;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzenp;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzeno;
    }

    public final String getPrice() {
        return this.zzeni;
    }

    public final Double getStarRating() {
        return this.zzenl;
    }

    public final String getStore() {
        return this.zzenh;
    }

    public final VideoController getVideoController() {
        return this.zzcje;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.zzenb;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.zzenm = view;
    }

    public final void setAdvertiser(String str) {
        this.zzenk = str;
    }

    public final void setBody(String str) {
        this.zzdnh = str;
    }

    public final void setCallToAction(String str) {
        this.zzenf = str;
    }

    public final void setExtras(Bundle bundle) {
        this.extras = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.zzenb = z;
    }

    public final void setHeadline(String str) {
        this.zzenc = str;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzene = image;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzend = list;
    }

    public void setMediaView(View view) {
        this.zzena = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzenp = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzeno = z;
    }

    public final void setPrice(String str) {
        this.zzeni = str;
    }

    public final void setStarRating(Double d2) {
        this.zzenl = d2;
    }

    public final void setStore(String str) {
        this.zzenh = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void zza(VideoController videoController) {
        this.zzcje = videoController;
    }

    public final View zzacd() {
        return this.zzena;
    }

    public final Object zzkv() {
        return this.zzenn;
    }

    public final void zzp(Object obj) {
        this.zzenn = obj;
    }
}
