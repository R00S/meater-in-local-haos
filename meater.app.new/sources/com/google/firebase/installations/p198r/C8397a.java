package com.google.firebase.installations.p198r;

import com.google.firebase.installations.p198r.AbstractC8400d;

/* compiled from: AutoValue_InstallationResponse.java */
/* renamed from: com.google.firebase.installations.r.a */
/* loaded from: classes2.dex */
final class C8397a extends AbstractC8400d {

    /* renamed from: a */
    private final String f31845a;

    /* renamed from: b */
    private final String f31846b;

    /* renamed from: c */
    private final String f31847c;

    /* renamed from: d */
    private final AbstractC8402f f31848d;

    /* renamed from: e */
    private final AbstractC8400d.b f31849e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* renamed from: com.google.firebase.installations.r.a$b */
    static final class b extends AbstractC8400d.a {

        /* renamed from: a */
        private String f31850a;

        /* renamed from: b */
        private String f31851b;

        /* renamed from: c */
        private String f31852c;

        /* renamed from: d */
        private AbstractC8402f f31853d;

        /* renamed from: e */
        private AbstractC8400d.b f31854e;

        b() {
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8400d.a
        /* renamed from: a */
        public AbstractC8400d mo26345a() {
            return new C8397a(this.f31850a, this.f31851b, this.f31852c, this.f31853d, this.f31854e);
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8400d.a
        /* renamed from: b */
        public AbstractC8400d.a mo26346b(AbstractC8402f abstractC8402f) {
            this.f31853d = abstractC8402f;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8400d.a
        /* renamed from: c */
        public AbstractC8400d.a mo26347c(String str) {
            this.f31851b = str;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8400d.a
        /* renamed from: d */
        public AbstractC8400d.a mo26348d(String str) {
            this.f31852c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8400d.a
        /* renamed from: e */
        public AbstractC8400d.a mo26349e(AbstractC8400d.b bVar) {
            this.f31854e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.p198r.AbstractC8400d.a
        /* renamed from: f */
        public AbstractC8400d.a mo26350f(String str) {
            this.f31850a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8400d
    /* renamed from: b */
    public AbstractC8402f mo26340b() {
        return this.f31848d;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8400d
    /* renamed from: c */
    public String mo26341c() {
        return this.f31846b;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8400d
    /* renamed from: d */
    public String mo26342d() {
        return this.f31847c;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8400d
    /* renamed from: e */
    public AbstractC8400d.b mo26343e() {
        return this.f31849e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8400d)) {
            return false;
        }
        AbstractC8400d abstractC8400d = (AbstractC8400d) obj;
        String str = this.f31845a;
        if (str != null ? str.equals(abstractC8400d.mo26344f()) : abstractC8400d.mo26344f() == null) {
            String str2 = this.f31846b;
            if (str2 != null ? str2.equals(abstractC8400d.mo26341c()) : abstractC8400d.mo26341c() == null) {
                String str3 = this.f31847c;
                if (str3 != null ? str3.equals(abstractC8400d.mo26342d()) : abstractC8400d.mo26342d() == null) {
                    AbstractC8402f abstractC8402f = this.f31848d;
                    if (abstractC8402f != null ? abstractC8402f.equals(abstractC8400d.mo26340b()) : abstractC8400d.mo26340b() == null) {
                        AbstractC8400d.b bVar = this.f31849e;
                        if (bVar == null) {
                            if (abstractC8400d.mo26343e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC8400d.mo26343e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.p198r.AbstractC8400d
    /* renamed from: f */
    public String mo26344f() {
        return this.f31845a;
    }

    public int hashCode() {
        String str = this.f31845a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f31846b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f31847c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC8402f abstractC8402f = this.f31848d;
        int iHashCode4 = (iHashCode3 ^ (abstractC8402f == null ? 0 : abstractC8402f.hashCode())) * 1000003;
        AbstractC8400d.b bVar = this.f31849e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f31845a + ", fid=" + this.f31846b + ", refreshToken=" + this.f31847c + ", authToken=" + this.f31848d + ", responseCode=" + this.f31849e + "}";
    }

    private C8397a(String str, String str2, String str3, AbstractC8402f abstractC8402f, AbstractC8400d.b bVar) {
        this.f31845a = str;
        this.f31846b = str2;
        this.f31847c = str3;
        this.f31848d = abstractC8402f;
        this.f31849e = bVar;
    }
}
