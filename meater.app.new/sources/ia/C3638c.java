package ia;

import Ba.p;
import Xb.E;
import Xb.I;
import Zb.w;
import ka.C3815c;
import ka.InterfaceC3813a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: ActionReducer.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0 8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0016\u0010!\u0012\u0004\b\"\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lia/c;", "", "Lkotlin/Function0;", "Lia/e;", "defaultPublisher", "LXb/I;", "coroutineScope", "LXb/E;", "defaultDispatcher", "", "defaultCapacity", "", "tag", "<init>", "(LBa/a;LXb/I;LXb/E;ILjava/lang/String;)V", "Lia/a;", "action", "Loa/F;", "g", "(Lia/a;Lta/d;)Ljava/lang/Object;", "f", "(Lia/a;)V", "e", "()V", "a", "LBa/a;", "b", "LXb/I;", "c", "LXb/E;", "d", "Ljava/lang/String;", "LZb/w;", "LZb/w;", "getActor$annotations", "actor", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: ia.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3638c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<InterfaceC3640e> defaultPublisher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final I coroutineScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final E defaultDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w<C3636a> actor;

    /* compiled from: ActionReducer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.uniflow.core.flow.ActionReducer$actor$1", f = "ActionReducer.kt", l = {29, 31}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZb/c;", "Lia/a;", "Loa/F;", "<anonymous>", "(LZb/c;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: ia.c$a */
    static final class a extends l implements p<Zb.c<C3636a>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43179B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f43180C;

        /* compiled from: ActionReducer.kt */
        @kotlin.coroutines.jvm.internal.f(c = "io.uniflow.core.flow.ActionReducer$actor$1$1", f = "ActionReducer.kt", l = {32}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 5, 1})
        /* renamed from: ia.c$a$a, reason: collision with other inner class name */
        static final class C0550a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f43182B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C3638c f43183C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C3636a f43184D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0550a(C3638c c3638c, C3636a c3636a, InterfaceC4588d<? super C0550a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f43183C = c3638c;
                this.f43184D = c3636a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0550a(this.f43183C, this.f43184D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0550a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f43182B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C3638c c3638c = this.f43183C;
                    C3636a c3636a = this.f43184D;
                    this.f43182B = 1;
                    if (c3638c.g(c3636a, this) == objE) {
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

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Zb.c<C3636a> cVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(cVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = C3638c.this.new a(interfaceC4588d);
            aVar.f43180C = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:23:0x009b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:23:0x009b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r9.f43179B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r9.f43180C
                Zb.i r1 = (Zb.i) r1
                oa.C4173r.b(r10)
                goto L9b
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                java.lang.Object r1 = r9.f43180C
                Zb.i r1 = (Zb.i) r1
                oa.C4173r.b(r10)
                goto L44
            L27:
                oa.C4173r.b(r10)
                java.lang.Object r10 = r9.f43180C
                Zb.c r10 = (Zb.c) r10
                Zb.g r10 = r10.t()
                Zb.i r10 = r10.iterator()
            L36:
                r9.f43180C = r10
                r9.f43179B = r3
                java.lang.Object r1 = r10.a(r9)
                if (r1 != r0) goto L41
                return r0
            L41:
                r8 = r1
                r1 = r10
                r10 = r8
            L44:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L9d
                java.lang.Object r10 = r1.next()
                ia.a r10 = (ia.C3636a) r10
                ia.c r4 = ia.C3638c.this
                Xb.I r4 = ia.C3638c.a(r4)
                boolean r4 = Xb.J.f(r4)
                if (r4 == 0) goto L77
                ia.c r4 = ia.C3638c.this
                Xb.E r4 = ia.C3638c.b(r4)
                ia.c$a$a r5 = new ia.c$a$a
                ia.c r6 = ia.C3638c.this
                r7 = 0
                r5.<init>(r6, r10, r7)
                r9.f43180C = r1
                r9.f43179B = r2
                java.lang.Object r10 = Xb.C1837g.g(r4, r5, r9)
                if (r10 != r0) goto L9b
                return r0
            L77:
                ka.c r4 = ka.C3815c.f43834a
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                ia.c r6 = ia.C3638c.this
                java.lang.String r6 = ia.C3638c.c(r6)
                r5.append(r6)
                java.lang.String r6 = " - "
                r5.append(r6)
                r5.append(r10)
                java.lang.String r10 = " cancelled"
                r5.append(r10)
                java.lang.String r10 = r5.toString()
                r4.a(r10)
            L9b:
                r10 = r1
                goto L36
            L9d:
                oa.F r10 = oa.C4153F.f46609a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ia.C3638c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ActionReducer.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.uniflow.core.flow.ActionReducer", f = "ActionReducer.kt", l = {53, 57, 62}, m = "reduceAction")
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: ia.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f43185B;

        /* renamed from: C, reason: collision with root package name */
        Object f43186C;

        /* renamed from: D, reason: collision with root package name */
        Object f43187D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f43188E;

        /* renamed from: G, reason: collision with root package name */
        int f43190G;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43188E = obj;
            this.f43190G |= Integer.MIN_VALUE;
            return C3638c.this.g(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3638c(Ba.a<? extends InterfaceC3640e> defaultPublisher, I coroutineScope, E defaultDispatcher, int i10, String tag) {
        C3862t.g(defaultPublisher, "defaultPublisher");
        C3862t.g(coroutineScope, "coroutineScope");
        C3862t.g(defaultDispatcher, "defaultDispatcher");
        C3862t.g(tag, "tag");
        this.defaultPublisher = defaultPublisher;
        this.coroutineScope = coroutineScope;
        this.defaultDispatcher = defaultDispatcher;
        this.tag = tag;
        this.actor = Zb.b.b(coroutineScope, defaultDispatcher, i10, null, null, new a(null), 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [ja.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ia.c] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(ia.C3636a r9, ta.InterfaceC4588d<? super oa.C4153F> r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C3638c.g(ia.a, ta.d):java.lang.Object");
    }

    public final void e() {
        w.a.a(this.actor, null, 1, null);
    }

    public void f(C3636a action) {
        C3862t.g(action, "action");
        if (!this.actor.A() ? this.actor.h(action) : false) {
            return;
        }
        InterfaceC3813a.C0572a.a(C3815c.f43834a, this.tag + " - " + action + " couldn't be enqueued", null, 2, null);
    }
}
