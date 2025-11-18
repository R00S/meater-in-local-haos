package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.Set;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 kotlin.f0.y.e.j0.b.i, still in use, count: 1, list:
  (r0v1 kotlin.f0.y.e.j0.b.i) from 0x006e: FILLED_NEW_ARRAY 
  (r0v1 kotlin.f0.y.e.j0.b.i)
  (r1v2 kotlin.f0.y.e.j0.b.i)
  (r4v2 kotlin.f0.y.e.j0.b.i)
  (r6v2 kotlin.f0.y.e.j0.b.i)
  (r8v2 kotlin.f0.y.e.j0.b.i)
  (r10v2 kotlin.f0.y.e.j0.b.i)
  (r12v2 kotlin.f0.y.e.j0.b.i)
 A[WRAPPED] elemType: kotlin.f0.y.e.j0.b.i
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: PrimitiveType.kt */
/* renamed from: kotlin.f0.y.e.j0.b.i */
/* loaded from: classes2.dex */
public final class EnumC9915i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* renamed from: g */
    public static final Set<EnumC9915i> f37470g = C10822w0.m38922i(new EnumC9915i("Char"), new EnumC9915i("Byte"), new EnumC9915i("Short"), new EnumC9915i("Int"), new EnumC9915i("Float"), new EnumC9915i("Long"), new EnumC9915i("Double"));

    /* renamed from: q */
    private final C10163f f37480q;

    /* renamed from: r */
    private final C10163f f37481r;

    /* renamed from: s */
    private final Lazy f37482s;

    /* renamed from: t */
    private final Lazy f37483t;

    /* renamed from: f */
    public static final a f37469f = new a(null);

    /* compiled from: PrimitiveType.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.i$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.i$b */
    static final class b extends Lambda implements Function0<C10160c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10160c invoke() {
            C10160c c10160cM35421c = C9917k.f37517r.m35421c(EnumC9915i.this.m32814q());
            C9801m.m32345e(c10160cM35421c, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return c10160cM35421c;
        }
    }

    /* compiled from: PrimitiveType.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.i$c */
    static final class c extends Lambda implements Function0<C10160c> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10160c invoke() {
            C10160c c10160cM35421c = C9917k.f37517r.m35421c(EnumC9915i.this.m32816v());
            C9801m.m32345e(c10160cM35421c, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return c10160cM35421c;
        }
    }

    static {
    }

    private EnumC9915i(String str) {
        C10163f c10163fM35454x = C10163f.m35454x(str);
        C9801m.m32345e(c10163fM35454x, "identifier(typeName)");
        this.f37480q = c10163fM35454x;
        C10163f c10163fM35454x2 = C10163f.m35454x(str + "Array");
        C9801m.m32345e(c10163fM35454x2, "identifier(\"${typeName}Array\")");
        this.f37481r = c10163fM35454x2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f37482s = C10550i.m37593a(lazyThreadSafetyMode, new c());
        this.f37483t = C10550i.m37593a(lazyThreadSafetyMode, new b());
    }

    public static EnumC9915i valueOf(String str) {
        return (EnumC9915i) Enum.valueOf(EnumC9915i.class, str);
    }

    public static EnumC9915i[] values() {
        return (EnumC9915i[]) f37479p.clone();
    }

    /* renamed from: k */
    public final C10160c m32813k() {
        return (C10160c) this.f37483t.getValue();
    }

    /* renamed from: q */
    public final C10163f m32814q() {
        return this.f37481r;
    }

    /* renamed from: u */
    public final C10160c m32815u() {
        return (C10160c) this.f37482s.getValue();
    }

    /* renamed from: v */
    public final C10163f m32816v() {
        return this.f37480q;
    }
}
