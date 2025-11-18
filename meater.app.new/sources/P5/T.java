package P5;

import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDevice;

/* compiled from: WifiSignalLevelHelper.java */
/* loaded from: classes2.dex */
public class T {

    /* compiled from: WifiSignalLevelHelper.java */
    public enum a {
        LOW(-85, R.drawable.ic_wifi_low, R.string.wifi_strength_weak),
        MEDIUM(-70, R.drawable.ic_wifi_medium, R.string.wifi_strength_average),
        HIGH(-55, R.drawable.ic_wifi_high, R.string.wifi_strength_good);


        /* renamed from: B, reason: collision with root package name */
        final int f14011B;

        /* renamed from: C, reason: collision with root package name */
        final int f14012C;

        /* renamed from: D, reason: collision with root package name */
        final int f14013D;

        a(int i10, int i11, int i12) {
            this.f14011B = i10;
            this.f14012C = i11;
            this.f14013D = i12;
        }

        public static a j(int i10) {
            a aVar = MEDIUM;
            if (i10 < aVar.f14011B) {
                return LOW;
            }
            a aVar2 = HIGH;
            return i10 < aVar2.f14011B ? aVar : aVar2;
        }
    }

    public static a a(MEATERDevice mEATERDevice) {
        if (mEATERDevice != null && mEATERDevice.getShouldShowAsConnected()) {
            int signalLevel = mEATERDevice.getSignalLevel();
            if (signalLevel == 1) {
                return a.MEDIUM;
            }
            if (signalLevel == 2) {
                return a.HIGH;
            }
        }
        return a.LOW;
    }

    public static a b(int i10) {
        return a.j(i10);
    }

    public static int c(MEATERDevice mEATERDevice) {
        return a(mEATERDevice).f14012C;
    }

    public static int d(int i10) {
        if (i10 >= a.HIGH.f14011B) {
            return 2;
        }
        return i10 >= a.MEDIUM.f14011B ? 1 : 0;
    }

    public static int e(int i10) {
        return b(i10).f14013D;
    }
}
