package L6;

import L6.r;

/* compiled from: AutoValue_ExternalPRequestContext.java */
/* loaded from: classes2.dex */
final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f10938a;

    /* compiled from: AutoValue_ExternalPRequestContext.java */
    static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f10939a;

        b() {
        }

        @Override // L6.r.a
        public r a() {
            return new h(this.f10939a);
        }

        @Override // L6.r.a
        public r.a b(Integer num) {
            this.f10939a = num;
            return this;
        }
    }

    @Override // L6.r
    public Integer b() {
        return this.f10938a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f10938a;
        Integer numB = ((r) obj).b();
        return num == null ? numB == null : num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f10938a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f10938a + "}";
    }

    private h(Integer num) {
        this.f10938a = num;
    }
}
