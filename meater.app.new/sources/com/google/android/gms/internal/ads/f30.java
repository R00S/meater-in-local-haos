package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* loaded from: classes2.dex */
final class f30 implements zzqj, zzqk {

    /* renamed from: f */
    public final zzqj[] f18851f;

    /* renamed from: g */
    private final IdentityHashMap<zzqw, Integer> f18852g = new IdentityHashMap<>();

    /* renamed from: h */
    private zzqk f18853h;

    /* renamed from: i */
    private int f18854i;

    /* renamed from: j */
    private zzrb f18855j;

    /* renamed from: k */
    private zzqj[] f18856k;

    /* renamed from: l */
    private zzqx f18857l;

    public f30(zzqj... zzqjVarArr) {
        this.f18851f = zzqjVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzqx
    /* renamed from: a */
    public final long mo15124a() {
        return this.f18857l.mo15124a();
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzqx
    /* renamed from: b */
    public final boolean mo15125b(long j2) {
        return this.f18857l.mo15125b(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: c */
    public final long mo15126c(zzrm[] zzrmVarArr, boolean[] zArr, zzqw[] zzqwVarArr, boolean[] zArr2, long j2) {
        zzqw[] zzqwVarArr2 = zzqwVarArr;
        int[] iArr = new int[zzrmVarArr.length];
        int[] iArr2 = new int[zzrmVarArr.length];
        for (int i2 = 0; i2 < zzrmVarArr.length; i2++) {
            iArr[i2] = zzqwVarArr2[i2] == null ? -1 : this.f18852g.get(zzqwVarArr2[i2]).intValue();
            iArr2[i2] = -1;
            if (zzrmVarArr[i2] != null) {
                zzra zzraVarMo20438a = zzrmVarArr[i2].mo20438a();
                int i3 = 0;
                while (true) {
                    zzqj[] zzqjVarArr = this.f18851f;
                    if (i3 >= zzqjVarArr.length) {
                        break;
                    }
                    if (zzqjVarArr[i3].mo15134l().m20436a(zzraVarMo20438a) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        this.f18852g.clear();
        int length = zzrmVarArr.length;
        zzqw[] zzqwVarArr3 = new zzqw[length];
        zzqw[] zzqwVarArr4 = new zzqw[zzrmVarArr.length];
        zzrm[] zzrmVarArr2 = new zzrm[zzrmVarArr.length];
        ArrayList arrayList = new ArrayList(this.f18851f.length);
        long j3 = j2;
        int i4 = 0;
        while (i4 < this.f18851f.length) {
            for (int i5 = 0; i5 < zzrmVarArr.length; i5++) {
                zzrm zzrmVar = null;
                zzqwVarArr4[i5] = iArr[i5] == i4 ? zzqwVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzrmVar = zzrmVarArr[i5];
                }
                zzrmVarArr2[i5] = zzrmVar;
            }
            int i6 = i4;
            zzrm[] zzrmVarArr3 = zzrmVarArr2;
            ArrayList arrayList2 = arrayList;
            long jMo15126c = this.f18851f[i4].mo15126c(zzrmVarArr2, zArr, zzqwVarArr4, zArr2, j3);
            if (i6 == 0) {
                j3 = jMo15126c;
            } else if (jMo15126c != j3) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzrmVarArr.length; i7++) {
                if (iArr2[i7] == i6) {
                    zzsk.m20481e(zzqwVarArr4[i7] != null);
                    zzqwVarArr3[i7] = zzqwVarArr4[i7];
                    this.f18852g.put(zzqwVarArr4[i7], Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    zzsk.m20481e(zzqwVarArr4[i7] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f18851f[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzrmVarArr2 = zzrmVarArr3;
            zzqwVarArr2 = zzqwVarArr;
        }
        zzqw[] zzqwVarArr5 = zzqwVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzqwVarArr3, 0, zzqwVarArr5, 0, length);
        zzqj[] zzqjVarArr2 = new zzqj[arrayList3.size()];
        this.f18856k = zzqjVarArr2;
        arrayList3.toArray(zzqjVarArr2);
        this.f18857l = new zzpy(this.f18856k);
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    /* renamed from: d */
    public final void mo15127d(zzqj zzqjVar) {
        int i2 = this.f18854i - 1;
        this.f18854i = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (zzqj zzqjVar2 : this.f18851f) {
            i3 += zzqjVar2.mo15134l().f26895b;
        }
        zzra[] zzraVarArr = new zzra[i3];
        int i4 = 0;
        for (zzqj zzqjVar3 : this.f18851f) {
            zzrb zzrbVarMo15134l = zzqjVar3.mo15134l();
            int i5 = zzrbVarMo15134l.f26895b;
            int i6 = 0;
            while (i6 < i5) {
                zzraVarArr[i4] = zzrbVarMo15134l.m20437b(i6);
                i6++;
                i4++;
            }
        }
        this.f18855j = new zzrb(zzraVarArr);
        this.f18853h.mo15127d(this);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: e */
    public final long mo15128e() {
        long jMo15128e = this.f18851f[0].mo15128e();
        int i2 = 1;
        while (true) {
            zzqj[] zzqjVarArr = this.f18851f;
            if (i2 >= zzqjVarArr.length) {
                if (jMo15128e != -9223372036854775807L) {
                    for (zzqj zzqjVar : this.f18856k) {
                        if (zzqjVar != this.f18851f[0] && zzqjVar.mo15131h(jMo15128e) != jMo15128e) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return jMo15128e;
            }
            if (zzqjVarArr[i2].mo15128e() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: f */
    public final void mo15129f() throws IOException {
        for (zzqj zzqjVar : this.f18851f) {
            zzqjVar.mo15129f();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    /* renamed from: g */
    public final /* synthetic */ void mo15130g(zzqx zzqxVar) {
        if (this.f18855j != null) {
            this.f18853h.mo15130g(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: h */
    public final long mo15131h(long j2) {
        long jMo15131h = this.f18856k[0].mo15131h(j2);
        int i2 = 1;
        while (true) {
            zzqj[] zzqjVarArr = this.f18856k;
            if (i2 >= zzqjVarArr.length) {
                return jMo15131h;
            }
            if (zzqjVarArr[i2].mo15131h(jMo15131h) != jMo15131h) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: j */
    public final void mo15132j(zzqk zzqkVar, long j2) {
        this.f18853h = zzqkVar;
        zzqj[] zzqjVarArr = this.f18851f;
        this.f18854i = zzqjVarArr.length;
        for (zzqj zzqjVar : zzqjVarArr) {
            zzqjVar.mo15132j(this, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: k */
    public final void mo15133k(long j2) {
        for (zzqj zzqjVar : this.f18856k) {
            zzqjVar.mo15133k(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: l */
    public final zzrb mo15134l() {
        return this.f18855j;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    /* renamed from: r */
    public final long mo15135r() {
        long jMin = Long.MAX_VALUE;
        for (zzqj zzqjVar : this.f18856k) {
            long jMo15135r = zzqjVar.mo15135r();
            if (jMo15135r != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo15135r);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
