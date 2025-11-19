package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: IntOffset.kt */
@Aa.b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000  2\u00020\u0001:\u0001\u0018B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0016\u0010\u000f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"LU0/n;", "", "", "packedValue", "c", "(J)J", "", "x", "y", "d", "(JII)J", "other", "k", "(JJ)J", "l", "n", "", "m", "(J)Ljava/lang/String;", "j", "(J)I", "", "f", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "h", "getX$annotations", "i", "getY$annotations", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f16745c = c(0);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: IntOffset.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"LU0/n$a;", "", "<init>", "()V", "LU0/n;", "Zero", "J", "a", "()J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.n$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final long a() {
            return n.f16745c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ n(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ n b(long j10) {
        return new n(j10);
    }

    public static final long d(long j10, int i10, int i11) {
        return c((i10 << 32) | (i11 & 4294967295L));
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (4294967295L & j10);
        }
        return d(j10, i10, i11);
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof n) && j10 == ((n) obj).getPackedValue();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final int h(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final long k(long j10, long j11) {
        return c(((((int) (j10 >> 32)) - ((int) (j11 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L))) & 4294967295L));
    }

    public static final long l(long j10, long j11) {
        return c(((((int) (j10 >> 32)) + ((int) (j11 >> 32))) << 32) | ((((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L))) & 4294967295L));
    }

    public static String m(long j10) {
        return '(' + h(j10) + ", " + i(j10) + ')';
    }

    public static final long n(long j10) {
        return c(((-((int) (j10 & 4294967295L))) & 4294967295L) | ((-((int) (j10 >> 32))) << 32));
    }

    public boolean equals(Object obj) {
        return f(this.packedValue, obj);
    }

    public int hashCode() {
        return j(this.packedValue);
    }

    /* renamed from: o, reason: from getter */
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
