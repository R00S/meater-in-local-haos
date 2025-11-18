package P5;

/* compiled from: BatteryLevelHelper.java */
/* renamed from: P5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1594b {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f14021a = {2131231392, 2131231395, 2131231396, 2131231397, 2131231398};

    /* compiled from: BatteryLevelHelper.java */
    /* renamed from: P5.b$a */
    public enum a {
        DISCONNECTED(0),
        POWERED(102),
        BATTERY(1);


        /* renamed from: B, reason: collision with root package name */
        public final int f14026B;

        a(int i10) {
            this.f14026B = i10;
        }
    }

    public static a a(T4.p pVar) {
        if (pVar == null || !pVar.getShouldShowAsConnected() || pVar.getBatteryLevel() == a.DISCONNECTED.f14026B) {
            return a.DISCONNECTED;
        }
        int batteryLevel = pVar.getBatteryLevel();
        a aVar = a.POWERED;
        return batteryLevel == aVar.f14026B ? aVar : a.BATTERY;
    }

    public static int b(T4.p pVar) {
        if (pVar.getBatteryLevel() <= a.DISCONNECTED.f14026B) {
            return 2131231393;
        }
        if (pVar.getBatteryLevel() == a.POWERED.f14026B) {
            return 2131231399;
        }
        float normalizedBatteryLevel = pVar.getNormalizedBatteryLevel();
        return f14021a[Math.min(r0.length - 1, Math.max(0, (int) (normalizedBatteryLevel * r0.length)))];
    }

    public static int c(T4.p pVar) {
        int iOrdinal = a(pVar).ordinal();
        if (iOrdinal == 1) {
            return 2131231399;
        }
        if (iOrdinal != 2) {
            return 2131231393;
        }
        return b(pVar);
    }
}
