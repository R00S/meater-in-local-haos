package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.i */
/* loaded from: classes3.dex */
public final class C10059i {

    /* renamed from: a */
    private final EnumC10058h f38230a;

    /* renamed from: b */
    private final boolean f38231b;

    public C10059i(EnumC10058h enumC10058h, boolean z) {
        C9801m.m32346f(enumC10058h, "qualifier");
        this.f38230a = enumC10058h;
        this.f38231b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C10059i m33699b(C10059i c10059i, EnumC10058h enumC10058h, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            enumC10058h = c10059i.f38230a;
        }
        if ((i2 & 2) != 0) {
            z = c10059i.f38231b;
        }
        return c10059i.m33700a(enumC10058h, z);
    }

    /* renamed from: a */
    public final C10059i m33700a(EnumC10058h enumC10058h, boolean z) {
        C9801m.m32346f(enumC10058h, "qualifier");
        return new C10059i(enumC10058h, z);
    }

    /* renamed from: c */
    public final EnumC10058h m33701c() {
        return this.f38230a;
    }

    /* renamed from: d */
    public final boolean m33702d() {
        return this.f38231b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10059i)) {
            return false;
        }
        C10059i c10059i = (C10059i) obj;
        return this.f38230a == c10059i.f38230a && this.f38231b == c10059i.f38231b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f38230a.hashCode() * 31;
        boolean z = this.f38231b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return iHashCode + i2;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f38230a + ", isForWarningOnly=" + this.f38231b + ')';
    }

    public /* synthetic */ C10059i(EnumC10058h enumC10058h, boolean z, int i2, C9789g c9789g) {
        this(enumC10058h, (i2 & 2) != 0 ? false : z);
    }
}
