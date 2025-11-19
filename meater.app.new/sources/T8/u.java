package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes2.dex */
final class u extends F.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f16620a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16621b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16622c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16623d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16624e;

    /* renamed from: f, reason: collision with root package name */
    private final long f16625f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    static final class b extends F.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f16626a;

        /* renamed from: b, reason: collision with root package name */
        private int f16627b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16628c;

        /* renamed from: d, reason: collision with root package name */
        private int f16629d;

        /* renamed from: e, reason: collision with root package name */
        private long f16630e;

        /* renamed from: f, reason: collision with root package name */
        private long f16631f;

        /* renamed from: g, reason: collision with root package name */
        private byte f16632g;

        b() {
        }

        @Override // T8.F.e.d.c.a
        public F.e.d.c a() {
            if (this.f16632g == 31) {
                return new u(this.f16626a, this.f16627b, this.f16628c, this.f16629d, this.f16630e, this.f16631f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f16632g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f16632g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f16632g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f16632g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f16632g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.c.a
        public F.e.d.c.a b(Double d10) {
            this.f16626a = d10;
            return this;
        }

        @Override // T8.F.e.d.c.a
        public F.e.d.c.a c(int i10) {
            this.f16627b = i10;
            this.f16632g = (byte) (this.f16632g | 1);
            return this;
        }

        @Override // T8.F.e.d.c.a
        public F.e.d.c.a d(long j10) {
            this.f16631f = j10;
            this.f16632g = (byte) (this.f16632g | 16);
            return this;
        }

        @Override // T8.F.e.d.c.a
        public F.e.d.c.a e(int i10) {
            this.f16629d = i10;
            this.f16632g = (byte) (this.f16632g | 4);
            return this;
        }

        @Override // T8.F.e.d.c.a
        public F.e.d.c.a f(boolean z10) {
            this.f16628c = z10;
            this.f16632g = (byte) (this.f16632g | 2);
            return this;
        }

        @Override // T8.F.e.d.c.a
        public F.e.d.c.a g(long j10) {
            this.f16630e = j10;
            this.f16632g = (byte) (this.f16632g | 8);
            return this;
        }
    }

    @Override // T8.F.e.d.c
    public Double b() {
        return this.f16620a;
    }

    @Override // T8.F.e.d.c
    public int c() {
        return this.f16621b;
    }

    @Override // T8.F.e.d.c
    public long d() {
        return this.f16625f;
    }

    @Override // T8.F.e.d.c
    public int e() {
        return this.f16623d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.c)) {
            return false;
        }
        F.e.d.c cVar = (F.e.d.c) obj;
        Double d10 = this.f16620a;
        if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
            if (this.f16621b == cVar.c() && this.f16622c == cVar.g() && this.f16623d == cVar.e() && this.f16624e == cVar.f() && this.f16625f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // T8.F.e.d.c
    public long f() {
        return this.f16624e;
    }

    @Override // T8.F.e.d.c
    public boolean g() {
        return this.f16622c;
    }

    public int hashCode() {
        Double d10 = this.f16620a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f16621b) * 1000003) ^ (this.f16622c ? 1231 : 1237)) * 1000003) ^ this.f16623d) * 1000003;
        long j10 = this.f16624e;
        long j11 = this.f16625f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f16620a + ", batteryVelocity=" + this.f16621b + ", proximityOn=" + this.f16622c + ", orientation=" + this.f16623d + ", ramUsed=" + this.f16624e + ", diskUsed=" + this.f16625f + "}";
    }

    private u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f16620a = d10;
        this.f16621b = i10;
        this.f16622c = z10;
        this.f16623d = i11;
        this.f16624e = j10;
        this.f16625f = j11;
    }
}
