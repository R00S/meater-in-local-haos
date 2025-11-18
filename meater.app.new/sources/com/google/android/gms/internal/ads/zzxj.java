package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzwt;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzxj extends zzdrr<zzxj> {

    /* renamed from: c */
    public Integer f27341c = null;

    /* renamed from: d */
    private zzwx f27342d = null;

    /* renamed from: e */
    private zzwt.zzb f27343e = null;

    /* renamed from: f */
    public zzxk f27344f = null;

    /* renamed from: g */
    private zzwt.zza[] f27345g = new zzwt.zza[0];

    /* renamed from: h */
    private zzwt.zzc f27346h = null;

    /* renamed from: i */
    private zzwt.zzj f27347i = null;

    /* renamed from: j */
    private zzwt.zzh f27348j = null;

    /* renamed from: k */
    private zzwt.zze f27349k = null;

    /* renamed from: l */
    private zzwt.zzf f27350l = null;

    /* renamed from: m */
    private zzxp[] f27351m = zzxp.m20813f();

    public zzxj() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        Integer num = this.f27341c;
        if (num != null) {
            zzdrpVar.m19817x(7, num.intValue());
        }
        zzxk zzxkVar = this.f27344f;
        if (zzxkVar != null) {
            zzdrpVar.m19809b(10, zzxkVar);
        }
        zzwt.zza[] zzaVarArr = this.f27345g;
        int i2 = 0;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzwt.zza[] zzaVarArr2 = this.f27345g;
                if (i3 >= zzaVarArr2.length) {
                    break;
                }
                zzwt.zza zzaVar = zzaVarArr2[i3];
                if (zzaVar != null) {
                    zzdrpVar.m19812j(11, zzaVar);
                }
                i3++;
            }
        }
        zzxp[] zzxpVarArr = this.f27351m;
        if (zzxpVarArr != null && zzxpVarArr.length > 0) {
            while (true) {
                zzxp[] zzxpVarArr2 = this.f27351m;
                if (i2 >= zzxpVarArr2.length) {
                    break;
                }
                zzxp zzxpVar = zzxpVarArr2[i2];
                if (zzxpVar != null) {
                    zzdrpVar.m19809b(17, zzxpVar);
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
        Integer num = this.f27341c;
        if (num != null) {
            iMo19820e += zzdrp.m19795d(7, num.intValue());
        }
        zzxk zzxkVar = this.f27344f;
        if (zzxkVar != null) {
            iMo19820e += zzdrp.m19797g(10, zzxkVar);
        }
        zzwt.zza[] zzaVarArr = this.f27345g;
        int i2 = 0;
        if (zzaVarArr != null && zzaVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzwt.zza[] zzaVarArr2 = this.f27345g;
                if (i3 >= zzaVarArr2.length) {
                    break;
                }
                zzwt.zza zzaVar = zzaVarArr2[i3];
                if (zzaVar != null) {
                    iMo19820e += zzdni.m19621K(11, zzaVar);
                }
                i3++;
            }
        }
        zzxp[] zzxpVarArr = this.f27351m;
        if (zzxpVarArr != null && zzxpVarArr.length > 0) {
            while (true) {
                zzxp[] zzxpVarArr2 = this.f27351m;
                if (i2 >= zzxpVarArr2.length) {
                    break;
                }
                zzxp zzxpVar = zzxpVarArr2[i2];
                if (zzxpVar != null) {
                    iMo19820e += zzdrp.m19797g(17, zzxpVar);
                }
                i2++;
            }
        }
        return iMo19820e;
    }
}
