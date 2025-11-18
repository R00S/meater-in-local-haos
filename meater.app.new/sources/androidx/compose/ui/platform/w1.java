package androidx.compose.ui.platform;

import a0.C1882d;
import a0.InterfaceC1879a;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import android.view.View;
import androidx.compose.ui.platform.C2036q;
import java.util.Set;
import kotlin.C1503H0;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1562p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/w1;", "LO/p;", "Landroidx/lifecycle/s;", "", "Landroidx/compose/ui/platform/q;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/q;LO/p;)V", "Lkotlin/Function0;", "Loa/F;", "content", "k", "(LBa/p;)V", "c", "()V", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "B", "Landroidx/compose/ui/platform/q;", "E", "()Landroidx/compose/ui/platform/q;", "C", "LO/p;", "D", "()LO/p;", "", "Z", "disposed", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/m;", "addedToLifecycle", "F", "LBa/p;", "lastContent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class w1 implements InterfaceC1562p, InterfaceC2111s {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C2036q owner;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1562p original;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private AbstractC2106m addedToLifecycle;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> lastContent = C2011d0.f23062a.a();

    /* compiled from: Wrapper.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/q$b;", "it", "Loa/F;", "a", "(Landroidx/compose/ui/platform/q$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<C2036q.b, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f23474C;

        /* compiled from: Wrapper.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.w1$a$a, reason: collision with other inner class name */
        static final class C0332a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ w1 f23475B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f23476C;

            /* compiled from: Wrapper.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", l = {148}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.w1$a$a$a, reason: collision with other inner class name */
            static final class C0333a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f23477B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ w1 f23478C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0333a(w1 w1Var, InterfaceC4588d<? super C0333a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f23478C = w1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0333a(this.f23478C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0333a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f23477B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C2036q owner = this.f23478C.getOwner();
                        this.f23477B = 1;
                        if (owner.c0(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    return C4153F.f46609a;
                }
            }

            /* compiled from: Wrapper.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", l = {151}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.w1$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f23479B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ w1 f23480C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(w1 w1Var, InterfaceC4588d<? super b> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f23480C = w1Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new b(this.f23480C, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f23479B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C2036q owner = this.f23480C.getOwner();
                        this.f23479B = 1;
                        if (owner.d0(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    return C4153F.f46609a;
                }
            }

            /* compiled from: Wrapper.android.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.w1$a$a$c */
            static final class c extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ w1 f23481B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f23482C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(w1 w1Var, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
                    super(2);
                    this.f23481B = w1Var;
                    this.f23482C = pVar;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)");
                    }
                    M.a(this.f23481B.getOwner(), this.f23482C, interfaceC1554l, 0);
                    if (C1560o.J()) {
                        C1560o.R();
                    }
                }

                @Override // Ba.p
                public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                    a(interfaceC1554l, num.intValue());
                    return C4153F.f46609a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0332a(w1 w1Var, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
                super(2);
                this.f23475B = w1Var;
                this.f23476C = pVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)");
                }
                C2036q owner = this.f23475B.getOwner();
                int i11 = b0.l.f29945K;
                Object tag = owner.getTag(i11);
                Set<InterfaceC1879a> set = kotlin.jvm.internal.W.p(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f23475B.getOwner().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(i11) : null;
                    set = kotlin.jvm.internal.W.p(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC1554l.j());
                    interfaceC1554l.a();
                }
                C2036q owner2 = this.f23475B.getOwner();
                boolean zL = interfaceC1554l.l(this.f23475B);
                w1 w1Var = this.f23475B;
                Object objF = interfaceC1554l.f();
                if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                    objF = new C0333a(w1Var, null);
                    interfaceC1554l.J(objF);
                }
                C1516O.e(owner2, (Ba.p) objF, interfaceC1554l, 0);
                C2036q owner3 = this.f23475B.getOwner();
                boolean zL2 = interfaceC1554l.l(this.f23475B);
                w1 w1Var2 = this.f23475B;
                Object objF2 = interfaceC1554l.f();
                if (zL2 || objF2 == InterfaceC1554l.INSTANCE.a()) {
                    objF2 = new b(w1Var2, null);
                    interfaceC1554l.J(objF2);
                }
                C1516O.e(owner3, (Ba.p) objF2, interfaceC1554l, 0);
                C1576w.a(C1882d.a().d(set), W.c.d(-1193460702, true, new c(this.f23475B, this.f23476C), interfaceC1554l, 54), interfaceC1554l, C1503H0.f12626i | 48);
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
                a(interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
            super(1);
            this.f23474C = pVar;
        }

        public final void a(C2036q.b bVar) {
            if (w1.this.disposed) {
                return;
            }
            AbstractC2106m lifecycle = bVar.getLifecycleOwner().getLifecycle();
            w1.this.lastContent = this.f23474C;
            if (w1.this.addedToLifecycle == null) {
                w1.this.addedToLifecycle = lifecycle;
                lifecycle.a(w1.this);
            } else if (lifecycle.getState().j(AbstractC2106m.b.CREATED)) {
                w1.this.getOriginal().k(W.c.b(-2000640158, true, new C0332a(w1.this, this.f23474C)));
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2036q.b bVar) {
            a(bVar);
            return C4153F.f46609a;
        }
    }

    public w1(C2036q c2036q, InterfaceC1562p interfaceC1562p) {
        this.owner = c2036q;
        this.original = interfaceC1562p;
    }

    /* renamed from: D, reason: from getter */
    public final InterfaceC1562p getOriginal() {
        return this.original;
    }

    /* renamed from: E, reason: from getter */
    public final C2036q getOwner() {
        return this.owner;
    }

    @Override // kotlin.InterfaceC1562p
    public void c() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(b0.l.f29946L, null);
            AbstractC2106m abstractC2106m = this.addedToLifecycle;
            if (abstractC2106m != null) {
                abstractC2106m.d(this);
            }
        }
        this.original.c();
    }

    @Override // android.view.InterfaceC2111s
    public void f(InterfaceC2114v source, AbstractC2106m.a event) {
        if (event == AbstractC2106m.a.ON_DESTROY) {
            c();
        } else {
            if (event != AbstractC2106m.a.ON_CREATE || this.disposed) {
                return;
            }
            k(this.lastContent);
        }
    }

    @Override // kotlin.InterfaceC1562p
    public void k(Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> content) {
        this.owner.setOnViewTreeOwnersAvailable(new a(content));
    }
}
