package L6;

import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes2.dex */
final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    private final List<u> f10925a;

    d(List<u> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f10925a = list;
    }

    @Override // L6.n
    public List<u> c() {
        return this.f10925a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f10925a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f10925a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f10925a + "}";
    }
}
