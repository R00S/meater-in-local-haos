package T8;

import T8.F;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes2.dex */
final class p extends F.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16575a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16576b;

    /* renamed from: c, reason: collision with root package name */
    private final List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> f16577c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.c f16578d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16579e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    static final class b extends F.e.d.a.b.c.AbstractC0242a {

        /* renamed from: a, reason: collision with root package name */
        private String f16580a;

        /* renamed from: b, reason: collision with root package name */
        private String f16581b;

        /* renamed from: c, reason: collision with root package name */
        private List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> f16582c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.c f16583d;

        /* renamed from: e, reason: collision with root package name */
        private int f16584e;

        /* renamed from: f, reason: collision with root package name */
        private byte f16585f;

        b() {
        }

        @Override // T8.F.e.d.a.b.c.AbstractC0242a
        public F.e.d.a.b.c a() {
            String str;
            List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> list;
            if (this.f16585f == 1 && (str = this.f16580a) != null && (list = this.f16582c) != null) {
                return new p(str, this.f16581b, list, this.f16583d, this.f16584e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16580a == null) {
                sb2.append(" type");
            }
            if (this.f16582c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f16585f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.a.b.c.AbstractC0242a
        public F.e.d.a.b.c.AbstractC0242a b(F.e.d.a.b.c cVar) {
            this.f16583d = cVar;
            return this;
        }

        @Override // T8.F.e.d.a.b.c.AbstractC0242a
        public F.e.d.a.b.c.AbstractC0242a c(List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f16582c = list;
            return this;
        }

        @Override // T8.F.e.d.a.b.c.AbstractC0242a
        public F.e.d.a.b.c.AbstractC0242a d(int i10) {
            this.f16584e = i10;
            this.f16585f = (byte) (this.f16585f | 1);
            return this;
        }

        @Override // T8.F.e.d.a.b.c.AbstractC0242a
        public F.e.d.a.b.c.AbstractC0242a e(String str) {
            this.f16581b = str;
            return this;
        }

        @Override // T8.F.e.d.a.b.c.AbstractC0242a
        public F.e.d.a.b.c.AbstractC0242a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f16580a = str;
            return this;
        }
    }

    @Override // T8.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.f16578d;
    }

    @Override // T8.F.e.d.a.b.c
    public List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> c() {
        return this.f16577c;
    }

    @Override // T8.F.e.d.a.b.c
    public int d() {
        return this.f16579e;
    }

    @Override // T8.F.e.d.a.b.c
    public String e() {
        return this.f16576b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.c)) {
            return false;
        }
        F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
        return this.f16575a.equals(cVar2.f()) && ((str = this.f16576b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f16577c.equals(cVar2.c()) && ((cVar = this.f16578d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f16579e == cVar2.d();
    }

    @Override // T8.F.e.d.a.b.c
    public String f() {
        return this.f16575a;
    }

    public int hashCode() {
        int iHashCode = (this.f16575a.hashCode() ^ 1000003) * 1000003;
        String str = this.f16576b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f16577c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f16578d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f16579e;
    }

    public String toString() {
        return "Exception{type=" + this.f16575a + ", reason=" + this.f16576b + ", frames=" + this.f16577c + ", causedBy=" + this.f16578d + ", overflowCount=" + this.f16579e + "}";
    }

    private p(String str, String str2, List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> list, F.e.d.a.b.c cVar, int i10) {
        this.f16575a = str;
        this.f16576b = str2;
        this.f16577c = list;
        this.f16578d = cVar;
        this.f16579e = i10;
    }
}
