package kotlin;

import Aa.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: AnimationSpec.kt */
@b
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\r\u0088\u0001\t\u0092\u0001\u00020\b¨\u0006\u000e"}, d2 = {"Lv/i0;", "", "", "offsetMillis", "Lv/j0;", "offsetType", "a", "(II)J", "", "value", "b", "(J)J", "e", "(J)I", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4754i0 {
    public static long a(int i10, int i11) {
        return b(i10 * i11);
    }

    public static /* synthetic */ long c(int i10, int i11, int i12, C3854k c3854k) {
        if ((i12 & 2) != 0) {
            i11 = C4756j0.INSTANCE.a();
        }
        return a(i10, i11);
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    private static long b(long j10) {
        return j10;
    }
}
