package S8;

/* compiled from: AutoValue_RolloutAssignment.java */
/* loaded from: classes2.dex */
final class b extends j {

    /* renamed from: b, reason: collision with root package name */
    private final String f15527b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15528c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15529d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15530e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15531f;

    b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f15527b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f15528c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f15529d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f15530e = str4;
        this.f15531f = j10;
    }

    @Override // S8.j
    public String c() {
        return this.f15528c;
    }

    @Override // S8.j
    public String d() {
        return this.f15529d;
    }

    @Override // S8.j
    public String e() {
        return this.f15527b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f15527b.equals(jVar.e()) && this.f15528c.equals(jVar.c()) && this.f15529d.equals(jVar.d()) && this.f15530e.equals(jVar.g()) && this.f15531f == jVar.f();
    }

    @Override // S8.j
    public long f() {
        return this.f15531f;
    }

    @Override // S8.j
    public String g() {
        return this.f15530e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f15527b.hashCode() ^ 1000003) * 1000003) ^ this.f15528c.hashCode()) * 1000003) ^ this.f15529d.hashCode()) * 1000003) ^ this.f15530e.hashCode()) * 1000003;
        long j10 = this.f15531f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f15527b + ", parameterKey=" + this.f15528c + ", parameterValue=" + this.f15529d + ", variantId=" + this.f15530e + ", templateVersion=" + this.f15531f + "}";
    }
}
