package p353j;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C9801m;

/* compiled from: SegmentPool.kt */
/* renamed from: j.z */
/* loaded from: classes3.dex */
public final class C9727z {

    /* renamed from: c */
    private static final int f37100c;

    /* renamed from: d */
    private static final AtomicReference<C9726y>[] f37101d;

    /* renamed from: e */
    public static final C9727z f37102e = new C9727z();

    /* renamed from: a */
    private static final int f37098a = 65536;

    /* renamed from: b */
    private static final C9726y f37099b = new C9726y(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f37100c = iHighestOneBit;
        AtomicReference<C9726y>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i2 = 0; i2 < iHighestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f37101d = atomicReferenceArr;
    }

    private C9727z() {
    }

    /* renamed from: a */
    private final AtomicReference<C9726y> m32168a() {
        Thread threadCurrentThread = Thread.currentThread();
        C9801m.m32345e(threadCurrentThread, "Thread.currentThread()");
        return f37101d[(int) (threadCurrentThread.getId() & (f37100c - 1))];
    }

    /* renamed from: b */
    public static final void m32169b(C9726y c9726y) {
        AtomicReference<C9726y> atomicReferenceM32168a;
        C9726y c9726y2;
        C9801m.m32346f(c9726y, "segment");
        if (!(c9726y.f37096g == null && c9726y.f37097h == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c9726y.f37094e || (c9726y2 = (atomicReferenceM32168a = f37102e.m32168a()).get()) == f37099b) {
            return;
        }
        int i2 = c9726y2 != null ? c9726y2.f37093d : 0;
        if (i2 >= f37098a) {
            return;
        }
        c9726y.f37096g = c9726y2;
        c9726y.f37092c = 0;
        c9726y.f37093d = i2 + 8192;
        if (atomicReferenceM32168a.compareAndSet(c9726y2, c9726y)) {
            return;
        }
        c9726y.f37096g = null;
    }

    /* renamed from: c */
    public static final C9726y m32170c() {
        AtomicReference<C9726y> atomicReferenceM32168a = f37102e.m32168a();
        C9726y c9726y = f37099b;
        C9726y andSet = atomicReferenceM32168a.getAndSet(c9726y);
        if (andSet == c9726y) {
            return new C9726y();
        }
        if (andSet == null) {
            atomicReferenceM32168a.set(null);
            return new C9726y();
        }
        atomicReferenceM32168a.set(andSet.f37096g);
        andSet.f37096g = null;
        andSet.f37093d = 0;
        return andSet;
    }
}
