package D6;

/* compiled from: RequestCoordinator.java */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: RequestCoordinator.java */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: B, reason: collision with root package name */
        private final boolean f3440B;

        a(boolean z10) {
            this.f3440B = z10;
        }

        boolean j() {
            return this.f3440B;
        }
    }

    boolean a(d dVar);

    void b(d dVar);

    boolean c(d dVar);

    void d(d dVar);

    boolean e(d dVar);

    boolean g();

    e getRoot();
}
