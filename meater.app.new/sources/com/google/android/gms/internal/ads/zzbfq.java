package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzbfq extends zzawv {

    /* renamed from: a */
    final zzbdf f22965a;

    /* renamed from: b */
    final zzbft f22966b;

    /* renamed from: c */
    private final String f22967c;

    /* renamed from: d */
    private final String[] f22968d;

    zzbfq(zzbdf zzbdfVar, zzbft zzbftVar, String str, String[] strArr) {
        this.f22965a = zzbdfVar;
        this.f22966b = zzbftVar;
        this.f22967c = str;
        this.f22968d = strArr;
        zzk.zzmc().m17621c(this);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        try {
            this.f22966b.mo17639x(this.f22967c, this.f22968d);
        } finally {
            zzaxi.f22654a.post(new RunnableC7368y9(this));
        }
    }
}
