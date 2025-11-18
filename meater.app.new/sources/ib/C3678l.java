package ib;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* renamed from: ib.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3678l {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3677k f43285a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43286b;

    public C3678l(EnumC3677k qualifier, boolean z10) {
        C3862t.g(qualifier, "qualifier");
        this.f43285a = qualifier;
        this.f43286b = z10;
    }

    public static /* synthetic */ C3678l b(C3678l c3678l, EnumC3677k enumC3677k, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC3677k = c3678l.f43285a;
        }
        if ((i10 & 2) != 0) {
            z10 = c3678l.f43286b;
        }
        return c3678l.a(enumC3677k, z10);
    }

    public final C3678l a(EnumC3677k qualifier, boolean z10) {
        C3862t.g(qualifier, "qualifier");
        return new C3678l(qualifier, z10);
    }

    public final EnumC3677k c() {
        return this.f43285a;
    }

    public final boolean d() {
        return this.f43286b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3678l)) {
            return false;
        }
        C3678l c3678l = (C3678l) obj;
        return this.f43285a == c3678l.f43285a && this.f43286b == c3678l.f43286b;
    }

    public int hashCode() {
        return (this.f43285a.hashCode() * 31) + Boolean.hashCode(this.f43286b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f43285a + ", isForWarningOnly=" + this.f43286b + ')';
    }

    public /* synthetic */ C3678l(EnumC3677k enumC3677k, boolean z10, int i10, C3854k c3854k) {
        this(enumC3677k, (i10 & 2) != 0 ? false : z10);
    }
}
