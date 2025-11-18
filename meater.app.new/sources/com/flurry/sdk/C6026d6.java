package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.zip.CRC32;

/* renamed from: com.flurry.sdk.d6 */
/* loaded from: classes2.dex */
public final class C6026d6 extends MessageDigest {

    /* renamed from: a */
    private CRC32 f15792a;

    public C6026d6() {
        super("CRC");
        this.f15792a = new CRC32();
    }

    /* renamed from: a */
    public final int m13046a() {
        return ByteBuffer.wrap(engineDigest()).getInt();
    }

    @Override // java.security.MessageDigestSpi
    protected final byte[] engineDigest() {
        long value = this.f15792a.getValue();
        return new byte[]{(byte) (((-16777216) & value) >> 24), (byte) ((16711680 & value) >> 16), (byte) ((65280 & value) >> 8), (byte) ((value & 255) >> 0)};
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineReset() {
        this.f15792a.reset();
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineUpdate(byte b2) {
        this.f15792a.update(b2);
    }

    @Override // java.security.MessageDigestSpi
    protected final void engineUpdate(byte[] bArr, int i2, int i3) {
        this.f15792a.update(bArr, i2, i3);
    }
}
