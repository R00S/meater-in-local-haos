package h0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: Size.kt */
@Aa.b
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\f\b\u0087@\u0018\u0000 !2\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010 \u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001e\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\""}, d2 = {"Lh0/m;", "", "", "packedValue", "d", "(J)J", "", "k", "(J)Z", "", "l", "(J)Ljava/lang/String;", "", "j", "(J)I", "other", "e", "(JLjava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "", "i", "(J)F", "getWidth$annotations", "width", "g", "getHeight$annotations", "height", "h", "getMinDimension$annotations", "minDimension", "b", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: h0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3482m {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f42204c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f42205d = d(9205357640488583168L);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lh0/m$a;", "", "<init>", "()V", "Lh0/m;", "Zero", "J", "b", "()J", "getZero-NH-jbRc$annotations", "Unspecified", "a", "getUnspecified-NH-jbRc$annotations", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: h0.m$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final long a() {
            return C3482m.f42205d;
        }

        public final long b() {
            return C3482m.f42204c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ C3482m(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ C3482m c(long j10) {
        return new C3482m(j10);
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof C3482m) && j10 == ((C3482m) obj).getPackedValue();
    }

    public static final boolean f(long j10, long j11) {
        return j10 == j11;
    }

    public static final float g(long j10) {
        if (j10 == 9205357640488583168L) {
            C3473d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float h(long j10) {
        if (j10 == 9205357640488583168L) {
            C3473d.a("Size is unspecified");
        }
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
    }

    public static final float i(long j10) {
        if (j10 == 9205357640488583168L) {
            C3473d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int j(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean k(long j10) {
        if (j10 == 9205357640488583168L) {
            C3473d.a("Size is unspecified");
        }
        long j11 = j10 & (~((((-9223372034707292160L) & j10) >>> 31) * (-1)));
        return ((j11 & 4294967295L) & (j11 >>> 32)) == 0;
    }

    public static String l(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + C3472c.a(i(j10), 1) + ", " + C3472c.a(g(j10), 1) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.packedValue, obj);
    }

    public int hashCode() {
        return j(this.packedValue);
    }

    /* renamed from: m, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return l(this.packedValue);
    }

    public static long d(long j10) {
        return j10;
    }
}
