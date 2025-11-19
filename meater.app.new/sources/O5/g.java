package O5;

import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* compiled from: UDPReceiver.java */
/* loaded from: classes2.dex */
public class g extends d {

    /* renamed from: H, reason: collision with root package name */
    private static boolean f13273H;

    /* renamed from: I, reason: collision with root package name */
    private static final Handler f13274I = new Handler(Looper.getMainLooper());

    /* renamed from: C, reason: collision with root package name */
    private DatagramSocket f13275C;

    /* renamed from: D, reason: collision with root package name */
    private Thread f13276D;

    /* renamed from: E, reason: collision with root package name */
    private List<InetAddress> f13277E = new ArrayList();

    /* renamed from: F, reason: collision with root package name */
    private long f13278F = 0;

    /* renamed from: G, reason: collision with root package name */
    private h f13279G;

    public g(int i10, h hVar) throws SocketException {
        try {
            this.f13279G = hVar;
            DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
            this.f13275C = datagramSocket;
            datagramSocket.setReuseAddress(true);
            this.f13275C.setReceiveBufferSize(3000);
            this.f13275C.bind(new InetSocketAddress(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    static InetAddress e() {
        try {
            return InetAddress.getByName("255.255.255.255");
        } catch (UnknownHostException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private List<InetAddress> f() throws SocketException {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!networkInterfaceNextElement.isLoopback()) {
                    Iterator<InterfaceAddress> it = networkInterfaceNextElement.getInterfaceAddresses().iterator();
                    while (it.hasNext()) {
                        InetAddress address = it.next().getAddress();
                        if (address != null) {
                            arrayList.add(address);
                        }
                    }
                }
            }
        } catch (SocketException e10) {
            e10.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
        this.f13279G.a(bArr, mEATERLinkAddress);
    }

    private void j() {
        if (f13273H || System.currentTimeMillis() - this.f13278F >= 300000) {
            this.f13278F = System.currentTimeMillis();
            this.f13277E = f();
            f13273H = false;
        }
    }

    private boolean k(long j10) throws InterruptedException {
        try {
            Thread.sleep(j10);
            return false;
        } catch (InterruptedException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    protected void d(DatagramPacket datagramPacket, byte[] bArr) {
        if (this.f13279G != null) {
            final byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, datagramPacket.getLength());
            final MEATERLinkAddress mEATERLinkAddress = new MEATERLinkAddress(datagramPacket.getAddress().toString(), datagramPacket.getPort());
            f13274I.post(new Runnable() { // from class: O5.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13270B.h(bArrCopyOfRange, mEATERLinkAddress);
                }
            });
        }
    }

    public DatagramSocket g() {
        return this.f13275C;
    }

    public void i() throws InterruptedException {
        Thread thread = this.f13276D;
        if (thread != null) {
            thread.interrupt();
        }
        k(100L);
        DatagramSocket datagramSocket = this.f13275C;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f13275C = null;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws IOException {
        byte[] bArr = new byte[3000];
        DatagramPacket datagramPacket = new DatagramPacket(bArr, 3000);
        this.f13276D = this;
        WifiManager.MulticastLock multicastLockCreateMulticastLock = ((WifiManager) x4.g.h().getApplicationContext().getSystemService("wifi")).createMulticastLock("lock");
        boolean z10 = false;
        while (!Thread.interrupted() && !z10) {
            multicastLockCreateMulticastLock.acquire();
            try {
            } catch (Exception unused) {
                z10 = true;
            }
            if (this.f13275C == null) {
                break;
            }
            j();
            this.f13275C.receive(datagramPacket);
            Iterator<InetAddress> it = this.f13277E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    d(datagramPacket, bArr);
                    break;
                } else if (it.next().equals(datagramPacket.getAddress())) {
                    break;
                }
            }
            multicastLockCreateMulticastLock.release();
        }
        try {
            DatagramSocket datagramSocket = this.f13275C;
            if (datagramSocket != null) {
                datagramSocket.close();
                this.f13275C = null;
            }
        } catch (Exception unused2) {
        }
    }
}
