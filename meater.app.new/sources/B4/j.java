package B4;

import B4.b;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.apptionlabs.meater_app.data.Config;
import java.util.Locale;
import java.util.UUID;
import z4.C5181k;
import z4.O;

/* compiled from: MEATERBLERequestNotifyOperation.java */
/* loaded from: classes.dex */
public class j extends b {
    public j(C5181k c5181k, BluetoothGattService bluetoothGattService, UUID uuid, boolean z10, boolean z11) {
        super(c5181k, bluetoothGattService, uuid, z10);
        if (z11) {
            this.f1544g = b.a.Low;
        }
    }

    @Override // B4.b
    public boolean d() {
        try {
            e();
            BluetoothGattCharacteristic characteristic = this.f1539b.getCharacteristic(this.f1540c);
            this.f1538a.t().setCharacteristicNotification(characteristic, true);
            Config.getInstance();
            BluetoothGattDescriptor descriptor = characteristic.getDescriptor(UUID.fromString(Config.BLECharacteristicConfigUUID));
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            this.f1538a.t().writeDescriptor(descriptor);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // B4.b
    public String toString() {
        return String.format(Locale.US, "Req notify %s for %s %s", O.a(this.f1540c), this.f1538a.r().getDebugLogDescription(), this.f1544g.toString());
    }
}
