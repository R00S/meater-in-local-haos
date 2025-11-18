package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzra {

    /* renamed from: a */
    public final int f26891a;

    /* renamed from: b */
    private final zzlh[] f26892b;

    /* renamed from: c */
    private int f26893c;

    public zzra(zzlh... zzlhVarArr) {
        zzsk.m20481e(zzlhVarArr.length > 0);
        this.f26892b = zzlhVarArr;
        this.f26891a = zzlhVarArr.length;
    }

    /* renamed from: a */
    public final zzlh m20434a(int i2) {
        return this.f26892b[i2];
    }

    /* renamed from: b */
    public final int m20435b(zzlh zzlhVar) {
        int i2 = 0;
        while (true) {
            zzlh[] zzlhVarArr = this.f26892b;
            if (i2 >= zzlhVarArr.length) {
                return -1;
            }
            if (zzlhVar == zzlhVarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzra.class == obj.getClass()) {
            zzra zzraVar = (zzra) obj;
            if (this.f26891a == zzraVar.f26891a && Arrays.equals(this.f26892b, zzraVar.f26892b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26893c == 0) {
            this.f26893c = Arrays.hashCode(this.f26892b) + 527;
        }
        return this.f26893c;
    }
}
