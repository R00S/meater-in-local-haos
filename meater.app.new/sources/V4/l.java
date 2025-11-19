package V4;

import P5.G;
import android.os.Handler;
import android.os.Looper;
import c5.C2316d;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.DeviceChargingMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.MEATERPlus;
import com.apptionlabs.meater_app.model.MasterDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v1protobuf.BlockInfo;
import com.apptionlabs.meater_app.v1protobuf.V1BlockFirmwareUpdateMessage;
import com.apptionlabs.meater_app.v1protobuf.V1MasterMessage;
import com.apptionlabs.meater_app.v1protobuf.V1MeaterLinkMessage;
import com.apptionlabs.meater_app.v2protobuf.V2MLBlock;
import com.apptionlabs.meater_app.v2protobuf.V2MLDevice;
import com.apptionlabs.meater_app.v2protobuf.V2MasterMessage;
import com.apptionlabs.meater_app.v2protobuf.V2MasterType;
import com.apptionlabs.meater_app.v2protobuf.V2MeaterLinkHeader;
import com.apptionlabs.meater_app.v2protobuf.V2MeaterLinkMajorVersion;
import com.apptionlabs.meater_app.v2protobuf.V2MeaterLinkMessage;
import com.apptionlabs.meater_app.v2protobuf.V2NetworkSettingsMessage;
import com.apptionlabs.meater_app.v2protobuf.V2TemperatureHistory;
import com.apptionlabs.meater_app.v2protobuf.V2TemperatureHistoryMessage;
import com.apptionlabs.meater_app.v2protobuf.V2TemperatureRecording;
import com.apptionlabs.meater_app.v3protobuf.ChargeState;
import com.apptionlabs.meater_app.v3protobuf.ChargingStatus;
import com.apptionlabs.meater_app.v3protobuf.ConnectionState;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionState;
import com.apptionlabs.meater_app.v3protobuf.MLBlock;
import com.apptionlabs.meater_app.v3protobuf.MLChildDevice;
import com.apptionlabs.meater_app.v3protobuf.MLDevice;
import com.apptionlabs.meater_app.v3protobuf.MLPlus;
import com.apptionlabs.meater_app.v3protobuf.MLProbe;
import com.apptionlabs.meater_app.v3protobuf.MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.MasterStatusMessage;
import com.apptionlabs.meater_app.v3protobuf.MasterType;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkHeader;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMajorVersion;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMessage;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMinorVersion;
import com.apptionlabs.meater_app.v3protobuf.PingPongMessage;
import com.apptionlabs.meater_app.v3protobuf.PingPongMessageType;
import com.apptionlabs.meater_app.v3protobuf.SetupMessage;
import com.apptionlabs.meater_app.v3protobuf.SubscriptionMessage;
import com.apptionlabs.meater_app.v3protobuf.TemperatureHistory;
import com.apptionlabs.meater_app.v3protobuf.TemperatureHistoryMessage;
import com.apptionlabs.meater_app.v3protobuf.TemperatureHistoryRequestMessage;
import com.apptionlabs.meater_app.v3protobuf.TemperatureRecording;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import z4.c0;

/* compiled from: MEATERLinkManager.java */
/* loaded from: classes2.dex */
public class l extends O5.k {

    /* renamed from: p, reason: collision with root package name */
    private static final Handler f18113p = new Handler(Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    private static final l f18114q = new l();

    /* renamed from: h, reason: collision with root package name */
    private long f18120h;

    /* renamed from: i, reason: collision with root package name */
    private long f18121i;

    /* renamed from: j, reason: collision with root package name */
    private int f18122j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18125m;

    /* renamed from: c, reason: collision with root package name */
    private final n f18115c = new n();

    /* renamed from: d, reason: collision with root package name */
    private final o f18116d = new o();

    /* renamed from: e, reason: collision with root package name */
    private final MEATERLinkAddress f18117e = new MEATERLinkAddress("255.255.255.255", ProtocolParameters.MEATER_LINK_UDP_PORT);

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<r> f18118f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<MasterDevice> f18119g = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f18123k = new HashMap<>();

    /* renamed from: l, reason: collision with root package name */
    private final c f18124l = new c();

    /* renamed from: n, reason: collision with root package name */
    private final Runnable f18126n = new a();

    /* renamed from: o, reason: collision with root package name */
    private final g f18127o = new b(this);

    /* compiled from: MEATERLinkManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.O();
            Handler handler = l.f18113p;
            Runnable runnable = l.this.f18126n;
            Config.getInstance();
            handler.postDelayed(runnable, 1L);
        }
    }

    /* compiled from: MEATERLinkManager.java */
    class b implements g {
        b(l lVar) {
        }

        @Override // V4.g
        public void a(MEATERDevice mEATERDevice) {
            if (mEATERDevice.isMEATERBlock()) {
                MEATERBlock mEATERBlock = (MEATERBlock) mEATERDevice;
                mEATERBlock.setLinkConnectivityState(O4.c.f13243C);
                mEATERBlock.setConnectivityMonitor(null);
            }
        }

        @Override // V4.g
        public void b(MEATERDevice mEATERDevice, V4.a aVar) {
            if (mEATERDevice.isMEATERBlock()) {
                MEATERBlock mEATERBlock = (MEATERBlock) mEATERDevice;
                mEATERBlock.setLinkConnectivityState(O4.c.f13244D);
                mEATERBlock.setConnectivityMonitor(null);
            }
        }
    }

    /* compiled from: MEATERLinkManager.java */
    private class c implements O5.h {
        @Override // O5.h
        public void a(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
            l.this.x(bArr, mEATERLinkAddress);
        }

        private c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MEATERLinkManager.java */
    interface d {
        void a(boolean z10);
    }

    private void A(TemperatureHistoryMessage temperatureHistoryMessage, MeaterLinkHeader meaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        MEATERDevice mEATERDeviceO;
        if (mEATERLinkAddress != null) {
            U4.b.n("REC %s : TEMP-LOG (msg:%d)", mEATERLinkAddress.b(), meaterLinkHeader.messageNumber);
        } else {
            U4.b.e("REC TEMP-LOG (msg:%d)", meaterLinkHeader.messageNumber);
        }
        if (G(meaterLinkHeader, mEATERLinkAddress) && (mEATERDeviceO = M4.h.f11978a.o(temperatureHistoryMessage.deviceID.longValue())) != null && mEATERDeviceO.isMEATERProbe()) {
            Probe probe = (Probe) mEATERDeviceO;
            if (p.H(probe, temperatureHistoryMessage.history)) {
                probe.setHaveReceivedTemperatureLogFromRemote(true);
            }
        }
    }

    private void B(TemperatureHistoryRequestMessage temperatureHistoryRequestMessage, MeaterLinkHeader meaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        MEATERDevice mEATERDeviceO;
        if (mEATERLinkAddress != null) {
            U4.b.n("REC %s : TEMP-LOG-REQ (msg:%d)", mEATERLinkAddress.b(), meaterLinkHeader.messageNumber);
        } else {
            U4.b.e("REC TEMP-LOG-REQ (msg:%d)", meaterLinkHeader.messageNumber);
        }
        if (G(meaterLinkHeader, mEATERLinkAddress) && (mEATERDeviceO = M4.h.f11978a.o(temperatureHistoryRequestMessage.deviceID.longValue())) != null && mEATERDeviceO.isMEATERProbe() && mEATERDeviceO.haveMASTERConnection()) {
            Probe probe = (Probe) mEATERDeviceO;
            if (!probe.getConnectionMethod().isBluetoothConnectionMethod() || (probe.haveFetchedTemperatureLogFromBLE() && probe.getConnectionState() == DeviceConnectionState.CONNECTED)) {
                c0(probe, meaterLinkHeader, mEATERLinkAddress);
            } else {
                U4.b.n("Ignoring temp log request – we don't have a current one yet", new Object[0]);
            }
        }
    }

    private void C(V1MasterMessage v1MasterMessage, MEATERLinkAddress mEATERLinkAddress) {
        BlockInfo blockInfoFromV1MasterMessage = BlockInfo.fromV1MasterMessage(v1MasterMessage);
        if (blockInfoFromV1MasterMessage != null && J(mEATERLinkAddress, null, true)) {
            U4.b.n("REC %s (%s) : LEGACY-MASTER-MSG (msg:%d)", mEATERLinkAddress.b(), v1MasterMessage.masterType.toString(), v1MasterMessage.header.messageNum);
            long j10 = blockInfoFromV1MasterMessage.deviceID;
            DeviceConnectionMethod deviceConnectionMethod = DeviceConnectionMethod.MEATER_LINK;
            MEATERBlock mEATERBlock = (MEATERBlock) b(j10, 8, deviceConnectionMethod);
            if (mEATERBlock == null) {
                return;
            }
            mEATERBlock.setMeaterLinkAddress(mEATERLinkAddress);
            mEATERBlock.setLastSeenDate(System.currentTimeMillis());
            mEATERBlock.setFirmwareRevision(blockInfoFromV1MasterMessage.firmwareVersion.toString());
            mEATERBlock.setBatteryLevel(blockInfoFromV1MasterMessage.batteryLevel);
            mEATERBlock.setSignalLevel(blockInfoFromV1MasterMessage.wifiSignalLevel);
            mEATERBlock.setConnectionMethod(deviceConnectionMethod);
            mEATERBlock.setConnectionState(DeviceConnectionState.CONNECTED);
            mEATERBlock.setLegacy(true);
            mEATERBlock.updateState();
            M4.h.f11978a.Z(Arrays.asList(mEATERBlock));
            l(v1MasterMessage, mEATERBlock, v1MasterMessage.header.messageNum.intValue(), mEATERLinkAddress);
            C2316d.g(mEATERBlock, true);
        }
    }

    private void D(V2MasterMessage v2MasterMessage, V2MeaterLinkHeader v2MeaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        if (Config.getInstance().SUPPORT_V2_MEATER_LINK) {
            if (mEATERLinkAddress != null) {
                m(v2MasterMessage, v2MeaterLinkHeader.messageNum.intValue(), mEATERLinkAddress);
            }
            w(p.J(v2MasterMessage), p.I(v2MeaterLinkHeader), mEATERLinkAddress, true);
            return;
        }
        if (mEATERLinkAddress == null) {
            return;
        }
        V2MLBlock v2MLBlock = null;
        if (J(mEATERLinkAddress, null, true)) {
            U4.b.n("REC %s (%s) : V2-MASTER-MSG (msg:%d)", mEATERLinkAddress.b(), v2MasterMessage.masterType.toString(), v2MeaterLinkHeader.messageNum);
            MEATERBlock mEATERBlock = (MEATERBlock) b(v2MeaterLinkHeader.deviceID.longValue(), 8, DeviceConnectionMethod.MEATER_LINK);
            if (mEATERBlock == null) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= v2MasterMessage.devices.size()) {
                    break;
                }
                V2MLBlock v2MLBlock2 = v2MasterMessage.devices.get(i10).block;
                if (v2MLBlock2 != null) {
                    v2MLBlock = v2MLBlock2;
                    break;
                }
                i10++;
            }
            if (v2MLBlock == null) {
                return;
            }
            mEATERBlock.setMeaterLinkAddress(mEATERLinkAddress);
            mEATERBlock.setLastSeenDate(System.currentTimeMillis());
            mEATERBlock.setFirmwareRevision(v2MLBlock.firmwareRevision.toString());
            mEATERBlock.setBatteryLevel(v2MLBlock.batteryLevel.intValue());
            mEATERBlock.setSignalLevel(v2MLBlock.wifiSignalLevel.intValue());
            mEATERBlock.setConnectionMethod(DeviceConnectionMethod.MEATER_LINK);
            mEATERBlock.setConnectionState(DeviceConnectionState.CONNECTED);
            mEATERBlock.setLegacy(true);
            mEATERBlock.updateState();
            M4.h.f11978a.Z(Arrays.asList(mEATERBlock));
            m(v2MasterMessage, v2MeaterLinkHeader.messageNum.intValue(), mEATERLinkAddress);
            C2316d.g(mEATERBlock, true);
        }
    }

    private void E(V2TemperatureHistoryMessage v2TemperatureHistoryMessage, V2MeaterLinkHeader v2MeaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        if (mEATERLinkAddress != null) {
            U4.b.n("REC %s : TEMP-LOG (msg:%d)", mEATERLinkAddress.b(), v2MeaterLinkHeader.messageNum);
        } else {
            U4.b.e("REC TEMP-LOG (msg:%d)", v2MeaterLinkHeader.messageNum);
        }
        if (H(v2MeaterLinkHeader, mEATERLinkAddress)) {
            TemperatureHistoryMessage.Builder builder = new TemperatureHistoryMessage.Builder();
            builder.deviceID = v2TemperatureHistoryMessage.deviceID;
            TemperatureHistory.Builder builder2 = new TemperatureHistory.Builder();
            V2TemperatureHistory v2TemperatureHistory = v2TemperatureHistoryMessage.history;
            builder2.startTime = v2TemperatureHistory.startTime;
            builder2.interval = v2TemperatureHistory.interval;
            for (int i10 = 0; i10 < v2TemperatureHistoryMessage.history.values.size(); i10++) {
                TemperatureRecording.Builder builder3 = new TemperatureRecording.Builder();
                V2TemperatureRecording v2TemperatureRecording = v2TemperatureHistoryMessage.history.values.get(i10);
                builder3.internal = Integer.valueOf(Temperature.convertSixteenthResolutionToThirtyTwo(v2TemperatureRecording.internal.intValue()));
                builder3.ambient = Integer.valueOf(Temperature.convertSixteenthResolutionToThirtyTwo(v2TemperatureRecording.ambient.intValue()));
                builder2.values.add(builder3.build());
            }
            builder.history = builder2.build();
            MEATERDevice mEATERDeviceO = M4.h.f11978a.o(builder.deviceID.longValue());
            if (mEATERDeviceO == null || !mEATERDeviceO.isMEATERProbe()) {
                return;
            }
            Probe probe = (Probe) mEATERDeviceO;
            if (p.H(probe, builder.history)) {
                probe.setHaveReceivedTemperatureLogFromRemote(true);
            }
        }
    }

    private boolean F() {
        for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
            if (mEATERDevice.isMEATERBlock() && ((MEATERBlock) mEATERDevice).getConnectivityMonitor() != null) {
                return true;
            }
        }
        return false;
    }

    private boolean G(MeaterLinkHeader meaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        Integer num = meaterLinkHeader.meaterLinkIdentifier;
        MeaterLinkMajorVersion meaterLinkMajorVersion = MeaterLinkMajorVersion.MEATER_LINK_ID;
        if (!num.equals(Integer.valueOf(meaterLinkMajorVersion.getValue()))) {
            U4.b.n("Invalid ML header from %s (Got MLID %d, expected %d)", mEATERLinkAddress.b(), meaterLinkHeader.meaterLinkIdentifier, Integer.valueOf(meaterLinkMajorVersion.getValue()));
            return false;
        }
        Integer num2 = meaterLinkHeader.versionMajor;
        MeaterLinkMajorVersion meaterLinkMajorVersion2 = MeaterLinkMajorVersion.MEATER_LINK_MAJOR_LATEST;
        if (num2.equals(Integer.valueOf(meaterLinkMajorVersion2.getValue()))) {
            return true;
        }
        U4.b.n("Protocol version mismatch – %s:%d.%d local:%d.%d", mEATERLinkAddress.b(), meaterLinkHeader.versionMajor, meaterLinkHeader.versionMinor, Integer.valueOf(meaterLinkMajorVersion2.getValue()), Integer.valueOf(MeaterLinkMinorVersion.MEATER_LINK_MINOR_LATEST.getValue()));
        C2316d.F();
        return false;
    }

    private boolean H(V2MeaterLinkHeader v2MeaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        Integer num = v2MeaterLinkHeader.meaterLinkIdentifier;
        V2MeaterLinkMajorVersion v2MeaterLinkMajorVersion = V2MeaterLinkMajorVersion.V2MEATER_LINK_ID;
        if (!num.equals(Integer.valueOf(v2MeaterLinkMajorVersion.getValue()))) {
            U4.b.n("Invalid ML header from %s (Got MLID %d, expected %d)", mEATERLinkAddress.b(), v2MeaterLinkHeader.meaterLinkIdentifier, Integer.valueOf(v2MeaterLinkMajorVersion.getValue()));
            return false;
        }
        Integer num2 = v2MeaterLinkHeader.versionMajor;
        V2MeaterLinkMajorVersion v2MeaterLinkMajorVersion2 = V2MeaterLinkMajorVersion.V2MEATER_LINK_MAJOR_LATEST;
        if (num2.equals(Integer.valueOf(v2MeaterLinkMajorVersion2.getValue()))) {
            return true;
        }
        U4.b.n("Protocol version mismatch – %s:%d.%d local:%d.%d", mEATERLinkAddress.b(), v2MeaterLinkHeader.versionMajor, v2MeaterLinkHeader.versionMinor, Integer.valueOf(v2MeaterLinkMajorVersion2.getValue()), Integer.valueOf(V2MeaterLinkMajorVersion.V2MEATER_LINK_MAJOR_V1.getValue()));
        C2316d.F();
        return false;
    }

    private boolean I() {
        for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
            if (mEATERDevice.getConnectionState() != DeviceConnectionState.CONNECTED || mEATERDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD) {
                if (!DeviceChargingMethod.INSTANCE.isCharging(mEATERDevice.getChargingMethod())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean J(MEATERLinkAddress mEATERLinkAddress, MasterMessage masterMessage, boolean z10) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(byte[] bArr, Probe probe, MeaterLinkMessage meaterLinkMessage) {
        O5.i iVar = this.f13285b;
        if (iVar == null) {
            U4.b.n("udpSender IS NULL ", new Object[0]);
        } else {
            iVar.f(bArr, probe.getMeaterLinkAddress());
            U4.b.n("SENT %s : COOK-SETUP-PROP (msg:%d)", probe.getMeaterLinkAddress().b(), meaterLinkMessage.header.messageNumber);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean L(T4.p pVar) {
        if (!(pVar instanceof MEATERDevice)) {
            return true;
        }
        MEATERDevice mEATERDevice = (MEATERDevice) pVar;
        if (mEATERDevice.isMEATERBlock()) {
            return mEATERDevice.isMEATERBlock() && mEATERDevice.isReachableOverLink();
        }
        return true;
    }

    private ArrayList<MEATERLinkAddress> M() {
        ArrayList<MEATERLinkAddress> arrayList = new ArrayList<>();
        for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
            if (mEATERDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK && mEATERDevice.getMeaterLinkAddress() != null && (!mEATERDevice.isMEATERBlock() || mEATERDevice.isReachableOverLink() || !E4.i.D().X())) {
                if (!mEATERDevice.isMEATERProbe() || mEATERDevice.getParentDevice() == null || !mEATERDevice.getParentDevice().isMEATERBlock()) {
                    if (!arrayList.contains(mEATERDevice.getMeaterLinkAddress())) {
                        arrayList.add(mEATERDevice.getMeaterLinkAddress());
                    }
                }
            }
        }
        return arrayList;
    }

    private int N() {
        int i10 = this.f18122j + 1;
        this.f18122j = i10;
        if (i10 == 128) {
            this.f18122j = 0;
        }
        return this.f18122j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O() {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            M4.h r2 = M4.h.f11978a
            java.util.List r2 = r2.E()
            r1.<init>(r2)
            long r2 = java.lang.System.currentTimeMillis()
            java.util.ArrayList<V4.r> r4 = r0.f18118f
            int r4 = r4.size()
            r5 = 0
            r7 = 1
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 0
            if (r4 <= 0) goto Lc1
            int r4 = r1.size()
            if (r4 <= 0) goto Lbc
            r4 = r10
        L26:
            java.util.ArrayList<V4.r> r11 = r0.f18118f
            int r11 = r11.size()
            if (r4 >= r11) goto L99
            java.util.ArrayList<V4.r> r11 = r0.f18118f
            java.lang.Object r11 = r11.get(r4)
            V4.r r11 = (V4.r) r11
            long r12 = r11.g()
            long r12 = r2 - r12
            long r12 = r12 / r8
            com.apptionlabs.meater_app.data.Config.getInstance()
            r14 = 30
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L97
            com.apptionlabs.meater_app.udp.MEATERLinkAddress r12 = r11.f()
            java.lang.String r12 = r12.b()
            com.apptionlabs.meater_app.data.Config.getInstance()
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13}
            java.lang.String r13 = "Removing subscriber %s because we haven't had a subscription request in more than %d seconds"
            U4.b.n(r13, r12)
            java.util.ArrayList<V4.r> r12 = r0.f18118f
            r12.remove(r4)
            int r4 = r4 + (-1)
            java.util.ArrayList r12 = r11.c()
            java.util.Iterator r12 = r12.iterator()
        L6d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L97
            java.lang.Object r13 = r12.next()
            com.apptionlabs.meater_app.model.MEATERDevice r13 = (com.apptionlabs.meater_app.model.MEATERDevice) r13
            boolean r14 = r13.isMEATERProbe()
            if (r14 == 0) goto L6d
            com.apptionlabs.meater_app.model.Probe r13 = (com.apptionlabs.meater_app.model.Probe) r13
            com.apptionlabs.meater_app.model.ProbeEventLog r14 = r13.getEventLog()
            if (r14 == 0) goto L6d
            com.apptionlabs.meater_app.model.ProbeEventLog r13 = r13.getEventLog()
            com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionState r14 = com.apptionlabs.meater_app.v3protobuf.MEATERLinkClientSubscriptionState.MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_TIMEOUT
            java.util.ArrayList<V4.r> r15 = r0.f18118f
            int r15 = r15.size()
            r13.addMLSubscriptionEventForSubscriber(r11, r14, r15)
            goto L6d
        L97:
            int r4 = r4 + r7
            goto L26
        L99:
            long r11 = r0.f18120h
            long r13 = r2 - r11
            double r13 = (double) r13
            r15 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r13 = r13 / r15
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 == 0) goto Lb4
            com.apptionlabs.meater_app.data.Config.getInstance()
            r11 = 4606732058837280358(0x3fee666666666666, double:0.95)
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 <= 0) goto Lc1
        Lb4:
            java.util.ArrayList<V4.r> r4 = r0.f18118f
            r0.V(r1, r4)
            r0.f18120h = r2
            goto Lc1
        Lbc:
            java.util.ArrayList<V4.r> r1 = r0.f18118f
            r1.clear()
        Lc1:
            long r11 = r0.f18121i
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto Ld2
            long r2 = r2 - r11
            long r2 = r2 / r8
            com.apptionlabs.meater_app.data.Config.getInstance()
            r4 = 5
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto Lef
        Ld2:
            boolean r1 = r0.f18125m
            if (r1 == 0) goto Lda
            r17.T()
            goto Lef
        Lda:
            boolean r1 = r17.I()
            if (r1 == 0) goto Le7
            boolean r1 = r17.F()
            if (r1 != 0) goto Le7
            goto Le8
        Le7:
            r7 = r10
        Le8:
            java.util.ArrayList r1 = r17.M()
            r0.b0(r1, r7)
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.l.O():void");
    }

    private void Q(Probe probe) {
        O5.i iVar;
        if (probe.haveMASTERConnection()) {
            return;
        }
        byte[] bArrEncode = new V2MeaterLinkMessage.Builder().header(p.N(N())).setupMessage(p.Q(probe)).build().encode();
        if (probe.getMeaterLinkAddress() != null && (iVar = this.f13285b) != null) {
            iVar.f(bArrEncode, probe.getMeaterLinkAddress());
            U4.b.n("SENT %s : COOK-SETUP-PROPQ", probe.getMeaterLinkAddress());
        } else if (!E4.i.D().X()) {
            U4.b.n("NOT SENT %s : COOK-SETUP-PROP - Not reachable over Link or Cloud", probe.getDebugLogDescription());
        } else {
            U4.b.n("SENT %s : COOK-SETUP-PROP", probe.getDebugLogDescription());
            E4.i.D().q0(bArrEncode, probe, false);
        }
    }

    private void R(Probe probe) {
        if (probe.haveMASTERConnection()) {
            return;
        }
        byte[] bArrEncode = new V2MeaterLinkMessage.Builder().header(p.N(N())).temperatureHistoryRequestMessage(p.R(probe)).build().encode();
        if (probe.getMeaterLinkAddress() != null) {
            this.f13285b.f(bArrEncode, probe.getMeaterLinkAddress());
            U4.b.n("SENT %s : TEMP-HIST-REQ", probe.getMeaterLinkAddress());
        } else if (E4.i.D().X()) {
            E4.i.D().q0(bArrEncode, probe, false);
        }
    }

    private void S(Probe probe) {
        if (Config.getInstance().SUPPORT_V2_MEATER_LINK && probe.getParentDevice() != null && probe.getParentDevice().isMEATERBlock() && ((MEATERBlock) probe.getParentDevice()).isLegacy()) {
            R(probe);
            return;
        }
        if (probe.haveMASTERConnection()) {
            return;
        }
        MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.s(this.f18122j)).temperatureHistoryRequestMessage(p.D(probe, N())).build();
        byte[] bArrEncode = meaterLinkMessageBuild.encode();
        if (probe.isReachableOverLink()) {
            O5.i iVar = this.f13285b;
            if (iVar == null) {
                return;
            }
            iVar.f(bArrEncode, probe.getMeaterLinkAddress());
            U4.b.n("SENT %s : TEMP-HIST-REQ (msg:%d)", probe.getMeaterLinkAddress().b(), meaterLinkMessageBuild.header.messageNumber);
            return;
        }
        if (!E4.i.D().X()) {
            U4.b.n("NOT SENT %s: TEMP-HIST-REQ - Not reachable over Link or Cloud", probe.shortDeviceIDString());
        } else {
            U4.b.n("SENT %s : TEMP-HIST-REQ", probe.shortDeviceIDString());
            E4.i.D().q0(bArrEncode, probe, false);
        }
    }

    private void T() {
        if (this.f13285b == null) {
            return;
        }
        MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.s(this.f18122j)).subscriptionMessage(p.A(null, N())).build();
        this.f13285b.f(meaterLinkMessageBuild.encode(), this.f18117e);
        U4.b.n("SENT BROADCAST : SUB-REQ (msg:%d)", meaterLinkMessageBuild.header.messageNumber);
        this.f18121i = System.currentTimeMillis();
    }

    private void V(ArrayList<T4.p> arrayList, ArrayList<r> arrayList2) {
        O5.i iVar = this.f13285b;
        if (iVar == null) {
            return;
        }
        int iN = N();
        ArrayList arrayList3 = new ArrayList(arrayList);
        MasterMessage masterMessageO = p.o(arrayList3, iN);
        while (masterMessageO.devices.size() > 0) {
            MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.s(iN)).masterMessage(masterMessageO).build();
            byte[] bArrEncode = meaterLinkMessageBuild.encode();
            Iterator<r> it = arrayList2.iterator();
            while (it.hasNext()) {
                r next = it.next();
                iVar.f(bArrEncode, next.f());
                U4.b.n("SENT %s : MASTER-MSG for %d devices (msg:%d)", next.f().b(), Integer.valueOf(masterMessageO.devices.size()), meaterLinkMessageBuild.header.messageNumber);
            }
            if (arrayList3.size() == 0) {
                return;
            }
            iN = N();
            masterMessageO = p.o(arrayList3, iN);
        }
    }

    private void Y(MEATERLinkAddress mEATERLinkAddress, final byte[] bArr, final Probe probe, final MeaterLinkMessage meaterLinkMessage) {
        new Runnable() { // from class: V4.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f18108B.K(bArr, probe, meaterLinkMessage);
            }
        }.run();
    }

    private void b0(ArrayList<MEATERLinkAddress> arrayList, boolean z10) {
        O5.i iVar = this.f13285b;
        if (iVar == null) {
            return;
        }
        MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.s(this.f18122j)).subscriptionMessage(p.A((List) M4.h.f11978a.O().stream().filter(new Predicate() { // from class: V4.k
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return l.L((T4.p) obj);
            }
        }).collect(Collectors.toList()), N())).build();
        byte[] bArrEncode = meaterLinkMessageBuild.encode();
        Iterator<MEATERLinkAddress> it = arrayList.iterator();
        while (it.hasNext()) {
            MEATERLinkAddress next = it.next();
            iVar.f(bArrEncode, next);
            U4.b.n("SENT %s : SUB-REQ (msg:%d)", next.b(), meaterLinkMessageBuild.header.messageNumber);
        }
        if (z10) {
            iVar.f(bArrEncode, this.f18117e);
            U4.b.n("SENT BROADCAST : SUB-REQ (msg:%d)", meaterLinkMessageBuild.header.messageNumber);
        }
        this.f18121i = System.currentTimeMillis();
    }

    private void c0(Probe probe, MeaterLinkHeader meaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.s(this.f18122j)).temperatureHistoryMessage(p.C(probe, this.f18122j)).build();
        if (mEATERLinkAddress == null) {
            if (E4.i.D().X()) {
                E4.i.D().r0(meaterLinkMessageBuild.encode(), probe, false);
            }
        } else {
            O5.i iVar = this.f13285b;
            if (iVar == null) {
                return;
            }
            iVar.f(meaterLinkMessageBuild.encode(), mEATERLinkAddress);
            U4.b.n("SENT %s : TEMP-LOG (msg:%d)", mEATERLinkAddress.b(), meaterLinkHeader.messageNumber);
        }
    }

    public static l g0() {
        return f18114q;
    }

    private int h0() {
        Iterator<r> it = this.f18118f.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().c().size() > 0 ? 1 : 0;
        }
        return i10;
    }

    private r i0(MEATERLinkAddress mEATERLinkAddress) {
        Iterator<r> it = this.f18118f.iterator();
        while (it.hasNext()) {
            r next = it.next();
            if (next.i(mEATERLinkAddress)) {
                return next;
            }
        }
        return null;
    }

    private boolean j(MasterDevice masterDevice, MasterDevice masterDevice2) {
        for (Long l10 : masterDevice.getConnectedDevices()) {
            l10.longValue();
            if (masterDevice2.getConnectedDevices().contains(l10)) {
                return true;
            }
        }
        return false;
    }

    private boolean j0(SubscriptionMessage subscriptionMessage) {
        if (subscriptionMessage.desiredDevices.size() == 0) {
            return true;
        }
        Iterator<Long> it = subscriptionMessage.desiredDevices.iterator();
        while (it.hasNext()) {
            MEATERDevice mEATERDeviceO = M4.h.f11978a.o(it.next().longValue());
            if (mEATERDeviceO != null && mEATERDeviceO.isPaired()) {
                return true;
            }
        }
        return false;
    }

    private void k(PingPongMessage pingPongMessage, int i10, MEATERLinkAddress mEATERLinkAddress) {
        for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
            if (mEATERLinkAddress.equals(mEATERDevice.getMeaterLinkAddress()) && mEATERDevice.isMEATERBlock()) {
                MEATERBlock mEATERBlock = (MEATERBlock) mEATERDevice;
                if (mEATERBlock.isPaired() && mEATERBlock.getConnectivityMonitor() != null) {
                    mEATERBlock.getConnectivityMonitor().d(pingPongMessage, i10, mEATERLinkAddress);
                }
            }
        }
    }

    private MEATERDevice k0(MLDevice mLDevice, DeviceConnectionMethod deviceConnectionMethod, MEATERLinkAddress mEATERLinkAddress, MasterType masterType) {
        return null;
    }

    private void l(V1MasterMessage v1MasterMessage, MEATERBlock mEATERBlock, int i10, MEATERLinkAddress mEATERLinkAddress) {
        if (mEATERBlock == null || !mEATERBlock.isPaired() || mEATERBlock.getConnectivityMonitor() == null) {
            return;
        }
        mEATERBlock.getConnectivityMonitor().b(v1MasterMessage, i10, mEATERLinkAddress);
    }

    private boolean l0(ConnectionState connectionState, MEATERDevice mEATERDevice, DeviceConnectionMethod deviceConnectionMethod, MEATERLinkAddress mEATERLinkAddress, MasterType masterType, ChargingStatus chargingStatus) {
        DeviceConnectionMethod deviceConnectionMethod2;
        MEATERDevice parentDevice;
        ConnectionState connectionState2 = ConnectionState.CONNECTION_STATE_CONNECTED;
        if ((connectionState == connectionState2 || connectionState == ConnectionState.CONNECTION_STATE_FETCHING_COOK_SETUP) && ((deviceConnectionMethod == DeviceConnectionMethod.MEATER_LINK || deviceConnectionMethod == DeviceConnectionMethod.MEATER_CLOUD) && mEATERDevice.getBleConnection() != null)) {
            MEATERDevice parentDevice2 = mEATERDevice.getParentDevice() != null ? mEATERDevice.getParentDevice() : mEATERDevice;
            if (parentDevice2 == null || !parentDevice2.isMEATERBlock() || !((MEATERBlock) parentDevice2).isSupportsBLEKeepAlive()) {
                return false;
            }
        }
        MEATERDeviceType.Companion companion = MEATERDeviceType.INSTANCE;
        if (companion.masterTypeIsBlock(masterType) && deviceConnectionMethod == DeviceConnectionMethod.MEATER_CLOUD && (parentDevice = mEATERDevice.getParentDevice()) != null && parentDevice.isMEATERBlock() && parentDevice.getConnectionState() == DeviceConnectionState.CONNECTED && parentDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK) {
            return false;
        }
        if (mEATERDevice.isMEATERBlock() && ((MEATERBlock) mEATERDevice).hasBLEKeepAlive() && connectionState == connectionState2) {
            mEATERDevice.setConnectionState(DeviceConnectionState.CONNECTED);
            mEATERDevice.setMeaterLinkAddress(mEATERLinkAddress);
            return true;
        }
        if (!mEATERDevice.getShouldShowAsConnected() && connectionState == ConnectionState.CONNECTION_STATE_FETCHING_COOK_SETUP && mEATERDevice.isMEATERProbe()) {
            ((Probe) mEATERDevice).setLoadingState(O4.d.DeviceLoadingStateLoading);
        }
        if (mEATERDevice.getConnectionMethod() == deviceConnectionMethod || mEATERDevice.getConnectionState() != DeviceConnectionState.CONNECTED) {
            if (mEATERDevice.getConnectionMethod() == deviceConnectionMethod && deviceConnectionMethod == DeviceConnectionMethod.MEATER_LINK && connectionState == ConnectionState.CONNECTION_STATE_OFFLINE && !Objects.equals(mEATERDevice.getMeaterLinkAddress(), mEATERLinkAddress)) {
                return false;
            }
        } else if (connectionState != connectionState2 || deviceConnectionMethod == (deviceConnectionMethod2 = DeviceConnectionMethod.MEATER_CLOUD) || mEATERDevice.getConnectionMethod() != deviceConnectionMethod2) {
            return false;
        }
        if (companion.masterTypeIsBlock(masterType) && mEATERDevice.isMEATERProbe() && connectionState == ConnectionState.CONNECTION_STATE_OFFLINE) {
            Probe probe = (Probe) mEATERDevice;
            DeviceChargingMethod.Companion companion2 = DeviceChargingMethod.INSTANCE;
            if (companion2.isCharging(mEATERDevice.getChargingMethod()) && chargingStatus == ChargingStatus.NOT_CHARGING) {
                probe.setLoadingState(O4.d.DeviceLoadingStateLoaded);
                mEATERDevice.setMeaterLinkAddress(mEATERLinkAddress);
                mEATERDevice.setChargingMethod(DeviceChargingMethod.fromValue(chargingStatus.getValue()));
                mEATERDevice.attemptToReconnect();
                return true;
            }
            if (mEATERDevice.getChargingMethod() == DeviceChargingMethod.DeviceChargingMethodUnknown && companion2.isCharging(DeviceChargingMethod.fromValue(chargingStatus.getValue()))) {
                mEATERDevice.setChargingMethod(DeviceChargingMethod.fromValue(chargingStatus.getValue()));
                mEATERDevice.disconnectImmediately();
                return false;
            }
        }
        mEATERDevice.setChargingMethod(DeviceChargingMethod.fromValue(chargingStatus.getValue()));
        DeviceConnectionState connectionState3 = mEATERDevice.getConnectionState();
        DeviceConnectionState deviceConnectionState = DeviceConnectionState.CONNECTED;
        if (connectionState3 == deviceConnectionState || connectionState != connectionState2) {
            if (mEATERDevice.getConnectionState() == deviceConnectionState && connectionState == ConnectionState.CONNECTION_STATE_OFFLINE) {
                mEATERDevice.setConnectionState(DeviceConnectionState.OFFLINE);
                if (mEATERDevice.isPaired() && mEATERDevice.isMEATERProbe()) {
                    Probe probe2 = (Probe) mEATERDevice;
                    if (probe2.getCookState().getValue() > DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) {
                        probe2.showConnectionLostWarning();
                    }
                }
            }
        } else {
            if (companion.masterTypeIsBlock(masterType) && mEATERDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK && deviceConnectionMethod == DeviceConnectionMethod.MEATER_CLOUD && mEATERDevice.getConnectionState() == DeviceConnectionState.OFFLINE && (System.currentTimeMillis() - mEATERDevice.getLastSeenDate()) / 1000 < 10) {
                return false;
            }
            mEATERDevice.setConnectionState(deviceConnectionState);
        }
        if (!mEATERDevice.getShouldShowAsConnected() && mEATERDevice.isMEATERProbe()) {
            Probe probe3 = (Probe) mEATERDevice;
            if (connectionState == ConnectionState.CONNECTION_STATE_FETCHING_COOK_SETUP) {
                probe3.setLoadingState(O4.d.DeviceLoadingStateLoading);
            } else if (connectionState == connectionState2) {
                probe3.setLoadingState(O4.d.DeviceLoadingStateLoaded);
            } else {
                probe3.setLoadingState(O4.d.DeviceLoadingStateNotLoading);
            }
        }
        if (connectionState != connectionState2 && connectionState != ConnectionState.CONNECTION_STATE_FETCHING_COOK_SETUP) {
            return false;
        }
        mEATERDevice.setMeaterLinkAddress(mEATERLinkAddress);
        return true;
    }

    private void m(V2MasterMessage v2MasterMessage, int i10, MEATERLinkAddress mEATERLinkAddress) {
        MEATERBlock mEATERBlock;
        Iterator<V2MLDevice> it = v2MasterMessage.devices.iterator();
        while (it.hasNext()) {
            V2MLBlock v2MLBlock = it.next().block;
            if (v2MLBlock != null && (mEATERBlock = (MEATERBlock) b(v2MLBlock.identifier.longValue(), 8, DeviceConnectionMethod.MEATER_LINK)) != null && mEATERBlock.isPaired() && mEATERBlock.getConnectivityMonitor() != null) {
                mEATERBlock.getConnectivityMonitor().c(v2MasterMessage, i10, mEATERLinkAddress);
            }
        }
    }

    private MEATERDevice m0(MLDevice mLDevice, DeviceConnectionMethod deviceConnectionMethod, MEATERLinkAddress mEATERLinkAddress, MasterType masterType) {
        Integer num;
        MLBlock mLBlock = mLDevice.block;
        MEATERBlock mEATERBlock = (MEATERBlock) b(mLDevice.identifier.longValue(), mLDevice.probeNumber.intValue(), deviceConnectionMethod);
        if (mEATERBlock == null) {
            return null;
        }
        if (!l0(mLDevice.connectionState, mEATERBlock, deviceConnectionMethod, mEATERLinkAddress, masterType, mLDevice.chargeState.chargingStatus)) {
            return mEATERBlock;
        }
        mEATERBlock.setLastSeenDate(System.currentTimeMillis());
        if (mEATERBlock.getFirstSeenAdvertising() == 0) {
            mEATERBlock.setFirstSeenAdvertising(System.currentTimeMillis());
        }
        String str = mLDevice.firmwareRevision;
        if (str != null) {
            mEATERBlock.setFirmwareRevision(str);
        }
        mEATERBlock.setBatteryLevel(mLDevice.chargeState.batteryLevelPercent.intValue());
        mEATERBlock.setMeaterLinkAddress(mEATERLinkAddress);
        mEATERBlock.setChargingMethod(DeviceChargingMethod.fromValue(mLDevice.chargeState.chargingStatus.getValue()));
        Integer num2 = mLDevice.wifiSignalLevel;
        if (num2 != null) {
            mEATERBlock.setSignalLevel(num2.intValue());
        }
        mEATERBlock.setConnectionMethod(deviceConnectionMethod);
        if (mLBlock != null && (num = mLBlock.ambientTemperature) != null) {
            mEATERBlock.setAmbientTemperature(num.intValue());
        }
        if (mLBlock != null) {
            for (int i10 = 0; i10 < mLBlock.probeChargingStates.size(); i10++) {
            }
        }
        if (!mEATERBlock.isPaired()) {
            return mEATERBlock;
        }
        mEATERBlock.updateState();
        return mEATERBlock;
    }

    private void n(MasterMessage masterMessage, int i10, MEATERLinkAddress mEATERLinkAddress) {
        MEATERBlock mEATERBlock;
        for (MLDevice mLDevice : masterMessage.devices) {
            if (mLDevice.block != null && (mEATERBlock = (MEATERBlock) b(mLDevice.identifier.longValue(), mLDevice.probeNumber.intValue(), DeviceConnectionMethod.MEATER_LINK)) != null && mEATERBlock.isPaired()) {
                if (mEATERBlock.getConnectivityMonitor() != null) {
                    mEATERBlock.getConnectivityMonitor().a(masterMessage, i10, mEATERLinkAddress);
                } else if (mEATERBlock.getLinkConnectivityState() == O4.c.f13242B) {
                    mEATERBlock.setMeaterLinkAddress(mEATERLinkAddress);
                    mEATERBlock.setConnectivityMonitor(new f(mEATERBlock, this.f18127o, false));
                }
            }
        }
    }

    private MEATERDevice n0(MLDevice mLDevice, DeviceConnectionMethod deviceConnectionMethod, MEATERLinkAddress mEATERLinkAddress, MasterType masterType) {
        Probe probeRelatedProbe;
        MLPlus mLPlus = mLDevice.plus;
        MEATERPlus mEATERPlus = (MEATERPlus) b(mLDevice.identifier.longValue(), mLDevice.probeNumber.intValue(), deviceConnectionMethod);
        if (mEATERPlus == null) {
            return null;
        }
        ConnectionState connectionState = mLDevice.connectionState;
        ChargeState chargeState = mLPlus.probeChargingState;
        if (!l0(connectionState, mEATERPlus, deviceConnectionMethod, mEATERLinkAddress, masterType, chargeState != null ? chargeState.chargingStatus : ChargingStatus.NOT_CHARGING)) {
            return mEATERPlus;
        }
        mEATERPlus.setBatteryLevel(mLDevice.chargeState.batteryLevelPercent.intValue());
        mEATERPlus.setChargingMethod(DeviceChargingMethod.fromValue(mLDevice.chargeState.chargingStatus.getValue()));
        if (mLDevice.bleSignalLevel.intValue() != 0) {
            mEATERPlus.setSignalLevel(mLDevice.bleSignalLevel.intValue());
        } else {
            mEATERPlus.setSignalLevel(-127);
        }
        mEATERPlus.setConnectionMethod(deviceConnectionMethod);
        mEATERPlus.setLastSeenDate(System.currentTimeMillis());
        String str = mLDevice.firmwareRevision;
        if (str != null) {
            mEATERPlus.setFirmwareRevision(str);
            if (mEATERPlus.needsFirmwareUpdate()) {
                C2316d.g(mEATERPlus, false);
            }
        }
        Integer num = mLPlus.ambientTemperature;
        if (num != null) {
            mEATERPlus.setAmbientTemperature(num.intValue());
        }
        if (mLPlus.probeChargingState != null && (probeRelatedProbe = mEATERPlus.relatedProbe()) != null) {
            probeRelatedProbe.setBatteryLevel(mLPlus.probeChargingState.batteryLevelPercent.intValue());
            probeRelatedProbe.setChargingMethod(DeviceChargingMethod.fromValue(mLPlus.probeChargingState.chargingStatus.getValue()));
        }
        if (!mEATERPlus.isPaired()) {
            return mEATERPlus;
        }
        mEATERPlus.updateState();
        return mEATERPlus;
    }

    private List<MEATERDevice> o(MEATERDevice mEATERDevice, MasterMessage masterMessage, DeviceConnectionMethod deviceConnectionMethod) {
        Probe probe;
        ArrayList arrayList = new ArrayList();
        for (MLDevice mLDevice : masterMessage.devices) {
            if (mEATERDevice.isMEATERBlock() && mLDevice.block != null && mEATERDevice.getDeviceID() == mLDevice.identifier.longValue()) {
                MLBlock mLBlock = mLDevice.block;
                List<MLChildDevice> list = mLBlock.childProbes;
                if (list != null && list.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (MLChildDevice mLChildDevice : mLBlock.childProbes) {
                        MEATERDevice mEATERDeviceB = b(mLChildDevice.identifier.longValue(), mLChildDevice.probeNumber.intValue(), deviceConnectionMethod);
                        if (mEATERDeviceB != null) {
                            arrayList2.add(mEATERDeviceB);
                        }
                    }
                    return arrayList2;
                }
            } else if (mEATERDevice.isMEATERPlus() && mLDevice.plus != null && mEATERDevice.getDeviceID() == mLDevice.identifier.longValue()) {
                MLPlus mLPlus = mLDevice.plus;
                MLChildDevice mLChildDevice2 = mLPlus.childProbe;
                if (mLChildDevice2 != null) {
                    MEATERDevice mEATERDeviceB2 = b(mLChildDevice2.identifier.longValue(), mLPlus.childProbe.probeNumber.intValue(), deviceConnectionMethod);
                    if (mEATERDeviceB2 == null) {
                        return new ArrayList();
                    }
                    mEATERDeviceB2.setParentDeviceID(mEATERDevice.getDeviceID());
                    return Arrays.asList(mEATERDeviceB2);
                }
            } else {
                MLProbe mLProbe = mLDevice.probe;
                if (mLProbe != null && mLProbe.parentIdentifier.longValue() == mEATERDevice.getDeviceID() && (probe = (Probe) b(mLDevice.identifier.longValue(), mLDevice.probeNumber.intValue(), deviceConnectionMethod)) != null) {
                    if (mEATERDevice.isMEATERPlus()) {
                        return Arrays.asList(probe);
                    }
                    arrayList.add(probe);
                }
            }
        }
        return arrayList;
    }

    private MEATERDevice o0(MLDevice mLDevice, DeviceConnectionMethod deviceConnectionMethod, MEATERLinkAddress mEATERLinkAddress, MasterType masterType, d dVar) {
        MLProbe mLProbe = mLDevice.probe;
        Probe probe = (Probe) b(mLDevice.identifier.longValue(), mLDevice.probeNumber.intValue(), deviceConnectionMethod);
        if (probe == null) {
            return null;
        }
        probe.setBatteryLevel(mLDevice.chargeState.batteryLevelPercent.intValue());
        if (!l0(mLDevice.connectionState, probe, deviceConnectionMethod, mEATERLinkAddress, masterType, mLDevice.chargeState.chargingStatus)) {
            return probe;
        }
        probe.setChargingMethod(DeviceChargingMethod.fromValue(mLDevice.chargeState.chargingStatus.getValue()));
        probe.setParentDeviceID(mLProbe.parentIdentifier.longValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = mLDevice.firmwareRevision;
        if (str != null) {
            probe.setFirmwareRevision(str);
        }
        Integer num = mLDevice.bleSignalLevel;
        if (num == null || num.intValue() == 0) {
            probe.setSignalLevel(-127);
        } else {
            probe.setSignalLevel(mLDevice.bleSignalLevel.intValue());
        }
        if (probe.getProbeNumber() != mLDevice.probeNumber.intValue()) {
            probe.setProbeNumber(mLDevice.probeNumber.intValue());
        }
        probe.setConnectionMethod(deviceConnectionMethod);
        probe.setLastSeenDate(jCurrentTimeMillis);
        if (!probe.isPaired()) {
            return probe;
        }
        int value = probe.getCookState().getValue();
        DeviceCookState deviceCookState = DeviceCookState.COOK_STATE_NOT_STARTED;
        boolean z10 = value > deviceCookState.getValue();
        h hVarF = p.F(probe, mLProbe.setup, s.REMOTE_DEVICE);
        if (hVarF == h.ACCEPTED) {
            if (probe.getConnectionState() != DeviceConnectionState.CONNECTED) {
                probe.setLastTemperatureLogRequestTime(0L);
                probe.setHaveReceivedTemperatureLogFromRemote(false);
            } else if (!probe.haveReceivedTemperatureLogFromRemote() && probe.getCookState().getValue() > deviceCookState.getValue() && (jCurrentTimeMillis - probe.getLastTemperatureLogRequestTime()) / 1000 > 10) {
                probe.setLastTemperatureLogRequestTime(jCurrentTimeMillis);
                S(probe);
            }
            if (probe.getOngoingRecipeID() != -1 && probe.getCookState().getValue() == deviceCookState.getValue()) {
                U4.b.n("Probe has OnGoingRecipe ID " + probe.getOngoingRecipeID() + " set but Cook is not Configured", new Object[0]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finishing OnGoing Recipe from Table ");
                sb2.append(probe.getOngoingRecipeID());
                U4.b.n(sb2.toString(), new Object[0]);
                K4.a.f8678a.b(probe.getOngoingRecipeID());
                probe.setOngoingRecipeID(-1L);
            }
            if (probe.getRecipeId() > 0) {
                probe.setOnGoingRecipeStepTitle(x5.g.f52863a.i(probe.getRecipeId(), probe.getRecipeStepID()));
            }
        } else if (probe.getCookID() != 0 && (probe.getCookState().getValue() > deviceCookState.getValue() || hVarF == h.REJECTED_OUT_OF_DATE)) {
            P(probe);
        }
        p.G(probe, mLProbe.status);
        probe.updateState();
        dVar.a(!z10 && (probe.getCookState().getValue() > deviceCookState.getValue()));
        return probe;
    }

    private MEATERDevice p(MLDevice mLDevice, DeviceConnectionMethod deviceConnectionMethod, MEATERLinkAddress mEATERLinkAddress, MasterMessage masterMessage, d dVar) {
        if (mLDevice.probe != null) {
            return o0(mLDevice, deviceConnectionMethod, mEATERLinkAddress, masterMessage.masterType, dVar);
        }
        if (mLDevice.plus != null) {
            return n0(mLDevice, deviceConnectionMethod, mEATERLinkAddress, masterMessage.masterType);
        }
        if (mLDevice.block != null) {
            if (J(mEATERLinkAddress, masterMessage, false)) {
                return m0(mLDevice, deviceConnectionMethod, mEATERLinkAddress, masterMessage.masterType);
            }
            return null;
        }
        if (mLDevice.amber != null) {
            return k0(mLDevice, deviceConnectionMethod, mEATERLinkAddress, masterMessage.masterType);
        }
        return null;
    }

    private void q(MasterMessage masterMessage) {
        MLDevice mLDevice = masterMessage.devices.get(0);
        if (mLDevice.block == null) {
            return;
        }
        M4.h hVar = M4.h.f11978a;
        ArrayList<Long> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        MEATERBlock mEATERBlock = (MEATERBlock) hVar.o(mLDevice.identifier.longValue());
        if (mEATERBlock == null || !mEATERBlock.isPaired()) {
            return;
        }
        for (int i10 = 0; i10 < masterMessage.devices.size(); i10++) {
            if (i10 != 0) {
                Long l10 = masterMessage.devices.get(i10).identifier;
                long jLongValue = l10.longValue();
                arrayList.add(l10);
                Probe probe = (Probe) hVar.o(jLongValue);
                if (probe != null && probe.getConnectionMethod().isBluetoothConnectionMethod() && probe.getConnectionState() == DeviceConnectionState.CONNECTED) {
                    arrayList2.add(probe);
                }
            }
        }
        mEATERBlock.setPairedProbeIdentifiers(arrayList);
        if (arrayList2.size() != 0 && (System.currentTimeMillis() - mEATERBlock.getFirstSeenAdvertising()) / 1000.0d <= 30.0d) {
            U4.b.a("Device %s wants probes that we have connected via BLE", mEATERBlock.getDebugLogDescription());
            M4.h.connectDirectlyToBlockProbes = O4.a.f13232B;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Probe probe2 = (Probe) it.next();
                U4.b.a("Disconnecting from %s to give %s a chance to connect", probe2.getDebugLogDescription(), mEATERBlock.getDebugLogDescription());
                probe2.disconnectImmediately();
                probe2.setFirstSeenAdvertising(0L);
                probe2.setConnectionState(DeviceConnectionState.ATTEMPTING_RECONNECT);
                probe2.updateState();
            }
        }
    }

    private void v(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
        U4.b.n("Trying v2 ML protocol", new Object[0]);
        try {
            V2MeaterLinkMessage v2MeaterLinkMessageDecode = V2MeaterLinkMessage.ADAPTER.decode(bArr);
            if (v2MeaterLinkMessageDecode.networkSettingsMessage != null) {
                U4.b.n("Received invalid ML message from %s", mEATERLinkAddress.b());
            }
            V2MasterMessage v2MasterMessage = v2MeaterLinkMessageDecode.masterMessage;
            if (v2MasterMessage != null && v2MasterMessage.masterType == V2MasterType.V2MASTER_TYPE_BLOCK) {
                D(v2MasterMessage, v2MeaterLinkMessageDecode.header, mEATERLinkAddress);
            }
            if (v2MeaterLinkMessageDecode.temperatureHistoryRequestMessage != null) {
                U4.b.n("Received invalid ML message from %s", mEATERLinkAddress.b());
            }
            V2TemperatureHistoryMessage v2TemperatureHistoryMessage = v2MeaterLinkMessageDecode.temperatureHistoryMessage;
            if (v2TemperatureHistoryMessage != null) {
                V2MeaterLinkHeader v2MeaterLinkHeader = v2MeaterLinkMessageDecode.header;
                if (v2MeaterLinkHeader.deviceID != null) {
                    E(v2TemperatureHistoryMessage, v2MeaterLinkHeader, mEATERLinkAddress);
                    return;
                }
            }
            V2NetworkSettingsMessage v2NetworkSettingsMessage = v2MeaterLinkMessageDecode.networkSettingsMessage;
            if (v2NetworkSettingsMessage == null || v2MeaterLinkMessageDecode.header.deviceID == null) {
                return;
            }
            this.f18116d.b(v2NetworkSettingsMessage.networkSettings);
        } catch (Exception unused) {
            U4.b.n("Trying v1 ML protocol", new Object[0]);
            try {
                V1MasterMessage v1MasterMessage = V1MeaterLinkMessage.ADAPTER.decode(bArr).masterMessage;
                if (v1MasterMessage != null) {
                    C(v1MasterMessage, mEATERLinkAddress);
                }
            } catch (Exception unused2) {
                U4.b.n("Received invalid ML message from %s", mEATERLinkAddress.b());
            }
        }
    }

    private void w(MasterMessage masterMessage, MeaterLinkHeader meaterLinkHeader, MEATERLinkAddress mEATERLinkAddress, boolean z10) {
        Long l10;
        DeviceConnectionMethod deviceConnectionMethod = mEATERLinkAddress != null ? DeviceConnectionMethod.MEATER_LINK : DeviceConnectionMethod.MEATER_CLOUD;
        boolean z11 = false;
        if (deviceConnectionMethod == DeviceConnectionMethod.MEATER_LINK) {
            if (!z10) {
                n(masterMessage, meaterLinkHeader.messageNumber.intValue(), mEATERLinkAddress);
            }
            if (meaterLinkHeader.messageNumber.intValue() == (this.f18123k.containsKey(mEATERLinkAddress.b()) ? this.f18123k.get(mEATERLinkAddress.b()).intValue() : 0)) {
                U4.b.n("Got duplicate!", new Object[0]);
                return;
            } else {
                this.f18123k.put(mEATERLinkAddress.b(), meaterLinkHeader.messageNumber);
                U4.b.n("REC %s (%s) : MASTER-MSG (msg:%d)", mEATERLinkAddress.b(), masterMessage.masterType.toString(), meaterLinkHeader.messageNumber);
            }
        } else if (meaterLinkHeader.deviceID != null && ThisDevice.INSTANCE.getDeviceID() == meaterLinkHeader.deviceID.longValue()) {
            return;
        } else {
            U4.b.n("REC MASTER-MSG (msg:%d)", meaterLinkHeader.messageNumber);
        }
        if (Config.getInstance().SUPPORT_V2_MEATER_LINK || G(meaterLinkHeader, mEATERLinkAddress)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            M4.h hVar = M4.h.f11978a;
            boolean z12 = false;
            for (MLDevice mLDevice : masterMessage.devices) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(z11);
                M4.h hVar2 = hVar;
                MEATERDevice mEATERDeviceP = p(mLDevice, deviceConnectionMethod, mEATERLinkAddress, masterMessage, new d() { // from class: V4.j
                    @Override // V4.l.d
                    public final void a(boolean z13) {
                        atomicBoolean.set(z13);
                    }
                });
                if (mEATERDeviceP != null) {
                    arrayList.add(mEATERDeviceP);
                    mEATERDeviceP.setCloudConnectionState(masterMessage.cloudConnectionState);
                    if (mEATERDeviceP.isMEATERBlock()) {
                        ((MEATERBlock) mEATERDeviceP).setLegacy(z10);
                        arrayList2.add(mEATERDeviceP);
                    } else if (mEATERDeviceP.isMEATERPlus()) {
                        arrayList2.add(mEATERDeviceP);
                    } else if ((mEATERDeviceP.getParentDeviceID() != 0 ? hVar2.o(mEATERDeviceP.getParentDeviceID()) : null) == null) {
                        arrayList3.add(mEATERDeviceP);
                    }
                    z12 |= atomicBoolean.get();
                }
                hVar = hVar2;
                z11 = false;
            }
            M4.h hVar3 = hVar;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                MEATERDevice mEATERDevice = (MEATERDevice) it.next();
                List<MEATERDevice> listO = o(mEATERDevice, masterMessage, deviceConnectionMethod);
                arrayList.addAll(listO);
                if (mEATERDevice.isMEATERBlock()) {
                    if (listO.size() > 0) {
                        hVar3.a0(listO, (MEATERBlock) mEATERDevice);
                    }
                    if (mEATERDevice.getMEATERDeviceType() != MEATERDeviceType.BLOCK) {
                        for (MEATERDevice mEATERDevice2 : listO) {
                            if (mEATERDevice2.getParentDevice() == null) {
                                mEATERDevice2.setParentDevice(mEATERDevice);
                            }
                        }
                    }
                    if (mEATERDevice.needsFirmwareUpdate()) {
                        C2316d.g(mEATERDevice, false);
                    }
                } else {
                    arrayList3.add(mEATERDevice);
                    arrayList3.addAll(listO);
                }
            }
            hVar3.Z(arrayList3);
            if (deviceConnectionMethod == DeviceConnectionMethod.MEATER_LINK) {
                q(masterMessage);
            }
            if (meaterLinkHeader != null && (l10 = meaterLinkHeader.deviceID) != null) {
                long jLongValue = l10.longValue();
                String strB = mEATERLinkAddress != null ? mEATERLinkAddress.b() : "null";
                MasterDevice masterDevice = new MasterDevice(masterMessage, jLongValue, mEATERLinkAddress);
                U4.b.n("MASTER DEBUG : SENT %s : MASTER-DeviceId %d =: deviceConnected in msg %d master type = %s", strB, l10, Integer.valueOf(masterMessage.devices.size()), masterMessage.masterType);
                MasterDevice masterDeviceI = i(masterDevice);
                if (masterDeviceI != null) {
                    U4.b.n("MASTER DEBUG : Updating master device id   %s : connected device before updated ", masterDeviceI.getDeviceIDString(), Integer.valueOf(masterDeviceI.getConnectedDevices().size()));
                    masterDeviceI.update(masterMessage, jLongValue);
                }
            }
            if (z12) {
                G.INSTANCE.a();
            }
        }
    }

    private void y(SetupMessage setupMessage, MeaterLinkHeader meaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        MEATERDevice mEATERDeviceO;
        if (mEATERLinkAddress != null) {
            U4.b.n("REC %s : COOK-SETUP-PROP (msg:%d)", mEATERLinkAddress.b(), meaterLinkHeader.messageNumber);
        } else {
            U4.b.e("REC COOK-SETUP-PROP (msg:%d)", meaterLinkHeader.messageNumber);
        }
        if (G(meaterLinkHeader, mEATERLinkAddress) && (mEATERDeviceO = M4.h.f11978a.o(setupMessage.deviceID.longValue())) != null && mEATERDeviceO.isMEATERProbe() && mEATERDeviceO.haveMASTERConnection()) {
            Probe probe = (Probe) mEATERDeviceO;
            int value = probe.getCookState().getValue();
            DeviceCookState deviceCookState = DeviceCookState.COOK_STATE_NOT_STARTED;
            boolean z10 = value > deviceCookState.getValue();
            long cookID = probe.getCookID();
            if (p.F(probe, setupMessage.setup, s.REMOTE_DEVICE) == h.ACCEPTED) {
                c0 c0Var = (c0) probe.getBleConnection();
                if (cookID != probe.getCookID()) {
                    c0Var.g0();
                } else {
                    c0Var.i0();
                }
                probe.updateState();
            }
            this.f18120h = 0L;
            if (z10 || probe.getCookState().getValue() <= deviceCookState.getValue()) {
                return;
            }
            G.INSTANCE.a();
        }
    }

    private void z(SubscriptionMessage subscriptionMessage, MeaterLinkHeader meaterLinkHeader, MEATERLinkAddress mEATERLinkAddress) {
        U4.b.n("REC %s (%s) : SUB-REQ (msg:%d)", mEATERLinkAddress.b(), subscriptionMessage.clientType, meaterLinkHeader.messageNumber);
        if (G(meaterLinkHeader, mEATERLinkAddress)) {
            if (!j0(subscriptionMessage)) {
                U4.b.n("%s IS NOT INTERESTED IN OUR PROBES", mEATERLinkAddress.b());
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            r rVarI0 = i0(mEATERLinkAddress);
            if (rVarI0 == null) {
                rVarI0 = new r(mEATERLinkAddress);
                this.f18118f.add(rVarI0);
                rVarI0.m(subscriptionMessage.emailAddress);
                rVarI0.l(subscriptionMessage.deviceInfo);
                rVarI0.p(subscriptionMessage.osVersion);
                rVarI0.j(subscriptionMessage.appVersion);
                rVarI0.k(subscriptionMessage.clientType);
                rVarI0.o(jCurrentTimeMillis);
                this.f18120h = 0L;
            } else {
                rVarI0.o(jCurrentTimeMillis);
            }
            List<MEATERDevice> listE = M4.h.f11978a.E();
            Iterator<Long> it = subscriptionMessage.desiredDevices.iterator();
            while (it.hasNext()) {
                MEATERDevice mEATERDeviceO = M4.h.f11978a.o(it.next().longValue());
                if (!listE.contains(mEATERDeviceO)) {
                    return;
                }
                if (!rVarI0.c().contains(mEATERDeviceO)) {
                    if (mEATERDeviceO.isMEATERProbe()) {
                        Probe probe = (Probe) mEATERDeviceO;
                        if (probe.getEventLog() != null) {
                            probe.getEventLog().addMLSubscriptionEventForSubscriber(rVarI0, MEATERLinkClientSubscriptionState.MEATER_LINK_CLIENT_SUBSCRIPTION_STATE_SUBSCRIBE, h0());
                        }
                    }
                    rVarI0.c().add(mEATERDeviceO);
                }
            }
        }
    }

    public void P(Probe probe) {
        if (Config.getInstance().SUPPORT_V2_MEATER_LINK && probe.getParentDevice() != null && probe.getParentDevice().isMEATERBlock() && ((MEATERBlock) probe.getParentDevice()).isLegacy()) {
            Q(probe);
            return;
        }
        if (probe.haveMASTERConnection()) {
            if (E4.i.D().X()) {
                E4.i.D().j0(probe);
                return;
            }
            return;
        }
        MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.s(this.f18122j)).setupMessage(p.z(probe, N())).build();
        byte[] bArrEncode = meaterLinkMessageBuild.encode();
        MEATERLinkAddress meaterLinkAddress = probe.getMeaterLinkAddress();
        if (meaterLinkAddress != null) {
            Y(meaterLinkAddress, bArrEncode, probe, meaterLinkMessageBuild);
        } else if (E4.i.D().X()) {
            E4.i.D().q0(bArrEncode, probe, false);
        }
    }

    public void U(MEATERLinkAddress mEATERLinkAddress, String str) {
        if (mEATERLinkAddress == null || str == null || this.f13285b == null) {
            return;
        }
        MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.s(0)).blockFirmwareUpdateMessage(p.b(str)).build();
        this.f13285b.f(meaterLinkMessageBuild.encode(), mEATERLinkAddress);
        U4.b.n("SENT %s : BLOCK-FW-UPDATE-MSG (msg:%d)", mEATERLinkAddress.b(), meaterLinkMessageBuild.header.messageNumber);
    }

    public void W(MasterDevice masterDevice) {
        int iN = N();
        this.f18122j = iN;
        this.f18115c.c(masterDevice, this.f13285b, iN);
    }

    public void X(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
        O5.i iVar = this.f13285b;
        if (iVar == null) {
            return;
        }
        iVar.f(bArr, mEATERLinkAddress);
    }

    public void Z(MEATERDevice mEATERDevice, boolean z10) {
        if (mEATERDevice == null) {
            return;
        }
        int iN = N();
        this.f18122j = iN;
        this.f18116d.c(mEATERDevice, this.f13285b, iN, z10);
    }

    @Override // O5.k
    public void a() {
        if (this.f13284a == null) {
            return;
        }
        U4.b.n("Closing socket...", new Object[0]);
        f18113p.removeCallbacks(this.f18126n);
        super.a();
    }

    public void a0(int i10, MEATERLinkAddress mEATERLinkAddress) {
        O5.i iVar;
        MeaterLinkMessage meaterLinkMessageBuild = new MeaterLinkMessage.Builder().header(p.s(this.f18122j)).pingPongMessage(new PingPongMessage.Builder().type(PingPongMessageType.PING).value(Integer.valueOf(i10)).build()).build();
        byte[] bArrEncode = meaterLinkMessageBuild.encode();
        if (mEATERLinkAddress == null || (iVar = this.f13285b) == null) {
            return;
        }
        iVar.f(bArrEncode, mEATERLinkAddress);
        U4.b.n("SENT %s : PingPongMessage message (msg:%d)", mEATERLinkAddress, meaterLinkMessageBuild.header.messageNumber);
    }

    @Override // O5.k
    public void c() {
        if (this.f13284a != null) {
            return;
        }
        U4.b.n("Opening socket...", new Object[0]);
        Handler handler = f18113p;
        handler.removeCallbacks(this.f18126n);
        super.a();
        O5.g gVar = new O5.g(ProtocolParameters.MEATER_LINK_UDP_PORT, this.f18124l);
        this.f13284a = gVar;
        gVar.start();
        this.f13285b = O5.i.c(this.f13284a.g());
        Runnable runnable = this.f18126n;
        Config.getInstance();
        handler.postDelayed(runnable, 1L);
        super.c();
    }

    public void d0(MEATERLinkAddress mEATERLinkAddress, String str) {
        if (this.f13285b == null) {
            return;
        }
        V1BlockFirmwareUpdateMessage v1BlockFirmwareUpdateMessageK = p.K(str);
        this.f13285b.f(new V1MeaterLinkMessage.Builder().blockFirmwareUpdateMessage(v1BlockFirmwareUpdateMessageK).build().encode(), mEATERLinkAddress);
        if (mEATERLinkAddress == null || mEATERLinkAddress.b() == null) {
            U4.b.n("SENT : LEGACY-BLOCK-FW-UPDATE-MSG (null address object or ipAddress)", new Object[0]);
        } else {
            U4.b.n("SENT %s : LEGACY-BLOCK-FW-UPDATE-MSG (msg:%d)", mEATERLinkAddress.b(), v1BlockFirmwareUpdateMessageK.header.messageNum);
        }
    }

    public void e0(MEATERLinkAddress mEATERLinkAddress, String str) {
        if (mEATERLinkAddress == null || str == null) {
            return;
        }
        V2MeaterLinkMessage v2MeaterLinkMessageBuild = new V2MeaterLinkMessage.Builder().header(p.N(0)).blockFirmwareUpdateMessage(p.M(str)).build();
        this.f13285b.f(v2MeaterLinkMessageBuild.encode(), mEATERLinkAddress);
        U4.b.n("SENT %s : BLOCK-FW-UPDATE-MSG (msg:%d)", mEATERLinkAddress.b(), v2MeaterLinkMessageBuild.header.messageNum);
    }

    public void f0(boolean z10) {
        this.f18125m = z10;
    }

    public MasterDevice i(MasterDevice masterDevice) {
        if (masterDevice.getDeviceID() == ThisDevice.INSTANCE.getDeviceID()) {
            return masterDevice;
        }
        Iterator<MasterDevice> it = this.f18119g.iterator();
        MasterDevice masterDevice2 = null;
        while (it.hasNext()) {
            MasterDevice next = it.next();
            if (next.getDeviceID() == masterDevice.getDeviceID()) {
                next.setLastSeen(System.currentTimeMillis());
                next.setMeaterLinkAddress(masterDevice.getMEATERLinkAddress());
                masterDevice2 = next;
            } else if (j(next, masterDevice)) {
                List<Long> connectedDevices = next.getConnectedDevices();
                connectedDevices.removeAll(masterDevice.getConnectedDevices());
                next.setConnectedDevices(connectedDevices);
            }
        }
        if (masterDevice2 != null) {
            return masterDevice2;
        }
        this.f18119g.add(masterDevice);
        return masterDevice;
    }

    public MasterDevice r(long j10) {
        Iterator<MasterDevice> it = this.f18119g.iterator();
        while (it.hasNext()) {
            MasterDevice next = it.next();
            if (next.getDeviceID() == j10) {
                return next;
            }
        }
        return null;
    }

    public MasterDevice s(MEATERDevice mEATERDevice) {
        MEATERDevice topParent = mEATERDevice.getTopParent();
        if (topParent.isMaster()) {
            return null;
        }
        Iterator<MasterDevice> it = this.f18119g.iterator();
        while (it.hasNext()) {
            MasterDevice next = it.next();
            if (next.getConnectedDevices().contains(Long.valueOf(topParent.getDeviceID()))) {
                return next;
            }
        }
        return null;
    }

    public ArrayList<MasterDevice> t() {
        return this.f18119g;
    }

    public ArrayList<r> u() {
        return this.f18118f;
    }

    public void x(byte[] bArr, MEATERLinkAddress mEATERLinkAddress) {
        try {
            MeaterLinkMessage meaterLinkMessageDecode = MeaterLinkMessage.ADAPTER.decode(bArr);
            try {
                if (meaterLinkMessageDecode.header.versionMajor.intValue() == V2MeaterLinkMajorVersion.V2MEATER_LINK_MAJOR_LATEST.getValue()) {
                    v(bArr, mEATERLinkAddress);
                    return;
                }
                SubscriptionMessage subscriptionMessage = meaterLinkMessageDecode.subscriptionMessage;
                if (subscriptionMessage != null) {
                    z(subscriptionMessage, meaterLinkMessageDecode.header, mEATERLinkAddress);
                    return;
                }
                SetupMessage setupMessage = meaterLinkMessageDecode.setupMessage;
                if (setupMessage != null) {
                    y(setupMessage, meaterLinkMessageDecode.header, mEATERLinkAddress);
                    return;
                }
                MasterStatusMessage masterStatusMessage = meaterLinkMessageDecode.masterStatusMessage;
                if (masterStatusMessage != null && masterStatusMessage.masterStatus != null) {
                    if (mEATERLinkAddress != null) {
                        U4.b.n("REC %s : MASTER-STATUS (msg:%d)", mEATERLinkAddress.b(), Integer.valueOf(this.f18122j));
                    } else {
                        U4.b.e("REC : MASTER-STATUS (msg:%d)", Integer.valueOf(this.f18122j));
                    }
                    this.f18115c.a(r(meaterLinkMessageDecode.masterStatusMessage.masterStatus.deviceID.longValue()), meaterLinkMessageDecode.masterStatusMessage.masterStatus);
                    return;
                }
                if (meaterLinkMessageDecode.networkSettingsMessage != null) {
                    U4.b.n("REC %s : NETWORK_STATUS (msg:%d)", mEATERLinkAddress.b(), Integer.valueOf(this.f18122j));
                    this.f18116d.a(meaterLinkMessageDecode.networkSettingsMessage.networkSettings);
                    return;
                }
                MasterMessage masterMessage = meaterLinkMessageDecode.masterMessage;
                if (masterMessage != null) {
                    w(masterMessage, meaterLinkMessageDecode.header, mEATERLinkAddress, false);
                    return;
                }
                if (meaterLinkMessageDecode.masterStatusRequestMessage != null) {
                    int iN = N();
                    this.f18122j = iN;
                    this.f18115c.b(mEATERLinkAddress, this.f13285b, iN);
                    return;
                }
                TemperatureHistoryRequestMessage temperatureHistoryRequestMessage = meaterLinkMessageDecode.temperatureHistoryRequestMessage;
                if (temperatureHistoryRequestMessage != null) {
                    B(temperatureHistoryRequestMessage, meaterLinkMessageDecode.header, mEATERLinkAddress);
                    return;
                }
                TemperatureHistoryMessage temperatureHistoryMessage = meaterLinkMessageDecode.temperatureHistoryMessage;
                if (temperatureHistoryMessage != null) {
                    A(temperatureHistoryMessage, meaterLinkMessageDecode.header, mEATERLinkAddress);
                    return;
                }
                PingPongMessage pingPongMessage = meaterLinkMessageDecode.pingPongMessage;
                if (pingPongMessage != null) {
                    k(pingPongMessage, meaterLinkMessageDecode.header.messageNumber.intValue(), mEATERLinkAddress);
                } else {
                    U4.b.n("Unknown MEATERLink message!", new Object[0]);
                }
            } catch (Exception e10) {
                U4.b.n("Failed to parse msg from %s: %s", mEATERLinkAddress.b(), e10.getLocalizedMessage());
            }
        } catch (Exception unused) {
            U4.b.n("Falling back to legacy ML protocols", new Object[0]);
            v(bArr, mEATERLinkAddress);
        }
    }
}
