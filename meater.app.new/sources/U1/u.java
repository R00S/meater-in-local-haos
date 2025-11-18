package U1;

/* compiled from: Label.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    private static final String f17222c = X1.L.B0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f17223d = X1.L.B0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f17224a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17225b;

    public u(String str, String str2) {
        this.f17224a = X1.L.T0(str);
        this.f17225b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return X1.L.d(this.f17224a, uVar.f17224a) && X1.L.d(this.f17225b, uVar.f17225b);
    }

    public int hashCode() {
        int iHashCode = this.f17225b.hashCode() * 31;
        String str = this.f17224a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
