package com.google.android.gms.internal.ads;

import android.content.Context;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzjt implements zzkf {

    /* renamed from: a */
    private final zzkf f26398a;

    /* renamed from: b */
    private final zzkf f26399b;

    /* renamed from: c */
    private final zzkf f26400c;

    /* renamed from: d */
    private zzkf f26401d;

    public zzjt(Context context, String str) {
        this(context, null, str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    /* renamed from: a */
    public final long mo14852a(zzjq zzjqVar) throws IOException {
        zzkh.m20129d(this.f26401d == null);
        String scheme = zzjqVar.f26371a.getScheme();
        if ("http".equals(scheme) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equals(scheme)) {
            this.f26401d = this.f26398a;
        } else if ("file".equals(scheme)) {
            if (zzjqVar.f26371a.getPath().startsWith("/android_asset/")) {
                this.f26401d = this.f26400c;
            } else {
                this.f26401d = this.f26399b;
            }
        } else {
            if (!"asset".equals(scheme)) {
                throw new zzju(scheme);
            }
            this.f26401d = this.f26400c;
        }
        return this.f26401d.mo14852a(zzjqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws IOException {
        zzkf zzkfVar = this.f26401d;
        if (zzkfVar != null) {
            try {
                zzkfVar.close();
            } finally {
                this.f26401d = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.f26401d.read(bArr, i2, i3);
    }

    private zzjt(Context context, zzke zzkeVar, String str, boolean z) {
        this(context, null, new zzjs(str, null, null, 8000, 8000, false));
    }

    private zzjt(Context context, zzke zzkeVar, zzkf zzkfVar) {
        this.f26398a = (zzkf) zzkh.m20128c(zzkfVar);
        this.f26399b = new zzjv(null);
        this.f26400c = new zzjm(context, null);
    }
}
