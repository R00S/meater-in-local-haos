package M4;

import com.apptionlabs.meater_app.model.MEATERDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: DeviceComparator.java */
/* loaded from: classes2.dex */
public class c implements Comparator<MEATERDevice> {
    public static Comparator<MEATERDevice> d() {
        return new Comparator() { // from class: M4.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.e((MEATERDevice) obj, (MEATERDevice) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(MEATERDevice mEATERDevice, MEATERDevice mEATERDevice2) {
        if (mEATERDevice.getDatePaired().longValue() < mEATERDevice2.getDatePaired().longValue()) {
            return -1;
        }
        return mEATERDevice.getDatePaired().longValue() > mEATERDevice2.getDatePaired().longValue() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int f(MEATERDevice mEATERDevice, MEATERDevice mEATERDevice2) {
        return (mEATERDevice.getDatePaired() == null || mEATERDevice2.getDatePaired() == null || mEATERDevice.getDatePaired().longValue() == mEATERDevice2.getDatePaired().longValue()) ? compare(mEATERDevice, mEATERDevice2) : d().compare(mEATERDevice, mEATERDevice2);
    }

    public static List<MEATERDevice> g(List<MEATERDevice> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new c().h());
        return arrayList;
    }

    private Comparator<MEATERDevice> h() {
        return new Comparator() { // from class: M4.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.f11972B.f((MEATERDevice) obj, (MEATERDevice) obj2);
            }
        };
    }

    public static List<MEATERDevice> i(List<MEATERDevice> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new c());
        return arrayList;
    }

    private static boolean j(long j10, long j11) {
        return ((j10 < 0) ^ (j10 < j11)) ^ (j11 < 0);
    }

    @Override // java.util.Comparator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(MEATERDevice mEATERDevice, MEATERDevice mEATERDevice2) {
        if (mEATERDevice.getProbeNumber() < mEATERDevice2.getProbeNumber()) {
            return -1;
        }
        return (mEATERDevice.getProbeNumber() <= mEATERDevice2.getProbeNumber() && !j(mEATERDevice.getDeviceID(), mEATERDevice2.getDeviceID())) ? -1 : 1;
    }
}
