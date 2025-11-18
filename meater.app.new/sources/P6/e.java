package P6;

import f9.InterfaceC3350d;

/* compiled from: StorageMetrics.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f14122c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f14123a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14124b;

    /* compiled from: StorageMetrics.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f14125a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f14126b = 0;

        a() {
        }

        public e a() {
            return new e(this.f14125a, this.f14126b);
        }

        public a b(long j10) {
            this.f14125a = j10;
            return this;
        }

        public a c(long j10) {
            this.f14126b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f14123a = j10;
        this.f14124b = j11;
    }

    public static a c() {
        return new a();
    }

    @InterfaceC3350d(tag = 1)
    public long a() {
        return this.f14123a;
    }

    @InterfaceC3350d(tag = 2)
    public long b() {
        return this.f14124b;
    }
}
