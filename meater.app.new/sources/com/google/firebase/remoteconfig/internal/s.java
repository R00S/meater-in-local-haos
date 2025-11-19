package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.InterfaceC3810e;
import org.json.JSONObject;
import z7.AbstractC5208j;
import z7.C5211m;
import z7.InterfaceC5201c;

/* compiled from: ConfigRealtimeHttpClient.java */
/* loaded from: classes2.dex */
public class s {

    /* renamed from: q, reason: collision with root package name */
    static final int[] f38743q = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f38744r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    private final Set<E9.c> f38745a;

    /* renamed from: c, reason: collision with root package name */
    private int f38747c;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f38751g;

    /* renamed from: h, reason: collision with root package name */
    private final m f38752h;

    /* renamed from: i, reason: collision with root package name */
    private final com.google.firebase.f f38753i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3810e f38754j;

    /* renamed from: k, reason: collision with root package name */
    f f38755k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f38756l;

    /* renamed from: m, reason: collision with root package name */
    private final String f38757m;

    /* renamed from: p, reason: collision with root package name */
    private final t f38760p;

    /* renamed from: f, reason: collision with root package name */
    private final int f38750f = 8;

    /* renamed from: b, reason: collision with root package name */
    private boolean f38746b = false;

    /* renamed from: n, reason: collision with root package name */
    private final Random f38758n = new Random();

    /* renamed from: o, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f38759o = com.google.android.gms.common.util.h.d();

    /* renamed from: d, reason: collision with root package name */
    private boolean f38748d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f38749e = false;

    /* compiled from: ConfigRealtimeHttpClient.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.e();
        }
    }

    public s(com.google.firebase.f fVar, InterfaceC3810e interfaceC3810e, m mVar, f fVar2, Context context, String str, Set<E9.c> set, t tVar, ScheduledExecutorService scheduledExecutorService) {
        this.f38745a = set;
        this.f38751g = scheduledExecutorService;
        this.f38747c = Math.max(8 - tVar.i().b(), 1);
        this.f38753i = fVar;
        this.f38752h = mVar;
        this.f38754j = interfaceC3810e;
        this.f38755k = fVar2;
        this.f38756l = context;
        this.f38757m = str;
        this.f38760p = tVar;
    }

    private void D(Date date) {
        int iB = this.f38760p.i().b() + 1;
        this.f38760p.o(iB, new Date(date.getTime() + m(iB)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean f() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Set<E9.c> r0 = r1.f38745a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f38746b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f38748d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f38749e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.s.f():boolean");
    }

    private JSONObject i(String str) {
        HashMap map = new HashMap();
        map.put("project", k(this.f38753i.n().c()));
        map.put("namespace", this.f38757m);
        map.put("lastKnownVersionNumber", Long.toString(this.f38752h.r()));
        map.put("appId", this.f38753i.n().c());
        map.put("sdkVersion", "22.1.0");
        map.put("appInstanceId", str);
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        this.f38748d = true;
    }

    private static String k(String str) {
        Matcher matcher = f38744r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String l() {
        try {
            Context context = this.f38756l;
            byte[] bArrA = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return com.google.android.gms.common.util.j.b(bArrA, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f38756l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f38756l.getPackageName());
            return null;
        }
    }

    private long m(int i10) {
        int length = f38743q.length;
        if (i10 >= length) {
            i10 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i10 - 1]) / 2) + this.f38758n.nextInt((int) r0);
    }

    private String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", k(this.f38753i.n().c()), str);
    }

    private URL o() {
        try {
            return new URL(n(this.f38757m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean p(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [z7.j] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.remoteconfig.internal.s] */
    public /* synthetic */ AbstractC5208j q(AbstractC5208j abstractC5208j, AbstractC5208j abstractC5208j2) throws Throwable {
        Integer num;
        Throwable th;
        Integer numValueOf;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        int responseCode;
        boolean zP;
        boolean z10 = true;
        try {
            try {
            } catch (IOException e10) {
                e = e10;
                abstractC5208j = 0;
                numValueOf = null;
            } catch (Throwable th2) {
                num = null;
                th = th2;
                abstractC5208j = 0;
            }
            if (!abstractC5208j.o()) {
                throw new IOException(abstractC5208j.j());
            }
            y(true);
            abstractC5208j = (HttpURLConnection) abstractC5208j.k();
            try {
                responseCode = abstractC5208j.getResponseCode();
                numValueOf = Integer.valueOf(responseCode);
                if (responseCode == 200) {
                    try {
                        v();
                        this.f38760p.k();
                        B(abstractC5208j).i();
                    } catch (IOException e11) {
                        e = e11;
                        Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                        g(abstractC5208j);
                        y(false);
                        if (numValueOf != null && !p(numValueOf.intValue())) {
                            z10 = false;
                        }
                        if (z10) {
                            D(new Date(this.f38759o.a()));
                        }
                        if (!z10 && numValueOf.intValue() != 200) {
                            String strT = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                            if (numValueOf.intValue() == 403) {
                                strT = t(abstractC5208j.getErrorStream());
                            }
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(numValueOf.intValue(), strT, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
                            u(firebaseRemoteConfigServerException);
                            return C5211m.e(null);
                        }
                        w();
                        return C5211m.e(null);
                    }
                }
                g(abstractC5208j);
                y(false);
                zP = p(responseCode);
                if (zP) {
                    D(new Date(this.f38759o.a()));
                }
            } catch (IOException e12) {
                e = e12;
                numValueOf = null;
            } catch (Throwable th3) {
                num = null;
                th = th3;
                g(abstractC5208j);
                y(false);
                if (num != null && !p(num.intValue())) {
                    z10 = false;
                }
                if (z10) {
                    D(new Date(this.f38759o.a()));
                }
                if (z10 || num.intValue() == 200) {
                    w();
                } else {
                    String strT2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                    if (num.intValue() == 403) {
                        strT2 = t(abstractC5208j.getErrorStream());
                    }
                    u(new FirebaseRemoteConfigServerException(num.intValue(), strT2, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                }
                throw th;
            }
            if (!zP && responseCode != 200) {
                String strT3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", numValueOf);
                if (responseCode == 403) {
                    strT3 = t(abstractC5208j.getErrorStream());
                }
                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, strT3, FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR);
                u(firebaseRemoteConfigServerException);
                return C5211m.e(null);
            }
            w();
            return C5211m.e(null);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ AbstractC5208j r(AbstractC5208j abstractC5208j, AbstractC5208j abstractC5208j2, AbstractC5208j abstractC5208j3) {
        if (!abstractC5208j.o()) {
            return C5211m.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", abstractC5208j.j()));
        }
        if (!abstractC5208j2.o()) {
            return C5211m.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", abstractC5208j2.j()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
            A(httpURLConnection, (String) abstractC5208j2.k(), ((com.google.firebase.installations.f) abstractC5208j.k()).b());
            return C5211m.e(httpURLConnection);
        } catch (IOException e10) {
            return C5211m.d(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e10));
        }
    }

    private synchronized void s(long j10) {
        try {
            if (f()) {
                int i10 = this.f38747c;
                if (i10 > 0) {
                    this.f38747c = i10 - 1;
                    this.f38751g.schedule(new a(), j10, TimeUnit.MILLISECONDS);
                } else if (!this.f38749e) {
                    u(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private String t(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<E9.c> it = this.f38745a.iterator();
        while (it.hasNext()) {
            it.next().a(firebaseRemoteConfigException);
        }
    }

    private synchronized void v() {
        this.f38747c = 8;
    }

    private void x(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f38753i.n().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f38756l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", l());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void y(boolean z10) {
        this.f38746b = z10;
    }

    @SuppressLint({"VisibleForTests"})
    public void A(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        x(httpURLConnection, str2);
        byte[] bytes = i(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized com.google.firebase.remoteconfig.internal.b B(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.b(httpURLConnection, this.f38752h, this.f38755k, this.f38745a, new b(), this.f38751g);
    }

    public void C() {
        s(0L);
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void e() {
        if (f()) {
            if (new Date(this.f38759o.a()).before(this.f38760p.i().a())) {
                w();
            } else {
                final AbstractC5208j<HttpURLConnection> abstractC5208jH = h();
                C5211m.j(abstractC5208jH).h(this.f38751g, new InterfaceC5201c() { // from class: com.google.firebase.remoteconfig.internal.q
                    @Override // z7.InterfaceC5201c
                    public final Object a(AbstractC5208j abstractC5208j) {
                        return this.f38738a.q(abstractC5208jH, abstractC5208j);
                    }
                });
            }
        }
    }

    public void g(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public AbstractC5208j<HttpURLConnection> h() {
        final AbstractC5208j<com.google.firebase.installations.f> abstractC5208jA = this.f38754j.a(false);
        final AbstractC5208j<String> abstractC5208jC = this.f38754j.c();
        return C5211m.j(abstractC5208jA, abstractC5208jC).i(this.f38751g, new InterfaceC5201c() { // from class: com.google.firebase.remoteconfig.internal.r
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) {
                return this.f38740a.r(abstractC5208jA, abstractC5208jC, abstractC5208j);
            }
        });
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void w() {
        s(Math.max(0L, this.f38760p.i().a().getTime() - new Date(this.f38759o.a()).getTime()));
    }

    void z(boolean z10) {
        this.f38749e = z10;
    }

    /* compiled from: ConfigRealtimeHttpClient.java */
    class b implements E9.c {
        b() {
        }

        @Override // E9.c
        public void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            s.this.j();
            s.this.u(firebaseRemoteConfigException);
        }

        @Override // E9.c
        public void b(E9.b bVar) {
        }
    }
}
