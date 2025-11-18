package cm.aptoide.p092pt.install.remote;

import java.net.InetAddress;

/* loaded from: classes.dex */
public class ReceiverDevice {
    private InetAddress address;
    private String deviceName;
    private int port;

    public ReceiverDevice(String str, InetAddress inetAddress, int i2) {
        this.deviceName = str;
        this.address = inetAddress;
        this.port = i2;
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isSameDevice(ReceiverDevice receiverDevice) {
        return this.address.getHostAddress().equals(receiverDevice.getAddress().getHostAddress());
    }

    public void setAddress(InetAddress inetAddress) {
        this.address = inetAddress;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }
}
