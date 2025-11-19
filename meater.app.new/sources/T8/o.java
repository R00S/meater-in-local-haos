package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes2.dex */
final class o extends F.e.d.a.b.AbstractC0239a {

    /* renamed from: a, reason: collision with root package name */
    private final long f16566a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16567b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16568c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16569d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    static final class b extends F.e.d.a.b.AbstractC0239a.AbstractC0240a {

        /* renamed from: a, reason: collision with root package name */
        private long f16570a;

        /* renamed from: b, reason: collision with root package name */
        private long f16571b;

        /* renamed from: c, reason: collision with root package name */
        private String f16572c;

        /* renamed from: d, reason: collision with root package name */
        private String f16573d;

        /* renamed from: e, reason: collision with root package name */
        private byte f16574e;

        b() {
        }

        @Override // T8.F.e.d.a.b.AbstractC0239a.AbstractC0240a
        public F.e.d.a.b.AbstractC0239a a() {
            String str;
            if (this.f16574e == 3 && (str = this.f16572c) != null) {
                return new o(this.f16570a, this.f16571b, str, this.f16573d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f16574e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f16574e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f16572c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.a.b.AbstractC0239a.AbstractC0240a
        public F.e.d.a.b.AbstractC0239a.AbstractC0240a b(long j10) {
            this.f16570a = j10;
            this.f16574e = (byte) (this.f16574e | 1);
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0239a.AbstractC0240a
        public F.e.d.a.b.AbstractC0239a.AbstractC0240a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f16572c = str;
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0239a.AbstractC0240a
        public F.e.d.a.b.AbstractC0239a.AbstractC0240a d(long j10) {
            this.f16571b = j10;
            this.f16574e = (byte) (this.f16574e | 2);
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0239a.AbstractC0240a
        public F.e.d.a.b.AbstractC0239a.AbstractC0240a e(String str) {
            this.f16573d = str;
            return this;
        }
    }

    @Override // T8.F.e.d.a.b.AbstractC0239a
    public long b() {
        return this.f16566a;
    }

    @Override // T8.F.e.d.a.b.AbstractC0239a
    public String c() {
        return this.f16568c;
    }

    @Override // T8.F.e.d.a.b.AbstractC0239a
    public long d() {
        return this.f16567b;
    }

    @Override // T8.F.e.d.a.b.AbstractC0239a
    public String e() {
        return this.f16569d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0239a)) {
            return false;
        }
        F.e.d.a.b.AbstractC0239a abstractC0239a = (F.e.d.a.b.AbstractC0239a) obj;
        if (this.f16566a == abstractC0239a.b() && this.f16567b == abstractC0239a.d() && this.f16568c.equals(abstractC0239a.c())) {
            String str = this.f16569d;
            if (str == null) {
                if (abstractC0239a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0239a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f16566a;
        long j11 = this.f16567b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f16568c.hashCode()) * 1000003;
        String str = this.f16569d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f16566a + ", size=" + this.f16567b + ", name=" + this.f16568c + ", uuid=" + this.f16569d + "}";
    }

    private o(long j10, long j11, String str, String str2) {
        this.f16566a = j10;
        this.f16567b = j11;
        this.f16568c = str;
        this.f16569d = str2;
    }
}
