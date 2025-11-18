package T8;

import T8.F;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* loaded from: classes2.dex */
final class j extends F.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f16508a;

    @Override // T8.F.e.a.b
    public String a() {
        return this.f16508a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.a.b) {
            return this.f16508a.equals(((F.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f16508a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f16508a + "}";
    }
}
