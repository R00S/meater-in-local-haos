package com.google.firebase.perf.network;

import B9.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import v9.C4925a;
import w9.g;
import y9.C5140a;
import y9.C5141b;
import y9.C5143d;

/* compiled from: InstrURLConnectionBase.java */
/* loaded from: classes2.dex */
class c {

    /* renamed from: f, reason: collision with root package name */
    private static final C4925a f38553f = C4925a.e();

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f38554a;

    /* renamed from: b, reason: collision with root package name */
    private final g f38555b;

    /* renamed from: c, reason: collision with root package name */
    private long f38556c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f38557d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final l f38558e;

    public c(HttpURLConnection httpURLConnection, l lVar, g gVar) {
        this.f38554a = httpURLConnection;
        this.f38555b = gVar;
        this.f38558e = lVar;
        gVar.t(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.f38556c == -1) {
            this.f38558e.g();
            long jE = this.f38558e.e();
            this.f38556c = jE;
            this.f38555b.n(jE);
        }
        String strF = F();
        if (strF != null) {
            this.f38555b.j(strF);
        } else if (o()) {
            this.f38555b.j("POST");
        } else {
            this.f38555b.j("GET");
        }
    }

    public boolean A() {
        return this.f38554a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f38554a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.f38554a.getOutputStream();
            return outputStream != null ? new C5141b(outputStream, this.f38555b, this.f38558e) : outputStream;
        } catch (IOException e10) {
            this.f38555b.r(this.f38558e.c());
            C5143d.d(this.f38555b);
            throw e10;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f38554a.getPermission();
        } catch (IOException e10) {
            this.f38555b.r(this.f38558e.c());
            C5143d.d(this.f38555b);
            throw e10;
        }
    }

    public int E() {
        return this.f38554a.getReadTimeout();
    }

    public String F() {
        return this.f38554a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f38554a.getRequestProperties();
    }

    public String H(String str) {
        return this.f38554a.getRequestProperty(str);
    }

    public int I() throws IOException {
        a0();
        if (this.f38557d == -1) {
            long jC = this.f38558e.c();
            this.f38557d = jC;
            this.f38555b.s(jC);
        }
        try {
            int responseCode = this.f38554a.getResponseCode();
            this.f38555b.k(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f38555b.r(this.f38558e.c());
            C5143d.d(this.f38555b);
            throw e10;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f38557d == -1) {
            long jC = this.f38558e.c();
            this.f38557d = jC;
            this.f38555b.s(jC);
        }
        try {
            String responseMessage = this.f38554a.getResponseMessage();
            this.f38555b.k(this.f38554a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f38555b.r(this.f38558e.c());
            C5143d.d(this.f38555b);
            throw e10;
        }
    }

    public URL K() {
        return this.f38554a.getURL();
    }

    public boolean L() {
        return this.f38554a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f38554a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f38554a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f38554a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f38554a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f38554a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f38554a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f38554a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f38554a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f38554a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f38554a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f38554a.setReadTimeout(i10);
    }

    public void X(String str) {
        this.f38554a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f38555b.u(str2);
        }
        this.f38554a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f38554a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f38554a.addRequestProperty(str, str2);
    }

    public void b() {
        if (this.f38556c == -1) {
            this.f38558e.g();
            long jE = this.f38558e.e();
            this.f38556c = jE;
            this.f38555b.n(jE);
        }
        try {
            this.f38554a.connect();
        } catch (IOException e10) {
            this.f38555b.r(this.f38558e.c());
            C5143d.d(this.f38555b);
            throw e10;
        }
    }

    public boolean b0() {
        return this.f38554a.usingProxy();
    }

    public void c() {
        this.f38555b.r(this.f38558e.c());
        this.f38555b.b();
        this.f38554a.disconnect();
    }

    public boolean d() {
        return this.f38554a.getAllowUserInteraction();
    }

    public int e() {
        return this.f38554a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f38554a.equals(obj);
    }

    public Object f() throws IOException {
        a0();
        this.f38555b.k(this.f38554a.getResponseCode());
        try {
            Object content = this.f38554a.getContent();
            if (content instanceof InputStream) {
                this.f38555b.o(this.f38554a.getContentType());
                return new C5140a((InputStream) content, this.f38555b, this.f38558e);
            }
            this.f38555b.o(this.f38554a.getContentType());
            this.f38555b.p(this.f38554a.getContentLength());
            this.f38555b.r(this.f38558e.c());
            this.f38555b.b();
            return content;
        } catch (IOException e10) {
            this.f38555b.r(this.f38558e.c());
            C5143d.d(this.f38555b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f38555b.k(this.f38554a.getResponseCode());
        try {
            Object content = this.f38554a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f38555b.o(this.f38554a.getContentType());
                return new C5140a((InputStream) content, this.f38555b, this.f38558e);
            }
            this.f38555b.o(this.f38554a.getContentType());
            this.f38555b.p(this.f38554a.getContentLength());
            this.f38555b.r(this.f38558e.c());
            this.f38555b.b();
            return content;
        } catch (IOException e10) {
            this.f38555b.r(this.f38558e.c());
            C5143d.d(this.f38555b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f38554a.getContentEncoding();
    }

    public int hashCode() {
        return this.f38554a.hashCode();
    }

    public int i() {
        a0();
        return this.f38554a.getContentLength();
    }

    public long j() {
        a0();
        return this.f38554a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f38554a.getContentType();
    }

    public long l() {
        a0();
        return this.f38554a.getDate();
    }

    public boolean m() {
        return this.f38554a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f38554a.getDoInput();
    }

    public boolean o() {
        return this.f38554a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f38555b.k(this.f38554a.getResponseCode());
        } catch (IOException unused) {
            f38553f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f38554a.getErrorStream();
        return errorStream != null ? new C5140a(errorStream, this.f38555b, this.f38558e) : errorStream;
    }

    public long q() {
        a0();
        return this.f38554a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f38554a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f38554a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f38554a.getHeaderFieldDate(str, j10);
    }

    public String toString() {
        return this.f38554a.toString();
    }

    public int u(String str, int i10) {
        a0();
        return this.f38554a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f38554a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f38554a.getHeaderFieldLong(str, j10);
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f38554a.getHeaderFields();
    }

    public long y() {
        return this.f38554a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        a0();
        this.f38555b.k(this.f38554a.getResponseCode());
        this.f38555b.o(this.f38554a.getContentType());
        try {
            InputStream inputStream = this.f38554a.getInputStream();
            return inputStream != null ? new C5140a(inputStream, this.f38555b, this.f38558e) : inputStream;
        } catch (IOException e10) {
            this.f38555b.r(this.f38558e.c());
            C5143d.d(this.f38555b);
            throw e10;
        }
    }
}
