package androidx.media3.exoplayer.drm;

import U1.C1732h;
import X1.C1804a;
import X1.L;
import a2.g;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.drm.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import m8.AbstractC4010z;

/* compiled from: HttpMediaDrmCallback.java */
/* loaded from: classes.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    private final a.InterfaceC0371a f27141a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27142b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27143c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f27144d;

    public o(String str, boolean z10, a.InterfaceC0371a interfaceC0371a) {
        C1804a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f27141a = interfaceC0371a;
        this.f27142b = str;
        this.f27143c = z10;
        this.f27144d = new HashMap();
    }

    @Override // androidx.media3.exoplayer.drm.p
    public byte[] a(UUID uuid, m.d dVar) {
        return j.a(this.f27141a.a(), dVar.b() + "&signedRequest=" + L.H(dVar.a()), null, Collections.emptyMap());
    }

    @Override // androidx.media3.exoplayer.drm.p
    public byte[] b(UUID uuid, m.a aVar) throws MediaDrmCallbackException {
        String strB = aVar.b();
        if (this.f27143c || TextUtils.isEmpty(strB)) {
            strB = this.f27142b;
        }
        if (TextUtils.isEmpty(strB)) {
            g.b bVar = new g.b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(bVar.i(uri).a(), uri, AbstractC4010z.l(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C1732h.f17051e;
        map.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C1732h.f17049c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f27144d) {
            map.putAll(this.f27144d);
        }
        return j.a(this.f27141a.a(), strB, aVar.a(), map);
    }

    public void c(String str, String str2) {
        C1804a.e(str);
        C1804a.e(str2);
        synchronized (this.f27144d) {
            this.f27144d.put(str, str2);
        }
    }
}
