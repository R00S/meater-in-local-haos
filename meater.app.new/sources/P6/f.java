package P6;

import f9.InterfaceC3350d;

/* compiled from: TimeWindow.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f14127c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f14128a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14129b;

    /* compiled from: TimeWindow.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f14130a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f14131b = 0;

        a() {
        }

        public f a() {
            return new f(this.f14130a, this.f14131b);
        }

        public a b(long j10) {
            this.f14131b = j10;
            return this;
        }

        public a c(long j10) {
            this.f14130a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f14128a = j10;
        this.f14129b = j11;
    }

    public static a c() {
        return new a();
    }

    @InterfaceC3350d(tag = 2)
    public long a() {
        return this.f14129b;
    }

    @InterfaceC3350d(tag = 1)
    public long b() {
        return this.f14128a;
    }
}
