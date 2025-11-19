package T8;

import T8.F;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes2.dex */
final class n extends F.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List<F.e.d.a.b.AbstractC0245e> f16556a;

    /* renamed from: b, reason: collision with root package name */
    private final F.e.d.a.b.c f16557b;

    /* renamed from: c, reason: collision with root package name */
    private final F.a f16558c;

    /* renamed from: d, reason: collision with root package name */
    private final F.e.d.a.b.AbstractC0243d f16559d;

    /* renamed from: e, reason: collision with root package name */
    private final List<F.e.d.a.b.AbstractC0239a> f16560e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    static final class b extends F.e.d.a.b.AbstractC0241b {

        /* renamed from: a, reason: collision with root package name */
        private List<F.e.d.a.b.AbstractC0245e> f16561a;

        /* renamed from: b, reason: collision with root package name */
        private F.e.d.a.b.c f16562b;

        /* renamed from: c, reason: collision with root package name */
        private F.a f16563c;

        /* renamed from: d, reason: collision with root package name */
        private F.e.d.a.b.AbstractC0243d f16564d;

        /* renamed from: e, reason: collision with root package name */
        private List<F.e.d.a.b.AbstractC0239a> f16565e;

        b() {
        }

        @Override // T8.F.e.d.a.b.AbstractC0241b
        public F.e.d.a.b a() {
            List<F.e.d.a.b.AbstractC0239a> list;
            F.e.d.a.b.AbstractC0243d abstractC0243d = this.f16564d;
            if (abstractC0243d != null && (list = this.f16565e) != null) {
                return new n(this.f16561a, this.f16562b, this.f16563c, abstractC0243d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16564d == null) {
                sb2.append(" signal");
            }
            if (this.f16565e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.a.b.AbstractC0241b
        public F.e.d.a.b.AbstractC0241b b(F.a aVar) {
            this.f16563c = aVar;
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0241b
        public F.e.d.a.b.AbstractC0241b c(List<F.e.d.a.b.AbstractC0239a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f16565e = list;
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0241b
        public F.e.d.a.b.AbstractC0241b d(F.e.d.a.b.c cVar) {
            this.f16562b = cVar;
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0241b
        public F.e.d.a.b.AbstractC0241b e(F.e.d.a.b.AbstractC0243d abstractC0243d) {
            if (abstractC0243d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f16564d = abstractC0243d;
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0241b
        public F.e.d.a.b.AbstractC0241b f(List<F.e.d.a.b.AbstractC0245e> list) {
            this.f16561a = list;
            return this;
        }
    }

    @Override // T8.F.e.d.a.b
    public F.a b() {
        return this.f16558c;
    }

    @Override // T8.F.e.d.a.b
    public List<F.e.d.a.b.AbstractC0239a> c() {
        return this.f16560e;
    }

    @Override // T8.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.f16557b;
    }

    @Override // T8.F.e.d.a.b
    public F.e.d.a.b.AbstractC0243d e() {
        return this.f16559d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b)) {
            return false;
        }
        F.e.d.a.b bVar = (F.e.d.a.b) obj;
        List<F.e.d.a.b.AbstractC0245e> list = this.f16556a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            F.e.d.a.b.c cVar = this.f16557b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                F.a aVar = this.f16558c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f16559d.equals(bVar.e()) && this.f16560e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // T8.F.e.d.a.b
    public List<F.e.d.a.b.AbstractC0245e> f() {
        return this.f16556a;
    }

    public int hashCode() {
        List<F.e.d.a.b.AbstractC0245e> list = this.f16556a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f16557b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.f16558c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f16559d.hashCode()) * 1000003) ^ this.f16560e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f16556a + ", exception=" + this.f16557b + ", appExitInfo=" + this.f16558c + ", signal=" + this.f16559d + ", binaries=" + this.f16560e + "}";
    }

    private n(List<F.e.d.a.b.AbstractC0245e> list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0243d abstractC0243d, List<F.e.d.a.b.AbstractC0239a> list2) {
        this.f16556a = list;
        this.f16557b = cVar;
        this.f16558c = aVar;
        this.f16559d = abstractC0243d;
        this.f16560e = list2;
    }
}
