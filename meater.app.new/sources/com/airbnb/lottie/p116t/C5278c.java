package com.airbnb.lottie.p116t;

import android.content.Context;
import com.airbnb.lottie.C5179c;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.C5181e;
import com.airbnb.lottie.C5187k;
import com.airbnb.lottie.C5188l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import p024c.p052i.p059j.C0955e;

/* compiled from: NetworkFetcher.java */
/* renamed from: com.airbnb.lottie.t.c */
/* loaded from: classes.dex */
public class C5278c {

    /* renamed from: a */
    private final Context f12896a;

    /* renamed from: b */
    private final String f12897b;

    /* renamed from: c */
    private final C5277b f12898c;

    /* compiled from: NetworkFetcher.java */
    /* renamed from: com.airbnb.lottie.t.c$a */
    class a implements Callable<C5187k<C5180d>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5187k<C5180d> call() throws Exception {
            return C5278c.this.m9772f();
        }
    }

    private C5278c(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f12896a = applicationContext;
        this.f12897b = str;
        this.f12898c = new C5277b(applicationContext, str);
    }

    /* renamed from: a */
    private C5188l<C5180d> m9767a() {
        return new C5188l<>(new a());
    }

    /* renamed from: b */
    public static C5188l<C5180d> m9768b(Context context, String str) {
        return new C5278c(context, str).m9767a();
    }

    /* renamed from: c */
    private C5180d m9769c() {
        C0955e<EnumC5276a, InputStream> c0955eM9764a = this.f12898c.m9764a();
        if (c0955eM9764a == null) {
            return null;
        }
        EnumC5276a enumC5276a = c0955eM9764a.f6405a;
        InputStream inputStream = c0955eM9764a.f6406b;
        C5187k<C5180d> c5187kM9423m = enumC5276a == EnumC5276a.Zip ? C5181e.m9423m(new ZipInputStream(inputStream), this.f12897b) : C5181e.m9416f(inputStream, this.f12897b);
        if (c5187kM9423m.m9488b() != null) {
            return c5187kM9423m.m9488b();
        }
        return null;
    }

    /* renamed from: d */
    private C5187k<C5180d> m9770d() {
        try {
            return m9771e();
        } catch (IOException e2) {
            return new C5187k<>((Throwable) e2);
        }
    }

    /* renamed from: e */
    private C5187k m9771e() throws IOException {
        EnumC5276a enumC5276a;
        C5187k<C5180d> c5187kM9423m;
        C5179c.m9392b("Fetching " + this.f12897b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f12897b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
            String contentType = httpURLConnection.getContentType();
            char c2 = 65535;
            int iHashCode = contentType.hashCode();
            if (iHashCode != -1248325150) {
                if (iHashCode == -43840953 && contentType.equals("application/json")) {
                    c2 = 1;
                }
            } else if (contentType.equals("application/zip")) {
                c2 = 0;
            }
            if (c2 != 0) {
                C5179c.m9392b("Received json response.");
                enumC5276a = EnumC5276a.Json;
                c5187kM9423m = C5181e.m9416f(new FileInputStream(new File(this.f12898c.m9766e(httpURLConnection.getInputStream(), enumC5276a).getAbsolutePath())), this.f12897b);
            } else {
                C5179c.m9392b("Handling zip response.");
                enumC5276a = EnumC5276a.Zip;
                c5187kM9423m = C5181e.m9423m(new ZipInputStream(new FileInputStream(this.f12898c.m9766e(httpURLConnection.getInputStream(), enumC5276a))), this.f12897b);
            }
            if (c5187kM9423m.m9488b() != null) {
                this.f12898c.m9765d(enumC5276a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Completed fetch from network. Success: ");
            sb.append(c5187kM9423m.m9488b() != null);
            C5179c.m9392b(sb.toString());
            return c5187kM9423m;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new C5187k((Throwable) new IllegalArgumentException("Unable to fetch " + this.f12897b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + ((Object) sb2)));
            }
            sb2.append(line);
            sb2.append('\n');
        }
    }

    /* renamed from: f */
    public C5187k<C5180d> m9772f() {
        C5180d c5180dM9769c = m9769c();
        if (c5180dM9769c != null) {
            return new C5187k<>(c5180dM9769c);
        }
        C5179c.m9392b("Animation for " + this.f12897b + " not found in cache. Fetching from network.");
        return m9770d();
    }
}
