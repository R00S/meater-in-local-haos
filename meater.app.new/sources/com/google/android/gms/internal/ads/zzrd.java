package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class zzrd implements zzrm {

    /* renamed from: a */
    private final zzra f26899a;

    /* renamed from: b */
    private final int f26900b;

    /* renamed from: c */
    private final int[] f26901c;

    /* renamed from: d */
    private final zzlh[] f26902d;

    /* renamed from: e */
    private final long[] f26903e;

    /* renamed from: f */
    private int f26904f;

    public zzrd(zzra zzraVar, int... iArr) {
        int i2 = 0;
        zzsk.m20481e(iArr.length > 0);
        this.f26899a = (zzra) zzsk.m20480d(zzraVar);
        int length = iArr.length;
        this.f26900b = length;
        this.f26902d = new zzlh[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f26902d[i3] = zzraVar.m20434a(iArr[i3]);
        }
        Arrays.sort(this.f26902d, new k30());
        this.f26901c = new int[this.f26900b];
        while (true) {
            int i4 = this.f26900b;
            if (i2 >= i4) {
                this.f26903e = new long[i4];
                return;
            } else {
                this.f26901c[i2] = zzraVar.m20435b(this.f26902d[i2]);
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    /* renamed from: a */
    public final zzra mo20438a() {
        return this.f26899a;
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    /* renamed from: b */
    public final int mo20439b(int i2) {
        return this.f26901c[0];
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    /* renamed from: c */
    public final zzlh mo20440c(int i2) {
        return this.f26902d[i2];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzrd zzrdVar = (zzrd) obj;
            if (this.f26899a == zzrdVar.f26899a && Arrays.equals(this.f26901c, zzrdVar.f26901c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f26904f == 0) {
            this.f26904f = (System.identityHashCode(this.f26899a) * 31) + Arrays.hashCode(this.f26901c);
        }
        return this.f26904f;
    }

    @Override // com.google.android.gms.internal.ads.zzrm
    public final int length() {
        return this.f26901c.length;
    }
}
