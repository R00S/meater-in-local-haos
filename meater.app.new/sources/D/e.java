package D;

import A0.A;
import A0.A0;
import A0.C0832k;
import Ba.p;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import b0.i;
import h0.C3478i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import y0.InterfaceC5116v;

/* compiled from: BringIntoViewResponder.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001&B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"LD/e;", "Lb0/i$c;", "LD/a;", "LA0/A;", "LA0/A0;", "LD/d;", "responder", "<init>", "(LD/d;)V", "Ly0/v;", "coordinates", "Loa/F;", "M", "(Ly0/v;)V", "childCoordinates", "Lkotlin/Function0;", "Lh0/i;", "boundsProvider", "D0", "(Ly0/v;LBa/a;Lta/d;)Ljava/lang/Object;", "O", "LD/d;", "l2", "()LD/d;", "setResponder", "", "P", "Z", "O1", "()Z", "shouldAutoInvalidate", "Q", "hasBeenPlaced", "", "U", "()Ljava/lang/Object;", "traverseKey", "R", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends i.c implements a, A, A0 {

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: S, reason: collision with root package name */
    public static final int f3291S = 8;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private d responder;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean hasBeenPlaced;

    /* compiled from: BringIntoViewResponder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD/e$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: BringIntoViewResponder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "LXb/v0;", "<anonymous>", "(LXb/I;)LXb/v0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends l implements p<I, InterfaceC4588d<? super InterfaceC1867v0>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f3295B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f3296C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC5116v f3298E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a<C3478i> f3299F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Ba.a<C3478i> f3300G;

        /* compiled from: BringIntoViewResponder.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {196}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f3301B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ e f3302C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ InterfaceC5116v f3303D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ Ba.a<C3478i> f3304E;

            /* compiled from: BringIntoViewResponder.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: D.e$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0051a extends C3860q implements Ba.a<C3478i> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ e f3305B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ InterfaceC5116v f3306C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ Ba.a<C3478i> f3307D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0051a(e eVar, InterfaceC5116v interfaceC5116v, Ba.a<C3478i> aVar) {
                    super(0, C3862t.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f3305B = eVar;
                    this.f3306C = interfaceC5116v;
                    this.f3307D = aVar;
                }

                @Override // Ba.a
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final C3478i invoke() {
                    return e.k2(this.f3305B, this.f3306C, this.f3307D);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, InterfaceC5116v interfaceC5116v, Ba.a<C3478i> aVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f3302C = eVar;
                this.f3303D = interfaceC5116v;
                this.f3304E = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f3302C, this.f3303D, this.f3304E, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f3301B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    d responder = this.f3302C.getResponder();
                    C0051a c0051a = new C0051a(this.f3302C, this.f3303D, this.f3304E);
                    this.f3301B = 1;
                    if (responder.W0(c0051a, this) == objE) {
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

        /* compiled from: BringIntoViewResponder.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {207}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: D.e$b$b, reason: collision with other inner class name */
        static final class C0052b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f3308B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ e f3309C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Ba.a<C3478i> f3310D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0052b(e eVar, Ba.a<C3478i> aVar, InterfaceC4588d<? super C0052b> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f3309C = eVar;
                this.f3310D = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0052b(this.f3309C, this.f3310D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0052b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                D.a aVarA;
                Object objE = C4696b.e();
                int i10 = this.f3308B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    if (this.f3309C.getIsAttached() && (aVarA = D.b.a(this.f3309C)) != null) {
                        InterfaceC5116v interfaceC5116vJ = C0832k.j(this.f3309C);
                        Ba.a<C3478i> aVar = this.f3310D;
                        this.f3308B = 1;
                        if (aVarA.D0(interfaceC5116vJ, aVar, this) == objE) {
                            return objE;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5116v interfaceC5116v, Ba.a<C3478i> aVar, Ba.a<C3478i> aVar2, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f3298E = interfaceC5116v;
            this.f3299F = aVar;
            this.f3300G = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = e.this.new b(this.f3298E, this.f3299F, this.f3300G, interfaceC4588d);
            bVar.f3296C = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super InterfaceC1867v0> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f3295B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            I i10 = (I) this.f3296C;
            C1841i.d(i10, null, null, new a(e.this, this.f3298E, this.f3299F, null), 3, null);
            return C1841i.d(i10, null, null, new C0052b(e.this, this.f3300G, null), 3, null);
        }
    }

    /* compiled from: BringIntoViewResponder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh0/i;", "a", "()Lh0/i;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<C3478i> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5116v f3312C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a<C3478i> f3313D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC5116v interfaceC5116v, Ba.a<C3478i> aVar) {
            super(0);
            this.f3312C = interfaceC5116v;
            this.f3313D = aVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3478i invoke() {
            C3478i c3478iK2 = e.k2(e.this, this.f3312C, this.f3313D);
            if (c3478iK2 != null) {
                return e.this.getResponder().f0(c3478iK2);
            }
            return null;
        }
    }

    public e(d dVar) {
        this.responder = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3478i k2(e eVar, InterfaceC5116v interfaceC5116v, Ba.a<C3478i> aVar) {
        C3478i c3478iInvoke;
        if (!eVar.getIsAttached() || !eVar.hasBeenPlaced) {
            return null;
        }
        InterfaceC5116v interfaceC5116vJ = C0832k.j(eVar);
        if (!interfaceC5116v.L()) {
            interfaceC5116v = null;
        }
        if (interfaceC5116v == null || (c3478iInvoke = aVar.invoke()) == null) {
            return null;
        }
        return D.c.c(interfaceC5116vJ, interfaceC5116v, c3478iInvoke);
    }

    @Override // D.a
    public Object D0(InterfaceC5116v interfaceC5116v, Ba.a<C3478i> aVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new b(interfaceC5116v, aVar, new c(interfaceC5116v, aVar), null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    @Override // A0.A
    public void M(InterfaceC5116v coordinates) {
        this.hasBeenPlaced = true;
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // A0.A0
    /* renamed from: U */
    public Object getTraverseKey() {
        return INSTANCE;
    }

    /* renamed from: l2, reason: from getter */
    public final d getResponder() {
        return this.responder;
    }
}
