package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdrz;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdsm extends zzdrr<zzdsm> {

    /* renamed from: c */
    private zzdrz.zzb.zzd.C11485zzb f25918c = null;

    /* renamed from: d */
    public zzdsl[] f25919d = zzdsl.m19849f();

    /* renamed from: e */
    private byte[] f25920e = null;

    /* renamed from: f */
    private byte[] f25921f = null;

    /* renamed from: g */
    private Integer f25922g = null;

    public zzdsm() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        zzdsl[] zzdslVarArr = this.f25919d;
        if (zzdslVarArr != null && zzdslVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzdsl[] zzdslVarArr2 = this.f25919d;
                if (i2 >= zzdslVarArr2.length) {
                    break;
                }
                zzdsl zzdslVar = zzdslVarArr2[i2];
                if (zzdslVar != null) {
                    zzdrpVar.m19809b(2, zzdslVar);
                }
                i2++;
            }
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        int iMo19820e = super.mo19820e();
        zzdsl[] zzdslVarArr = this.f25919d;
        if (zzdslVarArr != null && zzdslVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzdsl[] zzdslVarArr2 = this.f25919d;
                if (i2 >= zzdslVarArr2.length) {
                    break;
                }
                zzdsl zzdslVar = zzdslVarArr2[i2];
                if (zzdslVar != null) {
                    iMo19820e += zzdrp.m19797g(2, zzdslVar);
                }
                i2++;
            }
        }
        return iMo19820e;
    }
}
