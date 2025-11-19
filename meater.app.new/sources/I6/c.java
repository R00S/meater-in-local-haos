package I6;

/* compiled from: StateVerifier.java */
/* loaded from: classes2.dex */
public abstract class c {

    /* compiled from: StateVerifier.java */
    private static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f6707a;

        b() {
            super();
        }

        @Override // I6.c
        public void b(boolean z10) {
            this.f6707a = z10;
        }

        @Override // I6.c
        public void c() {
            if (this.f6707a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}
