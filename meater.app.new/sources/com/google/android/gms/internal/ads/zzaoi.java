package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzaoi extends zzanh {

    /* renamed from: f */
    private final UnifiedNativeAdMapper f22213f;

    public zzaoi(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f22213f = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: A */
    public final void mo16778A(IObjectWrapper iObjectWrapper) {
        this.f22213f.untrackView((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: C */
    public final boolean mo16779C() {
        return this.f22213f.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: D */
    public final void mo16780D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f22213f.trackViews((View) ObjectWrapper.m14709k0(iObjectWrapper), (HashMap) ObjectWrapper.m14709k0(iObjectWrapper2), (HashMap) ObjectWrapper.m14709k0(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: I */
    public final IObjectWrapper mo16781I() {
        View viewZzacd = this.f22213f.zzacd();
        if (viewZzacd == null) {
            return null;
        }
        return ObjectWrapper.m14708E0(viewZzacd);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: K */
    public final IObjectWrapper mo16782K() {
        View adChoicesContent = this.f22213f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m14708E0(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: M */
    public final boolean mo16783M() {
        return this.f22213f.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: N */
    public final void mo16784N(IObjectWrapper iObjectWrapper) {
        this.f22213f.handleClick((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: X3 */
    public final float mo16785X3() {
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: f */
    public final zzaea mo16786f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: g */
    public final String mo16787g() {
        return this.f22213f.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final Bundle getExtras() {
        return this.f22213f.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final String getStore() {
        return this.f22213f.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final zzaar getVideoController() {
        if (this.f22213f.getVideoController() != null) {
            return this.f22213f.getVideoController().zzdh();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: h */
    public final String mo16788h() {
        return this.f22213f.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: i */
    public final String mo16789i() {
        return this.f22213f.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: j */
    public final IObjectWrapper mo16790j() {
        Object objZzkv = this.f22213f.zzkv();
        if (objZzkv == null) {
            return null;
        }
        return ObjectWrapper.m14708E0(objZzkv);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: k */
    public final List mo16791k() {
        List<NativeAd.Image> images = this.f22213f.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzadw(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: n */
    public final zzaei mo16792n() {
        NativeAd.Image icon = this.f22213f.getIcon();
        if (icon != null) {
            return new zzadw(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: o */
    public final String mo16793o() {
        return this.f22213f.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void recordImpression() {
        this.f22213f.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: t */
    public final double mo16794t() {
        if (this.f22213f.getStarRating() != null) {
            return this.f22213f.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    /* renamed from: w */
    public final String mo16795w() {
        return this.f22213f.getAdvertiser();
    }
}
