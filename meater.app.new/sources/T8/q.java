package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes2.dex */
final class q extends F.e.d.a.b.AbstractC0243d {

    /* renamed from: a, reason: collision with root package name */
    private final String f16586a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16587b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16588c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    static final class b extends F.e.d.a.b.AbstractC0243d.AbstractC0244a {

        /* renamed from: a, reason: collision with root package name */
        private String f16589a;

        /* renamed from: b, reason: collision with root package name */
        private String f16590b;

        /* renamed from: c, reason: collision with root package name */
        private long f16591c;

        /* renamed from: d, reason: collision with root package name */
        private byte f16592d;

        b() {
        }

        @Override // T8.F.e.d.a.b.AbstractC0243d.AbstractC0244a
        public F.e.d.a.b.AbstractC0243d a() {
            String str;
            String str2;
            if (this.f16592d == 1 && (str = this.f16589a) != null && (str2 = this.f16590b) != null) {
                return new q(str, str2, this.f16591c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16589a == null) {
                sb2.append(" name");
            }
            if (this.f16590b == null) {
                sb2.append(" code");
            }
            if ((1 & this.f16592d) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.a.b.AbstractC0243d.AbstractC0244a
        public F.e.d.a.b.AbstractC0243d.AbstractC0244a b(long j10) {
            this.f16591c = j10;
            this.f16592d = (byte) (this.f16592d | 1);
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0243d.AbstractC0244a
        public F.e.d.a.b.AbstractC0243d.AbstractC0244a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f16590b = str;
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0243d.AbstractC0244a
        public F.e.d.a.b.AbstractC0243d.AbstractC0244a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f16589a = str;
            return this;
        }
    }

    @Override // T8.F.e.d.a.b.AbstractC0243d
    public long b() {
        return this.f16588c;
    }

    @Override // T8.F.e.d.a.b.AbstractC0243d
    public String c() {
        return this.f16587b;
    }

    @Override // T8.F.e.d.a.b.AbstractC0243d
    public String d() {
        return this.f16586a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0243d)) {
            return false;
        }
        F.e.d.a.b.AbstractC0243d abstractC0243d = (F.e.d.a.b.AbstractC0243d) obj;
        return this.f16586a.equals(abstractC0243d.d()) && this.f16587b.equals(abstractC0243d.c()) && this.f16588c == abstractC0243d.b();
    }

    public int hashCode() {
        int iHashCode = (((this.f16586a.hashCode() ^ 1000003) * 1000003) ^ this.f16587b.hashCode()) * 1000003;
        long j10 = this.f16588c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f16586a + ", code=" + this.f16587b + ", address=" + this.f16588c + "}";
    }

    private q(String str, String str2, long j10) {
        this.f16586a = str;
        this.f16587b = str2;
        this.f16588c = j10;
    }
}
