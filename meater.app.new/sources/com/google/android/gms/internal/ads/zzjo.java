package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzjo implements zzjp {

    /* renamed from: a */
    private final byte[] f26368a;

    /* renamed from: b */
    private int f26369b;

    /* renamed from: c */
    private int f26370c;

    public zzjo(byte[] bArr) {
        zzkh.m20128c(bArr);
        zzkh.m20126a(bArr.length > 0);
        this.f26368a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    /* renamed from: a */
    public final long mo14852a(zzjq zzjqVar) throws IOException {
        long j2 = zzjqVar.f26373c;
        int i2 = (int) j2;
        this.f26369b = i2;
        long length = zzjqVar.f26374d;
        if (length == -1) {
            length = this.f26368a.length - j2;
        }
        int i3 = (int) length;
        this.f26370c = i3;
        if (i3 > 0 && i2 + i3 <= this.f26368a.length) {
            return i3;
        }
        int i4 = this.f26369b;
        long j3 = zzjqVar.f26374d;
        int length2 = this.f26368a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i4);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f26370c;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        System.arraycopy(this.f26368a, this.f26369b, bArr, i2, iMin);
        this.f26369b += iMin;
        this.f26370c -= iMin;
        return iMin;
    }
}
