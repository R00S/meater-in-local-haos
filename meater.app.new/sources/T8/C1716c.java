package T8;

import T8.F;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* renamed from: T8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1716c extends F.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f16432a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16433b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16434c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16435d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16436e;

    /* renamed from: f, reason: collision with root package name */
    private final long f16437f;

    /* renamed from: g, reason: collision with root package name */
    private final long f16438g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16439h;

    /* renamed from: i, reason: collision with root package name */
    private final List<F.a.AbstractC0235a> f16440i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* renamed from: T8.c$b */
    static final class b extends F.a.b {

        /* renamed from: a, reason: collision with root package name */
        private int f16441a;

        /* renamed from: b, reason: collision with root package name */
        private String f16442b;

        /* renamed from: c, reason: collision with root package name */
        private int f16443c;

        /* renamed from: d, reason: collision with root package name */
        private int f16444d;

        /* renamed from: e, reason: collision with root package name */
        private long f16445e;

        /* renamed from: f, reason: collision with root package name */
        private long f16446f;

        /* renamed from: g, reason: collision with root package name */
        private long f16447g;

        /* renamed from: h, reason: collision with root package name */
        private String f16448h;

        /* renamed from: i, reason: collision with root package name */
        private List<F.a.AbstractC0235a> f16449i;

        /* renamed from: j, reason: collision with root package name */
        private byte f16450j;

        b() {
        }

        @Override // T8.F.a.b
        public F.a a() {
            String str;
            if (this.f16450j == 63 && (str = this.f16442b) != null) {
                return new C1716c(this.f16441a, str, this.f16443c, this.f16444d, this.f16445e, this.f16446f, this.f16447g, this.f16448h, this.f16449i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f16450j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f16442b == null) {
                sb2.append(" processName");
            }
            if ((this.f16450j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f16450j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f16450j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f16450j & 16) == 0) {
                sb2.append(" rss");
            }
            if ((this.f16450j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.a.b
        public F.a.b b(List<F.a.AbstractC0235a> list) {
            this.f16449i = list;
            return this;
        }

        @Override // T8.F.a.b
        public F.a.b c(int i10) {
            this.f16444d = i10;
            this.f16450j = (byte) (this.f16450j | 4);
            return this;
        }

        @Override // T8.F.a.b
        public F.a.b d(int i10) {
            this.f16441a = i10;
            this.f16450j = (byte) (this.f16450j | 1);
            return this;
        }

        @Override // T8.F.a.b
        public F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f16442b = str;
            return this;
        }

        @Override // T8.F.a.b
        public F.a.b f(long j10) {
            this.f16445e = j10;
            this.f16450j = (byte) (this.f16450j | 8);
            return this;
        }

        @Override // T8.F.a.b
        public F.a.b g(int i10) {
            this.f16443c = i10;
            this.f16450j = (byte) (this.f16450j | 2);
            return this;
        }

        @Override // T8.F.a.b
        public F.a.b h(long j10) {
            this.f16446f = j10;
            this.f16450j = (byte) (this.f16450j | 16);
            return this;
        }

        @Override // T8.F.a.b
        public F.a.b i(long j10) {
            this.f16447g = j10;
            this.f16450j = (byte) (this.f16450j | 32);
            return this;
        }

        @Override // T8.F.a.b
        public F.a.b j(String str) {
            this.f16448h = str;
            return this;
        }
    }

    @Override // T8.F.a
    public List<F.a.AbstractC0235a> b() {
        return this.f16440i;
    }

    @Override // T8.F.a
    public int c() {
        return this.f16435d;
    }

    @Override // T8.F.a
    public int d() {
        return this.f16432a;
    }

    @Override // T8.F.a
    public String e() {
        return this.f16433b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a)) {
            return false;
        }
        F.a aVar = (F.a) obj;
        if (this.f16432a == aVar.d() && this.f16433b.equals(aVar.e()) && this.f16434c == aVar.g() && this.f16435d == aVar.c() && this.f16436e == aVar.f() && this.f16437f == aVar.h() && this.f16438g == aVar.i() && ((str = this.f16439h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List<F.a.AbstractC0235a> list = this.f16440i;
            if (list == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (list.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // T8.F.a
    public long f() {
        return this.f16436e;
    }

    @Override // T8.F.a
    public int g() {
        return this.f16434c;
    }

    @Override // T8.F.a
    public long h() {
        return this.f16437f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f16432a ^ 1000003) * 1000003) ^ this.f16433b.hashCode()) * 1000003) ^ this.f16434c) * 1000003) ^ this.f16435d) * 1000003;
        long j10 = this.f16436e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f16437f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f16438g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f16439h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<F.a.AbstractC0235a> list = this.f16440i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // T8.F.a
    public long i() {
        return this.f16438g;
    }

    @Override // T8.F.a
    public String j() {
        return this.f16439h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f16432a + ", processName=" + this.f16433b + ", reasonCode=" + this.f16434c + ", importance=" + this.f16435d + ", pss=" + this.f16436e + ", rss=" + this.f16437f + ", timestamp=" + this.f16438g + ", traceFile=" + this.f16439h + ", buildIdMappingForArch=" + this.f16440i + "}";
    }

    private C1716c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<F.a.AbstractC0235a> list) {
        this.f16432a = i10;
        this.f16433b = str;
        this.f16434c = i11;
        this.f16435d = i12;
        this.f16436e = j10;
        this.f16437f = j11;
        this.f16438g = j12;
        this.f16439h = str2;
        this.f16440i = list;
    }
}
