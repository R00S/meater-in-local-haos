package L6;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes2.dex */
final class l extends v {

    /* renamed from: a, reason: collision with root package name */
    private final long f10974a;

    l(long j10) {
        this.f10974a = j10;
    }

    @Override // L6.v
    public long c() {
        return this.f10974a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f10974a == ((v) obj).c();
    }

    public int hashCode() {
        long j10 = this.f10974a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f10974a + "}";
    }
}
