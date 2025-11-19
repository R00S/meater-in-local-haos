package O5;

import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.MEATERDevice;
import j1.C3724i;

/* compiled from: UDPSocketManager.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    protected g f13284a;

    /* renamed from: b, reason: collision with root package name */
    protected i f13285b;

    public void a() {
        g gVar = this.f13284a;
        if (gVar != null) {
            gVar.i();
            this.f13284a = null;
        }
        i iVar = this.f13285b;
        if (iVar != null) {
            iVar.g();
            this.f13285b = null;
        }
    }

    protected MEATERDevice b(long j10, int i10, DeviceConnectionMethod deviceConnectionMethod) {
        M4.h hVar = M4.h.f11978a;
        MEATERDevice mEATERDeviceO = hVar.o(j10);
        if (mEATERDeviceO == null && (mEATERDeviceO = MEATERDevice.newDevice(i10, j10)) != null) {
            mEATERDeviceO.setDeviceID(j10);
            mEATERDeviceO.setProbeNumber(i10);
            mEATERDeviceO.setConnectionMethod(deviceConnectionMethod);
            hVar.Z(C3724i.a(new Object[]{mEATERDeviceO}));
        }
        return mEATERDeviceO;
    }

    protected void c() {
    }
}
