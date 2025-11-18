package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes2.dex */
final class v extends F.e.d.AbstractC0250d {

    /* renamed from: a, reason: collision with root package name */
    private final String f16633a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    static final class b extends F.e.d.AbstractC0250d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16634a;

        b() {
        }

        @Override // T8.F.e.d.AbstractC0250d.a
        public F.e.d.AbstractC0250d a() {
            String str = this.f16634a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // T8.F.e.d.AbstractC0250d.a
        public F.e.d.AbstractC0250d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f16634a = str;
            return this;
        }
    }

    @Override // T8.F.e.d.AbstractC0250d
    public String b() {
        return this.f16633a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0250d) {
            return this.f16633a.equals(((F.e.d.AbstractC0250d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f16633a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f16633a + "}";
    }

    private v(String str) {
        this.f16633a = str;
    }
}
