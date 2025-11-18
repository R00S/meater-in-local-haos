package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxo extends zzdrr<zzxo> {

    /* renamed from: c */
    public Integer f27377c = null;

    /* renamed from: d */
    public Integer f27378d = null;

    /* renamed from: e */
    public Integer f27379e = null;

    public zzxo() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        Integer num = this.f27377c;
        if (num != null) {
            zzdrpVar.m19817x(1, num.intValue());
        }
        Integer num2 = this.f27378d;
        if (num2 != null) {
            zzdrpVar.m19817x(2, num2.intValue());
        }
        Integer num3 = this.f27379e;
        if (num3 != null) {
            zzdrpVar.m19817x(3, num3.intValue());
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        int iMo19820e = super.mo19820e();
        Integer num = this.f27377c;
        if (num != null) {
            iMo19820e += zzdrp.m19795d(1, num.intValue());
        }
        Integer num2 = this.f27378d;
        if (num2 != null) {
            iMo19820e += zzdrp.m19795d(2, num2.intValue());
        }
        Integer num3 = this.f27379e;
        return num3 != null ? iMo19820e + zzdrp.m19795d(3, num3.intValue()) : iMo19820e;
    }
}
