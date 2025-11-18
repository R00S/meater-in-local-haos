package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes2.dex */
final class c50 extends PushbackInputStream {

    /* renamed from: f */
    private final /* synthetic */ z40 f18408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c50(z40 z40Var, InputStream inputStream, int i2) {
        super(inputStream, 1);
        this.f18408f = z40Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f18408f.f21367h.m20683a();
        super.close();
    }
}
