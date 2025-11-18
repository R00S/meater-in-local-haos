package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0;

/* compiled from: AutoValue_StaticSessionData_DeviceData.java */
/* renamed from: com.google.firebase.crashlytics.h.p.d0 */
/* loaded from: classes2.dex */
final class C8254d0 extends AbstractC8260g0.b {

    /* renamed from: a */
    private final int f31327a;

    /* renamed from: b */
    private final String f31328b;

    /* renamed from: c */
    private final int f31329c;

    /* renamed from: d */
    private final long f31330d;

    /* renamed from: e */
    private final long f31331e;

    /* renamed from: f */
    private final boolean f31332f;

    /* renamed from: g */
    private final int f31333g;

    /* renamed from: h */
    private final String f31334h;

    /* renamed from: i */
    private final String f31335i;

    C8254d0(int i2, String str, int i3, long j2, long j3, boolean z, int i4, String str2, String str3) {
        this.f31327a = i2;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f31328b = str;
        this.f31329c = i3;
        this.f31330d = j2;
        this.f31331e = j3;
        this.f31332f = z;
        this.f31333g = i4;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f31334h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f31335i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: a */
    public int mo25641a() {
        return this.f31327a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: b */
    public int mo25642b() {
        return this.f31329c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: d */
    public long mo25643d() {
        return this.f31331e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: e */
    public boolean mo25644e() {
        return this.f31332f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8260g0.b)) {
            return false;
        }
        AbstractC8260g0.b bVar = (AbstractC8260g0.b) obj;
        return this.f31327a == bVar.mo25641a() && this.f31328b.equals(bVar.mo25646g()) && this.f31329c == bVar.mo25642b() && this.f31330d == bVar.mo25649j() && this.f31331e == bVar.mo25643d() && this.f31332f == bVar.mo25644e() && this.f31333g == bVar.mo25648i() && this.f31334h.equals(bVar.mo25645f()) && this.f31335i.equals(bVar.mo25647h());
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: f */
    public String mo25645f() {
        return this.f31334h;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: g */
    public String mo25646g() {
        return this.f31328b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: h */
    public String mo25647h() {
        return this.f31335i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f31327a ^ 1000003) * 1000003) ^ this.f31328b.hashCode()) * 1000003) ^ this.f31329c) * 1000003;
        long j2 = this.f31330d;
        int i2 = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f31331e;
        return ((((((((i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.f31332f ? 1231 : 1237)) * 1000003) ^ this.f31333g) * 1000003) ^ this.f31334h.hashCode()) * 1000003) ^ this.f31335i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: i */
    public int mo25648i() {
        return this.f31333g;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0.b
    /* renamed from: j */
    public long mo25649j() {
        return this.f31330d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f31327a + ", model=" + this.f31328b + ", availableProcessors=" + this.f31329c + ", totalRam=" + this.f31330d + ", diskSpace=" + this.f31331e + ", isEmulator=" + this.f31332f + ", state=" + this.f31333g + ", manufacturer=" + this.f31334h + ", modelClass=" + this.f31335i + "}";
    }
}
