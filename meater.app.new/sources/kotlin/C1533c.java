package kotlin;

import Ba.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;

/* compiled from: ActualJvm.jvm.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011*\u001e\b\u0000\u0010\u0014\u001a\u0004\b\u0000\u0010\u0012\"\b\u0012\u0004\u0012\u00028\u00000\u00132\b\u0012\u0004\u0012\u00028\u00000\u0013*\f\b\u0000\u0010\u0015\"\u00020\u00002\u00020\u0000¨\u0006\u0016"}, d2 = {"", "instance", "", "c", "(Ljava/lang/Object;)I", "LO/l;", "composer", "Lkotlin/Function0;", "Loa/F;", "composable", "d", "(LO/l;LBa/p;)V", "", "a", "()J", "", "b", "()Ljava/lang/String;", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "TestOnly", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533c {
    public static final long a() {
        return Thread.currentThread().getId();
    }

    public static final String b() {
        return Thread.currentThread().getName();
    }

    public static final int c(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void d(InterfaceC1554l interfaceC1554l, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
        C3862t.e(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((p) W.f(pVar, 2)).invoke(interfaceC1554l, 1);
    }
}
