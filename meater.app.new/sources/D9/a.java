package D9;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes2.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f3580a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3581b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f3580a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f3581b = str2;
    }

    @Override // D9.f
    public String b() {
        return this.f3580a;
    }

    @Override // D9.f
    public String c() {
        return this.f3581b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3580a.equals(fVar.b()) && this.f3581b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f3580a.hashCode() ^ 1000003) * 1000003) ^ this.f3581b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f3580a + ", version=" + this.f3581b + "}";
    }
}
