package z4;

import P5.C1595c;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERPlus;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: MEATERPlusOTAUpdater.java */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: m, reason: collision with root package name */
    private static final Handler f53534m = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private d f53535a;

    /* renamed from: b, reason: collision with root package name */
    private Y f53536b;

    /* renamed from: c, reason: collision with root package name */
    private c f53537c;

    /* renamed from: e, reason: collision with root package name */
    private b f53539e;

    /* renamed from: f, reason: collision with root package name */
    private final ByteBuffer f53540f;

    /* renamed from: g, reason: collision with root package name */
    private final int f53541g;

    /* renamed from: h, reason: collision with root package name */
    private int f53542h;

    /* renamed from: i, reason: collision with root package name */
    private int f53543i;

    /* renamed from: j, reason: collision with root package name */
    private String f53544j;

    /* renamed from: k, reason: collision with root package name */
    private int f53545k;

    /* renamed from: d, reason: collision with root package name */
    private int f53538d = 2;

    /* renamed from: l, reason: collision with root package name */
    private final Runnable f53546l = new a();

    /* compiled from: MEATERPlusOTAUpdater.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a0.this.f53544j != null) {
                U4.b.m("Attempted to write reboot after failing with an error, but it timed out.", new Object[0]);
                if (a0.this.f53535a != null) {
                    a0.this.f53535a.a(a0.this.f53544j);
                    return;
                }
                return;
            }
            U4.b.m("Timed out!", new Object[0]);
            if (a0.this.f53537c != c.AWAITING_NEXT_ADDRESS) {
                a0.this.k(x4.g.h().getResources().getString(R.string.time_out_alert_message));
                return;
            }
            U4.b.m("Will force read cmd state...", new Object[0]);
            a0.this.f53539e.f53553f = true;
            a0.this.v();
        }
    }

    /* compiled from: MEATERPlusOTAUpdater.java */
    class b {

        /* renamed from: a, reason: collision with root package name */
        boolean f53548a;

        /* renamed from: b, reason: collision with root package name */
        boolean f53549b;

        /* renamed from: c, reason: collision with root package name */
        boolean f53550c;

        /* renamed from: d, reason: collision with root package name */
        boolean f53551d;

        /* renamed from: e, reason: collision with root package name */
        boolean f53552e;

        /* renamed from: f, reason: collision with root package name */
        boolean f53553f;

        /* renamed from: g, reason: collision with root package name */
        boolean f53554g;

        b(a0 a0Var) {
        }
    }

    /* compiled from: MEATERPlusOTAUpdater.java */
    enum c {
        STARTING(0),
        AWAITING_NEXT_ADDRESS(1),
        AWAITING_FIRMWARE_ACCEPTANCE(2),
        WRITE_REBOOT(3),
        UPDATE_COMPLETE(4),
        ATTEMPTING_RECONNECT(5),
        FAILED(6),
        FORCE_READ_CMD(7),
        OTA_STATE_WRITE_FAST_CONNECTION_INTERVAL(8);


        /* renamed from: B, reason: collision with root package name */
        public final int f53565B;

        c(int i10) {
            this.f53565B = i10;
        }
    }

    /* compiled from: MEATERPlusOTAUpdater.java */
    public interface d {
        void a(String str);

        void b();

        void c();

        void d();

        void e();

        void f(double d10);
    }

    public a0(MEATERPlus mEATERPlus, ByteBuffer byteBuffer, int i10, d dVar) {
        this.f53540f = byteBuffer;
        this.f53541g = i10;
        this.f53536b = (Y) mEATERPlus.getBleConnection();
        this.f53535a = dVar;
        mEATERPlus.setOtaUpdateInProgress(this);
        this.f53536b.G0(this);
        this.f53545k = 0;
    }

    private void g() {
        f53534m.removeCallbacks(this.f53546l);
    }

    private static UUID i() {
        return O.f53443u;
    }

    private static UUID j() {
        return O.f53430h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        if (this.f53544j != null) {
            return;
        }
        this.f53544j = str;
        U4.b.m("Got Error: " + str, new Object[0]);
        x();
    }

    private void p() {
        q(10);
    }

    private void q(int i10) {
        Handler handler = f53534m;
        handler.removeCallbacks(this.f53546l);
        try {
            handler.postDelayed(this.f53546l, i10 * 1000);
        } catch (Exception e10) {
            U4.b.m("Reset timeout failed: " + e10.getLocalizedMessage(), new Object[0]);
        }
    }

    private void t(c cVar) {
        if (this.f53537c != cVar) {
            U4.b.m("[STATE] " + this.f53537c.toString() + "-> " + cVar.toString(), new Object[0]);
            this.f53537c = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        b bVar = this.f53539e;
        if (bVar.f53552e) {
            c cVar = this.f53537c;
            if (cVar == c.WRITE_REBOOT || cVar == c.UPDATE_COMPLETE) {
                return;
            }
            d dVar = this.f53535a;
            if (dVar != null) {
                dVar.e();
            }
            this.f53539e.f53552e = false;
            t(c.ATTEMPTING_RECONNECT);
            q(30);
            return;
        }
        c cVar2 = this.f53537c;
        if (cVar2 == c.OTA_STATE_WRITE_FAST_CONNECTION_INTERVAL) {
            if (this.f53536b.E0()) {
                this.f53538d = 1;
            } else {
                this.f53538d = 2;
            }
            this.f53536b.w0();
            t(c.STARTING);
            v();
            return;
        }
        if (cVar2 == c.STARTING) {
            t(c.AWAITING_NEXT_ADDRESS);
            y();
            return;
        }
        c cVar3 = c.AWAITING_NEXT_ADDRESS;
        if (cVar2 == cVar3) {
            if (bVar.f53553f) {
                bVar.f53553f = false;
                t(c.FORCE_READ_CMD);
                p();
                B4.f fVar = C5181k.f53635q;
                Y y10 = this.f53536b;
                fVar.d(new B4.g(y10, y10.f53578z, i(), false, false));
                return;
            }
            if (bVar.f53548a) {
                bVar.f53548a = false;
                int i10 = this.f53543i;
                if (i10 > 0 && i10 < this.f53542h) {
                    d dVar2 = this.f53535a;
                    if (dVar2 != null) {
                        dVar2.b();
                    }
                    this.f53543i = 0;
                }
                if (this.f53542h + 375 >= this.f53540f.array().length) {
                    t(c.AWAITING_FIRMWARE_ACCEPTANCE);
                } else {
                    t(cVar3);
                }
                w(this.f53542h);
                return;
            }
            return;
        }
        if (cVar2 == c.AWAITING_FIRMWARE_ACCEPTANCE) {
            if (bVar.f53549b) {
                if (!bVar.f53550c) {
                    t(c.FAILED);
                    k("MEATER+ was unable to validate the firmware update.");
                    return;
                } else {
                    this.f53544j = null;
                    t(c.WRITE_REBOOT);
                    x();
                    return;
                }
            }
            return;
        }
        if (cVar2 != c.WRITE_REBOOT) {
            if (cVar2 == c.FORCE_READ_CMD && bVar.f53554g) {
                bVar.f53554g = false;
                t(cVar3);
                v();
                return;
            }
            return;
        }
        if (bVar.f53551d) {
            bVar.f53551d = false;
            t(c.UPDATE_COMPLETE);
            g();
            d dVar3 = this.f53535a;
            if (dVar3 != null) {
                dVar3.c();
            }
        }
    }

    byte[] h(int i10) {
        int iMin = Math.min(this.f53540f.array().length - i10, 375);
        byte[] bArr = new byte[iMin];
        this.f53540f.position(i10);
        this.f53540f.get(bArr, 0, iMin);
        return bArr;
    }

    public c l() {
        return this.f53537c;
    }

    public void m(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        c cVar;
        d dVar;
        if (i().equals(bluetoothGattCharacteristic.getUuid()) && ((cVar = this.f53537c) == c.WRITE_REBOOT || cVar == c.FAILED)) {
            U4.b.m("Successfully wrote reboot command.", new Object[0]);
            this.f53539e.f53551d = true;
            String str = this.f53544j;
            if (str != null && (dVar = this.f53535a) != null) {
                dVar.a(str);
                return;
            }
        }
        if (this.f53537c == c.OTA_STATE_WRITE_FAST_CONNECTION_INTERVAL) {
            String str2 = this.f53544j;
            if (str2 != null) {
                U4.b.m("Successfully wrote fast connection interval command", new Object[0]);
            } else {
                U4.b.m("Failed to write fast connection interval command: %s", str2);
            }
            t(c.STARTING);
        }
        v();
    }

    public void n(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f53537c == c.UPDATE_COMPLETE) {
            return;
        }
        if (i().equals(bluetoothGattCharacteristic.getUuid())) {
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (value == null) {
                U4.b.m(O.a(bluetoothGattCharacteristic.getUuid()) + " is empty, ignoring", new Object[0]);
                return;
            }
            if (value.length < 8) {
                U4.b.m(O.a(bluetoothGattCharacteristic.getUuid()) + " value is too short, ignoring", new Object[0]);
                return;
            }
            A4.d dVarA = A4.d.a(ByteBuffer.wrap(value));
            if (dVarA != null) {
                c cVar = this.f53537c;
                if (cVar == c.AWAITING_NEXT_ADDRESS) {
                    if (dVarA.f757a == A4.b.OTA_RESP_ADDRESS) {
                        U4.b.m("Got next byte offset to write.", new Object[0]);
                        int i10 = dVarA.f760d;
                        this.f53542h = i10;
                        double d10 = i10;
                        double length = this.f53540f.array().length;
                        d dVar = this.f53535a;
                        if (dVar != null) {
                            dVar.f(d10 / length);
                        }
                        this.f53539e.f53548a = true;
                    }
                } else if (cVar == c.AWAITING_FIRMWARE_ACCEPTANCE) {
                    this.f53539e.f53549b = true;
                    if (dVarA.f757a == A4.b.OTA_RESP_CRC_PASS) {
                        U4.b.m("Passed CRC check.", new Object[0]);
                        this.f53539e.f53550c = true;
                    } else {
                        U4.b.m("Failed CRC check! (Wanted CRC: 0x" + Integer.toHexString(dVarA.f760d) + ")", new Object[0]);
                    }
                } else if (cVar == c.FORCE_READ_CMD) {
                    this.f53539e.f53554g = true;
                    if (dVarA.f757a == A4.b.OTA_RESP_ADDRESS) {
                        U4.b.m("Got next byte offset to write.", new Object[0]);
                        int i11 = dVarA.f760d;
                        this.f53542h = i11;
                        double d11 = i11;
                        double length2 = this.f53540f.array().length;
                        d dVar2 = this.f53535a;
                        if (dVar2 != null) {
                            dVar2.f(d11 / length2);
                        }
                        this.f53539e.f53548a = true;
                    } else {
                        U4.b.m("Bad state from MEATER+: 0x" + dVarA.f757a + ". Must give up!", new Object[0]);
                        x();
                    }
                } else {
                    if (cVar != c.WRITE_REBOOT) {
                        k("Invalid state - got " + this.f53537c.toString() + ", wanted AwaitingCheckConfirm || AwaitingWriteStatus || MEATERPlusOTAStateAwaitingWriteConfirm");
                        return;
                    }
                    U4.b.m("We are rebooting - will ignore value for cmd", new Object[0]);
                }
            }
        }
        v();
    }

    void o() {
        U4.b.m("Disconnected. Will attempt to reconnect...", new Object[0]);
        this.f53539e.f53552e = true;
        Y y10 = this.f53536b;
        y10.f53520H = 0;
        y10.G0(null);
        this.f53536b = null;
        v();
    }

    void r(int i10) {
        this.f53544j = null;
        Y y10 = this.f53536b;
        if (y10 == null) {
            k("Can't resume OTA with no BLE connection");
            return;
        }
        BluetoothGattService bluetoothGattService = y10.f53578z;
        if (bluetoothGattService == null) {
            k("Can't resume OTA with no BLE service");
            return;
        }
        if (this.f53545k > 25) {
            k("Can't resume OTA connection not a stable connection");
            return;
        }
        bluetoothGattService.getCharacteristic(j()).setWriteType(this.f53538d);
        if (this.f53536b.t() == null) {
            k("Can't resume OTA with connection missing GATT object");
            return;
        }
        this.f53536b.t().requestConnectionPriority(1);
        U4.b.m("Resuming firmware write…", new Object[0]);
        this.f53542h = i10;
        this.f53543i = i10;
        b bVar = new b(this);
        this.f53539e = bVar;
        bVar.f53548a = true;
        this.f53537c = c.AWAITING_NEXT_ADDRESS;
        d dVar = this.f53535a;
        if (dVar != null) {
            dVar.d();
        }
        p();
        v();
        this.f53545k++;
    }

    public void s(Y y10) {
        this.f53536b = y10;
    }

    public void u() {
        this.f53539e = new b(this);
        this.f53537c = c.OTA_STATE_WRITE_FAST_CONNECTION_INTERVAL;
        v();
    }

    void w(int i10) {
        if (this.f53536b == null) {
            U4.b.m("FATAL: Can't write chunk - Lost connection!", new Object[0]);
            return;
        }
        p();
        U4.b.m("Writing firmware bytes %d-%d (%d%% complete)", Integer.valueOf(i10), Integer.valueOf(Math.min(this.f53540f.array().length, i10 + 375)), Integer.valueOf((int) Math.round(((i10 * 1.0d) / this.f53540f.array().length) * 100.0d)));
        byte[] bArrH = h(i10);
        B4.f fVar = C5181k.f53635q;
        Y y10 = this.f53536b;
        fVar.d(new B4.k(y10, y10.f53578z, j(), bArrH, false));
    }

    void x() {
        if (this.f53536b == null) {
            U4.b.m("Attempted to write reboot after failing with an error, but lost connection.", new Object[0]);
            d dVar = this.f53535a;
            if (dVar != null) {
                dVar.a(this.f53544j);
                return;
            }
            return;
        }
        p();
        U4.b.m("Writing reboot command…", new Object[0]);
        A4.d dVar2 = new A4.d();
        dVar2.f757a = A4.b.OTA_CMD_REBOOT;
        ByteBuffer byteBufferB = dVar2.b();
        B4.f fVar = C5181k.f53635q;
        Y y10 = this.f53536b;
        fVar.d(new B4.k(y10, y10.f53578z, i(), byteBufferB.array(), false));
    }

    void y() {
        Y y10 = this.f53536b;
        if (y10 == null) {
            U4.b.m("FATAL: Can't write start - Lost connection!", new Object[0]);
            return;
        }
        if (y10.f53578z == null) {
            U4.b.m("FATAL: Can't write start - connection.meaterService null!", new Object[0]);
            return;
        }
        p();
        this.f53536b.f53578z.getCharacteristic(j()).setWriteType(this.f53538d);
        U4.b.m("Starting firmware write…", new Object[0]);
        this.f53536b.t().requestConnectionPriority(1);
        A4.d dVar = new A4.d();
        dVar.f757a = A4.b.OTA_CMD_START;
        dVar.f758b = this.f53541g;
        dVar.f759c = this.f53540f.array().length;
        ByteBuffer byteBufferB = dVar.b();
        U4.b.m(C1595c.b(byteBufferB.array()), new Object[0]);
        B4.f fVar = C5181k.f53635q;
        Y y11 = this.f53536b;
        fVar.d(new B4.k(y11, y11.f53578z, i(), byteBufferB.array(), false));
    }
}
