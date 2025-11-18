package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.text.C10546u;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: FunctionClassKind.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.c */
/* loaded from: classes2.dex */
public final class EnumC9924c {

    /* renamed from: f */
    public static final a f37649f;

    /* renamed from: g */
    public static final EnumC9924c f37650g = new EnumC9924c("Function", 0, C9917k.f37517r, "Function", false, false);

    /* renamed from: h */
    public static final EnumC9924c f37651h = new EnumC9924c("SuspendFunction", 1, C9917k.f37509j, "SuspendFunction", true, false);

    /* renamed from: i */
    public static final EnumC9924c f37652i;

    /* renamed from: j */
    public static final EnumC9924c f37653j;

    /* renamed from: k */
    private static final /* synthetic */ EnumC9924c[] f37654k;

    /* renamed from: l */
    private final C10160c f37655l;

    /* renamed from: m */
    private final String f37656m;

    /* renamed from: n */
    private final boolean f37657n;

    /* renamed from: o */
    private final boolean f37658o;

    /* compiled from: FunctionClassKind.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.c$a */
    public static final class a {

        /* compiled from: FunctionClassKind.kt */
        /* renamed from: kotlin.f0.y.e.j0.b.p.c$a$a, reason: collision with other inner class name */
        public static final class C11542a {

            /* renamed from: a */
            private final EnumC9924c f37659a;

            /* renamed from: b */
            private final int f37660b;

            public C11542a(EnumC9924c enumC9924c, int i2) {
                C9801m.m32346f(enumC9924c, "kind");
                this.f37659a = enumC9924c;
                this.f37660b = i2;
            }

            /* renamed from: a */
            public final EnumC9924c m32901a() {
                return this.f37659a;
            }

            /* renamed from: b */
            public final int m32902b() {
                return this.f37660b;
            }

            /* renamed from: c */
            public final EnumC9924c m32903c() {
                return this.f37659a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C11542a)) {
                    return false;
                }
                C11542a c11542a = (C11542a) obj;
                return this.f37659a == c11542a.f37659a && this.f37660b == c11542a.f37660b;
            }

            public int hashCode() {
                return (this.f37659a.hashCode() * 31) + this.f37660b;
            }

            public String toString() {
                return "KindWithArity(kind=" + this.f37659a + ", arity=" + this.f37660b + ')';
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: d */
        private final Integer m32897d(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                int iCharAt = str.charAt(i3) - '0';
                if (!(iCharAt >= 0 && iCharAt < 10)) {
                    return null;
                }
                i2 = (i2 * 10) + iCharAt;
            }
            return Integer.valueOf(i2);
        }

        /* renamed from: a */
        public final EnumC9924c m32898a(C10160c c10160c, String str) {
            C9801m.m32346f(c10160c, "packageFqName");
            C9801m.m32346f(str, "className");
            for (EnumC9924c enumC9924c : EnumC9924c.values()) {
                if (C9801m.m32341a(enumC9924c.m32895q(), c10160c) && C10546u.m37511E(str, enumC9924c.m32894k(), false, 2, null)) {
                    return enumC9924c;
                }
            }
            return null;
        }

        /* renamed from: b */
        public final EnumC9924c m32899b(String str, C10160c c10160c) {
            C9801m.m32346f(str, "className");
            C9801m.m32346f(c10160c, "packageFqName");
            C11542a c11542aM32900c = m32900c(str, c10160c);
            if (c11542aM32900c != null) {
                return c11542aM32900c.m32903c();
            }
            return null;
        }

        /* renamed from: c */
        public final C11542a m32900c(String str, C10160c c10160c) {
            C9801m.m32346f(str, "className");
            C9801m.m32346f(c10160c, "packageFqName");
            EnumC9924c enumC9924cM32898a = m32898a(c10160c, str);
            if (enumC9924cM32898a == null) {
                return null;
            }
            String strSubstring = str.substring(enumC9924cM32898a.m32894k().length());
            C9801m.m32345e(strSubstring, "this as java.lang.String).substring(startIndex)");
            Integer numM32897d = m32897d(strSubstring);
            if (numM32897d != null) {
                return new C11542a(enumC9924cM32898a, numM32897d.intValue());
            }
            return null;
        }
    }

    static {
        C10160c c10160c = C9917k.f37514o;
        f37652i = new EnumC9924c("KFunction", 2, c10160c, "KFunction", false, true);
        f37653j = new EnumC9924c("KSuspendFunction", 3, c10160c, "KSuspendFunction", true, true);
        f37654k = m32893g();
        f37649f = new a(null);
    }

    private EnumC9924c(String str, int i2, C10160c c10160c, String str2, boolean z, boolean z2) {
        this.f37655l = c10160c;
        this.f37656m = str2;
        this.f37657n = z;
        this.f37658o = z2;
    }

    /* renamed from: g */
    private static final /* synthetic */ EnumC9924c[] m32893g() {
        return new EnumC9924c[]{f37650g, f37651h, f37652i, f37653j};
    }

    public static EnumC9924c valueOf(String str) {
        return (EnumC9924c) Enum.valueOf(EnumC9924c.class, str);
    }

    public static EnumC9924c[] values() {
        return (EnumC9924c[]) f37654k.clone();
    }

    /* renamed from: k */
    public final String m32894k() {
        return this.f37656m;
    }

    /* renamed from: q */
    public final C10160c m32895q() {
        return this.f37655l;
    }

    /* renamed from: u */
    public final C10163f m32896u(int i2) {
        C10163f c10163fM35454x = C10163f.m35454x(this.f37656m + i2);
        C9801m.m32345e(c10163fM35454x, "identifier(\"$classNamePrefix$arity\")");
        return c10163fM35454x;
    }
}
