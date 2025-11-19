package H9;

import H9.d;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes2.dex */
final class b extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f5614b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5615c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5616d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5617e;

    /* renamed from: f, reason: collision with root package name */
    private final long f5618f;

    /* compiled from: AutoValue_RolloutAssignment.java */
    /* renamed from: H9.b$b, reason: collision with other inner class name */
    static final class C0109b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f5619a;

        /* renamed from: b, reason: collision with root package name */
        private String f5620b;

        /* renamed from: c, reason: collision with root package name */
        private String f5621c;

        /* renamed from: d, reason: collision with root package name */
        private String f5622d;

        /* renamed from: e, reason: collision with root package name */
        private long f5623e;

        /* renamed from: f, reason: collision with root package name */
        private byte f5624f;

        C0109b() {
        }

        @Override // H9.d.a
        public d a() {
            if (this.f5624f == 1 && this.f5619a != null && this.f5620b != null && this.f5621c != null && this.f5622d != null) {
                return new b(this.f5619a, this.f5620b, this.f5621c, this.f5622d, this.f5623e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f5619a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f5620b == null) {
                sb2.append(" variantId");
            }
            if (this.f5621c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f5622d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f5624f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // H9.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f5621c = str;
            return this;
        }

        @Override // H9.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f5622d = str;
            return this;
        }

        @Override // H9.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f5619a = str;
            return this;
        }

        @Override // H9.d.a
        public d.a e(long j10) {
            this.f5623e = j10;
            this.f5624f = (byte) (this.f5624f | 1);
            return this;
        }

        @Override // H9.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f5620b = str;
            return this;
        }
    }

    @Override // H9.d
    public String b() {
        return this.f5616d;
    }

    @Override // H9.d
    public String c() {
        return this.f5617e;
    }

    @Override // H9.d
    public String d() {
        return this.f5614b;
    }

    @Override // H9.d
    public long e() {
        return this.f5618f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f5614b.equals(dVar.d()) && this.f5615c.equals(dVar.f()) && this.f5616d.equals(dVar.b()) && this.f5617e.equals(dVar.c()) && this.f5618f == dVar.e();
    }

    @Override // H9.d
    public String f() {
        return this.f5615c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f5614b.hashCode() ^ 1000003) * 1000003) ^ this.f5615c.hashCode()) * 1000003) ^ this.f5616d.hashCode()) * 1000003) ^ this.f5617e.hashCode()) * 1000003;
        long j10 = this.f5618f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f5614b + ", variantId=" + this.f5615c + ", parameterKey=" + this.f5616d + ", parameterValue=" + this.f5617e + ", templateVersion=" + this.f5618f + "}";
    }

    private b(String str, String str2, String str3, String str4, long j10) {
        this.f5614b = str;
        this.f5615c = str2;
        this.f5616d = str3;
        this.f5617e = str4;
        this.f5618f = j10;
    }
}
