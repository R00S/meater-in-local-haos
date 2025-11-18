package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes2.dex */
final class A extends F.e.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f16236a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    static final class b extends F.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16237a;

        b() {
        }

        @Override // T8.F.e.f.a
        public F.e.f a() {
            String str = this.f16237a;
            if (str != null) {
                return new A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // T8.F.e.f.a
        public F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f16237a = str;
            return this;
        }
    }

    @Override // T8.F.e.f
    public String b() {
        return this.f16236a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.f16236a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16236a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f16236a + "}";
    }

    private A(String str) {
        this.f16236a = str;
    }
}
