package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Constraints.kt */
@Aa.b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0011\u0010 \u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u001a\u0010%\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u001fR\u001a\u0010(\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u001fR\u001a\u0010+\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0019\u001a\u0004\b)\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"LU0/b;", "", "", "value", "b", "(J)J", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "c", "(JIIII)J", "", "q", "(J)Ljava/lang/String;", "o", "(J)I", "other", "", "e", "(JLjava/lang/Object;)Z", "a", "J", "getValue$annotations", "()V", "n", "l", "m", "k", "h", "(J)Z", "hasBoundedWidth", "g", "hasBoundedHeight", "j", "getHasFixedWidth$annotations", "hasFixedWidth", "i", "getHasFixedHeight$annotations", "hasFixedHeight", "p", "isZero$annotations", "isZero", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    /* compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u000bJ5\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"LU0/b$a;", "", "<init>", "()V", "", "width", "height", "LU0/b;", "c", "(II)J", "e", "(I)J", "d", "minWidth", "maxWidth", "minHeight", "maxHeight", "b", "(IIII)J", "a", "Infinity", "I", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final long a(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int iMin = Math.min(minHeight, 262142);
            int iMin2 = maxHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxHeight, 262142);
            int iM = c.m(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return c.a(Math.min(iM, minWidth), maxWidth != Integer.MAX_VALUE ? Math.min(iM, maxWidth) : Integer.MAX_VALUE, iMin, iMin2);
        }

        public final long b(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int iMin = Math.min(minWidth, 262142);
            int iMin2 = maxWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxWidth, 262142);
            int iM = c.m(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return c.a(iMin, iMin2, Math.min(iM, minHeight), maxHeight != Integer.MAX_VALUE ? Math.min(iM, maxHeight) : Integer.MAX_VALUE);
        }

        public final long c(int width, int height) {
            if (!(width >= 0 && height >= 0)) {
                m.a("width(" + width + ") and height(" + height + ") must be >= 0");
            }
            return c.j(width, width, height, height);
        }

        public final long d(int height) {
            if (!(height >= 0)) {
                m.a("height(" + height + ") must be >= 0");
            }
            return c.j(0, Integer.MAX_VALUE, height, height);
        }

        public final long e(int width) {
            if (!(width >= 0)) {
                m.a("width(" + width + ") must be >= 0");
            }
            return c.j(width, width, 0, Integer.MAX_VALUE);
        }

        private Companion() {
        }
    }

    private /* synthetic */ b(long j10) {
        this.value = j10;
    }

    public static final /* synthetic */ b a(long j10) {
        return new b(j10);
    }

    public static final long c(long j10, int i10, int i11, int i12, int i13) {
        if (!(i12 >= 0 && i10 >= 0)) {
            m.a("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0");
        }
        if (!(i11 >= i10)) {
            m.a("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')');
        }
        if (!(i13 >= i12)) {
            m.a("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')');
        }
        return c.j(i10, i11, i12, i13);
    }

    public static /* synthetic */ long d(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = n(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = l(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = m(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = k(j10);
        }
        return c(j10, i15, i16, i17, i13);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).getValue();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean g(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    public static final boolean h(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static final boolean i(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final boolean j(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1;
        int i12 = ((int) (j10 >> 2)) & i11;
        int i13 = ((int) (j10 >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final int k(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    public static final int l(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int m(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    public static final int n(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return (((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0 || (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0;
    }

    public static String q(long j10) {
        int iL = l(j10);
        String strValueOf = iL == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iL);
        int iK = k(j10);
        return "Constraints(minWidth = " + n(j10) + ", maxWidth = " + strValueOf + ", minHeight = " + m(j10) + ", maxHeight = " + (iK != Integer.MAX_VALUE ? String.valueOf(iK) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    public int hashCode() {
        return o(this.value);
    }

    /* renamed from: r, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public String toString() {
        return q(this.value);
    }

    public static long b(long j10) {
        return j10;
    }
}
