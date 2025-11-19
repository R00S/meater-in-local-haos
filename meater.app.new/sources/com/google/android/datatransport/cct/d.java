package com.google.android.datatransport.cct;

import L6.n;
import L6.o;
import L6.p;
import L6.q;
import L6.r;
import L6.s;
import L6.t;
import L6.u;
import L6.v;
import L6.w;
import L6.x;
import M6.h;
import M6.i;
import N6.f;
import N6.g;
import N6.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import c9.InterfaceC2346a;
import com.apptionlabs.meater_app.data.Temperature;
import com.google.android.datatransport.cct.d;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes2.dex */
final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2346a f33396a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f33397b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f33398c;

    /* renamed from: d, reason: collision with root package name */
    final URL f33399d;

    /* renamed from: e, reason: collision with root package name */
    private final W6.a f33400e;

    /* renamed from: f, reason: collision with root package name */
    private final W6.a f33401f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33402g;

    /* compiled from: CctTransportBackend.java */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f33403a;

        /* renamed from: b, reason: collision with root package name */
        final n f33404b;

        /* renamed from: c, reason: collision with root package name */
        final String f33405c;

        a(URL url, n nVar, String str) {
            this.f33403a = url;
            this.f33404b = nVar;
            this.f33405c = str;
        }

        a a(URL url) {
            return new a(url, this.f33404b, this.f33405c);
        }
    }

    /* compiled from: CctTransportBackend.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f33406a;

        /* renamed from: b, reason: collision with root package name */
        final URL f33407b;

        /* renamed from: c, reason: collision with root package name */
        final long f33408c;

        b(int i10, URL url, long j10) {
            this.f33406a = i10;
            this.f33407b = url;
            this.f33408c = j10;
        }
    }

    d(Context context, W6.a aVar, W6.a aVar2, int i10) {
        this.f33396a = n.b();
        this.f33398c = context;
        this.f33397b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f33399d = o(com.google.android.datatransport.cct.a.f33387c);
        this.f33400e = aVar2;
        this.f33401f = aVar;
        this.f33402g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        Q6.a.e("CctTransportBackend", "Making request to: %s", aVar.f33403a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f33403a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f33402g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f33405c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f33396a.a(aVar.f33404b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Q6.a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    Q6.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    Q6.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamN = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamN))).c());
                            if (inputStreamN != null) {
                                inputStreamN.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e10) {
            e = e10;
            Q6.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            Q6.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            Q6.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE, null, 0L);
        } catch (IOException e13) {
            e = e13;
            Q6.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.j();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.j();
        }
        if (w.b.c(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.j() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Q6.a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private n j(f fVar) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strN = iVar.n();
            if (map.containsKey(strN)) {
                ((List) map.get(strN)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strN, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f33401f.a()).h(this.f33400e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(L6.a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                K6.c cVarB = hVarE.b();
                if (cVarB.equals(K6.c.b("proto"))) {
                    aVarL = t.l(hVarE.a());
                } else if (cVarB.equals(K6.c.b("json"))) {
                    aVarL = t.k(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    Q6.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", cVarB);
                }
                aVarL.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.c(iVar3.i("net-type"))).b(w.b.c(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarL.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a aVarA = q.a();
                    if (iVar3.g() != null) {
                        aVarA.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        aVarA.c(iVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.f33407b;
        if (url == null) {
            return null;
        }
        Q6.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f33407b);
    }

    private static InputStream n(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // N6.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f33397b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f33398c)).c("application_build", Integer.toString(i(this.f33398c))).d();
    }

    @Override // N6.m
    public g b(f fVar) {
        n nVarJ = j(fVar);
        URL urlO = this.f33399d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlO = o(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) R6.b.a(5, new a(urlO, nVarJ, strD), new R6.a() { // from class: com.google.android.datatransport.cct.b
                @Override // R6.a
                public final Object apply(Object obj) {
                    return this.f33395a.e((d.a) obj);
                }
            }, new R6.c() { // from class: com.google.android.datatransport.cct.c
                @Override // R6.c
                public final Object a(Object obj, Object obj2) {
                    return d.m((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f33406a;
            if (i10 == 200) {
                return g.e(bVar.f33408c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e10) {
            Q6.a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    d(Context context, W6.a aVar, W6.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
