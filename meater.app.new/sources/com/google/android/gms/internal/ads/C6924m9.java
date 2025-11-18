package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

@zzard
/* renamed from: com.google.android.gms.internal.ads.m9 */
/* loaded from: classes2.dex */
final class C6924m9 implements zzrv {

    /* renamed from: a */
    private static final Pattern f19886a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b */
    private static final AtomicReference<byte[]> f19887b = new AtomicReference<>();

    /* renamed from: d */
    private final int f19889d;

    /* renamed from: e */
    private final int f19890e;

    /* renamed from: f */
    private final String f19891f;

    /* renamed from: h */
    private final zzsj<? super C6924m9> f19893h;

    /* renamed from: i */
    private zzry f19894i;

    /* renamed from: j */
    private HttpURLConnection f19895j;

    /* renamed from: k */
    private InputStream f19896k;

    /* renamed from: l */
    private boolean f19897l;

    /* renamed from: m */
    private long f19898m;

    /* renamed from: n */
    private long f19899n;

    /* renamed from: o */
    private long f19900o;

    /* renamed from: p */
    private long f19901p;

    /* renamed from: q */
    private int f19902q;

    /* renamed from: c */
    private SSLSocketFactory f19888c = new C6961n9(this);

    /* renamed from: r */
    private Set<Socket> f19903r = new HashSet();

    /* renamed from: g */
    private final zzsd f19892g = new zzsd();

    C6924m9(String str, zzsj<? super C6924m9> zzsjVar, int i2, int i3, int i4) {
        this.f19891f = zzsk.m20479c(str);
        this.f19893h = zzsjVar;
        this.f19889d = i2;
        this.f19890e = i3;
        this.f19902q = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m15545e(Socket socket) {
        this.f19903r.add(socket);
    }

    /* renamed from: f */
    private static long m15546f(HttpURLConnection httpURLConnection) throws NumberFormatException {
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
                zzbad.m17351g(sb.toString());
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j2;
        }
        Matcher matcher = f19886a.matcher(headerField2);
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
            zzbad.m17353i(sb2.toString());
            return Math.max(j2, j3);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(headerField2);
            sb3.append("]");
            zzbad.m17351g(sb3.toString());
            return j2;
        }
    }

    /* renamed from: g */
    private final void m15547g() {
        HttpURLConnection httpURLConnection = this.f19895j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzbad.m17347c("Unexpected error while disconnecting", e2);
            }
            this.f19895j = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: I0 */
    public final Uri mo15548I0() {
        HttpURLConnection httpURLConnection = this.f19895j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        r23.f19895j = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
    
        r0 = r14.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
    
        if (r0 < 200) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0133, code lost:
    
        if (r0 <= 299) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0136, code lost:
    
        if (r0 != 200) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
    
        r3 = r24.f26950d;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
    
        if (r3 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0144, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
    
        r23.f19898m = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014c, code lost:
    
        if (r24.m20459a(1) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014e, code lost:
    
        r3 = r24.f26951e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
    
        if (r3 == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0156, code lost:
    
        r23.f19899n = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0159, code lost:
    
        r3 = m15546f(r23.f19895j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0161, code lost:
    
        if (r3 == (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0163, code lost:
    
        r4 = r3 - r23.f19898m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0169, code lost:
    
        r23.f19899n = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016c, code lost:
    
        r23.f19899n = r24.f26951e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0170, code lost:
    
        r23.f19896k = r23.f19895j.getInputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0178, code lost:
    
        r23.f19897l = true;
        r0 = r23.f19893h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017d, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        r0.mo17603n(r23, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
    
        return r23.f19899n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
    
        m15547g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018f, code lost:
    
        throw new com.google.android.gms.internal.ads.zzsb(r0, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0190, code lost:
    
        r3 = r23.f19895j.getHeaderFields();
        m15547g();
        r4 = new com.google.android.gms.internal.ads.zzsc(r0, r3, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a0, code lost:
    
        if (r0 != 416) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a2, code lost:
    
        r4.initCause(new com.google.android.gms.internal.ads.zzrx(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        m15547g();
        r5 = java.lang.String.valueOf(r24.f26947a.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c1, code lost:
    
        if (r5.length() != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:
    
        r3 = "Unable to connect to ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c8, code lost:
    
        r3 = new java.lang.String("Unable to connect to ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d2, code lost:
    
        throw new com.google.android.gms.internal.ads.zzsb(r3, r0, r24, 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104 A[Catch: IOException -> 0x0241, TryCatch #1 {IOException -> 0x0241, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:24:0x00cc, B:26:0x00d5, B:27:0x00dc, B:31:0x00e5, B:33:0x00ea, B:35:0x00f2, B:37:0x0107, B:51:0x0127, B:96:0x01d7, B:98:0x01e2, B:100:0x01f3, B:102:0x01fb, B:104:0x0209, B:106:0x0213, B:107:0x0216, B:105:0x020e, B:109:0x0220, B:110:0x0227, B:36:0x0104, B:19:0x0085, B:21:0x00a1, B:23:0x00c7, B:111:0x0228, B:112:0x0240), top: B:123:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzrv
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo15549a(com.google.android.gms.internal.ads.zzry r24) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6924m9.mo15549a(com.google.android.gms.internal.ads.zzry):long");
    }

    /* renamed from: b */
    final void m15550b(int i2) throws SocketException {
        this.f19902q = i2;
        for (Socket socket : this.f19903r) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f19902q);
                } catch (SocketException e2) {
                    zzbad.m17348d("Failed to update receive buffer size.", e2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: Exception -> 0x0065, all -> 0x008d, TryCatch #0 {Exception -> 0x0065, blocks: (B:14:0x001e, B:16:0x0026, B:21:0x0034, B:23:0x0044, B:25:0x004c), top: B:47:0x001e }] */
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
            java.io.InputStream r2 = r9.f19896k     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L75
            java.net.HttpURLConnection r2 = r9.f19895j     // Catch: java.lang.Throwable -> L8d
            long r3 = r9.f19899n     // Catch: java.lang.Throwable -> L8d
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.f19901p     // Catch: java.lang.Throwable -> L8d
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.zzsy.f27024a     // Catch: java.lang.Throwable -> L8d
            r8 = 19
            if (r7 == r8) goto L1e
            r8 = 20
            if (r7 != r8) goto L65
        L1e:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2e
            int r3 = r2.read()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            r4 = -1
            if (r3 != r4) goto L34
            goto L65
        L2e:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L65
        L34:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            if (r4 != 0) goto L4c
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            if (r3 == 0) goto L65
        L4c:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
        L65:
            java.io.InputStream r2 = r9.f19896k     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L8d
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L8d
            goto L75
        L6b:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzsb r3 = new com.google.android.gms.internal.ads.zzsb     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzry r4 = r9.f19894i     // Catch: java.lang.Throwable -> L8d
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L8d
            throw r3     // Catch: java.lang.Throwable -> L8d
        L75:
            r9.f19896k = r0
            r9.m15547g()
            boolean r0 = r9.f19897l
            if (r0 == 0) goto L87
            r9.f19897l = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.m9> r0 = r9.f19893h
            if (r0 == 0) goto L87
            r0.mo17593d(r9)
        L87:
            java.util.Set<java.net.Socket> r0 = r9.f19903r
            r0.clear()
            return
        L8d:
            r2 = move-exception
            r9.f19896k = r0
            r9.m15547g()
            boolean r0 = r9.f19897l
            if (r0 == 0) goto La0
            r9.f19897l = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.m9> r0 = r9.f19893h
            if (r0 == 0) goto La0
            r0.mo17593d(r9)
        La0:
            java.util.Set<java.net.Socket> r0 = r9.f19903r
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6924m9.close():void");
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            if (this.f19900o != this.f19898m) {
                byte[] andSet = f19887b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (true) {
                    long j2 = this.f19900o;
                    long j3 = this.f19898m;
                    if (j2 == j3) {
                        f19887b.set(andSet);
                        break;
                    }
                    int i4 = this.f19896k.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.f19900o += i4;
                    zzsj<? super C6924m9> zzsjVar = this.f19893h;
                    if (zzsjVar != null) {
                        zzsjVar.mo17604o(this, i4);
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.f19899n;
            if (j4 != -1) {
                long j5 = j4 - this.f19901p;
                if (j5 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j5);
            }
            int i5 = this.f19896k.read(bArr, i2, i3);
            if (i5 == -1) {
                if (this.f19899n == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f19901p += i5;
            zzsj<? super C6924m9> zzsjVar2 = this.f19893h;
            if (zzsjVar2 != null) {
                zzsjVar2.mo17604o(this, i5);
            }
            return i5;
        } catch (IOException e2) {
            throw new zzsb(e2, this.f19894i, 2);
        }
    }
}
