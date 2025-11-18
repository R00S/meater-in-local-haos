package Q8;

/* compiled from: DeliveryMechanism.java */
/* loaded from: classes2.dex */
public enum H {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: B, reason: collision with root package name */
    private final int f14396B;

    H(int i10) {
        this.f14396B = i10;
    }

    public static H j(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int n() {
        return this.f14396B;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f14396B);
    }
}
