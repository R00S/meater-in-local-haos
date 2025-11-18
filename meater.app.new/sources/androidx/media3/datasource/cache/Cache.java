package androidx.media3.datasource.cache;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }

        public CacheException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface a {
        void a(Cache cache, b2.c cVar, b2.c cVar2);

        void e(Cache cache, b2.c cVar);

        void f(Cache cache, b2.c cVar);
    }

    File a(String str, long j10, long j11);

    void b(String str, b2.f fVar);

    b2.e c(String str);

    long d(String str, long j10, long j11);

    b2.c e(String str, long j10, long j11);

    long f(String str, long j10, long j11);

    b2.c g(String str, long j10, long j11);

    void h(b2.c cVar);

    void i(b2.c cVar);

    void j(File file, long j10);
}
