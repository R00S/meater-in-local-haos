package androidx.work.impl.p016n;

/* compiled from: SystemIdInfo.java */
/* renamed from: androidx.work.impl.n.g */
/* loaded from: classes.dex */
public class C0766g {

    /* renamed from: a */
    public final String f4776a;

    /* renamed from: b */
    public final int f4777b;

    public C0766g(String str, int i2) {
        this.f4776a = str;
        this.f4777b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0766g)) {
            return false;
        }
        C0766g c0766g = (C0766g) obj;
        if (this.f4777b != c0766g.f4777b) {
            return false;
        }
        return this.f4776a.equals(c0766g.f4776a);
    }

    public int hashCode() {
        return (this.f4776a.hashCode() * 31) + this.f4777b;
    }
}
