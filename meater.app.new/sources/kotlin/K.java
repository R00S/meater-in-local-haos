package kotlin;

import kotlin.Metadata;
import s.C4387I;
import s.S;

/* compiled from: LazyLayoutPrefetchState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"LC/K;", "", "<init>", "()V", "", "new", "current", "d", "(JJ)J", "Ls/I;", "a", "Ls/I;", "f", "()Ls/I;", "averageCompositionTimeNanosByContentType", "b", "h", "averageMeasureTimeNanosByContentType", "<set-?>", "c", "J", "e", "()J", "averageCompositionTimeNanos", "g", "averageMeasureTimeNanos", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4387I<Object> averageCompositionTimeNanosByContentType = S.a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4387I<Object> averageMeasureTimeNanosByContentType = S.a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long averageCompositionTimeNanos;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long averageMeasureTimeNanos;

    /* JADX INFO: Access modifiers changed from: private */
    public final long d(long j10, long current) {
        if (current == 0) {
            return j10;
        }
        long j11 = 4;
        return (j10 / j11) + ((current / j11) * 3);
    }

    /* renamed from: e, reason: from getter */
    public final long getAverageCompositionTimeNanos() {
        return this.averageCompositionTimeNanos;
    }

    public final C4387I<Object> f() {
        return this.averageCompositionTimeNanosByContentType;
    }

    /* renamed from: g, reason: from getter */
    public final long getAverageMeasureTimeNanos() {
        return this.averageMeasureTimeNanos;
    }

    public final C4387I<Object> h() {
        return this.averageMeasureTimeNanosByContentType;
    }
}
