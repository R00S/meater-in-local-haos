package androidx.media3.datasource;

import X1.L;
import a2.AbstractC1884a;
import a2.g;
import a2.h;
import a2.i;
import android.net.Uri;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import l8.n;
import m8.AbstractC4003s;
import m8.AbstractC4010z;
import m8.d0;
import n8.C4072a;

/* compiled from: DefaultHttpDataSource.java */
/* loaded from: classes.dex */
public class c extends AbstractC1884a implements androidx.media3.datasource.a {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26173e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26174f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26175g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26176h;

    /* renamed from: i, reason: collision with root package name */
    private final String f26177i;

    /* renamed from: j, reason: collision with root package name */
    private final h f26178j;

    /* renamed from: k, reason: collision with root package name */
    private final h f26179k;

    /* renamed from: l, reason: collision with root package name */
    private final n<String> f26180l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f26181m;

    /* renamed from: n, reason: collision with root package name */
    private g f26182n;

    /* renamed from: o, reason: collision with root package name */
    private HttpURLConnection f26183o;

    /* renamed from: p, reason: collision with root package name */
    private InputStream f26184p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26185q;

    /* renamed from: r, reason: collision with root package name */
    private int f26186r;

    /* renamed from: s, reason: collision with root package name */
    private long f26187s;

    /* renamed from: t, reason: collision with root package name */
    private long f26188t;

    /* compiled from: DefaultHttpDataSource.java */
    public static final class b implements a.InterfaceC0371a {

        /* renamed from: b, reason: collision with root package name */
        private a2.n f26190b;

        /* renamed from: c, reason: collision with root package name */
        private n<String> f26191c;

        /* renamed from: d, reason: collision with root package name */
        private String f26192d;

        /* renamed from: g, reason: collision with root package name */
        private boolean f26195g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f26196h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f26197i;

        /* renamed from: a, reason: collision with root package name */
        private final h f26189a = new h();

        /* renamed from: e, reason: collision with root package name */
        private int f26193e = 8000;

        /* renamed from: f, reason: collision with root package name */
        private int f26194f = 8000;

        @Override // androidx.media3.datasource.a.InterfaceC0371a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            c cVar = new c(this.f26192d, this.f26193e, this.f26194f, this.f26195g, this.f26196h, this.f26189a, this.f26191c, this.f26197i);
            a2.n nVar = this.f26190b;
            if (nVar != null) {
                cVar.g(nVar);
            }
            return cVar;
        }

        public b c(String str) {
            this.f26192d = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultHttpDataSource.java */
    /* renamed from: androidx.media3.datasource.c$c, reason: collision with other inner class name */
    static class C0372c extends AbstractC4003s<String, List<String>> {

        /* renamed from: B, reason: collision with root package name */
        private final Map<String, List<String>> f26198B;

        public C0372c(Map<String, List<String>> map) {
            this.f26198B = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean A(Map.Entry entry) {
            return entry.getKey() != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean B(String str) {
            return str != null;
        }

        @Override // m8.AbstractC4003s, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return super.i(obj);
        }

        @Override // m8.AbstractC4003s, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return d0.b(super.entrySet(), new n() { // from class: androidx.media3.datasource.d
                @Override // l8.n
                public final boolean apply(Object obj) {
                    return c.C0372c.A((Map.Entry) obj);
                }
            });
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.j(obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m8.AbstractC4004t
        public Map<String, List<String>> h() {
            return this.f26198B;
        }

        @Override // java.util.Map
        public int hashCode() {
            return super.w();
        }

        @Override // m8.AbstractC4003s, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // m8.AbstractC4003s, java.util.Map
        public Set<String> keySet() {
            return d0.b(super.keySet(), new n() { // from class: androidx.media3.datasource.e
                @Override // l8.n
                public final boolean apply(Object obj) {
                    return c.C0372c.B((String) obj);
                }
            });
        }

        @Override // m8.AbstractC4003s, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // m8.AbstractC4003s, java.util.Map
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    private int A(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f26187s;
        if (j10 != -1) {
            long j11 = j10 - this.f26188t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) L.i(this.f26184p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f26188t += i12;
        q(i12);
        return i12;
    }

    private void B(long j10, g gVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) L.i(this.f26184p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), gVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new HttpDataSource$HttpDataSourceException(gVar, 2008, 1);
            }
            j10 -= i10;
            q(i10);
        }
    }

    private void u() {
        HttpURLConnection httpURLConnection = this.f26183o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                X1.n.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    private URL v(URL url, String str, g gVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", gVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, gVar, 2001, 1);
            }
            if (this.f26173e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f26174f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, gVar, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", gVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new HttpDataSource$HttpDataSourceException(e11, gVar, 2001, 1);
        }
    }

    private static boolean w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection x(g gVar) throws IOException {
        HttpURLConnection httpURLConnectionY;
        URL url = new URL(gVar.f19983a.toString());
        int i10 = gVar.f19985c;
        byte[] bArr = gVar.f19986d;
        long j10 = gVar.f19989g;
        long j11 = gVar.f19990h;
        boolean zD = gVar.d(1);
        if (!this.f26173e && !this.f26174f && !this.f26181m) {
            return y(url, i10, bArr, j10, j11, zD, true, gVar.f19987e);
        }
        int i11 = 0;
        URL urlV = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i13), gVar, 2001, 1);
            }
            long j12 = j10;
            long j13 = j10;
            int i14 = i12;
            URL url2 = urlV;
            long j14 = j11;
            httpURLConnectionY = y(urlV, i12, bArr2, j12, j11, zD, false, gVar.f19987e);
            int responseCode = httpURLConnectionY.getResponseCode();
            String headerField = httpURLConnectionY.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionY.disconnect();
                urlV = v(url2, headerField, gVar);
                i12 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionY.disconnect();
                if (this.f26181m && responseCode == 302) {
                    i12 = i14;
                } else {
                    bArr2 = null;
                    i12 = 1;
                }
                urlV = v(url2, headerField, gVar);
            }
            i11 = i13;
            j10 = j13;
            j11 = j14;
        }
        return httpURLConnectionY;
    }

    private HttpURLConnection y(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionZ = z(url);
        httpURLConnectionZ.setConnectTimeout(this.f26175g);
        httpURLConnectionZ.setReadTimeout(this.f26176h);
        HashMap map2 = new HashMap();
        h hVar = this.f26178j;
        if (hVar != null) {
            map2.putAll(hVar.a());
        }
        map2.putAll(this.f26179k.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionZ.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = i.a(j10, j11);
        if (strA != null) {
            httpURLConnectionZ.setRequestProperty("Range", strA);
        }
        String str = this.f26177i;
        if (str != null) {
            httpURLConnectionZ.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionZ.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionZ.setInstanceFollowRedirects(z11);
        httpURLConnectionZ.setDoOutput(bArr != null);
        httpURLConnectionZ.setRequestMethod(g.c(i10));
        if (bArr != null) {
            httpURLConnectionZ.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionZ.connect();
            OutputStream outputStream = httpURLConnectionZ.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionZ.connect();
        }
        return httpURLConnectionZ;
    }

    @Override // androidx.media3.datasource.a
    public long c(final g gVar) throws IOException, NumberFormatException {
        byte[] bArrB;
        this.f26182n = gVar;
        long j10 = 0;
        this.f26188t = 0L;
        this.f26187s = 0L;
        s(gVar);
        try {
            HttpURLConnection httpURLConnectionX = x(gVar);
            this.f26183o = httpURLConnectionX;
            this.f26186r = httpURLConnectionX.getResponseCode();
            String responseMessage = httpURLConnectionX.getResponseMessage();
            int i10 = this.f26186r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionX.getHeaderFields();
                if (this.f26186r == 416) {
                    if (gVar.f19989g == i.c(httpURLConnectionX.getHeaderField("Content-Range"))) {
                        this.f26185q = true;
                        t(gVar);
                        long j11 = gVar.f19990h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionX.getErrorStream();
                try {
                    bArrB = errorStream != null ? C4072a.b(errorStream) : L.f18631f;
                } catch (IOException unused) {
                    bArrB = L.f18631f;
                }
                byte[] bArr = bArrB;
                u();
                throw new HttpDataSource$InvalidResponseCodeException(this.f26186r, responseMessage, this.f26186r == 416 ? new DataSourceException(2008) : null, headerFields, gVar, bArr);
            }
            final String contentType = httpURLConnectionX.getContentType();
            n<String> nVar = this.f26180l;
            if (nVar != null && !nVar.apply(contentType)) {
                u();
                throw new HttpDataSource$HttpDataSourceException(contentType, gVar) { // from class: androidx.media3.datasource.HttpDataSource$InvalidContentTypeException

                    /* renamed from: E, reason: collision with root package name */
                    public final String f26139E;

                    {
                        super("Invalid content type: " + contentType, gVar, 2003, 1);
                        this.f26139E = contentType;
                    }
                };
            }
            if (this.f26186r == 200) {
                long j12 = gVar.f19989g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zW = w(httpURLConnectionX);
            if (zW) {
                this.f26187s = gVar.f19990h;
            } else {
                long j13 = gVar.f19990h;
                if (j13 != -1) {
                    this.f26187s = j13;
                } else {
                    long jB = i.b(httpURLConnectionX.getHeaderField("Content-Length"), httpURLConnectionX.getHeaderField("Content-Range"));
                    this.f26187s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f26184p = httpURLConnectionX.getInputStream();
                if (zW) {
                    this.f26184p = new GZIPInputStream(this.f26184p);
                }
                this.f26185q = true;
                t(gVar);
                try {
                    B(j10, gVar);
                    return this.f26187s;
                } catch (IOException e10) {
                    u();
                    if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e10, gVar, 2000, 1);
                }
            } catch (IOException e11) {
                u();
                throw new HttpDataSource$HttpDataSourceException(e11, gVar, 2000, 1);
            }
        } catch (IOException e12) {
            u();
            throw HttpDataSource$HttpDataSourceException.c(e12, gVar, 1);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        try {
            InputStream inputStream = this.f26184p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource$HttpDataSourceException(e10, (g) L.i(this.f26182n), 2000, 3);
                }
            }
        } finally {
            this.f26184p = null;
            u();
            if (this.f26185q) {
                this.f26185q = false;
                r();
            }
            this.f26183o = null;
            this.f26182n = null;
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        HttpURLConnection httpURLConnection = this.f26183o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        g gVar = this.f26182n;
        if (gVar != null) {
            return gVar.f19983a;
        }
        return null;
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) throws HttpDataSource$HttpDataSourceException {
        try {
            return A(bArr, i10, i11);
        } catch (IOException e10) {
            throw HttpDataSource$HttpDataSourceException.c(e10, (g) L.i(this.f26182n), 2);
        }
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> l() {
        HttpURLConnection httpURLConnection = this.f26183o;
        return httpURLConnection == null ? AbstractC4010z.l() : new C0372c(httpURLConnection.getHeaderFields());
    }

    HttpURLConnection z(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    private c(String str, int i10, int i11, boolean z10, boolean z11, h hVar, n<String> nVar, boolean z12) {
        super(true);
        this.f26177i = str;
        this.f26175g = i10;
        this.f26176h = i11;
        this.f26173e = z10;
        this.f26174f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f26178j = hVar;
        this.f26180l = nVar;
        this.f26179k = new h();
        this.f26181m = z12;
    }
}
