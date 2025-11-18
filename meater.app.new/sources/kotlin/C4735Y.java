package kotlin;

import Ba.p;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import androidx.compose.animation.core.MutationInterruptedException;
import gc.C3462c;
import gc.InterfaceC3460a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: InternalMutatorMutex.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lv/Y;", "", "<init>", "()V", "Lv/Y$a;", "mutator", "Loa/F;", "f", "(Lv/Y$a;)V", "R", "Lv/W;", "priority", "Lkotlin/Function1;", "Lta/d;", "block", "d", "(Lv/W;LBa/l;Lta/d;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lgc/a;", "b", "Lgc/a;", "mutex", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4735Y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3460a mutex = C3462c.b(false, 1, null);

    /* compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv/Y$a;", "", "Lv/W;", "priority", "LXb/v0;", "job", "<init>", "(Lv/W;LXb/v0;)V", "other", "", "a", "(Lv/Y$a;)Z", "Loa/F;", "b", "()V", "Lv/W;", "getPriority", "()Lv/W;", "LXb/v0;", "getJob", "()LXb/v0;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v.Y$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final EnumC4733W priority;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1867v0 job;

        public a(EnumC4733W enumC4733W, InterfaceC1867v0 interfaceC1867v0) {
            this.priority = enumC4733W;
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
    /* compiled from: InternalMutatorMutex.kt */
    @f(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {178, 126}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "LXb/I;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v.Y$b */
    static final class b<R> extends l implements p<I, InterfaceC4588d<? super R>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f50665B;

        /* renamed from: C, reason: collision with root package name */
        Object f50666C;

        /* renamed from: D, reason: collision with root package name */
        Object f50667D;

        /* renamed from: E, reason: collision with root package name */
        int f50668E;

        /* renamed from: F, reason: collision with root package name */
        private /* synthetic */ Object f50669F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ EnumC4733W f50670G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ C4735Y f50671H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ Ba.l<InterfaceC4588d<? super R>, Object> f50672I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(EnumC4733W enumC4733W, C4735Y c4735y, Ba.l<? super InterfaceC4588d<? super R>, ? extends Object> lVar, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f50670G = enumC4733W;
            this.f50671H = c4735y;
            this.f50672I = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f50670G, this.f50671H, this.f50672I, interfaceC4588d);
            bVar.f50669F = obj;
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
            C4735Y c4735y;
            a aVar2;
            Throwable th;
            C4735Y c4735y2;
            InterfaceC3460a interfaceC3460a2;
            Object objE = C4696b.e();
            ?? r12 = this.f50668E;
            try {
                try {
                    if (r12 == 0) {
                        C4173r.b(obj);
                        I i10 = (I) this.f50669F;
                        EnumC4733W enumC4733W = this.f50670G;
                        g.b bVarB = i10.getCoroutineContext().b(InterfaceC1867v0.INSTANCE);
                        C3862t.d(bVarB);
                        a aVar3 = new a(enumC4733W, (InterfaceC1867v0) bVarB);
                        this.f50671H.f(aVar3);
                        interfaceC3460a = this.f50671H.mutex;
                        Ba.l<InterfaceC4588d<? super R>, Object> lVar2 = this.f50672I;
                        C4735Y c4735y3 = this.f50671H;
                        this.f50669F = aVar3;
                        this.f50665B = interfaceC3460a;
                        this.f50666C = lVar2;
                        this.f50667D = c4735y3;
                        this.f50668E = 1;
                        if (interfaceC3460a.d(null, this) == objE) {
                            return objE;
                        }
                        lVar = lVar2;
                        aVar = aVar3;
                        c4735y = c4735y3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c4735y2 = (C4735Y) this.f50666C;
                            interfaceC3460a2 = (InterfaceC3460a) this.f50665B;
                            aVar2 = (a) this.f50669F;
                            try {
                                C4173r.b(obj);
                                C4734X.a(c4735y2.currentMutator, aVar2, null);
                                interfaceC3460a2.c(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                C4734X.a(c4735y2.currentMutator, aVar2, null);
                                throw th;
                            }
                        }
                        c4735y = (C4735Y) this.f50667D;
                        lVar = (Ba.l) this.f50666C;
                        InterfaceC3460a interfaceC3460a3 = (InterfaceC3460a) this.f50665B;
                        aVar = (a) this.f50669F;
                        C4173r.b(obj);
                        interfaceC3460a = interfaceC3460a3;
                    }
                    this.f50669F = aVar;
                    this.f50665B = interfaceC3460a;
                    this.f50666C = c4735y;
                    this.f50667D = null;
                    this.f50668E = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    c4735y2 = c4735y;
                    interfaceC3460a2 = interfaceC3460a;
                    obj = objInvoke;
                    aVar2 = aVar;
                    C4734X.a(c4735y2.currentMutator, aVar2, null);
                    interfaceC3460a2.c(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar2 = aVar;
                    th = th3;
                    c4735y2 = c4735y;
                    C4734X.a(c4735y2.currentMutator, aVar2, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.c(null);
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object e(C4735Y c4735y, EnumC4733W enumC4733W, Ba.l lVar, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC4733W = EnumC4733W.Default;
        }
        return c4735y.d(enumC4733W, lVar, interfaceC4588d);
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

    public final <R> Object d(EnumC4733W enumC4733W, Ba.l<? super InterfaceC4588d<? super R>, ? extends Object> lVar, InterfaceC4588d<? super R> interfaceC4588d) {
        return J.d(new b(enumC4733W, this, lVar, null), interfaceC4588d);
    }
}
