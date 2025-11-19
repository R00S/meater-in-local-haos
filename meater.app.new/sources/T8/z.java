package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* loaded from: classes2.dex */
final class z extends F.e.AbstractC0252e {

    /* renamed from: a, reason: collision with root package name */
    private final int f16650a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16651b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16652c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16653d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    static final class b extends F.e.AbstractC0252e.a {

        /* renamed from: a, reason: collision with root package name */
        private int f16654a;

        /* renamed from: b, reason: collision with root package name */
        private String f16655b;

        /* renamed from: c, reason: collision with root package name */
        private String f16656c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16657d;

        /* renamed from: e, reason: collision with root package name */
        private byte f16658e;

        b() {
        }

        @Override // T8.F.e.AbstractC0252e.a
        public F.e.AbstractC0252e a() {
            String str;
            String str2;
            if (this.f16658e == 3 && (str = this.f16655b) != null && (str2 = this.f16656c) != null) {
                return new z(this.f16654a, str, str2, this.f16657d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f16658e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f16655b == null) {
                sb2.append(" version");
            }
            if (this.f16656c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f16658e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.AbstractC0252e.a
        public F.e.AbstractC0252e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f16656c = str;
            return this;
        }

        @Override // T8.F.e.AbstractC0252e.a
        public F.e.AbstractC0252e.a c(boolean z10) {
            this.f16657d = z10;
            this.f16658e = (byte) (this.f16658e | 2);
            return this;
        }

        @Override // T8.F.e.AbstractC0252e.a
        public F.e.AbstractC0252e.a d(int i10) {
            this.f16654a = i10;
            this.f16658e = (byte) (this.f16658e | 1);
            return this;
        }

        @Override // T8.F.e.AbstractC0252e.a
        public F.e.AbstractC0252e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f16655b = str;
            return this;
        }
    }

    @Override // T8.F.e.AbstractC0252e
    public String b() {
        return this.f16652c;
    }

    @Override // T8.F.e.AbstractC0252e
    public int c() {
        return this.f16650a;
    }

    @Override // T8.F.e.AbstractC0252e
    public String d() {
        return this.f16651b;
    }

    @Override // T8.F.e.AbstractC0252e
    public boolean e() {
        return this.f16653d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.AbstractC0252e)) {
            return false;
        }
        F.e.AbstractC0252e abstractC0252e = (F.e.AbstractC0252e) obj;
        return this.f16650a == abstractC0252e.c() && this.f16651b.equals(abstractC0252e.d()) && this.f16652c.equals(abstractC0252e.b()) && this.f16653d == abstractC0252e.e();
    }

    public int hashCode() {
        return ((((((this.f16650a ^ 1000003) * 1000003) ^ this.f16651b.hashCode()) * 1000003) ^ this.f16652c.hashCode()) * 1000003) ^ (this.f16653d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f16650a + ", version=" + this.f16651b + ", buildVersion=" + this.f16652c + ", jailbroken=" + this.f16653d + "}";
    }

    private z(int i10, String str, String str2, boolean z10) {
        this.f16650a = i10;
        this.f16651b = str;
        this.f16652c = str2;
        this.f16653d = z10;
    }
}
