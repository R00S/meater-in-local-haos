package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzsa implements zzrv {

    /* renamed from: a */
    private static final Pattern f26962a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference<byte[]> f26963b = new AtomicReference<>();

    /* renamed from: d */
    private final int f26965d;

    /* renamed from: e */
    private final int f26966e;

    /* renamed from: f */
    private final String f26967f;

    /* renamed from: j */
    private final zzsj<? super zzsa> f26971j;

    /* renamed from: k */
    private zzry f26972k;

    /* renamed from: l */
    private HttpURLConnection f26973l;

    /* renamed from: m */
    private InputStream f26974m;

    /* renamed from: n */
    private boolean f26975n;

    /* renamed from: o */
    private long f26976o;

    /* renamed from: p */
    private long f26977p;

    /* renamed from: q */
    private long f26978q;

    /* renamed from: r */
    private long f26979r;

    /* renamed from: g */
    private final zzsv<String> f26968g = null;

    /* renamed from: i */
    private final zzsd f26970i = new zzsd();

    /* renamed from: c */
    private final boolean f26964c = true;

    /* renamed from: h */
    private final zzsd f26969h = null;

    public zzsa(String str, zzsv<String> zzsvVar, zzsj<? super zzsa> zzsjVar, int i2, int i3, boolean z, zzsd zzsdVar) {
        this.f26967f = zzsk.m20479c(str);
        this.f26971j = zzsjVar;
        this.f26965d = i2;
        this.f26966e = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection m20463c(java.net.URL r6, byte[] r7, long r8, long r10, boolean r12, boolean r13) throws java.io.IOException {
        /*
            r5 = this;
            java.net.URLConnection r6 = r6.openConnection()
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6
            int r0 = r5.f26965d
            r6.setConnectTimeout(r0)
            int r0 = r5.f26966e
            r6.setReadTimeout(r0)
            com.google.android.gms.internal.ads.zzsd r0 = r5.f26970i
            java.util.Map r0 = r0.m20467a()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r6.setRequestProperty(r2, r1)
            goto L1e
        L3a:
            r0 = 0
            r2 = -1
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 != 0) goto L46
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L84
        L46:
            r0 = 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "bytes="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 == 0) goto L7f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            long r8 = r8 + r10
            r10 = 1
            long r8 = r8 - r10
            int r10 = r0.length()
            int r10 = r10 + 20
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            r11.append(r0)
            r11.append(r8)
            java.lang.String r0 = r11.toString()
        L7f:
            java.lang.String r8 = "Range"
            r6.setRequestProperty(r8, r0)
        L84:
            java.lang.String r8 = r5.f26967f
            java.lang.String r9 = "User-Agent"
            r6.setRequestProperty(r9, r8)
            if (r12 != 0) goto L94
            java.lang.String r8 = "Accept-Encoding"
            java.lang.String r9 = "identity"
            r6.setRequestProperty(r8, r9)
        L94:
            r6.setInstanceFollowRedirects(r13)
            if (r7 == 0) goto L9b
            r8 = 1
            goto L9c
        L9b:
            r8 = 0
        L9c:
            r6.setDoOutput(r8)
            if (r7 == 0) goto Lbb
            java.lang.String r8 = "POST"
            r6.setRequestMethod(r8)
            int r8 = r7.length
            if (r8 == 0) goto Lbb
            int r8 = r7.length
            r6.setFixedLengthStreamingMode(r8)
            r6.connect()
            java.io.OutputStream r8 = r6.getOutputStream()
            r8.write(r7)
            r8.close()
            goto Lbe
        Lbb:
            r6.connect()
        Lbe:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.m20463c(java.net.URL, byte[], long, long, boolean, boolean):java.net.HttpURLConnection");
    }

    /* renamed from: d */
    private static long m20464d(HttpURLConnection httpURLConnection) throws NumberFormatException {
        long j2;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j2 = -1;
        } else {
            try {
                j2 = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(headerField).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(headerField);
                sb.append("]");
                Log.e("DefaultHttpDataSource", sb.toString());
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j2;
        }
        Matcher matcher = f26962a.matcher(headerField2);
        if (!matcher.find()) {
            return j2;
        }
        try {
            long j3 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j2 < 0) {
                return j3;
            }
            if (j2 == j3) {
                return j2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
            sb2.append("Inconsistent headers [");
            sb2.append(headerField);
            sb2.append("] [");
            sb2.append(headerField2);
            sb2.append("]");
            Log.w("DefaultHttpDataSource", sb2.toString());
            return Math.max(j2, j3);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(headerField2);
            sb3.append("]");
            Log.e("DefaultHttpDataSource", sb3.toString());
            return j2;
        }
    }

    /* renamed from: e */
    private final void m20465e() {
        HttpURLConnection httpURLConnection = this.f26973l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f26973l = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: I0 */
    public final Uri mo15548I0() {
        HttpURLConnection httpURLConnection = this.f26973l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: a */
    public final long mo15549a(zzry zzryVar) throws IOException, NumberFormatException {
        HttpURLConnection httpURLConnectionM20463c;
        HttpURLConnection httpURLConnectionM20463c2;
        this.f26972k = zzryVar;
        long j2 = 0;
        this.f26979r = 0L;
        this.f26978q = 0L;
        try {
            URL url = new URL(zzryVar.f26947a.toString());
            byte[] bArr = zzryVar.f26948b;
            long j3 = zzryVar.f26950d;
            long j4 = zzryVar.f26951e;
            boolean zM20459a = zzryVar.m20459a(1);
            if (this.f26964c) {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 > 20) {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i3);
                        throw new NoRouteToHostException(sb.toString());
                    }
                    URL url3 = url2;
                    long j5 = j4;
                    long j6 = j3;
                    httpURLConnectionM20463c = m20463c(url2, bArr2, j3, j4, zM20459a, false);
                    int responseCode = httpURLConnectionM20463c.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && (bArr2 != null || (responseCode != 307 && responseCode != 308))) {
                        break;
                    }
                    bArr2 = null;
                    String headerField = httpURLConnectionM20463c.getHeaderField("Location");
                    httpURLConnectionM20463c.disconnect();
                    if (headerField == null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    url2 = new URL(url3, headerField);
                    String protocol = url2.getProtocol();
                    if (!BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                        String strValueOf = String.valueOf(protocol);
                        throw new ProtocolException(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "));
                    }
                    i2 = i3;
                    j4 = j5;
                    j3 = j6;
                }
                httpURLConnectionM20463c2 = httpURLConnectionM20463c;
            } else {
                httpURLConnectionM20463c2 = m20463c(url, bArr, j3, j4, zM20459a, true);
            }
            this.f26973l = httpURLConnectionM20463c2;
            try {
                int responseCode2 = httpURLConnectionM20463c2.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map<String, List<String>> headerFields = this.f26973l.getHeaderFields();
                    m20465e();
                    zzsc zzscVar = new zzsc(responseCode2, headerFields, zzryVar);
                    if (responseCode2 != 416) {
                        throw zzscVar;
                    }
                    zzscVar.initCause(new zzrx(0));
                    throw zzscVar;
                }
                this.f26973l.getContentType();
                if (responseCode2 == 200) {
                    long j7 = zzryVar.f26950d;
                    if (j7 != 0) {
                        j2 = j7;
                    }
                }
                this.f26976o = j2;
                if (zzryVar.m20459a(1)) {
                    this.f26977p = zzryVar.f26951e;
                } else {
                    long j8 = zzryVar.f26951e;
                    if (j8 != -1) {
                        this.f26977p = j8;
                    } else {
                        long jM20464d = m20464d(this.f26973l);
                        this.f26977p = jM20464d != -1 ? jM20464d - this.f26976o : -1L;
                    }
                }
                try {
                    this.f26974m = this.f26973l.getInputStream();
                    this.f26975n = true;
                    zzsj<? super zzsa> zzsjVar = this.f26971j;
                    if (zzsjVar != null) {
                        zzsjVar.mo17603n(this, zzryVar);
                    }
                    return this.f26977p;
                } catch (IOException e2) {
                    m20465e();
                    throw new zzsb(e2, zzryVar, 1);
                }
            } catch (IOException e3) {
                m20465e();
                String strValueOf2 = String.valueOf(zzryVar.f26947a.toString());
                throw new zzsb(strValueOf2.length() != 0 ? "Unable to connect to ".concat(strValueOf2) : new String("Unable to connect to "), e3, zzryVar, 1);
            }
        } catch (IOException e4) {
            String strValueOf3 = String.valueOf(zzryVar.f26947a.toString());
            throw new zzsb(strValueOf3.length() != 0 ? "Unable to connect to ".concat(strValueOf3) : new String("Unable to connect to "), e4, zzryVar, 1);
        }
    }

    /* renamed from: b */
    public final Map<String, List<String>> m20466b() {
        HttpURLConnection httpURLConnection = this.f26973l;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: Exception -> 0x0065, all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0014, B:26:0x0065, B:29:0x006c, B:30:0x0074, B:14:0x001e, B:16:0x0026, B:21:0x0034, B:23:0x0044, B:25:0x004c, B:8:0x0011), top: B:45:0x0002, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.zzrv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws com.google.android.gms.internal.ads.zzsb {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f26974m     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L75
            java.net.HttpURLConnection r2 = r9.f26973l     // Catch: java.lang.Throwable -> L88
            long r3 = r9.f26977p     // Catch: java.lang.Throwable -> L88
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.f26979r     // Catch: java.lang.Throwable -> L88
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.zzsy.f27024a     // Catch: java.lang.Throwable -> L88
            r8 = 19
            if (r7 == r8) goto L1e
            r8 = 20
            if (r7 != r8) goto L65
        L1e:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2e
            int r3 = r2.read()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r4 = -1
            if (r3 != r4) goto L34
            goto L65
        L2e:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L65
        L34:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            if (r4 != 0) goto L4c
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            if (r3 == 0) goto L65
        L4c:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
        L65:
            java.io.InputStream r2 = r9.f26974m     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L88
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L88
            goto L75
        L6b:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzsb r3 = new com.google.android.gms.internal.ads.zzsb     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzry r4 = r9.f26972k     // Catch: java.lang.Throwable -> L88
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L88
            throw r3     // Catch: java.lang.Throwable -> L88
        L75:
            r9.f26974m = r0
            r9.m20465e()
            boolean r0 = r9.f26975n
            if (r0 == 0) goto L87
            r9.f26975n = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.zzsa> r0 = r9.f26971j
            if (r0 == 0) goto L87
            r0.mo17593d(r9)
        L87:
            return
        L88:
            r2 = move-exception
            r9.f26974m = r0
            r9.m20465e()
            boolean r0 = r9.f26975n
            if (r0 == 0) goto L9b
            r9.f26975n = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.zzsa> r0 = r9.f26971j
            if (r0 == 0) goto L9b
            r0.mo17593d(r9)
        L9b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.close():void");
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            if (this.f26978q != this.f26976o) {
                byte[] andSet = f26963b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (true) {
                    long j2 = this.f26978q;
                    long j3 = this.f26976o;
                    if (j2 == j3) {
                        f26963b.set(andSet);
                        break;
                    }
                    int i4 = this.f26974m.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.f26978q += i4;
                    zzsj<? super zzsa> zzsjVar = this.f26971j;
                    if (zzsjVar != null) {
                        zzsjVar.mo17604o(this, i4);
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.f26977p;
            if (j4 != -1) {
                long j5 = j4 - this.f26979r;
                if (j5 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j5);
            }
            int i5 = this.f26974m.read(bArr, i2, i3);
            if (i5 == -1) {
                if (this.f26977p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f26979r += i5;
            zzsj<? super zzsa> zzsjVar2 = this.f26971j;
            if (zzsjVar2 != null) {
                zzsjVar2.mo17604o(this, i5);
            }
            return i5;
        } catch (IOException e2) {
            throw new zzsb(e2, this.f26972k, 2);
        }
    }
}
