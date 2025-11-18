package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* loaded from: classes2.dex */
final class C7784o7 extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f28813a;

    C7784o7() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    /* renamed from: a */
    private final SSLSocket m22802a(SSLSocket sSLSocket) {
        return new C7775n7(this, sSLSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        return m22802a((SSLSocket) this.f28813a.createSocket(socket, str, i2, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f28813a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f28813a.getSupportedCipherSuites();
    }

    private C7784o7(SSLSocketFactory sSLSocketFactory) {
        this.f28813a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) throws IOException {
        return m22802a((SSLSocket) this.f28813a.createSocket(str, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
        return m22802a((SSLSocket) this.f28813a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException {
        return m22802a((SSLSocket) this.f28813a.createSocket(str, i2, inetAddress, i3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
        return m22802a((SSLSocket) this.f28813a.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        return m22802a((SSLSocket) this.f28813a.createSocket());
    }
}
