package H9;

import java.util.Set;

/* compiled from: AutoValue_RolloutsState.java */
/* loaded from: classes2.dex */
final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<d> f5625a;

    c(Set<d> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f5625a = set;
    }

    @Override // H9.e
    public Set<d> b() {
        return this.f5625a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f5625a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5625a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f5625a + "}";
    }
}
