package Q8;

import Q8.M;

/* compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* renamed from: Q8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1616d extends M.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f14436a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14437b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14438c;

    C1616d(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f14436a = str;
        this.f14437b = str2;
        this.f14438c = str3;
    }

    @Override // Q8.M.a
    public String c() {
        return this.f14436a;
    }

    @Override // Q8.M.a
    public String d() {
        return this.f14438c;
    }

    @Override // Q8.M.a
    public String e() {
        return this.f14437b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M.a)) {
            return false;
        }
        M.a aVar = (M.a) obj;
        if (this.f14436a.equals(aVar.c()) && ((str = this.f14437b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f14438c;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f14436a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14437b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f14438c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f14436a + ", firebaseInstallationId=" + this.f14437b + ", firebaseAuthenticationToken=" + this.f14438c + "}";
    }
}
