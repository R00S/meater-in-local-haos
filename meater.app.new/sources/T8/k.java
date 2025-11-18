package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes2.dex */
final class k extends F.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f16509a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16510b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16511c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16512d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16513e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f16514f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16515g;

    /* renamed from: h, reason: collision with root package name */
    private final String f16516h;

    /* renamed from: i, reason: collision with root package name */
    private final String f16517i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    static final class b extends F.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private int f16518a;

        /* renamed from: b, reason: collision with root package name */
        private String f16519b;

        /* renamed from: c, reason: collision with root package name */
        private int f16520c;

        /* renamed from: d, reason: collision with root package name */
        private long f16521d;

        /* renamed from: e, reason: collision with root package name */
        private long f16522e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16523f;

        /* renamed from: g, reason: collision with root package name */
        private int f16524g;

        /* renamed from: h, reason: collision with root package name */
        private String f16525h;

        /* renamed from: i, reason: collision with root package name */
        private String f16526i;

        /* renamed from: j, reason: collision with root package name */
        private byte f16527j;

        b() {
        }

        @Override // T8.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f16527j == 63 && (str = this.f16519b) != null && (str2 = this.f16525h) != null && (str3 = this.f16526i) != null) {
                return new k(this.f16518a, str, this.f16520c, this.f16521d, this.f16522e, this.f16523f, this.f16524g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f16527j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f16519b == null) {
                sb2.append(" model");
            }
            if ((this.f16527j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f16527j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f16527j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f16527j & 16) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f16527j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f16525h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f16526i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.c.a
        public F.e.c.a b(int i10) {
            this.f16518a = i10;
            this.f16527j = (byte) (this.f16527j | 1);
            return this;
        }

        @Override // T8.F.e.c.a
        public F.e.c.a c(int i10) {
            this.f16520c = i10;
            this.f16527j = (byte) (this.f16527j | 2);
            return this;
        }

        @Override // T8.F.e.c.a
        public F.e.c.a d(long j10) {
            this.f16522e = j10;
            this.f16527j = (byte) (this.f16527j | 8);
            return this;
        }

        @Override // T8.F.e.c.a
        public F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f16525h = str;
            return this;
        }

        @Override // T8.F.e.c.a
        public F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f16519b = str;
            return this;
        }

        @Override // T8.F.e.c.a
        public F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f16526i = str;
            return this;
        }

        @Override // T8.F.e.c.a
        public F.e.c.a h(long j10) {
            this.f16521d = j10;
            this.f16527j = (byte) (this.f16527j | 4);
            return this;
        }

        @Override // T8.F.e.c.a
        public F.e.c.a i(boolean z10) {
            this.f16523f = z10;
            this.f16527j = (byte) (this.f16527j | 16);
            return this;
        }

        @Override // T8.F.e.c.a
        public F.e.c.a j(int i10) {
            this.f16524g = i10;
            this.f16527j = (byte) (this.f16527j | 32);
            return this;
        }
    }

    @Override // T8.F.e.c
    public int b() {
        return this.f16509a;
    }

    @Override // T8.F.e.c
    public int c() {
        return this.f16511c;
    }

    @Override // T8.F.e.c
    public long d() {
        return this.f16513e;
    }

    @Override // T8.F.e.c
    public String e() {
        return this.f16516h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.c)) {
            return false;
        }
        F.e.c cVar = (F.e.c) obj;
        return this.f16509a == cVar.b() && this.f16510b.equals(cVar.f()) && this.f16511c == cVar.c() && this.f16512d == cVar.h() && this.f16513e == cVar.d() && this.f16514f == cVar.j() && this.f16515g == cVar.i() && this.f16516h.equals(cVar.e()) && this.f16517i.equals(cVar.g());
    }

    @Override // T8.F.e.c
    public String f() {
        return this.f16510b;
    }

    @Override // T8.F.e.c
    public String g() {
        return this.f16517i;
    }

    @Override // T8.F.e.c
    public long h() {
        return this.f16512d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f16509a ^ 1000003) * 1000003) ^ this.f16510b.hashCode()) * 1000003) ^ this.f16511c) * 1000003;
        long j10 = this.f16512d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f16513e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f16514f ? 1231 : 1237)) * 1000003) ^ this.f16515g) * 1000003) ^ this.f16516h.hashCode()) * 1000003) ^ this.f16517i.hashCode();
    }

    @Override // T8.F.e.c
    public int i() {
        return this.f16515g;
    }

    @Override // T8.F.e.c
    public boolean j() {
        return this.f16514f;
    }

    public String toString() {
        return "Device{arch=" + this.f16509a + ", model=" + this.f16510b + ", cores=" + this.f16511c + ", ram=" + this.f16512d + ", diskSpace=" + this.f16513e + ", simulator=" + this.f16514f + ", state=" + this.f16515g + ", manufacturer=" + this.f16516h + ", modelClass=" + this.f16517i + "}";
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f16509a = i10;
        this.f16510b = str;
        this.f16511c = i11;
        this.f16512d = j10;
        this.f16513e = j11;
        this.f16514f = z10;
        this.f16515g = i12;
        this.f16516h = str2;
        this.f16517i = str3;
    }
}
