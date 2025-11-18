package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzrj extends zzrp {

    /* renamed from: b */
    private final SparseArray<Map<zzrb, zzrl>> f26922b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f26923c = new SparseBooleanArray();

    /* renamed from: d */
    private int f26924d = 0;

    /* renamed from: e */
    private zzrk f26925e;

    @Override // com.google.android.gms.internal.ads.zzrp
    /* renamed from: b */
    public final zzrr mo20445b(zzlp[] zzlpVarArr, zzrb zzrbVar) throws zzku {
        int[] iArr;
        int[] iArr2 = new int[zzlpVarArr.length + 1];
        int length = zzlpVarArr.length + 1;
        zzra[][] zzraVarArr = new zzra[length][];
        int[][][] iArr3 = new int[zzlpVarArr.length + 1][][];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = zzrbVar.f26895b;
            zzraVarArr[i2] = new zzra[i3];
            iArr3[i2] = new int[i3][];
        }
        int length2 = zzlpVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            iArr4[i4] = zzlpVarArr[i4].mo20176a();
        }
        for (int i5 = 0; i5 < zzrbVar.f26895b; i5++) {
            zzra zzraVarM20437b = zzrbVar.m20437b(i5);
            int length3 = zzlpVarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < zzlpVarArr.length; i7++) {
                zzlp zzlpVar = zzlpVarArr[i7];
                for (int i8 = 0; i8 < zzraVarM20437b.f26891a; i8++) {
                    int iMo20215b = zzlpVar.mo20215b(zzraVarM20437b.m20434a(i8)) & 3;
                    if (iMo20215b > i6) {
                        length3 = i7;
                        if (iMo20215b == 3) {
                            break;
                        }
                        i6 = iMo20215b;
                    }
                }
            }
            if (length3 == zzlpVarArr.length) {
                iArr = new int[zzraVarM20437b.f26891a];
            } else {
                zzlp zzlpVar2 = zzlpVarArr[length3];
                int[] iArr5 = new int[zzraVarM20437b.f26891a];
                for (int i9 = 0; i9 < zzraVarM20437b.f26891a; i9++) {
                    iArr5[i9] = zzlpVar2.mo20215b(zzraVarM20437b.m20434a(i9));
                }
                iArr = iArr5;
            }
            int i10 = iArr2[length3];
            zzraVarArr[length3][i10] = zzraVarM20437b;
            iArr3[length3][i10] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        zzrb[] zzrbVarArr = new zzrb[zzlpVarArr.length];
        int[] iArr6 = new int[zzlpVarArr.length];
        for (int i11 = 0; i11 < zzlpVarArr.length; i11++) {
            int i12 = iArr2[i11];
            zzrbVarArr[i11] = new zzrb((zzra[]) Arrays.copyOf(zzraVarArr[i11], i12));
            iArr3[i11] = (int[][]) Arrays.copyOf(iArr3[i11], i12);
            iArr6[i11] = zzlpVarArr[i11].mo20164E();
        }
        zzrb zzrbVar2 = new zzrb((zzra[]) Arrays.copyOf(zzraVarArr[zzlpVarArr.length], iArr2[zzlpVarArr.length]));
        zzrm[] zzrmVarArrMo20444e = mo20444e(zzlpVarArr, zzrbVarArr, iArr3);
        int i13 = 0;
        while (true) {
            if (i13 >= zzlpVarArr.length) {
                zzrk zzrkVar = new zzrk(iArr6, zzrbVarArr, iArr4, iArr3, zzrbVar2);
                zzlq[] zzlqVarArr = new zzlq[zzlpVarArr.length];
                for (int i14 = 0; i14 < zzlpVarArr.length; i14++) {
                    zzlqVarArr[i14] = zzrmVarArrMo20444e[i14] != null ? zzlq.f26494a : null;
                }
                return new zzrr(zzrbVar, new zzro(zzrmVarArrMo20444e), zzrkVar, zzlqVarArr);
            }
            if (this.f26923c.get(i13)) {
                zzrmVarArrMo20444e[i13] = null;
            } else {
                zzrb zzrbVar3 = zzrbVarArr[i13];
                Map<zzrb, zzrl> map = this.f26922b.get(i13);
                if ((map != null ? map.get(zzrbVar3) : null) != null) {
                    throw new NoSuchMethodError();
                }
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    /* renamed from: d */
    public final void mo20446d(Object obj) {
        this.f26925e = (zzrk) obj;
    }

    /* renamed from: e */
    protected abstract zzrm[] mo20444e(zzlp[] zzlpVarArr, zzrb[] zzrbVarArr, int[][][] iArr) throws zzku;

    /* renamed from: f */
    public final void m20447f(int i2, boolean z) {
        if (this.f26923c.get(i2) == z) {
            return;
        }
        this.f26923c.put(i2, z);
        m20450a();
    }
}
