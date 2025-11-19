package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* loaded from: classes2.dex */
final class t extends F.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16611a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16612b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16613c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16614d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    static final class b extends F.e.d.a.c.AbstractC0249a {

        /* renamed from: a, reason: collision with root package name */
        private String f16615a;

        /* renamed from: b, reason: collision with root package name */
        private int f16616b;

        /* renamed from: c, reason: collision with root package name */
        private int f16617c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16618d;

        /* renamed from: e, reason: collision with root package name */
        private byte f16619e;

        b() {
        }

        @Override // T8.F.e.d.a.c.AbstractC0249a
        public F.e.d.a.c a() {
            String str;
            if (this.f16619e == 7 && (str = this.f16615a) != null) {
                return new t(str, this.f16616b, this.f16617c, this.f16618d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f16615a == null) {
                sb2.append(" processName");
            }
            if ((this.f16619e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f16619e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f16619e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // T8.F.e.d.a.c.AbstractC0249a
        public F.e.d.a.c.AbstractC0249a b(boolean z10) {
            this.f16618d = z10;
            this.f16619e = (byte) (this.f16619e | 4);
            return this;
        }

        @Override // T8.F.e.d.a.c.AbstractC0249a
        public F.e.d.a.c.AbstractC0249a c(int i10) {
            this.f16617c = i10;
            this.f16619e = (byte) (this.f16619e | 2);
            return this;
        }

        @Override // T8.F.e.d.a.c.AbstractC0249a
        public F.e.d.a.c.AbstractC0249a d(int i10) {
            this.f16616b = i10;
            this.f16619e = (byte) (this.f16619e | 1);
            return this;
        }

        @Override // T8.F.e.d.a.c.AbstractC0249a
        public F.e.d.a.c.AbstractC0249a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f16615a = str;
            return this;
        }
    }

    @Override // T8.F.e.d.a.c
    public int b() {
        return this.f16613c;
    }

    @Override // T8.F.e.d.a.c
    public int c() {
        return this.f16612b;
    }

    @Override // T8.F.e.d.a.c
    public String d() {
        return this.f16611a;
    }

    @Override // T8.F.e.d.a.c
    public boolean e() {
        return this.f16614d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.c)) {
            return false;
        }
        F.e.d.a.c cVar = (F.e.d.a.c) obj;
        return this.f16611a.equals(cVar.d()) && this.f16612b == cVar.c() && this.f16613c == cVar.b() && this.f16614d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f16611a.hashCode() ^ 1000003) * 1000003) ^ this.f16612b) * 1000003) ^ this.f16613c) * 1000003) ^ (this.f16614d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f16611a + ", pid=" + this.f16612b + ", importance=" + this.f16613c + ", defaultProcess=" + this.f16614d + "}";
    }

    private t(String str, int i10, int i11, boolean z10) {
        this.f16611a = str;
        this.f16612b = i10;
        this.f16613c = i11;
        this.f16614d = z10;
    }
}
