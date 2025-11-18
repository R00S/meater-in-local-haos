package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzru implements zzrv {

    /* renamed from: a */
    private final byte[] f26942a;

    /* renamed from: b */
    private Uri f26943b;

    /* renamed from: c */
    private int f26944c;

    /* renamed from: d */
    private int f26945d;

    public zzru(byte[] bArr) {
        zzsk.m20480d(bArr);
        zzsk.m20477a(bArr.length > 0);
        this.f26942a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: I0 */
    public final Uri mo15548I0() {
        return this.f26943b;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: a */
    public final long mo15549a(zzry zzryVar) throws IOException {
        this.f26943b = zzryVar.f26947a;
        long j2 = zzryVar.f26950d;
        int i2 = (int) j2;
        this.f26944c = i2;
        long length = zzryVar.f26951e;
        if (length == -1) {
            length = this.f26942a.length - j2;
        }
        int i3 = (int) length;
        this.f26945d = i3;
        if (i3 > 0 && i2 + i3 <= this.f26942a.length) {
            return i3;
        }
        int i4 = this.f26944c;
        long j3 = zzryVar.f26951e;
        int length2 = this.f26942a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i4);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final void close() throws IOException {
        this.f26943b = null;
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f26945d;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        System.arraycopy(this.f26942a, this.f26944c, bArr, i2, iMin);
        this.f26944c += iMin;
        this.f26945d -= iMin;
        return iMin;
    }
}
