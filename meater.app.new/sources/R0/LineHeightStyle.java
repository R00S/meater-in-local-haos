package R0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: LineHeightStyle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0012\u0014\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"LR0/g;", "", "LR0/g$a;", "alignment", "LR0/g$c;", "trim", "<init>", "(FILkotlin/jvm/internal/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "I", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: R0.g, reason: from toString */
/* loaded from: classes.dex */
public final class LineHeightStyle {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    private static final LineHeightStyle f14703d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int trim;

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\r"}, d2 = {"LR0/g$a;", "", "", "topRatio", "c", "(F)F", "", "f", "(F)Ljava/lang/String;", "", "e", "(F)I", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Aa.b
    /* renamed from: R0.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        private static final float f14707b = c(0.0f);

        /* renamed from: c, reason: collision with root package name */
        private static final float f14708c = c(0.5f);

        /* renamed from: d, reason: collision with root package name */
        private static final float f14709d = c(-1.0f);

        /* renamed from: e, reason: collision with root package name */
        private static final float f14710e = c(1.0f);

        /* compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"LR0/g$a$a;", "", "<init>", "()V", "LR0/g$a;", "Center", "F", "a", "()F", "Proportional", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R0.g$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final float a() {
                return a.f14708c;
            }

            public final float b() {
                return a.f14709d;
            }

            private Companion() {
            }
        }

        public static float c(float f10) {
            if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        public static final boolean d(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        public static int e(float f10) {
            return Float.hashCode(f10);
        }

        public static String f(float f10) {
            if (f10 == f14707b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f14708c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f14709d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f14710e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }
    }

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LR0/g$b;", "", "<init>", "()V", "LR0/g;", "Default", "LR0/g;", "a", "()LR0/g;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: R0.g$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final LineHeightStyle a() {
            return LineHeightStyle.f14703d;
        }

        private Companion() {
        }
    }

    static {
        C3854k c3854k = null;
        INSTANCE = new Companion(c3854k);
        f14703d = new LineHeightStyle(a.INSTANCE.b(), c.INSTANCE.a(), c3854k);
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, C3854k c3854k) {
        this(f10, i10);
    }

    /* renamed from: b, reason: from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* renamed from: c, reason: from getter */
    public final int getTrim() {
        return this.trim;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) other;
        return a.d(this.alignment, lineHeightStyle.alignment) && c.d(this.trim, lineHeightStyle.trim);
    }

    public int hashCode() {
        return (a.e(this.alignment) * 31) + c.e(this.trim);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.f(this.alignment)) + ", trim=" + ((Object) c.h(this.trim)) + ')';
    }

    private LineHeightStyle(float f10, int i10) {
        this.alignment = f10;
        this.trim = i10;
    }

    /* compiled from: LineHeightStyle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000f"}, d2 = {"LR0/g$c;", "", "", "value", "c", "(I)I", "", "h", "(I)Ljava/lang/String;", "", "f", "(I)Z", "g", "e", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Aa.b
    /* renamed from: R0.g$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f14712b = c(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f14713c = c(16);

        /* renamed from: d, reason: collision with root package name */
        private static final int f14714d = c(17);

        /* renamed from: e, reason: collision with root package name */
        private static final int f14715e = c(0);

        /* compiled from: LineHeightStyle.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"LR0/g$c$a;", "", "<init>", "()V", "LR0/g$c;", "Both", "I", "a", "()I", "None", "b", "", "FlagTrimBottom", "FlagTrimTop", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R0.g$c$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final int a() {
                return c.f14714d;
            }

            public final int b() {
                return c.f14715e;
            }

            private Companion() {
            }
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static int e(int i10) {
            return Integer.hashCode(i10);
        }

        public static final boolean f(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean g(int i10) {
            return (i10 & 16) > 0;
        }

        public static String h(int i10) {
            return i10 == f14712b ? "LineHeightStyle.Trim.FirstLineTop" : i10 == f14713c ? "LineHeightStyle.Trim.LastLineBottom" : i10 == f14714d ? "LineHeightStyle.Trim.Both" : i10 == f14715e ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        private static int c(int i10) {
            return i10;
        }
    }
}
