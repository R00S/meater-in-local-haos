package L6;

import L6.s;

/* compiled from: AutoValue_ExternalPrivacyContext.java */
/* loaded from: classes2.dex */
final class i extends s {

    /* renamed from: a, reason: collision with root package name */
    private final r f10940a;

    /* compiled from: AutoValue_ExternalPrivacyContext.java */
    static final class b extends s.a {

        /* renamed from: a, reason: collision with root package name */
        private r f10941a;

        b() {
        }

        @Override // L6.s.a
        public s a() {
            return new i(this.f10941a);
        }

        @Override // L6.s.a
        public s.a b(r rVar) {
            this.f10941a = rVar;
            return this;
        }
    }

    @Override // L6.s
    public r b() {
        return this.f10940a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f10940a;
        r rVarB = ((s) obj).b();
        return rVar == null ? rVarB == null : rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f10940a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f10940a + "}";
    }

    private i(r rVar) {
        this.f10940a = rVar;
    }
}
