package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes2.dex */
final class l extends F.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f16528a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16529b;

    /* renamed from: c, reason: collision with root package name */
    private final F.e.d.a f16530c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.c f16531d;

    /* renamed from: e, reason: collision with root package name */
    private final F.e.d.AbstractC0250d f16532e;

    /* renamed from: f, reason: collision with root package name */
    private final F.e.d.f f16533f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    static final class b extends F.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private long f16534a;

        /* renamed from: b, reason: collision with root package name */
        private String f16535b;

        /* renamed from: c, reason: collision with root package name */
        private F.e.d.a f16536c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.c f16537d;

        /* renamed from: e, reason: collision with root package name */
        private F.e.d.AbstractC0250d f16538e;

        /* renamed from: f, reason: collision with root package name */
        private F.e.d.f f16539f;

        /* renamed from: g, reason: collision with root package name */
        private byte f16540g;

        @Override // T8.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f16540g == 1 && (str = this.f16535b) != null && (aVar = this.f16536c) != null && (cVar = this.f16537d) != null) {
                return new l(this.f16534a, str, aVar, cVar, this.f16538e, this.f16539f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f16540g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f16535b == null) {
                sb2.append(" type");
            }
            if (this.f16536c == null) {
                sb2.append(" app");
            }
            if (this.f16537d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f16536c = aVar;
            return this;
        }

        @Override // T8.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f16537d = cVar;
            return this;
        }

        @Override // T8.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0250d abstractC0250d) {
            this.f16538e = abstractC0250d;
            return this;
        }

        @Override // T8.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f16539f = fVar;
            return this;
        }

        @Override // T8.F.e.d.b
        public F.e.d.b f(long j10) {
            this.f16534a = j10;
            this.f16540g = (byte) (this.f16540g | 1);
            return this;
        }

        @Override // T8.F.e.d.b
        public F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f16535b = str;
            return this;
        }

        b() {
        }

        private b(F.e.d dVar) {
            this.f16534a = dVar.f();
            this.f16535b = dVar.g();
            this.f16536c = dVar.b();
            this.f16537d = dVar.c();
            this.f16538e = dVar.d();
            this.f16539f = dVar.e();
            this.f16540g = (byte) 1;
        }
    }

    @Override // T8.F.e.d
    public F.e.d.a b() {
        return this.f16530c;
    }

    @Override // T8.F.e.d
    public F.e.d.c c() {
        return this.f16531d;
    }

    @Override // T8.F.e.d
    public F.e.d.AbstractC0250d d() {
        return this.f16532e;
    }

    @Override // T8.F.e.d
    public F.e.d.f e() {
        return this.f16533f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0250d abstractC0250d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d)) {
            return false;
        }
        F.e.d dVar = (F.e.d) obj;
        if (this.f16528a == dVar.f() && this.f16529b.equals(dVar.g()) && this.f16530c.equals(dVar.b()) && this.f16531d.equals(dVar.c()) && ((abstractC0250d = this.f16532e) != null ? abstractC0250d.equals(dVar.d()) : dVar.d() == null)) {
            F.e.d.f fVar = this.f16533f;
            if (fVar == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // T8.F.e.d
    public long f() {
        return this.f16528a;
    }

    @Override // T8.F.e.d
    public String g() {
        return this.f16529b;
    }

    @Override // T8.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f16528a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f16529b.hashCode()) * 1000003) ^ this.f16530c.hashCode()) * 1000003) ^ this.f16531d.hashCode()) * 1000003;
        F.e.d.AbstractC0250d abstractC0250d = this.f16532e;
        int iHashCode2 = (iHashCode ^ (abstractC0250d == null ? 0 : abstractC0250d.hashCode())) * 1000003;
        F.e.d.f fVar = this.f16533f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f16528a + ", type=" + this.f16529b + ", app=" + this.f16530c + ", device=" + this.f16531d + ", log=" + this.f16532e + ", rollouts=" + this.f16533f + "}";
    }

    private l(long j10, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0250d abstractC0250d, F.e.d.f fVar) {
        this.f16528a = j10;
        this.f16529b = str;
        this.f16530c = aVar;
        this.f16531d = cVar;
        this.f16532e = abstractC0250d;
        this.f16533f = fVar;
    }
}
