package L6;

import L6.o;

/* compiled from: AutoValue_ClientInfo.java */
/* loaded from: classes2.dex */
final class e extends o {

    /* renamed from: a, reason: collision with root package name */
    private final o.b f10926a;

    /* renamed from: b, reason: collision with root package name */
    private final L6.a f10927b;

    /* compiled from: AutoValue_ClientInfo.java */
    static final class b extends o.a {

        /* renamed from: a, reason: collision with root package name */
        private o.b f10928a;

        /* renamed from: b, reason: collision with root package name */
        private L6.a f10929b;

        b() {
        }

        @Override // L6.o.a
        public o a() {
            return new e(this.f10928a, this.f10929b);
        }

        @Override // L6.o.a
        public o.a b(L6.a aVar) {
            this.f10929b = aVar;
            return this;
        }

        @Override // L6.o.a
        public o.a c(o.b bVar) {
            this.f10928a = bVar;
            return this;
        }
    }

    @Override // L6.o
    public L6.a b() {
        return this.f10927b;
    }

    @Override // L6.o
    public o.b c() {
        return this.f10926a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f10926a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            L6.a aVar = this.f10927b;
            if (aVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f10926a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        L6.a aVar = this.f10927b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f10926a + ", androidClientInfo=" + this.f10927b + "}";
    }

    private e(o.b bVar, L6.a aVar) {
        this.f10926a = bVar;
        this.f10927b = aVar;
    }
}
