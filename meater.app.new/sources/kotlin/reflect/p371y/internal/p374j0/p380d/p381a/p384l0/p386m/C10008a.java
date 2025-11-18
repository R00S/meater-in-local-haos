package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p386m;

import java.util.Set;
import kotlin.collections.C10820v0;
import kotlin.collections.C10824x0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.EnumC9973k;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;

/* compiled from: JavaTypeResolver.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.m.a */
/* loaded from: classes2.dex */
public final class C10008a {

    /* renamed from: a */
    private final EnumC9973k f38153a;

    /* renamed from: b */
    private final EnumC10009b f38154b;

    /* renamed from: c */
    private final boolean f38155c;

    /* renamed from: d */
    private final Set<InterfaceC10587e1> f38156d;

    /* renamed from: e */
    private final AbstractC10368m0 f38157e;

    /* JADX WARN: Multi-variable type inference failed */
    public C10008a(EnumC9973k enumC9973k, EnumC10009b enumC10009b, boolean z, Set<? extends InterfaceC10587e1> set, AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(enumC9973k, "howThisTypeIsUsed");
        C9801m.m32346f(enumC10009b, "flexibility");
        this.f38153a = enumC9973k;
        this.f38154b = enumC10009b;
        this.f38155c = z;
        this.f38156d = set;
        this.f38157e = abstractC10368m0;
    }

    /* renamed from: b */
    public static /* synthetic */ C10008a m33499b(C10008a c10008a, EnumC9973k enumC9973k, EnumC10009b enumC10009b, boolean z, Set set, AbstractC10368m0 abstractC10368m0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enumC9973k = c10008a.f38153a;
        }
        if ((i2 & 2) != 0) {
            enumC10009b = c10008a.f38154b;
        }
        EnumC10009b enumC10009b2 = enumC10009b;
        if ((i2 & 4) != 0) {
            z = c10008a.f38155c;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            set = c10008a.f38156d;
        }
        Set set2 = set;
        if ((i2 & 16) != 0) {
            abstractC10368m0 = c10008a.f38157e;
        }
        return c10008a.m33500a(enumC9973k, enumC10009b2, z2, set2, abstractC10368m0);
    }

    /* renamed from: a */
    public final C10008a m33500a(EnumC9973k enumC9973k, EnumC10009b enumC10009b, boolean z, Set<? extends InterfaceC10587e1> set, AbstractC10368m0 abstractC10368m0) {
        C9801m.m32346f(enumC9973k, "howThisTypeIsUsed");
        C9801m.m32346f(enumC10009b, "flexibility");
        return new C10008a(enumC9973k, enumC10009b, z, set, abstractC10368m0);
    }

    /* renamed from: c */
    public final AbstractC10368m0 m33501c() {
        return this.f38157e;
    }

    /* renamed from: d */
    public final EnumC10009b m33502d() {
        return this.f38154b;
    }

    /* renamed from: e */
    public final EnumC9973k m33503e() {
        return this.f38153a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10008a)) {
            return false;
        }
        C10008a c10008a = (C10008a) obj;
        return this.f38153a == c10008a.f38153a && this.f38154b == c10008a.f38154b && this.f38155c == c10008a.f38155c && C9801m.m32341a(this.f38156d, c10008a.f38156d) && C9801m.m32341a(this.f38157e, c10008a.f38157e);
    }

    /* renamed from: f */
    public final Set<InterfaceC10587e1> m33504f() {
        return this.f38156d;
    }

    /* renamed from: g */
    public final boolean m33505g() {
        return this.f38155c;
    }

    /* renamed from: h */
    public final C10008a m33506h(AbstractC10368m0 abstractC10368m0) {
        return m33499b(this, null, null, false, null, abstractC10368m0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((this.f38153a.hashCode() * 31) + this.f38154b.hashCode()) * 31;
        boolean z = this.f38155c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (iHashCode + i2) * 31;
        Set<InterfaceC10587e1> set = this.f38156d;
        int iHashCode2 = (i3 + (set == null ? 0 : set.hashCode())) * 31;
        AbstractC10368m0 abstractC10368m0 = this.f38157e;
        return iHashCode2 + (abstractC10368m0 != null ? abstractC10368m0.hashCode() : 0);
    }

    /* renamed from: i */
    public final C10008a m33507i(EnumC10009b enumC10009b) {
        C9801m.m32346f(enumC10009b, "flexibility");
        return m33499b(this, null, enumC10009b, false, null, null, 29, null);
    }

    /* renamed from: j */
    public final C10008a m33508j(InterfaceC10587e1 interfaceC10587e1) {
        C9801m.m32346f(interfaceC10587e1, "typeParameter");
        Set<InterfaceC10587e1> set = this.f38156d;
        return m33499b(this, null, null, false, set != null ? C10824x0.m38926m(set, interfaceC10587e1) : C10820v0.m38916c(interfaceC10587e1), null, 23, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f38153a + ", flexibility=" + this.f38154b + ", isForAnnotationParameter=" + this.f38155c + ", visitedTypeParameters=" + this.f38156d + ", defaultType=" + this.f38157e + ')';
    }

    public /* synthetic */ C10008a(EnumC9973k enumC9973k, EnumC10009b enumC10009b, boolean z, Set set, AbstractC10368m0 abstractC10368m0, int i2, C9789g c9789g) {
        this(enumC9973k, (i2 & 2) != 0 ? EnumC10009b.INFLEXIBLE : enumC10009b, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : set, (i2 & 16) != 0 ? null : abstractC10368m0);
    }
}
