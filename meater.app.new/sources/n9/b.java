package n9;

import n9.f;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes2.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f45747a;

    /* renamed from: b, reason: collision with root package name */
    private final long f45748b;

    /* renamed from: c, reason: collision with root package name */
    private final f.b f45749c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: n9.b$b, reason: collision with other inner class name */
    static final class C0623b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f45750a;

        /* renamed from: b, reason: collision with root package name */
        private Long f45751b;

        /* renamed from: c, reason: collision with root package name */
        private f.b f45752c;

        C0623b() {
        }

        @Override // n9.f.a
        public f a() {
            String str = "";
            if (this.f45751b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f45750a, this.f45751b.longValue(), this.f45752c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n9.f.a
        public f.a b(f.b bVar) {
            this.f45752c = bVar;
            return this;
        }

        @Override // n9.f.a
        public f.a c(String str) {
            this.f45750a = str;
            return this;
        }

        @Override // n9.f.a
        public f.a d(long j10) {
            this.f45751b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // n9.f
    public f.b b() {
        return this.f45749c;
    }

    @Override // n9.f
    public String c() {
        return this.f45747a;
    }

    @Override // n9.f
    public long d() {
        return this.f45748b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f45747a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f45748b == fVar.d()) {
                f.b bVar = this.f45749c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f45747a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f45748b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f45749c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f45747a + ", tokenExpirationTimestamp=" + this.f45748b + ", responseCode=" + this.f45749c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f45747a = str;
        this.f45748b = j10;
        this.f45749c = bVar;
    }
}
