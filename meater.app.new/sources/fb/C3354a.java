package fb;

import Hb.AbstractC1082f0;
import Hb.I;
import Hb.L0;
import Ra.m0;
import java.util.Set;
import kotlin.collections.V;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaTypeAttributes.kt */
/* renamed from: fb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3354a extends I {

    /* renamed from: d, reason: collision with root package name */
    private final L0 f41420d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC3356c f41421e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f41422f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f41423g;

    /* renamed from: h, reason: collision with root package name */
    private final Set<m0> f41424h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC1082f0 f41425i;

    public /* synthetic */ C3354a(L0 l02, EnumC3356c enumC3356c, boolean z10, boolean z11, Set set, AbstractC1082f0 abstractC1082f0, int i10, C3854k c3854k) {
        this(l02, (i10 & 2) != 0 ? EnumC3356c.f41426B : enumC3356c, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : abstractC1082f0);
    }

    public static /* synthetic */ C3354a f(C3354a c3354a, L0 l02, EnumC3356c enumC3356c, boolean z10, boolean z11, Set set, AbstractC1082f0 abstractC1082f0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l02 = c3354a.f41420d;
        }
        if ((i10 & 2) != 0) {
            enumC3356c = c3354a.f41421e;
        }
        EnumC3356c enumC3356c2 = enumC3356c;
        if ((i10 & 4) != 0) {
            z10 = c3354a.f41422f;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = c3354a.f41423g;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            set = c3354a.f41424h;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            abstractC1082f0 = c3354a.f41425i;
        }
        return c3354a.e(l02, enumC3356c2, z12, z13, set2, abstractC1082f0);
    }

    @Override // Hb.I
    public AbstractC1082f0 a() {
        return this.f41425i;
    }

    @Override // Hb.I
    public L0 b() {
        return this.f41420d;
    }

    @Override // Hb.I
    public Set<m0> c() {
        return this.f41424h;
    }

    public final C3354a e(L0 howThisTypeIsUsed, EnumC3356c flexibility, boolean z10, boolean z11, Set<? extends m0> set, AbstractC1082f0 abstractC1082f0) {
        C3862t.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        C3862t.g(flexibility, "flexibility");
        return new C3354a(howThisTypeIsUsed, flexibility, z10, z11, set, abstractC1082f0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3354a)) {
            return false;
        }
        C3354a c3354a = (C3354a) obj;
        return C3862t.b(c3354a.a(), a()) && c3354a.b() == b() && c3354a.f41421e == this.f41421e && c3354a.f41422f == this.f41422f && c3354a.f41423g == this.f41423g;
    }

    public final EnumC3356c g() {
        return this.f41421e;
    }

    public final boolean h() {
        return this.f41423g;
    }

    @Override // Hb.I
    public int hashCode() {
        AbstractC1082f0 abstractC1082f0A = a();
        int iHashCode = abstractC1082f0A != null ? abstractC1082f0A.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + b().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.f41421e.hashCode();
        int i10 = iHashCode3 + (iHashCode3 * 31) + (this.f41422f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f41423g ? 1 : 0);
    }

    public final boolean i() {
        return this.f41422f;
    }

    public final C3354a j(boolean z10) {
        return f(this, null, null, z10, false, null, null, 59, null);
    }

    public C3354a k(AbstractC1082f0 abstractC1082f0) {
        return f(this, null, null, false, false, null, abstractC1082f0, 31, null);
    }

    public final C3354a l(EnumC3356c flexibility) {
        C3862t.g(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // Hb.I
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3354a d(m0 typeParameter) {
        C3862t.g(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? V.k(c(), typeParameter) : V.c(typeParameter), null, 47, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f41420d + ", flexibility=" + this.f41421e + ", isRaw=" + this.f41422f + ", isForAnnotationParameter=" + this.f41423g + ", visitedTypeParameters=" + this.f41424h + ", defaultType=" + this.f41425i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3354a(L0 howThisTypeIsUsed, EnumC3356c flexibility, boolean z10, boolean z11, Set<? extends m0> set, AbstractC1082f0 abstractC1082f0) {
        super(howThisTypeIsUsed, set, abstractC1082f0);
        C3862t.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        C3862t.g(flexibility, "flexibility");
        this.f41420d = howThisTypeIsUsed;
        this.f41421e = flexibility;
        this.f41422f = z10;
        this.f41423g = z11;
        this.f41424h = set;
        this.f41425i = abstractC1082f0;
    }
}
