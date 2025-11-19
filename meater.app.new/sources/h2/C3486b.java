package h2;

import l8.C3918k;

/* compiled from: BaseUrl.java */
/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3486b {

    /* renamed from: a, reason: collision with root package name */
    public final String f42213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42215c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42216d;

    public C3486b(String str, String str2, int i10, int i11) {
        this.f42213a = str;
        this.f42214b = str2;
        this.f42215c = i10;
        this.f42216d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3486b)) {
            return false;
        }
        C3486b c3486b = (C3486b) obj;
        return this.f42215c == c3486b.f42215c && this.f42216d == c3486b.f42216d && C3918k.a(this.f42213a, c3486b.f42213a) && C3918k.a(this.f42214b, c3486b.f42214b);
    }

    public int hashCode() {
        return C3918k.b(this.f42213a, this.f42214b, Integer.valueOf(this.f42215c), Integer.valueOf(this.f42216d));
    }
}
