package R0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: LineBreak.android.kt */
@Aa.b
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0004\u0013\u0014\u0004\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005R\u0017\u0010\f\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0017\u0010\u000f\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u0017\u0010\u0012\u001a\u00020\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"LR0/e;", "", "", "mask", "c", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "LR0/e$b;", "e", "strategy", "LR0/e$c;", "f", "strictness", "LR0/e$d;", "g", "wordBreak", "a", "b", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f14683b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f14684c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f14685d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f14686e;

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"LR0/e$a;", "", "<init>", "()V", "LR0/e;", "Simple", "I", "a", "()I", "getSimple-rAG3T2k$annotations", "Unspecified", "b", "getUnspecified-rAG3T2k$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: R0.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int a() {
            return e.f14683b;
        }

        public final int b() {
            return e.f14686e;
        }

        private Companion() {
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        int iC = companion.c();
        c.Companion companion2 = c.INSTANCE;
        int iC2 = companion2.c();
        d.Companion companion3 = d.INSTANCE;
        f14683b = c(f.e(iC, iC2, companion3.a()));
        f14684c = c(f.e(companion.a(), companion2.b(), companion3.b()));
        f14685d = c(f.e(companion.b(), companion2.d(), companion3.a()));
        f14686e = c(0);
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static final int e(int i10) {
        return b.d(f.f(i10));
    }

    public static final int f(int i10) {
        return c.e(f.g(i10));
    }

    public static final int g(int i10) {
        return d.c(f.h(i10));
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return "LineBreak(strategy=" + ((Object) b.f(e(i10))) + ", strictness=" + ((Object) c.g(f(i10))) + ", wordBreak=" + ((Object) d.e(g(i10))) + ')';
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"LR0/e$b;", "", "", "value", "d", "(I)I", "", "f", "(I)Ljava/lang/String;", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Aa.b
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f14688b = d(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f14689c = d(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f14690d = d(3);

        /* renamed from: e, reason: collision with root package name */
        private static final int f14691e = d(0);

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"LR0/e$b$a;", "", "<init>", "()V", "LR0/e$b;", "Simple", "I", "c", "()I", "HighQuality", "b", "Balanced", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R0.e$b$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final int a() {
                return b.f14690d;
            }

            public final int b() {
                return b.f14689c;
            }

            public final int c() {
                return b.f14688b;
            }

            private Companion() {
            }
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static String f(int i10) {
            return e(i10, f14688b) ? "Strategy.Simple" : e(i10, f14689c) ? "Strategy.HighQuality" : e(i10, f14690d) ? "Strategy.Balanced" : e(i10, f14691e) ? "Strategy.Unspecified" : "Invalid";
        }

        public static int d(int i10) {
            return i10;
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"LR0/e$c;", "", "", "value", "e", "(I)I", "", "g", "(I)Ljava/lang/String;", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Aa.b
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f14693b = e(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f14694c = e(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f14695d = e(3);

        /* renamed from: e, reason: collision with root package name */
        private static final int f14696e = e(4);

        /* renamed from: f, reason: collision with root package name */
        private static final int f14697f = e(0);

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"LR0/e$c$a;", "", "<init>", "()V", "LR0/e$c;", "Default", "I", "a", "()I", "Loose", "b", "Normal", "c", "Strict", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R0.e$c$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final int a() {
                return c.f14693b;
            }

            public final int b() {
                return c.f14694c;
            }

            public final int c() {
                return c.f14695d;
            }

            public final int d() {
                return c.f14696e;
            }

            private Companion() {
            }
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static String g(int i10) {
            return f(i10, f14693b) ? "Strictness.None" : f(i10, f14694c) ? "Strictness.Loose" : f(i10, f14695d) ? "Strictness.Normal" : f(i10, f14696e) ? "Strictness.Strict" : f(i10, f14697f) ? "Strictness.Unspecified" : "Invalid";
        }

        public static int e(int i10) {
            return i10;
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"LR0/e$d;", "", "", "value", "c", "(I)I", "", "e", "(I)Ljava/lang/String;", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Aa.b
    public static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f14699b = c(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f14700c = c(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f14701d = c(0);

        /* compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"LR0/e$d$a;", "", "<init>", "()V", "LR0/e$d;", "Default", "I", "a", "()I", "Phrase", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R0.e$d$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final int a() {
                return d.f14699b;
            }

            public final int b() {
                return d.f14700c;
            }

            private Companion() {
            }
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static String e(int i10) {
            return d(i10, f14699b) ? "WordBreak.None" : d(i10, f14700c) ? "WordBreak.Phrase" : d(i10, f14701d) ? "WordBreak.Unspecified" : "Invalid";
        }

        public static int c(int i10) {
            return i10;
        }
    }

    private static int c(int i10) {
        return i10;
    }
}
