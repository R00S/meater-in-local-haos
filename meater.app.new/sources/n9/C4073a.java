package n9;

import n9.d;

/* compiled from: AutoValue_InstallationResponse.java */
/* renamed from: n9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4073a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f45737a;

    /* renamed from: b, reason: collision with root package name */
    private final String f45738b;

    /* renamed from: c, reason: collision with root package name */
    private final String f45739c;

    /* renamed from: d, reason: collision with root package name */
    private final f f45740d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f45741e;

    /* compiled from: AutoValue_InstallationResponse.java */
    /* renamed from: n9.a$b */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f45742a;

        /* renamed from: b, reason: collision with root package name */
        private String f45743b;

        /* renamed from: c, reason: collision with root package name */
        private String f45744c;

        /* renamed from: d, reason: collision with root package name */
        private f f45745d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f45746e;

        b() {
        }

        @Override // n9.d.a
        public d a() {
            return new C4073a(this.f45742a, this.f45743b, this.f45744c, this.f45745d, this.f45746e);
        }

        @Override // n9.d.a
        public d.a b(f fVar) {
            this.f45745d = fVar;
            return this;
        }

        @Override // n9.d.a
        public d.a c(String str) {
            this.f45743b = str;
            return this;
        }

        @Override // n9.d.a
        public d.a d(String str) {
            this.f45744c = str;
            return this;
        }

        @Override // n9.d.a
        public d.a e(d.b bVar) {
            this.f45746e = bVar;
            return this;
        }

        @Override // n9.d.a
        public d.a f(String str) {
            this.f45742a = str;
            return this;
        }
    }

    @Override // n9.d
    public f b() {
        return this.f45740d;
    }

    @Override // n9.d
    public String c() {
        return this.f45738b;
    }

    @Override // n9.d
    public String d() {
        return this.f45739c;
    }

    @Override // n9.d
    public d.b e() {
        return this.f45741e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f45737a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f45738b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f45739c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f45740d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f45741e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // n9.d
    public String f() {
        return this.f45737a;
    }

    public int hashCode() {
        String str = this.f45737a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f45738b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f45739c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f45740d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f45741e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f45737a + ", fid=" + this.f45738b + ", refreshToken=" + this.f45739c + ", authToken=" + this.f45740d + ", responseCode=" + this.f45741e + "}";
    }

    private C4073a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f45737a = str;
        this.f45738b = str2;
        this.f45739c = str3;
        this.f45740d = fVar;
        this.f45741e = bVar;
    }
}
