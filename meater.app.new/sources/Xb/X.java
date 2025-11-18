package Xb;

import cc.C2365J;
import cc.C2379j;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;

/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "LXb/W;", "", "mode", "Loa/F;", "a", "(LXb/W;I)V", "Lta/d;", "delegate", "", "undispatched", "d", "(LXb/W;Lta/d;Z)V", "e", "(LXb/W;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class X {
    public static final <T> void a(W<? super T> w10, int i10) {
        InterfaceC4588d<? super T> interfaceC4588dB = w10.b();
        boolean z10 = i10 == 4;
        if (z10 || !(interfaceC4588dB instanceof C2379j) || b(i10) != b(w10.resumeMode)) {
            d(w10, interfaceC4588dB, z10);
            return;
        }
        E e10 = ((C2379j) interfaceC4588dB).dispatcher;
        ta.g context = interfaceC4588dB.getContext();
        if (e10.v0(context)) {
            e10.p0(context, w10);
        } else {
            e(w10);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(W<? super T> w10, InterfaceC4588d<? super T> interfaceC4588d, boolean z10) {
        Object objE;
        Object objG = w10.g();
        Throwable thD = w10.d(objG);
        if (thD != null) {
            C4172q.Companion companion = C4172q.INSTANCE;
            objE = C4173r.a(thD);
        } else {
            C4172q.Companion companion2 = C4172q.INSTANCE;
            objE = w10.e(objG);
        }
        Object objA = C4172q.a(objE);
        if (!z10) {
            interfaceC4588d.resumeWith(objA);
            return;
        }
        C3862t.e(interfaceC4588d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2379j c2379j = (C2379j) interfaceC4588d;
        InterfaceC4588d<T> interfaceC4588d2 = c2379j.continuation;
        Object obj = c2379j.countOrElement;
        ta.g context = interfaceC4588d2.getContext();
        Object objC = C2365J.c(context, obj);
        X0<?> x0G = objC != C2365J.f31152a ? D.g(interfaceC4588d2, context, objC) : null;
        try {
            c2379j.continuation.resumeWith(objA);
            C4153F c4153f = C4153F.f46609a;
        } finally {
            if (x0G == null || x0G.f1()) {
                C2365J.a(context, objC);
            }
        }
    }

    private static final void e(W<?> w10) {
        AbstractC1836f0 abstractC1836f0B = T0.f19045a.b();
        if (abstractC1836f0B.X0()) {
            abstractC1836f0B.O0(w10);
            return;
        }
        abstractC1836f0B.S0(true);
        try {
            d(w10, w10.b(), true);
            do {
            } while (abstractC1836f0B.h1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
