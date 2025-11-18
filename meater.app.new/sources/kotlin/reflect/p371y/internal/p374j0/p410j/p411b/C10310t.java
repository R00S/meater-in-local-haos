package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;

/* compiled from: IncompatibleVersionErrorData.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.t */
/* loaded from: classes3.dex */
public final class C10310t<T> {

    /* renamed from: a */
    private final T f39956a;

    /* renamed from: b */
    private final T f39957b;

    /* renamed from: c */
    private final String f39958c;

    /* renamed from: d */
    private final C10159b f39959d;

    public C10310t(T t, T t2, String str, C10159b c10159b) {
        C9801m.m32346f(str, "filePath");
        C9801m.m32346f(c10159b, "classId");
        this.f39956a = t;
        this.f39957b = t2;
        this.f39958c = str;
        this.f39959d = c10159b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10310t)) {
            return false;
        }
        C10310t c10310t = (C10310t) obj;
        return C9801m.m32341a(this.f39956a, c10310t.f39956a) && C9801m.m32341a(this.f39957b, c10310t.f39957b) && C9801m.m32341a(this.f39958c, c10310t.f39958c) && C9801m.m32341a(this.f39959d, c10310t.f39959d);
    }

    public int hashCode() {
        T t = this.f39956a;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f39957b;
        return ((((iHashCode + (t2 != null ? t2.hashCode() : 0)) * 31) + this.f39958c.hashCode()) * 31) + this.f39959d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f39956a + ", expectedVersion=" + this.f39957b + ", filePath=" + this.f39958c + ", classId=" + this.f39959d + ')';
    }
}
