package androidx.media3.exoplayer.mediacodec;

import U1.s;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: MediaCodecAdapter.java */
/* loaded from: classes.dex */
public interface h {

    /* compiled from: MediaCodecAdapter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f27388a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f27389b;

        /* renamed from: c, reason: collision with root package name */
        public final s f27390c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f27391d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f27392e;

        /* renamed from: f, reason: collision with root package name */
        public final k2.h f27393f;

        private a(j jVar, MediaFormat mediaFormat, s sVar, Surface surface, MediaCrypto mediaCrypto, k2.h hVar) {
            this.f27388a = jVar;
            this.f27389b = mediaFormat;
            this.f27390c = sVar;
            this.f27391d = surface;
            this.f27392e = mediaCrypto;
            this.f27393f = hVar;
        }

        public static a a(j jVar, MediaFormat mediaFormat, s sVar, MediaCrypto mediaCrypto, k2.h hVar) {
            return new a(jVar, mediaFormat, sVar, null, mediaCrypto, hVar);
        }

        public static a b(j jVar, MediaFormat mediaFormat, s sVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(jVar, mediaFormat, sVar, surface, mediaCrypto, null);
        }
    }

    /* compiled from: MediaCodecAdapter.java */
    public interface b {
        h a(a aVar);
    }

    /* compiled from: MediaCodecAdapter.java */
    public interface d {
        void a(h hVar, long j10, long j11);
    }

    void a(int i10, int i11, c2.c cVar, long j10, int i12);

    void b(Bundle bundle);

    void c();

    void d(int i10, int i11, int i12, long j10, int i13);

    default boolean e(c cVar) {
        return false;
    }

    boolean f();

    void flush();

    void g(d dVar, Handler handler);

    MediaFormat h();

    void i();

    void j(int i10, long j10);

    int k();

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(int i10, boolean z10);

    void n(int i10);

    ByteBuffer o(int i10);

    void p(Surface surface);

    ByteBuffer q(int i10);

    /* compiled from: MediaCodecAdapter.java */
    public interface c {
        default void a() {
        }

        default void b() {
        }
    }
}
