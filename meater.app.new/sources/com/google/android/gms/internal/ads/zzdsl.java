package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdsl extends zzdrr<zzdsl> {

    /* renamed from: c */
    private static volatile zzdsl[] f25915c;

    /* renamed from: d */
    public byte[] f25916d = null;

    /* renamed from: e */
    public byte[] f25917e = null;

    public zzdsl() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    /* renamed from: f */
    public static zzdsl[] m19849f() {
        if (f25915c == null) {
            synchronized (zzdrv.f25853c) {
                if (f25915c == null) {
                    f25915c = new zzdsl[0];
                }
            }
        }
        return f25915c;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        zzdrpVar.m19810c(1, this.f25916d);
        byte[] bArr = this.f25917e;
        if (bArr != null) {
            zzdrpVar.m19810c(2, bArr);
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        int iMo19820e = super.mo19820e() + zzdrp.m19798h(1, this.f25916d);
        byte[] bArr = this.f25917e;
        return bArr != null ? iMo19820e + zzdrp.m19798h(2, bArr) : iMo19820e;
    }
}
