package com.google.firebase.crashlytics.internal.p183n;

import com.google.firebase.crashlytics.internal.p183n.InterfaceC8211j0;

/* compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* renamed from: com.google.firebase.crashlytics.h.n.n */
/* loaded from: classes2.dex */
final class C8218n extends InterfaceC8211j0.a {

    /* renamed from: a */
    private final String f30944a;

    /* renamed from: b */
    private final String f30945b;

    C8218n(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f30944a = str;
        this.f30945b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8211j0.a
    /* renamed from: c */
    public String mo25270c() {
        return this.f30944a;
    }

    @Override // com.google.firebase.crashlytics.internal.p183n.InterfaceC8211j0.a
    /* renamed from: d */
    public String mo25271d() {
        return this.f30945b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC8211j0.a)) {
            return false;
        }
        InterfaceC8211j0.a aVar = (InterfaceC8211j0.a) obj;
        if (this.f30944a.equals(aVar.mo25270c())) {
            String str = this.f30945b;
            if (str == null) {
                if (aVar.mo25271d() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo25271d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f30944a.hashCode() ^ 1000003) * 1000003;
        String str = this.f30945b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f30944a + ", firebaseInstallationId=" + this.f30945b + "}";
    }
}
