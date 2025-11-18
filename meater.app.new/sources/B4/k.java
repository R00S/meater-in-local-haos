package B4;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.Locale;
import java.util.UUID;
import z4.C5181k;
import z4.O;

/* compiled from: MEATERBLEWriteOperation.java */
/* loaded from: classes.dex */
public class k extends b {

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f1556h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f1557i;

    public k(C5181k c5181k, BluetoothGattService bluetoothGattService, UUID uuid, byte[] bArr, boolean z10) {
        this(c5181k, bluetoothGattService, uuid, bArr, z10, null);
    }

    @Override // B4.b
    public boolean d() {
        try {
            e();
            c();
            BluetoothGattCharacteristic characteristic = this.f1539b.getCharacteristic(this.f1540c);
            characteristic.setValue(this.f1556h);
            Integer num = this.f1557i;
            if (num != null) {
                characteristic.setWriteType(num.intValue());
            }
            if (this.f1538a.t().writeCharacteristic(characteristic)) {
                return true;
            }
            f();
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            f();
            return false;
        }
    }

    @Override // B4.b
    public String toString() {
        return String.format(Locale.US, "Write %s for %s %s", O.a(this.f1540c), this.f1538a.r().getDebugLogDescription(), this.f1544g.toString());
    }

    public k(C5181k c5181k, BluetoothGattService bluetoothGattService, UUID uuid, byte[] bArr, boolean z10, Integer num) {
        super(c5181k, bluetoothGattService, uuid, z10);
        this.f1556h = bArr;
        this.f1557i = num;
    }
}
