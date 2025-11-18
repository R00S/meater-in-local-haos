package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface zzdsw extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    /* renamed from: d1 */
    void mo15978d1(long j2) throws IOException;

    /* renamed from: k0 */
    long mo15979k0() throws IOException;

    /* renamed from: r */
    ByteBuffer mo15980r(long j2, long j3) throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;
}
