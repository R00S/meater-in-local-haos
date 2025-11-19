package U6;

/* compiled from: AutoValue_PersistedEvent.java */
/* renamed from: U6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1740b extends AbstractC1749k {

    /* renamed from: a, reason: collision with root package name */
    private final long f17612a;

    /* renamed from: b, reason: collision with root package name */
    private final M6.p f17613b;

    /* renamed from: c, reason: collision with root package name */
    private final M6.i f17614c;

    C1740b(long j10, M6.p pVar, M6.i iVar) {
        this.f17612a = j10;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f17613b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f17614c = iVar;
    }

    @Override // U6.AbstractC1749k
    public M6.i b() {
        return this.f17614c;
    }

    @Override // U6.AbstractC1749k
    public long c() {
        return this.f17612a;
    }

    @Override // U6.AbstractC1749k
    public M6.p d() {
        return this.f17613b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1749k)) {
            return false;
        }
        AbstractC1749k abstractC1749k = (AbstractC1749k) obj;
        return this.f17612a == abstractC1749k.c() && this.f17613b.equals(abstractC1749k.d()) && this.f17614c.equals(abstractC1749k.b());
    }

    public int hashCode() {
        long j10 = this.f17612a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f17613b.hashCode()) * 1000003) ^ this.f17614c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f17612a + ", transportContext=" + this.f17613b + ", event=" + this.f17614c + "}";
    }
}
