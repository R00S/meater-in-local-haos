package V4;

/* compiled from: BlockConnectivityFailureReason.java */
/* loaded from: classes2.dex */
public enum a {
    NO_ERROR(0),
    RECEIVE_BROADCAST(1),
    RECEIVE_UNICAST(2),
    NO_PROBES(3);


    /* renamed from: B, reason: collision with root package name */
    private final int f18085B;

    a(int i10) {
        this.f18085B = i10;
    }

    public int j() {
        return this.f18085B;
    }
}
