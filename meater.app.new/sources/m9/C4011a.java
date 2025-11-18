package m9;

import m9.AbstractC4014d;
import m9.C4013c;

/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* renamed from: m9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4011a extends AbstractC4014d {

    /* renamed from: b, reason: collision with root package name */
    private final String f45396b;

    /* renamed from: c, reason: collision with root package name */
    private final C4013c.a f45397c;

    /* renamed from: d, reason: collision with root package name */
    private final String f45398d;

    /* renamed from: e, reason: collision with root package name */
    private final String f45399e;

    /* renamed from: f, reason: collision with root package name */
    private final long f45400f;

    /* renamed from: g, reason: collision with root package name */
    private final long f45401g;

    /* renamed from: h, reason: collision with root package name */
    private final String f45402h;

    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: m9.a$b */
    static final class b extends AbstractC4014d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f45403a;

        /* renamed from: b, reason: collision with root package name */
        private C4013c.a f45404b;

        /* renamed from: c, reason: collision with root package name */
        private String f45405c;

        /* renamed from: d, reason: collision with root package name */
        private String f45406d;

        /* renamed from: e, reason: collision with root package name */
        private Long f45407e;

        /* renamed from: f, reason: collision with root package name */
        private Long f45408f;

        /* renamed from: g, reason: collision with root package name */
        private String f45409g;

        @Override // m9.AbstractC4014d.a
        public AbstractC4014d a() {
            String str = "";
            if (this.f45404b == null) {
                str = " registrationStatus";
            }
            if (this.f45407e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f45408f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C4011a(this.f45403a, this.f45404b, this.f45405c, this.f45406d, this.f45407e.longValue(), this.f45408f.longValue(), this.f45409g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // m9.AbstractC4014d.a
        public AbstractC4014d.a b(String str) {
            this.f45405c = str;
            return this;
        }

        @Override // m9.AbstractC4014d.a
        public AbstractC4014d.a c(long j10) {
            this.f45407e = Long.valueOf(j10);
            return this;
        }

        @Override // m9.AbstractC4014d.a
        public AbstractC4014d.a d(String str) {
            this.f45403a = str;
            return this;
        }

        @Override // m9.AbstractC4014d.a
        public AbstractC4014d.a e(String str) {
            this.f45409g = str;
            return this;
        }

        @Override // m9.AbstractC4014d.a
        public AbstractC4014d.a f(String str) {
            this.f45406d = str;
            return this;
        }

        @Override // m9.AbstractC4014d.a
        public AbstractC4014d.a g(C4013c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f45404b = aVar;
            return this;
        }

        @Override // m9.AbstractC4014d.a
        public AbstractC4014d.a h(long j10) {
            this.f45408f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(AbstractC4014d abstractC4014d) {
            this.f45403a = abstractC4014d.d();
            this.f45404b = abstractC4014d.g();
            this.f45405c = abstractC4014d.b();
            this.f45406d = abstractC4014d.f();
            this.f45407e = Long.valueOf(abstractC4014d.c());
            this.f45408f = Long.valueOf(abstractC4014d.h());
            this.f45409g = abstractC4014d.e();
        }
    }

    @Override // m9.AbstractC4014d
    public String b() {
        return this.f45398d;
    }

    @Override // m9.AbstractC4014d
    public long c() {
        return this.f45400f;
    }

    @Override // m9.AbstractC4014d
    public String d() {
        return this.f45396b;
    }

    @Override // m9.AbstractC4014d
    public String e() {
        return this.f45402h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4014d)) {
            return false;
        }
        AbstractC4014d abstractC4014d = (AbstractC4014d) obj;
        String str3 = this.f45396b;
        if (str3 != null ? str3.equals(abstractC4014d.d()) : abstractC4014d.d() == null) {
            if (this.f45397c.equals(abstractC4014d.g()) && ((str = this.f45398d) != null ? str.equals(abstractC4014d.b()) : abstractC4014d.b() == null) && ((str2 = this.f45399e) != null ? str2.equals(abstractC4014d.f()) : abstractC4014d.f() == null) && this.f45400f == abstractC4014d.c() && this.f45401g == abstractC4014d.h()) {
                String str4 = this.f45402h;
                if (str4 == null) {
                    if (abstractC4014d.e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC4014d.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m9.AbstractC4014d
    public String f() {
        return this.f45399e;
    }

    @Override // m9.AbstractC4014d
    public C4013c.a g() {
        return this.f45397c;
    }

    @Override // m9.AbstractC4014d
    public long h() {
        return this.f45401g;
    }

    public int hashCode() {
        String str = this.f45396b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f45397c.hashCode()) * 1000003;
        String str2 = this.f45398d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f45399e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f45400f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f45401g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f45402h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // m9.AbstractC4014d
    public AbstractC4014d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f45396b + ", registrationStatus=" + this.f45397c + ", authToken=" + this.f45398d + ", refreshToken=" + this.f45399e + ", expiresInSecs=" + this.f45400f + ", tokenCreationEpochInSecs=" + this.f45401g + ", fisError=" + this.f45402h + "}";
    }

    private C4011a(String str, C4013c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f45396b = str;
        this.f45397c = aVar;
        this.f45398d = str2;
        this.f45399e = str3;
        this.f45400f = j10;
        this.f45401g = j11;
        this.f45402h = str4;
    }
}
