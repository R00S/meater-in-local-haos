package B4;

import android.os.Build;
import g1.C3377a;
import z4.C5181k;

/* compiled from: MEATERBLERequestMTUOperation.java */
/* loaded from: classes.dex */
public class i extends b {
    public i(C5181k c5181k) {
        super(c5181k, null, null, false);
    }

    @Override // B4.b
    public boolean d() {
        try {
            e();
            if (Build.VERSION.SDK_INT >= 31 && C3377a.a(x4.g.h(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                return false;
            }
            return this.f1538a.t().requestMtu(247);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // B4.b
    public String toString() {
        return "Request MTU for " + this.f1538a.r().getDebugLogDescription();
    }
}
