package K6;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes2.dex */
final class a<T> extends d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f8711a;

    /* renamed from: b, reason: collision with root package name */
    private final T f8712b;

    /* renamed from: c, reason: collision with root package name */
    private final f f8713c;

    /* renamed from: d, reason: collision with root package name */
    private final g f8714d;

    a(Integer num, T t10, f fVar, g gVar, e eVar) {
        this.f8711a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f8712b = t10;
        if (fVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f8713c = fVar;
        this.f8714d = gVar;
    }

    @Override // K6.d
    public Integer a() {
        return this.f8711a;
    }

    @Override // K6.d
    public e b() {
        return null;
    }

    @Override // K6.d
    public T c() {
        return this.f8712b;
    }

    @Override // K6.d
    public f d() {
        return this.f8713c;
    }

    @Override // K6.d
    public g e() {
        return this.f8714d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.f8711a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.f8712b.equals(dVar.c()) && this.f8713c.equals(dVar.d()) && ((gVar = this.f8714d) != null ? gVar.equals(dVar.e()) : dVar.e() == null)) {
                dVar.b();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f8711a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f8712b.hashCode()) * 1000003) ^ this.f8713c.hashCode()) * 1000003;
        g gVar = this.f8714d;
        return (iHashCode ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f8711a + ", payload=" + this.f8712b + ", priority=" + this.f8713c + ", productData=" + this.f8714d + ", eventContext=" + ((Object) null) + "}";
    }
}
