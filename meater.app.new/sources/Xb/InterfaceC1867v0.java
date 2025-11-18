package Xb;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 +2\u00020\u0001:\u0001,J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\u00182\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\u0018\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0016H'¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u00008&X§\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\bR\u0014\u0010&\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"LXb/v0;", "Lta/g$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "u", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "Loa/F;", "e", "(Ljava/util/concurrent/CancellationException;)V", "LXb/t;", "child", "LXb/r;", "a0", "(LXb/t;)LXb/r;", "o", "(Lta/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "LXb/b0;", "q", "(LBa/l;)LXb/b0;", "onCancelling", "invokeImmediately", "o0", "(ZZLBa/l;)LXb/b0;", "getParent", "()LXb/v0;", "getParent$annotations", "()V", "parent", "a", "isActive", "isCancelled", "LTb/h;", "p", "()LTb/h;", "children", "g", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1867v0 extends g.b {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f19110B;

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.v0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC1867v0 interfaceC1867v0, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC1867v0.e(cancellationException);
        }

        public static <R> R b(InterfaceC1867v0 interfaceC1867v0, R r10, Ba.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(interfaceC1867v0, r10, pVar);
        }

        public static <E extends g.b> E c(InterfaceC1867v0 interfaceC1867v0, g.c<E> cVar) {
            return (E) g.b.a.b(interfaceC1867v0, cVar);
        }

        public static ta.g d(InterfaceC1867v0 interfaceC1867v0, g.c<?> cVar) {
            return g.b.a.c(interfaceC1867v0, cVar);
        }

        public static ta.g e(InterfaceC1867v0 interfaceC1867v0, ta.g gVar) {
            return g.b.a.d(interfaceC1867v0, gVar);
        }
    }

    /* compiled from: Job.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LXb/v0$b;", "Lta/g$c;", "LXb/v0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.v0$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<InterfaceC1867v0> {

        /* renamed from: B, reason: collision with root package name */
        static final /* synthetic */ Companion f19110B = new Companion();

        private Companion() {
        }
    }

    boolean a();

    r a0(InterfaceC1862t child);

    void e(CancellationException cause);

    InterfaceC1867v0 getParent();

    boolean isCancelled();

    Object o(InterfaceC4588d<? super C4153F> interfaceC4588d);

    InterfaceC1828b0 o0(boolean onCancelling, boolean invokeImmediately, Ba.l<? super Throwable, C4153F> handler);

    Tb.h<InterfaceC1867v0> p();

    InterfaceC1828b0 q(Ba.l<? super Throwable, C4153F> handler);

    boolean start();

    CancellationException u();
}
