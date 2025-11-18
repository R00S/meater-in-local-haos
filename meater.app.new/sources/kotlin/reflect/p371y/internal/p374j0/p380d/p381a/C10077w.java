package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9793i;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: JavaTypeEnhancementState.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.w */
/* loaded from: classes2.dex */
public final class C10077w {

    /* renamed from: a */
    public static final b f38316a = new b(null);

    /* renamed from: b */
    private static final C10077w f38317b = new C10077w(C10075u.m33805b(null, 1, null), a.f38321h);

    /* renamed from: c */
    private final C10079y f38318c;

    /* renamed from: d */
    private final Function1<C10160c, EnumC9955f0> f38319d;

    /* renamed from: e */
    private final boolean f38320e;

    /* compiled from: JavaTypeEnhancementState.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.w$a */
    /* synthetic */ class a extends C9793i implements Function1<C10160c, EnumC9955f0> {

        /* renamed from: h */
        public static final a f38321h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC9781c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getF40571m() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final KDeclarationContainer getOwner() {
            return C9790g0.m32300d(C10075u.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC9781c
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final EnumC9955f0 invoke(C10160c c10160c) {
            C9801m.m32346f(c10160c, "p0");
            return C10075u.m33807d(c10160c);
        }
    }

    /* compiled from: JavaTypeEnhancementState.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.w$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10077w m33821a() {
            return C10077w.f38317b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10077w(C10079y c10079y, Function1<? super C10160c, ? extends EnumC9955f0> function1) {
        C9801m.m32346f(c10079y, "jsr305");
        C9801m.m32346f(function1, "getReportLevelForAnnotation");
        this.f38318c = c10079y;
        this.f38319d = function1;
        this.f38320e = c10079y.m33827d() || function1.invoke(C10075u.m33808e()) == EnumC9955f0.IGNORE;
    }

    /* renamed from: b */
    public final boolean m33817b() {
        return this.f38320e;
    }

    /* renamed from: c */
    public final Function1<C10160c, EnumC9955f0> m33818c() {
        return this.f38319d;
    }

    /* renamed from: d */
    public final C10079y m33819d() {
        return this.f38318c;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f38318c + ", getReportLevelForAnnotation=" + this.f38319d + ')';
    }
}
