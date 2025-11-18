package N6;

import N6.g;

/* compiled from: AutoValue_BackendResponse.java */
/* loaded from: classes2.dex */
final class b extends g {

    /* renamed from: a, reason: collision with root package name */
    private final g.a f12536a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12537b;

    b(g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f12536a = aVar;
        this.f12537b = j10;
    }

    @Override // N6.g
    public long b() {
        return this.f12537b;
    }

    @Override // N6.g
    public g.a c() {
        return this.f12536a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f12536a.equals(gVar.c()) && this.f12537b == gVar.b();
    }

    public int hashCode() {
        int iHashCode = (this.f12536a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f12537b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f12536a + ", nextRequestWaitMillis=" + this.f12537b + "}";
    }
}
