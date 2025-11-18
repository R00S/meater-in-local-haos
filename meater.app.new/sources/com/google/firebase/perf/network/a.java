package com.google.firebase.perf.network;

import B9.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import w9.g;

/* compiled from: InstrHttpURLConnection.java */
/* loaded from: classes2.dex */
public final class a extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final c f38550a;

    a(HttpURLConnection httpURLConnection, l lVar, g gVar) {
        super(httpURLConnection.getURL());
        this.f38550a = new c(httpURLConnection, lVar, gVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f38550a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f38550a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f38550a.c();
    }

    public boolean equals(Object obj) {
        return this.f38550a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f38550a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f38550a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f38550a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f38550a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f38550a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f38550a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f38550a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f38550a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f38550a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f38550a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f38550a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f38550a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f38550a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i10) {
        return this.f38550a.r(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j10) {
        return this.f38550a.t(str, j10);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i10) {
        return this.f38550a.u(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i10) {
        return this.f38550a.v(i10);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j10) {
        return this.f38550a.w(str, j10);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f38550a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f38550a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f38550a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f38550a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f38550a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f38550a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f38550a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f38550a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f38550a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f38550a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f38550a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f38550a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f38550a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f38550a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f38550a.L();
    }

    public int hashCode() {
        return this.f38550a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z10) {
        this.f38550a.M(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i10) {
        this.f38550a.N(i10);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i10) {
        this.f38550a.O(i10);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z10) {
        this.f38550a.P(z10);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z10) {
        this.f38550a.Q(z10);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z10) {
        this.f38550a.R(z10);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i10) {
        this.f38550a.S(i10);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j10) {
        this.f38550a.U(j10);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z10) {
        this.f38550a.V(z10);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i10) {
        this.f38550a.W(i10);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f38550a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f38550a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z10) {
        this.f38550a.Z(z10);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f38550a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f38550a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f38550a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f38550a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j10) {
        this.f38550a.T(j10);
    }
}
