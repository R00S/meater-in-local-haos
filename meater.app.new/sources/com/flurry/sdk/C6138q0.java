package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* renamed from: com.flurry.sdk.q0 */
/* loaded from: classes2.dex */
public final class C6138q0 {

    /* renamed from: a */
    String f16272a;

    /* renamed from: b */
    byte[] f16273b;

    /* renamed from: com.flurry.sdk.q0$a */
    static class a implements InterfaceC6204y1<C6138q0> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6204y1
        /* renamed from: a */
        public final InterfaceC6180v1<C6138q0> mo13122a(int i2) {
            return new b(i2);
        }
    }

    /* renamed from: com.flurry.sdk.q0$b */
    public static class b implements InterfaceC6180v1<C6138q0> {

        /* renamed from: a */
        private int f16274a;

        /* renamed from: com.flurry.sdk.q0$b$a */
        final class a extends DataOutputStream {
            a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.q0$b$b, reason: collision with other inner class name */
        final class C11472b extends DataInputStream {
            C11472b(InputStream inputStream) {
                super(inputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        public b(int i2) {
            this.f16274a = 1;
            this.f16274a = i2;
        }

        @Override // com.flurry.sdk.InterfaceC6180v1
        /* renamed from: a */
        public final /* synthetic */ void mo13095a(OutputStream outputStream, C6138q0 c6138q0) throws IOException {
            C6138q0 c6138q02 = c6138q0;
            if (outputStream == null || c6138q02 == null) {
                return;
            }
            a aVar = new a(outputStream);
            int length = c6138q02.f16273b.length;
            if (this.f16274a == 1) {
                aVar.writeShort(length);
            } else {
                aVar.writeInt(length);
            }
            aVar.write(c6138q02.f16273b);
            aVar.writeShort(0);
            aVar.flush();
        }

        @Override // com.flurry.sdk.InterfaceC6180v1
        /* renamed from: b */
        public final /* synthetic */ C6138q0 mo13096b(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            C11472b c11472b = new C11472b(inputStream);
            C6138q0 c6138q0 = new C6138q0((byte) 0);
            int i2 = this.f16274a == 1 ? c11472b.readShort() : c11472b.readInt();
            if (i2 == 0) {
                return null;
            }
            byte[] bArr = new byte[i2];
            c6138q0.f16273b = bArr;
            c11472b.readFully(bArr);
            c11472b.readUnsignedShort();
            return c6138q0;
        }
    }

    /* synthetic */ C6138q0(byte b2) {
        this();
    }

    /* renamed from: a */
    public static String m13264a(String str) {
        return ".yflurrydatasenderblock.".concat(String.valueOf(str));
    }

    /* renamed from: b */
    public static C6018c7<C6138q0> m13265b(String str) {
        return new C6018c7<>(C6002b0.m12964a().getFileStreamPath(m13264a(str)), ".yflurrydatasenderblock.", 2, new a());
    }

    private C6138q0() {
        this.f16272a = null;
        this.f16273b = null;
    }

    public C6138q0(byte[] bArr) {
        this.f16272a = null;
        this.f16273b = null;
        this.f16272a = UUID.randomUUID().toString();
        this.f16273b = bArr;
    }
}
