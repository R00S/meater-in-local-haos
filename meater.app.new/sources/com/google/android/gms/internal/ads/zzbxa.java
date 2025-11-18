package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzbxa implements com.google.android.gms.ads.internal.overlay.zzo, zzbsr {

    /* renamed from: f */
    private final Context f23664f;

    /* renamed from: g */
    private final zzbgz f23665g;

    /* renamed from: h */
    private final zzcxm f23666h;

    /* renamed from: i */
    private final zzbai f23667i;

    /* renamed from: j */
    private final int f23668j;

    /* renamed from: k */
    @VisibleForTesting
    private IObjectWrapper f23669k;

    public zzbxa(Context context, zzbgz zzbgzVar, zzcxm zzcxmVar, zzbai zzbaiVar, int i2) {
        this.f23664f = context;
        this.f23665g = zzbgzVar;
        this.f23666h = zzcxmVar;
        this.f23667i = zzbaiVar;
        this.f23668j = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void onAdLoaded() {
        int i2 = this.f23668j;
        if ((i2 == 7 || i2 == 3) && this.f23666h.f25237J && this.f23665g != null && zzk.zzlv().m16875g(this.f23664f)) {
            zzbai zzbaiVar = this.f23667i;
            int i3 = zzbaiVar.f22751g;
            int i4 = zzbaiVar.f22752h;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i3);
            sb.append(".");
            sb.append(i4);
            IObjectWrapper iObjectWrapperM16870b = zzk.zzlv().m16870b(sb.toString(), this.f23665g.getWebView(), HttpUrl.FRAGMENT_ENCODE_SET, "javascript", this.f23666h.f25239L.optInt("media_type", -1) == 0 ? null : "javascript");
            this.f23669k = iObjectWrapperM16870b;
            if (iObjectWrapperM16870b == null || this.f23665g.getView() == null) {
                return;
            }
            zzk.zzlv().m16872d(this.f23669k, this.f23665g.getView());
            this.f23665g.mo14880H(this.f23669k);
            zzk.zzlv().m16873e(this.f23669k);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzsz() {
        this.f23669k = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzta() {
        zzbgz zzbgzVar;
        if (this.f23669k == null || (zzbgzVar = this.f23665g) == null) {
            return;
        }
        zzbgzVar.mo14940y("onSdkImpression", new HashMap());
    }
}
