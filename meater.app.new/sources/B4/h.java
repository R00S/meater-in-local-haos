package B4;

import B4.b;
import java.util.Locale;
import z4.C5181k;

/* compiled from: MEATERBLEReadRSSIOperation.java */
/* loaded from: classes.dex */
public class h extends b {
    public h(C5181k c5181k) {
        super(c5181k, null, null, false);
        this.f1544g = b.a.Low;
    }

    @Override // B4.b
    public boolean d() {
        try {
            e();
            return this.f1538a.t().readRemoteRssi();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // B4.b
    public String toString() {
        return String.format(Locale.US, "Read RSSI for %s %s", this.f1538a.r().getDebugLogDescription(), this.f1544g.toString());
    }
}
