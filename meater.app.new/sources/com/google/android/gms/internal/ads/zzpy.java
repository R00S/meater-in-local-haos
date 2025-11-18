package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzpy implements zzqx {

    /* renamed from: f */
    private final zzqx[] f26829f;

    public zzpy(zzqx[] zzqxVarArr) {
        this.f26829f = zzqxVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    /* renamed from: a */
    public final long mo15124a() {
        long jMin = Long.MAX_VALUE;
        for (zzqx zzqxVar : this.f26829f) {
            long jMo15124a = zzqxVar.mo15124a();
            if (jMo15124a != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo15124a);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    /* renamed from: b */
    public final boolean mo15125b(long j2) {
        boolean zMo15125b;
        boolean z = false;
        do {
            long jMo15124a = mo15124a();
            if (jMo15124a == Long.MIN_VALUE) {
                break;
            }
            zMo15125b = false;
            for (zzqx zzqxVar : this.f26829f) {
                if (zzqxVar.mo15124a() == jMo15124a) {
                    zMo15125b |= zzqxVar.mo15125b(j2);
                }
            }
            z |= zMo15125b;
        } while (zMo15125b);
        return z;
    }
}
