package Cc;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SegmentPool.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LCc/x;", "", "<init>", "()V", "LCc/w;", "c", "()LCc/w;", "segment", "Loa/F;", "b", "(LCc/w;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "a", "()Ljava/util/concurrent/atomic/AtomicReference;", "", "I", "getMAX_SIZE", "()I", "MAX_SIZE", "LCc/w;", "LOCK", "d", "HASH_BUCKET_COUNT", "", "e", "[Ljava/util/concurrent/atomic/AtomicReference;", "hashBuckets", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f3283a = new x();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int MAX_SIZE = 65536;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final w LOCK = new w(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int HASH_BUCKET_COUNT;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<w>[] hashBuckets;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = iHighestOneBit;
        AtomicReference<w>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        hashBuckets = atomicReferenceArr;
    }

    private x() {
    }

    private final AtomicReference<w> a() {
        return hashBuckets[(int) (Thread.currentThread().getId() & (HASH_BUCKET_COUNT - 1))];
    }

    public static final void b(w segment) {
        AtomicReference<w> atomicReferenceA;
        w wVar;
        w andSet;
        C3862t.g(segment, "segment");
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.shared || (andSet = (atomicReferenceA = f3283a.a()).getAndSet((wVar = LOCK))) == wVar) {
            return;
        }
        int i10 = andSet != null ? andSet.limit : 0;
        if (i10 >= MAX_SIZE) {
            atomicReferenceA.set(andSet);
            return;
        }
        segment.next = andSet;
        segment.pos = 0;
        segment.limit = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final w c() {
        AtomicReference<w> atomicReferenceA = f3283a.a();
        w wVar = LOCK;
        w andSet = atomicReferenceA.getAndSet(wVar);
        if (andSet == wVar) {
            return new w();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new w();
        }
        atomicReferenceA.set(andSet.next);
        andSet.next = null;
        andSet.limit = 0;
        return andSet;
    }
}
