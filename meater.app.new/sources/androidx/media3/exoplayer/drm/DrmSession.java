package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.h;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* renamed from: B, reason: collision with root package name */
        public final int f27106B;

        public DrmSessionException(Throwable th, int i10) {
            super(th);
            this.f27106B = i10;
        }
    }

    static void f(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.a(null);
        }
        if (drmSession != null) {
            drmSession.e(null);
        }
    }

    void a(h.a aVar);

    UUID b();

    default boolean c() {
        return false;
    }

    Map<String, String> d();

    void e(h.a aVar);

    boolean g(String str);

    int getState();

    DrmSessionException h();

    c2.b i();
}
