package z4;

import P5.C1595c;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import c5.C2316d;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.data.TemperatureSelection;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionState;
import com.apptionlabs.meater_app.v3protobuf.CookSetup;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import java.util.UUID;
import z4.C5171a;
import z4.C5181k;

/* compiled from: MEATERProbeBLEConnection.java */
/* loaded from: classes.dex */
public class c0 extends C5181k {

    /* renamed from: A, reason: collision with root package name */
    protected BluetoothGattService f53572A;

    /* renamed from: u, reason: collision with root package name */
    private final long f53573u = 10;

    /* renamed from: v, reason: collision with root package name */
    protected e0 f53574v = e0.JUST_CONNECTED;

    /* renamed from: w, reason: collision with root package name */
    private long f53575w = 0;

    /* renamed from: x, reason: collision with root package name */
    private C5171a.EnumC0787a f53576x;

    /* renamed from: y, reason: collision with root package name */
    private double f53577y;

    /* renamed from: z, reason: collision with root package name */
    protected BluetoothGattService f53578z;

    c0(BluetoothDevice bluetoothDevice, MEATERDevice mEATERDevice, C5181k.e eVar) {
        this.f53639a = bluetoothDevice;
        this.f53643e = mEATERDevice;
        this.f53644f = eVar;
    }

    private void Q(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f53574v != e0.READING_TEMPERATURE_LOG) {
            U4.b.a("Got temp log but we are in the wrong request state to handle it. Will ignore", new Object[0]);
            return;
        }
        if (a0().getCookState() == DeviceCookState.COOK_STATE_NOT_STARTED) {
            U4.b.a("Got temp log but we the cook has already been cancelled. Will ignore.", new Object[0]);
            this.f53647i.f53586g = true;
        } else {
            if (a0().getConnectionState() != DeviceConnectionState.CONNECTED) {
                U4.b.a("Got temp log but the probe doesn't appear to be connected any more. Will ignore.", new Object[0]);
                return;
            }
            U4.b.a("TMP-LOG %s", this.f53643e.getDebugLogDescription());
            this.f53647i.f53586g = true;
            C5173c.a(bluetoothGattCharacteristic.getValue(), a0(), this);
        }
    }

    private void R(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (this.f53574v != e0.READING_COOK_SETUP) {
            U4.b.a("Got cook setup but we are in the wrong request state to handle it. Will ignore", new Object[0]);
        } else if (a0() != null) {
            U4.b.a("COOK-SETUP %s", this.f53643e.getDebugLogDescription());
            this.f53647i.f53582c = true;
            a0().setHaveFetchedCookSetupFromBLE(true);
            this.f53576x = C5171a.d(value, a0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(int i10) {
        if (this.f53645g && a0() != null && a0().getEventLog() != null) {
            a0().getEventLog().addBLEProbeConnectionEventWithState(BLEProbeConnectionState.BLE_PROBE_DISCONNECTED, 0, i10);
        }
        if (!this.f53645g || this.f53646h) {
            this.f53643e.setBogusConnectionCount(0);
        } else {
            MEATERDevice mEATERDevice = this.f53643e;
            mEATERDevice.setBogusConnectionCount(mEATERDevice.getBogusConnectionCount() + 1);
        }
    }

    private void Z() {
        this.f53647i.f53584e = false;
        U4.b.a("Telling %s to pause temperature logging", this.f53643e.getDebugLogDescription());
        u0(A4.e.PAUSED);
    }

    private void e0() {
        this.f53647i.f53586g = false;
        C5181k.f53635q.d(new B4.g(this.f53652n, this.f53578z, O.f53429g, true, false));
    }

    private void h0() {
        this.f53647i.f53590k = false;
        U4.b.a("Telling %s to resume temperature logging", this.f53643e.getDebugLogDescription());
        u0(A4.e.RESUME);
    }

    private long j0() {
        return (System.currentTimeMillis() - (a0() != null ? a0().getLastGotTemperatureFromProbe() : 0L)) / 1000;
    }

    private void s0() {
        MeatCookingTemperature rangeFromTemperature;
        this.f53647i.f53583d = false;
        CookSetup cookSetupE = V4.p.e(a0());
        MeatCut meatCut = a0().getmCut();
        String str = "-";
        String str2 = meatCut != null ? meatCut.cutType.meat.name : "-";
        String str3 = meatCut != null ? meatCut.name : "-";
        if (meatCut != null && (rangeFromTemperature = MeatCutsHelper.getInstance().getRangeFromTemperature(a0().getTargetInternalTemperature(), meatCut.temperatureRanges)) != null) {
            str = rangeFromTemperature.name;
        }
        U4.b.r("---", new Object[0]);
        U4.b.r("Writing setup to %s:", this.f53643e.getDebugLogDescription());
        U4.b.r("CookID: %s seq: %d", a0().cookIDString(), Integer.valueOf(a0().getSetupSeqNum()));
        U4.b.r("%s %s %s", str2, str3, str);
        U4.b.r("Target: %s", Temperature.displayTemperature(a0().getTargetInternalTemperature()));
        U4.b.r("Cook State: %s", a0().getCookState().toString());
        U4.b.r("---", new Object[0]);
        if (a0() != null && a0().getEventLog() != null) {
            a0().getEventLog().cookSetupEventWithSequenceNumber(cookSetupE.sequenceNumber.intValue());
        }
        byte[] bArrD = C1595c.d(a0().getCookID());
        byte[] bArrEncode = cookSetupE.encode();
        byte[] bArr = new byte[bArrD.length + bArrEncode.length];
        System.arraycopy(bArrD, 0, bArr, 0, bArrD.length);
        System.arraycopy(bArrEncode, 0, bArr, bArrD.length, bArrEncode.length);
        BluetoothGattService bluetoothGattService = this.f53578z;
        UUID uuid = O.f53430h;
        bluetoothGattService.getCharacteristic(uuid).setWriteType(2);
        C5181k.f53635q.d(new B4.k(this, this.f53578z, uuid, bArr, false));
    }

    private void u0(A4.e eVar) {
        C5181k.f53635q.d(new B4.k(this, this.f53578z, O.f53428f, new byte[]{eVar.j()}, false));
    }

    @Override // z4.C5181k
    public boolean I() {
        e0 e0Var = this.f53574v;
        return e0Var == e0.RESETTING_LOG_THEN_WRITE_COOK_SETUP || e0Var == e0.WRITING_COOK_SETUP_THEN_READ_TEMP_LOG || e0Var == e0.WRITING_COOK_SETUP || e0Var == e0.UNPAIRING_CHILD;
    }

    protected boolean N() {
        return this.f53643e.getFirmwareRevision() == null;
    }

    double O() {
        return this.f53577y;
    }

    protected void P(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        int iA;
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null || value.length < 2) {
            return;
        }
        if (a0() == null) {
            C5181k.f53635q.d(new B4.g(this.f53652n, this.f53578z, O.f53427e, false, false));
            U4.b.a("BATT Re_request battery level", new Object[0]);
            return;
        }
        if (value.length == 5) {
            iA = value[0];
            byte b10 = value[3];
            byte b11 = value[4];
            if (b11 != a0().getLastResetSource()) {
                a0().setLastResetSource(b11);
                U4.b.a("RESET-SOURCE %s - source - %s", this.f53643e.getDebugLogDescription(), Integer.valueOf(b11));
            }
            if (b10 != a0().getResetCounter()) {
                a0().setResetCounter(b10);
                U4.b.a("RESET %s - counter - %s", this.f53643e.getDebugLogDescription(), Integer.valueOf(b10));
                if (a0().getEventLog() != null) {
                    a0().getEventLog().addProbeResetEvent(a0().getResetCounter(), a0().getLastResetSource());
                }
            }
            int iA2 = (C1595c.a(value[2]) * 256) + C1595c.a(value[1]);
            if (a0().getEventLog() != null) {
                a0().getEventLog().batteryLevelChanged(iA, iA2);
            }
        } else {
            iA = value.length == 3 ? value[0] : (C1595c.a(value[1]) * 256) + (C1595c.a(value[0]) * 10);
        }
        a0().setBatteryLevel(iA);
        U4.b.a(" BATT %s – %s%%", a0().getDebugLogDescription(), Float.valueOf(a0().getNormalizedBatteryLevel()));
        if (value.length == 5 || a0().getEventLog() == null) {
            return;
        }
        a0().getEventLog().batteryLevelChanged(iA);
    }

    protected void S(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null) {
            return;
        }
        String str = new String(value);
        U4.b.a("FIRMWARE-REVISION %s", this.f53643e.getDebugLogDescription());
        this.f53643e.setFirmwareRevision(str);
    }

    protected void T(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null || value.length < 8 || this.f53574v.p() < e0.AWAITING_INITIAL_TEMPERATURE_READING.p()) {
            return;
        }
        Probe probeRelatedProbe = this.f53643e.relatedProbe();
        if (probeRelatedProbe == null) {
            U4.b.a("PROBE NULL OOPS ", new Object[0]);
            return;
        }
        Temperature.Temperatures_t temperatures_tTemperaturesFromData = Temperature.TemperaturesFromData(value, probeRelatedProbe.getMEATERDeviceType().temperatureResolutionForDevice());
        int iPreferredTemperatureFromSetWithState = TemperatureSelection.PreferredTemperatureFromSetWithState(temperatures_tTemperaturesFromData, probeRelatedProbe.getCookState());
        int i10 = temperatures_tTemperaturesFromData.ambientTemperature;
        U4.b.a("TEMP %s – I:%d A:%d ", this.f53643e.getDebugLogDescription(), Integer.valueOf(iPreferredTemperatureFromSetWithState), Integer.valueOf(i10));
        if (iPreferredTemperatureFromSetWithState != probeRelatedProbe.getInternalTemperature()) {
            probeRelatedProbe.setInternalTemperature(iPreferredTemperatureFromSetWithState);
        }
        if (i10 != probeRelatedProbe.getAmbientTemperature()) {
            probeRelatedProbe.setAmbientTemperature(i10);
        }
        this.f53647i.f53581b = true;
        if (probeRelatedProbe.appearsToHaveCookInProgress()) {
            probeRelatedProbe.getTemperatureLog().addRecording(iPreferredTemperatureFromSetWithState, i10);
        }
        if (this.f53574v == e0.CONNECTED) {
            probeRelatedProbe.setLastGotTemperatureFromProbe(System.currentTimeMillis());
        }
        probeRelatedProbe.setTemperatures(temperatures_tTemperaturesFromData);
    }

    public boolean U() {
        d0 d0Var = this.f53647i;
        return !d0Var.f53580a || d0Var.f53582c;
    }

    protected boolean V() {
        return true;
    }

    protected boolean W() {
        return this.f53647i.f53585f;
    }

    protected boolean X() {
        return true;
    }

    protected Probe a0() {
        return this.f53643e.relatedProbe();
    }

    protected void b0() {
        this.f53647i.f53582c = false;
        U4.b.a("Asking %s for cook setup", this.f53643e.getDebugLogDescription());
        C5181k.f53635q.d(new B4.g(this.f53652n, this.f53578z, O.f53430h, true, false));
    }

    protected void c0() {
        C5181k.f53635q.d(new B4.g(this.f53652n, this.f53578z, O.f53427e, false, false));
    }

    protected void f0() {
        this.f53647i.f53585f = false;
        U4.b.a("Telling %s to reset temperature log", this.f53643e.getDebugLogDescription());
        u0(A4.e.RESET);
    }

    public void g0() {
        this.f53647i.f53589j = true;
        r0();
    }

    public void i0() {
        if (this.f53574v == e0.RESETTING_LOG_THEN_WRITE_COOK_SETUP) {
            return;
        }
        this.f53647i.f53588i = true;
        r0();
    }

    void k0(double d10) {
        this.f53577y = d10;
    }

    void l0(long j10) {
        this.f53575w = j10;
    }

    public void m0(e0 e0Var) {
        if (this.f53574v != e0Var) {
            U4.b.a("[STATE] %s %s -> %s", this.f53643e.getDebugLogDescription(), this.f53574v.toString(), e0Var.toString());
            this.f53574v = e0Var;
        }
    }

    void n0() {
        for (BluetoothGattService bluetoothGattService : this.f53640b.getServices()) {
            if (O.f53423a.equals(bluetoothGattService.getUuid()) || O.f53448z.equals(bluetoothGattService.getUuid()) || O.f53447y.equals(bluetoothGattService.getUuid())) {
                this.f53578z = bluetoothGattService;
            } else if (O.f53424b.equals(bluetoothGattService.getUuid()) && this.f53572A == null) {
                this.f53572A = bluetoothGattService;
            } else if (O.f53425c.equals(bluetoothGattService.getUuid())) {
                this.f53572A = bluetoothGattService;
            }
        }
    }

    @Override // z4.C5181k
    public void o(final int i10) {
        C5181k.f53634p.post(new Runnable() { // from class: z4.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f53570B.Y(i10);
            }
        });
        super.o(i10);
    }

    @Override // z4.C5181k
    protected void p() {
        if (this.f53574v == e0.DISCOVERING_SERVICES) {
            super.p();
        }
    }

    public void p0() {
        this.f53647i.f53594o = true;
        r0();
    }

    protected boolean q0() {
        return true;
    }

    protected void r0() {
        if (this.f53574v == e0.JUST_CONNECTED) {
            U4.b.a("Connected to %s", this.f53643e.getDebugLogDescription());
            this.f53647i.a();
            this.f53647i.f53596q = true;
            if (a0() != null) {
                this.f53647i.f53580a = a0().mustFetchCookSetup();
            }
            if (this.f53647i.f53580a) {
                if (a0() == null || a0().getLastGotTemperatureFromProbe() != 0) {
                    U4.b.a("Must fetch cook setup as we haven't had a reading from this probe in %ds", Long.valueOf(j0()));
                } else {
                    U4.b.a("Must fetch cook setup as we haven't had any readings from this probe", new Object[0]);
                }
            } else if (this.f53643e.isMEATERPlus()) {
                U4.b.a("Short disconnection (%ds) to %s - we'll skip reading cook setup / temp log unless the M+ ends up with a different probe", Long.valueOf(j0()), this.f53643e.getDebugLogDescription());
            } else {
                U4.b.a("Short disconnection (%ds) to %s - skipping reading cook setup / temp log", Long.valueOf(j0()), this.f53643e.getDebugLogDescription());
            }
            m0(e0.DISCOVERING_SERVICES);
        }
        if (this.f53574v == e0.DISCOVERING_SERVICES && z()) {
            m0(e0.READING_OTA_STATE);
        }
        if (this.f53574v == e0.READING_OTA_STATE && V()) {
            if (this.f53643e.isMEATERPlus()) {
                this.f53643e.setConnectionState(DeviceConnectionState.CONNECTED);
            }
            m0(e0.AWAITING_CHILD_PROBE_READY);
        }
        e0 e0Var = this.f53574v;
        e0 e0Var2 = e0.AWAITING_CHILD_PROBE_READY;
        if (e0Var == e0Var2) {
            if (X() && q0()) {
                m0(e0.AWAITING_INITIAL_TEMPERATURE_READING);
            }
            d0 d0Var = this.f53647i;
            if (d0Var.f53594o) {
                d0Var.f53594o = false;
                m0(e0.UNPAIRING_CHILD);
                o0();
            } else if (!d0Var.f53593n && this.f53643e.mustFetchProbeInfo()) {
                d0();
            }
        } else if (e0Var.p() > e0Var2.p() && !X()) {
            d0 d0Var2 = this.f53647i;
            d0Var2.f53593n = false;
            d0Var2.f53581b = false;
            m0(e0Var2);
        }
        e0 e0Var3 = this.f53574v;
        e0 e0Var4 = e0.AWAITING_INITIAL_TEMPERATURE_READING;
        if (e0Var3 == e0Var4) {
            d0 d0Var3 = this.f53647i;
            if (!d0Var3.f53581b) {
                long jCurrentTimeMillis = (System.currentTimeMillis() - this.f53642d) / 1000;
                if (jCurrentTimeMillis > 10 && a0() != null && a0().getConnectionState() == DeviceConnectionState.CONNECTED) {
                    U4.b.a("[FATAL] Failed to receive a temperature from probe after %d seconds.", Long.valueOf(jCurrentTimeMillis));
                    n();
                }
            } else if (d0Var3.f53580a) {
                m0(e0.READING_COOK_SETUP);
                b0();
            } else {
                a0().setHaveFetchedTemperatureLogFromBLE(true);
                m0(e0.CONNECTED);
                a0().setConnectionState(DeviceConnectionState.CONNECTED);
                if (this.f53643e.isMEATERPlus()) {
                    this.f53652n.J();
                    C5181k.f53635q.d(new B4.j(this.f53652n, this.f53578z, O.f53427e, false, true));
                }
            }
        }
        if (this.f53574v == e0.READING_COOK_SETUP) {
            d0 d0Var4 = this.f53647i;
            if (d0Var4.f53582c) {
                d0Var4.f53580a = false;
                C5171a.EnumC0787a enumC0787a = this.f53576x;
                if (enumC0787a == C5171a.EnumC0787a.WRITE_COOK_SETUP_AND_RESET_TEMPERATURE_LOG) {
                    a0().setHaveFetchedTemperatureLogFromBLE(true);
                    m0(e0.RESETTING_LOG_THEN_WRITE_COOK_SETUP);
                    f0();
                } else if (enumC0787a == C5171a.EnumC0787a.WRITE_COOK_SETUP_AND_READ_TEMPERATURE_LOG) {
                    m0(e0.WRITING_COOK_SETUP_THEN_READ_TEMP_LOG);
                    s0();
                } else if (enumC0787a == C5171a.EnumC0787a.READ_TEMPERATURE_LOG) {
                    m0(e0.ASKING_FOR_TEMP_LOG_PAUSE);
                    Z();
                } else if (enumC0787a == C5171a.EnumC0787a.DO_NOTHING) {
                    a0().setHaveFetchedTemperatureLogFromBLE(true);
                    m0(e0.CONNECTED);
                }
                if (a0() != null) {
                    a0().setConnectionState(DeviceConnectionState.CONNECTED);
                }
                if (this.f53643e.isMEATERPlus()) {
                    this.f53652n.J();
                    C5181k.f53635q.d(new B4.j(this.f53652n, this.f53578z, O.f53427e, false, true));
                }
            }
        }
        e0 e0Var5 = this.f53574v;
        e0 e0Var6 = e0.RESETTING_LOG_THEN_WRITE_COOK_SETUP;
        if (e0Var5 == e0Var6 && W()) {
            d0 d0Var5 = this.f53647i;
            d0Var5.f53591l = false;
            d0Var5.f53592m = false;
            m0(e0.WRITING_COOK_SETUP);
            s0();
        }
        if (this.f53574v == e0.WRITING_COOK_SETUP_THEN_READ_TEMP_LOG && this.f53647i.f53583d) {
            m0(e0.ASKING_FOR_TEMP_LOG_PAUSE);
            Z();
        }
        e0 e0Var7 = this.f53574v;
        e0 e0Var8 = e0.WRITING_COOK_SETUP;
        if (e0Var7 == e0Var8 && this.f53647i.f53583d) {
            m0(e0.CONNECTED);
        }
        e0 e0Var9 = this.f53574v;
        e0 e0Var10 = e0.ASKING_FOR_TEMP_LOG_PAUSE;
        if (e0Var9 == e0Var10 && this.f53647i.f53584e) {
            m0(e0.READING_TEMPERATURE_LOG);
            e0();
        }
        if (this.f53574v == e0.READING_TEMPERATURE_LOG && this.f53647i.f53586g) {
            m0(e0.ASKING_FOR_TEMPERATURE_LOG_RESUME);
            h0();
        }
        if (this.f53574v == e0.ASKING_FOR_TEMPERATURE_LOG_RESUME && this.f53647i.f53590k) {
            m0(e0.CONNECTED);
        }
        e0 e0Var11 = this.f53574v;
        e0 e0Var12 = e0.UNPAIRING_CHILD;
        if (e0Var11 == e0Var12) {
            d0 d0Var6 = this.f53647i;
            if (d0Var6.f53595p) {
                d0Var6.f53595p = false;
                this.f53643e.removeChild(a0());
                this.f53647i.f53593n = false;
                m0(e0Var4);
            }
        }
        e0 e0Var13 = this.f53574v;
        e0 e0Var14 = e0.BLE_FAST_CONNECTIONS_INTERVAL;
        if (e0Var13 == e0Var14 && !this.f53647i.f53596q) {
            m0(e0.CONNECTED);
        }
        if (this.f53574v == e0.CONNECTED) {
            d0 d0Var7 = this.f53647i;
            if (d0Var7.f53594o) {
                d0Var7.f53594o = false;
                m0(e0Var12);
                o0();
                return;
            }
            if (d0Var7.f53587h && System.currentTimeMillis() - this.f53575w > 0) {
                this.f53647i.f53587h = false;
                m0(e0Var10);
                Z();
                return;
            }
            d0 d0Var8 = this.f53647i;
            if (d0Var8.f53589j) {
                a0().setHaveFetchedTemperatureLogFromBLE(true);
                d0 d0Var9 = this.f53647i;
                d0Var9.f53589j = false;
                d0Var9.f53588i = false;
                m0(e0Var6);
                f0();
                return;
            }
            if (d0Var8.f53588i) {
                d0Var8.f53588i = false;
                m0(e0Var8);
                s0();
            } else if (d0Var8.f53596q) {
                m0(e0Var14);
                t0();
            } else if (this.f53643e.needsFirmwareUpdate()) {
                C2316d.g(this.f53643e, false);
            }
        }
    }

    protected void t0() {
        this.f53647i.f53596q = false;
    }

    @Override // z4.C5181k
    protected void u(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic.getUuid().equals(O.f53428f)) {
            int iP = this.f53574v.p();
            e0 e0Var = e0.ASKING_FOR_TEMP_LOG_PAUSE;
            int iP2 = e0Var.p();
            e0 e0Var2 = e0.RESETTING_LOG_THEN_WRITE_COOK_SETUP;
            int iP3 = iP2 | e0Var2.p();
            e0 e0Var3 = e0.ASKING_FOR_TEMPERATURE_LOG_RESUME;
            int iP4 = iP3 | e0Var3.p();
            e0 e0Var4 = e0.UNPAIRING_CHILD;
            int iP5 = iP4 | e0Var4.p();
            e0 e0Var5 = e0.BLE_FAST_CONNECTIONS_INTERVAL;
            e0.j(iP, iP5 | e0Var5.p());
            e0 e0Var6 = this.f53574v;
            if (e0Var6 == e0Var) {
                this.f53647i.f53584e = true;
                U4.b.a("WROTE-LOG-STATE %s (Paused)", this.f53643e.getDebugLogDescription());
            } else if (e0Var6 == e0Var2) {
                this.f53647i.f53585f = true;
                U4.b.a("WROTE-LOG-STATE %s (Reset)", this.f53643e.getDebugLogDescription());
            } else if (e0Var6 == e0Var3) {
                this.f53647i.f53590k = true;
                U4.b.a("WROTE-LOG-STATE %s (Resume)", this.f53643e.getDebugLogDescription());
            } else if (e0Var6 == e0Var4) {
                U4.b.a("WROTE-LOG-STATE %s (Unpair)", this.f53643e.getDebugLogDescription());
                this.f53647i.f53595p = true;
            } else if (e0Var6 == e0Var5) {
                U4.b.a("WROTE-LOG-STATE %s (Fast Connection Interval)", this.f53643e.getDebugLogDescription());
                this.f53647i.f53596q = false;
            }
        } else if (bluetoothGattCharacteristic.getUuid().equals(O.f53430h)) {
            e0.j(this.f53574v.p(), e0.WRITING_COOK_SETUP.p() | e0.WRITING_COOK_SETUP_THEN_READ_TEMP_LOG.p());
            U4.b.a("WROTE-COOK-SETUP %s", this.f53643e.getDebugLogDescription());
            this.f53647i.f53583d = true;
        }
        r0();
    }

    @Override // z4.C5181k
    protected void v(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.v(bluetoothGattCharacteristic);
        if (O.f53431i.equals(bluetoothGattCharacteristic.getUuid()) || O.f53433k.equals(bluetoothGattCharacteristic.getUuid())) {
            S(bluetoothGattCharacteristic);
        } else if (O.f53426d.equals(bluetoothGattCharacteristic.getUuid())) {
            T(bluetoothGattCharacteristic);
        } else if (O.f53427e.equals(bluetoothGattCharacteristic.getUuid())) {
            P(bluetoothGattCharacteristic);
        } else if (O.f53430h.equals(bluetoothGattCharacteristic.getUuid())) {
            R(bluetoothGattCharacteristic);
        } else if (O.f53429g.equals(bluetoothGattCharacteristic.getUuid())) {
            Q(bluetoothGattCharacteristic);
        }
        r0();
        this.f53643e.updateState();
        if (a0() == null || a0() == this.f53643e || a0().getConnectionState() != DeviceConnectionState.CONNECTED) {
            return;
        }
        a0().updateState();
    }

    @Override // z4.C5181k
    protected void w() {
        r0();
    }

    @Override // z4.C5181k
    protected void x() {
        if (this.f53578z == null || this.f53572A == null) {
            n0();
        }
        BluetoothGattService bluetoothGattService = this.f53572A;
        if (bluetoothGattService != null) {
            if (bluetoothGattService.getUuid().equals(O.f53425c)) {
                C5181k.f53635q.d(new B4.g(this.f53652n, this.f53572A, O.f53433k, false, false));
            } else {
                C5181k.f53635q.d(new B4.g(this.f53652n, this.f53572A, O.f53431i, false, false));
            }
        }
        BluetoothGattService bluetoothGattService2 = this.f53578z;
        if (bluetoothGattService2 != null) {
            B4.f fVar = C5181k.f53635q;
            fVar.d(new B4.j(this.f53652n, bluetoothGattService2, O.f53426d, false, false));
            r0();
            C5181k c5181k = this.f53652n;
            BluetoothGattService bluetoothGattService3 = this.f53578z;
            UUID uuid = O.f53427e;
            fVar.d(new B4.j(c5181k, bluetoothGattService3, uuid, false, true));
            fVar.d(new B4.g(this.f53652n, this.f53578z, uuid, false, false));
        }
    }

    @Override // z4.C5181k
    protected boolean z() {
        return super.z() && !N();
    }

    protected void d0() {
    }

    protected void o0() {
    }
}
