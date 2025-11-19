package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* renamed from: T8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1717d extends F.a.AbstractC0235a {

    /* renamed from: a, reason: collision with root package name */
    private final String f16451a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16452b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16453c;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    /* renamed from: T8.d$b */
    static final class b extends F.a.AbstractC0235a.AbstractC0236a {

        /* renamed from: a, reason: collision with root package name */
        private String f16454a;

        /* renamed from: b, reason: collision with root package name */
        private String f16455b;

        /* renamed from: c, reason: collision with root package name */
        private String f16456c;

        b() {
        }

        @Override // T8.F.a.AbstractC0235a.AbstractC0236a
        public F.a.AbstractC0235a a() {
            String str;
            String str2;
            String str3 = this.f16454a;
            if (str3 != null && (str = this.f16455b) != null && (str2 = this.f16456c) != null) {
                return new C1717d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16454a == null) {
                sb2.append(" arch");
            }
            if (this.f16455b == null) {
                sb2.append(" libraryName");
            }
            if (this.f16456c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.a.AbstractC0235a.AbstractC0236a
        public F.a.AbstractC0235a.AbstractC0236a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f16454a = str;
            return this;
        }

        @Override // T8.F.a.AbstractC0235a.AbstractC0236a
        public F.a.AbstractC0235a.AbstractC0236a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f16456c = str;
            return this;
        }

        @Override // T8.F.a.AbstractC0235a.AbstractC0236a
        public F.a.AbstractC0235a.AbstractC0236a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f16455b = str;
            return this;
        }
    }

    @Override // T8.F.a.AbstractC0235a
    public String b() {
        return this.f16451a;
    }

    @Override // T8.F.a.AbstractC0235a
    public String c() {
        return this.f16453c;
    }

    @Override // T8.F.a.AbstractC0235a
    public String d() {
        return this.f16452b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a.AbstractC0235a)) {
            return false;
        }
        F.a.AbstractC0235a abstractC0235a = (F.a.AbstractC0235a) obj;
        return this.f16451a.equals(abstractC0235a.b()) && this.f16452b.equals(abstractC0235a.d()) && this.f16453c.equals(abstractC0235a.c());
    }

    public int hashCode() {
        return ((((this.f16451a.hashCode() ^ 1000003) * 1000003) ^ this.f16452b.hashCode()) * 1000003) ^ this.f16453c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f16451a + ", libraryName=" + this.f16452b + ", buildId=" + this.f16453c + "}";
    }

    private C1717d(String str, String str2, String str3) {
        this.f16451a = str;
        this.f16452b = str2;
        this.f16453c = str3;
    }
}
