package z4;

import B4.l;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import c5.C2316d;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import java.util.Iterator;
import java.util.UUID;
import z4.C5181k;
import z4.Q;

/* compiled from: BlockKeepAliveBLEConnection.java */
/* renamed from: z4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5177g extends Q {

    /* renamed from: E, reason: collision with root package name */
    l.e f53616E;

    /* renamed from: F, reason: collision with root package name */
    l.f f53617F;

    /* renamed from: G, reason: collision with root package name */
    l.d f53618G;

    /* renamed from: H, reason: collision with root package name */
    protected boolean f53619H;

    /* renamed from: I, reason: collision with root package name */
    private String f53620I;

    /* renamed from: J, reason: collision with root package name */
    protected BluetoothGattService f53621J;

    /* renamed from: K, reason: collision with root package name */
    private UUID f53622K;

    /* renamed from: L, reason: collision with root package name */
    protected BluetoothGattService f53623L;

    /* renamed from: M, reason: collision with root package name */
    protected e0 f53624M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f53625N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f53626O;

    /* compiled from: BlockKeepAliveBLEConnection.java */
    /* renamed from: z4.g$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f53627a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f53628b;

        static {
            int[] iArr = new int[l.c.values().length];
            f53628b = iArr;
            try {
                iArr[l.c.MEATERBlockResetTypeStandard.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53628b[l.c.MEATERBlockResetTypeUnpairProbes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53628b[l.c.MEATERBlockResetTypeRecoveryMode.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53628b[l.c.MEATERBlockResetTypeReboot.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.e.values().length];
            f53627a = iArr2;
            try {
                iArr2[l.e.eBlockStatusModeLegacy0.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53627a[l.e.eBlockStatusModeLegacy1.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53627a[l.e.eBlockStatusModeLegacy2.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53627a[l.e.eBlockStatusModeLegacy3.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53627a[l.e.eBlockStatusModeLegacy4.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f53627a[l.e.eBlockStatusModeConfiguring.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f53627a[l.e.eBlockStatusModeProbePairing.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f53627a[l.e.eBlockStatusModeBooting.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f53627a[l.e.eBlockStatusModeSelecting.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f53627a[l.e.eBlockStatusModeStandalone.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f53627a[l.e.eBlockStatusModeWifiClient.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f53627a[l.e.eBlockStatusModeWifiAp.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f53627a[l.e.eBlockStatusModeWifiApOtaSvc.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f53627a[l.e.eBlockStatusModeCount.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public C5177g(BluetoothDevice bluetoothDevice, MEATERBlock mEATERBlock, C5181k.e eVar) {
        super(x4.g.h(), bluetoothDevice, mEATERBlock, null);
        this.f53620I = null;
        this.f53624M = e0.JUST_CONNECTED;
        this.f53625N = true;
        this.f53626O = true;
        this.f53644f = eVar;
        this.f53639a = bluetoothDevice;
        this.f53643e = mEATERBlock;
    }

    private void D0(l.b bVar, UUID uuid) {
        if (this.f53622K == null || uuid == null) {
            return;
        }
        C5181k.f53635q.d(new B4.k(this, this.f53623L, uuid, new byte[]{bVar.j()}, false));
    }

    private boolean h0() {
        return this.f53643e.getFirmwareRevision() == null;
    }

    private boolean i0() {
        l.e eVar;
        return !this.f53619H || (eVar = this.f53616E) == l.e.eBlockStatusModeSelecting || eVar == l.e.eBlockStatusModeBooting;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0() {
        U4.b.d("WIFI &&& ---hasWaitedForInitialTimeout started ", new Object[0]);
        this.f53625N = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0() {
        U4.b.d("WIFI &&& ---2nd extendedWaitedForTimeout now started  ", new Object[0]);
        this.f53626O = true;
    }

    private void x0(l.e eVar) {
        Intent intent = new Intent(MEATERIntent.INTENT_BLOCK_MODE);
        intent.putExtra(MEATERIntent.EXTRA_BLOCK_MODE, eVar.ordinal());
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, this.f53643e.getDeviceID());
        intent.setPackage(x4.g.h().getPackageName());
        x4.g.h().sendBroadcast(intent);
    }

    private void y0(l.e eVar) {
        MEATERDevice mEATERDevice;
        if (eVar == l.e.eBlockStatusModeConfiguring) {
            x0(eVar);
        } else if (eVar == l.e.eBlockStatusModeProbePairing && (mEATERDevice = this.f53643e) != null && mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK) {
            x0(eVar);
        }
    }

    private void z0(l.e eVar) {
        MEATERDevice next;
        boolean z10 = this.f53616E != eVar;
        if (!this.f53619H) {
            U4.b.a("[STATUS] %s %s", this.f53643e.getDebugLogDescription(), l.e.j(eVar));
            this.f53619H = true;
            this.f53616E = eVar;
        }
        U4.b.a("[STATUS] %@ %s -> %s", this.f53643e.getDebugLogDescription(), l.e.j(eVar));
        this.f53616E = eVar;
        switch (a.f53627a[eVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                U4.b.a("Received a legacy status from the %s. Disconnecting.", this.f53643e.getDebugLogDescription());
                this.f53643e.disconnectImmediately();
                break;
            case 7:
                if (z10) {
                    M4.h hVar = M4.h.f11978a;
                    M4.h.connectDirectlyToBlockProbes = O4.a.f13233C;
                    hVar.r();
                    break;
                }
                break;
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (z10) {
                    x0(this.f53616E);
                    break;
                }
                break;
        }
        if (this.f53616E == l.e.eBlockStatusModeProbePairing || M4.h.connectDirectlyToBlockProbes != O4.a.f13233C) {
            return;
        }
        Iterator<MEATERDevice> it = M4.h.f11978a.K().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next.isMEATERBlock()) {
                    MEATERBlock mEATERBlock = (MEATERBlock) next;
                    if (!mEATERBlock.isSupportsBLEKeepAlive() || mEATERBlock.getBleConnection() == null || ((C5177g) mEATERBlock.getBleConnection()).f53616E != l.e.eBlockStatusModeProbePairing) {
                    }
                }
            } else {
                next = null;
            }
        }
        if (next == null) {
            M4.h.connectDirectlyToBlockProbes = O4.a.f13232B;
        }
    }

    @Override // z4.Q, z4.C5181k
    public boolean A() {
        return this.f53616E == l.e.eBlockStatusModeConfiguring;
    }

    protected void A0(e0 e0Var) {
        if (this.f53624M != e0Var) {
            U4.b.a("[STATE] %s %s -> %s", this.f53643e.getDebugLogDescription(), this.f53624M.toString(), e0Var.toString());
            this.f53624M = e0Var;
        }
    }

    void B0() {
        for (BluetoothGattService bluetoothGattService : this.f53640b.getServices()) {
            if (O.f53435m.equals(bluetoothGattService.getUuid()) || O.f53442t.equals(bluetoothGattService.getUuid()) || O.f53417B.equals(bluetoothGattService.getUuid()) || O.f53418C.equals(bluetoothGattService.getUuid()) || O.f53419D.equals(bluetoothGattService.getUuid()) || O.f53420E.equals(bluetoothGattService.getUuid()) || O.f53421F.equals(bluetoothGattService.getUuid())) {
                this.f53623L = bluetoothGattService;
            } else if (O.f53424b.equals(bluetoothGattService.getUuid()) && this.f53621J == null) {
                this.f53621J = bluetoothGattService;
            }
        }
    }

    protected void C0() {
        MEATERDevice mEATERDevice;
        if (this.f53624M == e0.JUST_CONNECTED) {
            U4.b.a("Connected to %s ", this.f53643e.description());
            this.f53647i.a();
            A0(e0.DISCOVERING_SERVICES);
        }
        if (this.f53624M == e0.DISCOVERING_SERVICES && z() && j0() != null) {
            j0().setConnectionMethod(DeviceConnectionMethod.BLUETOOTH);
            j0().setSecondaryConnectionState(DeviceConnectionState.CONNECTED);
            A0(e0.CONNECTED);
        }
        if (this.f53624M == e0.CONNECTED && (mEATERDevice = this.f53643e) != null && mEATERDevice.needsFirmwareUpdate()) {
            C2316d.g(this.f53643e, false);
        }
    }

    @Override // z4.Q, z4.C5181k
    protected boolean D() {
        return this.f53616E == l.e.eBlockStatusModeConfiguring;
    }

    @Override // z4.Q
    public void R() {
        super.Z(Q.c.DISCOVERING_CHARACTERISTICS);
        super.Y(this.f53623L);
        super.x();
    }

    @Override // z4.Q
    public void U() {
        super.U();
        U4.b.d("WIFI &&& --- ignoreBlockStateForAWhile called again  ", new Object[0]);
        this.f53625N = false;
        this.f53626O = false;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: z4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f53579B.s0();
            }
        }, 10000L);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: z4.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f53598B.t0();
            }
        }, 20000L);
    }

    @Override // z4.Q, z4.C5181k
    protected int g() {
        return 10000;
    }

    protected MEATERBlock j0() {
        return (MEATERBlock) this.f53643e;
    }

    public void k0() {
        D0(l.b.eMobileAppCommandSelectWiFiMode, O.f53439q);
    }

    public void l0() {
        D0(l.b.eMobileAppCommandSetWiFiModeAP, O.f53439q);
    }

    public void m0() {
        l.b bVar = x4.g.t().n1() ? l.b.eWifiScanStatusMobileCmdHelloFahrenheit : l.b.eWifiScanStatusMobileCmdHelloCelsius;
        l.e eVar = this.f53616E;
        if (eVar == l.e.eBlockStatusModeWifiClient) {
            D0(bVar, O.f53439q);
        } else if (eVar == l.e.eBlockStatusModeConfiguring) {
            D0(bVar, O.f53439q);
        } else {
            U4.b.a(" enterWiFiSetupMode - %s", eVar);
        }
    }

    public l.e n0() {
        return this.f53616E;
    }

    public String o0() {
        return this.f53620I;
    }

    @Override // z4.C5181k
    protected void p() {
        super.p();
    }

    protected void p0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null) {
            return;
        }
        this.f53643e.setFirmwareRevision(new String(value));
    }

    protected void q0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value.length == 1) {
            byte b10 = value[0];
            U4.b.a("MEATER-PLUS-BATTERY-LEVEL %s: %d", this.f53643e.getDebugLogDescription(), Integer.valueOf(b10));
            if (b10 > 100) {
                return;
            }
            this.f53643e.setBatteryLevel(b10);
        }
    }

    public void u0(l.c cVar) {
        int i10 = a.f53628b[cVar.ordinal()];
        D0(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : l.b.eMobileAppCommandBlockReboot : l.b.eMobileAppCommandResetToFactorySw : l.b.eMobileAppCommandResetPairing : l.b.eMobileAppCommandClearSettings, O.f53439q);
    }

    @Override // z4.Q, z4.C5181k
    protected void v(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.v(bluetoothGattCharacteristic);
        U4.b.a("[STATE] Keep Alive Block received= %s", bluetoothGattCharacteristic.getUuid().toString());
        if (O.f53427e.equals(bluetoothGattCharacteristic.getUuid())) {
            q0(bluetoothGattCharacteristic);
            this.f53622K = bluetoothGattCharacteristic.getUuid();
        }
        UUID uuid = O.f53441s;
        if (uuid.equals(bluetoothGattCharacteristic.getUuid())) {
            w0(bluetoothGattCharacteristic);
            this.f53622K = bluetoothGattCharacteristic.getUuid();
        }
        if (O.f53436n.equals(bluetoothGattCharacteristic.getUuid())) {
            this.f53622K = bluetoothGattCharacteristic.getUuid();
        } else if (O.f53432j.equals(bluetoothGattCharacteristic.getUuid()) && !v0(bluetoothGattCharacteristic) && this.f53621J != null) {
            p0(bluetoothGattCharacteristic);
        }
        if (O.f53440r.equals(bluetoothGattCharacteristic.getUuid())) {
            this.f53620I = Q.N(bluetoothGattCharacteristic.getValue());
        }
        if (uuid.equals(bluetoothGattCharacteristic.getUuid())) {
            w0(bluetoothGattCharacteristic);
            C5181k.f53634p.post(new Runnable() { // from class: z4.f
                @Override // java.lang.Runnable
                public final void run() {
                    C5177g.r0();
                }
            });
        }
        C0();
        this.f53643e.updateState();
        K();
    }

    protected boolean v0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        MEATERDevice mEATERDevice = this.f53643e;
        if (mEATERDevice == null) {
            return false;
        }
        U4.b.a("FIRMWARE-REVISION %s - %s", mEATERDevice.getDebugLogDescription(), bluetoothGattCharacteristic);
        byte[] value = bluetoothGattCharacteristic.getValue();
        U4.b.a("M+FIRMWARE-REVISION %s", this.f53643e.getDebugLogDescription());
        String str = new String(value);
        if (str.equals("Software Revision")) {
            return false;
        }
        this.f53643e.setFirmwareRevision(str);
        M4.h.f11978a.f0(this.f53643e);
        this.f53643e.setHaveReadFirmwareRevision(true);
        return true;
    }

    @Override // z4.Q, z4.C5181k
    protected void w() {
        C0();
    }

    protected void w0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            U4.b.a("Bad characteristic in receivedStatus ", new Object[0]);
            return;
        }
        MEATERDevice mEATERDevice = this.f53643e;
        if (mEATERDevice != null) {
            U4.b.a("CMD %s - %s", mEATERDevice.getDebugLogDescription(), bluetoothGattCharacteristic);
        }
        B4.a aVarA = B4.a.a(bluetoothGattCharacteristic.getValue());
        l.f fVar = aVarA.f1535b;
        l.f fVar2 = l.f.eBlockStatusWifiUnknown;
        if (!this.f53625N && !this.f53626O) {
            U4.b.d("WIFI <><>  Ignoring Block connection state change (%s). We should wait for the timeout to be reached  ", fVar);
            return;
        }
        if (!this.f53626O) {
            if (fVar != l.f.eBlockStatusWifiConnected) {
                return;
            } else {
                this.f53626O = true;
            }
        }
        l.e eVar = aVarA.f1534a;
        l.d dVar = aVarA.f1536c;
        int i10 = aVarA.f1537d;
        z0(eVar);
        y0(eVar);
        Q.c cVarS = S();
        Q.c cVar = Q.c.WAITING_FOR_WIFI_CONNECTION_STATUS;
        if (cVarS == cVar && fVar == l.f.eBlockStatusWifiConnected) {
            C5181k.e eVar2 = this.f53644f;
            if (eVar2 instanceof Q.a) {
                ((Q.a) eVar2).c(Q.d.CONNECTED);
            }
        } else if (fVar == l.f.eBlockStatusWifiDisconnected && (this.f53644f instanceof Q.a)) {
            U4.b.d(" currentWiFiStatus = %s ->wifiStatus = %s  ", l.f.j(this.f53617F), l.f.j(fVar));
            MEATERDevice mEATERDevice2 = this.f53643e;
            if (mEATERDevice2 == null || !(mEATERDevice2.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK || this.f53643e.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK)) {
                if (this.f53617F != fVar) {
                    ((Q.a) this.f53644f).c(Q.d.NOT_CONNECTED);
                }
                if (S() != Q.c.READING_NETWORK_LIST) {
                    Z(Q.c.SCAN_STOPPED);
                }
            } else {
                U4.b.d("disconnected ", new Object[0]);
                if (S() == cVar) {
                    ((Q.a) this.f53644f).c(Q.d.NOT_CONNECTED);
                    Z(Q.c.SCAN_STOPPED);
                }
            }
        }
        this.f53617F = fVar;
        if (this.f53618G != dVar) {
            U4.b.a("CLOUD %s %s -> %s", this.f53643e.getDebugLogDescription(), l.d.j(this.f53618G), l.d.j(dVar));
            this.f53618G = dVar;
        }
        U4.b.a("RSSI %s %s -> %s", this.f53643e.getDebugLogDescription(), Integer.valueOf(this.f53643e.getSignalLevel()), Integer.valueOf(i10));
        this.f53643e.setSignalLevel(P5.T.d(i10));
    }

    @Override // z4.Q, z4.C5181k
    protected void x() {
        if (this.f53623L == null || this.f53621J == null) {
            B0();
        }
        BluetoothGattService bluetoothGattService = this.f53621J;
        if (bluetoothGattService != null) {
            C5181k.f53635q.d(new B4.g(this.f53652n, bluetoothGattService, O.f53432j, false, false));
        }
        BluetoothGattService bluetoothGattService2 = this.f53623L;
        if (bluetoothGattService2 != null) {
            B4.f fVar = C5181k.f53635q;
            fVar.d(new B4.j(this.f53652n, bluetoothGattService2, O.f53441s, false, false));
            fVar.d(new B4.g(this.f53652n, this.f53623L, O.f53436n, false, false));
            fVar.d(new B4.g(this.f53652n, this.f53623L, O.f53440r, false, false));
            C0();
        }
    }

    @Override // z4.C5181k
    protected boolean z() {
        return (h0() || i0()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0() {
    }
}
