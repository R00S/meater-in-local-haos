package M6;

import M6.o;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes2.dex */
final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    private final p f12067a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12068b;

    /* renamed from: c, reason: collision with root package name */
    private final K6.d<?> f12069c;

    /* renamed from: d, reason: collision with root package name */
    private final K6.h<?, byte[]> f12070d;

    /* renamed from: e, reason: collision with root package name */
    private final K6.c f12071e;

    /* compiled from: AutoValue_SendRequest.java */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private p f12072a;

        /* renamed from: b, reason: collision with root package name */
        private String f12073b;

        /* renamed from: c, reason: collision with root package name */
        private K6.d<?> f12074c;

        /* renamed from: d, reason: collision with root package name */
        private K6.h<?, byte[]> f12075d;

        /* renamed from: e, reason: collision with root package name */
        private K6.c f12076e;

        b() {
        }

        @Override // M6.o.a
        public o a() {
            String str = "";
            if (this.f12072a == null) {
                str = " transportContext";
            }
            if (this.f12073b == null) {
                str = str + " transportName";
            }
            if (this.f12074c == null) {
                str = str + " event";
            }
            if (this.f12075d == null) {
                str = str + " transformer";
            }
            if (this.f12076e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f12072a, this.f12073b, this.f12074c, this.f12075d, this.f12076e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // M6.o.a
        o.a b(K6.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f12076e = cVar;
            return this;
        }

        @Override // M6.o.a
        o.a c(K6.d<?> dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f12074c = dVar;
            return this;
        }

        @Override // M6.o.a
        o.a d(K6.h<?, byte[]> hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f12075d = hVar;
            return this;
        }

        @Override // M6.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f12072a = pVar;
            return this;
        }

        @Override // M6.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f12073b = str;
            return this;
        }
    }

    @Override // M6.o
    public K6.c b() {
        return this.f12071e;
    }

    @Override // M6.o
    K6.d<?> c() {
        return this.f12069c;
    }

    @Override // M6.o
    K6.h<?, byte[]> e() {
        return this.f12070d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f12067a.equals(oVar.f()) && this.f12068b.equals(oVar.g()) && this.f12069c.equals(oVar.c()) && this.f12070d.equals(oVar.e()) && this.f12071e.equals(oVar.b());
    }

    @Override // M6.o
    public p f() {
        return this.f12067a;
    }

    @Override // M6.o
    public String g() {
        return this.f12068b;
    }

    public int hashCode() {
        return ((((((((this.f12067a.hashCode() ^ 1000003) * 1000003) ^ this.f12068b.hashCode()) * 1000003) ^ this.f12069c.hashCode()) * 1000003) ^ this.f12070d.hashCode()) * 1000003) ^ this.f12071e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f12067a + ", transportName=" + this.f12068b + ", event=" + this.f12069c + ", transformer=" + this.f12070d + ", encoding=" + this.f12071e + "}";
    }

    private c(p pVar, String str, K6.d<?> dVar, K6.h<?, byte[]> hVar, K6.c cVar) {
        this.f12067a = pVar;
        this.f12068b = str;
        this.f12069c = dVar;
        this.f12070d = hVar;
        this.f12071e = cVar;
    }
}
