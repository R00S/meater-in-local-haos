package p345i.p346a.p347g;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import p345i.p346a.InterfaceC9183b;
import p355k.p357b.C9733c;
import p355k.p357b.InterfaceC9732b;

/* compiled from: NetworkTopologyDiscoveryImpl.java */
/* renamed from: i.a.g.o */
/* loaded from: classes2.dex */
public class C9202o implements InterfaceC9183b {

    /* renamed from: a */
    private static final InterfaceC9732b f35441a = C9733c.m32189i(C9202o.class.getName());

    @Override // p345i.p346a.InterfaceC9183b
    /* renamed from: a */
    public InetAddress[] mo29406a() throws SocketException {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    InterfaceC9732b interfaceC9732b = f35441a;
                    if (interfaceC9732b.mo32175d()) {
                        interfaceC9732b.mo32180i("Found NetworkInterface/InetAddress: " + networkInterfaceNextElement + " -- " + inetAddressNextElement);
                    }
                    if (m29710b(networkInterfaceNextElement, inetAddressNextElement)) {
                        hashSet.add(inetAddressNextElement);
                    }
                }
            }
        } catch (SocketException e2) {
            f35441a.mo32179h("Error while fetching network interfaces addresses: " + e2);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }

    /* renamed from: b */
    public boolean m29710b(NetworkInterface networkInterface, InetAddress inetAddress) {
        try {
            if (networkInterface.isUp() && networkInterface.supportsMulticast()) {
                return !networkInterface.isLoopback();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
