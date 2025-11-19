package kotlin;

import Ba.l;
import Ba.p;
import Xb.C1849m;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC1545g0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: BroadcastFrameClock.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"LO/h;", "LO/g0;", "Lkotlin/Function0;", "Loa/F;", "onNewAwaiters", "<init>", "(LBa/a;)V", "", "cause", "v", "(Ljava/lang/Throwable;)V", "", "timeNanos", "A", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "K", "(LBa/l;Lta/d;)Ljava/lang/Object;", "B", "LBa/a;", "", "C", "Ljava/lang/Object;", "lock", "D", "Ljava/lang/Throwable;", "failureCause", "", "LO/h$a;", "E", "Ljava/util/List;", "awaiters", "F", "spareList", "LO/g;", "G", "LO/g;", "hasAwaitersUnlocked", "", "w", "()Z", "hasAwaiters", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546h implements InterfaceC1545g0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> onNewAwaiters;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Throwable failureCause;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private List<a<?>> awaiters = new ArrayList();

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private List<a<?>> spareList = new ArrayList();

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final C1544g hasAwaitersUnlocked = new C1544g(0);

    /* compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"LO/h$a;", "R", "", "Lkotlin/Function1;", "", "onFrame", "Lta/d;", "continuation", "<init>", "(LBa/l;Lta/d;)V", "timeNanos", "Loa/F;", "b", "(J)V", "a", "LBa/l;", "getOnFrame", "()LBa/l;", "Lta/d;", "()Lta/d;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.h$a */
    private static final class a<R> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l<Long, R> onFrame;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4588d<R> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
            this.onFrame = lVar;
            this.continuation = interfaceC4588d;
        }

        public final InterfaceC4588d<R> a() {
            return this.continuation;
        }

        public final void b(long timeNanos) {
            Object objA;
            InterfaceC4588d<R> interfaceC4588d = this.continuation;
            try {
                C4172q.Companion companion = C4172q.INSTANCE;
                objA = C4172q.a(this.onFrame.invoke(Long.valueOf(timeNanos)));
            } catch (Throwable th) {
                C4172q.Companion companion2 = C4172q.INSTANCE;
                objA = C4172q.a(C4173r.a(th));
            }
            interfaceC4588d.resumeWith(objA);
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.h$b */
    static final class b extends AbstractC3864v implements l<Throwable, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ a<R> f12858C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a<R> aVar) {
            super(1);
            this.f12858C = aVar;
        }

        public final void a(Throwable th) {
            Object obj = C1546h.this.lock;
            C1546h c1546h = C1546h.this;
            Object obj2 = this.f12858C;
            synchronized (obj) {
                try {
                    c1546h.awaiters.remove(obj2);
                    if (c1546h.awaiters.isEmpty()) {
                        c1546h.hasAwaitersUnlocked.set(0);
                    }
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    public C1546h(Ba.a<C4153F> aVar) {
        this.onNewAwaiters = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(Throwable cause) {
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                List<a<?>> list = this.awaiters;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC4588d<?> interfaceC4588dA = list.get(i10).a();
                    C4172q.Companion companion = C4172q.INSTANCE;
                    interfaceC4588dA.resumeWith(C4172q.a(C4173r.a(cause)));
                }
                this.awaiters.clear();
                this.hasAwaitersUnlocked.set(0);
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A(long timeNanos) {
        synchronized (this.lock) {
            try {
                List<a<?>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this.hasAwaitersUnlocked.set(0);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).b(timeNanos);
                }
                list.clear();
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.InterfaceC1545g0
    public <R> Object K(l<? super Long, ? extends R> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        a aVar = new a(lVar, c1849m);
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                C4172q.Companion companion = C4172q.INSTANCE;
                c1849m.resumeWith(C4172q.a(C4173r.a(th)));
            } else {
                boolean zIsEmpty = this.awaiters.isEmpty();
                this.awaiters.add(aVar);
                if (zIsEmpty) {
                    this.hasAwaitersUnlocked.set(1);
                }
                c1849m.R(new b(aVar));
                if (zIsEmpty && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        v(th2);
                    }
                }
            }
        }
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            h.c(interfaceC4588d);
        }
        return objR;
    }

    @Override // ta.g
    public <R> R L(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) InterfaceC1545g0.a.a(this, r10, pVar);
    }

    @Override // ta.g
    public g N(g.c<?> cVar) {
        return InterfaceC1545g0.a.c(this, cVar);
    }

    @Override // ta.g.b, ta.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) InterfaceC1545g0.a.b(this, cVar);
    }

    @Override // ta.g
    public g s(g gVar) {
        return InterfaceC1545g0.a.d(this, gVar);
    }

    public final boolean w() {
        return this.hasAwaitersUnlocked.get() != 0;
    }
}
