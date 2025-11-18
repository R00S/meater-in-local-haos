package androidx.media3.datasource;

import X1.C1804a;
import a2.AbstractC1884a;
import a2.g;
import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class UdpDataSource extends AbstractC1884a {

    /* renamed from: e, reason: collision with root package name */
    private final int f26150e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f26151f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f26152g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f26153h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f26154i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f26155j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f26156k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f26157l;

    /* renamed from: m, reason: collision with root package name */
    private int f26158m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) throws IOException {
        Uri uri = gVar.f19983a;
        this.f26153h = uri;
        String str = (String) C1804a.e(uri.getHost());
        int port = this.f26153h.getPort();
        s(gVar);
        try {
            this.f26156k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f26156k, port);
            if (this.f26156k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f26155j = multicastSocket;
                multicastSocket.joinGroup(this.f26156k);
                this.f26154i = this.f26155j;
            } else {
                this.f26154i = new DatagramSocket(inetSocketAddress);
            }
            this.f26154i.setSoTimeout(this.f26150e);
            this.f26157l = true;
            t(gVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() throws IOException {
        this.f26153h = null;
        MulticastSocket multicastSocket = this.f26155j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C1804a.e(this.f26156k));
            } catch (IOException unused) {
            }
            this.f26155j = null;
        }
        DatagramSocket datagramSocket = this.f26154i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f26154i = null;
        }
        this.f26156k = null;
        this.f26158m = 0;
        if (this.f26157l) {
            this.f26157l = false;
            r();
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f26153h;
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f26158m == 0) {
            try {
                ((DatagramSocket) C1804a.e(this.f26154i)).receive(this.f26152g);
                int length = this.f26152g.getLength();
                this.f26158m = length;
                q(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f26152g.getLength();
        int i12 = this.f26158m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f26151f, length2 - i12, bArr, i10, iMin);
        this.f26158m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f26150e = i11;
        byte[] bArr = new byte[i10];
        this.f26151f = bArr;
        this.f26152g = new DatagramPacket(bArr, 0, i10);
    }
}
