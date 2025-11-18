package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxk extends zzdrr<zzxk> {

    /* renamed from: c */
    public String f27352c = null;

    /* renamed from: d */
    private zzwt.zza[] f27353d = new zzwt.zza[0];

    /* renamed from: e */
    private zzwx f27354e = null;

    /* renamed from: f */
    private zzwx f27355f = null;

    /* renamed from: g */
    private zzwx f27356g = null;

    public zzxk() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        String str = this.f27352c;
        if (str != null) {
            zzdrpVar.m19813k(1, str);
        }
        zzwt.zza[] zzaVarArr = this.f27353d;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzwt.zza[] zzaVarArr2 = this.f27353d;
                if (i2 >= zzaVarArr2.length) {
                    break;
                }
                zzwt.zza zzaVar = zzaVarArr2[i2];
                if (zzaVar != null) {
                    zzdrpVar.m19812j(2, zzaVar);
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
        String str = this.f27352c;
        if (str != null) {
            iMo19820e += zzdrp.m19801n(1, str);
        }
        zzwt.zza[] zzaVarArr = this.f27353d;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzwt.zza[] zzaVarArr2 = this.f27353d;
                if (i2 >= zzaVarArr2.length) {
                    break;
                }
                zzwt.zza zzaVar = zzaVarArr2[i2];
                if (zzaVar != null) {
                    iMo19820e += zzdni.m19621K(2, zzaVar);
                }
                i2++;
            }
        }
        return iMo19820e;
    }
}
