package z4;

import P5.C1595c;
import P5.C1597e;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import c5.C2316d;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.MEATERPlus;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionState;
import g1.C3377a;
import j1.C3724i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import x4.b;
import z4.C5181k;
import z4.a0;

/* compiled from: MEATERPlusBLEConnection.java */
/* loaded from: classes.dex */
public class Y extends c0 {

    /* renamed from: K, reason: collision with root package name */
    static boolean f53513K = false;

    /* renamed from: B, reason: collision with root package name */
    private Z f53514B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f53515C;

    /* renamed from: D, reason: collision with root package name */
    private a0 f53516D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f53517E;

    /* renamed from: F, reason: collision with root package name */
    A4.b f53518F;

    /* renamed from: G, reason: collision with root package name */
    A4.c f53519G;

    /* renamed from: H, reason: collision with root package name */
    public int f53520H;

    /* renamed from: I, reason: collision with root package name */
    private final byte f53521I;

    /* renamed from: J, reason: collision with root package name */
    A4.b f53522J;

    public Y(BluetoothDevice bluetoothDevice, MEATERPlus mEATERPlus, C5181k.e eVar) {
        super(bluetoothDevice, mEATERPlus, eVar);
        this.f53514B = Z.UNKNOWN;
        this.f53521I = (byte) -63;
        this.f53522J = null;
        this.f53518F = A4.b.DISCONNECTED;
        this.f53519G = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        f53513K = false;
        a0 a0Var = this.f53516D;
        if (a0Var != null) {
            a0Var.o();
        }
    }

    private MEATERPlus C0() {
        return (MEATERPlus) this.f53643e;
    }

    private Probe D0(A4.c cVar) {
        long deviceID = this.f53643e.getDeviceID();
        long j10 = cVar.f755b;
        int i10 = cVar.f754a;
        M4.h hVar = M4.h.f11978a;
        MEATERDevice mEATERDeviceO = hVar.o(j10);
        Probe probe = (mEATERDeviceO == null || !mEATERDeviceO.isMEATERProbe()) ? null : (Probe) mEATERDeviceO;
        if (probe == null) {
            probe = new Probe();
            probe.setDeviceID(j10);
            probe.setProbeNumber(i10);
        }
        MEATERDevice parentDevice = probe.getParentDevice();
        if (parentDevice != null && probe.getParentDevice() != this.f53643e && parentDevice.isMEATERPlus() && parentDevice.getConnectionMethod().isBluetoothConnectionMethod()) {
            DeviceConnectionState connectionState = parentDevice.getConnectionState();
            DeviceConnectionState deviceConnectionState = DeviceConnectionState.CONNECTED;
            if (connectionState == deviceConnectionState && parentDevice.getBleConnection() != null) {
                if (probe.getConnectionState() == deviceConnectionState) {
                    this.f53647i.f53594o = true;
                    U4.b.a("%s says it is paired with %s, but that probe is already connected to %s.", this.f53643e.getDebugLogDescription(), probe.getDebugLogDescription(), parentDevice.getDebugLogDescription());
                    U4.b.a("Will need to tell %s to unpair!", this.f53643e.getDebugLogDescription());
                    return null;
                }
                d0 d0Var = ((c0) parentDevice.getBleConnection()).f53647i;
                if (d0Var.f53593n) {
                    d0Var.f53594o = true;
                    U4.b.a("%s says it is paired with %s, but that probe is already connected to %s.", parentDevice.getDebugLogDescription(), probe.getDebugLogDescription(), this.f53643e.getDebugLogDescription());
                    U4.b.a("Will need to tell %s to unpair!", parentDevice.getDebugLogDescription());
                    return null;
                }
            }
        }
        if (probe != a0()) {
            if (a0() != null) {
                a0().setConnectionState(DeviceConnectionState.OFFLINE);
            }
            C5181k.f53635q.d(new B4.g(this.f53652n, this.f53578z, O.f53443u, false, false));
            if (a0() != null) {
                U4.b.a("%s is paired with a different probe from last time, we must read cook setup again", this.f53643e.getDebugLogDescription());
                this.f53647i.f53580a = true;
            }
        } else {
            if (a0() != null) {
                this.f53647i.f53580a = a0().mustFetchCookSetup();
            }
            if (this.f53647i.f53580a) {
                U4.b.a("%s has reconnected to %s, we will re-read cook setup as it has been a while since we last got a temperature", probe.getDebugLogDescription(), this.f53643e.getDebugLogDescription());
            } else {
                U4.b.a("%s has reconnected to %s, we will skip reading cook setup because it wasn't disconnected very long", probe.getDebugLogDescription(), this.f53643e.getDebugLogDescription());
                probe.setHaveFetchedCookSetupFromBLE(true);
            }
        }
        probe.setParentDeviceID(deviceID);
        if (!probe.getMEATERDeviceType().isG2Probe() && this.f53643e.relatedProbe() != null) {
            c0();
        }
        hVar.Z(C3724i.a(new Object[]{probe}));
        return probe;
    }

    private boolean H0() {
        return this.f53574v == e0.UNPAIRING_CHILD || this.f53647i.f53594o;
    }

    @Override // z4.C5181k
    public boolean A() {
        return this.f53516D != null;
    }

    protected void A0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value != null && value.length == 1) {
            byte b10 = value[0];
            if (b10 == 127) {
                b10 = -128;
            }
            if (a0() != null) {
                U4.b.a("MEATER-PLUS-PROBE RSSI %s: %d", a0().getDebugLogDescription(), Integer.valueOf(b10));
                a0().setSignalLevel(b10);
                if (a0().getEventLog() != null) {
                    a0().getEventLog().meaterPlusRSSIChanged(b10);
                }
            }
        }
    }

    @Override // z4.C5181k
    protected boolean C() {
        A4.b bVar = this.f53518F;
        if (bVar == A4.b.NOT_PAIRED || bVar == A4.b.DISCONNECTED) {
            return false;
        }
        return super.C();
    }

    @Override // z4.C5181k
    protected boolean D() {
        if (this.f53516D != null) {
            return true;
        }
        return super.D();
    }

    protected boolean E0() {
        if (a0() == null || !(a0() == null || a0().getShouldShowAsConnected())) {
            U4.b.m("prepareFastConnectionInterval false , child probe is not found", new Object[0]);
            this.f53647i.f53596q = false;
            return false;
        }
        this.f53647i.f53596q = true;
        r0();
        return true;
    }

    protected void F0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bluetoothGattCharacteristic.getValue());
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        int iConvertSixteenthResolutionToThirtyTwo = byteBufferWrap.getShort();
        if (this.f53643e.getMEATERDeviceType().temperatureResolutionForDevice() == Temperature.DeviceTemperatureResolution.SIXTEEN) {
            iConvertSixteenthResolutionToThirtyTwo = Temperature.convertSixteenthResolutionToThirtyTwo(iConvertSixteenthResolutionToThirtyTwo);
        }
        U4.b.a("M+ CHIP-TEMPERATURE device %s and temperature %s", this.f53643e.getDebugLogDescription(), Integer.valueOf(iConvertSixteenthResolutionToThirtyTwo));
        this.f53643e.setAmbientTemperature(iConvertSixteenthResolutionToThirtyTwo);
        if (a0() == null || a0().getEventLog() == null) {
            return;
        }
        a0().getEventLog().meaterDeviceAmbientTemperatureChanged(iConvertSixteenthResolutionToThirtyTwo);
    }

    public void G0(a0 a0Var) {
        this.f53516D = a0Var;
    }

    @Override // z4.c0
    protected boolean N() {
        return C0().getOtaUpdateInProgress() != null ? C0().getOtaUpdateInProgress().l() == a0.c.AWAITING_FIRMWARE_ACCEPTANCE && this.f53643e.getFirmwareRevision() == null : this.f53643e.getFirmwareRevision() == null;
    }

    @Override // z4.c0
    protected void S(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        U4.b.a("M+FIRMWARE-REVISION %s", this.f53643e.getDebugLogDescription());
        String str = new String(value);
        this.f53643e.setFirmwareRevision(str);
        M4.h.f11978a.f0(this.f53643e);
        this.f53643e.setHaveReadFirmwareRevision(true);
        if (C0().getOtaUpdateInProgress() != null) {
            C0().getOtaUpdateInProgress().s(this);
            C0().getOtaUpdateInProgress().u();
        }
        if (this.f53643e.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS || this.f53643e.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS_PRO || P5.Q.e("v.1.6.0.1", str) <= 0) {
            B4.f fVar = C5181k.f53635q;
            C5181k c5181k = this.f53652n;
            BluetoothGattService bluetoothGattService = this.f53578z;
            UUID uuid = O.f53416A;
            fVar.d(new B4.g(c5181k, bluetoothGattService, uuid, false, true));
            fVar.d(new B4.j(this.f53652n, this.f53578z, uuid, false, true));
        }
    }

    @Override // z4.c0
    protected boolean V() {
        Z z10 = this.f53514B;
        if (z10 == Z.UNKNOWN) {
            return false;
        }
        if (z10 != Z.OTA) {
            if (z10.equals(Z.ASKED_FOR_REBOOT)) {
                return false;
            }
            U4.b.a("MEATER+ is in normal mode, proceeding as normal", new Object[0]);
            return true;
        }
        a0 otaUpdateInProgress = C0().getOtaUpdateInProgress();
        if (this.f53520H <= 0 || otaUpdateInProgress == null) {
            U4.b.m("MEATER+ is in OTA mode, must reboot %s", this.f53643e.getDebugLogDescription());
            A4.d dVar = new A4.d();
            dVar.f757a = A4.b.OTA_CMD_REBOOT;
            C5181k.f53635q.d(new B4.k(this.f53652n, this.f53578z, O.f53443u, dVar.b().array(), false));
            this.f53514B = Z.ASKED_FOR_REBOOT;
            return false;
        }
        if (!this.f53515C) {
            this.f53515C = true;
            w0();
            U4.b.m("OTA in progress, will attempt to resume...", new Object[0]);
            this.f53643e.setConnectionState(DeviceConnectionState.CONNECTED);
            otaUpdateInProgress.s(this);
            this.f53516D = otaUpdateInProgress;
            otaUpdateInProgress.r(this.f53520H);
        }
        return false;
    }

    @Override // z4.c0
    protected boolean W() {
        d0 d0Var = this.f53647i;
        return d0Var.f53585f && d0Var.f53591l && d0Var.f53592m;
    }

    @Override // z4.c0
    protected boolean X() {
        A4.c cVar;
        return this.f53518F.p() && this.f53647i.f53593n && (cVar = this.f53519G) != null && cVar.f756c.length() != 0;
    }

    @Override // z4.c0
    protected Probe a0() {
        return this.f53643e.relatedProbe();
    }

    @Override // z4.c0
    protected void b0() {
        super.b0();
    }

    @Override // z4.c0
    protected void d0() {
        this.f53647i.f53597r = false;
        C5181k.f53635q.d(new B4.g(this.f53652n, this.f53578z, O.f53446x, false, false));
    }

    @Override // z4.c0
    protected void f0() {
        d0 d0Var = this.f53647i;
        d0Var.f53585f = false;
        d0Var.f53591l = false;
        d0Var.f53592m = false;
        super.f0();
    }

    @Override // z4.c0, z4.C5181k
    public void o(int i10) {
        C5181k.f53634p.post(new Runnable() { // from class: z4.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f53512B.B0();
            }
        });
        super.o(i10);
    }

    @Override // z4.c0
    protected void o0() {
        if (this.f53574v == e0.UNPAIRING_CHILD) {
            U4.b.a("Telling device %s to remove its pairing", this.f53643e.getDebugLogDescription());
            C5181k.f53635q.d(new B4.k(this, this.f53578z, O.f53428f, new byte[]{-48}, false));
        }
    }

    @Override // z4.c0
    protected boolean q0() {
        Probe probeA0 = a0();
        Probe probeD0 = D0(this.f53519G);
        if (probeD0 == null) {
            return false;
        }
        if (probeA0 == null || probeA0.getDeviceID() != probeD0.getDeviceID()) {
            U4.b.a("%s: changed probe %s -> %s", this.f53643e.getDebugLogDescription(), probeA0 == null ? null : probeA0.getDebugLogDescription(), probeD0.getDebugLogDescription());
        }
        probeD0.setProbeNumber(this.f53519G.f754a);
        probeD0.setDeviceID(this.f53519G.f755b);
        probeD0.setFirmwareRevision(this.f53519G.f756c);
        this.f53642d = System.currentTimeMillis();
        if (probeD0.getEventLog() != null) {
            probeD0.getEventLog().addMEATERPlusConnectionEventWithState(BLEProbeConnectionState.BLE_PROBE_CONNECTED);
        }
        if (!probeD0.isV1Probe()) {
            return true;
        }
        C2316d.G();
        return true;
    }

    @Override // z4.c0
    protected void t0() {
        U4.b.a("Telling device %s to move to fast connection interval", this.f53643e.getDebugLogDescription());
        C5181k.f53635q.d(new B4.k(this, this.f53578z, O.f53428f, new byte[]{-63}, false, 1));
    }

    @Override // z4.c0, z4.C5181k
    protected void u(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        a0 a0Var = this.f53516D;
        if (a0Var != null) {
            a0Var.m(bluetoothGattCharacteristic);
            K();
            r0();
        } else if (this.f53574v == e0.AWAITING_CHILD_PROBE_READY) {
            U4.b.a("Ignoring characteristic write notification %s from %s because probe has disconnected and we are waiting for it to come back", bluetoothGattCharacteristic.getUuid(), this.f53643e.getDebugLogDescription());
        } else {
            super.u(bluetoothGattCharacteristic);
        }
    }

    @Override // z4.c0, z4.C5181k
    protected void v(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        a0 a0Var = this.f53516D;
        if (a0Var != null) {
            a0Var.n(bluetoothGattCharacteristic);
            K();
            return;
        }
        if (H0()) {
            return;
        }
        if (O.f53443u.equals(bluetoothGattCharacteristic.getUuid())) {
            y0(bluetoothGattCharacteristic);
        } else if (O.f53445w.equals(bluetoothGattCharacteristic.getUuid())) {
            x0(bluetoothGattCharacteristic);
        } else if (O.f53446x.equals(bluetoothGattCharacteristic.getUuid())) {
            z0(bluetoothGattCharacteristic);
        } else if (O.f53444v.equals(bluetoothGattCharacteristic.getUuid())) {
            A0(bluetoothGattCharacteristic);
        } else if (O.f53431i.equals(bluetoothGattCharacteristic.getUuid()) || O.f53433k.equals(bluetoothGattCharacteristic.getUuid())) {
            S(bluetoothGattCharacteristic);
        } else if (this.f53574v == e0.AWAITING_CHILD_PROBE_READY) {
            U4.b.a("Ignoring characteristic %s from %s because probe has disconnected and we are waiting for it to come back", bluetoothGattCharacteristic.getUuid(), this.f53643e.getDebugLogDescription());
        } else if (O.f53416A.equals(bluetoothGattCharacteristic.getUuid())) {
            F0(bluetoothGattCharacteristic);
        }
        if (!O.f53427e.equals(bluetoothGattCharacteristic.getUuid())) {
            super.v(bluetoothGattCharacteristic);
            return;
        }
        super.P(bluetoothGattCharacteristic);
        r0();
        this.f53643e.updateState();
        K();
    }

    protected void w0() {
        if ((this.f53643e.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS || this.f53643e.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS_PRO || this.f53643e.getMEATERDeviceType() == MEATERDeviceType.PLUS_SE) && !f53513K) {
            if (Build.VERSION.SDK_INT < 31 || C3377a.a(x4.g.h(), "android.permission.BLUETOOTH_CONNECT") == 0) {
                U4.b.a("requestMtu for this %s probeConnectionState %s", this.f53643e.shortDeviceIDString(), this.f53518F);
                f53513K = true;
                C5181k.f53635q.d(new B4.i(this.f53652n));
            }
        }
    }

    @Override // z4.c0, z4.C5181k
    protected void x() {
        if (this.f53578z == null) {
            n0();
        }
        BluetoothGattService bluetoothGattService = this.f53578z;
        if (bluetoothGattService != null && !this.f53517E) {
            this.f53517E = true;
            B4.f fVar = C5181k.f53635q;
            fVar.d(new B4.g(this.f53652n, bluetoothGattService, O.f53446x, false, true));
            C5181k c5181k = this.f53652n;
            BluetoothGattService bluetoothGattService2 = this.f53578z;
            UUID uuid = O.f53443u;
            fVar.d(new B4.j(c5181k, bluetoothGattService2, uuid, false, false));
            fVar.d(new B4.g(this.f53652n, this.f53578z, uuid, false, false));
            fVar.d(new B4.j(this.f53652n, this.f53578z, O.f53444v, false, true));
            C5181k c5181k2 = this.f53652n;
            BluetoothGattService bluetoothGattService3 = this.f53578z;
            UUID uuid2 = O.f53445w;
            fVar.d(new B4.j(c5181k2, bluetoothGattService3, uuid2, false, true));
            fVar.d(new B4.g(this.f53652n, this.f53578z, uuid2, false, false));
        }
        super.x();
        K();
    }

    protected void x0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int i10;
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value.length == 1) {
            i10 = value[0];
            U4.b.a("MEATER-PLUS-BATTERY-LEVEL %s: %d", this.f53643e.getDebugLogDescription(), Integer.valueOf(i10));
        } else if (value.length == 3) {
            i10 = O4.f.a(value).f13256a;
            U4.b.a("MEATER-PLUS V2-BATTERY-LEVEL %s: %d", this.f53643e.getDebugLogDescription(), Integer.valueOf(i10));
        } else {
            i10 = -1;
        }
        if (i10 == -1 || i10 > 100) {
            return;
        }
        this.f53643e.setBatteryLevel(i10);
        if (a0() == null || a0().getEventLog() == null) {
            return;
        }
        a0().getEventLog().meaterPlusBatteryLevelChanged(i10);
    }

    protected void y0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value != null && value.length >= 1) {
            A4.b bVarJ = A4.b.j(value[0]);
            if (bVarJ == null) {
                U4.b.a("%s MEATER-PLUS-PROBE-CONNECTION-STATE %s: Invalid state: %d", this.f53643e.getDebugLogDescription(), a0() != null ? a0().getDebugLogDescription() : "Unknown", Integer.valueOf(value[0]));
                return;
            }
            String debugLogDescription = this.f53643e.getDebugLogDescription();
            A4.c cVar = this.f53519G;
            U4.b.a("%s MEATER-PLUS-PROBE-CONNECTION-STATE %s: %s", debugLogDescription, cVar != null ? P5.Q.z(cVar.f755b) : "Unknown", bVarJ.toString());
            this.f53518F = bVarJ;
            if (bVarJ.n() >= A4.b.OTA_BUSY.n()) {
                this.f53520H = 0;
                if (value.length >= 11) {
                    A4.d dVarA = A4.d.a(ByteBuffer.wrap(value));
                    if (dVarA.f757a == A4.b.OTA_RESP_ADDRESS) {
                        this.f53520H = dVarA.f760d;
                    }
                }
                if (this.f53514B.equals(Z.ASKED_FOR_REBOOT)) {
                    return;
                }
                this.f53514B = Z.OTA;
                return;
            }
            this.f53514B = Z.NORMAL;
            U4.b.a("M+ISSUE State is %s ::: connection state = %s didReceiveProbeInfo %s", this.f53574v.toString(), this.f53518F.toString(), Boolean.valueOf(this.f53647i.f53593n));
            if (this.f53518F == A4.b.CONNECTED) {
                e0 e0Var = this.f53574v;
                if (e0Var != e0.AWAITING_CHILD_PROBE_READY && e0Var != e0.READING_OTA_STATE) {
                    d0 d0Var = this.f53647i;
                    if (d0Var.f53591l) {
                        d0Var.f53592m = true;
                        U4.b.a("%s MEATER+ got notification that temp log reset has completed", this.f53643e.getDebugLogDescription());
                        r0();
                    }
                } else if (!this.f53647i.f53593n) {
                    U4.b.a("%s MEATER+: (MEATER-PLUS-PROBE-) Force read probe info", this.f53643e.getDebugLogDescription());
                    d0();
                }
                if (this.f53647i.f53593n && a0() != null) {
                    U4.b.a("Marking the %s on %s as connected early - we've received the connection state.", this.f53643e.getDebugLogDescription(), a0().getDebugLogDescription());
                    if (!a0().getShouldShowAsConnected()) {
                        a0().setLoadingState(O4.d.DeviceLoadingStateLoading);
                    }
                }
            } else if (bVarJ == A4.b.FETCHING_COOK_SETUP) {
                U4.b.a("MEATER+ probe is connected but MEATER+ is still fetching cook setup", new Object[0]);
            } else if (bVarJ == A4.b.CLEARING_HISTORY) {
                this.f53647i.f53591l = true;
                U4.b.a("MEATER+ got notification that temp log reset is in progress", new Object[0]);
            } else if (bVarJ == A4.b.MEATERPROBE_PROBE_IN_CHARGER) {
                U4.b.a("MEATER+ got notification that probe is in charger, M+ will disconnect soon!", new Object[0]);
                if (a0() != null) {
                    a0().setConnectionState(DeviceConnectionState.OFFLINE);
                }
                x4.b.f(b.EnumC0768b.f52737t1.title, "", "");
            } else if (bVarJ == A4.b.MEATERPROBE_BATTERY_SHUTDOWN) {
                U4.b.a("MEATER battery is empty, and will shutdown shortly.", new Object[0]);
                x4.b.f(b.EnumC0768b.f52739u1.title, "", "");
            } else if (bVarJ == A4.b.MEATERPROBE_PROBE_UPSIDE_DOWN && this.f53522J != bVarJ) {
                U4.b.a("MEATER probe is upside down in charger, thus not charging.", new Object[0]);
                x4.b.f(b.EnumC0768b.f52741v1.title, "", "");
            } else if (bVarJ == A4.b.MEATERPROBE_PROBE_NO_PROBE_SLEEP) {
                U4.b.a("MEATER+ probe disconnected for 1H. M+ will sleep shortly.", new Object[0]);
                x4.b.f(b.EnumC0768b.f52743w1.title, "", "");
            } else if (bVarJ == A4.b.MEATERPROBE_PROBE_NO_COOK_SLEEP) {
                U4.b.a("MEATER+ probe connected but no heat for 1H. M+ will sleep shortly.", new Object[0]);
                x4.b.f(b.EnumC0768b.f52745x1.title, "", "");
            } else {
                U4.b.a("MEATER+ probe state now %s (treat as disconnected)", bVarJ.toString());
                if (a0() != null) {
                    a0().cleanupAfterBLEDisconnection();
                    if (a0().getEventLog() != null) {
                        a0().getEventLog().addMEATERPlusConnectionEventWithState(BLEProbeConnectionState.BLE_PROBE_DISCONNECTED);
                    }
                }
            }
            this.f53522J = bVarJ;
        }
    }

    protected void z0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        MEATERDevice mEATERDevice;
        if (this.f53518F == A4.b.DISCONNECTED) {
            if (this.f53647i.f53593n) {
                return;
            }
            d0();
            return;
        }
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null) {
            return;
        }
        if (value.length < 24) {
            U4.b.a("MEATER-PLUS-PROBE-INFO Bad data (len: %d)", Integer.valueOf(value.length));
            return;
        }
        A4.c cVarA = A4.c.a(ByteBuffer.wrap(value));
        U4.b.a("Data: " + C1595c.b(value) + " Identifier: " + Long.toHexString(cVarA.f755b).toUpperCase(), new Object[0]);
        if (!C1597e.c().d(P5.Q.A(cVarA.f755b))) {
            U4.b.a("Ignoring Device ***** ID " + Long.toHexString(cVarA.f755b).toUpperCase(), new Object[0]);
            return;
        }
        if (cVarA.f755b == 0 || (str = cVarA.f756c) == null || str.length() <= 0) {
            U4.b.a("MEATER-PLUS-PROBE-INFO (Empty)", new Object[0]);
            return;
        }
        this.f53643e.setLastGotProbeInfoFromDevice(System.currentTimeMillis());
        U4.b.a("MEATER-PLUS-PROBE-INFO %s %s(%d) (%s)", this.f53643e.getDebugLogDescription(), Long.toHexString(cVarA.f755b).toUpperCase(), Integer.valueOf(cVarA.f754a), cVarA.f756c);
        this.f53519G = cVarA;
        this.f53647i.f53593n = true;
        w0();
        a0();
        if (a0() == null || (mEATERDevice = this.f53643e) == null || this.f53518F != A4.b.CONNECTED) {
            MEATERDevice mEATERDevice2 = this.f53643e;
            U4.b.a("Error while Marking the device %s on  probe %s as connected early.", mEATERDevice2 != null ? mEATERDevice2.getDebugLogDescription() : "null", a0() != null ? a0().getDebugLogDescription() : "Null");
        } else {
            U4.b.a("Marking the %s on %s as connected early.", mEATERDevice.getDebugLogDescription(), a0().getDebugLogDescription());
            a0().setLoadingState(O4.d.DeviceLoadingStateLoading);
        }
    }
}
