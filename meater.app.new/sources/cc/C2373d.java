package cc;

import kotlin.Metadata;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u0013\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcc/C;", "S", "", "id", "Lkotlin/Function2;", "createNewSegment", "Lcc/D;", "c", "(Lcc/C;JLBa/p;)Ljava/lang/Object;", "Lcc/e;", "N", "b", "(Lcc/e;)Lcc/e;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILBa/l;)Z", "Lcc/F;", "a", "Lcc/F;", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2373d {

    /* renamed from: a, reason: collision with root package name */
    private static final C2361F f31168a = new C2361F("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [cc.e] */
    public static final <N extends AbstractC2374e<N>> N b(N n10) {
        while (true) {
            Object objG = n10.g();
            if (objG == f31168a) {
                return n10;
            }
            ?? r02 = (AbstractC2374e) objG;
            if (r02 != 0) {
                n10 = r02;
            } else if (n10.m()) {
                return n10;
            }
        }
    }

    public static final <S extends AbstractC2358C<S>> Object c(S s10, long j10, Ba.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.id >= j10 && !s10.k()) {
                return C2359D.a(s10);
            }
            Object objG = s10.g();
            if (objG == f31168a) {
                return C2359D.a(f31168a);
            }
            S sInvoke = (S) ((AbstractC2374e) objG);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s10.id + 1), s10);
                if (s10.o(sInvoke)) {
                    if (s10.k()) {
                        s10.n();
                    }
                }
            }
            s10 = sInvoke;
        }
    }
}
