package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.s0 */
/* loaded from: classes2.dex */
public final class C6155s0 {

    /* renamed from: a */
    String f16315a;

    /* renamed from: com.flurry.sdk.s0$a */
    public static class a implements InterfaceC6180v1<C6155s0> {

        /* renamed from: com.flurry.sdk.s0$a$a, reason: collision with other inner class name */
        final class C11474a extends DataOutputStream {
            C11474a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.s0$a$b */
        final class b extends DataInputStream {
            b(InputStream inputStream) {
                super(inputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        @Override // com.flurry.sdk.InterfaceC6180v1
        /* renamed from: a */
        public final /* synthetic */ void mo13095a(OutputStream outputStream, C6155s0 c6155s0) throws IOException {
            C6155s0 c6155s02 = c6155s0;
            if (outputStream == null || c6155s02 == null) {
                return;
            }
            C11474a c11474a = new C11474a(outputStream);
            c11474a.writeUTF(c6155s02.f16315a);
            c11474a.flush();
        }

        @Override // com.flurry.sdk.InterfaceC6180v1
        /* renamed from: b */
        public final /* synthetic */ C6155s0 mo13096b(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            b bVar = new b(inputStream);
            C6155s0 c6155s0 = new C6155s0((byte) 0);
            c6155s0.f16315a = bVar.readUTF();
            return c6155s0;
        }
    }

    /* synthetic */ C6155s0(byte b2) {
        this();
    }

    private C6155s0() {
    }

    public C6155s0(String str) {
        this.f16315a = str;
    }
}
