package H0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: TextRange.kt */
@Aa.b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087@\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006 "}, d2 = {"LH0/H;", "", "", "packedValue", "c", "(J)J", "", "m", "(J)Ljava/lang/String;", "", "l", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "k", "start", "g", "end", "j", "min", "i", "max", "f", "(J)Z", "collapsed", "h", "length", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f5342c = I.a(0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: TextRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"LH0/H$a;", "", "<init>", "()V", "LH0/H;", "Zero", "J", "a", "()J", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: H0.H$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final long a() {
            return H.f5342c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ H(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ H b(long j10) {
        return new H(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof H) && j10 == ((H) obj).getPackedValue();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean f(long j10) {
        return k(j10) == g(j10);
    }

    public static final int g(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int h(long j10) {
        return i(j10) - j(j10);
    }

    public static final int i(long j10) {
        return k(j10) > g(j10) ? k(j10) : g(j10);
    }

    public static final int j(long j10) {
        return k(j10) > g(j10) ? g(j10) : k(j10);
    }

    public static final int k(long j10) {
        return (int) (j10 >> 32);
    }

    public static int l(long j10) {
        return Long.hashCode(j10);
    }

    public static String m(long j10) {
        return "TextRange(" + k(j10) + ", " + g(j10) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    public int hashCode() {
        return l(this.packedValue);
    }

    /* renamed from: n, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return m(this.packedValue);
    }

    public static long c(long j10) {
        return j10;
    }
}
