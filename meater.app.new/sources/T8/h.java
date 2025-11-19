package T8;

import T8.F;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes2.dex */
final class h extends F.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f16469a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16470b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16471c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16472d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f16473e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16474f;

    /* renamed from: g, reason: collision with root package name */
    private final F.e.a f16475g;

    /* renamed from: h, reason: collision with root package name */
    private final F.e.f f16476h;

    /* renamed from: i, reason: collision with root package name */
    private final F.e.AbstractC0252e f16477i;

    /* renamed from: j, reason: collision with root package name */
    private final F.e.c f16478j;

    /* renamed from: k, reason: collision with root package name */
    private final List<F.e.d> f16479k;

    /* renamed from: l, reason: collision with root package name */
    private final int f16480l;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    static final class b extends F.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f16481a;

        /* renamed from: b, reason: collision with root package name */
        private String f16482b;

        /* renamed from: c, reason: collision with root package name */
        private String f16483c;

        /* renamed from: d, reason: collision with root package name */
        private long f16484d;

        /* renamed from: e, reason: collision with root package name */
        private Long f16485e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16486f;

        /* renamed from: g, reason: collision with root package name */
        private F.e.a f16487g;

        /* renamed from: h, reason: collision with root package name */
        private F.e.f f16488h;

        /* renamed from: i, reason: collision with root package name */
        private F.e.AbstractC0252e f16489i;

        /* renamed from: j, reason: collision with root package name */
        private F.e.c f16490j;

        /* renamed from: k, reason: collision with root package name */
        private List<F.e.d> f16491k;

        /* renamed from: l, reason: collision with root package name */
        private int f16492l;

        /* renamed from: m, reason: collision with root package name */
        private byte f16493m;

        @Override // T8.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f16493m == 7 && (str = this.f16481a) != null && (str2 = this.f16482b) != null && (aVar = this.f16487g) != null) {
                return new h(str, str2, this.f16483c, this.f16484d, this.f16485e, this.f16486f, aVar, this.f16488h, this.f16489i, this.f16490j, this.f16491k, this.f16492l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16481a == null) {
                sb2.append(" generator");
            }
            if (this.f16482b == null) {
                sb2.append(" identifier");
            }
            if ((this.f16493m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f16493m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f16487g == null) {
                sb2.append(" app");
            }
            if ((this.f16493m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f16487g = aVar;
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b c(String str) {
            this.f16483c = str;
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b d(boolean z10) {
            this.f16486f = z10;
            this.f16493m = (byte) (this.f16493m | 2);
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.f16490j = cVar;
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b f(Long l10) {
            this.f16485e = l10;
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b g(List<F.e.d> list) {
            this.f16491k = list;
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f16481a = str;
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b i(int i10) {
            this.f16492l = i10;
            this.f16493m = (byte) (this.f16493m | 4);
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f16482b = str;
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b l(F.e.AbstractC0252e abstractC0252e) {
            this.f16489i = abstractC0252e;
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b m(long j10) {
            this.f16484d = j10;
            this.f16493m = (byte) (this.f16493m | 1);
            return this;
        }

        @Override // T8.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.f16488h = fVar;
            return this;
        }

        b() {
        }

        private b(F.e eVar) {
            this.f16481a = eVar.g();
            this.f16482b = eVar.i();
            this.f16483c = eVar.c();
            this.f16484d = eVar.l();
            this.f16485e = eVar.e();
            this.f16486f = eVar.n();
            this.f16487g = eVar.b();
            this.f16488h = eVar.m();
            this.f16489i = eVar.k();
            this.f16490j = eVar.d();
            this.f16491k = eVar.f();
            this.f16492l = eVar.h();
            this.f16493m = (byte) 7;
        }
    }

    @Override // T8.F.e
    public F.e.a b() {
        return this.f16475g;
    }

    @Override // T8.F.e
    public String c() {
        return this.f16471c;
    }

    @Override // T8.F.e
    public F.e.c d() {
        return this.f16478j;
    }

    @Override // T8.F.e
    public Long e() {
        return this.f16473e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        F.e.f fVar;
        F.e.AbstractC0252e abstractC0252e;
        F.e.c cVar;
        List<F.e.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e)) {
            return false;
        }
        F.e eVar = (F.e) obj;
        return this.f16469a.equals(eVar.g()) && this.f16470b.equals(eVar.i()) && ((str = this.f16471c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f16472d == eVar.l() && ((l10 = this.f16473e) != null ? l10.equals(eVar.e()) : eVar.e() == null) && this.f16474f == eVar.n() && this.f16475g.equals(eVar.b()) && ((fVar = this.f16476h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0252e = this.f16477i) != null ? abstractC0252e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f16478j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f16479k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f16480l == eVar.h();
    }

    @Override // T8.F.e
    public List<F.e.d> f() {
        return this.f16479k;
    }

    @Override // T8.F.e
    public String g() {
        return this.f16469a;
    }

    @Override // T8.F.e
    public int h() {
        return this.f16480l;
    }

    public int hashCode() {
        int iHashCode = (((this.f16469a.hashCode() ^ 1000003) * 1000003) ^ this.f16470b.hashCode()) * 1000003;
        String str = this.f16471c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f16472d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f16473e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f16474f ? 1231 : 1237)) * 1000003) ^ this.f16475g.hashCode()) * 1000003;
        F.e.f fVar = this.f16476h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.AbstractC0252e abstractC0252e = this.f16477i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0252e == null ? 0 : abstractC0252e.hashCode())) * 1000003;
        F.e.c cVar = this.f16478j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<F.e.d> list = this.f16479k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f16480l;
    }

    @Override // T8.F.e
    public String i() {
        return this.f16470b;
    }

    @Override // T8.F.e
    public F.e.AbstractC0252e k() {
        return this.f16477i;
    }

    @Override // T8.F.e
    public long l() {
        return this.f16472d;
    }

    @Override // T8.F.e
    public F.e.f m() {
        return this.f16476h;
    }

    @Override // T8.F.e
    public boolean n() {
        return this.f16474f;
    }

    @Override // T8.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f16469a + ", identifier=" + this.f16470b + ", appQualitySessionId=" + this.f16471c + ", startedAt=" + this.f16472d + ", endedAt=" + this.f16473e + ", crashed=" + this.f16474f + ", app=" + this.f16475g + ", user=" + this.f16476h + ", os=" + this.f16477i + ", device=" + this.f16478j + ", events=" + this.f16479k + ", generatorType=" + this.f16480l + "}";
    }

    private h(String str, String str2, String str3, long j10, Long l10, boolean z10, F.e.a aVar, F.e.f fVar, F.e.AbstractC0252e abstractC0252e, F.e.c cVar, List<F.e.d> list, int i10) {
        this.f16469a = str;
        this.f16470b = str2;
        this.f16471c = str3;
        this.f16472d = j10;
        this.f16473e = l10;
        this.f16474f = z10;
        this.f16475g = aVar;
        this.f16476h = fVar;
        this.f16477i = abstractC0252e;
        this.f16478j = cVar;
        this.f16479k = list;
        this.f16480l = i10;
    }
}
