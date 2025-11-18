package kotlin.internal;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: progressionUtil.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, m32267d2 = {"differenceModulo", HttpUrl.FRAGMENT_ENCODE_SET, "a", "b", "c", HttpUrl.FRAGMENT_ENCODE_SET, "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.z.c */
/* loaded from: classes2.dex */
public final class C10869c {
    /* renamed from: a */
    private static final int m39066a(int i2, int i3, int i4) {
        return m39070e(m39070e(i2, i4) - m39070e(i3, i4), i4);
    }

    /* renamed from: b */
    private static final long m39067b(long j2, long j3, long j4) {
        return m39071f(m39071f(j2, j4) - m39071f(j3, j4), j4);
    }

    /* renamed from: c */
    public static final int m39068c(int i2, int i3, int i4) {
        if (i4 > 0) {
            return i2 >= i3 ? i3 : i3 - m39066a(i3, i2, i4);
        }
        if (i4 < 0) {
            return i2 <= i3 ? i3 : i3 + m39066a(i2, i3, -i4);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: d */
    public static final long m39069d(long j2, long j3, long j4) {
        if (j4 > 0) {
            return j2 >= j3 ? j3 : j3 - m39067b(j3, j2, j4);
        }
        if (j4 < 0) {
            return j2 <= j3 ? j3 : j3 + m39067b(j2, j3, -j4);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: e */
    private static final int m39070e(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    /* renamed from: f */
    private static final long m39071f(long j2, long j3) {
        long j4 = j2 % j3;
        return j4 >= 0 ? j4 : j4 + j3;
    }
}
