package gc;

import Ba.l;
import Ba.q;
import Xb.C1849m;
import Xb.C1853o;
import Xb.E;
import Xb.InterfaceC1847l;
import Xb.M;
import Xb.Z0;
import cc.AbstractC2358C;
import fc.InterfaceC3366b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017RD\u0010\u001f\u001a2\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u001a0\u0018j\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004¨\u0006$"}, d2 = {"Lgc/b;", "Lgc/d;", "Lgc/a;", "", "locked", "<init>", "(Z)V", "", "owner", "", "u", "(Ljava/lang/Object;)I", "Loa/F;", "w", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "x", "d", "a", "(Ljava/lang/Object;)Z", "c", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "Lfc/b;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "h", "LBa/q;", "onSelectCancellationUnlockConstructor", "b", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3461b extends C3463d implements InterfaceC3460a {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42142i = AtomicReferenceFieldUpdater.newUpdater(C3461b.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q<InterfaceC3366b<?>, Object, Object, l<Throwable, C4153F>> onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u00020\u00022\u0018\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00020\u0012j\u0002`\u0013H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001c\u0010\u001c\u001a\u00020\u0002*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\"\u001a\u00020\u00022\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010!\u001a\u00020 H\u0096\u0001¢\u0006\u0004\b\"\u0010#J9\u0010&\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0016¢\u0006\u0004\b&\u0010'J-\u0010(\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lgc/b$a;", "LXb/l;", "Loa/F;", "LXb/Z0;", "LXb/m;", "cont", "", "owner", "<init>", "(Lgc/b;LXb/m;Ljava/lang/Object;)V", "", "cause", "", "M", "(Ljava/lang/Throwable;)Z", "token", "T", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "R", "(LBa/l;)V", "Loa/q;", "result", "resumeWith", "LXb/E;", "value", "b", "(LXb/E;Loa/F;)V", "Lcc/C;", "segment", "", "index", "c", "(Lcc/C;I)V", "idempotent", "onCancellation", "d", "(Loa/F;Ljava/lang/Object;LBa/l;)Ljava/lang/Object;", "a", "(Loa/F;LBa/l;)V", "B", "LXb/m;", "C", "Ljava/lang/Object;", "Lta/g;", "getContext", "()Lta/g;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc.b$a */
    private final class a implements InterfaceC1847l<C4153F>, Z0 {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        public final C1849m<C4153F> cont;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        public final Object owner;

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gc.b$a$a, reason: collision with other inner class name */
        static final class C0536a extends AbstractC3864v implements l<Throwable, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C3461b f42147B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ a f42148C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0536a(C3461b c3461b, a aVar) {
                super(1);
                this.f42147B = c3461b;
                this.f42148C = aVar;
            }

            public final void a(Throwable th) {
                this.f42147B.c(this.f42148C.owner);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
                a(th);
                return C4153F.f46609a;
            }
        }

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gc.b$a$b, reason: collision with other inner class name */
        static final class C0537b extends AbstractC3864v implements l<Throwable, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C3461b f42149B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ a f42150C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0537b(C3461b c3461b, a aVar) {
                super(1);
                this.f42149B = c3461b;
                this.f42150C = aVar;
            }

            public final void a(Throwable th) {
                C3461b.t().set(this.f42149B, this.f42150C.owner);
                this.f42149B.c(this.f42150C.owner);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
                a(th);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(C1849m<? super C4153F> c1849m, Object obj) {
            this.cont = c1849m;
            this.owner = obj;
        }

        @Override // Xb.InterfaceC1847l
        public boolean M(Throwable cause) {
            return this.cont.M(cause);
        }

        @Override // Xb.InterfaceC1847l
        public void R(l<? super Throwable, C4153F> handler) {
            this.cont.R(handler);
        }

        @Override // Xb.InterfaceC1847l
        public void T(Object token) {
            this.cont.T(token);
        }

        @Override // Xb.InterfaceC1847l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void J(C4153F value, l<? super Throwable, C4153F> onCancellation) {
            C3461b.t().set(C3461b.this, this.owner);
            this.cont.J(value, new C0536a(C3461b.this, this));
        }

        @Override // Xb.InterfaceC1847l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void F(E e10, C4153F c4153f) {
            this.cont.F(e10, c4153f);
        }

        @Override // Xb.Z0
        public void c(AbstractC2358C<?> segment, int index) {
            this.cont.c(segment, index);
        }

        @Override // Xb.InterfaceC1847l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object S(C4153F value, Object idempotent, l<? super Throwable, C4153F> onCancellation) {
            Object objS = this.cont.S(value, idempotent, new C0537b(C3461b.this, this));
            if (objS != null) {
                C3461b.t().set(C3461b.this, this.owner);
            }
            return objS;
        }

        @Override // ta.InterfaceC4588d
        public g getContext() {
            return this.cont.getContext();
        }

        @Override // ta.InterfaceC4588d
        public void resumeWith(Object result) {
            this.cont.resumeWith(result);
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lfc/b;", "<anonymous parameter 0>", "", "owner", "<anonymous parameter 2>", "Lkotlin/Function1;", "", "Loa/F;", "a", "(Lfc/b;Ljava/lang/Object;Ljava/lang/Object;)LBa/l;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gc.b$b, reason: collision with other inner class name */
    static final class C0538b extends AbstractC3864v implements q<InterfaceC3366b<?>, Object, Object, l<? super Throwable, ? extends C4153F>> {

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: gc.b$b$a */
        static final class a extends AbstractC3864v implements l<Throwable, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ C3461b f42152B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Object f42153C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3461b c3461b, Object obj) {
                super(1);
                this.f42152B = c3461b;
                this.f42153C = obj;
            }

            public final void a(Throwable th) {
                this.f42152B.c(this.f42153C);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
                a(th);
                return C4153F.f46609a;
            }
        }

        C0538b() {
            super(3);
        }

        @Override // Ba.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l<Throwable, C4153F> g(InterfaceC3366b<?> interfaceC3366b, Object obj, Object obj2) {
            return new a(C3461b.this, obj);
        }
    }

    public C3461b(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : C3462c.f42154a;
        this.onSelectCancellationUnlockConstructor = new C0538b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater t() {
        return f42142i;
    }

    private final int u(Object owner) {
        while (b()) {
            Object obj = f42142i.get(this);
            if (obj != C3462c.f42154a) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object v(C3461b c3461b, Object obj, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (c3461b.a(obj)) {
            return C4153F.f46609a;
        }
        Object objW = c3461b.w(obj, interfaceC4588d);
        return objW == C4696b.e() ? objW : C4153F.f46609a;
    }

    private final Object w(Object obj, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        C1849m c1849mB = C1853o.b(C4696b.c(interfaceC4588d));
        try {
            e(new a(c1849mB, obj));
            Object objR = c1849mB.r();
            if (objR == C4696b.e()) {
                h.c(interfaceC4588d);
            }
            return objR == C4696b.e() ? objR : C4153F.f46609a;
        } catch (Throwable th) {
            c1849mB.H();
            throw th;
        }
    }

    private final int x(Object owner) {
        while (!p()) {
            if (owner == null) {
                return 1;
            }
            int iU = u(owner);
            if (iU == 1) {
                return 2;
            }
            if (iU == 2) {
                return 1;
            }
        }
        f42142i.set(this, owner);
        return 0;
    }

    @Override // gc.InterfaceC3460a
    public boolean a(Object owner) {
        int iX = x(owner);
        if (iX == 0) {
            return true;
        }
        if (iX == 1) {
            return false;
        }
        if (iX != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
    }

    @Override // gc.InterfaceC3460a
    public boolean b() {
        return i() == 0;
    }

    @Override // gc.InterfaceC3460a
    public void c(Object owner) {
        while (b()) {
            Object obj = f42142i.get(this);
            if (obj != C3462c.f42154a) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(f42142i, this, obj, C3462c.f42154a)) {
                    o();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // gc.InterfaceC3460a
    public Object d(Object obj, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return v(this, obj, interfaceC4588d);
    }

    public String toString() {
        return "Mutex@" + M.b(this) + "[isLocked=" + b() + ",owner=" + f42142i.get(this) + ']';
    }
}
