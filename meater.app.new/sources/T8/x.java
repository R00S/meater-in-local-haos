package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* loaded from: classes2.dex */
final class x extends F.e.d.AbstractC0251e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f16644a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16645b;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
    static final class b extends F.e.d.AbstractC0251e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16646a;

        /* renamed from: b, reason: collision with root package name */
        private String f16647b;

        b() {
        }

        @Override // T8.F.e.d.AbstractC0251e.b.a
        public F.e.d.AbstractC0251e.b a() {
            String str;
            String str2 = this.f16646a;
            if (str2 != null && (str = this.f16647b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16646a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f16647b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.AbstractC0251e.b.a
        public F.e.d.AbstractC0251e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f16646a = str;
            return this;
        }

        @Override // T8.F.e.d.AbstractC0251e.b.a
        public F.e.d.AbstractC0251e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f16647b = str;
            return this;
        }
    }

    @Override // T8.F.e.d.AbstractC0251e.b
    public String b() {
        return this.f16644a;
    }

    @Override // T8.F.e.d.AbstractC0251e.b
    public String c() {
        return this.f16645b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.AbstractC0251e.b)) {
            return false;
        }
        F.e.d.AbstractC0251e.b bVar = (F.e.d.AbstractC0251e.b) obj;
        return this.f16644a.equals(bVar.b()) && this.f16645b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f16644a.hashCode() ^ 1000003) * 1000003) ^ this.f16645b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f16644a + ", variantId=" + this.f16645b + "}";
    }

    private x(String str, String str2) {
        this.f16644a = str;
        this.f16645b = str2;
    }
}
