package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* renamed from: com.google.firebase.crashlytics.h.p.e0 */
/* loaded from: classes2.dex */
final class C8256e0 extends AbstractC8260g0.c {

    /* renamed from: a */
    private final String f31340a;

    /* renamed from: b */
    private final String f31341b;

    /* renamed from: c */
    private final boolean f31342c;

    C8256e0(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f31340a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f31341b = str2;
        this.f31342c = z;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.c
    /* renamed from: b */
    public boolean mo25655b() {
        return this.f31342c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.c
    /* renamed from: c */
    public String mo25656c() {
        return this.f31341b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.c
    /* renamed from: d */
    public String mo25657d() {
        return this.f31340a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8260g0.c)) {
            return false;
        }
        AbstractC8260g0.c cVar = (AbstractC8260g0.c) obj;
        return this.f31340a.equals(cVar.mo25657d()) && this.f31341b.equals(cVar.mo25656c()) && this.f31342c == cVar.mo25655b();
    }

    public int hashCode() {
        return ((((this.f31340a.hashCode() ^ 1000003) * 1000003) ^ this.f31341b.hashCode()) * 1000003) ^ (this.f31342c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f31340a + ", osCodeName=" + this.f31341b + ", isRooted=" + this.f31342c + "}";
    }
}
