package O5;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: UDPSender.java */
/* loaded from: classes2.dex */
public class i extends b {

    /* renamed from: b, reason: collision with root package name */
    private InetAddress f13280b;

    /* renamed from: c, reason: collision with root package name */
    private int f13281c;

    /* renamed from: d, reason: collision with root package name */
    private final DatagramSocket f13282d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13283e;

    private i(Looper looper, DatagramSocket datagramSocket) {
        super(looper);
        this.f13280b = null;
        this.f13283e = false;
        this.f13282d = datagramSocket;
    }

    public static i c(DatagramSocket datagramSocket) {
        HandlerThread handlerThread = new HandlerThread("ML-UDP-sender");
        handlerThread.start();
        return new i(handlerThread.getLooper(), datagramSocket);
    }

    private InetAddress d() throws SocketException {
        if (!x4.g.t().T()) {
            return this.f13280b;
        }
        int i10 = this.f13281c;
        this.f13281c = i10 + 1;
        if (i10 > 5) {
            this.f13281c = 0;
            this.f13280b = g.e();
        }
        InetAddress inetAddress = this.f13280b;
        if (inetAddress != null) {
            return inetAddress;
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (!networkInterfaceNextElement.isLoopback()) {
                    Iterator<InterfaceAddress> it = networkInterfaceNextElement.getInterfaceAddresses().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceAddress next = it.next();
                            if (next.getBroadcast() != null) {
                                this.f13280b = next.getBroadcast();
                                break;
                            }
                        }
                    }
                }
            }
        } catch (SocketException e10) {
            e10.printStackTrace();
            this.f13280b = null;
        }
        try {
            if (this.f13280b == null) {
                this.f13280b = InetAddress.getByName("255.255.255.255");
            }
        } catch (UnknownHostException e11) {
            e11.printStackTrace();
        }
        return this.f13280b;
    }

    private void e(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
        if (x4.g.t().T()) {
            Message messageObtainMessage = obtainMessage();
            e eVar = new e(bArr, mEATERLinkAddress);
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = eVar;
            sendMessage(messageObtainMessage);
        }
    }

    public void f(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
        e(bArr, mEATERLinkAddress);
    }

    public void g() {
        Message messageObtainMessage = obtainMessage();
        messageObtainMessage.what = 2;
        sendMessage(messageObtainMessage);
        this.f13283e = true;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws IOException {
        InetAddress inetAddressD;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            getLooper().quit();
            return;
        }
        if (!x4.g.t().T() || this.f13283e) {
            return;
        }
        e eVar = (e) message.obj;
        byte[] bArrB = eVar.b();
        DatagramPacket datagramPacket = new DatagramPacket(bArrB, bArrB.length);
        try {
            inetAddressD = eVar.a().b().equals(ProtocolParameters.MEATER_LINK_BROADCAST_ADDR) ? d() : eVar.a().a();
        } catch (Exception e10) {
            e10.printStackTrace();
            inetAddressD = null;
        }
        if (inetAddressD == null) {
            U4.b.n("UDP message has bad sender address, ignoring.", new Object[0]);
            return;
        }
        datagramPacket.setAddress(inetAddressD);
        datagramPacket.setPort(eVar.a().c());
        try {
            this.f13282d.send(datagramPacket);
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        this.f13283e = false;
    }
}
