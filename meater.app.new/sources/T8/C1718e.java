package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* renamed from: T8.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1718e extends F.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16457a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16458b;

    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    /* renamed from: T8.e$b */
    static final class b extends F.c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16459a;

        /* renamed from: b, reason: collision with root package name */
        private String f16460b;

        b() {
        }

        @Override // T8.F.c.a
        public F.c a() {
            String str;
            String str2 = this.f16459a;
            if (str2 != null && (str = this.f16460b) != null) {
                return new C1718e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16459a == null) {
                sb2.append(" key");
            }
            if (this.f16460b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.c.a
        public F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f16459a = str;
            return this;
        }

        @Override // T8.F.c.a
        public F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f16460b = str;
            return this;
        }
    }

    @Override // T8.F.c
    public String b() {
        return this.f16457a;
    }

    @Override // T8.F.c
    public String c() {
        return this.f16458b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.c)) {
            return false;
        }
        F.c cVar = (F.c) obj;
        return this.f16457a.equals(cVar.b()) && this.f16458b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f16457a.hashCode() ^ 1000003) * 1000003) ^ this.f16458b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f16457a + ", value=" + this.f16458b + "}";
    }

    private C1718e(String str, String str2) {
        this.f16457a = str;
        this.f16458b = str2;
    }
}
