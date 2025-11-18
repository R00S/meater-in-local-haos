package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaza extends zzr<zzp> {

    /* renamed from: u */
    private final zzbbr<zzp> f22702u;

    /* renamed from: v */
    private final Map<String, String> f22703v;

    /* renamed from: w */
    private final zzazx f22704w;

    public zzaza(String str, zzbbr<zzp> zzbbrVar) {
        this(str, null, zzbbrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: F */
    protected final /* synthetic */ void mo16035F(zzp zzpVar) throws IOException {
        zzp zzpVar2 = zzpVar;
        this.f22704w.m17342j(zzpVar2.f26741c, zzpVar2.f26739a);
        zzazx zzazxVar = this.f22704w;
        byte[] bArr = zzpVar2.f26740b;
        if (zzazx.m17324a() && bArr != null) {
            zzazxVar.m17344s(bArr);
        }
        this.f22702u.m17385a(zzpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: y */
    protected final zzy<zzp> mo17084y(zzp zzpVar) {
        return zzy.m20817a(zzpVar, zzaq.m16857a(zzpVar));
    }

    private zzaza(String str, Map<String, String> map, zzbbr<zzp> zzbbrVar) throws IOException {
        super(0, str, new C6477a6(zzbbrVar));
        this.f22703v = null;
        this.f22702u = zzbbrVar;
        zzazx zzazxVar = new zzazx();
        this.f22704w = zzazxVar;
        zzazxVar.m17339f(str, "GET", null, null);
    }
}
