package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzanq extends zzanb {

    /* renamed from: f */
    private final NativeAppInstallAdMapper f22196f;

    public zzanq(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f22196f = nativeAppInstallAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: A */
    public final void mo16745A(IObjectWrapper iObjectWrapper) {
        this.f22196f.untrackView((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: C */
    public final boolean mo16746C() {
        return this.f22196f.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: C0 */
    public final void mo16747C0(IObjectWrapper iObjectWrapper) {
        this.f22196f.trackView((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: D */
    public final void mo16748D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f22196f.trackViews((View) ObjectWrapper.m14709k0(iObjectWrapper), (HashMap) ObjectWrapper.m14709k0(iObjectWrapper2), (HashMap) ObjectWrapper.m14709k0(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: I */
    public final IObjectWrapper mo16749I() {
        View viewZzacd = this.f22196f.zzacd();
        if (viewZzacd == null) {
            return null;
        }
        return ObjectWrapper.m14708E0(viewZzacd);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: K */
    public final IObjectWrapper mo16750K() {
        View adChoicesContent = this.f22196f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m14708E0(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: M */
    public final boolean mo16751M() {
        return this.f22196f.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: N */
    public final void mo16752N(IObjectWrapper iObjectWrapper) {
        this.f22196f.handleClick((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: f */
    public final zzaea mo16753f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: g */
    public final String mo16754g() {
        return this.f22196f.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final Bundle getExtras() {
        return this.f22196f.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final String getStore() {
        return this.f22196f.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final zzaar getVideoController() {
        if (this.f22196f.getVideoController() != null) {
            return this.f22196f.getVideoController().zzdh();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: h */
    public final String mo16755h() {
        return this.f22196f.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: i */
    public final String mo16756i() {
        return this.f22196f.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: j */
    public final IObjectWrapper mo16757j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: k */
    public final List mo16758k() {
        List<NativeAd.Image> images = this.f22196f.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image image : images) {
            arrayList.add(new zzadw(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: n */
    public final zzaei mo16759n() {
        NativeAd.Image icon = this.f22196f.getIcon();
        if (icon != null) {
            return new zzadw(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: o */
    public final String mo16760o() {
        return this.f22196f.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void recordImpression() {
        this.f22196f.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    /* renamed from: t */
    public final double mo16761t() {
        return this.f22196f.getStarRating();
    }
}
