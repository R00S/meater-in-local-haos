package O4;

/* compiled from: DisplayType.java */
/* loaded from: classes2.dex */
public enum e {
    LIGHT_MODE(1),
    DARK_MODE(2),
    AUTO(3);


    /* renamed from: B, reason: collision with root package name */
    private final int f13255B;

    e(int i10) {
        this.f13255B = i10;
    }

    public static int j(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    public int n() {
        return this.f13255B;
    }
}
