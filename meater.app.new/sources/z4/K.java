package z4;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.apptionlabs.meater_app.data.Config;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import va.C4929b;
import va.InterfaceC4928a;
import x4.b;
import z4.K;

/* compiled from: MEATERBLEScanner.kt */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\b*\u00017\b\u0007\u0018\u0000 =2\u00020\u0001:\u0003%\" B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b;\u0010\n¨\u0006>"}, d2 = {"Lz4/K;", "", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Lz4/K$b;", "scanCallback", "<init>", "(Landroid/bluetooth/BluetoothAdapter;Lz4/K$b;)V", "", "t", "()Z", "Landroid/bluetooth/le/BluetoothLeScanner;", "scanner", "Loa/F;", "z", "(Landroid/bluetooth/le/BluetoothLeScanner;)V", "Landroid/bluetooth/le/ScanResult;", "result", "p", "(Landroid/bluetooth/le/ScanResult;)V", "keepAliveAdvertise", "n", "(Landroid/bluetooth/le/ScanResult;Z)V", "q", "", "errorCode", "", "s", "(I)Ljava/lang/String;", "w", "()V", "B", "a", "Landroid/bluetooth/BluetoothAdapter;", "b", "Lz4/K$b;", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "mainHandler", "Landroid/os/HandlerThread;", "d", "Landroid/os/HandlerThread;", "scanThread", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "scanTimeoutRunnable", "Lz4/K$c;", "f", "Lz4/K$c;", "scanState", "g", "Ljava/lang/Object;", "scanLock", "z4/K$d", "h", "Lz4/K$d;", "internalScanCallback", "u", "isScanInProgress", "i", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f53393j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b scanCallback;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler mainHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final HandlerThread scanThread;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Runnable scanTimeoutRunnable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile c scanState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object scanLock;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d internalScanCallback;

    /* compiled from: MEATERBLEScanner.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz4/K$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "", "SCAN_PERIOD", "J", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z4.K$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final boolean a(Context context) {
            C3862t.g(context, "context");
            Object systemService = context.getSystemService("location");
            C3862t.e(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            LocationManager locationManager = (LocationManager) systemService;
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        }

        private Companion() {
        }
    }

    /* compiled from: MEATERBLEScanner.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lz4/K$b;", "", "", "deviceID", "", "macAddress", "", "probeNum", "", "keepAliveAdvertisingBlock", "Loa/F;", "c", "(JLjava/lang/String;IZ)V", "b", "()V", "d", "errorCode", "errorMessage", "a", "(ILjava/lang/String;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(int errorCode, String errorMessage);

        void b();

        void c(long deviceID, String macAddress, int probeNum, boolean keepAliveAdvertisingBlock);

        void d();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MEATERBLEScanner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lz4/K$c;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* renamed from: B, reason: collision with root package name */
        public static final c f53402B = new c("NOT_SCANNING", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final c f53403C = new c("STARTING_SCAN", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final c f53404D = new c("SCANNING", 2);

        /* renamed from: E, reason: collision with root package name */
        public static final c f53405E = new c("STOPPING_SCAN", 3);

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ c[] f53406F;

        /* renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f53407G;

        static {
            c[] cVarArrC = c();
            f53406F = cVarArrC;
            f53407G = C4929b.a(cVarArrC);
        }

        private c(String str, int i10) {
        }

        private static final /* synthetic */ c[] c() {
            return new c[]{f53402B, f53403C, f53404D, f53405E};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f53406F.clone();
        }
    }

    /* compiled from: MEATERBLEScanner.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"z4/K$d", "Landroid/bluetooth/le/ScanCallback;", "", "callbackType", "Landroid/bluetooth/le/ScanResult;", "result", "Loa/F;", "onScanResult", "(ILandroid/bluetooth/le/ScanResult;)V", "", "results", "onBatchScanResults", "(Ljava/util/List;)V", "errorCode", "onScanFailed", "(I)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends ScanCallback {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(List list, K k10) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k10.p((ScanResult) it.next());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(K k10, int i10, String str) {
            k10.scanCallback.a(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(K k10, ScanResult scanResult) {
            k10.p(scanResult);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(final List<ScanResult> results) {
            C3862t.g(results, "results");
            Handler handler = K.this.mainHandler;
            final K k10 = K.this;
            handler.post(new Runnable() { // from class: z4.M
                @Override // java.lang.Runnable
                public final void run() {
                    K.d.d(results, k10);
                }
            });
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(final int errorCode) {
            U4.b.a("[SCAN] onScanFailed errorCode %s", Integer.valueOf(errorCode));
            final String strS = K.this.s(errorCode);
            Handler handler = K.this.mainHandler;
            final K k10 = K.this;
            handler.post(new Runnable() { // from class: z4.L
                @Override // java.lang.Runnable
                public final void run() {
                    K.d.e(k10, errorCode, strS);
                }
            });
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int callbackType, final ScanResult result) {
            C3862t.g(result, "result");
            Handler handler = K.this.mainHandler;
            final K k10 = K.this;
            handler.post(new Runnable() { // from class: z4.N
                @Override // java.lang.Runnable
                public final void run() {
                    K.d.f(k10, result);
                }
            });
        }
    }

    public K(BluetoothAdapter bluetoothAdapter, b scanCallback) {
        C3862t.g(bluetoothAdapter, "bluetoothAdapter");
        C3862t.g(scanCallback, "scanCallback");
        this.bluetoothAdapter = bluetoothAdapter;
        this.scanCallback = scanCallback;
        this.mainHandler = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("ScanThread");
        handlerThread.start();
        this.scanThread = handlerThread;
        this.scanTimeoutRunnable = new Runnable() { // from class: z4.C
            @Override // java.lang.Runnable
            public final void run() {
                K.v(this.f53378B);
            }
        };
        this.scanState = c.f53402B;
        this.scanLock = new Object();
        this.internalScanCallback = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(K k10) {
        synchronized (k10.scanLock) {
            k10.scanState = c.f53404D;
            C4153F c4153f = C4153F.f46609a;
        }
        k10.scanCallback.b();
        k10.mainHandler.postDelayed(k10.scanTimeoutRunnable, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(final K k10) {
        U4.b.a("[SCAN] Stopping scan", new Object[0]);
        new Handler(k10.scanThread.getLooper()).post(new Runnable() { // from class: z4.F
            @Override // java.lang.Runnable
            public final void run() {
                K.D(this.f53382B);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(final K k10) {
        BluetoothLeScanner bluetoothLeScanner = k10.bluetoothAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            if (!k10.t()) {
                bluetoothLeScanner = null;
            }
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(k10.internalScanCallback);
            }
        }
        k10.mainHandler.post(new Runnable() { // from class: z4.H
            @Override // java.lang.Runnable
            public final void run() {
                K.E(this.f53384B);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(K k10) {
        synchronized (k10.scanLock) {
            k10.scanState = c.f53402B;
            C4153F c4153f = C4153F.f46609a;
        }
        k10.scanCallback.d();
        U4.b.a("[SCAN] Scan stopped successfully", new Object[0]);
    }

    private final void n(final ScanResult result, final boolean keepAliveAdvertise) {
        byte[] manufacturerSpecificData;
        ScanRecord scanRecord = result.getScanRecord();
        if (scanRecord == null || (manufacturerSpecificData = scanRecord.getManufacturerSpecificData(Config.BLECompanyIDApptionLabs)) == null) {
            return;
        }
        if (manufacturerSpecificData.length < 8) {
            manufacturerSpecificData = null;
        }
        if (manufacturerSpecificData == null) {
            return;
        }
        final C5172b c5172bC = keepAliveAdvertise ? C5172b.c(manufacturerSpecificData) : C5172b.e(manufacturerSpecificData);
        if (c5172bC.h()) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: z4.I
            @Override // java.lang.Runnable
            public final void run() {
                K.o(this.f53385B, c5172bC, result, keepAliveAdvertise);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(K k10, C5172b c5172b, ScanResult scanResult, boolean z10) {
        k10.scanCallback.c(c5172b.f53567a, scanResult.getDevice().getAddress(), c5172b.f53568b, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.bluetooth.le.ScanResult r7) {
        /*
            r6 = this;
            android.bluetooth.le.ScanRecord r0 = r7.getScanRecord()
            if (r0 == 0) goto La6
            java.util.List r0 = r0.getServiceUuids()
            if (r0 == 0) goto La6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()
            android.os.ParcelUuid r1 = (android.os.ParcelUuid) r1
            java.util.UUID r1 = r1.getUuid()
            java.util.UUID r2 = z4.O.f53423a
            boolean r2 = kotlin.jvm.internal.C3862t.b(r2, r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L56
            java.util.UUID r2 = z4.O.f53448z
            boolean r2 = kotlin.jvm.internal.C3862t.b(r2, r1)
            if (r2 != 0) goto L56
            java.util.UUID r2 = z4.O.f53447y
            boolean r2 = kotlin.jvm.internal.C3862t.b(r2, r1)
            if (r2 == 0) goto L3d
            goto L56
        L3d:
            java.util.UUID r2 = z4.O.f53434l
            boolean r2 = kotlin.jvm.internal.C3862t.b(r2, r1)
            if (r2 == 0) goto L4e
            com.apptionlabs.meater_app.data.Config$Companion r2 = com.apptionlabs.meater_app.data.Config.INSTANCE
            com.apptionlabs.meater_app.data.Config r2 = r2.getInstance()
            boolean r2 = r2.DISCOVER_V2_PROBES
            goto L59
        L4e:
            java.util.UUID r2 = z4.O.f53425c
            boolean r2 = kotlin.jvm.internal.C3862t.b(r2, r1)
            if (r2 == 0) goto L58
        L56:
            r2 = r4
            goto L59
        L58:
            r2 = r3
        L59:
            java.util.UUID r5 = z4.O.f53435m
            boolean r5 = kotlin.jvm.internal.C3862t.b(r1, r5)
            if (r5 == 0) goto L65
            r6.n(r7, r3)
            goto L12
        L65:
            java.util.UUID r3 = z4.O.f53442t
            boolean r3 = kotlin.jvm.internal.C3862t.b(r1, r3)
            if (r3 == 0) goto L71
            r6.n(r7, r4)
            goto L12
        L71:
            java.util.UUID r3 = z4.O.f53417B
            boolean r3 = kotlin.jvm.internal.C3862t.b(r1, r3)
            if (r3 != 0) goto La1
            java.util.UUID r3 = z4.O.f53418C
            boolean r3 = kotlin.jvm.internal.C3862t.b(r1, r3)
            if (r3 != 0) goto La1
            java.util.UUID r3 = z4.O.f53419D
            boolean r3 = kotlin.jvm.internal.C3862t.b(r1, r3)
            if (r3 != 0) goto La1
            java.util.UUID r3 = z4.O.f53420E
            boolean r3 = kotlin.jvm.internal.C3862t.b(r1, r3)
            if (r3 != 0) goto La1
            java.util.UUID r3 = z4.O.f53421F
            boolean r1 = kotlin.jvm.internal.C3862t.b(r1, r3)
            if (r1 == 0) goto L9a
            goto La1
        L9a:
            if (r2 == 0) goto L12
            r6.q(r7)
            goto L12
        La1:
            r6.n(r7, r4)
            goto L12
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.K.p(android.bluetooth.le.ScanResult):void");
    }

    private final void q(final ScanResult result) {
        ScanRecord scanRecord = result.getScanRecord();
        if (scanRecord == null) {
            return;
        }
        byte[] manufacturerSpecificData = scanRecord.getManufacturerSpecificData(Config.BLECompanyIDApptionLabs);
        final C5172b c5172bF = manufacturerSpecificData == null ? C5172b.f(scanRecord.getDeviceName()) : C5172b.g(manufacturerSpecificData);
        if (c5172bF.h()) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: z4.J
            @Override // java.lang.Runnable
            public final void run() {
                K.r(this.f53389B, c5172bF, result);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(K k10, C5172b c5172b, ScanResult scanResult) {
        k10.scanCallback.c(c5172b.f53567a, scanResult.getDevice().getAddress(), c5172b.f53568b, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String s(int errorCode) {
        return errorCode != 1 ? errorCode != 2 ? errorCode != 3 ? errorCode != 4 ? "Unknown scan error" : "Power-optimized scan not supported" : "Internal scan error" : "App could not be registered" : "Scan already started";
    }

    private final boolean t() {
        try {
            if (this.bluetoothAdapter.isEnabled()) {
                return this.bluetoothAdapter.getState() == 12;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(K k10) {
        k10.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(final K k10) {
        final BluetoothLeScanner bluetoothLeScanner = k10.bluetoothAdapter.getBluetoothLeScanner();
        if (k10.t() && bluetoothLeScanner != null) {
            U4.b.a("[SCAN] Scan started", new Object[0]);
            new Handler(k10.scanThread.getLooper()).post(new Runnable() { // from class: z4.E
                @Override // java.lang.Runnable
                public final void run() {
                    K.y(this.f53380B, bluetoothLeScanner);
                }
            });
            return;
        }
        U4.b.a("[SCAN] Unable to get scanner!", new Object[0]);
        synchronized (k10.scanLock) {
            k10.scanState = c.f53402B;
            C4153F c4153f = C4153F.f46609a;
        }
        k10.scanCallback.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(K k10, BluetoothLeScanner bluetoothLeScanner) {
        k10.z(bluetoothLeScanner);
    }

    @SuppressLint({"MissingPermission"})
    private final void z(BluetoothLeScanner scanner) {
        try {
            ScanSettings.Builder scanMode = new ScanSettings.Builder().setScanMode(2);
            scanMode.setLegacy(!this.bluetoothAdapter.isLeCodedPhySupported()).setPhy(255);
            scanner.startScan((List<ScanFilter>) null, scanMode.build(), this.internalScanCallback);
            this.mainHandler.post(new Runnable() { // from class: z4.G
                @Override // java.lang.Runnable
                public final void run() {
                    K.A(this.f53383B);
                }
            });
        } catch (Exception e10) {
            U4.b.a("[SCAN] Unexpected exception: %s", e10.toString());
            synchronized (this.scanLock) {
                this.scanState = c.f53402B;
                C4153F c4153f = C4153F.f46609a;
                x4.b.j(b.EnumC0768b.f52632E1.title, "", "", null, 8, null);
                B();
            }
        }
    }

    public final void B() {
        synchronized (this.scanLock) {
            if (this.scanState != c.f53404D) {
                U4.b.a("[SCAN] Stop scan ignored: no active scan to stop", new Object[0]);
                return;
            }
            this.scanState = c.f53405E;
            C4153F c4153f = C4153F.f46609a;
            this.mainHandler.removeCallbacks(this.scanTimeoutRunnable);
            this.mainHandler.post(new Runnable() { // from class: z4.B
                @Override // java.lang.Runnable
                public final void run() {
                    K.C(this.f53377B);
                }
            });
        }
    }

    public final boolean u() {
        return this.scanState == c.f53404D;
    }

    public final void w() {
        synchronized (this.scanLock) {
            if (this.scanState == c.f53402B) {
                this.scanState = c.f53403C;
                C4153F c4153f = C4153F.f46609a;
                this.mainHandler.post(new Runnable() { // from class: z4.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.x(this.f53379B);
                    }
                });
            } else {
                U4.b.a("[SCAN] Start scan ignored: scan already in progress (state = " + this.scanState + ")", new Object[0]);
            }
        }
    }
}
