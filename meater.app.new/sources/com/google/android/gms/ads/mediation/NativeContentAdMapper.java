package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class NativeContentAdMapper extends NativeAdMapper {
    private String zzdnh;
    private String zzenc;
    private List<NativeAd.Image> zzend;
    private String zzenf;
    private NativeAd.Image zzenj;
    private String zzenk;

    public final String getAdvertiser() {
        return this.zzenk;
    }

    public final String getBody() {
        return this.zzdnh;
    }

    public final String getCallToAction() {
        return this.zzenf;
    }

    public final String getHeadline() {
        return this.zzenc;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzend;
    }

    public final NativeAd.Image getLogo() {
        return this.zzenj;
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

    public final void setHeadline(String str) {
        this.zzenc = str;
    }

    public final void setImages(List<NativeAd.Image> list) {
        this.zzend = list;
    }

    public final void setLogo(NativeAd.Image image) {
        this.zzenj = image;
    }
}
