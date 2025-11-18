package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@zzard
/* loaded from: classes2.dex */
public final class zzvf extends zzva {

    /* renamed from: c */
    private MessageDigest f27208c;

    @Override // com.google.android.gms.internal.ads.zzva
    /* renamed from: a */
    public final byte[] mo20649a(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = 4;
        if (strArrSplit.length == 1) {
            int iM20653a = zzve.m20653a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iM20653a);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (strArrSplit.length < 5) {
                bArr = new byte[strArrSplit.length << 1];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iM20653a2 = zzve.m20653a(strArrSplit[i2]);
                    int i3 = (iM20653a2 >> 16) ^ (65535 & iM20653a2);
                    byte[] bArr2 = {(byte) i3, (byte) (i3 >> 8)};
                    int i4 = i2 << 1;
                    bArr[i4] = bArr2[0];
                    bArr[i4 + 1] = bArr2[1];
                }
            } else {
                bArr = new byte[strArrSplit.length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iM20653a3 = zzve.m20653a(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iM20653a3 >> 24) ^ (((iM20653a3 & 255) ^ ((iM20653a3 >> 8) & 255)) ^ ((iM20653a3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f27208c = m20650b();
        synchronized (this.f27203b) {
            MessageDigest messageDigest = this.f27208c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f27208c.update(bArrArray);
            byte[] bArrDigest = this.f27208c.digest();
            if (bArrDigest.length <= 4) {
                length = bArrDigest.length;
            }
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr3, 0, length);
            return bArr3;
        }
    }
}
