package Hb;

/* compiled from: TypeProjectionBase.java */
/* loaded from: classes3.dex */
public abstract class F0 implements E0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return c() == e02.c() && b() == e02.b() && a().equals(e02.a());
    }

    public int hashCode() {
        int iHashCode = b().hashCode();
        if (M0.w(a())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : a().hashCode());
    }

    public String toString() {
        if (c()) {
            return "*";
        }
        if (b() == Q0.f5693F) {
            return a().toString();
        }
        return b() + " " + a();
    }
}
