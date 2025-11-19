package w;

import Xb.InterfaceC1867v0;
import androidx.compose.foundation.MutationInterruptedException;
import gc.C3462c;
import gc.InterfaceC3460a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C4734X;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: MutatorMutex.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0017\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lw/D;", "", "<init>", "()V", "Lw/D$a;", "mutator", "Loa/F;", "e", "(Lw/D$a;)V", "T", "R", "receiver", "Lw/C;", "priority", "Lkotlin/Function2;", "Lta/d;", "block", "d", "(Ljava/lang/Object;Lw/C;LBa/p;Lta/d;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/foundation/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lgc/a;", "b", "Lgc/a;", "mutex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: w.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4951D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3460a mutex = C3462c.b(false, 1, null);

    /* compiled from: MutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw/D$a;", "", "Lw/C;", "priority", "LXb/v0;", "job", "<init>", "(Lw/C;LXb/v0;)V", "other", "", "a", "(Lw/D$a;)Z", "Loa/F;", "b", "()V", "Lw/C;", "getPriority", "()Lw/C;", "LXb/v0;", "getJob", "()LXb/v0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w.D$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC4950C priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1867v0 job;

        public a(EnumC4950C enumC4950C, InterfaceC1867v0 interfaceC1867v0) {
            this.priority = enumC4950C;
            this.job = interfaceC1867v0;
        }

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.e(new MutationInterruptedException());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: MutatorMutex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {214, 167}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "LXb/I;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: w.D$b */
    static final class b<R> extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super R>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f51662B;

        /* renamed from: C, reason: collision with root package name */
        Object f51663C;

        /* renamed from: D, reason: collision with root package name */
        Object f51664D;

        /* renamed from: E, reason: collision with root package name */
        Object f51665E;

        /* renamed from: F, reason: collision with root package name */
        int f51666F;

        /* renamed from: G, reason: collision with root package name */
        private /* synthetic */ Object f51667G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ EnumC4950C f51668H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ C4951D f51669I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ Ba.p<T, InterfaceC4588d<? super R>, Object> f51670J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ T f51671K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC4950C enumC4950C, C4951D c4951d, Ba.p<? super T, ? super InterfaceC4588d<? super R>, ? extends Object> pVar, T t10, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f51668H = enumC4950C;
            this.f51669I = c4951d;
            this.f51670J = pVar;
            this.f51671K = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f51668H, this.f51669I, this.f51670J, this.f51671K, interfaceC4588d);
            bVar.f51667G = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super R> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [gc.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3460a interfaceC3460a;
            Ba.p pVar;
            Object obj2;
            a aVar;
            C4951D c4951d;
            a aVar2;
            Throwable th;
            C4951D c4951d2;
            InterfaceC3460a interfaceC3460a2;
            Object objE = C4696b.e();
            ?? r12 = this.f51666F;
            try {
                try {
                    if (r12 == 0) {
                        C4173r.b(obj);
                        Xb.I i10 = (Xb.I) this.f51667G;
                        EnumC4950C enumC4950C = this.f51668H;
                        g.b bVarB = i10.getCoroutineContext().b(InterfaceC1867v0.INSTANCE);
                        C3862t.d(bVarB);
                        a aVar3 = new a(enumC4950C, (InterfaceC1867v0) bVarB);
                        this.f51669I.e(aVar3);
                        interfaceC3460a = this.f51669I.mutex;
                        pVar = this.f51670J;
                        Object obj3 = this.f51671K;
                        C4951D c4951d3 = this.f51669I;
                        this.f51667G = aVar3;
                        this.f51662B = interfaceC3460a;
                        this.f51663C = pVar;
                        this.f51664D = obj3;
                        this.f51665E = c4951d3;
                        this.f51666F = 1;
                        if (interfaceC3460a.d(null, this) == objE) {
                            return objE;
                        }
                        obj2 = obj3;
                        aVar = aVar3;
                        c4951d = c4951d3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c4951d2 = (C4951D) this.f51663C;
                            interfaceC3460a2 = (InterfaceC3460a) this.f51662B;
                            aVar2 = (a) this.f51667G;
                            try {
                                C4173r.b(obj);
                                C4734X.a(c4951d2.currentMutator, aVar2, null);
                                interfaceC3460a2.c(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                C4734X.a(c4951d2.currentMutator, aVar2, null);
                                throw th;
                            }
                        }
                        c4951d = (C4951D) this.f51665E;
                        obj2 = this.f51664D;
                        pVar = (Ba.p) this.f51663C;
                        InterfaceC3460a interfaceC3460a3 = (InterfaceC3460a) this.f51662B;
                        aVar = (a) this.f51667G;
                        C4173r.b(obj);
                        interfaceC3460a = interfaceC3460a3;
                    }
                    this.f51667G = aVar;
                    this.f51662B = interfaceC3460a;
                    this.f51663C = c4951d;
                    this.f51664D = null;
                    this.f51665E = null;
                    this.f51666F = 2;
                    Object objInvoke = pVar.invoke(obj2, this);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    c4951d2 = c4951d;
                    interfaceC3460a2 = interfaceC3460a;
                    obj = objInvoke;
                    aVar2 = aVar;
                    C4734X.a(c4951d2.currentMutator, aVar2, null);
                    interfaceC3460a2.c(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar2 = aVar;
                    th = th3;
                    c4951d2 = c4951d;
                    C4734X.a(c4951d2.currentMutator, aVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.c(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!C4734X.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    public final <T, R> Object d(T t10, EnumC4950C enumC4950C, Ba.p<? super T, ? super InterfaceC4588d<? super R>, ? extends Object> pVar, InterfaceC4588d<? super R> interfaceC4588d) {
        return Xb.J.d(new b(enumC4950C, this, pVar, t10, null), interfaceC4588d);
    }
}
