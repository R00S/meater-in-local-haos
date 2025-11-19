package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* renamed from: T8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1715b extends F {

    /* renamed from: b, reason: collision with root package name */
    private final String f16407b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16408c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16409d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16410e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16411f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16412g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16413h;

    /* renamed from: i, reason: collision with root package name */
    private final String f16414i;

    /* renamed from: j, reason: collision with root package name */
    private final String f16415j;

    /* renamed from: k, reason: collision with root package name */
    private final F.e f16416k;

    /* renamed from: l, reason: collision with root package name */
    private final F.d f16417l;

    /* renamed from: m, reason: collision with root package name */
    private final F.a f16418m;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: T8.b$b, reason: collision with other inner class name */
    static final class C0254b extends F.b {

        /* renamed from: a, reason: collision with root package name */
        private String f16419a;

        /* renamed from: b, reason: collision with root package name */
        private String f16420b;

        /* renamed from: c, reason: collision with root package name */
        private int f16421c;

        /* renamed from: d, reason: collision with root package name */
        private String f16422d;

        /* renamed from: e, reason: collision with root package name */
        private String f16423e;

        /* renamed from: f, reason: collision with root package name */
        private String f16424f;

        /* renamed from: g, reason: collision with root package name */
        private String f16425g;

        /* renamed from: h, reason: collision with root package name */
        private String f16426h;

        /* renamed from: i, reason: collision with root package name */
        private String f16427i;

        /* renamed from: j, reason: collision with root package name */
        private F.e f16428j;

        /* renamed from: k, reason: collision with root package name */
        private F.d f16429k;

        /* renamed from: l, reason: collision with root package name */
        private F.a f16430l;

        /* renamed from: m, reason: collision with root package name */
        private byte f16431m;

        @Override // T8.F.b
        public F a() {
            if (this.f16431m == 1 && this.f16419a != null && this.f16420b != null && this.f16422d != null && this.f16426h != null && this.f16427i != null) {
                return new C1715b(this.f16419a, this.f16420b, this.f16421c, this.f16422d, this.f16423e, this.f16424f, this.f16425g, this.f16426h, this.f16427i, this.f16428j, this.f16429k, this.f16430l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16419a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f16420b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f16431m) == 0) {
                sb2.append(" platform");
            }
            if (this.f16422d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f16426h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f16427i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.b
        public F.b b(F.a aVar) {
            this.f16430l = aVar;
            return this;
        }

        @Override // T8.F.b
        public F.b c(String str) {
            this.f16425g = str;
            return this;
        }

        @Override // T8.F.b
        public F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f16426h = str;
            return this;
        }

        @Override // T8.F.b
        public F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f16427i = str;
            return this;
        }

        @Override // T8.F.b
        public F.b f(String str) {
            this.f16424f = str;
            return this;
        }

        @Override // T8.F.b
        public F.b g(String str) {
            this.f16423e = str;
            return this;
        }

        @Override // T8.F.b
        public F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f16420b = str;
            return this;
        }

        @Override // T8.F.b
        public F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f16422d = str;
            return this;
        }

        @Override // T8.F.b
        public F.b j(F.d dVar) {
            this.f16429k = dVar;
            return this;
        }

        @Override // T8.F.b
        public F.b k(int i10) {
            this.f16421c = i10;
            this.f16431m = (byte) (this.f16431m | 1);
            return this;
        }

        @Override // T8.F.b
        public F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f16419a = str;
            return this;
        }

        @Override // T8.F.b
        public F.b m(F.e eVar) {
            this.f16428j = eVar;
            return this;
        }

        C0254b() {
        }

        private C0254b(F f10) {
            this.f16419a = f10.m();
            this.f16420b = f10.i();
            this.f16421c = f10.l();
            this.f16422d = f10.j();
            this.f16423e = f10.h();
            this.f16424f = f10.g();
            this.f16425g = f10.d();
            this.f16426h = f10.e();
            this.f16427i = f10.f();
            this.f16428j = f10.n();
            this.f16429k = f10.k();
            this.f16430l = f10.c();
            this.f16431m = (byte) 1;
        }
    }

    @Override // T8.F
    public F.a c() {
        return this.f16418m;
    }

    @Override // T8.F
    public String d() {
        return this.f16413h;
    }

    @Override // T8.F
    public String e() {
        return this.f16414i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (this.f16407b.equals(f10.m()) && this.f16408c.equals(f10.i()) && this.f16409d == f10.l() && this.f16410e.equals(f10.j()) && ((str = this.f16411f) != null ? str.equals(f10.h()) : f10.h() == null) && ((str2 = this.f16412g) != null ? str2.equals(f10.g()) : f10.g() == null) && ((str3 = this.f16413h) != null ? str3.equals(f10.d()) : f10.d() == null) && this.f16414i.equals(f10.e()) && this.f16415j.equals(f10.f()) && ((eVar = this.f16416k) != null ? eVar.equals(f10.n()) : f10.n() == null) && ((dVar = this.f16417l) != null ? dVar.equals(f10.k()) : f10.k() == null)) {
            F.a aVar = this.f16418m;
            if (aVar == null) {
                if (f10.c() == null) {
                    return true;
                }
            } else if (aVar.equals(f10.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // T8.F
    public String f() {
        return this.f16415j;
    }

    @Override // T8.F
    public String g() {
        return this.f16412g;
    }

    @Override // T8.F
    public String h() {
        return this.f16411f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f16407b.hashCode() ^ 1000003) * 1000003) ^ this.f16408c.hashCode()) * 1000003) ^ this.f16409d) * 1000003) ^ this.f16410e.hashCode()) * 1000003;
        String str = this.f16411f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f16412g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16413h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f16414i.hashCode()) * 1000003) ^ this.f16415j.hashCode()) * 1000003;
        F.e eVar = this.f16416k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.d dVar = this.f16417l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.a aVar = this.f16418m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // T8.F
    public String i() {
        return this.f16408c;
    }

    @Override // T8.F
    public String j() {
        return this.f16410e;
    }

    @Override // T8.F
    public F.d k() {
        return this.f16417l;
    }

    @Override // T8.F
    public int l() {
        return this.f16409d;
    }

    @Override // T8.F
    public String m() {
        return this.f16407b;
    }

    @Override // T8.F
    public F.e n() {
        return this.f16416k;
    }

    @Override // T8.F
    protected F.b o() {
        return new C0254b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f16407b + ", gmpAppId=" + this.f16408c + ", platform=" + this.f16409d + ", installationUuid=" + this.f16410e + ", firebaseInstallationId=" + this.f16411f + ", firebaseAuthenticationToken=" + this.f16412g + ", appQualitySessionId=" + this.f16413h + ", buildVersion=" + this.f16414i + ", displayVersion=" + this.f16415j + ", session=" + this.f16416k + ", ndkPayload=" + this.f16417l + ", appExitInfo=" + this.f16418m + "}";
    }

    private C1715b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f16407b = str;
        this.f16408c = str2;
        this.f16409d = i10;
        this.f16410e = str3;
        this.f16411f = str4;
        this.f16412g = str5;
        this.f16413h = str6;
        this.f16414i = str7;
        this.f16415j = str8;
        this.f16416k = eVar;
        this.f16417l = dVar;
        this.f16418m = aVar;
    }
}
