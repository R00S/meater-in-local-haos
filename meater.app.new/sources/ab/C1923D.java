package ab;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaTypeEnhancementState.kt */
/* renamed from: ab.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1923D {

    /* renamed from: d, reason: collision with root package name */
    public static final b f20121d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final C1923D f20122e = new C1923D(C1921B.b(null, 1, null), a.f20126B);

    /* renamed from: a, reason: collision with root package name */
    private final C1926G f20123a;

    /* renamed from: b, reason: collision with root package name */
    private final Ba.l<qb.c, EnumC1934O> f20124b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20125c;

    /* compiled from: JavaTypeEnhancementState.kt */
    /* renamed from: ab.D$a */
    /* synthetic */ class a extends C3859p implements Ba.l<qb.c, EnumC1934O> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f20126B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final EnumC1934O invoke(qb.c p02) {
            C3862t.g(p02, "p0");
            return C1921B.d(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final Ia.g getOwner() {
            return kotlin.jvm.internal.P.d(C1921B.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }
    }

    /* compiled from: JavaTypeEnhancementState.kt */
    /* renamed from: ab.D$b */
    public static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        public final C1923D a() {
            return C1923D.f20122e;
        }

        private b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1923D(C1926G jsr305, Ba.l<? super qb.c, ? extends EnumC1934O> getReportLevelForAnnotation) {
        C3862t.g(jsr305, "jsr305");
        C3862t.g(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f20123a = jsr305;
        this.f20124b = getReportLevelForAnnotation;
        this.f20125c = jsr305.f() || getReportLevelForAnnotation.invoke(C1921B.e()) == EnumC1934O.f20195D;
    }

    public final boolean b() {
        return this.f20125c;
    }

    public final Ba.l<qb.c, EnumC1934O> c() {
        return this.f20124b;
    }

    public final C1926G d() {
        return this.f20123a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f20123a + ", getReportLevelForAnnotation=" + this.f20124b + ')';
    }
}
