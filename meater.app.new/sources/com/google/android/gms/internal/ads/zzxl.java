package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxl extends zzdrr<zzxl> {

    /* renamed from: c */
    public String f27357c = null;

    /* renamed from: d */
    private zzwt.zzn f27358d = null;

    /* renamed from: e */
    private Integer f27359e = null;

    /* renamed from: f */
    public zzxo f27360f = null;

    /* renamed from: g */
    private Integer f27361g = null;

    /* renamed from: h */
    private zzwx f27362h = null;

    /* renamed from: i */
    private zzwx f27363i = null;

    /* renamed from: j */
    private zzwx f27364j = null;

    public zzxl() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        String str = this.f27357c;
        if (str != null) {
            zzdrpVar.m19813k(1, str);
        }
        zzxo zzxoVar = this.f27360f;
        if (zzxoVar != null) {
            zzdrpVar.m19809b(4, zzxoVar);
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        int iMo19820e = super.mo19820e();
        String str = this.f27357c;
        if (str != null) {
            iMo19820e += zzdrp.m19801n(1, str);
        }
        zzxo zzxoVar = this.f27360f;
        return zzxoVar != null ? iMo19820e + zzdrp.m19797g(4, zzxoVar) : iMo19820e;
    }
}
