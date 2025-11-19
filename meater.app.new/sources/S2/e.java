package S2;

import java.util.List;
import m8.AbstractC4009y;

/* compiled from: CuesWithTiming.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4009y<W1.a> f15265a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15266b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15267c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15268d;

    public e(List<W1.a> list, long j10, long j11) {
        this.f15265a = AbstractC4009y.B(list);
        this.f15266b = j10;
        this.f15267c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f15268d = j12;
    }
}
