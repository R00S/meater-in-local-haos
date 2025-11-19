package z4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import c5.C2316d;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERPlus;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.BLERadioState;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import g1.C3377a;
import j1.C3724i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import z4.C5181k;
import z4.K;

/* compiled from: MEATERBLEManager.java */
/* renamed from: z4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5194y {

    /* renamed from: n, reason: collision with root package name */
    private static K f53687n;

    /* renamed from: d, reason: collision with root package name */
    private final f f53693d;

    /* renamed from: e, reason: collision with root package name */
    private final d f53694e;

    /* renamed from: g, reason: collision with root package name */
    private long f53696g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f53697h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f53700k;

    /* renamed from: m, reason: collision with root package name */
    private static c f53686m = c.NONE;

    /* renamed from: o, reason: collision with root package name */
    static final Handler f53688o = new Handler(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    private static final C5194y f53689p = new C5194y();

    /* renamed from: a, reason: collision with root package name */
    private final int f53690a = 6000;

    /* renamed from: b, reason: collision with root package name */
    private final int f53691b = 2000;

    /* renamed from: c, reason: collision with root package name */
    private final int f53692c = Temperature.MAX_AMBIENT_SECOND_GEN_PROBE;

    /* renamed from: f, reason: collision with root package name */
    private b f53695f = b.INACTIVE;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f53698i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f53699j = 5;

    /* renamed from: l, reason: collision with root package name */
    BroadcastReceiver f53701l = new a();

    /* compiled from: MEATERBLEManager.java */
    /* renamed from: z4.y$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BLERadioState bLERadioStateB = C5194y.this.B(intent);
            for (Probe probe : M4.h.f11978a.L()) {
                if (probe.getEventLog() != null) {
                    probe.getEventLog().bleRadioStateChanged(bLERadioStateB);
                }
            }
            if (bLERadioStateB == BLERadioState.BLE_STATE_DISABLED) {
                U4.b.a("---BLE DISABLED---", new Object[0]);
                C2316d.I();
                C5194y.this.K();
                M4.h.f11978a.p();
                return;
            }
            if (bLERadioStateB == BLERadioState.BLE_STATE_ENABLED) {
                U4.b.a("---BLE ENABLED---", new Object[0]);
                C5194y.this.H();
                C2316d.i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MEATERBLEManager.java */
    /* renamed from: z4.y$b */
    enum b {
        INACTIVE,
        SCANNING,
        CONNECTING
    }

    /* compiled from: MEATERBLEManager.java */
    /* renamed from: z4.y$c */
    public enum c {
        RESTARTED,
        NOTIFICATION_SENT,
        NONE
    }

    /* compiled from: MEATERBLEManager.java */
    /* renamed from: z4.y$d */
    private class d implements C5181k.e {
        @Override // z4.C5181k.e
        public void d(C5181k c5181k) {
            if (c5181k.f53641c == C5181k.d.DISCONNECTED) {
                C5194y.this.o(c5181k, c5181k.s());
            }
        }

        @Override // z4.C5181k.e
        public boolean e(C5181k c5181k) {
            return true;
        }

        private d() {
        }
    }

    /* compiled from: MEATERBLEManager.java */
    /* renamed from: z4.y$e */
    private class e implements Comparator<MEATERDevice> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MEATERDevice mEATERDevice, MEATERDevice mEATERDevice2) {
            if (mEATERDevice.getLastConnectionAttemptDate() > mEATERDevice2.getLastConnectionAttemptDate()) {
                return 1;
            }
            if (mEATERDevice.getLastConnectionAttemptDate() < mEATERDevice2.getLastConnectionAttemptDate()) {
                return -1;
            }
            if (mEATERDevice.getLastSeenDate() < mEATERDevice2.getLastSeenDate()) {
                return 1;
            }
            return mEATERDevice.getLastSeenDate() > mEATERDevice2.getLastSeenDate() ? -1 : 0;
        }

        private e(C5194y c5194y) {
        }
    }

    /* compiled from: MEATERBLEManager.java */
    /* renamed from: z4.y$f */
    private class f implements K.b {
        @Override // z4.K.b
        public void a(int i10, String str) {
            if (i10 != 2 || M4.h.f11978a.u() || C5181k.B()) {
                return;
            }
            U4.b.a("Scanning failed Will attempt to restart BLE", new Object[0]);
            C5194y.C(i10);
        }

        @Override // z4.K.b
        public void c(long j10, String str, int i10, boolean z10) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            M4.h hVar = M4.h.f11978a;
            MEATERDevice mEATERDeviceO = hVar.o(j10);
            if (mEATERDeviceO == null) {
                mEATERDeviceO = MEATERDevice.newDevice(i10, j10);
                if (mEATERDeviceO == null) {
                    return;
                }
                mEATERDeviceO.setDeviceID(j10);
                mEATERDeviceO.setProbeNumber(i10);
            }
            if (z10 && mEATERDeviceO.isMEATERBlock()) {
                MEATERBlock mEATERBlock = (MEATERBlock) mEATERDeviceO;
                mEATERBlock.setSupportsBLEKeepAlive(true);
                mEATERBlock.setSecondaryConnectionMethod(DeviceConnectionMethod.BLUETOOTH);
            }
            mEATERDeviceO.setConnectionMethod(DeviceConnectionMethod.BLUETOOTH);
            mEATERDeviceO.setMacAddress(str);
            if (mEATERDeviceO.getFirstSeenAdvertising() == 0) {
                mEATERDeviceO.setFirstSeenAdvertising(jCurrentTimeMillis);
            }
            if (hVar.T(mEATERDeviceO)) {
                mEATERDeviceO.setLastSeenDate(jCurrentTimeMillis);
                mEATERDeviceO.setLastSeenAdvertising(jCurrentTimeMillis);
            }
            U4.b.a("Found device %s", mEATERDeviceO.getDebugLogDescription());
            if (mEATERDeviceO.isPaired()) {
                hVar.f0(mEATERDeviceO);
            } else {
                mEATERDeviceO.setParentDeviceID(0L);
                hVar.Z(C3724i.a(new Object[]{mEATERDeviceO}));
            }
            mEATERDeviceO.notifyStateUpdated();
            if (C5194y.this.f53695f == b.SCANNING && C5194y.f53687n.u() && !C5194y.this.f53697h && C5194y.this.F()) {
                U4.b.a("All devices appear to be connected or advertising, will stop scan early.", new Object[0]);
                C5194y.f53687n.B();
            }
        }

        @Override // z4.K.b
        public void d() {
            C5194y.this.A(b.CONNECTING, 0L);
        }

        private f() {
        }

        @Override // z4.K.b
        public void b() {
        }
    }

    public C5194y() {
        this.f53693d = new f();
        this.f53694e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(final b bVar, long j10) {
        Handler handler = f53688o;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new Runnable() { // from class: z4.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f53682B.x(bVar);
            }
        }, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BLERadioState B(Intent intent) {
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (intExtra == 10) {
                return BLERadioState.BLE_STATE_DISABLED;
            }
            if (intExtra == 12) {
                return BLERadioState.BLE_STATE_ENABLED;
            }
        }
        return BLERadioState.BLE_STATE_UNKNOWN;
    }

    public static void C(int i10) {
        if (M4.h.f11978a.I()) {
            boolean zIsEnabled = false;
            if (x4.g.o().toLowerCase().startsWith("huawei")) {
                U4.b.a("Won't stop BLE because it won't let us start it again on this device.", new Object[0]);
                return;
            }
            if (Config.getInstance().DEBUG_UI_ENABLED) {
                Toast.makeText(x4.g.h(), "Need to RefreshBLEConnection calling from =" + i10, 1).show();
            }
            c cVar = f53686m;
            c cVar2 = c.NOTIFICATION_SENT;
            if (cVar == cVar2) {
                return;
            }
            if (f53686m == c.RESTARTED) {
                f53686m = cVar2;
                C2316d.H();
                return;
            }
            final BluetoothAdapter bluetoothAdapterR = r();
            if (bluetoothAdapterR != null) {
                try {
                    zIsEnabled = bluetoothAdapterR.isEnabled();
                } catch (Exception unused) {
                }
                if (zIsEnabled) {
                    f53686m = c.RESTARTED;
                    for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
                        if (mEATERDevice.getBleConnection() != null) {
                            mEATERDevice.getBleConnection().n();
                        }
                    }
                    f53688o.post(new Runnable() { // from class: z4.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5194y.z(bluetoothAdapterR);
                        }
                    });
                }
            }
        }
    }

    private void D() {
        BluetoothAdapter bluetoothAdapterQ = q();
        if (bluetoothAdapterQ != null) {
            if (f53687n == null) {
                f53687n = new K(bluetoothAdapterQ, this.f53693d);
            }
            f53687n.w();
        }
    }

    public static C5194y E() {
        return f53689p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F() {
        for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
            if (mEATERDevice.getParentDevice() == null && !mEATERDevice.isOnline()) {
                return false;
            }
        }
        return true;
    }

    private boolean G(MEATERDevice mEATERDevice) {
        if (!mEATERDevice.isMEATERProbe() || mEATERDevice.isBlockProbe()) {
            return false;
        }
        if (mEATERDevice.getParentDevice() == null || !mEATERDevice.getParentDevice().isMEATERPlus()) {
            Iterator<MEATERDevice> it = M4.h.f11978a.s().getValue().iterator();
            while (it.hasNext()) {
                MEATERDevice next = it.next();
                if (next.isMEATERPlus()) {
                    if (!next.isPaired() && next.isOnline()) {
                        U4.b.a("Can defer probe connection to %s as unpaired %s may need a chance to connect", mEATERDevice.getDebugLogDescription(), next.getDebugLogDescription());
                    } else if (next.relatedProbe() == null || next.relatedProbe().getConnectionState() != DeviceConnectionState.CONNECTED) {
                        U4.b.a("Can defer connection to %s to give %s a chance to connect", mEATERDevice.getDebugLogDescription(), next.getDebugLogDescription());
                    }
                }
            }
            return false;
        }
        U4.b.a("Can defer connection to %s to give its parent %s a chance to connect", mEATERDevice.getDebugLogDescription(), mEATERDevice.getParentDevice().getDebugLogDescription());
        double dN = N(mEATERDevice);
        if (dN > 0.0d) {
            U4.b.a("Will wait %f seconds before connecting to %s", Double.valueOf(dN), mEATERDevice.getDebugLogDescription());
        } else {
            U4.b.a("No need to wait to connect to %s", mEATERDevice.getDebugLogDescription());
        }
        return dN > 0.0d;
    }

    private double N(MEATERDevice mEATERDevice) {
        double d10;
        Config.getInstance();
        if (mEATERDevice.getParentDevice() == null || !mEATERDevice.getParentDevice().isMEATERPlus()) {
            d10 = 5.0d;
        } else {
            Config.getInstance();
            d10 = 7.5d;
        }
        return mEATERDevice.getFirstSeenAdvertising() > 0 ? d10 + ((mEATERDevice.getFirstSeenAdvertising() - System.currentTimeMillis()) / 1000) : d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.f53698i) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f53696g == 0) {
            this.f53696g = jCurrentTimeMillis + 6000;
        }
        b bVar = this.f53695f;
        if (bVar == b.INACTIVE) {
            return;
        }
        b bVar2 = b.SCANNING;
        if (bVar == bVar2) {
            if (C5181k.y() || C5181k.B()) {
                U4.b.a("Won't scan because we have BLE tasks in progress", new Object[0]);
            } else if (!this.f53697h && M4.h.f11978a.K().size() == 0) {
                U4.b.a("Won't scan because we have no paired devices and quickpairing is off", new Object[0]);
            } else if (this.f53697h || s()) {
                D();
            } else {
                U4.b.a("Won't scan because we have BLE connections for all paired devices and quickpairing is off", new Object[0]);
            }
            A(b.CONNECTING, 6000L);
            return;
        }
        if (bVar == b.CONNECTING) {
            if (!n()) {
                if (C5181k.y()) {
                    f53688o.postDelayed(new Runnable() { // from class: z4.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f53684B.O();
                        }
                    }, 500L);
                    return;
                } else {
                    A(bVar2, 2000L);
                    return;
                }
            }
            if (jCurrentTimeMillis <= this.f53696g) {
                f53688o.postDelayed(new Runnable() { // from class: z4.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53684B.O();
                    }
                }, 500L);
            } else {
                if (C5181k.y()) {
                    return;
                }
                A(bVar2, 0L);
            }
        }
    }

    private void k(MEATERDevice mEATERDevice) {
        byte[] bArrH;
        C5181k c0Var;
        BluetoothAdapter bluetoothAdapterQ = q();
        if (bluetoothAdapterQ == null || (bArrH = C5181k.H(mEATERDevice.getMacAddress())) == null) {
            return;
        }
        BluetoothDevice remoteDevice = bluetoothAdapterQ.getRemoteDevice(bArrH);
        if (mEATERDevice.isMEATERPlus()) {
            c0Var = new Y(remoteDevice, (MEATERPlus) mEATERDevice, this.f53694e);
        } else if (mEATERDevice.isMEATERBlock()) {
            MEATERBlock mEATERBlock = (MEATERBlock) mEATERDevice;
            c0Var = mEATERBlock.isSupportsBLEKeepAlive() ? new C5177g(remoteDevice, mEATERBlock, this.f53694e) : null;
        } else {
            c0Var = new c0(remoteDevice, mEATERDevice, this.f53694e);
        }
        if (c0Var != null) {
            mEATERDevice.setBleConnection(c0Var);
            mEATERDevice.setLastConnectionAttemptDate(System.currentTimeMillis());
            c0Var.j(x4.g.h());
        }
    }

    public static boolean l() {
        return q() != null;
    }

    private boolean m(MEATERDevice mEATERDevice) {
        M4.h hVar = M4.h.f11978a;
        if (hVar.S(mEATERDevice)) {
            return (mEATERDevice.getParentDevice() == null || !mEATERDevice.getShouldShowAsConnected()) && mEATERDevice.getBleConnection() == null && hVar.H() == null && !C5181k.y() && mEATERDevice.getLastSeenAdvertising() != 0 && System.currentTimeMillis() - mEATERDevice.getLastSeenAdvertising() <= 10000;
        }
        return false;
    }

    private boolean n() {
        ArrayList arrayList;
        String string;
        int i10 = 0;
        if (!l()) {
            return false;
        }
        M4.h hVar = M4.h.f11978a;
        if (hVar.K().size() == 0) {
            return false;
        }
        MEATERPlus mEATERPlusH = hVar.H();
        if (mEATERPlusH != null) {
            if (mEATERPlusH.getBleConnection() != null) {
                return false;
            }
            k(mEATERPlusH);
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        for (MEATERDevice mEATERDevice : hVar.K()) {
            if (m(mEATERDevice) && !G(mEATERDevice)) {
                arrayList2.add(mEATERDevice);
            }
        }
        if (arrayList2.size() <= 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Collections.sort(arrayList2, new e());
        U4.b.a("---", new Object[0]);
        U4.b.a("Devices we will try to connect to in order of priority:", new Object[0]);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            MEATERDevice mEATERDevice2 = (MEATERDevice) it.next();
            String debugLogDescription = mEATERDevice2.getDebugLogDescription();
            String str = "-";
            if (mEATERDevice2.getLastSeenDate() != 0) {
                StringBuilder sb2 = new StringBuilder();
                arrayList = arrayList2;
                sb2.append((jCurrentTimeMillis - mEATERDevice2.getLastSeenDate()) / 1000);
                sb2.append("s");
                string = sb2.toString();
            } else {
                arrayList = arrayList2;
                string = "-";
            }
            if (mEATERDevice2.getLastConnectionAttemptDate() != 0) {
                str = ((jCurrentTimeMillis - mEATERDevice2.getLastConnectionAttemptDate()) / 1000) + "s";
            }
            U4.b.a("%s: Last seen: %s Last attempted to connect: %s", debugLogDescription, string, str);
            arrayList2 = arrayList;
            i10 = 0;
        }
        U4.b.a("---", new Object[i10]);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            MEATERDevice mEATERDevice3 = (MEATERDevice) it2.next();
            if (m(mEATERDevice3)) {
                U4.b.a("Attempting connection to %s", mEATERDevice3.getDebugLogDescription());
                k(mEATERDevice3);
                return true;
            }
        }
        return false;
    }

    public static void p() {
        BluetoothAdapter bluetoothAdapterR;
        if (q() == null && (bluetoothAdapterR = r()) != null && C3377a.a(x4.g.h(), "android.permission.BLUETOOTH_CONNECT") == 0) {
            bluetoothAdapterR.enable();
        }
    }

    public static BluetoothAdapter q() {
        try {
            BluetoothAdapter bluetoothAdapterR = r();
            if (bluetoothAdapterR != null && bluetoothAdapterR.isEnabled()) {
                if (bluetoothAdapterR.getState() == 12) {
                    return bluetoothAdapterR;
                }
            }
            return null;
        } catch (Exception e10) {
            if (e10 instanceof DeadObjectException) {
                U4.b.a("Got DeadObjectException trying to detect adapter.isEnabled(). Must restart BLE", new Object[0]);
                C(-3);
            }
            return null;
        }
    }

    public static BluetoothAdapter r() {
        BluetoothManager bluetoothManager = (BluetoothManager) x4.g.h().getSystemService("bluetooth");
        if (bluetoothManager == null) {
            return null;
        }
        return bluetoothManager.getAdapter();
    }

    private boolean s() {
        for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
            if (mEATERDevice.isMEATERProbe() || mEATERDevice.isMEATERPlus()) {
                if (mEATERDevice.getBleConnection() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean t() {
        if (!l()) {
            return null;
        }
        BluetoothAdapter bluetoothAdapterR = r();
        Objects.requireNonNull(bluetoothAdapterR);
        return Boolean.valueOf(bluetoothAdapterR.isLe2MPhySupported());
    }

    public static Boolean u() {
        if (!l()) {
            return null;
        }
        BluetoothAdapter bluetoothAdapterR = r();
        Objects.requireNonNull(bluetoothAdapterR);
        return Boolean.valueOf(bluetoothAdapterR.isLeCodedPhySupported());
    }

    public static Boolean v() {
        if (!l()) {
            return null;
        }
        BluetoothAdapter bluetoothAdapterR = r();
        Objects.requireNonNull(bluetoothAdapterR);
        return Boolean.valueOf(bluetoothAdapterR.isLeExtendedAdvertisingSupported());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(b bVar) {
        U4.b.a("BLEManager scan state %s -> %s", this.f53695f.toString(), bVar.toString());
        this.f53695f = bVar;
        this.f53696g = 0L;
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(BluetoothAdapter bluetoothAdapter) {
        U4.b.a("Re-enabling BLE", new Object[0]);
        bluetoothAdapter.enable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(final BluetoothAdapter bluetoothAdapter) {
        U4.b.a("Disabling BLE", new Object[0]);
        bluetoothAdapter.disable();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: z4.x
            @Override // java.lang.Runnable
            public final void run() {
                C5194y.y(bluetoothAdapter);
            }
        }, 2000L);
    }

    public void H() {
        if (this.f53695f == b.INACTIVE) {
            P5.Q.D(x4.g.h(), this.f53701l, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            U4.b.a("Starting BLE...", new Object[0]);
            A(b.SCANNING, 0L);
        }
    }

    public void I() {
        this.f53698i = false;
        O();
    }

    public void J() {
        this.f53697h = true;
        if (C5181k.y()) {
            return;
        }
        A(b.SCANNING, 0L);
    }

    public void K() {
        if (this.f53695f != b.INACTIVE) {
            U4.b.a("Stopping BLE...", new Object[0]);
            f53688o.removeCallbacksAndMessages(null);
            U4.b.a("Disconnecting BLE peripherals...", new Object[0]);
            for (MEATERDevice mEATERDevice : M4.h.f11978a.K()) {
                if (mEATERDevice.getParentDevice() == null && mEATERDevice.getBleConnection() != null) {
                    mEATERDevice.getBleConnection().n();
                }
            }
            String string = this.f53695f.toString();
            b bVar = b.INACTIVE;
            U4.b.a("BLEManager scan state %s -> %s", string, bVar.toString());
            this.f53695f = bVar;
        }
    }

    public void L() {
        this.f53698i = true;
    }

    public void M() {
        this.f53697h = false;
    }

    public void o(C5181k c5181k, int i10) {
        if ((c5181k.getClass().equals(c0.class) || c5181k.getClass().equals(Y.class)) && x4.g.y()) {
            MEATERDevice mEATERDeviceR = ((c0) c5181k).r();
            if (mEATERDeviceR.getLastSeenDate() == 0 || (System.currentTimeMillis() - mEATERDeviceR.getLastSeenDate()) / 1000 > 120) {
                U4.b.a("%s disconnected  but we haven't seen it recently so we won't attempt to toggle BLE", mEATERDeviceR.getDebugLogDescription());
                return;
            }
            if (C5181k.B()) {
                U4.b.a("%s disconnected but we won't attempt to toggle BLE because some other important BLE operation is in progress (eg M+ OTA or Block WiFi setup).", mEATERDeviceR.getDebugLogDescription());
                return;
            }
            if (mEATERDeviceR.relatedProbe() != null && mEATERDeviceR.relatedProbe().getCookState() == DeviceCookState.COOK_STATE_NOT_STARTED && M4.h.f11978a.u()) {
                U4.b.a("%s disconnected but we won't attempt to toggle BLE because it has no ongoing cook but we do have at least one other ongoing cook for a BLE-connected probe.", mEATERDeviceR.getDebugLogDescription());
                return;
            }
            int bogusConnectionCount = mEATERDeviceR.getBogusConnectionCount();
            int i11 = this.f53699j;
            if (bogusConnectionCount >= i11) {
                this.f53699j = i11 * 2;
                U4.b.a("%s disconnected %d times in a row without receiving a characteristic value. Will try restarting BLE.", mEATERDeviceR.getDebugLogDescription(), Integer.valueOf(mEATERDeviceR.getBogusConnectionCount()));
                f53687n.B();
                mEATERDeviceR.setBogusConnectionCount(0);
                return;
            }
            if (i10 == 100133) {
                mEATERDeviceR.setDisconnectedWith133StatusCodeCount(mEATERDeviceR.getDisconnectedWith133StatusCodeCount() + 1);
                U4.b.a("%s Got immediate 133 status code for BLE connection (%d times in a row)", mEATERDeviceR.getDebugLogDescription(), Integer.valueOf(mEATERDeviceR.getDisconnectedWith133StatusCodeCount()));
                if (mEATERDeviceR.getDisconnectedWith133StatusCodeCount() < 20 || this.f53700k || (System.currentTimeMillis() - mEATERDeviceR.getLastSeenAdvertising()) / 1000 >= 60) {
                    return;
                }
                this.f53700k = true;
                Intent intent = new Intent(ProtocolParameters.MEATER_SERVICE_NOTIF_BLE);
                intent.putExtra(ProtocolParameters.MEATER_NOTIF_BLE_DEVICE_NEEDS_RESTART, true);
                intent.setPackage(x4.g.h().getPackageName());
                x4.g.h().sendBroadcast(intent);
            }
        }
    }

    public boolean w() {
        return this.f53697h;
    }
}
