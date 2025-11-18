package Ha;

import Ha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u000f\u001a\u0019\u0010\u0018\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012\u001a\u0019\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0015\u001a!\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010!\u001a\u00020 *\u00020 2\u0006\u0010\r\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020 ¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "to", "LHa/d;", "m", "(II)LHa/d;", "n", "(LHa/d;)LHa/d;", "step", "o", "(LHa/d;I)LHa/d;", "LHa/f;", "p", "(II)LHa/f;", "minimumValue", "d", "(II)I", "", "e", "(JJ)J", "", "c", "(FF)F", "maximumValue", "g", "h", "f", "k", "(III)I", "l", "(JJJ)J", "j", "(FFF)F", "", "i", "(DDD)D", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes2.dex */
public class i extends h {
    public static float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int d(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static float f(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int g(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long h(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double i(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float j(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int k(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long l(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static d m(int i10, int i11) {
        return d.INSTANCE.a(i10, i11, -1);
    }

    public static d n(d dVar) {
        C3862t.g(dVar, "<this>");
        return d.INSTANCE.a(dVar.getLast(), dVar.getFirst(), -dVar.getStep());
    }

    public static d o(d dVar, int i10) {
        C3862t.g(dVar, "<this>");
        h.a(i10 > 0, Integer.valueOf(i10));
        d.Companion companion = d.INSTANCE;
        int first = dVar.getFirst();
        int last = dVar.getLast();
        if (dVar.getStep() <= 0) {
            i10 = -i10;
        }
        return companion.a(first, last, i10);
    }

    public static f p(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? f.INSTANCE.a() : new f(i10, i11 - 1);
    }
}
