package androidx.media3.exoplayer.drm;

import U1.C1732h;
import X1.C1804a;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import java.util.Map;
import java.util.UUID;

/* compiled from: ErrorStateDrmSession.java */
/* loaded from: classes.dex */
public final class l implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    private final DrmSession.DrmSessionException f27131a;

    public l(DrmSession.DrmSessionException drmSessionException) {
        this.f27131a = (DrmSession.DrmSessionException) C1804a.e(drmSessionException);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID b() {
        return C1732h.f17047a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean c() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> d() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean g(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public DrmSession.DrmSessionException h() {
        return this.f27131a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public c2.b i() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void a(h.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void e(h.a aVar) {
    }
}
