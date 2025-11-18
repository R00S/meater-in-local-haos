package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes2.dex */
final class s extends F.e.d.a.b.AbstractC0245e.AbstractC0247b {

    /* renamed from: a, reason: collision with root package name */
    private final long f16600a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16601b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16602c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16603d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16604e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    static final class b extends F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a {

        /* renamed from: a, reason: collision with root package name */
        private long f16605a;

        /* renamed from: b, reason: collision with root package name */
        private String f16606b;

        /* renamed from: c, reason: collision with root package name */
        private String f16607c;

        /* renamed from: d, reason: collision with root package name */
        private long f16608d;

        /* renamed from: e, reason: collision with root package name */
        private int f16609e;

        /* renamed from: f, reason: collision with root package name */
        private byte f16610f;

        b() {
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a
        public F.e.d.a.b.AbstractC0245e.AbstractC0247b a() {
            String str;
            if (this.f16610f == 7 && (str = this.f16606b) != null) {
                return new s(this.f16605a, str, this.f16607c, this.f16608d, this.f16609e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f16610f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f16606b == null) {
                sb2.append(" symbol");
            }
            if ((this.f16610f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f16610f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a
        public F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a b(String str) {
            this.f16607c = str;
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a
        public F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a c(int i10) {
            this.f16609e = i10;
            this.f16610f = (byte) (this.f16610f | 4);
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a
        public F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a d(long j10) {
            this.f16608d = j10;
            this.f16610f = (byte) (this.f16610f | 2);
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a
        public F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a e(long j10) {
            this.f16605a = j10;
            this.f16610f = (byte) (this.f16610f | 1);
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a
        public F.e.d.a.b.AbstractC0245e.AbstractC0247b.AbstractC0248a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f16606b = str;
            return this;
        }
    }

    @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b
    public String b() {
        return this.f16602c;
    }

    @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b
    public int c() {
        return this.f16604e;
    }

    @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b
    public long d() {
        return this.f16603d;
    }

    @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b
    public long e() {
        return this.f16600a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0245e.AbstractC0247b)) {
            return false;
        }
        F.e.d.a.b.AbstractC0245e.AbstractC0247b abstractC0247b = (F.e.d.a.b.AbstractC0245e.AbstractC0247b) obj;
        return this.f16600a == abstractC0247b.e() && this.f16601b.equals(abstractC0247b.f()) && ((str = this.f16602c) != null ? str.equals(abstractC0247b.b()) : abstractC0247b.b() == null) && this.f16603d == abstractC0247b.d() && this.f16604e == abstractC0247b.c();
    }

    @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0247b
    public String f() {
        return this.f16601b;
    }

    public int hashCode() {
        long j10 = this.f16600a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f16601b.hashCode()) * 1000003;
        String str = this.f16602c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f16603d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f16604e;
    }

    public String toString() {
        return "Frame{pc=" + this.f16600a + ", symbol=" + this.f16601b + ", file=" + this.f16602c + ", offset=" + this.f16603d + ", importance=" + this.f16604e + "}";
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f16600a = j10;
        this.f16601b = str;
        this.f16602c = str2;
        this.f16603d = j11;
        this.f16604e = i10;
    }
}
