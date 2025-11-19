package com.google.firebase.perf.network;

import A9.k;
import B9.l;
import androidx.annotation.Keep;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import w9.g;
import y9.C5142c;
import y9.C5143d;

/* loaded from: classes2.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    static <T> T a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.t(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = C5143d.a(httpRequest);
            if (lA != null) {
                gVarC.m(lA.longValue());
            }
            lVar.g();
            gVarC.n(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new C5142c(responseHandler, lVar, gVarC));
        } catch (IOException e10) {
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    static <T> T b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.t(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = C5143d.a(httpRequest);
            if (lA != null) {
                gVarC.m(lA.longValue());
            }
            lVar.g();
            gVarC.n(lVar.e());
            return (T) httpClient.execute(httpHost, httpRequest, new C5142c(responseHandler, lVar, gVarC), httpContext);
        } catch (IOException e10) {
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    static <T> T c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.t(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = C5143d.a(httpUriRequest);
            if (lA != null) {
                gVarC.m(lA.longValue());
            }
            lVar.g();
            gVarC.n(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new C5142c(responseHandler, lVar, gVarC));
        } catch (IOException e10) {
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    static <T> T d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.t(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = C5143d.a(httpUriRequest);
            if (lA != null) {
                gVarC.m(lA.longValue());
            }
            lVar.g();
            gVarC.n(lVar.e());
            return (T) httpClient.execute(httpUriRequest, new C5142c(responseHandler, lVar, gVarC), httpContext);
        } catch (IOException e10) {
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    static HttpResponse e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.t(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = C5143d.a(httpRequest);
            if (lA != null) {
                gVarC.m(lA.longValue());
            }
            lVar.g();
            gVarC.n(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            gVarC.r(lVar.c());
            gVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = C5143d.a(httpResponseExecute);
            if (lA2 != null) {
                gVarC.p(lA2.longValue());
            }
            String strB = C5143d.b(httpResponseExecute);
            if (strB != null) {
                gVarC.o(strB);
            }
            gVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        return g(httpClient, httpUriRequest, new l(), k.k());
    }

    static HttpResponse f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.t(httpHost.toURI() + httpRequest.getRequestLine().getUri()).j(httpRequest.getRequestLine().getMethod());
            Long lA = C5143d.a(httpRequest);
            if (lA != null) {
                gVarC.m(lA.longValue());
            }
            lVar.g();
            gVarC.n(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            gVarC.r(lVar.c());
            gVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = C5143d.a(httpResponseExecute);
            if (lA2 != null) {
                gVarC.p(lA2.longValue());
            }
            String strB = C5143d.b(httpResponseExecute);
            if (strB != null) {
                gVarC.o(strB);
            }
            gVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    static HttpResponse g(HttpClient httpClient, HttpUriRequest httpUriRequest, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.t(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = C5143d.a(httpUriRequest);
            if (lA != null) {
                gVarC.m(lA.longValue());
            }
            lVar.g();
            gVarC.n(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            gVarC.r(lVar.c());
            gVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = C5143d.a(httpResponseExecute);
            if (lA2 != null) {
                gVarC.p(lA2.longValue());
            }
            String strB = C5143d.b(httpResponseExecute);
            if (strB != null) {
                gVarC.o(strB);
            }
            gVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    static HttpResponse h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, l lVar, k kVar) throws IOException {
        g gVarC = g.c(kVar);
        try {
            gVarC.t(httpUriRequest.getURI().toString()).j(httpUriRequest.getMethod());
            Long lA = C5143d.a(httpUriRequest);
            if (lA != null) {
                gVarC.m(lA.longValue());
            }
            lVar.g();
            gVarC.n(lVar.e());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            gVarC.r(lVar.c());
            gVarC.k(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = C5143d.a(httpResponseExecute);
            if (lA2 != null) {
                gVarC.p(lA2.longValue());
            }
            String strB = C5143d.b(httpResponseExecute);
            if (strB != null) {
                gVarC.o(strB);
            }
            gVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            gVarC.r(lVar.c());
            C5143d.d(gVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return h(httpClient, httpUriRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        return (T) c(httpClient, httpUriRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        return (T) d(httpClient, httpUriRequest, responseHandler, httpContext, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        return e(httpClient, httpHost, httpRequest, new l(), k.k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return f(httpClient, httpHost, httpRequest, httpContext, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) a(httpClient, httpHost, httpRequest, responseHandler, new l(), k.k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new l(), k.k());
    }
}
