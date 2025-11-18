package Db;

import kotlin.jvm.internal.C3862t;

/* compiled from: IncompatibleVersionErrorData.kt */
/* renamed from: Db.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1018y<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f3736a;

    /* renamed from: b, reason: collision with root package name */
    private final T f3737b;

    /* renamed from: c, reason: collision with root package name */
    private final T f3738c;

    /* renamed from: d, reason: collision with root package name */
    private final T f3739d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3740e;

    /* renamed from: f, reason: collision with root package name */
    private final qb.b f3741f;

    public C1018y(T t10, T t11, T t12, T t13, String filePath, qb.b classId) {
        C3862t.g(filePath, "filePath");
        C3862t.g(classId, "classId");
        this.f3736a = t10;
        this.f3737b = t11;
        this.f3738c = t12;
        this.f3739d = t13;
        this.f3740e = filePath;
        this.f3741f = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1018y)) {
            return false;
        }
        C1018y c1018y = (C1018y) obj;
        return C3862t.b(this.f3736a, c1018y.f3736a) && C3862t.b(this.f3737b, c1018y.f3737b) && C3862t.b(this.f3738c, c1018y.f3738c) && C3862t.b(this.f3739d, c1018y.f3739d) && C3862t.b(this.f3740e, c1018y.f3740e) && C3862t.b(this.f3741f, c1018y.f3741f);
    }

    public int hashCode() {
        T t10 = this.f3736a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f3737b;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.f3738c;
        int iHashCode3 = (iHashCode2 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f3739d;
        return ((((iHashCode3 + (t13 != null ? t13.hashCode() : 0)) * 31) + this.f3740e.hashCode()) * 31) + this.f3741f.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f3736a + ", compilerVersion=" + this.f3737b + ", languageVersion=" + this.f3738c + ", expectedVersion=" + this.f3739d + ", filePath=" + this.f3740e + ", classId=" + this.f3741f + ')';
    }
}
