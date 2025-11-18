package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdsq extends zzdrr<zzdsq> {

    /* renamed from: c */
    public String f25936c = null;

    /* renamed from: d */
    public Long f25937d = null;

    /* renamed from: e */
    public Boolean f25938e = null;

    public zzdsq() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        String str = this.f25936c;
        if (str != null) {
            zzdrpVar.m19813k(1, str);
        }
        Long l = this.f25937d;
        if (l != null) {
            long jLongValue = l.longValue();
            zzdrpVar.m19816w(2, 0);
            zzdrpVar.m19814l(jLongValue);
        }
        Boolean bool = this.f25938e;
        if (bool != null) {
            zzdrpVar.m19815u(3, bool.booleanValue());
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        int iMo19820e = super.mo19820e();
        String str = this.f25936c;
        if (str != null) {
            iMo19820e += zzdrp.m19801n(1, str);
        }
        Long l = this.f25937d;
        if (l != null) {
            iMo19820e += zzdrp.m19802o(2) + zzdrp.m19800m(l.longValue());
        }
        Boolean bool = this.f25938e;
        if (bool == null) {
            return iMo19820e;
        }
        bool.booleanValue();
        return iMo19820e + zzdrp.m19802o(3) + 1;
    }
}
