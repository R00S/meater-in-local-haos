package V4;

import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v1protobuf.V1ConnectionState;
import com.apptionlabs.meater_app.v1protobuf.V1MLProbe;
import com.apptionlabs.meater_app.v1protobuf.V1MasterMessage;
import com.apptionlabs.meater_app.v1protobuf.V1MeaterLinkHeader;
import com.apptionlabs.meater_app.v1protobuf.V1MeaterLinkMessage;
import com.apptionlabs.meater_app.v1protobuf.V1SubscriptionMessage;
import com.apptionlabs.meater_app.v2protobuf.V2ConnectionState;
import com.apptionlabs.meater_app.v2protobuf.V2MLDevice;
import com.apptionlabs.meater_app.v2protobuf.V2MLProbe;
import com.apptionlabs.meater_app.v2protobuf.V2MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.ConnectionState;
import com.apptionlabs.meater_app.v3protobuf.MLDevice;
import com.apptionlabs.meater_app.v3protobuf.MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkHeader;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMessage;
import com.apptionlabs.meater_app.v3protobuf.SubscriptionMessage;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: BlockConnectivityMsgHelper.java */
/* loaded from: classes2.dex */
public class b {
    static void a(V1MasterMessage v1MasterMessage) {
        Probe probe;
        M4.h hVar = M4.h.f11978a;
        for (V1MLProbe v1MLProbe : v1MasterMessage.probes) {
            if (v1MLProbe.connectionState == V1ConnectionState.CONNECTION_STATE_OFFLINE && (probe = (Probe) hVar.o(v1MLProbe.probeSerialNum.longValue())) != null && probe.getConnectionState() == DeviceConnectionState.CONNECTED && probe.getConnectionMethod().isBluetoothConnectionMethod()) {
                probe.disconnectImmediately();
                probe.setConnectionState(DeviceConnectionState.OFFLINE);
            }
        }
    }

    static void b(V2MasterMessage v2MasterMessage) {
        Probe probe;
        M4.h hVar = M4.h.f11978a;
        Iterator<V2MLDevice> it = v2MasterMessage.devices.iterator();
        while (it.hasNext()) {
            V2MLProbe v2MLProbe = it.next().probe;
            if (v2MLProbe != null && v2MLProbe.connectionState == V2ConnectionState.V2CONNECTION_STATE_OFFLINE && (probe = (Probe) hVar.o(v2MLProbe.identifier.longValue())) != null && probe.getConnectionState() == DeviceConnectionState.CONNECTED && probe.getConnectionMethod().isBluetoothConnectionMethod()) {
                probe.disconnectImmediately();
                probe.setConnectionState(DeviceConnectionState.OFFLINE);
            }
        }
    }

    static V1MLProbe c(V1MasterMessage v1MasterMessage) {
        for (V1MLProbe v1MLProbe : v1MasterMessage.probes) {
            if (v1MLProbe.connectionState == V1ConnectionState.CONNECTION_STATE_CONNECTED) {
                return v1MLProbe;
            }
        }
        return null;
    }

    static V2MLProbe d(V2MasterMessage v2MasterMessage) {
        Iterator<V2MLDevice> it = v2MasterMessage.devices.iterator();
        while (it.hasNext()) {
            V2MLProbe v2MLProbe = it.next().probe;
            if (v2MLProbe != null && v2MLProbe.connectionState == V2ConnectionState.V2CONNECTION_STATE_CONNECTED) {
                return v2MLProbe;
            }
        }
        return null;
    }

    static MLDevice e(MasterMessage masterMessage) {
        ConnectionState connectionState;
        for (MLDevice mLDevice : masterMessage.devices) {
            if (mLDevice.probe != null && ((connectionState = mLDevice.connectionState) == ConnectionState.CONNECTION_STATE_CONNECTED || connectionState == ConnectionState.CONNECTION_STATE_FETCHING_COOK_SETUP)) {
                return mLDevice;
            }
        }
        return null;
    }

    static void f(MEATERLinkAddress mEATERLinkAddress, int i10) {
        l.g0().a0(i10, mEATERLinkAddress);
    }

    static void g(long j10, MEATERLinkAddress mEATERLinkAddress) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        byte[] bArrEncode = new V1MeaterLinkMessage.Builder().subscriptionMessage(new V1SubscriptionMessage.Builder().header(new V1MeaterLinkHeader.Builder().meaterLinkIdentifier(21578).versionMajor(7).versionMinor(1).messageNum(0).build()).desiredProbes(arrayList).build()).build().encode();
        U4.b.f("Sending MLv1 subscription request to %s", mEATERLinkAddress.toString());
        l.g0().X(bArrEncode, mEATERLinkAddress);
    }

    static void h(long j10, MEATERLinkAddress mEATERLinkAddress) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j10));
        byte[] bArrEncode = new MeaterLinkMessage.Builder().header(new MeaterLinkHeader.Builder().meaterLinkIdentifier(21578).versionMajor(12).versionMinor(1).messageNumber(0).deviceID(Long.valueOf(j10)).build()).subscriptionMessage(new SubscriptionMessage.Builder().desiredDevices(arrayList).build()).build().encode();
        U4.b.f("Sending MLv2 subscription request to %s", mEATERLinkAddress.toString());
        l.g0().X(bArrEncode, mEATERLinkAddress);
    }
}
