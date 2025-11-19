package Xb;

import cc.C2379j;
import cc.C2382m;
import cc.C2383n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import ta.AbstractC4585a;
import ta.AbstractC4586b;
import ta.InterfaceC4588d;
import ta.e;
import ta.g;

/* compiled from: CoroutineDispatcher.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00112\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"LXb/E;", "Lta/a;", "Lta/e;", "<init>", "()V", "Lta/g;", "context", "", "v0", "(Lta/g;)Z", "", "parallelism", "C0", "(I)LXb/E;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loa/F;", "p0", "(Lta/g;Ljava/lang/Runnable;)V", "r0", "T", "Lta/d;", "continuation", "m", "(Lta/d;)Lta/d;", "l", "(Lta/d;)V", "", "toString", "()Ljava/lang/String;", "C", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class E extends AbstractC4585a implements ta.e {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CoroutineDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LXb/E$a;", "Lta/b;", "Lta/e;", "LXb/E;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.E$a, reason: from kotlin metadata */
    public static final class Companion extends AbstractC4586b<ta.e, E> {

        /* compiled from: CoroutineDispatcher.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lta/g$b;", "it", "LXb/E;", "a", "(Lta/g$b;)LXb/E;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: Xb.E$a$a, reason: collision with other inner class name */
        static final class C0276a extends AbstractC3864v implements Ba.l<g.b, E> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0276a f19021B = new C0276a();

            C0276a() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke(g.b bVar) {
                if (bVar instanceof E) {
                    return (E) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
            super(ta.e.INSTANCE, C0276a.f19021B);
        }
    }

    public E() {
        super(ta.e.INSTANCE);
    }

    public E C0(int parallelism) {
        C2383n.a(parallelism);
        return new C2382m(this, parallelism);
    }

    @Override // ta.AbstractC4585a, ta.g
    public ta.g N(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    @Override // ta.AbstractC4585a, ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // ta.e
    public final void l(InterfaceC4588d<?> continuation) {
        C3862t.e(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C2379j) continuation).o();
    }

    @Override // ta.e
    public final <T> InterfaceC4588d<T> m(InterfaceC4588d<? super T> continuation) {
        return new C2379j(this, continuation);
    }

    public abstract void p0(ta.g context, Runnable block);

    public void r0(ta.g context, Runnable block) {
        p0(context, block);
    }

    public String toString() {
        return M.a(this) + '@' + M.b(this);
    }

    public boolean v0(ta.g context) {
        return true;
    }
}
