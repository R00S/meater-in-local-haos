package T8;

import T8.F;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* loaded from: classes2.dex */
final class y extends F.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final List<F.e.d.AbstractC0251e> f16648a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    static final class b extends F.e.d.f.a {

        /* renamed from: a, reason: collision with root package name */
        private List<F.e.d.AbstractC0251e> f16649a;

        b() {
        }

        @Override // T8.F.e.d.f.a
        public F.e.d.f a() {
            List<F.e.d.AbstractC0251e> list = this.f16649a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // T8.F.e.d.f.a
        public F.e.d.f.a b(List<F.e.d.AbstractC0251e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f16649a = list;
            return this;
        }
    }

    @Override // T8.F.e.d.f
    public List<F.e.d.AbstractC0251e> b() {
        return this.f16648a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.f16648a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16648a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f16648a + "}";
    }

    private y(List<F.e.d.AbstractC0251e> list) {
        this.f16648a = list;
    }
}
