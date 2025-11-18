package B4;

import B4.b;
import android.bluetooth.BluetoothGattService;
import java.util.Locale;
import java.util.UUID;
import z4.C5181k;
import z4.O;

/* compiled from: MEATERBLEReadOperation.java */
/* loaded from: classes.dex */
public class g extends b {
    public g(C5181k c5181k, BluetoothGattService bluetoothGattService, UUID uuid, boolean z10, boolean z11) {
        super(c5181k, bluetoothGattService, uuid, z10);
        if (z11) {
            this.f1544g = b.a.Low;
        }
    }

    @Override // B4.b
    public boolean d() {
        try {
            e();
            c();
            if (this.f1538a.t().readCharacteristic(this.f1539b.getCharacteristic(this.f1540c))) {
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
        return String.format(Locale.US, "Read %s for %s %s", O.a(this.f1540c), this.f1538a.r().getDebugLogDescription(), this.f1544g.toString());
    }
}
