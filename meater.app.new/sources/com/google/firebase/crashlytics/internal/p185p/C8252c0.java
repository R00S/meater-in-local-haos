package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.C8178g;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* renamed from: com.google.firebase.crashlytics.h.p.c0 */
/* loaded from: classes2.dex */
final class C8252c0 extends AbstractC8260g0.a {

    /* renamed from: a */
    private final String f31315a;

    /* renamed from: b */
    private final String f31316b;

    /* renamed from: c */
    private final String f31317c;

    /* renamed from: d */
    private final String f31318d;

    /* renamed from: e */
    private final int f31319e;

    /* renamed from: f */
    private final C8178g f31320f;

    C8252c0(String str, String str2, String str3, String str4, int i2, C8178g c8178g) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f31315a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f31316b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f31317c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f31318d = str4;
        this.f31319e = i2;
        if (c8178g == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f31320f = c8178g;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.a
    /* renamed from: a */
    public String mo25628a() {
        return this.f31315a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.a
    /* renamed from: c */
    public int mo25629c() {
        return this.f31319e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.a
    /* renamed from: d */
    public C8178g mo25630d() {
        return this.f31320f;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.a
    /* renamed from: e */
    public String mo25631e() {
        return this.f31318d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8260g0.a)) {
            return false;
        }
        AbstractC8260g0.a aVar = (AbstractC8260g0.a) obj;
        return this.f31315a.equals(aVar.mo25628a()) && this.f31316b.equals(aVar.mo25632f()) && this.f31317c.equals(aVar.mo25633g()) && this.f31318d.equals(aVar.mo25631e()) && this.f31319e == aVar.mo25629c() && this.f31320f.equals(aVar.mo25630d());
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.a
    /* renamed from: f */
    public String mo25632f() {
        return this.f31316b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.a
    /* renamed from: g */
    public String mo25633g() {
        return this.f31317c;
    }

    public int hashCode() {
        return ((((((((((this.f31315a.hashCode() ^ 1000003) * 1000003) ^ this.f31316b.hashCode()) * 1000003) ^ this.f31317c.hashCode()) * 1000003) ^ this.f31318d.hashCode()) * 1000003) ^ this.f31319e) * 1000003) ^ this.f31320f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f31315a + ", versionCode=" + this.f31316b + ", versionName=" + this.f31317c + ", installUuid=" + this.f31318d + ", deliveryMechanism=" + this.f31319e + ", developmentPlatformProvider=" + this.f31320f + "}";
    }
}
