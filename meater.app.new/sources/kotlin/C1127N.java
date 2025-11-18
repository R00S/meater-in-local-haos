package kotlin;

import Ba.p;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import com.apptionlabs.meater_app.data.Temperature;
import gc.C3462c;
import gc.InterfaceC3460a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C4734X;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;
import w.EnumC4950C;

/* compiled from: InternalMutatorMutex.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0015j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LI/N;", "", "<init>", "()V", "LI/N$a;", "mutator", "Loa/F;", "f", "(LI/N$a;)V", "R", "Lw/C;", "priority", "Lkotlin/Function1;", "Lta/d;", "block", "d", "(Lw/C;LBa/l;Lta/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "e", "(LBa/a;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/material/InternalAtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lgc/a;", "b", "Lgc/a;", "mutex", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3460a mutex = C3462c.b(false, 1, null);

    /* compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LI/N$a;", "", "Lw/C;", "priority", "LXb/v0;", "job", "<init>", "(Lw/C;LXb/v0;)V", "other", "", "a", "(LI/N$a;)Z", "Loa/F;", "b", "()V", "Lw/C;", "getPriority", "()Lw/C;", "LXb/v0;", "getJob", "()LXb/v0;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.N$a */
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
            InterfaceC1867v0.a.a(this.job, null, 1, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: InternalMutatorMutex.kt */
    @f(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {177, Temperature.MAX_INTERNAL_PROBE}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "LXb/I;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.N$b */
    static final class b<R> extends l implements p<I, InterfaceC4588d<? super R>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f5907B;

        /* renamed from: C, reason: collision with root package name */
        Object f5908C;

        /* renamed from: D, reason: collision with root package name */
        Object f5909D;

        /* renamed from: E, reason: collision with root package name */
        int f5910E;

        /* renamed from: F, reason: collision with root package name */
        private /* synthetic */ Object f5911F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ EnumC4950C f5912G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C1127N f5913H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ Ba.l<InterfaceC4588d<? super R>, Object> f5914I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC4950C enumC4950C, C1127N c1127n, Ba.l<? super InterfaceC4588d<? super R>, ? extends Object> lVar, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f5912G = enumC4950C;
            this.f5913H = c1127n;
            this.f5914I = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f5912G, this.f5913H, this.f5914I, interfaceC4588d);
            bVar.f5911F = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super R> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [gc.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3460a interfaceC3460a;
            Ba.l<InterfaceC4588d<? super R>, Object> lVar;
            a aVar;
            C1127N c1127n;
            a aVar2;
            Throwable th;
            C1127N c1127n2;
            InterfaceC3460a interfaceC3460a2;
            Object objE = C4696b.e();
            ?? r12 = this.f5910E;
            try {
                try {
                    if (r12 == 0) {
                        C4173r.b(obj);
                        I i10 = (I) this.f5911F;
                        EnumC4950C enumC4950C = this.f5912G;
                        g.b bVarB = i10.getCoroutineContext().b(InterfaceC1867v0.INSTANCE);
                        C3862t.d(bVarB);
                        a aVar3 = new a(enumC4950C, (InterfaceC1867v0) bVarB);
                        this.f5913H.f(aVar3);
                        interfaceC3460a = this.f5913H.mutex;
                        Ba.l<InterfaceC4588d<? super R>, Object> lVar2 = this.f5914I;
                        C1127N c1127n3 = this.f5913H;
                        this.f5911F = aVar3;
                        this.f5907B = interfaceC3460a;
                        this.f5908C = lVar2;
                        this.f5909D = c1127n3;
                        this.f5910E = 1;
                        if (interfaceC3460a.d(null, this) == objE) {
                            return objE;
                        }
                        lVar = lVar2;
                        aVar = aVar3;
                        c1127n = c1127n3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1127n2 = (C1127N) this.f5908C;
                            interfaceC3460a2 = (InterfaceC3460a) this.f5907B;
                            aVar2 = (a) this.f5911F;
                            try {
                                C4173r.b(obj);
                                C4734X.a(c1127n2.currentMutator, aVar2, null);
                                interfaceC3460a2.c(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                C4734X.a(c1127n2.currentMutator, aVar2, null);
                                throw th;
                            }
                        }
                        c1127n = (C1127N) this.f5909D;
                        lVar = (Ba.l) this.f5908C;
                        InterfaceC3460a interfaceC3460a3 = (InterfaceC3460a) this.f5907B;
                        aVar = (a) this.f5911F;
                        C4173r.b(obj);
                        interfaceC3460a = interfaceC3460a3;
                    }
                    this.f5911F = aVar;
                    this.f5907B = interfaceC3460a;
                    this.f5908C = c1127n;
                    this.f5909D = null;
                    this.f5910E = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    c1127n2 = c1127n;
                    interfaceC3460a2 = interfaceC3460a;
                    obj = objInvoke;
                    aVar2 = aVar;
                    C4734X.a(c1127n2.currentMutator, aVar2, null);
                    interfaceC3460a2.c(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar2 = aVar;
                    th = th3;
                    c1127n2 = c1127n;
                    C4734X.a(c1127n2.currentMutator, aVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.c(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a mutator) {
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

    public final <R> Object d(EnumC4950C enumC4950C, Ba.l<? super InterfaceC4588d<? super R>, ? extends Object> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        return J.d(new b(enumC4950C, this, lVar, null), interfaceC4588d);
    }

    public final boolean e(Ba.a<C4153F> block) {
        boolean zB = InterfaceC3460a.C0535a.b(this.mutex, null, 1, null);
        if (zB) {
            try {
                block.invoke();
            } finally {
                InterfaceC3460a.C0535a.c(this.mutex, null, 1, null);
            }
        }
        return zB;
    }
}
