package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

@zzard
/* renamed from: com.google.android.gms.internal.ads.w9 */
/* loaded from: classes2.dex */
final class C7294w9 implements zzdsw {

    /* renamed from: f */
    private final ByteBuffer f20842f;

    C7294w9(ByteBuffer byteBuffer) {
        this.f20842f = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    /* renamed from: d1 */
    public final void mo15978d1(long j2) throws IOException {
        this.f20842f.position((int) j2);
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    /* renamed from: k0 */
    public final long mo15979k0() throws IOException {
        return this.f20842f.position();
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    /* renamed from: r */
    public final ByteBuffer mo15980r(long j2, long j3) throws IOException {
        int iPosition = this.f20842f.position();
        this.f20842f.position((int) j2);
        ByteBuffer byteBufferSlice = this.f20842f.slice();
        byteBufferSlice.limit((int) j3);
        this.f20842f.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f20842f.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.f20842f.remaining());
        byte[] bArr = new byte[iMin];
        this.f20842f.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final long size() throws IOException {
        return this.f20842f.limit();
    }
}
