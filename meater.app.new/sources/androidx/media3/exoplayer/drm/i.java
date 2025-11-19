package androidx.media3.exoplayer.drm;

import U1.s;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import e2.v1;

/* compiled from: DrmSessionManager.java */
/* loaded from: classes.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f27129a = new a();

    DrmSession a(h.a aVar, s sVar);

    default b b(h.a aVar, s sVar) {
        return b.f27130a;
    }

    int d(s sVar);

    void e(Looper looper, v1 v1Var);

    /* compiled from: DrmSessionManager.java */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27130a = new b() { // from class: i2.j
            @Override // androidx.media3.exoplayer.drm.i.b
            public final void c() {
                i.b.b();
            }
        };

        void c();

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void b() {
        }
    }

    default void c() {
    }

    default void i() {
    }

    /* compiled from: DrmSessionManager.java */
    class a implements i {
        a() {
        }

        @Override // androidx.media3.exoplayer.drm.i
        public DrmSession a(h.a aVar, s sVar) {
            if (sVar.f17166s == null) {
                return null;
            }
            return new l(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // androidx.media3.exoplayer.drm.i
        public int d(s sVar) {
            return sVar.f17166s != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.i
        public void e(Looper looper, v1 v1Var) {
        }
    }
}
