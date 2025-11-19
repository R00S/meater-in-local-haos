package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* loaded from: classes2.dex */
final class w extends F.e.d.AbstractC0251e {

    /* renamed from: a, reason: collision with root package name */
    private final F.e.d.AbstractC0251e.b f16635a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16636b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16637c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16638d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    static final class b extends F.e.d.AbstractC0251e.a {

        /* renamed from: a, reason: collision with root package name */
        private F.e.d.AbstractC0251e.b f16639a;

        /* renamed from: b, reason: collision with root package name */
        private String f16640b;

        /* renamed from: c, reason: collision with root package name */
        private String f16641c;

        /* renamed from: d, reason: collision with root package name */
        private long f16642d;

        /* renamed from: e, reason: collision with root package name */
        private byte f16643e;

        b() {
        }

        @Override // T8.F.e.d.AbstractC0251e.a
        public F.e.d.AbstractC0251e a() {
            F.e.d.AbstractC0251e.b bVar;
            String str;
            String str2;
            if (this.f16643e == 1 && (bVar = this.f16639a) != null && (str = this.f16640b) != null && (str2 = this.f16641c) != null) {
                return new w(bVar, str, str2, this.f16642d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16639a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f16640b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f16641c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f16643e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.AbstractC0251e.a
        public F.e.d.AbstractC0251e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f16640b = str;
            return this;
        }

        @Override // T8.F.e.d.AbstractC0251e.a
        public F.e.d.AbstractC0251e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f16641c = str;
            return this;
        }

        @Override // T8.F.e.d.AbstractC0251e.a
        public F.e.d.AbstractC0251e.a d(F.e.d.AbstractC0251e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f16639a = bVar;
            return this;
        }

        @Override // T8.F.e.d.AbstractC0251e.a
        public F.e.d.AbstractC0251e.a e(long j10) {
            this.f16642d = j10;
            this.f16643e = (byte) (this.f16643e | 1);
            return this;
        }
    }

    @Override // T8.F.e.d.AbstractC0251e
    public String b() {
        return this.f16636b;
    }

    @Override // T8.F.e.d.AbstractC0251e
    public String c() {
        return this.f16637c;
    }

    @Override // T8.F.e.d.AbstractC0251e
    public F.e.d.AbstractC0251e.b d() {
        return this.f16635a;
    }

    @Override // T8.F.e.d.AbstractC0251e
    public long e() {
        return this.f16638d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0251e)) {
            return false;
        }
        F.e.d.AbstractC0251e abstractC0251e = (F.e.d.AbstractC0251e) obj;
        return this.f16635a.equals(abstractC0251e.d()) && this.f16636b.equals(abstractC0251e.b()) && this.f16637c.equals(abstractC0251e.c()) && this.f16638d == abstractC0251e.e();
    }

    public int hashCode() {
        int iHashCode = (((((this.f16635a.hashCode() ^ 1000003) * 1000003) ^ this.f16636b.hashCode()) * 1000003) ^ this.f16637c.hashCode()) * 1000003;
        long j10 = this.f16638d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f16635a + ", parameterKey=" + this.f16636b + ", parameterValue=" + this.f16637c + ", templateVersion=" + this.f16638d + "}";
    }

    private w(F.e.d.AbstractC0251e.b bVar, String str, String str2, long j10) {
        this.f16635a = bVar;
        this.f16636b = str;
        this.f16637c = str2;
        this.f16638d = j10;
    }
}
