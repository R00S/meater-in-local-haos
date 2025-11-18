package ib;

import kotlin.jvm.internal.C3854k;

/* compiled from: typeQualifiers.kt */
/* renamed from: ib.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3674h {

    /* renamed from: e, reason: collision with root package name */
    public static final a f43260e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C3674h f43261f = new C3674h(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3677k f43262a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3675i f43263b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f43264c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f43265d;

    /* compiled from: typeQualifiers.kt */
    /* renamed from: ib.h$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final C3674h a() {
            return C3674h.f43261f;
        }

        private a() {
        }
    }

    public C3674h(EnumC3677k enumC3677k, EnumC3675i enumC3675i, boolean z10, boolean z11) {
        this.f43262a = enumC3677k;
        this.f43263b = enumC3675i;
        this.f43264c = z10;
        this.f43265d = z11;
    }

    public static /* synthetic */ C3674h c(C3674h c3674h, EnumC3677k enumC3677k, EnumC3675i enumC3675i, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC3677k = c3674h.f43262a;
        }
        if ((i10 & 2) != 0) {
            enumC3675i = c3674h.f43263b;
        }
        if ((i10 & 4) != 0) {
            z10 = c3674h.f43264c;
        }
        if ((i10 & 8) != 0) {
            z11 = c3674h.f43265d;
        }
        return c3674h.b(enumC3677k, enumC3675i, z10, z11);
    }

    public final C3674h b(EnumC3677k enumC3677k, EnumC3675i enumC3675i, boolean z10, boolean z11) {
        return new C3674h(enumC3677k, enumC3675i, z10, z11);
    }

    public final boolean d() {
        return this.f43264c;
    }

    public final EnumC3675i e() {
        return this.f43263b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3674h)) {
            return false;
        }
        C3674h c3674h = (C3674h) obj;
        return this.f43262a == c3674h.f43262a && this.f43263b == c3674h.f43263b && this.f43264c == c3674h.f43264c && this.f43265d == c3674h.f43265d;
    }

    public final EnumC3677k f() {
        return this.f43262a;
    }

    public final boolean g() {
        return this.f43265d;
    }

    public int hashCode() {
        EnumC3677k enumC3677k = this.f43262a;
        int iHashCode = (enumC3677k == null ? 0 : enumC3677k.hashCode()) * 31;
        EnumC3675i enumC3675i = this.f43263b;
        return ((((iHashCode + (enumC3675i != null ? enumC3675i.hashCode() : 0)) * 31) + Boolean.hashCode(this.f43264c)) * 31) + Boolean.hashCode(this.f43265d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f43262a + ", mutability=" + this.f43263b + ", definitelyNotNull=" + this.f43264c + ", isNullabilityQualifierForWarning=" + this.f43265d + ')';
    }

    public /* synthetic */ C3674h(EnumC3677k enumC3677k, EnumC3675i enumC3675i, boolean z10, boolean z11, int i10, C3854k c3854k) {
        this(enumC3677k, enumC3675i, z10, (i10 & 8) != 0 ? false : z11);
    }
}
