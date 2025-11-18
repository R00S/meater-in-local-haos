package Xb;

import Xb.InterfaceC1867v0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3860q;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0017\u001a\u00020\u0010*\u00020\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\u0010*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0010*\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010 \u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u00020\u0010*\u00020\u00132\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\"\u0010\u0018\"\u0015\u0010%\u001a\u00020\u0001*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010(\u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"LXb/v0;", "", "onCancelling", "invokeImmediately", "LXb/s0;", "handler", "LXb/b0;", "n", "(LXb/v0;ZZLXb/s0;)LXb/b0;", "parent", "LXb/x;", "a", "(LXb/v0;)LXb/x;", "handle", "j", "(LXb/v0;LXb/b0;)LXb/b0;", "Loa/F;", "g", "(LXb/v0;Lta/d;)Ljava/lang/Object;", "Lta/g;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "d", "(Lta/g;Ljava/util/concurrent/CancellationException;)V", "k", "(LXb/v0;)V", "l", "(Lta/g;)V", "", "message", "", "c", "(LXb/v0;Ljava/lang/String;Ljava/lang/Throwable;)V", "h", "p", "(Lta/g;)Z", "isActive", "m", "(Lta/g;)LXb/v0;", "job", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class A0 {

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends C3860q implements Ba.l<Throwable, C4153F> {
        a(Object obj) {
            super(1, obj, InterfaceC1861s0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void c(Throwable th) {
            ((InterfaceC1861s0) this.receiver).b(th);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            c(th);
            return C4153F.f46609a;
        }
    }

    public static final InterfaceC1870x a(InterfaceC1867v0 interfaceC1867v0) {
        return new C1871x0(interfaceC1867v0);
    }

    public static /* synthetic */ InterfaceC1870x b(InterfaceC1867v0 interfaceC1867v0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC1867v0 = null;
        }
        return C1873y0.a(interfaceC1867v0);
    }

    public static final void c(InterfaceC1867v0 interfaceC1867v0, String str, Throwable th) {
        interfaceC1867v0.e(C1846k0.a(str, th));
    }

    public static final void d(ta.g gVar, CancellationException cancellationException) {
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 != null) {
            interfaceC1867v0.e(cancellationException);
        }
    }

    public static /* synthetic */ void e(InterfaceC1867v0 interfaceC1867v0, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        C1873y0.c(interfaceC1867v0, str, th);
    }

    public static /* synthetic */ void f(ta.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C1873y0.d(gVar, cancellationException);
    }

    public static final Object g(InterfaceC1867v0 interfaceC1867v0, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        Object objO = interfaceC1867v0.o(interfaceC4588d);
        return objO == C4696b.e() ? objO : C4153F.f46609a;
    }

    public static final void h(ta.g gVar, CancellationException cancellationException) {
        Tb.h<InterfaceC1867v0> hVarP;
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 == null || (hVarP = interfaceC1867v0.p()) == null) {
            return;
        }
        Iterator<InterfaceC1867v0> it = hVarP.iterator();
        while (it.hasNext()) {
            it.next().e(cancellationException);
        }
    }

    public static /* synthetic */ void i(ta.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C1873y0.h(gVar, cancellationException);
    }

    public static final InterfaceC1828b0 j(InterfaceC1867v0 interfaceC1867v0, InterfaceC1828b0 interfaceC1828b0) {
        return o(interfaceC1867v0, false, false, new C1832d0(interfaceC1828b0), 3, null);
    }

    public static final void k(InterfaceC1867v0 interfaceC1867v0) {
        if (!interfaceC1867v0.a()) {
            throw interfaceC1867v0.u();
        }
    }

    public static final void l(ta.g gVar) {
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 != null) {
            C1873y0.l(interfaceC1867v0);
        }
    }

    public static final InterfaceC1867v0 m(ta.g gVar) {
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 != null) {
            return interfaceC1867v0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final InterfaceC1828b0 n(InterfaceC1867v0 interfaceC1867v0, boolean z10, boolean z11, InterfaceC1861s0 interfaceC1861s0) {
        return interfaceC1867v0 instanceof C0 ? ((C0) interfaceC1867v0).x0(z10, z11, interfaceC1861s0) : interfaceC1867v0.o0(z10, z11, new a(interfaceC1861s0));
    }

    public static /* synthetic */ InterfaceC1828b0 o(InterfaceC1867v0 interfaceC1867v0, boolean z10, boolean z11, InterfaceC1861s0 interfaceC1861s0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return C1873y0.o(interfaceC1867v0, z10, z11, interfaceC1861s0);
    }

    public static final boolean p(ta.g gVar) {
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 != null) {
            return interfaceC1867v0.a();
        }
        return true;
    }
}
