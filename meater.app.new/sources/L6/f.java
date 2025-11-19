package L6;

import L6.p;

/* compiled from: AutoValue_ComplianceData.java */
/* loaded from: classes2.dex */
final class f extends p {

    /* renamed from: a, reason: collision with root package name */
    private final s f10930a;

    /* renamed from: b, reason: collision with root package name */
    private final p.b f10931b;

    /* compiled from: AutoValue_ComplianceData.java */
    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private s f10932a;

        /* renamed from: b, reason: collision with root package name */
        private p.b f10933b;

        b() {
        }

        @Override // L6.p.a
        public p a() {
            return new f(this.f10932a, this.f10933b);
        }

        @Override // L6.p.a
        public p.a b(s sVar) {
            this.f10932a = sVar;
            return this;
        }

        @Override // L6.p.a
        public p.a c(p.b bVar) {
            this.f10933b = bVar;
            return this;
        }
    }

    @Override // L6.p
    public s b() {
        return this.f10930a;
    }

    @Override // L6.p
    public p.b c() {
        return this.f10931b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        s sVar = this.f10930a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            p.b bVar = this.f10931b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f10930a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f10931b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f10930a + ", productIdOrigin=" + this.f10931b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.f10930a = sVar;
        this.f10931b = bVar;
    }
}
