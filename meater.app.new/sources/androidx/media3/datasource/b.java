package androidx.media3.datasource;

import X1.C1804a;
import X1.L;
import a2.C1886c;
import a2.g;
import a2.n;
import android.content.Context;
import android.net.Uri;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultDataSource.java */
/* loaded from: classes.dex */
public final class b implements androidx.media3.datasource.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26159a;

    /* renamed from: b, reason: collision with root package name */
    private final List<n> f26160b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final androidx.media3.datasource.a f26161c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.media3.datasource.a f26162d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.media3.datasource.a f26163e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.media3.datasource.a f26164f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.media3.datasource.a f26165g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.media3.datasource.a f26166h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.media3.datasource.a f26167i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.media3.datasource.a f26168j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.media3.datasource.a f26169k;

    /* compiled from: DefaultDataSource.java */
    public static final class a implements a.InterfaceC0371a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f26170a;

        /* renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0371a f26171b;

        /* renamed from: c, reason: collision with root package name */
        private n f26172c;

        public a(Context context) {
            this(context, new c.b());
        }

        @Override // androidx.media3.datasource.a.InterfaceC0371a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            b bVar = new b(this.f26170a, this.f26171b.a());
            n nVar = this.f26172c;
            if (nVar != null) {
                bVar.g(nVar);
            }
            return bVar;
        }

        public a(Context context, a.InterfaceC0371a interfaceC0371a) {
            this.f26170a = context.getApplicationContext();
            this.f26171b = (a.InterfaceC0371a) C1804a.e(interfaceC0371a);
        }
    }

    public b(Context context, androidx.media3.datasource.a aVar) {
        this.f26159a = context.getApplicationContext();
        this.f26161c = (androidx.media3.datasource.a) C1804a.e(aVar);
    }

    private void q(androidx.media3.datasource.a aVar) {
        for (int i10 = 0; i10 < this.f26160b.size(); i10++) {
            aVar.g(this.f26160b.get(i10));
        }
    }

    private androidx.media3.datasource.a r() {
        if (this.f26163e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f26159a);
            this.f26163e = assetDataSource;
            q(assetDataSource);
        }
        return this.f26163e;
    }

    private androidx.media3.datasource.a s() {
        if (this.f26164f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f26159a);
            this.f26164f = contentDataSource;
            q(contentDataSource);
        }
        return this.f26164f;
    }

    private androidx.media3.datasource.a t() {
        if (this.f26167i == null) {
            C1886c c1886c = new C1886c();
            this.f26167i = c1886c;
            q(c1886c);
        }
        return this.f26167i;
    }

    private androidx.media3.datasource.a u() {
        if (this.f26162d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f26162d = fileDataSource;
            q(fileDataSource);
        }
        return this.f26162d;
    }

    private androidx.media3.datasource.a v() {
        if (this.f26168j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f26159a);
            this.f26168j = rawResourceDataSource;
            q(rawResourceDataSource);
        }
        return this.f26168j;
    }

    private androidx.media3.datasource.a w() {
        if (this.f26165g == null) {
            try {
                androidx.media3.datasource.a aVar = (androidx.media3.datasource.a) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f26165g = aVar;
                q(aVar);
            } catch (ClassNotFoundException unused) {
                X1.n.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f26165g == null) {
                this.f26165g = this.f26161c;
            }
        }
        return this.f26165g;
    }

    private androidx.media3.datasource.a x() {
        if (this.f26166h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f26166h = udpDataSource;
            q(udpDataSource);
        }
        return this.f26166h;
    }

    private void y(androidx.media3.datasource.a aVar, n nVar) {
        if (aVar != null) {
            aVar.g(nVar);
        }
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) {
        C1804a.g(this.f26169k == null);
        String scheme = gVar.f19983a.getScheme();
        if (L.I0(gVar.f19983a)) {
            String path = gVar.f19983a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f26169k = u();
            } else {
                this.f26169k = r();
            }
        } else if ("asset".equals(scheme)) {
            this.f26169k = r();
        } else if ("content".equals(scheme)) {
            this.f26169k = s();
        } else if ("rtmp".equals(scheme)) {
            this.f26169k = w();
        } else if ("udp".equals(scheme)) {
            this.f26169k = x();
        } else if ("data".equals(scheme)) {
            this.f26169k = t();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f26169k = v();
        } else {
            this.f26169k = this.f26161c;
        }
        return this.f26169k.c(gVar);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        androidx.media3.datasource.a aVar = this.f26169k;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f26169k = null;
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        androidx.media3.datasource.a aVar = this.f26169k;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) {
        return ((androidx.media3.datasource.a) C1804a.e(this.f26169k)).e(bArr, i10, i11);
    }

    @Override // androidx.media3.datasource.a
    public void g(n nVar) {
        C1804a.e(nVar);
        this.f26161c.g(nVar);
        this.f26160b.add(nVar);
        y(this.f26162d, nVar);
        y(this.f26163e, nVar);
        y(this.f26164f, nVar);
        y(this.f26165g, nVar);
        y(this.f26166h, nVar);
        y(this.f26167i, nVar);
        y(this.f26168j, nVar);
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> l() {
        androidx.media3.datasource.a aVar = this.f26169k;
        return aVar == null ? Collections.emptyMap() : aVar.l();
    }
}
