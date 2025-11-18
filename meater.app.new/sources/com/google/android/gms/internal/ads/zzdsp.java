package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzdsp extends zzdrr<zzdsp> {

    /* renamed from: c */
    private static volatile zzdsp[] f25926c;

    /* renamed from: d */
    public Integer f25927d = null;

    /* renamed from: e */
    public String f25928e = null;

    /* renamed from: f */
    public zzdsm f25929f = null;

    /* renamed from: g */
    private zzdsn f25930g = null;

    /* renamed from: h */
    private Integer f25931h = null;

    /* renamed from: i */
    private int[] f25932i = zzdry.f25855a;

    /* renamed from: j */
    private String f25933j = null;

    /* renamed from: k */
    public Integer f25934k = null;

    /* renamed from: l */
    public String[] f25935l = zzdry.f25860f;

    public zzdsp() {
        this.f25844b = null;
        this.f25854a = -1;
    }

    /* renamed from: f */
    public static zzdsp[] m19850f() {
        if (f25926c == null) {
            synchronized (zzdrv.f25853c) {
                if (f25926c == null) {
                    f25926c = new zzdsp[0];
                }
            }
        }
        return f25926c;
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public final void mo19818a(zzdrp zzdrpVar) throws IOException {
        zzdrpVar.m19817x(1, this.f25927d.intValue());
        String str = this.f25928e;
        if (str != null) {
            zzdrpVar.m19813k(2, str);
        }
        zzdsm zzdsmVar = this.f25929f;
        if (zzdsmVar != null) {
            zzdrpVar.m19809b(3, zzdsmVar);
        }
        int[] iArr = this.f25932i;
        int i2 = 0;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.f25932i;
                if (i3 >= iArr2.length) {
                    break;
                }
                zzdrpVar.m19817x(6, iArr2[i3]);
                i3++;
            }
        }
        Integer num = this.f25934k;
        if (num != null) {
            zzdrpVar.m19817x(8, num.intValue());
        }
        String[] strArr = this.f25935l;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f25935l;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    zzdrpVar.m19813k(9, str2);
                }
                i2++;
            }
        }
        super.mo19818a(zzdrpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdrr, com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected final int mo19820e() {
        int[] iArr;
        int iMo19820e = super.mo19820e() + zzdrp.m19795d(1, this.f25927d.intValue());
        String str = this.f25928e;
        if (str != null) {
            iMo19820e += zzdrp.m19801n(2, str);
        }
        zzdsm zzdsmVar = this.f25929f;
        if (zzdsmVar != null) {
            iMo19820e += zzdrp.m19797g(3, zzdsmVar);
        }
        int[] iArr2 = this.f25932i;
        int i2 = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i3 = 0;
            int iM19803p = 0;
            while (true) {
                iArr = this.f25932i;
                if (i3 >= iArr.length) {
                    break;
                }
                iM19803p += zzdrp.m19803p(iArr[i3]);
                i3++;
            }
            iMo19820e = iMo19820e + iM19803p + (iArr.length * 1);
        }
        Integer num = this.f25934k;
        if (num != null) {
            iMo19820e += zzdrp.m19795d(8, num.intValue());
        }
        String[] strArr = this.f25935l;
        if (strArr == null || strArr.length <= 0) {
            return iMo19820e;
        }
        int iM19805r = 0;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.f25935l;
            if (i2 >= strArr2.length) {
                return iMo19820e + iM19805r + (i4 * 1);
            }
            String str2 = strArr2[i2];
            if (str2 != null) {
                i4++;
                iM19805r += zzdrp.m19805r(str2);
            }
            i2++;
        }
    }
}
