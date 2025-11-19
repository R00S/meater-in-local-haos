package L6;

import L6.t;
import java.util.Arrays;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes2.dex */
final class j extends t {

    /* renamed from: a, reason: collision with root package name */
    private final long f10942a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f10943b;

    /* renamed from: c, reason: collision with root package name */
    private final p f10944c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10945d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f10946e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10947f;

    /* renamed from: g, reason: collision with root package name */
    private final long f10948g;

    /* renamed from: h, reason: collision with root package name */
    private final w f10949h;

    /* renamed from: i, reason: collision with root package name */
    private final q f10950i;

    /* compiled from: AutoValue_LogEvent.java */
    static final class b extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f10951a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f10952b;

        /* renamed from: c, reason: collision with root package name */
        private p f10953c;

        /* renamed from: d, reason: collision with root package name */
        private Long f10954d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f10955e;

        /* renamed from: f, reason: collision with root package name */
        private String f10956f;

        /* renamed from: g, reason: collision with root package name */
        private Long f10957g;

        /* renamed from: h, reason: collision with root package name */
        private w f10958h;

        /* renamed from: i, reason: collision with root package name */
        private q f10959i;

        b() {
        }

        @Override // L6.t.a
        public t a() {
            String str = "";
            if (this.f10951a == null) {
                str = " eventTimeMs";
            }
            if (this.f10954d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f10957g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f10951a.longValue(), this.f10952b, this.f10953c, this.f10954d.longValue(), this.f10955e, this.f10956f, this.f10957g.longValue(), this.f10958h, this.f10959i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // L6.t.a
        public t.a b(p pVar) {
            this.f10953c = pVar;
            return this;
        }

        @Override // L6.t.a
        public t.a c(Integer num) {
            this.f10952b = num;
            return this;
        }

        @Override // L6.t.a
        public t.a d(long j10) {
            this.f10951a = Long.valueOf(j10);
            return this;
        }

        @Override // L6.t.a
        public t.a e(long j10) {
            this.f10954d = Long.valueOf(j10);
            return this;
        }

        @Override // L6.t.a
        public t.a f(q qVar) {
            this.f10959i = qVar;
            return this;
        }

        @Override // L6.t.a
        public t.a g(w wVar) {
            this.f10958h = wVar;
            return this;
        }

        @Override // L6.t.a
        t.a h(byte[] bArr) {
            this.f10955e = bArr;
            return this;
        }

        @Override // L6.t.a
        t.a i(String str) {
            this.f10956f = str;
            return this;
        }

        @Override // L6.t.a
        public t.a j(long j10) {
            this.f10957g = Long.valueOf(j10);
            return this;
        }
    }

    @Override // L6.t
    public p b() {
        return this.f10944c;
    }

    @Override // L6.t
    public Integer c() {
        return this.f10943b;
    }

    @Override // L6.t
    public long d() {
        return this.f10942a;
    }

    @Override // L6.t
    public long e() {
        return this.f10945d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f10942a == tVar.d() && ((num = this.f10943b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f10944c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f10945d == tVar.e()) {
            if (Arrays.equals(this.f10946e, tVar instanceof j ? ((j) tVar).f10946e : tVar.h()) && ((str = this.f10947f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f10948g == tVar.j() && ((wVar = this.f10949h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                q qVar = this.f10950i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // L6.t
    public q f() {
        return this.f10950i;
    }

    @Override // L6.t
    public w g() {
        return this.f10949h;
    }

    @Override // L6.t
    public byte[] h() {
        return this.f10946e;
    }

    public int hashCode() {
        long j10 = this.f10942a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f10943b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f10944c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f10945d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f10946e)) * 1000003;
        String str = this.f10947f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f10948g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f10949h;
        int iHashCode5 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f10950i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // L6.t
    public String i() {
        return this.f10947f;
    }

    @Override // L6.t
    public long j() {
        return this.f10948g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f10942a + ", eventCode=" + this.f10943b + ", complianceData=" + this.f10944c + ", eventUptimeMs=" + this.f10945d + ", sourceExtension=" + Arrays.toString(this.f10946e) + ", sourceExtensionJsonProto3=" + this.f10947f + ", timezoneOffsetSeconds=" + this.f10948g + ", networkConnectionInfo=" + this.f10949h + ", experimentIds=" + this.f10950i + "}";
    }

    private j(long j10, Integer num, p pVar, long j11, byte[] bArr, String str, long j12, w wVar, q qVar) {
        this.f10942a = j10;
        this.f10943b = num;
        this.f10944c = pVar;
        this.f10945d = j11;
        this.f10946e = bArr;
        this.f10947f = str;
        this.f10948g = j12;
        this.f10949h = wVar;
        this.f10950i = qVar;
    }
}
