package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import okhttp3.HttpUrl;
import p024c.p041e.C0867a;

/* loaded from: classes2.dex */
public final class zzbot implements zzbrw, zzbsr {

    /* renamed from: f */
    private final Context f23375f;

    /* renamed from: g */
    private final zzbgz f23376g;

    /* renamed from: h */
    private final zzcxm f23377h;

    /* renamed from: i */
    private final zzbai f23378i;

    /* renamed from: j */
    private IObjectWrapper f23379j;

    /* renamed from: k */
    private boolean f23380k;

    public zzbot(Context context, zzbgz zzbgzVar, zzcxm zzcxmVar, zzbai zzbaiVar) {
        this.f23375f = context;
        this.f23376g = zzbgzVar;
        this.f23377h = zzcxmVar;
        this.f23378i = zzbaiVar;
    }

    /* renamed from: a */
    private final synchronized void m17935a() {
        if (this.f23377h.f25237J) {
            if (this.f23376g == null) {
                return;
            }
            if (zzk.zzlv().m16875g(this.f23375f)) {
                zzbai zzbaiVar = this.f23378i;
                int i2 = zzbaiVar.f22751g;
                int i3 = zzbaiVar.f22752h;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i2);
                sb.append(".");
                sb.append(i3);
                this.f23379j = zzk.zzlv().m16870b(sb.toString(), this.f23376g.getWebView(), HttpUrl.FRAGMENT_ENCODE_SET, "javascript", this.f23377h.f25239L.optInt("media_type", -1) == 0 ? null : "javascript");
                View view = this.f23376g.getView();
                if (this.f23379j != null && view != null) {
                    zzk.zzlv().m16872d(this.f23379j, view);
                    this.f23376g.mo14880H(this.f23379j);
                    zzk.zzlv().m16873e(this.f23379j);
                    this.f23380k = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrw
    public final synchronized void onAdImpression() {
        zzbgz zzbgzVar;
        if (!this.f23380k) {
            m17935a();
        }
        if (this.f23377h.f25237J && this.f23379j != null && (zzbgzVar = this.f23376g) != null) {
            zzbgzVar.mo14940y("onSdkImpression", new C0867a());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final synchronized void onAdLoaded() {
        if (this.f23380k) {
            return;
        }
        m17935a();
    }
}
