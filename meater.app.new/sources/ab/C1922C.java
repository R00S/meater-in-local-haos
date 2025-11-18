package ab;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4162g;

/* compiled from: JavaNullabilityAnnotationsStatus.kt */
/* renamed from: ab.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1922C {

    /* renamed from: d, reason: collision with root package name */
    public static final a f20116d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final C1922C f20117e = new C1922C(EnumC1934O.f20197F, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    private final EnumC1934O f20118a;

    /* renamed from: b, reason: collision with root package name */
    private final C4162g f20119b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC1934O f20120c;

    /* compiled from: JavaNullabilityAnnotationsStatus.kt */
    /* renamed from: ab.C$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final C1922C a() {
            return C1922C.f20117e;
        }

        private a() {
        }
    }

    public C1922C(EnumC1934O reportLevelBefore, C4162g c4162g, EnumC1934O reportLevelAfter) {
        C3862t.g(reportLevelBefore, "reportLevelBefore");
        C3862t.g(reportLevelAfter, "reportLevelAfter");
        this.f20118a = reportLevelBefore;
        this.f20119b = c4162g;
        this.f20120c = reportLevelAfter;
    }

    public final EnumC1934O b() {
        return this.f20120c;
    }

    public final EnumC1934O c() {
        return this.f20118a;
    }

    public final C4162g d() {
        return this.f20119b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1922C)) {
            return false;
        }
        C1922C c1922c = (C1922C) obj;
        return this.f20118a == c1922c.f20118a && C3862t.b(this.f20119b, c1922c.f20119b) && this.f20120c == c1922c.f20120c;
    }

    public int hashCode() {
        int iHashCode = this.f20118a.hashCode() * 31;
        C4162g c4162g = this.f20119b;
        return ((iHashCode + (c4162g == null ? 0 : c4162g.getVersion())) * 31) + this.f20120c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f20118a + ", sinceVersion=" + this.f20119b + ", reportLevelAfter=" + this.f20120c + ')';
    }

    public /* synthetic */ C1922C(EnumC1934O enumC1934O, C4162g c4162g, EnumC1934O enumC1934O2, int i10, C3854k c3854k) {
        this(enumC1934O, (i10 & 2) != 0 ? new C4162g(1, 0) : c4162g, (i10 & 4) != 0 ? enumC1934O : enumC1934O2);
    }
}
