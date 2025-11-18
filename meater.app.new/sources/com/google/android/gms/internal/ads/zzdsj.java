package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdrz;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdsj extends zzdrr<zzdsj> {

    /* renamed from: c */
    public Integer f25896c = null;

    /* renamed from: d */
    private zzdrz.zza.zzc f25897d = null;

    /* renamed from: e */
    public String f25898e = null;

    /* renamed from: f */
    public String f25899f = null;

    /* renamed from: g */
    private String f25900g = null;

    /* renamed from: h */
    public zzdsk f25901h = null;

    /* renamed from: i */
    public zzdsp[] f25902i = zzdsp.m19850f();

    /* renamed from: j */
    public String f25903j = null;

    /* renamed from: k */
    public zzdso f25904k = null;

    /* renamed from: l */
    private Boolean f25905l = null;

    /* renamed from: m */
    private String[] f25906m;

    /* renamed from: n */
    private String f25907n;

    /* renamed from: o */
    private Boolean f25908o;

    /* renamed from: p */
    private Boolean f25909p;

    /* renamed from: q */
    private byte[] f25910q;

    /* renamed from: r */
    public zzdsq f25911r;

    /* renamed from: s */
    public String[] f25912s;

    /* renamed from: t */
    public String[] f25913t;

    public zzdsj() {
        String[] strArr = zzdry.f25860f;
        this.f25906m = strArr;
        this.f25907n = null;
        this.f25908o = null;
        this.f25909p = null;
        this.f25910q = null;
        this.f25911r = null;
        this.f25912s = strArr;
        this.f25913t = strArr;
        this.f25844b = null;
        this.f25854a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        String str = this.f25898e;
        if (str != null) {
            zzdrpVar.m19813k(1, str);
        }
        String str2 = this.f25899f;
        if (str2 != null) {
            zzdrpVar.m19813k(2, str2);
        }
        zzdsp[] zzdspVarArr = this.f25902i;
        int i2 = 0;
        if (zzdspVarArr != null && zzdspVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzdsp[] zzdspVarArr2 = this.f25902i;
                if (i3 >= zzdspVarArr2.length) {
                    break;
                }
                zzdsp zzdspVar = zzdspVarArr2[i3];
                if (zzdspVar != null) {
                    zzdrpVar.m19809b(4, zzdspVar);
                }
                i3++;
            }
        }
        String[] strArr = this.f25906m;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f25906m;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i4];
                if (str3 != null) {
                    zzdrpVar.m19813k(6, str3);
                }
                i4++;
            }
        }
        Integer num = this.f25896c;
        if (num != null) {
            zzdrpVar.m19817x(10, num.intValue());
        }
        zzdsk zzdskVar = this.f25901h;
        if (zzdskVar != null) {
            zzdrpVar.m19809b(12, zzdskVar);
        }
        String str4 = this.f25903j;
        if (str4 != null) {
            zzdrpVar.m19813k(13, str4);
        }
        zzdso zzdsoVar = this.f25904k;
        if (zzdsoVar != null) {
            zzdrpVar.m19809b(14, zzdsoVar);
        }
        zzdsq zzdsqVar = this.f25911r;
        if (zzdsqVar != null) {
            zzdrpVar.m19809b(17, zzdsqVar);
        }
        String[] strArr3 = this.f25912s;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.f25912s;
                if (i5 >= strArr4.length) {
                    break;
                }
                String str5 = strArr4[i5];
                if (str5 != null) {
                    zzdrpVar.m19813k(20, str5);
                }
                i5++;
            }
        }
        String[] strArr5 = this.f25913t;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.f25913t;
                if (i2 >= strArr6.length) {
                    break;
                }
                String str6 = strArr6[i2];
                if (str6 != null) {
                    zzdrpVar.m19813k(21, str6);
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
        String str = this.f25898e;
        if (str != null) {
            iMo19820e += zzdrp.m19801n(1, str);
        }
        String str2 = this.f25899f;
        if (str2 != null) {
            iMo19820e += zzdrp.m19801n(2, str2);
        }
        zzdsp[] zzdspVarArr = this.f25902i;
        int i2 = 0;
        if (zzdspVarArr != null && zzdspVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzdsp[] zzdspVarArr2 = this.f25902i;
                if (i3 >= zzdspVarArr2.length) {
                    break;
                }
                zzdsp zzdspVar = zzdspVarArr2[i3];
                if (zzdspVar != null) {
                    iMo19820e += zzdrp.m19797g(4, zzdspVar);
                }
                i3++;
            }
        }
        String[] strArr = this.f25906m;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int iM19805r = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f25906m;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i4];
                if (str3 != null) {
                    i5++;
                    iM19805r += zzdrp.m19805r(str3);
                }
                i4++;
            }
            iMo19820e = iMo19820e + iM19805r + (i5 * 1);
        }
        Integer num = this.f25896c;
        if (num != null) {
            iMo19820e += zzdrp.m19795d(10, num.intValue());
        }
        zzdsk zzdskVar = this.f25901h;
        if (zzdskVar != null) {
            iMo19820e += zzdrp.m19797g(12, zzdskVar);
        }
        String str4 = this.f25903j;
        if (str4 != null) {
            iMo19820e += zzdrp.m19801n(13, str4);
        }
        zzdso zzdsoVar = this.f25904k;
        if (zzdsoVar != null) {
            iMo19820e += zzdrp.m19797g(14, zzdsoVar);
        }
        zzdsq zzdsqVar = this.f25911r;
        if (zzdsqVar != null) {
            iMo19820e += zzdrp.m19797g(17, zzdsqVar);
        }
        String[] strArr3 = this.f25912s;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int iM19805r2 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr4 = this.f25912s;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str5 = strArr4[i6];
                if (str5 != null) {
                    i7++;
                    iM19805r2 += zzdrp.m19805r(str5);
                }
                i6++;
            }
            iMo19820e = iMo19820e + iM19805r2 + (i7 * 2);
        }
        String[] strArr5 = this.f25913t;
        if (strArr5 == null || strArr5.length <= 0) {
            return iMo19820e;
        }
        int iM19805r3 = 0;
        int i8 = 0;
        while (true) {
            String[] strArr6 = this.f25913t;
            if (i2 >= strArr6.length) {
                return iMo19820e + iM19805r3 + (i8 * 2);
            }
            String str6 = strArr6[i2];
            if (str6 != null) {
                i8++;
                iM19805r3 += zzdrp.m19805r(str6);
            }
            i2++;
        }
    }
}
