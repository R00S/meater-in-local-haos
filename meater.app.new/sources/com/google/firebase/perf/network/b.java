package com.google.firebase.perf.network;

import B9.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import w9.g;

/* compiled from: InstrHttpsURLConnection.java */
/* loaded from: classes2.dex */
public final class b extends HttpsURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final c f38551a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpsURLConnection f38552b;

    b(HttpsURLConnection httpsURLConnection, l lVar, g gVar) {
        super(httpsURLConnection.getURL());
        this.f38552b = httpsURLConnection;
        this.f38551a = new c(httpsURLConnection, lVar, gVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f38551a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f38551a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f38551a.c();
    }

    public boolean equals(Object obj) {
        return this.f38551a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f38551a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f38552b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f38551a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f38551a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f38551a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f38551a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f38551a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f38551a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f38551a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f38551a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f38551a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f38551a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f38551a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f38551a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f38551a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f38551a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f38551a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f38551a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f38551a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f38551a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f38552b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f38551a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f38551a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f38551a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f38551a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f38552b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f38552b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f38551a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f38552b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f38551a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f38551a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f38551a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f38551a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f38551a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f38551a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f38551a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f38552b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f38552b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f38551a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f38551a.L();
    }

    public int hashCode() {
        return this.f38551a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f38551a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f38551a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f38551a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f38551a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f38551a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f38551a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f38551a.S(i10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f38552b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f38551a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f38551a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f38551a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f38551a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f38551a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f38552b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f38551a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f38551a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f38551a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f38551a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f38551a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f38551a.T(j10);
    }
}
