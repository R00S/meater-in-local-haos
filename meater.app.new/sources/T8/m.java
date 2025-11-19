package T8;

import T8.F;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes2.dex */
final class m extends F.e.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final F.e.d.a.b f16541a;

    /* renamed from: b, reason: collision with root package name */
    private final List<F.c> f16542b;

    /* renamed from: c, reason: collision with root package name */
    private final List<F.c> f16543c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f16544d;

    /* renamed from: e, reason: collision with root package name */
    private final F.e.d.a.c f16545e;

    /* renamed from: f, reason: collision with root package name */
    private final List<F.e.d.a.c> f16546f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16547g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    static final class b extends F.e.d.a.AbstractC0238a {

        /* renamed from: a, reason: collision with root package name */
        private F.e.d.a.b f16548a;

        /* renamed from: b, reason: collision with root package name */
        private List<F.c> f16549b;

        /* renamed from: c, reason: collision with root package name */
        private List<F.c> f16550c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f16551d;

        /* renamed from: e, reason: collision with root package name */
        private F.e.d.a.c f16552e;

        /* renamed from: f, reason: collision with root package name */
        private List<F.e.d.a.c> f16553f;

        /* renamed from: g, reason: collision with root package name */
        private int f16554g;

        /* renamed from: h, reason: collision with root package name */
        private byte f16555h;

        @Override // T8.F.e.d.a.AbstractC0238a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f16555h == 1 && (bVar = this.f16548a) != null) {
                return new m(bVar, this.f16549b, this.f16550c, this.f16551d, this.f16552e, this.f16553f, this.f16554g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16548a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f16555h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.a.AbstractC0238a
        public F.e.d.a.AbstractC0238a b(List<F.e.d.a.c> list) {
            this.f16553f = list;
            return this;
        }

        @Override // T8.F.e.d.a.AbstractC0238a
        public F.e.d.a.AbstractC0238a c(Boolean bool) {
            this.f16551d = bool;
            return this;
        }

        @Override // T8.F.e.d.a.AbstractC0238a
        public F.e.d.a.AbstractC0238a d(F.e.d.a.c cVar) {
            this.f16552e = cVar;
            return this;
        }

        @Override // T8.F.e.d.a.AbstractC0238a
        public F.e.d.a.AbstractC0238a e(List<F.c> list) {
            this.f16549b = list;
            return this;
        }

        @Override // T8.F.e.d.a.AbstractC0238a
        public F.e.d.a.AbstractC0238a f(F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f16548a = bVar;
            return this;
        }

        @Override // T8.F.e.d.a.AbstractC0238a
        public F.e.d.a.AbstractC0238a g(List<F.c> list) {
            this.f16550c = list;
            return this;
        }

        @Override // T8.F.e.d.a.AbstractC0238a
        public F.e.d.a.AbstractC0238a h(int i10) {
            this.f16554g = i10;
            this.f16555h = (byte) (this.f16555h | 1);
            return this;
        }

        b() {
        }

        private b(F.e.d.a aVar) {
            this.f16548a = aVar.f();
            this.f16549b = aVar.e();
            this.f16550c = aVar.g();
            this.f16551d = aVar.c();
            this.f16552e = aVar.d();
            this.f16553f = aVar.b();
            this.f16554g = aVar.h();
            this.f16555h = (byte) 1;
        }
    }

    @Override // T8.F.e.d.a
    public List<F.e.d.a.c> b() {
        return this.f16546f;
    }

    @Override // T8.F.e.d.a
    public Boolean c() {
        return this.f16544d;
    }

    @Override // T8.F.e.d.a
    public F.e.d.a.c d() {
        return this.f16545e;
    }

    @Override // T8.F.e.d.a
    public List<F.c> e() {
        return this.f16542b;
    }

    public boolean equals(Object obj) {
        List<F.c> list;
        List<F.c> list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List<F.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a)) {
            return false;
        }
        F.e.d.a aVar = (F.e.d.a) obj;
        return this.f16541a.equals(aVar.f()) && ((list = this.f16542b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f16543c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f16544d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f16545e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f16546f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f16547g == aVar.h();
    }

    @Override // T8.F.e.d.a
    public F.e.d.a.b f() {
        return this.f16541a;
    }

    @Override // T8.F.e.d.a
    public List<F.c> g() {
        return this.f16543c;
    }

    @Override // T8.F.e.d.a
    public int h() {
        return this.f16547g;
    }

    public int hashCode() {
        int iHashCode = (this.f16541a.hashCode() ^ 1000003) * 1000003;
        List<F.c> list = this.f16542b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<F.c> list2 = this.f16543c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f16544d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.f16545e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<F.e.d.a.c> list3 = this.f16546f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f16547g;
    }

    @Override // T8.F.e.d.a
    public F.e.d.a.AbstractC0238a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f16541a + ", customAttributes=" + this.f16542b + ", internalKeys=" + this.f16543c + ", background=" + this.f16544d + ", currentProcessDetails=" + this.f16545e + ", appProcessDetails=" + this.f16546f + ", uiOrientation=" + this.f16547g + "}";
    }

    private m(F.e.d.a.b bVar, List<F.c> list, List<F.c> list2, Boolean bool, F.e.d.a.c cVar, List<F.e.d.a.c> list3, int i10) {
        this.f16541a = bVar;
        this.f16542b = list;
        this.f16543c = list2;
        this.f16544d = bool;
        this.f16545e = cVar;
        this.f16546f = list3;
        this.f16547g = i10;
    }
}
