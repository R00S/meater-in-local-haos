package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.z5 */
/* loaded from: classes2.dex */
final class C7401z5 extends ThreadLocal<ByteBuffer> {
    C7401z5(zzay zzayVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}
