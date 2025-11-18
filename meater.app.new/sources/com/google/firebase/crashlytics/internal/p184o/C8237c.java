package com.google.firebase.crashlytics.internal.p184o;

/* compiled from: AutoValue_RolloutAssignment.java */
/* renamed from: com.google.firebase.crashlytics.h.o.c */
/* loaded from: classes2.dex */
final class C8237c extends AbstractC8244j {

    /* renamed from: b */
    private final String f31071b;

    /* renamed from: c */
    private final String f31072c;

    /* renamed from: d */
    private final String f31073d;

    /* renamed from: e */
    private final String f31074e;

    /* renamed from: f */
    private final long f31075f;

    C8237c(String str, String str2, String str3, String str4, long j2) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f31071b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f31072c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f31073d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f31074e = str4;
        this.f31075f = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.AbstractC8244j
    /* renamed from: c */
    public String mo25458c() {
        return this.f31072c;
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.AbstractC8244j
    /* renamed from: d */
    public String mo25459d() {
        return this.f31073d;
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.AbstractC8244j
    /* renamed from: e */
    public String mo25460e() {
        return this.f31071b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8244j)) {
            return false;
        }
        AbstractC8244j abstractC8244j = (AbstractC8244j) obj;
        return this.f31071b.equals(abstractC8244j.mo25460e()) && this.f31072c.equals(abstractC8244j.mo25458c()) && this.f31073d.equals(abstractC8244j.mo25459d()) && this.f31074e.equals(abstractC8244j.mo25462g()) && this.f31075f == abstractC8244j.mo25461f();
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.AbstractC8244j
    /* renamed from: f */
    public long mo25461f() {
        return this.f31075f;
    }

    @Override // com.google.firebase.crashlytics.internal.p184o.AbstractC8244j
    /* renamed from: g */
    public String mo25462g() {
        return this.f31074e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f31071b.hashCode() ^ 1000003) * 1000003) ^ this.f31072c.hashCode()) * 1000003) ^ this.f31073d.hashCode()) * 1000003) ^ this.f31074e.hashCode()) * 1000003;
        long j2 = this.f31075f;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f31071b + ", parameterKey=" + this.f31072c + ", parameterValue=" + this.f31073d + ", variantId=" + this.f31074e + ", templateVersion=" + this.f31075f + "}";
    }
}
