package B4;

import android.bluetooth.BluetoothGattService;
import java.util.UUID;
import z4.C5181k;

/* compiled from: MEATERBLEOperation.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    final C5181k f1538a;

    /* renamed from: b, reason: collision with root package name */
    final BluetoothGattService f1539b;

    /* renamed from: c, reason: collision with root package name */
    final UUID f1540c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1541d;

    /* renamed from: e, reason: collision with root package name */
    private long f1542e;

    /* renamed from: f, reason: collision with root package name */
    public int f1543f = 15;

    /* renamed from: g, reason: collision with root package name */
    a f1544g = a.High;

    /* compiled from: MEATERBLEOperation.java */
    enum a {
        High,
        Low
    }

    public b(C5181k c5181k, BluetoothGattService bluetoothGattService, UUID uuid, boolean z10) {
        this.f1538a = c5181k;
        this.f1539b = bluetoothGattService;
        this.f1540c = uuid;
        this.f1541d = z10;
    }

    public C5181k a() {
        return this.f1538a;
    }

    public UUID b() {
        return this.f1540c;
    }

    void c() {
        if (this.f1541d) {
            this.f1538a.t().requestConnectionPriority(1);
        }
    }

    public boolean d() {
        return true;
    }

    void e() {
        this.f1542e = System.currentTimeMillis();
    }

    void f() {
        if (this.f1541d) {
            this.f1538a.t().requestConnectionPriority(0);
        }
    }

    public long g() {
        return System.currentTimeMillis() - this.f1542e;
    }

    public String toString() {
        return getClass().getName();
    }
}
