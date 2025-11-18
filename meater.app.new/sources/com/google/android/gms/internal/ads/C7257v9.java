package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

@zzard
/* renamed from: com.google.android.gms.internal.ads.v9 */
/* loaded from: classes2.dex */
final class C7257v9 implements zzrv {

    /* renamed from: a */
    private final zzrv f20730a;

    /* renamed from: b */
    private final long f20731b;

    /* renamed from: c */
    private final zzrv f20732c;

    /* renamed from: d */
    private long f20733d;

    /* renamed from: e */
    private Uri f20734e;

    C7257v9(zzrv zzrvVar, int i2, zzrv zzrvVar2) {
        this.f20730a = zzrvVar;
        this.f20731b = i2;
        this.f20732c = zzrvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: I0 */
    public final Uri mo15548I0() {
        return this.f20734e;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: a */
    public final long mo15549a(zzry zzryVar) throws IOException {
        zzry zzryVar2;
        this.f20734e = zzryVar.f26947a;
        long j2 = zzryVar.f26950d;
        long j3 = this.f20731b;
        zzry zzryVar3 = null;
        if (j2 >= j3) {
            zzryVar2 = null;
        } else {
            long j4 = zzryVar.f26951e;
            zzryVar2 = new zzry(zzryVar.f26947a, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null);
        }
        long j5 = zzryVar.f26951e;
        if (j5 == -1 || zzryVar.f26950d + j5 > this.f20731b) {
            long jMax = Math.max(this.f20731b, zzryVar.f26950d);
            long j6 = zzryVar.f26951e;
            zzryVar3 = new zzry(zzryVar.f26947a, jMax, j6 != -1 ? Math.min(j6, (zzryVar.f26950d + j6) - this.f20731b) : -1L, null);
        }
        long jMo15549a = zzryVar2 != null ? this.f20730a.mo15549a(zzryVar2) : 0L;
        long jMo15549a2 = zzryVar3 != null ? this.f20732c.mo15549a(zzryVar3) : 0L;
        this.f20733d = zzryVar.f26950d;
        if (jMo15549a == -1 || jMo15549a2 == -1) {
            return -1L;
        }
        return jMo15549a + jMo15549a2;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void close() throws IOException {
        this.f20730a.close();
        this.f20732c.close();
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long j2 = this.f20733d;
        long j3 = this.f20731b;
        if (j2 < j3) {
            i4 = this.f20730a.read(bArr, i2, (int) Math.min(i3, j3 - j2));
            this.f20733d += i4;
        } else {
            i4 = 0;
        }
        if (this.f20733d < this.f20731b) {
            return i4;
        }
        int i5 = this.f20732c.read(bArr, i2 + i4, i3 - i4);
        int i6 = i4 + i5;
        this.f20733d += i5;
        return i6;
    }
}
