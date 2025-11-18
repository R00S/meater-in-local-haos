package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* renamed from: com.google.firebase.crashlytics.h.p.b */
/* loaded from: classes2.dex */
final class C8249b extends AbstractC8258f0 {

    /* renamed from: b */
    private final String f31272b;

    /* renamed from: c */
    private final String f31273c;

    /* renamed from: d */
    private final int f31274d;

    /* renamed from: e */
    private final String f31275e;

    /* renamed from: f */
    private final String f31276f;

    /* renamed from: g */
    private final String f31277g;

    /* renamed from: h */
    private final String f31278h;

    /* renamed from: i */
    private final String f31279i;

    /* renamed from: j */
    private final AbstractC8258f0.e f31280j;

    /* renamed from: k */
    private final AbstractC8258f0.d f31281k;

    /* renamed from: l */
    private final AbstractC8258f0.a f31282l;

    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.b$b */
    static final class b extends AbstractC8258f0.b {

        /* renamed from: a */
        private String f31283a;

        /* renamed from: b */
        private String f31284b;

        /* renamed from: c */
        private Integer f31285c;

        /* renamed from: d */
        private String f31286d;

        /* renamed from: e */
        private String f31287e;

        /* renamed from: f */
        private String f31288f;

        /* renamed from: g */
        private String f31289g;

        /* renamed from: h */
        private String f31290h;

        /* renamed from: i */
        private AbstractC8258f0.e f31291i;

        /* renamed from: j */
        private AbstractC8258f0.d f31292j;

        /* renamed from: k */
        private AbstractC8258f0.a f31293k;

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: a */
        public AbstractC8258f0 mo25594a() {
            String str = this.f31283a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " sdkVersion";
            }
            if (this.f31284b == null) {
                str2 = str2 + " gmpAppId";
            }
            if (this.f31285c == null) {
                str2 = str2 + " platform";
            }
            if (this.f31286d == null) {
                str2 = str2 + " installationUuid";
            }
            if (this.f31289g == null) {
                str2 = str2 + " buildVersion";
            }
            if (this.f31290h == null) {
                str2 = str2 + " displayVersion";
            }
            if (str2.isEmpty()) {
                return new C8249b(this.f31283a, this.f31284b, this.f31285c.intValue(), this.f31286d, this.f31287e, this.f31288f, this.f31289g, this.f31290h, this.f31291i, this.f31292j, this.f31293k);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: b */
        public AbstractC8258f0.b mo25595b(AbstractC8258f0.a aVar) {
            this.f31293k = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: c */
        public AbstractC8258f0.b mo25596c(String str) {
            this.f31288f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: d */
        public AbstractC8258f0.b mo25597d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f31289g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: e */
        public AbstractC8258f0.b mo25598e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f31290h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: f */
        public AbstractC8258f0.b mo25599f(String str) {
            this.f31287e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: g */
        public AbstractC8258f0.b mo25600g(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f31284b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: h */
        public AbstractC8258f0.b mo25601h(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f31286d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: i */
        public AbstractC8258f0.b mo25602i(AbstractC8258f0.d dVar) {
            this.f31292j = dVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: j */
        public AbstractC8258f0.b mo25603j(int i2) {
            this.f31285c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: k */
        public AbstractC8258f0.b mo25604k(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f31283a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.b
        /* renamed from: l */
        public AbstractC8258f0.b mo25605l(AbstractC8258f0.e eVar) {
            this.f31291i = eVar;
            return this;
        }

        b() {
        }

        private b(AbstractC8258f0 abstractC8258f0) {
            this.f31283a = abstractC8258f0.mo25591l();
            this.f31284b = abstractC8258f0.mo25587h();
            this.f31285c = Integer.valueOf(abstractC8258f0.mo25590k());
            this.f31286d = abstractC8258f0.mo25588i();
            this.f31287e = abstractC8258f0.mo25586g();
            this.f31288f = abstractC8258f0.mo25583d();
            this.f31289g = abstractC8258f0.mo25584e();
            this.f31290h = abstractC8258f0.mo25585f();
            this.f31291i = abstractC8258f0.mo25592m();
            this.f31292j = abstractC8258f0.mo25589j();
            this.f31293k = abstractC8258f0.mo25582c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: c */
    public AbstractC8258f0.a mo25582c() {
        return this.f31282l;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: d */
    public String mo25583d() {
        return this.f31277g;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: e */
    public String mo25584e() {
        return this.f31278h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        AbstractC8258f0.e eVar;
        AbstractC8258f0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0)) {
            return false;
        }
        AbstractC8258f0 abstractC8258f0 = (AbstractC8258f0) obj;
        if (this.f31272b.equals(abstractC8258f0.mo25591l()) && this.f31273c.equals(abstractC8258f0.mo25587h()) && this.f31274d == abstractC8258f0.mo25590k() && this.f31275e.equals(abstractC8258f0.mo25588i()) && ((str = this.f31276f) != null ? str.equals(abstractC8258f0.mo25586g()) : abstractC8258f0.mo25586g() == null) && ((str2 = this.f31277g) != null ? str2.equals(abstractC8258f0.mo25583d()) : abstractC8258f0.mo25583d() == null) && this.f31278h.equals(abstractC8258f0.mo25584e()) && this.f31279i.equals(abstractC8258f0.mo25585f()) && ((eVar = this.f31280j) != null ? eVar.equals(abstractC8258f0.mo25592m()) : abstractC8258f0.mo25592m() == null) && ((dVar = this.f31281k) != null ? dVar.equals(abstractC8258f0.mo25589j()) : abstractC8258f0.mo25589j() == null)) {
            AbstractC8258f0.a aVar = this.f31282l;
            if (aVar == null) {
                if (abstractC8258f0.mo25582c() == null) {
                    return true;
                }
            } else if (aVar.equals(abstractC8258f0.mo25582c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: f */
    public String mo25585f() {
        return this.f31279i;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: g */
    public String mo25586g() {
        return this.f31276f;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: h */
    public String mo25587h() {
        return this.f31273c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f31272b.hashCode() ^ 1000003) * 1000003) ^ this.f31273c.hashCode()) * 1000003) ^ this.f31274d) * 1000003) ^ this.f31275e.hashCode()) * 1000003;
        String str = this.f31276f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f31277g;
        int iHashCode3 = (((((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f31278h.hashCode()) * 1000003) ^ this.f31279i.hashCode()) * 1000003;
        AbstractC8258f0.e eVar = this.f31280j;
        int iHashCode4 = (iHashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC8258f0.d dVar = this.f31281k;
        int iHashCode5 = (iHashCode4 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC8258f0.a aVar = this.f31282l;
        return iHashCode5 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: i */
    public String mo25588i() {
        return this.f31275e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: j */
    public AbstractC8258f0.d mo25589j() {
        return this.f31281k;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: k */
    public int mo25590k() {
        return this.f31274d;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: l */
    public String mo25591l() {
        return this.f31272b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: m */
    public AbstractC8258f0.e mo25592m() {
        return this.f31280j;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0
    /* renamed from: n */
    protected AbstractC8258f0.b mo25593n() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f31272b + ", gmpAppId=" + this.f31273c + ", platform=" + this.f31274d + ", installationUuid=" + this.f31275e + ", firebaseInstallationId=" + this.f31276f + ", appQualitySessionId=" + this.f31277g + ", buildVersion=" + this.f31278h + ", displayVersion=" + this.f31279i + ", session=" + this.f31280j + ", ndkPayload=" + this.f31281k + ", appExitInfo=" + this.f31282l + "}";
    }

    private C8249b(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, AbstractC8258f0.e eVar, AbstractC8258f0.d dVar, AbstractC8258f0.a aVar) {
        this.f31272b = str;
        this.f31273c = str2;
        this.f31274d = i2;
        this.f31275e = str3;
        this.f31276f = str4;
        this.f31277g = str5;
        this.f31278h = str6;
        this.f31279i = str7;
        this.f31280j = eVar;
        this.f31281k = dVar;
        this.f31282l = aVar;
    }
}
