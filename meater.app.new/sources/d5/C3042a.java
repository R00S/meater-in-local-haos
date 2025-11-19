package d5;

import O5.g;
import O5.h;
import O5.i;
import O5.k;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v3protobuf.ProbeTestMessage;
import java.util.Arrays;

/* compiled from: ProbeSimManager.java */
/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3042a extends k {

    /* renamed from: d, reason: collision with root package name */
    private static final C3042a f39723d = new C3042a();

    /* renamed from: c, reason: collision with root package name */
    private final C0506a f39724c = new C0506a();

    /* compiled from: ProbeSimManager.java */
    /* renamed from: d5.a$a, reason: collision with other inner class name */
    private class C0506a implements h {
        @Override // O5.h
        public void a(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
            C3042a.this.e(bArr, mEATERLinkAddress);
        }

        private C0506a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
        try {
            ProbeTestMessage probeTestMessageDecode = ProbeTestMessage.ADAPTER.decode(bArr);
            long jLongValue = probeTestMessageDecode.probeSerialNum.longValue();
            int iIntValue = probeTestMessageDecode.probeId.intValue();
            DeviceConnectionMethod deviceConnectionMethod = DeviceConnectionMethod.PROBE_SIM;
            MEATERDevice mEATERDeviceB = b(jLongValue, iIntValue, deviceConnectionMethod);
            if (mEATERDeviceB == null || !mEATERDeviceB.isMEATERProbe()) {
                return;
            }
            Probe probe = (Probe) mEATERDeviceB;
            probe.setConnectionMethod(deviceConnectionMethod);
            probe.setConnectionState(DeviceConnectionState.CONNECTED);
            probe.setLastSeenDate(System.currentTimeMillis());
            probe.setParentDeviceID(0L);
            M4.h.f11978a.Z(Arrays.asList(probe));
            if (mEATERDeviceB.isPaired()) {
                Integer num = probeTestMessageDecode.ambientTemp;
                if (num != null) {
                    probe.setAmbientTemperature(num.intValue());
                }
                Integer num2 = probeTestMessageDecode.internalTemp;
                if (num2 != null) {
                    probe.setInternalTemperature(num2.intValue());
                }
                Integer num3 = probeTestMessageDecode.battery;
                if (num3 != null) {
                    probe.setBatteryLevel(num3.intValue() / 10);
                }
                Integer num4 = probeTestMessageDecode.signalLevel;
                if (num4 != null) {
                    probe.setSignalLevel(num4.intValue());
                }
                probe.updateState();
            }
        } catch (Exception unused) {
            U4.b.n("Received invalid ProbeSim message from %s", mEATERLinkAddress.b());
        }
    }

    public static C3042a f() {
        return f39723d;
    }

    @Override // O5.k
    public void a() {
        if (this.f13284a == null) {
            return;
        }
        U4.b.s("Closing socket...", new Object[0]);
        super.a();
    }

    @Override // O5.k
    public void c() {
        if (this.f13284a != null) {
            return;
        }
        U4.b.s("Opening socket...", new Object[0]);
        super.a();
        g gVar = new g(ProtocolParameters.MEATER_PROBE_SIM_UDP_PORT, this.f39724c);
        this.f13284a = gVar;
        gVar.start();
        this.f13285b = i.c(this.f13284a.g());
    }
}
