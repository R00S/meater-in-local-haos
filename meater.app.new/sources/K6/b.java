package K6;

/* compiled from: AutoValue_ProductData.java */
/* loaded from: classes2.dex */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f8715a;

    b(Integer num) {
        this.f8715a = num;
    }

    @Override // K6.g
    public Integer a() {
        return this.f8715a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        Integer num = this.f8715a;
        Integer numA = ((g) obj).a();
        return num == null ? numA == null : num.equals(numA);
    }

    public int hashCode() {
        Integer num = this.f8715a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f8715a + "}";
    }
}
