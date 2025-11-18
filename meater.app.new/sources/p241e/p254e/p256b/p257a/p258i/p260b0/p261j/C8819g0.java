package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0;

/* compiled from: AutoValue_EventStoreConfig.java */
/* renamed from: e.e.b.a.i.b0.j.g0 */
/* loaded from: classes2.dex */
final class C8819g0 extends AbstractC8827k0 {

    /* renamed from: b */
    private final long f33479b;

    /* renamed from: c */
    private final int f33480c;

    /* renamed from: d */
    private final int f33481d;

    /* renamed from: e */
    private final long f33482e;

    /* renamed from: f */
    private final int f33483f;

    /* compiled from: AutoValue_EventStoreConfig.java */
    /* renamed from: e.e.b.a.i.b0.j.g0$b */
    static final class b extends AbstractC8827k0.a {

        /* renamed from: a */
        private Long f33484a;

        /* renamed from: b */
        private Integer f33485b;

        /* renamed from: c */
        private Integer f33486c;

        /* renamed from: d */
        private Long f33487d;

        /* renamed from: e */
        private Integer f33488e;

        b() {
        }

        @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0.a
        /* renamed from: a */
        AbstractC8827k0 mo27982a() {
            Long l = this.f33484a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " maxStorageSizeInBytes";
            }
            if (this.f33485b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f33486c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f33487d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f33488e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C8819g0(this.f33484a.longValue(), this.f33485b.intValue(), this.f33486c.intValue(), this.f33487d.longValue(), this.f33488e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0.a
        /* renamed from: b */
        AbstractC8827k0.a mo27983b(int i2) {
            this.f33486c = Integer.valueOf(i2);
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0.a
        /* renamed from: c */
        AbstractC8827k0.a mo27984c(long j2) {
            this.f33487d = Long.valueOf(j2);
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0.a
        /* renamed from: d */
        AbstractC8827k0.a mo27985d(int i2) {
            this.f33485b = Integer.valueOf(i2);
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0.a
        /* renamed from: e */
        AbstractC8827k0.a mo27986e(int i2) {
            this.f33488e = Integer.valueOf(i2);
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0.a
        /* renamed from: f */
        AbstractC8827k0.a mo27987f(long j2) {
            this.f33484a = Long.valueOf(j2);
            return this;
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0
    /* renamed from: b */
    int mo27977b() {
        return this.f33481d;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0
    /* renamed from: c */
    long mo27978c() {
        return this.f33482e;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0
    /* renamed from: d */
    int mo27979d() {
        return this.f33480c;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0
    /* renamed from: e */
    int mo27980e() {
        return this.f33483f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8827k0)) {
            return false;
        }
        AbstractC8827k0 abstractC8827k0 = (AbstractC8827k0) obj;
        return this.f33479b == abstractC8827k0.mo27981f() && this.f33480c == abstractC8827k0.mo27979d() && this.f33481d == abstractC8827k0.mo27977b() && this.f33482e == abstractC8827k0.mo27978c() && this.f33483f == abstractC8827k0.mo27980e();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8827k0
    /* renamed from: f */
    long mo27981f() {
        return this.f33479b;
    }

    public int hashCode() {
        long j2 = this.f33479b;
        int i2 = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f33480c) * 1000003) ^ this.f33481d) * 1000003;
        long j3 = this.f33482e;
        return this.f33483f ^ ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f33479b + ", loadBatchSize=" + this.f33480c + ", criticalSectionEnterTimeoutMs=" + this.f33481d + ", eventCleanUpAge=" + this.f33482e + ", maxBlobByteSizePerRow=" + this.f33483f + "}";
    }

    private C8819g0(long j2, int i2, int i3, long j3, int i4) {
        this.f33479b = j2;
        this.f33480c = i2;
        this.f33481d = i3;
        this.f33482e = j3;
        this.f33483f = i4;
    }
}
