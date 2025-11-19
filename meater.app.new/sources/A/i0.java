package A;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: WindowInsets.kt */
@Aa.b
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LA/i0;", "", "", "value", "h", "(I)I", "sides", "l", "(II)I", "", "j", "(II)Z", "", "m", "(I)Ljava/lang/String;", "n", "k", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final int f137b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f138c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f139d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f140e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f141f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f142g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f143h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f144i;

    /* renamed from: j, reason: collision with root package name */
    private static final int f145j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f146k;

    /* renamed from: l, reason: collision with root package name */
    private static final int f147l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f148m;

    /* compiled from: WindowInsets.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR \u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR \u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"LA/i0$a;", "", "<init>", "()V", "LA/i0;", "AllowLeftInLtr", "I", "a", "()I", "AllowRightInLtr", "c", "AllowLeftInRtl", "b", "AllowRightInRtl", "d", "Top", "g", "Bottom", "e", "Horizontal", "f", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.i0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int a() {
            return i0.f137b;
        }

        public final int b() {
            return i0.f139d;
        }

        public final int c() {
            return i0.f138c;
        }

        public final int d() {
            return i0.f140e;
        }

        public final int e() {
            return i0.f144i;
        }

        public final int f() {
            return i0.f147l;
        }

        public final int g() {
            return i0.f143h;
        }

        private Companion() {
        }
    }

    static {
        int iH = h(8);
        f137b = iH;
        int iH2 = h(4);
        f138c = iH2;
        int iH3 = h(2);
        f139d = iH3;
        int iH4 = h(1);
        f140e = iH4;
        f141f = l(iH, iH4);
        f142g = l(iH2, iH3);
        int iH5 = h(16);
        f143h = iH5;
        int iH6 = h(32);
        f144i = iH6;
        int iL = l(iH, iH3);
        f145j = iL;
        int iL2 = l(iH2, iH4);
        f146k = iL2;
        f147l = l(iL, iL2);
        f148m = l(iH5, iH6);
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean j(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static final int l(int i10, int i11) {
        return h(i10 | i11);
    }

    public static String m(int i10) {
        return "WindowInsetsSides(" + n(i10) + ')';
    }

    private static final String n(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f141f;
        if ((i10 & i11) == i11) {
            o(sb2, "Start");
        }
        int i12 = f145j;
        if ((i10 & i12) == i12) {
            o(sb2, "Left");
        }
        int i13 = f143h;
        if ((i10 & i13) == i13) {
            o(sb2, "Top");
        }
        int i14 = f142g;
        if ((i10 & i14) == i14) {
            o(sb2, "End");
        }
        int i15 = f146k;
        if ((i10 & i15) == i15) {
            o(sb2, "Right");
        }
        int i16 = f144i;
        if ((i10 & i16) == i16) {
            o(sb2, "Bottom");
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final void o(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    private static int h(int i10) {
        return i10;
    }
}
