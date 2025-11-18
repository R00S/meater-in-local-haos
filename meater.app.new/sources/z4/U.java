package z4;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.WiFiSSID;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.v3protobuf.MEATERSSID;
import com.apptionlabs.meater_app.v3protobuf.MEATERSSIDList;
import java.util.ArrayList;
import java.util.Iterator;
import z4.C5181k;
import z4.Q;

/* compiled from: MEATERBlockWiFiSetupManager.java */
/* loaded from: classes.dex */
public class U {

    /* renamed from: o, reason: collision with root package name */
    private static U f53489o;

    /* renamed from: a, reason: collision with root package name */
    MEATERBlock f53490a;

    /* renamed from: b, reason: collision with root package name */
    private Q f53491b;

    /* renamed from: d, reason: collision with root package name */
    public String f53493d;

    /* renamed from: e, reason: collision with root package name */
    public String f53494e;

    /* renamed from: i, reason: collision with root package name */
    private Handler f53498i;

    /* renamed from: j, reason: collision with root package name */
    private final long f53499j;

    /* renamed from: c, reason: collision with root package name */
    private final b f53492c = new b();

    /* renamed from: f, reason: collision with root package name */
    private String f53495f = null;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<WiFiSSID> f53496g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<WiFiSSID> f53497h = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private boolean f53500k = false;

    /* renamed from: l, reason: collision with root package name */
    private Intent f53501l = null;

    /* renamed from: m, reason: collision with root package name */
    private c f53502m = c.WAITING_FOR_USER;

    /* renamed from: n, reason: collision with root package name */
    private final V4.g f53503n = new a();

    /* compiled from: MEATERBlockWiFiSetupManager.java */
    class a implements V4.g {
        a() {
        }

        @Override // V4.g
        public void a(MEATERDevice mEATERDevice) {
            U.this.f53490a.setConnectivityMonitor(null);
            U.this.f53500k = true;
            U.this.C(new Intent(MEATERIntent.BLOCK_WIFI_SETUP_COMPLETE));
        }

        @Override // V4.g
        public void b(MEATERDevice mEATERDevice, V4.a aVar) {
            U.this.f53490a.setConnectivityMonitor(null);
            Intent intent = new Intent(MEATERIntent.BLOCK_WIFI_SETUP_CONNECTIVITY_TEST_FAILED);
            intent.putExtra(MEATERIntent.EXTRA_TAG, aVar.j());
            U.this.C(intent);
        }
    }

    /* compiled from: MEATERBlockWiFiSetupManager.java */
    private class b implements Q.a {
        @Override // z4.Q.a
        public void a(String str) {
            U4.b.d("Received chosen SSID: " + str, new Object[0]);
            U.this.f53495f = str;
            U.this.B();
        }

        @Override // z4.Q.a
        public void b(String str) {
            U4.b.d("Got firmware version: %s", str);
            U u10 = U.this;
            u10.f53494e = str;
            u10.B();
        }

        @Override // z4.Q.a
        @SuppressLint({"StringFormatInvalid"})
        public void c(Q.d dVar) {
            U.this.q();
            if (U.this.f53502m != c.WAITING_FOR_CONNECTION_RESULTS) {
                return;
            }
            Context contextH = x4.g.h();
            U4.b.d("WiFi connection state changed: " + dVar.toString(), new Object[0]);
            if (dVar != Q.d.NOT_CONNECTED) {
                if (Q.d.CONNECTED == dVar) {
                    U.this.D();
                    return;
                }
                return;
            }
            Intent intent = new Intent(MEATERIntent.BLOCK_WIFI_SETUP_CONNECT_FAILED);
            intent.putExtra(MEATERIntent.EXTRA_TITLE, String.format(contextH.getString(R.string.failed_to_connect_wifi), U.this.f53491b.f53451B));
            intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH.getString(R.string.connection_to_wifi_timed_out));
            if (U.this.f53491b.f53452C == null || U.this.f53491b.f53452C.length() <= 0) {
                intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH.getString(R.string.ensure_block_close_to_router_error));
            } else {
                intent.putExtra(MEATERIntent.EXTRA_MESSAGE, U.this.f53490a.getMEATERDeviceType() == MEATERDeviceType.BLOCK ? contextH.getString(R.string.failed_to_connect_wifi_detail) : contextH.getString(R.string.failed_to_connect_wifi_detail_pro, contextH.getString(U.this.f53490a.getMEATERDeviceType().getDeviceName())));
            }
            U.this.C(intent);
        }

        @Override // z4.C5181k.e
        public void d(C5181k c5181k) {
            if (U.this.f53502m == c.WAITTING_FOR_CONNECTIVITY_TEST) {
                return;
            }
            Context contextH = x4.g.h();
            U4.b.d("Block connection state is now: %s", c5181k.q().toString());
            if (c5181k.q().equals(C5181k.d.DISCONNECTED)) {
                U4.b.d("Block disconnected with error code: %d", Integer.valueOf(c5181k.s()));
                String string = x4.g.h().getString(U.this.f53490a.getMEATERDeviceType().getDeviceName());
                if (U.this.f53500k) {
                    return;
                }
                if (c5181k.s() <= 0) {
                    U.this.u();
                    U.this.v(contextH.getString(R.string.device_disconnected_label), contextH.getString(R.string.reconnect_to_device_to_continue_setup, string));
                } else if (U.this.f53491b == null || U.this.f53491b.m()) {
                    U.this.v(contextH.getString(R.string.device_disconnected_label), contextH.getString(R.string.reconnect_to_device_to_continue_setup, string));
                } else if (System.currentTimeMillis() - U.this.f53499j >= 15000) {
                    U.this.v(contextH.getString(R.string.unable_to_connect_to_the_block), contextH.getString(R.string.ensure_your_block_in_wifi_setup_mode));
                } else {
                    U4.b.d("Re-attempting connection to Block...", new Object[0]);
                    U.this.r();
                }
            }
        }

        @Override // z4.C5181k.e
        public boolean e(C5181k c5181k) {
            U u10 = U.this;
            String str = u10.f53493d;
            c cVar = u10.f53502m;
            U u11 = U.this;
            U4.b.d("Ask timeout %s %s %s", str, cVar, (u11.f53493d == null || !(u11.f53502m.equals(c.WAITING_FOR_USER) || U.this.f53502m.equals(c.WAITING_FOR_CONNECTION_RESULTS))) ? "TIMEOUT-ALLOWED" : "NO-TIMEOUT-ALLOWED");
            U u12 = U.this;
            return u12.f53493d == null || u12.f53494e == null || !(u12.f53502m.equals(c.WAITING_FOR_USER) || U.this.f53502m.equals(c.WAITING_FOR_CONNECTION_RESULTS));
        }

        @Override // z4.Q.a
        public void f(String str) {
            U4.b.d("Got MAC address: %s", str);
            U u10 = U.this;
            u10.f53493d = str;
            u10.B();
        }

        @Override // z4.Q.a
        public void g(MEATERSSIDList mEATERSSIDList) {
            U4.b.d("Found SSIDs:", new Object[0]);
            ArrayList arrayList = new ArrayList();
            for (MEATERSSID meaterssid : mEATERSSIDList.SSIDs) {
                if (U.this.y(meaterssid)) {
                    arrayList.add(meaterssid);
                }
            }
            U.this.I(new MEATERSSIDList(arrayList));
            U.this.E();
            Intent intent = new Intent(MEATERIntent.BLOCK_WIFI_SETUP_NETWORK_LIST_UPDATED);
            intent.putExtra(MEATERIntent.EXTRA_RECOMMENDED_NETWORKS, U.this.f53497h);
            intent.putExtra(MEATERIntent.EXTRA_AVAILABLE_NETWORKS, U.this.f53496g);
            U.this.C(intent);
        }

        private b() {
        }
    }

    /* compiled from: MEATERBlockWiFiSetupManager.java */
    enum c {
        WAITING_FOR_USER,
        WAITING_FOR_INITIAL_SETUP,
        WAITING_FOR_SCAN_RESULTS,
        WAITING_FOR_CONNECTION_RESULTS,
        WAITTING_FOR_CONNECTIVITY_TEST
    }

    private U(MEATERBlock mEATERBlock, C5181k c5181k) {
        if (c5181k instanceof C5177g) {
            this.f53491b = (Q) c5181k;
            ((C5177g) c5181k).m0();
        }
        this.f53490a = mEATERBlock;
        r();
        this.f53499j = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.f53493d == null || this.f53495f == null || this.f53494e == null) {
            return;
        }
        this.f53502m = c.WAITING_FOR_USER;
        Intent intent = new Intent(MEATERIntent.BLOCK_WIFI_SETUP_CONNECTED);
        intent.putExtra(MEATERIntent.EXTRA_BLOCK_MAC_ADDRESS, this.f53493d);
        intent.putExtra(MEATERIntent.EXTRA_CURRENT_BLOCK_SSID, this.f53495f);
        intent.putExtra(MEATERIntent.EXTRA_BLOCK_FW_VERSION, this.f53494e);
        U4.b.d("Got all we need to begin setup", new Object[0]);
        C(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Intent intent) {
        x4.g.h().sendBroadcast(intent);
        this.f53501l = intent;
    }

    private void F() {
        q();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f53498i = handler;
        handler.postDelayed(new Runnable() { // from class: z4.S
            @Override // java.lang.Runnable
            public final void run() {
                this.f53487B.H();
            }
        }, Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX);
    }

    public static U G(MEATERBlock mEATERBlock, Q q10) {
        U u10 = new U(mEATERBlock, q10);
        f53489o = u10;
        return u10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        Context contextH = x4.g.h();
        this.f53502m = c.WAITING_FOR_USER;
        Intent intent = new Intent(MEATERIntent.BLOCK_WIFI_SETUP_CONNECT_FAILED);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, String.format(contextH.getString(R.string.failed_to_connect_wifi), this.f53491b.f53451B));
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH.getString(R.string.connection_to_wifi_timed_out));
        C(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(MEATERSSIDList mEATERSSIDList) {
        x();
        Iterator<MEATERSSID> it = mEATERSSIDList.SSIDs.iterator();
        while (it.hasNext()) {
            WiFiSSID wiFiSSIDT = t(it.next());
            U4.b.d("Found %s %s %s", Q.N(wiFiSSIDT.getName().M()), wiFiSSIDT.getEncryptionType().toString(), wiFiSSIDT.getRSSI());
            if (!this.f53496g.contains(wiFiSSIDT)) {
                this.f53496g.add(wiFiSSIDT);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        Handler handler = this.f53498i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f53498i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void r() {
        Context contextH = x4.g.h();
        this.f53502m = c.WAITING_FOR_INITIAL_SETUP;
        BluetoothAdapter bluetoothAdapterQ = C5194y.q();
        if (bluetoothAdapterQ == null) {
            v(contextH.getString(R.string.bluetooth_off_alert_text), contextH.getString(R.string.ble_turn_off_currently_detail));
            return;
        }
        BluetoothDevice remoteDevice = bluetoothAdapterQ.getRemoteDevice(this.f53490a.getMacAddress());
        Q q10 = this.f53491b;
        if (q10 == null) {
            Q q11 = new Q(contextH, remoteDevice, this.f53490a, this.f53492c);
            this.f53491b = q11;
            q11.j(contextH);
        } else {
            q10.X(this.f53492c);
            this.f53491b.R();
            if (this.f53491b.t() != null) {
                this.f53491b.t().requestConnectionPriority(0);
            }
        }
    }

    private WiFiSSID t(MEATERSSID meaterssid) {
        WiFiSSID wiFiSSID = new WiFiSSID();
        wiFiSSID.setEncryptionType(meaterssid.encryptionType);
        wiFiSSID.setName(meaterssid.name);
        wiFiSSID.setRSSI(meaterssid.RSSI);
        return wiFiSSID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str, String str2) {
        q();
        Intent intent = new Intent(MEATERIntent.BLOCK_WIFI_SETUP_FAILED);
        intent.putExtra(MEATERIntent.EXTRA_TITLE, str);
        intent.putExtra(MEATERIntent.EXTRA_MESSAGE, str2);
        intent.setPackage(x4.g.h().getPackageName());
        C(intent);
    }

    public static void w() {
        U u10 = f53489o;
        if (u10 != null) {
            u10.u();
            f53489o = null;
        }
    }

    public static String x() {
        WifiManager wifiManager = (WifiManager) x4.g.h().getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.getConnectionInfo().getSSID().replace("SSID: ", "").replaceAll("\"", "");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(MEATERSSID meaterssid) {
        String strN = Q.N(meaterssid.name.M());
        return strN.length() > 0 && strN.length() <= A();
    }

    public int A() {
        return P5.Q.e(this.f53494e, "2.0.3.2") < 0 ? 31 : 32;
    }

    public void D() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: z4.T
            @Override // java.lang.Runnable
            public final void run() {
                this.f53488B.u();
            }
        }, Config.MC_BROADCAST_INTERVAL_WIFI);
        this.f53502m = c.WAITTING_FOR_CONNECTIVITY_TEST;
        C(new Intent(MEATERIntent.BLOCK_WIFI_SETUP_STARTING_CONNECTIVITY_TEST));
        this.f53490a.setConnectivityMonitor(new V4.f(this.f53490a, this.f53503n, true));
        M4.h.f11978a.J(this.f53490a);
    }

    public void E() {
        Context contextH = x4.g.h();
        Q q10 = this.f53491b;
        if (q10 == null) {
            v(contextH.getString(R.string.device_disconnected_label), contextH.getString(R.string.reconnect_to_device_to_continue_setup, x4.g.h().getString(this.f53490a.getMEATERDeviceType().getDeviceName())));
        } else {
            this.f53502m = c.WAITING_FOR_SCAN_RESULTS;
            q10.a0();
        }
    }

    public void J() {
        Intent intent = this.f53501l;
        if (intent != null) {
            intent.setPackage(x4.g.h().getPackageName());
            x4.g.h().sendBroadcast(this.f53501l);
            this.f53501l = null;
        }
    }

    public void s(String str, String str2) {
        this.f53502m = c.WAITING_FOR_CONNECTION_RESULTS;
        this.f53491b.P(str, str2);
        F();
    }

    public void u() {
        q();
        Q q10 = this.f53491b;
        if (q10 != null) {
            if (q10 instanceof C5177g) {
                ((C5177g) q10).Q();
            } else {
                q10.n();
                this.f53491b = null;
            }
        }
    }

    public int z() {
        return P5.Q.e(this.f53494e, "2.0.0.0") < 0 ? 57 : 63;
    }
}
