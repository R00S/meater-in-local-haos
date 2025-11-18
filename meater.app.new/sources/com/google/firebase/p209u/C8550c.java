package com.google.firebase.p209u;

/* compiled from: AutoValue_LibraryVersion.java */
/* renamed from: com.google.firebase.u.c */
/* loaded from: classes2.dex */
final class C8550c extends AbstractC8554g {

    /* renamed from: a */
    private final String f32405a;

    /* renamed from: b */
    private final String f32406b;

    C8550c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f32405a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f32406b = str2;
    }

    @Override // com.google.firebase.p209u.AbstractC8554g
    /* renamed from: b */
    public String mo26893b() {
        return this.f32405a;
    }

    @Override // com.google.firebase.p209u.AbstractC8554g
    /* renamed from: c */
    public String mo26894c() {
        return this.f32406b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8554g)) {
            return false;
        }
        AbstractC8554g abstractC8554g = (AbstractC8554g) obj;
        return this.f32405a.equals(abstractC8554g.mo26893b()) && this.f32406b.equals(abstractC8554g.mo26894c());
    }

    public int hashCode() {
        return ((this.f32405a.hashCode() ^ 1000003) * 1000003) ^ this.f32406b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f32405a + ", version=" + this.f32406b + "}";
    }
}
