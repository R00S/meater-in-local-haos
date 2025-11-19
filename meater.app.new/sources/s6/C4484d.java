package s6;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import m6.C3972g;
import m6.EnumC3966a;
import s6.o;

/* compiled from: ByteBufferFileLoader.java */
/* renamed from: s6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4484d implements o<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: s6.d$b */
    public static class b implements p<File, ByteBuffer> {
        @Override // s6.p
        public o<File, ByteBuffer> c(s sVar) {
            return new C4484d();
        }
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<ByteBuffer> b(File file, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(file), new a(file));
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* renamed from: s6.d$a */
    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: B, reason: collision with root package name */
        private final File f49297B;

        a(File file) {
            this.f49297B = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return EnumC3966a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(H6.a.a(this.f49297B));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
