package P6;

import f9.InterfaceC3349c;
import f9.InterfaceC3350d;

/* compiled from: LogEventDropped.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f14103c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f14104a;

    /* renamed from: b, reason: collision with root package name */
    private final b f14105b;

    /* compiled from: LogEventDropped.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f14106a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f14107b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f14106a, this.f14107b);
        }

        public a b(long j10) {
            this.f14106a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f14107b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    public enum b implements InterfaceC3349c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: B, reason: collision with root package name */
        private final int f14116B;

        b(int i10) {
            this.f14116B = i10;
        }

        @Override // f9.InterfaceC3349c
        public int e() {
            return this.f14116B;
        }
    }

    c(long j10, b bVar) {
        this.f14104a = j10;
        this.f14105b = bVar;
    }

    public static a c() {
        return new a();
    }

    @InterfaceC3350d(tag = 1)
    public long a() {
        return this.f14104a;
    }

    @InterfaceC3350d(tag = 3)
    public b b() {
        return this.f14105b;
    }
}
