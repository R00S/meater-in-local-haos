package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzbh extends zzdsr {

    /* renamed from: q */
    private ByteBuffer f23019q;

    public zzbh(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdsr
    /* renamed from: e */
    public final void mo15239e(ByteBuffer byteBuffer) {
        this.f23019q = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
