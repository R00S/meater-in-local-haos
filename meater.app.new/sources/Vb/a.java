package Vb;

import Ub.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Duration.kt */
@Aa.b
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b$\b\u0087@\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001OB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\n\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010'\u001a\u00020&*\u00060 j\u0002`!2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001d¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u0014\u00104\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00103R\u0014\u00106\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u001a\u0010:\u001a\u00020\u00168@X\u0081\u0004¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010+R\u001a\u0010=\u001a\u00020\u00168@X\u0081\u0004¢\u0006\f\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010+R\u001a\u0010@\u001a\u00020\u00168@X\u0081\u0004¢\u0006\f\u0012\u0004\b?\u00109\u001a\u0004\b>\u0010+R\u001a\u0010C\u001a\u00020\u00168@X\u0081\u0004¢\u0006\f\u0012\u0004\bB\u00109\u001a\u0004\bA\u0010+R\u0011\u0010E\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bD\u0010\u0005R\u0011\u0010F\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010\u0005R\u0011\u0010H\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010\u0005R\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010\u0005R\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010\u0005R\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0004\n\u0002\b!¨\u0006P"}, d2 = {"LVb/a;", "", "", "rawValue", "v", "(J)J", "", "O", "(J)Z", "N", "W", "other", "S", "(JJ)J", "thisMillis", "otherNanos", "n", "(JJJ)J", "Q", "R", "P", "M", "", "u", "(JJ)I", "LVb/d;", "unit", "U", "(JLVb/d;)J", "", "V", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "Loa/F;", "p", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "T", "L", "(J)I", "", "w", "(JLjava/lang/Object;)Z", "B", "J", "K", "value", "(J)LVb/d;", "storageUnit", "y", "absoluteValue", "z", "getHoursComponent$annotations", "()V", "hoursComponent", "G", "getMinutesComponent$annotations", "minutesComponent", "I", "getSecondsComponent$annotations", "secondsComponent", "H", "getNanosecondsComponent$annotations", "nanosecondsComponent", "A", "inWholeDays", "inWholeHours", "E", "inWholeMinutes", "F", "inWholeSeconds", "D", "inWholeMilliseconds", "C", "inWholeMicroseconds", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements Comparable<a> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: D, reason: collision with root package name */
    private static final long f18237D = v(0);

    /* renamed from: E, reason: collision with root package name */
    private static final long f18238E = c.i(4611686018427387903L);

    /* renamed from: F, reason: collision with root package name */
    private static final long f18239F = c.i(-4611686018427387903L);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final long rawValue;

    /* compiled from: Duration.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u000b"}, d2 = {"LVb/a$a;", "", "<init>", "()V", "LVb/a;", "INFINITE", "J", "a", "()J", "NEG_INFINITE", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vb.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final long a() {
            return a.f18238E;
        }

        public final long b() {
            return a.f18239F;
        }

        private Companion() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.rawValue = j10;
    }

    public static final long A(long j10) {
        return U(j10, d.f18249I);
    }

    public static final long B(long j10) {
        return U(j10, d.f18248H);
    }

    public static final long C(long j10) {
        return U(j10, d.f18244D);
    }

    public static final long D(long j10) {
        return (N(j10) && M(j10)) ? K(j10) : U(j10, d.f18245E);
    }

    public static final long E(long j10) {
        return U(j10, d.f18247G);
    }

    public static final long F(long j10) {
        return U(j10, d.f18246F);
    }

    public static final int G(long j10) {
        if (P(j10)) {
            return 0;
        }
        return (int) (E(j10) % 60);
    }

    public static final int H(long j10) {
        if (P(j10)) {
            return 0;
        }
        return (int) (N(j10) ? c.m(K(j10) % 1000) : K(j10) % 1000000000);
    }

    public static final int I(long j10) {
        if (P(j10)) {
            return 0;
        }
        return (int) (F(j10) % 60);
    }

    private static final d J(long j10) {
        return O(j10) ? d.f18243C : d.f18245E;
    }

    private static final long K(long j10) {
        return j10 >> 1;
    }

    public static int L(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean M(long j10) {
        return !P(j10);
    }

    private static final boolean N(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean O(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean P(long j10) {
        return j10 == f18238E || j10 == f18239F;
    }

    public static final boolean Q(long j10) {
        return j10 < 0;
    }

    public static final boolean R(long j10) {
        return j10 > 0;
    }

    public static final long S(long j10, long j11) {
        if (P(j10)) {
            if (M(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (P(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return N(j10) ? n(j10, K(j10), K(j11)) : n(j10, K(j11), K(j10));
        }
        long jK = K(j10) + K(j11);
        return O(j10) ? c.l(jK) : c.j(jK);
    }

    public static final String T(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (Q(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jY = y(j10);
        long jB = B(jY);
        int iG = G(jY);
        int I10 = I(jY);
        int iH = H(jY);
        if (P(j10)) {
            jB = 9999999999999L;
        }
        boolean z10 = false;
        boolean z11 = jB != 0;
        boolean z12 = (I10 == 0 && iH == 0) ? false : true;
        if (iG != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(jB);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iG);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            p(j10, sb2, I10, iH, 9, "S", true);
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static final long U(long j10, d unit) {
        C3862t.g(unit, "unit");
        if (j10 == f18238E) {
            return Long.MAX_VALUE;
        }
        if (j10 == f18239F) {
            return Long.MIN_VALUE;
        }
        return e.a(K(j10), J(j10), unit);
    }

    public static String V(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f18238E) {
            return "Infinity";
        }
        if (j10 == f18239F) {
            return "-Infinity";
        }
        boolean zQ = Q(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zQ) {
            sb2.append('-');
        }
        long jY = y(j10);
        long jA = A(jY);
        int iZ = z(jY);
        int iG = G(jY);
        int I10 = I(jY);
        int iH = H(jY);
        int i10 = 0;
        boolean z10 = jA != 0;
        boolean z11 = iZ != 0;
        boolean z12 = iG != 0;
        boolean z13 = (I10 == 0 && iH == 0) ? false : true;
        if (z10) {
            sb2.append(jA);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iZ);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iG);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (I10 != 0 || z10 || z11 || z12) {
                p(j10, sb2, I10, iH, 9, "s", false);
            } else if (iH >= 1000000) {
                p(j10, sb2, iH / 1000000, iH % 1000000, 6, "ms", false);
            } else if (iH >= 1000) {
                p(j10, sb2, iH / 1000, iH % 1000, 3, "us", false);
            } else {
                sb2.append(iH);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zQ && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public static final long W(long j10) {
        return c.h(-K(j10), ((int) j10) & 1);
    }

    private static final long n(long j10, long j11, long j12) {
        long jN = c.n(j12);
        long j13 = j11 + jN;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return c.i(Ha.g.l(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.k(c.m(j13) + (j12 - c.m(jN)));
    }

    private static final void p(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strJ0 = n.j0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strJ0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strJ0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strJ0, 0, ((i13 + 3) / 3) * 3);
                C3862t.f(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strJ0, 0, i15);
                C3862t.f(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a s(long j10) {
        return new a(j10);
    }

    public static int u(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return C3862t.j(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return Q(j10) ? -i10 : i10;
    }

    public static long v(long j10) {
        if (b.a()) {
            if (O(j10)) {
                long jK = K(j10);
                if (-4611686018426999999L > jK || jK >= 4611686018427000000L) {
                    throw new AssertionError(K(j10) + " ns is out of nanoseconds range");
                }
            } else {
                long jK2 = K(j10);
                if (-4611686018427387903L > jK2 || jK2 >= 4611686018427387904L) {
                    throw new AssertionError(K(j10) + " ms is out of milliseconds range");
                }
                long jK3 = K(j10);
                if (-4611686018426L <= jK3 && jK3 < 4611686018427L) {
                    throw new AssertionError(K(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static boolean w(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).getRawValue();
    }

    public static final boolean x(long j10, long j11) {
        return j10 == j11;
    }

    public static final long y(long j10) {
        return Q(j10) ? W(j10) : j10;
    }

    public static final int z(long j10) {
        if (P(j10)) {
            return 0;
        }
        return (int) (B(j10) % 24);
    }

    /* renamed from: X, reason: from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return t(aVar.getRawValue());
    }

    public boolean equals(Object obj) {
        return w(this.rawValue, obj);
    }

    public int hashCode() {
        return L(this.rawValue);
    }

    public int t(long j10) {
        return u(this.rawValue, j10);
    }

    public String toString() {
        return V(this.rawValue);
    }
}
