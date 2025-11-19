package T8;

import T8.G;

/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes2.dex */
final class B extends G {

    /* renamed from: a, reason: collision with root package name */
    private final G.a f16238a;

    /* renamed from: b, reason: collision with root package name */
    private final G.c f16239b;

    /* renamed from: c, reason: collision with root package name */
    private final G.b f16240c;

    B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f16238a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f16239b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f16240c = bVar;
    }

    @Override // T8.G
    public G.a a() {
        return this.f16238a;
    }

    @Override // T8.G
    public G.b c() {
        return this.f16240c;
    }

    @Override // T8.G
    public G.c d() {
        return this.f16239b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        return this.f16238a.equals(g10.a()) && this.f16239b.equals(g10.d()) && this.f16240c.equals(g10.c());
    }

    public int hashCode() {
        return ((((this.f16238a.hashCode() ^ 1000003) * 1000003) ^ this.f16239b.hashCode()) * 1000003) ^ this.f16240c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f16238a + ", osData=" + this.f16239b + ", deviceData=" + this.f16240c + "}";
    }
}
