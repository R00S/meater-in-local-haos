package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdsk extends zzdrr<zzdsk> {

    /* renamed from: c */
    public String f25914c = null;

    public zzdsk() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        String str = this.f25914c;
        if (str != null) {
            zzdrpVar.m19813k(1, str);
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        int iMo19820e = super.mo19820e();
        String str = this.f25914c;
        return str != null ? iMo19820e + zzdrp.m19801n(1, str) : iMo19820e;
    }
}
