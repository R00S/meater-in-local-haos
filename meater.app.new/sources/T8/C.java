package T8;

import T8.G;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes2.dex */
final class C extends G.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f16241a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16242b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16243c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16244d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16245e;

    /* renamed from: f, reason: collision with root package name */
    private final N8.f f16246f;

    C(String str, String str2, String str3, String str4, int i10, N8.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f16241a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f16242b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f16243c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f16244d = str4;
        this.f16245e = i10;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f16246f = fVar;
    }

    @Override // T8.G.a
    public String a() {
        return this.f16241a;
    }

    @Override // T8.G.a
    public int c() {
        return this.f16245e;
    }

    @Override // T8.G.a
    public N8.f d() {
        return this.f16246f;
    }

    @Override // T8.G.a
    public String e() {
        return this.f16244d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.a)) {
            return false;
        }
        G.a aVar = (G.a) obj;
        return this.f16241a.equals(aVar.a()) && this.f16242b.equals(aVar.f()) && this.f16243c.equals(aVar.g()) && this.f16244d.equals(aVar.e()) && this.f16245e == aVar.c() && this.f16246f.equals(aVar.d());
    }

    @Override // T8.G.a
    public String f() {
        return this.f16242b;
    }

    @Override // T8.G.a
    public String g() {
        return this.f16243c;
    }

    public int hashCode() {
        return ((((((((((this.f16241a.hashCode() ^ 1000003) * 1000003) ^ this.f16242b.hashCode()) * 1000003) ^ this.f16243c.hashCode()) * 1000003) ^ this.f16244d.hashCode()) * 1000003) ^ this.f16245e) * 1000003) ^ this.f16246f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f16241a + ", versionCode=" + this.f16242b + ", versionName=" + this.f16243c + ", installUuid=" + this.f16244d + ", deliveryMechanism=" + this.f16245e + ", developmentPlatformProvider=" + this.f16246f + "}";
    }
}
