package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdso extends zzdrr<zzdso> {

    /* renamed from: c */
    public Integer f25923c = null;

    /* renamed from: d */
    public String f25924d = null;

    /* renamed from: e */
    public byte[] f25925e = null;

    public zzdso() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        Integer num = this.f25923c;
        if (num != null) {
            zzdrpVar.m19817x(1, num.intValue());
        }
        String str = this.f25924d;
        if (str != null) {
            zzdrpVar.m19813k(2, str);
        }
        byte[] bArr = this.f25925e;
        if (bArr != null) {
            zzdrpVar.m19810c(3, bArr);
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        int iMo19820e = super.mo19820e();
        Integer num = this.f25923c;
        if (num != null) {
            iMo19820e += zzdrp.m19795d(1, num.intValue());
        }
        String str = this.f25924d;
        if (str != null) {
            iMo19820e += zzdrp.m19801n(2, str);
        }
        byte[] bArr = this.f25925e;
        return bArr != null ? iMo19820e + zzdrp.m19798h(3, bArr) : iMo19820e;
    }
}
