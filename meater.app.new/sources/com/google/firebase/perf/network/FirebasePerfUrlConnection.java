package com.google.firebase.perf.network;

import A9.k;
import B9.l;
import B9.n;
import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import w9.g;
import y9.C5143d;

/* loaded from: classes2.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    static Object a(n nVar, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        g gVarC = g.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            return uRLConnectionA instanceof HttpsURLConnection ? new b((HttpsURLConnection) uRLConnectionA, lVar, gVarC).getContent() : uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, gVarC).getContent() : uRLConnectionA.getContent();
        } catch (IOException e10) {
            gVarC.n(jE);
            gVarC.r(lVar.c());
            gVarC.t(nVar.toString());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    static Object b(n nVar, Class[] clsArr, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        g gVarC = g.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            return uRLConnectionA instanceof HttpsURLConnection ? new b((HttpsURLConnection) uRLConnectionA, lVar, gVarC).getContent(clsArr) : uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, gVarC).getContent(clsArr) : uRLConnectionA.getContent(clsArr);
        } catch (IOException e10) {
            gVarC.n(jE);
            gVarC.r(lVar.c());
            gVarC.t(nVar.toString());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    static InputStream c(n nVar, k kVar, l lVar) throws IOException {
        if (!k.k().u()) {
            return nVar.a().getInputStream();
        }
        lVar.g();
        long jE = lVar.e();
        g gVarC = g.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            return uRLConnectionA instanceof HttpsURLConnection ? new b((HttpsURLConnection) uRLConnectionA, lVar, gVarC).getInputStream() : uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, gVarC).getInputStream() : uRLConnectionA.getInputStream();
        } catch (IOException e10) {
            gVarC.n(jE);
            gVarC.r(lVar.c());
            gVarC.t(nVar.toString());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return a(new n(url), k.k(), new l());
    }

    @Keep
    public static Object instrument(Object obj) {
        return obj instanceof HttpsURLConnection ? new b((HttpsURLConnection) obj, new l(), g.c(k.k())) : obj instanceof HttpURLConnection ? new a((HttpURLConnection) obj, new l(), g.c(k.k())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return c(new n(url), k.k(), new l());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return b(new n(url), clsArr, k.k(), new l());
    }
}
