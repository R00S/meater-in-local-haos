package s6;

import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import m6.C3972g;
import m6.EnumC3966a;
import s6.o;

/* compiled from: ByteArrayLoader.java */
/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4482b<Data> implements o<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0698b<Data> f49292a;

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: s6.b$a */
    public static class a implements p<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: s6.b$a$a, reason: collision with other inner class name */
        class C0697a implements InterfaceC0698b<ByteBuffer> {
            C0697a() {
            }

            @Override // s6.C4482b.InterfaceC0698b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // s6.C4482b.InterfaceC0698b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // s6.p
        public o<byte[], ByteBuffer> c(s sVar) {
            return new C4482b(new C0697a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: s6.b$b, reason: collision with other inner class name */
    public interface InterfaceC0698b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: s6.b$d */
    public static class d implements p<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: s6.b$d$a */
        class a implements InterfaceC0698b<InputStream> {
            a() {
            }

            @Override // s6.C4482b.InterfaceC0698b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // s6.C4482b.InterfaceC0698b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // s6.p
        public o<byte[], InputStream> c(s sVar) {
            return new C4482b(new a());
        }
    }

    public C4482b(InterfaceC0698b<Data> interfaceC0698b) {
        this.f49292a = interfaceC0698b;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(byte[] bArr, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(bArr), new c(bArr, this.f49292a));
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: s6.b$c */
    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: B, reason: collision with root package name */
        private final byte[] f49294B;

        /* renamed from: C, reason: collision with root package name */
        private final InterfaceC0698b<Data> f49295C;

        c(byte[] bArr, InterfaceC0698b<Data> interfaceC0698b) {
            this.f49294B = bArr;
            this.f49295C = interfaceC0698b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f49295C.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return EnumC3966a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            aVar.f(this.f49295C.b(this.f49294B));
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
