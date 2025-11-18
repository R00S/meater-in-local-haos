package T6;

import T6.f;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes2.dex */
final class c extends f.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f16162a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16163b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<f.c> f16164c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    static final class b extends f.b.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f16165a;

        /* renamed from: b, reason: collision with root package name */
        private Long f16166b;

        /* renamed from: c, reason: collision with root package name */
        private Set<f.c> f16167c;

        b() {
        }

        @Override // T6.f.b.a
        public f.b a() {
            String str = "";
            if (this.f16165a == null) {
                str = " delta";
            }
            if (this.f16166b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f16167c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f16165a.longValue(), this.f16166b.longValue(), this.f16167c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // T6.f.b.a
        public f.b.a b(long j10) {
            this.f16165a = Long.valueOf(j10);
            return this;
        }

        @Override // T6.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f16167c = set;
            return this;
        }

        @Override // T6.f.b.a
        public f.b.a d(long j10) {
            this.f16166b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // T6.f.b
    long b() {
        return this.f16162a;
    }

    @Override // T6.f.b
    Set<f.c> c() {
        return this.f16164c;
    }

    @Override // T6.f.b
    long d() {
        return this.f16163b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f16162a == bVar.b() && this.f16163b == bVar.d() && this.f16164c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f16162a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f16163b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f16164c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f16162a + ", maxAllowedDelay=" + this.f16163b + ", flags=" + this.f16164c + "}";
    }

    private c(long j10, long j11, Set<f.c> set) {
        this.f16162a = j10;
        this.f16163b = j11;
        this.f16164c = set;
    }
}
