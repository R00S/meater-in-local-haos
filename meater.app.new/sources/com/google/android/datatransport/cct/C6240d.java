package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.google.android.datatransport.cct.C6240d;
import com.google.android.datatransport.cct.p177f.AbstractC6242a;
import com.google.android.datatransport.cct.p177f.AbstractC6251j;
import com.google.android.datatransport.cct.p177f.AbstractC6252k;
import com.google.android.datatransport.cct.p177f.AbstractC6253l;
import com.google.android.datatransport.cct.p177f.AbstractC6254m;
import com.google.android.datatransport.cct.p177f.AbstractC6255n;
import com.google.android.datatransport.cct.p177f.AbstractC6256o;
import com.google.android.datatransport.cct.p177f.EnumC6257p;
import com.google.android.datatransport.runtime.backends.AbstractC6263f;
import com.google.android.datatransport.runtime.backends.AbstractC6264g;
import com.google.android.datatransport.runtime.backends.InterfaceC6270m;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8325a;
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
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.p258i.AbstractC8867j;
import p241e.p254e.p256b.p257a.p258i.C8866i;
import p241e.p254e.p256b.p257a.p258i.p259a0.C8794b;
import p241e.p254e.p256b.p257a.p258i.p259a0.InterfaceC8793a;
import p241e.p254e.p256b.p257a.p258i.p259a0.InterfaceC8795c;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;
import p241e.p254e.p256b.p257a.p258i.p268z.C8891a;

/* compiled from: CctTransportBackend.java */
/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes2.dex */
final class C6240d implements InterfaceC6270m {

    /* renamed from: a */
    private final InterfaceC8325a f16587a;

    /* renamed from: b */
    private final ConnectivityManager f16588b;

    /* renamed from: c */
    private final Context f16589c;

    /* renamed from: d */
    final URL f16590d;

    /* renamed from: e */
    private final InterfaceC8854a f16591e;

    /* renamed from: f */
    private final InterfaceC8854a f16592f;

    /* renamed from: g */
    private final int f16593g;

    /* compiled from: CctTransportBackend.java */
    /* renamed from: com.google.android.datatransport.cct.d$a */
    static final class a {

        /* renamed from: a */
        final URL f16594a;

        /* renamed from: b */
        final AbstractC6251j f16595b;

        /* renamed from: c */
        final String f16596c;

        a(URL url, AbstractC6251j abstractC6251j, String str) {
            this.f16594a = url;
            this.f16595b = abstractC6251j;
            this.f16596c = str;
        }

        /* renamed from: a */
        a m13415a(URL url) {
            return new a(url, this.f16595b, this.f16596c);
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* renamed from: com.google.android.datatransport.cct.d$b */
    static final class b {

        /* renamed from: a */
        final int f16597a;

        /* renamed from: b */
        final URL f16598b;

        /* renamed from: c */
        final long f16599c;

        b(int i2, URL url, long j2) {
            this.f16597a = i2;
            this.f16598b = url;
            this.f16599c = j2;
        }
    }

    C6240d(Context context, InterfaceC8854a interfaceC8854a, InterfaceC8854a interfaceC8854a2, int i2) {
        this.f16587a = AbstractC6251j.m13494b();
        this.f16589c = context;
        this.f16588b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f16590d = m13412m(C6239c.f16579a);
        this.f16591e = interfaceC8854a2;
        this.f16592f = interfaceC8854a;
        this.f16593g = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public b m13402c(a aVar) throws IOException {
        C8891a.m28234f("CctTransportBackend", "Making request to: %s", aVar.f16594a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f16594a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f16593g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f16596c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f16587a.mo26074a(aVar.f16595b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C8891a.m28234f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    C8891a.m28230b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C8891a.m28230b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM13411l = m13411l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC6255n.m13503b(new BufferedReader(new InputStreamReader(inputStreamM13411l))).mo13487c());
                            if (inputStreamM13411l != null) {
                                inputStreamM13411l.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (inputStreamM13411l != null) {
                                try {
                                    inputStreamM13411l.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (EncodingException e2) {
            e = e2;
            C8891a.m28232d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e3) {
            e = e3;
            C8891a.m28232d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            C8891a.m28232d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            C8891a.m28232d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* renamed from: d */
    private static int m13403d(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC6256o.b.UNKNOWN_MOBILE_SUBTYPE.m13506k();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC6256o.b.COMBINED.m13506k();
        }
        if (AbstractC6256o.b.m13505g(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: e */
    private static int m13404e(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC6256o.c.NONE.m13508k() : networkInfo.getType();
    }

    /* renamed from: f */
    private static int m13405f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            C8891a.m28232d("CctTransportBackend", "Unable to find version code for package", e2);
            return -1;
        }
    }

    /* renamed from: g */
    private AbstractC6251j m13406g(AbstractC6263f abstractC6263f) {
        AbstractC6253l.a aVarM13498j;
        HashMap map = new HashMap();
        for (AbstractC8867j abstractC8867j : abstractC6263f.mo13509b()) {
            String strMo28100j = abstractC8867j.mo28100j();
            if (map.containsKey(strMo28100j)) {
                ((List) map.get(strMo28100j)).add(abstractC8867j);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC8867j);
                map.put(strMo28100j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            AbstractC8867j abstractC8867j2 = (AbstractC8867j) ((List) entry.getValue()).get(0);
            AbstractC6254m.a aVarMo13480b = AbstractC6254m.m13499a().mo13484f(EnumC6257p.DEFAULT).mo13485g(this.f16592f.mo28110a()).mo13486h(this.f16591e.mo28110a()).mo13480b(AbstractC6252k.m13495a().mo13456c(AbstractC6252k.b.ANDROID_FIREBASE).mo13455b(AbstractC6242a.m13417a().mo13442m(Integer.valueOf(abstractC8867j2.m28152g("sdk-version"))).mo13439j(abstractC8867j2.m28151b("model")).mo13435f(abstractC8867j2.m28151b("hardware")).mo13433d(abstractC8867j2.m28151b("device")).mo13441l(abstractC8867j2.m28151b("product")).mo13440k(abstractC8867j2.m28151b("os-uild")).mo13437h(abstractC8867j2.m28151b("manufacturer")).mo13434e(abstractC8867j2.m28151b("fingerprint")).mo13432c(abstractC8867j2.m28151b("country")).mo13436g(abstractC8867j2.m28151b("locale")).mo13438i(abstractC8867j2.m28151b("mcc_mnc")).mo13431b(abstractC8867j2.m28151b("application_build")).mo13430a()).mo13454a());
            try {
                aVarMo13480b.m13500i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarMo13480b.m13501j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC8867j abstractC8867j3 : (List) entry.getValue()) {
                C8866i c8866iMo28098e = abstractC8867j3.mo28098e();
                C8785b c8785bM28149b = c8866iMo28098e.m28149b();
                if (c8785bM28149b.equals(C8785b.m27945b("proto"))) {
                    aVarM13498j = AbstractC6253l.m13498j(c8866iMo28098e.m28148a());
                } else if (c8785bM28149b.equals(C8785b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON))) {
                    aVarM13498j = AbstractC6253l.m13497i(new String(c8866iMo28098e.m28148a(), Charset.forName("UTF-8")));
                } else {
                    C8891a.m28235g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c8785bM28149b);
                }
                aVarM13498j.mo13466c(abstractC8867j3.mo28099f()).mo13467d(abstractC8867j3.mo28101k()).mo13471h(abstractC8867j3.m28153h("tz-offset")).mo13468e(AbstractC6256o.m13504a().mo13492c(AbstractC6256o.c.m13507g(abstractC8867j3.m28152g("net-type"))).mo13491b(AbstractC6256o.b.m13505g(abstractC8867j3.m28152g("mobile-subtype"))).mo13490a());
                if (abstractC8867j3.mo28097d() != null) {
                    aVarM13498j.mo13465b(abstractC8867j3.mo28097d());
                }
                arrayList3.add(aVarM13498j.mo13464a());
            }
            aVarMo13480b.mo13481c(arrayList3);
            arrayList2.add(aVarMo13480b.mo13479a());
        }
        return AbstractC6251j.m13493a(arrayList2);
    }

    /* renamed from: h */
    private static TelephonyManager m13407h(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: i */
    static long m13408i() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* renamed from: k */
    static /* synthetic */ a m13410k(a aVar, b bVar) {
        URL url = bVar.f16598b;
        if (url == null) {
            return null;
        }
        C8891a.m28230b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m13415a(bVar.f16598b);
    }

    /* renamed from: l */
    private static InputStream m13411l(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: m */
    private static URL m13412m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6270m
    /* renamed from: a */
    public AbstractC6264g mo13413a(AbstractC6263f abstractC6263f) {
        AbstractC6251j abstractC6251jM13406g = m13406g(abstractC6263f);
        URL urlM13412m = this.f16590d;
        if (abstractC6263f.mo13510c() != null) {
            try {
                C6239c c6239cM13397c = C6239c.m13397c(abstractC6263f.mo13510c());
                strM13400d = c6239cM13397c.m13400d() != null ? c6239cM13397c.m13400d() : null;
                if (c6239cM13397c.m13401e() != null) {
                    urlM13412m = m13412m(c6239cM13397c.m13401e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC6264g.m13521a();
            }
        }
        try {
            b bVar = (b) C8794b.m27950a(5, new a(urlM13412m, abstractC6251jM13406g, strM13400d), new InterfaceC8793a() { // from class: com.google.android.datatransport.cct.b
                @Override // p241e.p254e.p256b.p257a.p258i.p259a0.InterfaceC8793a
                /* renamed from: a */
                public final Object mo13396a(Object obj) {
                    return this.f16578a.m13402c((C6240d.a) obj);
                }
            }, new InterfaceC8795c() { // from class: com.google.android.datatransport.cct.a
                @Override // p241e.p254e.p256b.p257a.p258i.p259a0.InterfaceC8795c
                /* renamed from: a */
                public final Object mo13395a(Object obj, Object obj2) {
                    return C6240d.m13410k((C6240d.a) obj, (C6240d.b) obj2);
                }
            });
            int i2 = bVar.f16597a;
            if (i2 == 200) {
                return AbstractC6264g.m13523e(bVar.f16599c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? AbstractC6264g.m13522d() : AbstractC6264g.m13521a();
            }
            return AbstractC6264g.m13524f();
        } catch (IOException e2) {
            C8891a.m28232d("CctTransportBackend", "Could not make request to the backend", e2);
            return AbstractC6264g.m13524f();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.InterfaceC6270m
    /* renamed from: b */
    public AbstractC8867j mo13414b(AbstractC8867j abstractC8867j) {
        NetworkInfo activeNetworkInfo = this.f16588b.getActiveNetworkInfo();
        return abstractC8867j.m28155l().m28156a("sdk-version", Build.VERSION.SDK_INT).m28158c("model", Build.MODEL).m28158c("hardware", Build.HARDWARE).m28158c("device", Build.DEVICE).m28158c("product", Build.PRODUCT).m28158c("os-uild", Build.ID).m28158c("manufacturer", Build.MANUFACTURER).m28158c("fingerprint", Build.FINGERPRINT).m28157b("tz-offset", m13408i()).m28156a("net-type", m13404e(activeNetworkInfo)).m28156a("mobile-subtype", m13403d(activeNetworkInfo)).m28158c("country", Locale.getDefault().getCountry()).m28158c("locale", Locale.getDefault().getLanguage()).m28158c("mcc_mnc", m13407h(this.f16589c).getSimOperator()).m28158c("application_build", Integer.toString(m13405f(this.f16589c))).mo28102d();
    }

    C6240d(Context context, InterfaceC8854a interfaceC8854a, InterfaceC8854a interfaceC8854a2) {
        this(context, interfaceC8854a, interfaceC8854a2, 130000);
    }
}
