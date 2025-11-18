package com.google.firebase.p204r;

import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* renamed from: com.google.firebase.r.e */
/* loaded from: classes2.dex */
final class C8487e extends AbstractC8494l {

    /* renamed from: a */
    private final String f32102a;

    /* renamed from: b */
    private final List<String> f32103b;

    C8487e(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f32102a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f32103b = list;
    }

    @Override // com.google.firebase.p204r.AbstractC8494l
    /* renamed from: b */
    public List<String> mo26680b() {
        return this.f32103b;
    }

    @Override // com.google.firebase.p204r.AbstractC8494l
    /* renamed from: c */
    public String mo26681c() {
        return this.f32102a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8494l)) {
            return false;
        }
        AbstractC8494l abstractC8494l = (AbstractC8494l) obj;
        return this.f32102a.equals(abstractC8494l.mo26681c()) && this.f32103b.equals(abstractC8494l.mo26680b());
    }

    public int hashCode() {
        return ((this.f32102a.hashCode() ^ 1000003) * 1000003) ^ this.f32103b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f32102a + ", usedDates=" + this.f32103b + "}";
    }
}
