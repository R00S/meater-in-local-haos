package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t;
import java.util.Set;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
/* loaded from: classes2.dex */
final class C6288r extends AbstractC6290t.b {

    /* renamed from: a */
    private final long f16824a;

    /* renamed from: b */
    private final long f16825b;

    /* renamed from: c */
    private final Set<AbstractC6290t.c> f16826c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r$b */
    static final class b extends AbstractC6290t.b.a {

        /* renamed from: a */
        private Long f16827a;

        /* renamed from: b */
        private Long f16828b;

        /* renamed from: c */
        private Set<AbstractC6290t.c> f16829c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t.b.a
        /* renamed from: a */
        public AbstractC6290t.b mo13548a() {
            Long l = this.f16827a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " delta";
            }
            if (this.f16828b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f16829c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C6288r(this.f16827a.longValue(), this.f16828b.longValue(), this.f16829c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t.b.a
        /* renamed from: b */
        public AbstractC6290t.b.a mo13549b(long j2) {
            this.f16827a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t.b.a
        /* renamed from: c */
        public AbstractC6290t.b.a mo13550c(Set<AbstractC6290t.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f16829c = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t.b.a
        /* renamed from: d */
        public AbstractC6290t.b.a mo13551d(long j2) {
            this.f16828b = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t.b
    /* renamed from: b */
    long mo13545b() {
        return this.f16824a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t.b
    /* renamed from: c */
    Set<AbstractC6290t.c> mo13546c() {
        return this.f16826c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t.b
    /* renamed from: d */
    long mo13547d() {
        return this.f16825b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6290t.b)) {
            return false;
        }
        AbstractC6290t.b bVar = (AbstractC6290t.b) obj;
        return this.f16824a == bVar.mo13545b() && this.f16825b == bVar.mo13547d() && this.f16826c.equals(bVar.mo13546c());
    }

    public int hashCode() {
        long j2 = this.f16824a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        long j3 = this.f16825b;
        return this.f16826c.hashCode() ^ ((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f16824a + ", maxAllowedDelay=" + this.f16825b + ", flags=" + this.f16826c + "}";
    }

    private C6288r(long j2, long j3, Set<AbstractC6290t.c> set) {
        this.f16824a = j2;
        this.f16825b = j3;
        this.f16826c = set;
    }
}
