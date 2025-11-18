package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzir extends C7283vz {

    /* renamed from: b0 */
    public final long f26299b0;

    /* renamed from: c0 */
    public final List<zzis> f26300c0;

    /* renamed from: d0 */
    public final List<zzir> f26301d0;

    public zzir(int i2, long j2) {
        super(i2);
        this.f26300c0 = new ArrayList();
        this.f26301d0 = new ArrayList();
        this.f26299b0 = j2;
    }

    /* renamed from: c */
    public final zzis m20093c(int i2) {
        int size = this.f26300c0.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzis zzisVar = this.f26300c0.get(i3);
            if (zzisVar.f20816a0 == i2) {
                return zzisVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final zzir m20094d(int i2) {
        int size = this.f26301d0.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzir zzirVar = this.f26301d0.get(i3);
            if (zzirVar.f20816a0 == i2) {
                return zzirVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.C7283vz
    public final String toString() {
        String strM15973b = C7283vz.m15973b(this.f20816a0);
        String strValueOf = String.valueOf(Arrays.toString(this.f26300c0.toArray(new zzis[0])));
        String strValueOf2 = String.valueOf(Arrays.toString(this.f26301d0.toArray(new zzir[0])));
        StringBuilder sb = new StringBuilder(String.valueOf(strM15973b).length() + 22 + strValueOf.length() + strValueOf2.length());
        sb.append(strM15973b);
        sb.append(" leaves: ");
        sb.append(strValueOf);
        sb.append(" containers: ");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
