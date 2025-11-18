package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzanr extends zzane {

    /* renamed from: f */
    private final NativeContentAdMapper f22197f;

    public zzanr(NativeContentAdMapper nativeContentAdMapper) {
        this.f22197f = nativeContentAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: A */
    public final void mo16762A(IObjectWrapper iObjectWrapper) {
        this.f22197f.untrackView((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: C */
    public final boolean mo16763C() {
        return this.f22197f.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: C0 */
    public final void mo16764C0(IObjectWrapper iObjectWrapper) {
        this.f22197f.trackView((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: D */
    public final void mo16765D(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f22197f.trackViews((View) ObjectWrapper.m14709k0(iObjectWrapper), (HashMap) ObjectWrapper.m14709k0(iObjectWrapper2), (HashMap) ObjectWrapper.m14709k0(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: D0 */
    public final zzaei mo16766D0() {
        NativeAd.Image logo = this.f22197f.getLogo();
        if (logo != null) {
            return new zzadw(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: I */
    public final IObjectWrapper mo16767I() {
        View viewZzacd = this.f22197f.zzacd();
        if (viewZzacd == null) {
            return null;
        }
        return ObjectWrapper.m14708E0(viewZzacd);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: K */
    public final IObjectWrapper mo16768K() {
        View adChoicesContent = this.f22197f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m14708E0(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: M */
    public final boolean mo16769M() {
        return this.f22197f.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: N */
    public final void mo16770N(IObjectWrapper iObjectWrapper) {
        this.f22197f.handleClick((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: f */
    public final zzaea mo16771f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: g */
    public final String mo16772g() {
        return this.f22197f.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final Bundle getExtras() {
        return this.f22197f.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final zzaar getVideoController() {
        if (this.f22197f.getVideoController() != null) {
            return this.f22197f.getVideoController().zzdh();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: h */
    public final String mo16773h() {
        return this.f22197f.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: i */
    public final String mo16774i() {
        return this.f22197f.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: j */
    public final IObjectWrapper mo16775j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: k */
    public final List mo16776k() {
        List<NativeAd.Image> images = this.f22197f.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image image : images) {
            arrayList.add(new zzadw(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void recordImpression() {
        this.f22197f.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    /* renamed from: w */
    public final String mo16777w() {
        return this.f22197f.getAdvertiser();
    }
}
