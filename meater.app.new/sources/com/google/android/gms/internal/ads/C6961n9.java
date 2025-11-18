package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.n9 */
/* loaded from: classes2.dex */
final class C6961n9 extends SSLSocketFactory {

    /* renamed from: a */
    private SSLSocketFactory f19996a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b */
    private final /* synthetic */ C6924m9 f19997b;

    C6961n9(C6924m9 c6924m9) {
        this.f19997b = c6924m9;
    }

    /* renamed from: a */
    private final Socket m15594a(Socket socket) throws SocketException {
        if (this.f19997b.f19902q > 0) {
            socket.setReceiveBufferSize(this.f19997b.f19902q);
        }
        this.f19997b.m15545e(socket);
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        return m15594a(this.f19996a.createSocket(socket, str, i2, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f19996a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f19996a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) throws IOException {
        return m15594a(this.f19996a.createSocket(str, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException {
        return m15594a(this.f19996a.createSocket(str, i2, inetAddress, i3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
        return m15594a(this.f19996a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
        return m15594a(this.f19996a.createSocket(inetAddress, i2, inetAddress2, i3));
    }
}
