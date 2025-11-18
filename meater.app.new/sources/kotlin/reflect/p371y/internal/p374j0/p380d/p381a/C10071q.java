package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Collection;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10059i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10058h;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.q */
/* loaded from: classes2.dex */
public final class C10071q {

    /* renamed from: a */
    private final C10059i f38299a;

    /* renamed from: b */
    private final Collection<EnumC9946b> f38300b;

    /* renamed from: c */
    private final boolean f38301c;

    /* JADX WARN: Multi-variable type inference failed */
    public C10071q(C10059i c10059i, Collection<? extends EnumC9946b> collection, boolean z) {
        C9801m.m32346f(c10059i, "nullabilityQualifier");
        C9801m.m32346f(collection, "qualifierApplicabilityTypes");
        this.f38299a = c10059i;
        this.f38300b = collection;
        this.f38301c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ C10071q m33783b(C10071q c10071q, C10059i c10059i, Collection collection, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c10059i = c10071q.f38299a;
        }
        if ((i2 & 2) != 0) {
            collection = c10071q.f38300b;
        }
        if ((i2 & 4) != 0) {
            z = c10071q.f38301c;
        }
        return c10071q.m33784a(c10059i, collection, z);
    }

    /* renamed from: a */
    public final C10071q m33784a(C10059i c10059i, Collection<? extends EnumC9946b> collection, boolean z) {
        C9801m.m32346f(c10059i, "nullabilityQualifier");
        C9801m.m32346f(collection, "qualifierApplicabilityTypes");
        return new C10071q(c10059i, collection, z);
    }

    /* renamed from: c */
    public final boolean m33785c() {
        return this.f38301c;
    }

    /* renamed from: d */
    public final C10059i m33786d() {
        return this.f38299a;
    }

    /* renamed from: e */
    public final Collection<EnumC9946b> m33787e() {
        return this.f38300b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10071q)) {
            return false;
        }
        C10071q c10071q = (C10071q) obj;
        return C9801m.m32341a(this.f38299a, c10071q.f38299a) && C9801m.m32341a(this.f38300b, c10071q.f38300b) && this.f38301c == c10071q.f38301c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.f38299a.hashCode() * 31) + this.f38300b.hashCode()) * 31;
        boolean z = this.f38301c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return iHashCode + i2;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f38299a + ", qualifierApplicabilityTypes=" + this.f38300b + ", definitelyNotNull=" + this.f38301c + ')';
    }

    public /* synthetic */ C10071q(C10059i c10059i, Collection collection, boolean z, int i2, C9789g c9789g) {
        this(c10059i, collection, (i2 & 4) != 0 ? c10059i.m33701c() == EnumC10058h.NOT_NULL : z);
    }
}
