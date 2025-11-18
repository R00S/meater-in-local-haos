package ab;

import ib.C3678l;
import ib.EnumC3677k;
import java.util.Collection;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaDefaultQualifiers.kt */
/* renamed from: ab.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1963w {

    /* renamed from: a, reason: collision with root package name */
    private final C3678l f20274a;

    /* renamed from: b, reason: collision with root package name */
    private final Collection<EnumC1943c> f20275b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20276c;

    /* JADX WARN: Multi-variable type inference failed */
    public C1963w(C3678l nullabilityQualifier, Collection<? extends EnumC1943c> qualifierApplicabilityTypes, boolean z10) {
        C3862t.g(nullabilityQualifier, "nullabilityQualifier");
        C3862t.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f20274a = nullabilityQualifier;
        this.f20275b = qualifierApplicabilityTypes;
        this.f20276c = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C1963w b(C1963w c1963w, C3678l c3678l, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3678l = c1963w.f20274a;
        }
        if ((i10 & 2) != 0) {
            collection = c1963w.f20275b;
        }
        if ((i10 & 4) != 0) {
            z10 = c1963w.f20276c;
        }
        return c1963w.a(c3678l, collection, z10);
    }

    public final C1963w a(C3678l nullabilityQualifier, Collection<? extends EnumC1943c> qualifierApplicabilityTypes, boolean z10) {
        C3862t.g(nullabilityQualifier, "nullabilityQualifier");
        C3862t.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new C1963w(nullabilityQualifier, qualifierApplicabilityTypes, z10);
    }

    public final boolean c() {
        return this.f20276c;
    }

    public final C3678l d() {
        return this.f20274a;
    }

    public final Collection<EnumC1943c> e() {
        return this.f20275b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1963w)) {
            return false;
        }
        C1963w c1963w = (C1963w) obj;
        return C3862t.b(this.f20274a, c1963w.f20274a) && C3862t.b(this.f20275b, c1963w.f20275b) && this.f20276c == c1963w.f20276c;
    }

    public int hashCode() {
        return (((this.f20274a.hashCode() * 31) + this.f20275b.hashCode()) * 31) + Boolean.hashCode(this.f20276c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f20274a + ", qualifierApplicabilityTypes=" + this.f20275b + ", definitelyNotNull=" + this.f20276c + ')';
    }

    public /* synthetic */ C1963w(C3678l c3678l, Collection collection, boolean z10, int i10, C3854k c3854k) {
        this(c3678l, collection, (i10 & 4) != 0 ? c3678l.c() == EnumC3677k.f43279D : z10);
    }
}
