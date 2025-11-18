package androidx.media3.exoplayer.drm;

import U1.v;
import X1.C1804a;
import X1.L;
import android.net.Uri;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import java.util.Map;
import m8.j0;

/* compiled from: DefaultDrmSessionManagerProvider.java */
/* loaded from: classes.dex */
public final class g implements i2.k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27118a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private v.f f27119b;

    /* renamed from: c, reason: collision with root package name */
    private i f27120c;

    /* renamed from: d, reason: collision with root package name */
    private a.InterfaceC0371a f27121d;

    /* renamed from: e, reason: collision with root package name */
    private String f27122e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f27123f;

    private i b(v.f fVar) {
        a.InterfaceC0371a interfaceC0371aC = this.f27121d;
        if (interfaceC0371aC == null) {
            interfaceC0371aC = new c.b().c(this.f27122e);
        }
        Uri uri = fVar.f17285c;
        o oVar = new o(uri == null ? null : uri.toString(), fVar.f17290h, interfaceC0371aC);
        j0<Map.Entry<String, String>> it = fVar.f17287e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            oVar.c(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager.b bVarE = new DefaultDrmSessionManager.b().f(fVar.f17283a, n.f27137d).c(fVar.f17288f).d(fVar.f17289g).e(p8.f.l(fVar.f17292j));
        androidx.media3.exoplayer.upstream.b bVar = this.f27123f;
        if (bVar != null) {
            bVarE.b(bVar);
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = bVarE.a(oVar);
        defaultDrmSessionManagerA.G(0, fVar.c());
        return defaultDrmSessionManagerA;
    }

    @Override // i2.k
    public i a(v vVar) {
        i iVar;
        C1804a.e(vVar.f17234b);
        v.f fVar = vVar.f17234b.f17328c;
        if (fVar == null) {
            return i.f27129a;
        }
        synchronized (this.f27118a) {
            try {
                if (!L.d(fVar, this.f27119b)) {
                    this.f27119b = fVar;
                    this.f27120c = b(fVar);
                }
                iVar = (i) C1804a.e(this.f27120c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }
}
