package T8;

import T8.F;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* loaded from: classes2.dex */
final class r extends F.e.d.a.b.AbstractC0245e {

    /* renamed from: a, reason: collision with root package name */
    private final String f16593a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16594b;

    /* renamed from: c, reason: collision with root package name */
    private final List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> f16595c;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    static final class b extends F.e.d.a.b.AbstractC0245e.AbstractC0246a {

        /* renamed from: a, reason: collision with root package name */
        private String f16596a;

        /* renamed from: b, reason: collision with root package name */
        private int f16597b;

        /* renamed from: c, reason: collision with root package name */
        private List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> f16598c;

        /* renamed from: d, reason: collision with root package name */
        private byte f16599d;

        b() {
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0246a
        public F.e.d.a.b.AbstractC0245e a() {
            String str;
            List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> list;
            if (this.f16599d == 1 && (str = this.f16596a) != null && (list = this.f16598c) != null) {
                return new r(str, this.f16597b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16596a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f16599d) == 0) {
                sb2.append(" importance");
            }
            if (this.f16598c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0246a
        public F.e.d.a.b.AbstractC0245e.AbstractC0246a b(List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f16598c = list;
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0246a
        public F.e.d.a.b.AbstractC0245e.AbstractC0246a c(int i10) {
            this.f16597b = i10;
            this.f16599d = (byte) (this.f16599d | 1);
            return this;
        }

        @Override // T8.F.e.d.a.b.AbstractC0245e.AbstractC0246a
        public F.e.d.a.b.AbstractC0245e.AbstractC0246a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f16596a = str;
            return this;
        }
    }

    @Override // T8.F.e.d.a.b.AbstractC0245e
    public List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> b() {
        return this.f16595c;
    }

    @Override // T8.F.e.d.a.b.AbstractC0245e
    public int c() {
        return this.f16594b;
    }

    @Override // T8.F.e.d.a.b.AbstractC0245e
    public String d() {
        return this.f16593a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.AbstractC0245e)) {
            return false;
        }
        F.e.d.a.b.AbstractC0245e abstractC0245e = (F.e.d.a.b.AbstractC0245e) obj;
        return this.f16593a.equals(abstractC0245e.d()) && this.f16594b == abstractC0245e.c() && this.f16595c.equals(abstractC0245e.b());
    }

    public int hashCode() {
        return ((((this.f16593a.hashCode() ^ 1000003) * 1000003) ^ this.f16594b) * 1000003) ^ this.f16595c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f16593a + ", importance=" + this.f16594b + ", frames=" + this.f16595c + "}";
    }

    private r(String str, int i10, List<F.e.d.a.b.AbstractC0245e.AbstractC0247b> list) {
        this.f16593a = str;
        this.f16594b = i10;
        this.f16595c = list;
    }
}
