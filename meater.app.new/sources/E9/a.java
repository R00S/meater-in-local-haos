package E9;

import java.util.Set;

/* compiled from: AutoValue_ConfigUpdate.java */
/* loaded from: classes2.dex */
final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f4139a;

    a(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f4139a = set;
    }

    @Override // E9.b
    public Set<String> b() {
        return this.f4139a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f4139a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f4139a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f4139a + "}";
    }
}
