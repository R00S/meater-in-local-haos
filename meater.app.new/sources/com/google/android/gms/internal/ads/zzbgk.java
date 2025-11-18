package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;

@zzard
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzbgk extends zzbgl {
    public zzbgk(zzbdf zzbdfVar) {
        super(zzbdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    /* renamed from: C */
    protected final zzhn mo17650C(String str) {
        return new zzgl(this.f22970f, Uri.parse(str), null, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    /* renamed from: D */
    protected final int mo17651D() {
        return 0;
    }
}
