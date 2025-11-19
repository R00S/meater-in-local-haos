package L6;

import L6.w;

/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* loaded from: classes2.dex */
final class m extends w {

    /* renamed from: a, reason: collision with root package name */
    private final w.c f10975a;

    /* renamed from: b, reason: collision with root package name */
    private final w.b f10976b;

    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    static final class b extends w.a {

        /* renamed from: a, reason: collision with root package name */
        private w.c f10977a;

        /* renamed from: b, reason: collision with root package name */
        private w.b f10978b;

        b() {
        }

        @Override // L6.w.a
        public w a() {
            return new m(this.f10977a, this.f10978b);
        }

        @Override // L6.w.a
        public w.a b(w.b bVar) {
            this.f10978b = bVar;
            return this;
        }

        @Override // L6.w.a
        public w.a c(w.c cVar) {
            this.f10977a = cVar;
            return this;
        }
    }

    @Override // L6.w
    public w.b b() {
        return this.f10976b;
    }

    @Override // L6.w
    public w.c c() {
        return this.f10975a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        w.c cVar = this.f10975a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            w.b bVar = this.f10976b;
            if (bVar == null) {
                if (wVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f10975a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f10976b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f10975a + ", mobileSubtype=" + this.f10976b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.f10975a = cVar;
        this.f10976b = bVar;
    }
}
