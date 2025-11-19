package L6;

import L6.u;
import java.util.List;

/* compiled from: AutoValue_LogRequest.java */
/* loaded from: classes2.dex */
final class k extends u {

    /* renamed from: a, reason: collision with root package name */
    private final long f10960a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10961b;

    /* renamed from: c, reason: collision with root package name */
    private final o f10962c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f10963d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10964e;

    /* renamed from: f, reason: collision with root package name */
    private final List<t> f10965f;

    /* renamed from: g, reason: collision with root package name */
    private final x f10966g;

    /* compiled from: AutoValue_LogRequest.java */
    static final class b extends u.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f10967a;

        /* renamed from: b, reason: collision with root package name */
        private Long f10968b;

        /* renamed from: c, reason: collision with root package name */
        private o f10969c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f10970d;

        /* renamed from: e, reason: collision with root package name */
        private String f10971e;

        /* renamed from: f, reason: collision with root package name */
        private List<t> f10972f;

        /* renamed from: g, reason: collision with root package name */
        private x f10973g;

        b() {
        }

        @Override // L6.u.a
        public u a() {
            String str = "";
            if (this.f10967a == null) {
                str = " requestTimeMs";
            }
            if (this.f10968b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f10967a.longValue(), this.f10968b.longValue(), this.f10969c, this.f10970d, this.f10971e, this.f10972f, this.f10973g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // L6.u.a
        public u.a b(o oVar) {
            this.f10969c = oVar;
            return this;
        }

        @Override // L6.u.a
        public u.a c(List<t> list) {
            this.f10972f = list;
            return this;
        }

        @Override // L6.u.a
        u.a d(Integer num) {
            this.f10970d = num;
            return this;
        }

        @Override // L6.u.a
        u.a e(String str) {
            this.f10971e = str;
            return this;
        }

        @Override // L6.u.a
        public u.a f(x xVar) {
            this.f10973g = xVar;
            return this;
        }

        @Override // L6.u.a
        public u.a g(long j10) {
            this.f10967a = Long.valueOf(j10);
            return this;
        }

        @Override // L6.u.a
        public u.a h(long j10) {
            this.f10968b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // L6.u
    public o b() {
        return this.f10962c;
    }

    @Override // L6.u
    public List<t> c() {
        return this.f10965f;
    }

    @Override // L6.u
    public Integer d() {
        return this.f10963d;
    }

    @Override // L6.u
    public String e() {
        return this.f10964e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List<t> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f10960a == uVar.g() && this.f10961b == uVar.h() && ((oVar = this.f10962c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f10963d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f10964e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f10965f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            x xVar = this.f10966g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // L6.u
    public x f() {
        return this.f10966g;
    }

    @Override // L6.u
    public long g() {
        return this.f10960a;
    }

    @Override // L6.u
    public long h() {
        return this.f10961b;
    }

    public int hashCode() {
        long j10 = this.f10960a;
        long j11 = this.f10961b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f10962c;
        int iHashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f10963d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f10964e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<t> list = this.f10965f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f10966g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f10960a + ", requestUptimeMs=" + this.f10961b + ", clientInfo=" + this.f10962c + ", logSource=" + this.f10963d + ", logSourceName=" + this.f10964e + ", logEvents=" + this.f10965f + ", qosTier=" + this.f10966g + "}";
    }

    private k(long j10, long j11, o oVar, Integer num, String str, List<t> list, x xVar) {
        this.f10960a = j10;
        this.f10961b = j11;
        this.f10962c = oVar;
        this.f10963d = num;
        this.f10964e = str;
        this.f10965f = list;
        this.f10966g = xVar;
    }
}
