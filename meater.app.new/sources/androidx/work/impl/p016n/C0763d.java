package androidx.work.impl.p016n;

/* compiled from: Preference.java */
/* renamed from: androidx.work.impl.n.d */
/* loaded from: classes.dex */
public class C0763d {

    /* renamed from: a */
    public String f4771a;

    /* renamed from: b */
    public Long f4772b;

    public C0763d(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0763d)) {
            return false;
        }
        C0763d c0763d = (C0763d) obj;
        if (!this.f4771a.equals(c0763d.f4771a)) {
            return false;
        }
        Long l = this.f4772b;
        Long l2 = c0763d.f4772b;
        return l != null ? l.equals(l2) : l2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f4771a.hashCode() * 31;
        Long l = this.f4772b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public C0763d(String str, long j2) {
        this.f4771a = str;
        this.f4772b = Long.valueOf(j2);
    }
}
