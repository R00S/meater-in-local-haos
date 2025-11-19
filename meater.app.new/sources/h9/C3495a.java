package h9;

import java.util.List;

/* compiled from: AutoValue_HeartBeatResult.java */
/* renamed from: h9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3495a extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f42350a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f42351b;

    C3495a(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f42350a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f42351b = list;
    }

    @Override // h9.l
    public List<String> b() {
        return this.f42351b;
    }

    @Override // h9.l
    public String c() {
        return this.f42350a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f42350a.equals(lVar.c()) && this.f42351b.equals(lVar.b());
    }

    public int hashCode() {
        return ((this.f42350a.hashCode() ^ 1000003) * 1000003) ^ this.f42351b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f42350a + ", usedDates=" + this.f42351b + "}";
    }
}
