package androidx.media3.exoplayer.drm;

import U1.C1738n;
import android.media.MediaDrmException;
import androidx.media3.exoplayer.drm.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DummyExoMediaDrm.java */
/* loaded from: classes.dex */
public final class k implements m {
    @Override // androidx.media3.exoplayer.drm.m
    public Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d b() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public c2.b d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] e() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean f(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void k(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.a l(byte[] bArr, List<C1738n.b> list, int i10, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public int n() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void c() {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void h(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void j(m.b bVar) {
    }
}
