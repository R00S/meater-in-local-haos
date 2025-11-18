package U6;

import U6.AbstractC1743e;

/* compiled from: AutoValue_EventStoreConfig.java */
/* renamed from: U6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1739a extends AbstractC1743e {

    /* renamed from: b, reason: collision with root package name */
    private final long f17602b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17603c;

    /* renamed from: d, reason: collision with root package name */
    private final int f17604d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17605e;

    /* renamed from: f, reason: collision with root package name */
    private final int f17606f;

    /* compiled from: AutoValue_EventStoreConfig.java */
    /* renamed from: U6.a$b */
    static final class b extends AbstractC1743e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f17607a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f17608b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f17609c;

        /* renamed from: d, reason: collision with root package name */
        private Long f17610d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f17611e;

        b() {
        }

        @Override // U6.AbstractC1743e.a
        AbstractC1743e a() {
            String str = "";
            if (this.f17607a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f17608b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f17609c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f17610d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f17611e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1739a(this.f17607a.longValue(), this.f17608b.intValue(), this.f17609c.intValue(), this.f17610d.longValue(), this.f17611e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // U6.AbstractC1743e.a
        AbstractC1743e.a b(int i10) {
            this.f17609c = Integer.valueOf(i10);
            return this;
        }

        @Override // U6.AbstractC1743e.a
        AbstractC1743e.a c(long j10) {
            this.f17610d = Long.valueOf(j10);
            return this;
        }

        @Override // U6.AbstractC1743e.a
        AbstractC1743e.a d(int i10) {
            this.f17608b = Integer.valueOf(i10);
            return this;
        }

        @Override // U6.AbstractC1743e.a
        AbstractC1743e.a e(int i10) {
            this.f17611e = Integer.valueOf(i10);
            return this;
        }

        @Override // U6.AbstractC1743e.a
        AbstractC1743e.a f(long j10) {
            this.f17607a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // U6.AbstractC1743e
    int b() {
        return this.f17604d;
    }

    @Override // U6.AbstractC1743e
    long c() {
        return this.f17605e;
    }

    @Override // U6.AbstractC1743e
    int d() {
        return this.f17603c;
    }

    @Override // U6.AbstractC1743e
    int e() {
        return this.f17606f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1743e)) {
            return false;
        }
        AbstractC1743e abstractC1743e = (AbstractC1743e) obj;
        return this.f17602b == abstractC1743e.f() && this.f17603c == abstractC1743e.d() && this.f17604d == abstractC1743e.b() && this.f17605e == abstractC1743e.c() && this.f17606f == abstractC1743e.e();
    }

    @Override // U6.AbstractC1743e
    long f() {
        return this.f17602b;
    }

    public int hashCode() {
        long j10 = this.f17602b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f17603c) * 1000003) ^ this.f17604d) * 1000003;
        long j11 = this.f17605e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f17606f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f17602b + ", loadBatchSize=" + this.f17603c + ", criticalSectionEnterTimeoutMs=" + this.f17604d + ", eventCleanUpAge=" + this.f17605e + ", maxBlobByteSizePerRow=" + this.f17606f + "}";
    }

    private C1739a(long j10, int i10, int i11, long j11, int i12) {
        this.f17602b = j10;
        this.f17603c = i10;
        this.f17604d = i11;
        this.f17605e = j11;
        this.f17606f = i12;
    }
}
