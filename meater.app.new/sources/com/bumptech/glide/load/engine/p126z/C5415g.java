package com.bumptech.glide.load.engine.p126z;

/* compiled from: ByteArrayAdapter.java */
/* renamed from: com.bumptech.glide.load.engine.z.g */
/* loaded from: classes.dex */
public final class C5415g implements InterfaceC5409a<byte[]> {
    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5409a
    /* renamed from: a */
    public int mo10363a() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5409a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int mo10364b(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5409a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i2) {
        return new byte[i2];
    }

    @Override // com.bumptech.glide.load.engine.p126z.InterfaceC5409a
    public String getTag() {
        return "ByteArrayPool";
    }
}
