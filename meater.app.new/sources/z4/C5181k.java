package z4;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.ProbeEventLog;
import com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionState;
import g1.C3377a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: MEATERBLEConnection.java */
/* renamed from: z4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5181k {

    /* renamed from: p, reason: collision with root package name */
    static final Handler f53634p = new Handler(Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public static final B4.f f53635q = new B4.f();

    /* renamed from: r, reason: collision with root package name */
    static final ArrayList<C5181k> f53636r = new ArrayList<>();

    /* renamed from: s, reason: collision with root package name */
    static long f53637s = 0;

    /* renamed from: t, reason: collision with root package name */
    private static int f53638t = 0;

    /* renamed from: a, reason: collision with root package name */
    protected BluetoothDevice f53639a;

    /* renamed from: b, reason: collision with root package name */
    protected BluetoothGatt f53640b;

    /* renamed from: d, reason: collision with root package name */
    protected long f53642d;

    /* renamed from: e, reason: collision with root package name */
    MEATERDevice f53643e;

    /* renamed from: f, reason: collision with root package name */
    e f53644f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f53645g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f53646h;

    /* renamed from: j, reason: collision with root package name */
    protected int f53648j;

    /* renamed from: c, reason: collision with root package name */
    d f53641c = d.NOT_CONNECTED;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f53647i = new d0();

    /* renamed from: k, reason: collision with root package name */
    protected final Runnable f53649k = new a();

    /* renamed from: l, reason: collision with root package name */
    private boolean f53650l = false;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f53651m = new b();

    /* renamed from: n, reason: collision with root package name */
    final C5181k f53652n = this;

    /* renamed from: o, reason: collision with root package name */
    private final BluetoothGattCallback f53653o = new c();

    /* compiled from: MEATERBLEConnection.java */
    /* renamed from: z4.k$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5181k.this.C()) {
                U4.b.a("%s timing out connection to %s", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                C5181k.this.n();
            }
        }
    }

    /* compiled from: MEATERBLEConnection.java */
    /* renamed from: z4.k$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5181k.this.f53641c.equals(d.CONNECTED)) {
                if (!C5181k.this.f53650l) {
                    C5181k.this.J();
                }
                C5181k.f53634p.postDelayed(C5181k.this.f53651m, 5000);
            }
        }
    }

    /* compiled from: MEATERBLEConnection.java */
    /* renamed from: z4.k$c */
    class c extends BluetoothGattCallback {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            C5181k.this.v(bluetoothGattCharacteristic);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            C5181k.this.v(bluetoothGattCharacteristic);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            C5181k.this.K();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            C5181k.this.u(bluetoothGattCharacteristic);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n() {
            if (!C5181k.this.f53641c.equals(d.CONNECTING)) {
                U4.b.a("%s disconnected while waiting to discover services for %s", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            C5181k.this.K();
            C5181k.this.L(d.DISCOVERING_SERVICES);
            C5181k.this.w();
            C5181k.this.p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(BluetoothGatt bluetoothGatt, int i10, int i11) {
            C5181k c5181k = C5181k.this;
            if (c5181k.f53640b != bluetoothGatt || !c5181k.k(i10)) {
                U4.b.a("Got erroneous connection state, ignoring.", new Object[0]);
                return;
            }
            if (i11 != 0) {
                C5181k.this.o(i11);
                return;
            }
            C5181k.this.K();
            U4.b.a("%s connected to %s", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
            if (i10 == 0) {
                C5181k.this.o(i11);
            } else {
                if (i10 != 2) {
                    return;
                }
                C5181k.f53634p.postDelayed(new Runnable() { // from class: z4.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53680B.n();
                    }
                }, 2000L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p() {
            C5181k.this.K();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(int i10) {
            C5181k.this.f53643e.setSignalLevel(i10);
            Probe probeRelatedProbe = C5181k.this.f53643e.relatedProbe();
            ProbeEventLog eventLog = probeRelatedProbe != null ? probeRelatedProbe.getEventLog() : null;
            if (!C5181k.this.f53643e.isMEATERBlock() || !((T4.y) C5181k.this.f53643e).supportKeepAliveFeature()) {
                if (C5181k.this.f53643e.relatedProbe() == null || eventLog == null) {
                    return;
                }
                eventLog.rssiChanged(i10);
                return;
            }
            MEATERBlock mEATERBlock = (MEATERBlock) C5181k.this.f53643e;
            mEATERBlock.setSecondaryConnectionSignalLevel(i10);
            Iterator<MEATERDevice> it = mEATERBlock.getChildDevices().iterator();
            while (it.hasNext()) {
                MEATERDevice next = it.next();
                if (next != null && next.isMEATERProbe()) {
                    Probe probe = (Probe) next;
                    if (probe.getEventLog() != null) {
                        probe.getEventLog().meaterBlockBLERSSIChanged(i10);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(BluetoothGatt bluetoothGatt, int i10) {
            C5181k c5181k = C5181k.this;
            if (c5181k.f53640b != bluetoothGatt || !c5181k.f53641c.equals(d.DISCOVERING_SERVICES)) {
                U4.b.a("%s Got erroneous services discovered callback for %s after disconnection, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            if (i10 != 0) {
                U4.b.a("Discover services failed with code %d for %s", Integer.valueOf(i10), C5181k.this.f53643e.getDebugLogDescription());
                C5181k.this.o(i10);
                return;
            }
            C5181k.this.K();
            U4.b.a("Discovered services from %s", C5181k.this.f53643e.getDebugLogDescription());
            C5181k.this.L(d.CONNECTED);
            C5181k.this.f53645g = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C5181k c5181k2 = C5181k.this;
            int i11 = ((int) (jCurrentTimeMillis - c5181k2.f53642d)) / 1000;
            c5181k2.x();
            C5181k.this.f53643e.setConnectionMethod(DeviceConnectionMethod.BLUETOOTH);
            C5181k.this.f53643e.setLastSeenDate(System.currentTimeMillis());
            C5181k.this.f53643e.setParentDeviceID(0L);
            M4.h.f11978a.Z(Collections.singletonList(C5181k.this.f53643e));
            if (C5181k.this.f53643e.relatedProbe() != null && C5181k.this.f53643e.relatedProbe().getEventLog() != null) {
                C5181k.this.f53643e.relatedProbe().getEventLog().addBLEProbeConnectionEventWithState(BLEProbeConnectionState.BLE_PROBE_CONNECTED, i11, -1);
            }
            C5181k.this.f53651m.run();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            C5181k c5181k = C5181k.this;
            if (c5181k.f53640b == bluetoothGatt && c5181k.f53641c.equals(d.CONNECTED)) {
                C5181k.f53634p.post(new Runnable() { // from class: z4.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53668B.j(bluetoothGattCharacteristic);
                    }
                });
            } else {
                U4.b.a("%s Got erroneous notify characteristic callback from %s after disconnection, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            B4.f fVar = C5181k.f53635q;
            B4.b bVarH = fVar.h();
            if (bVarH == null) {
                U4.b.a("%s got erroneous read characteristic callback from %s after operation already cleared, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            long jG = bVarH.g();
            C5181k c5181k = C5181k.this;
            if (c5181k.f53640b != bluetoothGatt || !c5181k.f53641c.equals(d.CONNECTED)) {
                U4.b.a("%s got erroneous read characteristic callback from %s after disconnection, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            if (i10 == 7) {
                U4.b.a("cook setup is empty", new Object[0]);
            } else if (i10 != 0) {
                U4.b.a("Failed reading %s from %s", O.a(bluetoothGattCharacteristic.getUuid()), C5181k.this.f53643e.getDebugLogDescription());
                C5181k.this.o(i10);
                return;
            }
            fVar.g();
            U4.b.a("Did read %s from %s (took %dms)", O.a(bluetoothGattCharacteristic.getUuid()), C5181k.this.f53643e.getDebugLogDescription(), Long.valueOf(jG));
            C5181k.f53634p.post(new Runnable() { // from class: z4.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53663B.k(bluetoothGattCharacteristic);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            B4.f fVar = C5181k.f53635q;
            B4.b bVarH = fVar.h();
            if (bVarH == null) {
                U4.b.a("%s Got erroneous write characteristic callback from %s after operation already cleared, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            long jG = bVarH.g();
            C5181k c5181k = C5181k.this;
            if (c5181k.f53640b != bluetoothGatt || !c5181k.f53641c.equals(d.CONNECTED)) {
                U4.b.a("%s Got erroneous write characteristic callback from %s after disconnection, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            if (i10 != 0) {
                U4.b.a("Failed to write %s from %s", O.a(bluetoothGattCharacteristic.getUuid()), C5181k.this.f53643e.getDebugLogDescription());
                C5181k.this.o(i10);
                return;
            }
            if (!bluetoothGattCharacteristic.getUuid().equals(fVar.h().b())) {
                U4.b.a("%s Got write callback for %s from %s, but we wanted one for %s", C5181k.this.l(), O.a(bluetoothGattCharacteristic.getUuid()), C5181k.this.f53643e.getDebugLogDescription());
                O.a(fVar.h().b());
                C5181k.this.o(i10);
                return;
            }
            Handler handler = C5181k.f53634p;
            handler.post(new Runnable() { // from class: z4.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53671B.l();
                }
            });
            U4.b.a("Did write %s from %s (took %dms)", O.a(bluetoothGattCharacteristic.getUuid()), C5181k.this.f53643e.getDebugLogDescription(), Long.valueOf(jG));
            if (bluetoothGattCharacteristic.getUuid().equals(O.f53428f)) {
                U4.b.a("%s Written log mode is now: ", C5181k.this.f53643e.getDebugLogDescription(), Byte.valueOf(bluetoothGattCharacteristic.getValue()[0]));
            }
            fVar.g();
            handler.post(new Runnable() { // from class: z4.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53672B.m(bluetoothGattCharacteristic);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(final BluetoothGatt bluetoothGatt, final int i10, final int i11) {
            C5181k.f53634p.post(new Runnable() { // from class: z4.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53674B.o(bluetoothGatt, i11, i10);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            B4.f fVar = C5181k.f53635q;
            B4.b bVarH = fVar.h();
            if (bVarH == null) {
                U4.b.a("%s Got erroneous notify subscription callback from %s after operation already cleared, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            long jG = bVarH.g();
            C5181k c5181k = C5181k.this;
            if (c5181k.f53640b != bluetoothGatt || !c5181k.f53641c.equals(d.CONNECTED)) {
                U4.b.a("%s Got erroneous notify subscription callback from %s after disconnection, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            if (i10 != 0) {
                U4.b.a("Failed to subscribe to notifications from %s", C5181k.this.f53643e.getDebugLogDescription());
                C5181k.this.o(i10);
            } else {
                C5181k.f53634p.post(new Runnable() { // from class: z4.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53670B.p();
                    }
                });
                fVar.g();
                U4.b.a("Did subscribe to notifications for %s from %s (took %dms)", O.a(bluetoothGattDescriptor.getCharacteristic().getUuid()), C5181k.this.f53643e.getDebugLogDescription(), Long.valueOf(jG));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            super.onMtuChanged(bluetoothGatt, i10, i11);
            B4.f fVar = C5181k.f53635q;
            B4.b bVarH = fVar.h();
            if (bVarH == null) {
                U4.b.a("%s Got erroneous 'MTU changed' callback from %s after operation already cleared, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            long jG = bVarH.g();
            C5181k c5181k = C5181k.this;
            if (c5181k.f53640b != bluetoothGatt || !c5181k.f53641c.equals(d.CONNECTED)) {
                U4.b.a("%s Got erroneous 'MTU changed' callback from %s after disconnection, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
            } else if (i11 != 0) {
                U4.b.a("Failed to change MTU on %s", C5181k.this.f53643e.getDebugLogDescription());
                C5181k.this.o(i11);
            } else {
                fVar.g();
                U4.b.a("MTU changed to %d on %s (took %dms)", Integer.valueOf(i10), C5181k.this.f53643e.getDebugLogDescription(), Long.valueOf(jG));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, final int i10, int i11) {
            B4.f fVar = C5181k.f53635q;
            B4.b bVarH = fVar.h();
            if (bVarH == null) {
                U4.b.a("%s Got erroneous RSSI reading callback from %s after operation already cleared, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            long jG = bVarH.g();
            C5181k c5181k = C5181k.this;
            if (c5181k.f53640b != bluetoothGatt || !c5181k.f53641c.equals(d.CONNECTED)) {
                U4.b.a("%s Got erroneous RSSI reading callback from %s after disconnection, ignoring", C5181k.this.l(), C5181k.this.f53643e.getDebugLogDescription());
                return;
            }
            if (i11 != 0) {
                U4.b.a("Failed to read RSSI from %s", C5181k.this.f53643e.getDebugLogDescription());
                C5181k.this.o(i11);
            } else {
                fVar.g();
                U4.b.a("Read RSSI %d from %s (took %dms)", Integer.valueOf(i10), C5181k.this.f53643e.getDebugLogDescription(), Long.valueOf(jG));
                C5181k.this.f53650l = false;
                C5181k.f53634p.post(new Runnable() { // from class: z4.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53678B.q(i10);
                    }
                });
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(final BluetoothGatt bluetoothGatt, final int i10) {
            C5181k.f53634p.post(new Runnable() { // from class: z4.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53665B.r(bluetoothGatt, i10);
                }
            });
        }
    }

    /* compiled from: MEATERBLEConnection.java */
    /* renamed from: z4.k$d */
    public enum d {
        NOT_CONNECTED,
        CONNECTING,
        DISCOVERING_SERVICES,
        CONNECTED,
        DISCONNECTED
    }

    /* compiled from: MEATERBLEConnection.java */
    /* renamed from: z4.k$e */
    public interface e {
        void d(C5181k c5181k);

        boolean e(C5181k c5181k);
    }

    public static boolean B() {
        Iterator<C5181k> it = f53636r.iterator();
        while (it.hasNext()) {
            if (it.next().A()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(C5181k c5181k, Context context) {
        f53636r.add(c5181k);
        this.f53645g = false;
        L(d.CONNECTING);
        U4.b.a("%s will attempt connection to %s", l(), this.f53643e.getDebugLogDescription());
        if (!h()) {
            U4.b.a("BLE is not enabled!", new Object[0]);
            n();
            return;
        }
        f53638t++;
        this.f53642d = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT <= 31 || C3377a.a(x4.g.h(), "android.permission.BLUETOOTH_CONNECT") == 0) {
            this.f53640b = this.f53639a.connectGatt(context, false, this.f53653o, 2);
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(C5181k c5181k) {
        f53636r.remove(c5181k);
        d dVar = this.f53641c;
        d dVar2 = d.DISCONNECTED;
        if (dVar.equals(dVar2)) {
            U4.b.a("%s Ignoring duplicate disconnection callback from %s with code %s", l(), this.f53643e.getDebugLogDescription(), Integer.valueOf(this.f53648j));
            return;
        }
        U4.b.a("%s did disconnect from %s with code %s", l(), this.f53643e.getDebugLogDescription(), Integer.valueOf(this.f53648j));
        L(dVar2);
        Handler handler = f53634p;
        handler.removeCallbacks(this.f53651m);
        handler.removeCallbacks(this.f53649k);
        f53635q.e(this.f53643e);
        BluetoothGatt bluetoothGatt = this.f53640b;
        if (bluetoothGatt != null) {
            f53638t--;
            try {
                bluetoothGatt.disconnect();
                this.f53640b.close();
            } catch (Exception unused) {
                U4.b.a("%s Failed to disconnect GATT:", l());
            }
            this.f53640b = null;
        }
        this.f53643e.cleanupAfterBLEDisconnection();
    }

    public static byte[] H(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length != 6) {
            return null;
        }
        byte[] bArr = new byte[6];
        for (int i10 = 0; i10 < 6; i10++) {
            bArr[i10] = Integer.valueOf(Integer.parseInt(strArrSplit[i10], 16)).byteValue();
        }
        return bArr;
    }

    private static boolean h() {
        return C5194y.l();
    }

    private static void i(C5181k c5181k) {
        if (f53637s != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            U4.b.r("Getting connection state %s of MEATER %s", c5181k.f53641c, c5181k.f53643e.getDebugLogDescription());
            if (jCurrentTimeMillis > f53637s + Config.MC_BROADCAST_INTERVAL_WIFI_MAX) {
                f53637s = 0L;
                MeaterLinkService.d();
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: z4.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MeaterLinkService.h();
                    }
                }, 1200L);
            }
        }
        if (f53637s == 0 && c5181k.f53641c == d.DISCOVERING_SERVICES) {
            f53637s = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(int i10) {
        if (i10 == 1 || i10 == 2) {
            return this.f53641c.equals(d.CONNECTING);
        }
        if (i10 == 3) {
            return !this.f53641c.equals(d.DISCONNECTED);
        }
        return true;
    }

    public static boolean y() {
        if (f53635q.h() != null) {
            return true;
        }
        Iterator<C5181k> it = f53636r.iterator();
        while (it.hasNext()) {
            C5181k next = it.next();
            if (next.D()) {
                i(next);
                return true;
            }
        }
        return false;
    }

    public boolean A() {
        return false;
    }

    protected boolean C() {
        e eVar = this.f53644f;
        if (eVar != null) {
            return eVar.e(this);
        }
        return true;
    }

    protected boolean D() {
        return this.f53641c.equals(d.CONNECTING) || this.f53641c.equals(d.DISCOVERING_SERVICES) || f53635q.h() != null;
    }

    public boolean E() {
        return this.f53641c.equals(d.CONNECTED);
    }

    public boolean I() {
        return false;
    }

    public void J() {
        this.f53650l = true;
        f53635q.d(new B4.h(this.f53652n));
    }

    protected void K() {
        Handler handler = f53634p;
        handler.removeCallbacks(this.f53649k);
        if (C()) {
            try {
                handler.postDelayed(this.f53649k, g() + (f53638t * 2000));
            } catch (Exception e10) {
                U4.b.a("Reset timeout failed: ", e10.getLocalizedMessage());
            }
        }
    }

    protected void L(d dVar) {
        if (this.f53641c != dVar) {
            f53637s = 0L;
        }
        this.f53641c = dVar;
        e eVar = this.f53644f;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    protected void finalize() {
        if (!this.f53641c.equals(d.DISCONNECTED)) {
            U4.b.a("%s should have closed connect to %s by now!", l(), this.f53643e.getDebugLogDescription());
            n();
        }
        U4.b.a("Finalize for %s %s", l(), this.f53643e.getDebugLogDescription());
        try {
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    protected int g() {
        return 10000;
    }

    public void j(final Context context) {
        f53634p.post(new Runnable() { // from class: z4.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f53631B.F(this, context);
            }
        });
    }

    public String l() {
        return String.format("<%s %s>", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this.f53652n)));
    }

    public boolean m() {
        return this.f53645g;
    }

    public void n() {
        o(0);
    }

    public void o(int i10) {
        if (i10 == 133 && System.currentTimeMillis() - this.f53642d < 500) {
            i10 = 100133;
        }
        this.f53648j = i10;
        f53634p.post(new Runnable() { // from class: z4.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f53629B.G(this);
            }
        });
    }

    protected void p() {
        U4.b.a("Discovering services for %s", this.f53643e.getDebugLogDescription());
        this.f53640b.discoverServices();
    }

    public d q() {
        return this.f53641c;
    }

    public MEATERDevice r() {
        return this.f53643e;
    }

    public int s() {
        return this.f53648j;
    }

    public BluetoothGatt t() {
        return this.f53640b;
    }

    protected void v(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f53640b == null || !this.f53641c.equals(d.CONNECTED)) {
            U4.b.a("Characteristic callback arrived after disconnection, ignoring", new Object[0]);
        } else {
            K();
            this.f53646h = true;
        }
    }

    protected boolean z() {
        return this.f53641c == d.CONNECTED;
    }

    protected void w() {
    }

    protected void x() {
    }

    protected void u(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }
}
