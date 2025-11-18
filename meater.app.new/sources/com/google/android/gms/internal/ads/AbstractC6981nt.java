package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.nt */
/* loaded from: classes2.dex */
abstract class AbstractC6981nt implements zzdbj {

    /* renamed from: a */
    private final AbstractC6944mt f20105a;

    /* renamed from: b */
    private final AbstractC6944mt f20106b;

    public AbstractC6981nt(byte[] bArr) throws InvalidKeyException {
        this.f20105a = mo15599b(bArr, 1);
        this.f20106b = mo15599b(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdbj
    /* renamed from: a */
    public byte[] mo15598a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (Integer.MAX_VALUE - this.f20105a.mo15515f()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + this.f20105a.mo15515f() + 16);
        if (byteBufferAllocate.remaining() < bArr.length + this.f20105a.mo15515f() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBufferAllocate.position();
        this.f20105a.m15564c(byteBufferAllocate, bArr);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[this.f20105a.mo15515f()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.f20106b.m15565h(bArr3, 0).get(bArr4);
        int length = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
        int iRemaining = byteBufferAllocate.remaining();
        int i2 = iRemaining % 16;
        int i3 = (i2 == 0 ? iRemaining : (iRemaining + 16) - i2) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr2);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBufferAllocate);
        byteBufferOrder.position(i3);
        byteBufferOrder.putLong(bArr2.length);
        byteBufferOrder.putLong(iRemaining);
        byte[] bArrM15750c = C7055pt.m15750c(bArr4, byteBufferOrder.array());
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrM15750c);
        return byteBufferAllocate.array();
    }

    /* renamed from: b */
    abstract AbstractC6944mt mo15599b(byte[] bArr, int i2) throws InvalidKeyException;
}
