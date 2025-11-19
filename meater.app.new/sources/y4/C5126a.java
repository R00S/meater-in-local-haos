package y4;

import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.MEATERDevice;

/* compiled from: ScanDevice.java */
/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5126a {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0778a f53106a = EnumC0778a.PENDING;

    /* renamed from: b, reason: collision with root package name */
    public MEATERDevice f53107b;

    /* compiled from: ScanDevice.java */
    /* renamed from: y4.a$a, reason: collision with other inner class name */
    private enum EnumC0778a {
        NONE,
        PENDING,
        PROCESSING,
        COMPLETE
    }

    public C5126a(MEATERDevice mEATERDevice) {
        this.f53107b = mEATERDevice;
    }

    public boolean a() {
        if (this.f53106a != EnumC0778a.PROCESSING) {
            return false;
        }
        this.f53106a = EnumC0778a.COMPLETE;
        return true;
    }

    public boolean b() {
        return this.f53106a == EnumC0778a.PROCESSING;
    }

    public boolean c() {
        return this.f53106a == EnumC0778a.PENDING && !this.f53107b.isPaired() && this.f53107b.isOnline() && !this.f53107b.isMEATERProbe() && (!this.f53107b.isMEATERBlock() ? !this.f53107b.getConnectionMethod().isBluetoothConnectionMethod() : !(this.f53107b.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK || this.f53107b.getConnectionMethod().isBluetoothConnectionMethod()));
    }

    public boolean d() {
        return this.f53106a == EnumC0778a.PENDING && !this.f53107b.isPaired() && this.f53107b.isOnline() && this.f53107b.isMEATERProbe() && System.currentTimeMillis() - this.f53107b.getFirstSeenAdvertising() > 10000 && this.f53107b.getConnectionMethod().isBluetoothConnectionMethod();
    }

    public C5126a e(boolean z10) {
        if (z10) {
            this.f53106a = EnumC0778a.PROCESSING;
        }
        return this;
    }
}
