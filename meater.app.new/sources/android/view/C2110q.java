package android.view;

import Ba.p;
import Xb.A0;
import Xb.C1841i;
import Xb.I;
import Xb.Z;
import android.view.AbstractC2106m;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/q;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/m;", "lifecycle", "Lta/g;", "coroutineContext", "<init>", "(Landroidx/lifecycle/m;Lta/g;)V", "Loa/F;", "c", "()V", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "B", "Landroidx/lifecycle/m;", "a", "()Landroidx/lifecycle/m;", "C", "Lta/g;", "getCoroutineContext", "()Lta/g;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2110q extends AbstractC2109p implements InterfaceC2111s {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final AbstractC2106m lifecycle;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final g coroutineContext;

    /* compiled from: Lifecycle.kt */
    @f(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.q$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f25984B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f25985C;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = C2110q.this.new a(interfaceC4588d);
            aVar.f25985C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f25984B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            I i10 = (I) this.f25985C;
            if (C2110q.this.getLifecycle().getState().compareTo(AbstractC2106m.b.INITIALIZED) >= 0) {
                C2110q.this.getLifecycle().a(C2110q.this);
            } else {
                A0.f(i10.getCoroutineContext(), null, 1, null);
            }
            return C4153F.f46609a;
        }
    }

    public C2110q(AbstractC2106m lifecycle, g coroutineContext) {
        C3862t.g(lifecycle, "lifecycle");
        C3862t.g(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle().getState() == AbstractC2106m.b.DESTROYED) {
            A0.f(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // android.view.AbstractC2109p
    /* renamed from: a, reason: from getter */
    public AbstractC2106m getLifecycle() {
        return this.lifecycle;
    }

    public final void c() {
        C1841i.d(this, Z.c().M0(), null, new a(null), 2, null);
    }

    @Override // android.view.InterfaceC2111s
    public void f(InterfaceC2114v source, AbstractC2106m.a event) {
        C3862t.g(source, "source");
        C3862t.g(event, "event");
        if (getLifecycle().getState().compareTo(AbstractC2106m.b.DESTROYED) <= 0) {
            getLifecycle().d(this);
            A0.f(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // Xb.I
    public g getCoroutineContext() {
        return this.coroutineContext;
    }
}
