package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.x5 */
/* loaded from: classes2.dex */
final class C7327x5 extends zzax {

    /* renamed from: w */
    private final /* synthetic */ byte[] f20941w;

    /* renamed from: x */
    private final /* synthetic */ Map f20942x;

    /* renamed from: y */
    private final /* synthetic */ zzazx f20943y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7327x5(zzayu zzayuVar, int i2, String str, zzaa zzaaVar, zzz zzzVar, byte[] bArr, Map map, zzazx zzazxVar) {
        super(i2, str, zzaaVar, zzzVar);
        this.f20941w = bArr;
        this.f20942x = map;
        this.f20943y = zzazxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzax, com.google.android.gms.internal.ads.zzr
    /* renamed from: F */
    protected final /* synthetic */ void mo16035F(String str) {
        mo16035F(str);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: O */
    public final byte[] mo16036O() throws zza {
        byte[] bArr = this.f20941w;
        return bArr == null ? super.mo16036O() : bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzax
    /* renamed from: V */
    public final void mo16035F(String str) throws IOException {
        this.f20943y.m17343p(str);
        super.mo16035F(str);
    }

    @Override // com.google.android.gms.internal.ads.zzr
    /* renamed from: g */
    public final Map<String, String> mo16038g() throws zza {
        Map<String, String> map = this.f20942x;
        return map == null ? super.mo16038g() : map;
    }
}
