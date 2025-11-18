package P5;

import com.apptionlabs.meater_app.model.MEATERDevice;

/* compiled from: RSSISignalLevelHelper.java */
/* loaded from: classes2.dex */
public class B {

    /* compiled from: RSSISignalLevelHelper.java */
    public enum a {
        UNKNOWN(-127, 2131231408),
        MISSING(-100, 2131231407),
        VERY_WEAK(-92, 2131231409),
        WEAK(-88, 2131231410),
        AVERAGE(-80, 2131231411),
        GOOD(-70, 2131231412);


        /* renamed from: B, reason: collision with root package name */
        private final int f13988B;

        /* renamed from: C, reason: collision with root package name */
        private final int f13989C;

        a(int i10, int i11) {
            this.f13988B = i10;
            this.f13989C = i11;
        }

        public int p() {
            return this.f13989C;
        }

        public int s() {
            return this.f13988B;
        }
    }

    public static a a(MEATERDevice mEATERDevice) {
        int signalLevel = mEATERDevice.getSignalLevel();
        if (mEATERDevice.getShouldShowAsConnected()) {
            a aVar = a.MISSING;
            if (signalLevel >= aVar.f13988B) {
                a aVar2 = a.VERY_WEAK;
                if (signalLevel < aVar2.f13988B) {
                    return aVar;
                }
                a aVar3 = a.WEAK;
                if (signalLevel < aVar3.f13988B) {
                    return aVar2;
                }
                a aVar4 = a.AVERAGE;
                if (signalLevel < aVar4.f13988B) {
                    return aVar3;
                }
                a aVar5 = a.GOOD;
                return signalLevel < aVar5.f13988B ? aVar4 : aVar5;
            }
        }
        return a.UNKNOWN;
    }

    public static int b(MEATERDevice mEATERDevice) {
        return a(mEATERDevice).f13989C;
    }
}
