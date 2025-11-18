package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: JavaNullabilityAnnotationsStatus.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.v */
/* loaded from: classes2.dex */
public final class C10076v {

    /* renamed from: a */
    public static final a f38311a = new a(null);

    /* renamed from: b */
    private static final C10076v f38312b = new C10076v(EnumC9955f0.STRICT, null, null, 6, null);

    /* renamed from: c */
    private final EnumC9955f0 f38313c;

    /* renamed from: d */
    private final KotlinVersion f38314d;

    /* renamed from: e */
    private final EnumC9955f0 f38315e;

    /* compiled from: JavaNullabilityAnnotationsStatus.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10076v m33815a() {
            return C10076v.f38312b;
        }
    }

    public C10076v(EnumC9955f0 enumC9955f0, KotlinVersion kotlinVersion, EnumC9955f0 enumC9955f02) {
        C9801m.m32346f(enumC9955f0, "reportLevelBefore");
        C9801m.m32346f(enumC9955f02, "reportLevelAfter");
        this.f38313c = enumC9955f0;
        this.f38314d = kotlinVersion;
        this.f38315e = enumC9955f02;
    }

    /* renamed from: b */
    public final EnumC9955f0 m33812b() {
        return this.f38315e;
    }

    /* renamed from: c */
    public final EnumC9955f0 m33813c() {
        return this.f38313c;
    }

    /* renamed from: d */
    public final KotlinVersion m33814d() {
        return this.f38314d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10076v)) {
            return false;
        }
        C10076v c10076v = (C10076v) obj;
        return this.f38313c == c10076v.f38313c && C9801m.m32341a(this.f38314d, c10076v.f38314d) && this.f38315e == c10076v.f38315e;
    }

    public int hashCode() {
        int iHashCode = this.f38313c.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f38314d;
        return ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.getF37203k())) * 31) + this.f38315e.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f38313c + ", sinceVersion=" + this.f38314d + ", reportLevelAfter=" + this.f38315e + ')';
    }

    public /* synthetic */ C10076v(EnumC9955f0 enumC9955f0, KotlinVersion kotlinVersion, EnumC9955f0 enumC9955f02, int i2, C9789g c9789g) {
        this(enumC9955f0, (i2 & 2) != 0 ? new KotlinVersion(1, 0) : kotlinVersion, (i2 & 4) != 0 ? enumC9955f0 : enumC9955f02);
    }
}
