package z4;

import B4.l;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.v3protobuf.MEATERSSIDList;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.UUID;
import z4.C5181k;

/* compiled from: MEATERBlockBLEConnection.java */
/* loaded from: classes.dex */
public class Q extends C5181k {

    /* renamed from: A, reason: collision with root package name */
    private String f53450A;

    /* renamed from: B, reason: collision with root package name */
    public String f53451B;

    /* renamed from: C, reason: collision with root package name */
    public String f53452C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f53453D = new Runnable() { // from class: z4.P
        @Override // java.lang.Runnable
        public final void run() {
            this.f53449B.V();
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final Context f53454u;

    /* renamed from: v, reason: collision with root package name */
    private c f53455v;

    /* renamed from: w, reason: collision with root package name */
    private BluetoothGattService f53456w;

    /* renamed from: x, reason: collision with root package name */
    private BluetoothGattService f53457x;

    /* renamed from: y, reason: collision with root package name */
    private String f53458y;

    /* renamed from: z, reason: collision with root package name */
    private String f53459z;

    /* compiled from: MEATERBlockBLEConnection.java */
    public interface a extends C5181k.e {
        void a(String str);

        void b(String str);

        void c(d dVar);

        void f(String str);

        void g(MEATERSSIDList mEATERSSIDList);
    }

    /* compiled from: MEATERBlockBLEConnection.java */
    private enum b {
        NOT_SCANNING(0),
        SCANNING(1),
        BLOCK_NOT_ON_SCREEN(2),
        CLIENT_NOT_CONNECTED(4);


        /* renamed from: B, reason: collision with root package name */
        private final int f53465B;

        b(int i10) {
            this.f53465B = i10;
        }

        public static b j(int i10) {
            if (i10 == 0) {
                return NOT_SCANNING;
            }
            if (i10 == 1) {
                return SCANNING;
            }
            if (i10 == 2) {
                return BLOCK_NOT_ON_SCREEN;
            }
            if (i10 != 4) {
                return null;
            }
            return CLIENT_NOT_CONNECTED;
        }

        public int n() {
            return this.f53465B;
        }
    }

    /* compiled from: MEATERBlockBLEConnection.java */
    public enum c {
        NOT_CONNECTED(0),
        CONNECTING_TO_BLOCK(1),
        DISCOVERING_CHARACTERISTICS(2),
        READING_INITIAL_CHARACTERISTIC_VALUES(3),
        STARTING_SCAN(4),
        SCAN_IN_PROGRESS(5),
        STOPPING_SCAN(6),
        SCAN_STOPPED(7),
        READING_NETWORK_LIST(8),
        SELECTING_NETWORK(9),
        WAITING_FOR_WIFI_CONNECTION_STATUS(10);


        /* renamed from: B, reason: collision with root package name */
        private final int f53478B;

        c(int i10) {
            this.f53478B = i10;
        }
    }

    /* compiled from: MEATERBlockBLEConnection.java */
    public enum d {
        CONNECTED(0),
        CONNECTING(1),
        NOT_CONNECTED(2),
        NOT_AVAILALE(3),
        NOT_CONFIGURED(4),
        INVALID(5);


        /* renamed from: B, reason: collision with root package name */
        private final int f53486B;

        d(int i10) {
            this.f53486B = i10;
        }

        public static d j(int i10) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? INVALID : INVALID : NOT_CONFIGURED : NOT_AVAILALE : NOT_CONNECTED : CONNECTING : CONNECTED;
        }
    }

    public Q(Context context, BluetoothDevice bluetoothDevice, MEATERBlock mEATERBlock, a aVar) {
        this.f53454u = context;
        this.f53639a = bluetoothDevice;
        this.f53643e = mEATERBlock;
        this.f53644f = aVar;
    }

    public static String N(byte[] bArr) {
        return new String(bArr, 0, W(bArr), StandardCharsets.UTF_8);
    }

    private void O() {
        if (this.f53450A == null || this.f53458y == null || this.f53459z == null) {
            return;
        }
        U4.b.d("We have all we need to tell the Block to perform a scan for nearby WiFi networks", new Object[0]);
        Z(c.SCAN_STOPPED);
    }

    private static int T(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        U4.b.d("Failed to get SSID list from block within 15 secs. Will ask again...", new Object[0]);
        Z(c.SCAN_STOPPED);
        a0();
    }

    private static int W(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    private void b0() {
        if (this.f53455v.equals(c.STARTING_SCAN) || this.f53455v.equals(c.SCAN_IN_PROGRESS)) {
            C5181k.f53634p.removeCallbacks(this.f53453D);
            Z(c.SCAN_STOPPED);
        }
    }

    private boolean d0(c cVar) {
        if (this.f53455v.equals(cVar)) {
            return true;
        }
        U4.b.d("Bad state: " + this.f53455v + " should be " + cVar.toString(), new Object[0]);
        return false;
    }

    @Override // z4.C5181k
    public boolean A() {
        return true;
    }

    @Override // z4.C5181k
    protected boolean D() {
        return true;
    }

    public void P(String str, String str2) {
        this.f53451B = str;
        this.f53452C = str2;
        if (this.f53455v.equals(c.SCAN_STOPPED)) {
            c0();
        } else {
            b0();
        }
    }

    public void Q() {
        C5181k.f53635q.d(new B4.k(this.f53652n, this.f53456w, O.f53439q, new byte[]{l.b.eWifiScanStatusMobileNotInWifiSetup.j()}, false));
    }

    public c S() {
        return this.f53455v;
    }

    public void X(a aVar) {
        this.f53644f = aVar;
    }

    public void Y(BluetoothGattService bluetoothGattService) {
        this.f53456w = bluetoothGattService;
    }

    public void Z(c cVar) {
        U4.b.d("%s > %s", this.f53455v.toString(), cVar.toString());
        this.f53455v = cVar;
    }

    public void a0() {
        if (d0(c.SCAN_STOPPED)) {
            U4.b.d("Starting network scan", new Object[0]);
            Z(c.STARTING_SCAN);
            C5181k.f53635q.d(new B4.k(this.f53652n, this.f53456w, O.f53439q, ByteBuffer.allocate(1).put((byte) 1).array(), false));
            Handler handler = C5181k.f53634p;
            handler.removeCallbacks(this.f53453D);
            try {
                handler.postDelayed(this.f53453D, 15000L);
            } catch (Exception e10) {
                U4.b.b("Reset timeout failed: " + e10.getLocalizedMessage(), new Object[0]);
            }
        }
    }

    public void c0() {
        c cVar = this.f53455v;
        c cVar2 = c.SCAN_STOPPED;
        if (!cVar.equals(cVar2)) {
            U4.b.d("Bad state: " + this.f53455v + " should be " + cVar2, new Object[0]);
            return;
        }
        int iT = T(this.f53452C);
        boolean z10 = P5.Q.e(this.f53459z, "2.0") != -1;
        if (iT == -1 || (!z10 ? iT <= 57 : iT <= 63)) {
            U4.b.d("Bad password length: " + iT, new Object[0]);
            return;
        }
        U4.b.d("Asking Block to connect to SSID '%s'", this.f53451B);
        Z(c.SELECTING_NETWORK);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(z10 ? 96 : 90);
        byteBufferAllocate.put(this.f53451B.getBytes());
        byteBufferAllocate.position(32);
        byteBufferAllocate.put(this.f53452C.getBytes());
        B4.k kVar = new B4.k(this.f53652n, this.f53456w, O.f53440r, byteBufferAllocate.array(), false);
        kVar.f1543f = 60;
        C5181k.f53635q.d(kVar);
        C5181k.f53634p.removeCallbacks(this.f53453D);
        U();
    }

    @Override // z4.C5181k
    protected int g() {
        return 25000;
    }

    @Override // z4.C5181k
    public void j(Context context) {
        this.f53455v = c.NOT_CONNECTED;
        Z(c.CONNECTING_TO_BLOCK);
        super.j(context);
    }

    @Override // z4.C5181k
    public void o(int i10) {
        C5181k.f53634p.removeCallbacks(this.f53453D);
        super.o(i10);
    }

    @Override // z4.C5181k
    protected void u(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (!bluetoothGattCharacteristic.getUuid().equals(O.f53439q)) {
            if (bluetoothGattCharacteristic.getUuid().equals(O.f53440r) && d0(c.SELECTING_NETWORK)) {
                Z(c.WAITING_FOR_WIFI_CONNECTION_STATUS);
                return;
            }
            return;
        }
        if (this.f53455v.equals(c.STARTING_SCAN)) {
            Z(c.SCAN_IN_PROGRESS);
        } else if (this.f53455v.equals(c.STOPPING_SCAN)) {
            Z(c.SCAN_STOPPED);
        }
    }

    @Override // z4.C5181k
    protected void v(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value;
        super.v(bluetoothGattCharacteristic);
        byte[] value2 = bluetoothGattCharacteristic.getValue();
        if (value2 == null) {
            U4.b.d("%s from %s is empty, ignoring", O.a(bluetoothGattCharacteristic.getUuid()), this.f53643e.getDebugLogDescription());
            return;
        }
        if (O.f53436n.equals(bluetoothGattCharacteristic.getUuid())) {
            U4.b.d("Got WiFi MAC address", new Object[0]);
            if (d0(c.READING_INITIAL_CHARACTERISTIC_VALUES)) {
                if (value2.length != 6) {
                    U4.b.d("%s from %s is the wrong size, ignoring.", O.a(bluetoothGattCharacteristic.getUuid()), this.f53643e.getDebugLogDescription());
                    return;
                }
                this.f53450A = String.format(Locale.US, "%02x:%02x:%02x:%02x:%02x:%02x", Byte.valueOf(value2[0]), Byte.valueOf(value2[1]), Byte.valueOf(value2[2]), Byte.valueOf(value2[3]), Byte.valueOf(value2[4]), Byte.valueOf(value2[5]));
                O();
                ((a) this.f53644f).f(this.f53450A);
                return;
            }
            return;
        }
        UUID uuid = O.f53438p;
        if (uuid.equals(bluetoothGattCharacteristic.getUuid())) {
            C5181k.f53634p.removeCallbacks(this.f53453D);
            U4.b.d("Got list of available SSIDs", new Object[0]);
            if (d0(c.READING_NETWORK_LIST)) {
                Z(c.SCAN_STOPPED);
                if (this.f53451B != null) {
                    c0();
                    return;
                }
                try {
                    ((a) this.f53644f).g(MEATERSSIDList.ADAPTER.decode(value2));
                    return;
                } catch (Exception unused) {
                    U4.b.d("%s from %s is invalid!", O.a(bluetoothGattCharacteristic.getUuid()), this.f53643e.getDebugLogDescription());
                    return;
                }
            }
            return;
        }
        if (O.f53440r.equals(bluetoothGattCharacteristic.getUuid())) {
            if (d0(c.READING_INITIAL_CHARACTERISTIC_VALUES)) {
                String strN = N(value2);
                this.f53458y = strN;
                U4.b.d("Currently selected SSID is %s", (strN == null || strN.isEmpty()) ? "<Not Set>" : this.f53458y);
                O();
                ((a) this.f53644f).a(this.f53458y);
                return;
            }
            return;
        }
        if (O.f53441s.equals(bluetoothGattCharacteristic.getUuid())) {
            if (value2.length < 1) {
                U4.b.d("%s from %s is the wrong size, ignoring.", O.a(bluetoothGattCharacteristic.getUuid()), l());
                return;
            }
            d dVarJ = d.j(value2[0]);
            if (this.f53455v == c.WAITING_FOR_WIFI_CONNECTION_STATUS && dVarJ == d.NOT_CONNECTED) {
                Z(c.SCAN_STOPPED);
            }
            U4.b.d("WiFi connection status is now %s", dVarJ);
            C5181k.e eVar = this.f53644f;
            if (eVar instanceof a) {
                ((a) eVar).c(dVarJ);
                return;
            }
            return;
        }
        if (!O.f53439q.equals(bluetoothGattCharacteristic.getUuid())) {
            if (O.f53432j.equals(bluetoothGattCharacteristic.getUuid()) && d0(c.READING_INITIAL_CHARACTERISTIC_VALUES) && (value = bluetoothGattCharacteristic.getValue()) != null) {
                String str = new String(value);
                U4.b.d("FIRMWARE-REVISION %s: '%s'", this.f53643e.getDebugLogDescription(), str);
                this.f53459z = str;
                O();
                ((a) this.f53644f).b(this.f53459z);
                return;
            }
            return;
        }
        if (value2.length != 1) {
            U4.b.d(O.a(bluetoothGattCharacteristic.getUuid()) + " from " + this.f53643e.getDebugLogDescription() + " is the wrong size, ignoring.", new Object[0]);
            return;
        }
        b bVarJ = b.j(value2[0]);
        U4.b.d("Got WiFi scan state: %d", bVarJ != null ? Integer.valueOf(bVarJ.n()) : "scan state receiving null");
        if (bVarJ == null) {
            return;
        }
        if (bVarJ == b.NOT_SCANNING) {
            Z(c.SCAN_STOPPED);
            if (this.f53451B != null) {
                c0();
                return;
            }
            Z(c.READING_NETWORK_LIST);
            U4.b.d("Network list is ready, reading now.", new Object[0]);
            C5181k.f53635q.d(new B4.g(this.f53652n, this.f53456w, uuid, false, false));
            return;
        }
        if (!bVarJ.equals(b.SCANNING)) {
            if (bVarJ.equals(b.BLOCK_NOT_ON_SCREEN)) {
                n();
                return;
            }
            return;
        }
        c cVar = this.f53455v;
        c cVar2 = c.STARTING_SCAN;
        if (cVar.equals(cVar2)) {
            Z(c.SCAN_IN_PROGRESS);
            return;
        }
        U4.b.d("Bad state: " + this.f53455v + " should be " + cVar2, new Object[0]);
    }

    @Override // z4.C5181k
    protected void w() {
        c cVar = this.f53455v;
        c cVar2 = c.CONNECTING_TO_BLOCK;
        if (cVar.equals(cVar2)) {
            Z(c.DISCOVERING_CHARACTERISTICS);
            return;
        }
        U4.b.d("Bad state: " + this.f53455v + " should be " + cVar2, new Object[0]);
        n();
    }

    @Override // z4.C5181k
    protected void x() {
        c cVar = this.f53455v;
        c cVar2 = c.DISCOVERING_CHARACTERISTICS;
        if (!cVar.equals(cVar2)) {
            U4.b.d("Bad state: " + this.f53455v + " should be " + cVar2, new Object[0]);
            n();
            return;
        }
        for (BluetoothGattService bluetoothGattService : this.f53640b.getServices()) {
            if (O.f53435m.equals(bluetoothGattService.getUuid())) {
                this.f53456w = bluetoothGattService;
            } else if (O.f53424b.equals(bluetoothGattService.getUuid())) {
                this.f53457x = bluetoothGattService;
            }
        }
        if (this.f53456w != null) {
            Z(c.READING_INITIAL_CHARACTERISTIC_VALUES);
            B4.f fVar = C5181k.f53635q;
            fVar.d(new B4.j(this.f53652n, this.f53456w, O.f53441s, false, false));
            fVar.d(new B4.j(this.f53652n, this.f53456w, O.f53439q, false, false));
            fVar.d(new B4.g(this.f53652n, this.f53456w, O.f53436n, false, false));
            fVar.d(new B4.g(this.f53652n, this.f53456w, O.f53440r, false, false));
        } else {
            U4.b.d("BluetoothGattService (wifiSetupService) is null ", new Object[0]);
            n();
        }
        BluetoothGattService bluetoothGattService2 = this.f53457x;
        if (bluetoothGattService2 != null) {
            C5181k.f53635q.d(new B4.g(this.f53652n, bluetoothGattService2, O.f53432j, false, false));
        } else {
            U4.b.d("BluetoothGattService (disService) is null ", new Object[0]);
            n();
        }
    }

    public void R() {
    }

    public void U() {
    }
}
