package com.google.android.gms.internal.ads;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzjs implements zzkf {

    /* renamed from: a */
    private static final Pattern f26381a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference<byte[]> f26382b = new AtomicReference<>();

    /* renamed from: c */
    private final boolean f26383c;

    /* renamed from: d */
    private final int f26384d;

    /* renamed from: e */
    private final int f26385e;

    /* renamed from: f */
    private final String f26386f;

    /* renamed from: g */
    private final zzkn<String> f26387g;

    /* renamed from: h */
    private final HashMap<String, String> f26388h;

    /* renamed from: i */
    private final zzke f26389i;

    /* renamed from: j */
    private zzjq f26390j;

    /* renamed from: k */
    private HttpURLConnection f26391k;

    /* renamed from: l */
    private InputStream f26392l;

    /* renamed from: m */
    private boolean f26393m;

    /* renamed from: n */
    private long f26394n;

    /* renamed from: o */
    private long f26395o;

    /* renamed from: p */
    private long f26396p;

    /* renamed from: q */
    private long f26397q;

    public zzjs(String str, zzkn<String> zzknVar, zzke zzkeVar, int i2, int i3, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f26386f = str;
        this.f26387g = null;
        this.f26389i = null;
        this.f26388h = new HashMap<>();
        this.f26384d = i2;
        this.f26385e = i3;
        this.f26383c = z;
    }

    /* renamed from: b */
    private final void m20111b() {
        HttpURLConnection httpURLConnection = this.f26391k;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f26391k = null;
        }
    }

    /* renamed from: c */
    private final HttpURLConnection m20112c(URL url, long j2, long j3, boolean z) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f26384d);
        httpURLConnection.setReadTimeout(this.f26385e);
        httpURLConnection.setDoOutput(false);
        synchronized (this.f26388h) {
            for (Map.Entry<String, String> entry : this.f26388h.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (j2 != 0 || j3 != -1) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String string = sb.toString();
            if (j3 != -1) {
                String strValueOf = String.valueOf(string);
                long j4 = (j2 + j3) - 1;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
                sb2.append(strValueOf);
                sb2.append(j4);
                string = sb2.toString();
            }
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f26386f);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        return httpURLConnection;
    }

    /* renamed from: d */
    private static long m20113d(HttpURLConnection httpURLConnection) throws NumberFormatException {
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
                Log.e("HttpDataSource", sb.toString());
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j2;
        }
        Matcher matcher = f26381a.matcher(headerField2);
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
            Log.w("HttpDataSource", sb2.toString());
            return Math.max(j2, j3);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(headerField2);
            sb3.append("]");
            Log.e("HttpDataSource", sb3.toString());
            return j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    /* renamed from: a */
    public final long mo14852a(zzjq zzjqVar) throws IOException, NumberFormatException {
        HttpURLConnection httpURLConnectionM20112c;
        this.f26390j = zzjqVar;
        long j2 = 0;
        this.f26397q = 0L;
        this.f26396p = 0L;
        try {
            URL url = new URL(zzjqVar.f26371a.toString());
            long j3 = zzjqVar.f26373c;
            long j4 = zzjqVar.f26374d;
            boolean z = (zzjqVar.f26376f & 1) != 0;
            if (this.f26383c) {
                URL url2 = url;
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
                    HttpURLConnection httpURLConnectionM20112c2 = m20112c(url2, j3, j4, z);
                    httpURLConnectionM20112c2.setInstanceFollowRedirects(false);
                    httpURLConnectionM20112c2.connect();
                    int responseCode = httpURLConnectionM20112c2.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        httpURLConnectionM20112c = httpURLConnectionM20112c2;
                        break;
                    }
                    String headerField = httpURLConnectionM20112c2.getHeaderField("Location");
                    httpURLConnectionM20112c2.disconnect();
                    if (headerField == null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url4 = new URL(url3, headerField);
                    String protocol = url4.getProtocol();
                    if (!BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                        String strValueOf = String.valueOf(protocol);
                        throw new ProtocolException(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "));
                    }
                    url2 = url4;
                    i2 = i3;
                    j4 = j5;
                }
            } else {
                httpURLConnectionM20112c = m20112c(url, j3, j4, z);
                httpURLConnectionM20112c.connect();
            }
            this.f26391k = httpURLConnectionM20112c;
            try {
                int responseCode2 = httpURLConnectionM20112c.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map<String, List<String>> headerFields = this.f26391k.getHeaderFields();
                    m20111b();
                    throw new zzjy(responseCode2, headerFields, zzjqVar);
                }
                this.f26391k.getContentType();
                if (responseCode2 == 200) {
                    long j6 = zzjqVar.f26373c;
                    if (j6 != 0) {
                        j2 = j6;
                    }
                }
                this.f26394n = j2;
                if ((zzjqVar.f26376f & 1) == 0) {
                    long jM20113d = m20113d(this.f26391k);
                    long j7 = zzjqVar.f26374d;
                    if (j7 == -1) {
                        j7 = jM20113d != -1 ? jM20113d - this.f26394n : -1L;
                    }
                    this.f26395o = j7;
                } else {
                    this.f26395o = zzjqVar.f26374d;
                }
                try {
                    this.f26392l = this.f26391k.getInputStream();
                    this.f26393m = true;
                    zzke zzkeVar = this.f26389i;
                    if (zzkeVar != null) {
                        zzkeVar.m20121b();
                    }
                    return this.f26395o;
                } catch (IOException e2) {
                    m20111b();
                    throw new zzjx(e2, zzjqVar);
                }
            } catch (IOException e3) {
                m20111b();
                String strValueOf2 = String.valueOf(zzjqVar.f26371a.toString());
                throw new zzjx(strValueOf2.length() != 0 ? "Unable to connect to ".concat(strValueOf2) : new String("Unable to connect to "), e3, zzjqVar);
            }
        } catch (IOException e4) {
            String strValueOf3 = String.valueOf(zzjqVar.f26371a.toString());
            throw new zzjx(strValueOf3.length() != 0 ? "Unable to connect to ".concat(strValueOf3) : new String("Unable to connect to "), e4, zzjqVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[Catch: IOException | Exception -> 0x0064, all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0013, B:26:0x0064, B:28:0x006a, B:30:0x006e, B:31:0x0075, B:14:0x001d, B:16:0x0025, B:21:0x0033, B:23:0x0043, B:25:0x004b, B:8:0x0010), top: B:48:0x0001, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.zzjp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws com.google.android.gms.internal.ads.zzjx {
        /*
            r8 = this;
            r0 = 0
            java.io.InputStream r1 = r8.f26392l     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L76
            java.net.HttpURLConnection r1 = r8.f26391k     // Catch: java.lang.Throwable -> L87
            long r2 = r8.f26395o     // Catch: java.lang.Throwable -> L87
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L13
        L10:
            long r6 = r8.f26397q     // Catch: java.lang.Throwable -> L87
            long r2 = r2 - r6
        L13:
            int r6 = com.google.android.gms.internal.ads.zzkq.f26428a     // Catch: java.lang.Throwable -> L87
            r7 = 19
            if (r6 == r7) goto L1d
            r7 = 20
            if (r6 != r7) goto L64
        L1d:
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2d
            int r2 = r1.read()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            r3 = -1
            if (r2 != r3) goto L33
            goto L64
        L2d:
            r4 = 2048(0x800, double:1.0118E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L64
        L33:
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            if (r3 != 0) goto L4b
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            if (r2 == 0) goto L64
        L4b:
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.String r3 = "unexpectedEndOfInput"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
        L64:
            java.io.InputStream r1 = r8.f26392l     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L87
            r1.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L87
            r1 = 0
            r8.f26392l = r1     // Catch: java.lang.Throwable -> L87
            goto L76
        L6d:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzjx r2 = new com.google.android.gms.internal.ads.zzjx     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzjq r3 = r8.f26390j     // Catch: java.lang.Throwable -> L87
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L87
            throw r2     // Catch: java.lang.Throwable -> L87
        L76:
            boolean r1 = r8.f26393m
            if (r1 == 0) goto L86
            r8.f26393m = r0
            com.google.android.gms.internal.ads.zzke r0 = r8.f26389i
            if (r0 == 0) goto L83
            r0.m20122c()
        L83:
            r8.m20111b()
        L86:
            return
        L87:
            r1 = move-exception
            boolean r2 = r8.f26393m
            if (r2 == 0) goto L98
            r8.f26393m = r0
            com.google.android.gms.internal.ads.zzke r0 = r8.f26389i
            if (r0 == 0) goto L95
            r0.m20122c()
        L95:
            r8.m20111b()
        L98:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjs.close():void");
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            if (this.f26396p != this.f26394n) {
                byte[] andSet = f26382b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (true) {
                    long j2 = this.f26396p;
                    long j3 = this.f26394n;
                    if (j2 == j3) {
                        f26382b.set(andSet);
                        break;
                    }
                    int i4 = this.f26392l.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.f26396p += i4;
                    zzke zzkeVar = this.f26389i;
                    if (zzkeVar != null) {
                        zzkeVar.m20120a(i4);
                    }
                }
            }
            long j4 = this.f26395o;
            if (j4 != -1) {
                i3 = (int) Math.min(i3, j4 - this.f26397q);
            }
            if (i3 == 0) {
                return -1;
            }
            int i5 = this.f26392l.read(bArr, i2, i3);
            if (i5 == -1) {
                long j5 = this.f26395o;
                if (j5 != -1 && j5 != this.f26397q) {
                    throw new EOFException();
                }
                return -1;
            }
            this.f26397q += i5;
            zzke zzkeVar2 = this.f26389i;
            if (zzkeVar2 != null) {
                zzkeVar2.m20120a(i5);
            }
            return i5;
        } catch (IOException e2) {
            throw new zzjx(e2, this.f26390j);
        }
    }
}
