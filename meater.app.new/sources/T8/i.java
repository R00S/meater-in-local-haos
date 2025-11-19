package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes2.dex */
final class i extends F.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f16494a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16495b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16496c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.a.b f16497d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16498e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16499f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16500g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    static final class b extends F.e.a.AbstractC0237a {

        /* renamed from: a, reason: collision with root package name */
        private String f16501a;

        /* renamed from: b, reason: collision with root package name */
        private String f16502b;

        /* renamed from: c, reason: collision with root package name */
        private String f16503c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.a.b f16504d;

        /* renamed from: e, reason: collision with root package name */
        private String f16505e;

        /* renamed from: f, reason: collision with root package name */
        private String f16506f;

        /* renamed from: g, reason: collision with root package name */
        private String f16507g;

        b() {
        }

        @Override // T8.F.e.a.AbstractC0237a
        public F.e.a a() {
            String str;
            String str2 = this.f16501a;
            if (str2 != null && (str = this.f16502b) != null) {
                return new i(str2, str, this.f16503c, this.f16504d, this.f16505e, this.f16506f, this.f16507g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16501a == null) {
                sb2.append(" identifier");
            }
            if (this.f16502b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.a.AbstractC0237a
        public F.e.a.AbstractC0237a b(String str) {
            this.f16506f = str;
            return this;
        }

        @Override // T8.F.e.a.AbstractC0237a
        public F.e.a.AbstractC0237a c(String str) {
            this.f16507g = str;
            return this;
        }

        @Override // T8.F.e.a.AbstractC0237a
        public F.e.a.AbstractC0237a d(String str) {
            this.f16503c = str;
            return this;
        }

        @Override // T8.F.e.a.AbstractC0237a
        public F.e.a.AbstractC0237a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f16501a = str;
            return this;
        }

        @Override // T8.F.e.a.AbstractC0237a
        public F.e.a.AbstractC0237a f(String str) {
            this.f16505e = str;
            return this;
        }

        @Override // T8.F.e.a.AbstractC0237a
        public F.e.a.AbstractC0237a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f16502b = str;
            return this;
        }
    }

    @Override // T8.F.e.a
    public String b() {
        return this.f16499f;
    }

    @Override // T8.F.e.a
    public String c() {
        return this.f16500g;
    }

    @Override // T8.F.e.a
    public String d() {
        return this.f16496c;
    }

    @Override // T8.F.e.a
    public String e() {
        return this.f16494a;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.a)) {
            return false;
        }
        F.e.a aVar = (F.e.a) obj;
        if (this.f16494a.equals(aVar.e()) && this.f16495b.equals(aVar.h()) && ((str = this.f16496c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f16497d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f16498e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f16499f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f16500g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // T8.F.e.a
    public String f() {
        return this.f16498e;
    }

    @Override // T8.F.e.a
    public F.e.a.b g() {
        return this.f16497d;
    }

    @Override // T8.F.e.a
    public String h() {
        return this.f16495b;
    }

    public int hashCode() {
        int iHashCode = (((this.f16494a.hashCode() ^ 1000003) * 1000003) ^ this.f16495b.hashCode()) * 1000003;
        String str = this.f16496c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        F.e.a.b bVar = this.f16497d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f16498e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16499f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f16500g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f16494a + ", version=" + this.f16495b + ", displayVersion=" + this.f16496c + ", organization=" + this.f16497d + ", installationUuid=" + this.f16498e + ", developmentPlatform=" + this.f16499f + ", developmentPlatformVersion=" + this.f16500g + "}";
    }

    private i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f16494a = str;
        this.f16495b = str2;
        this.f16496c = str3;
        this.f16497d = bVar;
        this.f16498e = str4;
        this.f16499f = str5;
        this.f16500g = str6;
    }
}
