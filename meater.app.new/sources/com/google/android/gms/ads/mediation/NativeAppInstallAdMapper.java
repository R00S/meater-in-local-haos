package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class NativeAppInstallAdMapper extends NativeAdMapper {
    private String zzdnh;
    private String zzenc;
    private List<NativeAd.Image> zzend;
    private NativeAd.Image zzene;
    private String zzenf;
    private double zzeng;
    private String zzenh;
    private String zzeni;

    public final String getBody() {
        return this.zzdnh;
    }

    public final String getCallToAction() {
        return this.zzenf;
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

    public final String getPrice() {
        return this.zzeni;
    }

    public final double getStarRating() {
        return this.zzeng;
    }

    public final String getStore() {
        return this.zzenh;
    }

    public final void setBody(String str) {
        this.zzdnh = str;
    }

    public final void setCallToAction(String str) {
        this.zzenf = str;
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

    public final void setPrice(String str) {
        this.zzeni = str;
    }

    public final void setStarRating(double d2) {
        this.zzeng = d2;
    }

    public final void setStore(String str) {
        this.zzenh = str;
    }
}
