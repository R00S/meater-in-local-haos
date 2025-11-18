package R0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextMotion.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0011\u0013B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"LR0/p;", "", "LR0/p$b;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "Z", "c", "()Z", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    private static final p f14755d;

    /* renamed from: e, reason: collision with root package name */
    private static final p f14756e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int linearity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean subpixelTextPositioning;

    /* compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LR0/p$a;", "", "<init>", "()V", "LR0/p;", "Static", "LR0/p;", "a", "()LR0/p;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: R0.p$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final p a() {
            return p.f14755d;
        }

        private Companion() {
        }
    }

    static {
        C3854k c3854k = null;
        INSTANCE = new Companion(c3854k);
        b.Companion companion = b.INSTANCE;
        f14755d = new p(companion.a(), false, c3854k);
        f14756e = new p(companion.b(), true, c3854k);
    }

    public /* synthetic */ p(int i10, boolean z10, C3854k c3854k) {
        this(i10, z10);
    }

    /* renamed from: b, reason: from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return b.e(this.linearity, pVar.linearity) && this.subpixelTextPositioning == pVar.subpixelTextPositioning;
    }

    public int hashCode() {
        return (b.f(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        return C3862t.b(this, f14755d) ? "TextMotion.Static" : C3862t.b(this, f14756e) ? "TextMotion.Animated" : "Invalid";
    }

    private p(int i10, boolean z10) {
        this.linearity = i10;
        this.subpixelTextPositioning = z10;
    }

    /* compiled from: TextMotion.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\b"}, d2 = {"LR0/p$b;", "", "", "value", "d", "(I)I", "f", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Aa.b
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        private static final int f14760b = d(1);

        /* renamed from: c, reason: collision with root package name */
        private static final int f14761c = d(2);

        /* renamed from: d, reason: collision with root package name */
        private static final int f14762d = d(3);

        /* compiled from: TextMotion.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"LR0/p$b$a;", "", "<init>", "()V", "LR0/p$b;", "Linear", "I", "b", "()I", "FontHinting", "a", "None", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R0.p$b$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final int a() {
                return b.f14761c;
            }

            public final int b() {
                return b.f14760b;
            }

            public final int c() {
                return b.f14762d;
            }

            private Companion() {
            }
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static int f(int i10) {
            return Integer.hashCode(i10);
        }

        private static int d(int i10) {
            return i10;
        }
    }
}
