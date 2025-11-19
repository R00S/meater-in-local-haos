package T8;

import T8.G;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes2.dex */
final class E extends G.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16256a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16257b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16258c;

    E(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f16256a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f16257b = str2;
        this.f16258c = z10;
    }

    @Override // T8.G.c
    public boolean b() {
        return this.f16258c;
    }

    @Override // T8.G.c
    public String c() {
        return this.f16257b;
    }

    @Override // T8.G.c
    public String d() {
        return this.f16256a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.c)) {
            return false;
        }
        G.c cVar = (G.c) obj;
        return this.f16256a.equals(cVar.d()) && this.f16257b.equals(cVar.c()) && this.f16258c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f16256a.hashCode() ^ 1000003) * 1000003) ^ this.f16257b.hashCode()) * 1000003) ^ (this.f16258c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f16256a + ", osCodeName=" + this.f16257b + ", isRooted=" + this.f16258c + "}";
    }
}
