package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* renamed from: com.google.firebase.crashlytics.h.p.j */
/* loaded from: classes2.dex */
final class C8273j extends AbstractC8258f0.e.a.b {

    /* renamed from: a */
    private final String f31400a;

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.a.b
    /* renamed from: a */
    public String mo25714a() {
        return this.f31400a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8258f0.e.a.b) {
            return this.f31400a.equals(((AbstractC8258f0.e.a.b) obj).mo25714a());
        }
        return false;
    }

    public int hashCode() {
        return this.f31400a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f31400a + "}";
    }
}
