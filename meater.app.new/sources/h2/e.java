package h2;

import X1.L;

/* compiled from: Descriptor.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f42244a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42245b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42246c;

    public e(String str, String str2, String str3) {
        this.f42244a = str;
        this.f42245b = str2;
        this.f42246c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return L.d(this.f42244a, eVar.f42244a) && L.d(this.f42245b, eVar.f42245b) && L.d(this.f42246c, eVar.f42246c);
    }

    public int hashCode() {
        int iHashCode = this.f42244a.hashCode() * 31;
        String str = this.f42245b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f42246c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
