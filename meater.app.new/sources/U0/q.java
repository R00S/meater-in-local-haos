package U0;

import h0.C3478i;
import kotlin.Metadata;

/* compiled from: IntRect.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"LU0/n;", "offset", "LU0/r;", "size", "LU0/p;", "a", "(JJ)LU0/p;", "Lh0/i;", "b", "(Lh0/i;)LU0/p;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {
    public static final p a(long j10, long j11) {
        return new p(n.h(j10), n.i(j10), n.h(j10) + r.g(j11), n.i(j10) + r.f(j11));
    }

    public static final p b(C3478i c3478i) {
        return new p(Math.round(c3478i.getLeft()), Math.round(c3478i.getTop()), Math.round(c3478i.getRight()), Math.round(c3478i.getBottom()));
    }
}
