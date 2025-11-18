package H;

import Ba.p;
import androidx.compose.ui.platform.i1;
import com.apptionlabs.meater_app.data.Temperature;
import h0.C3476g;
import java.util.List;
import kotlin.C5030j;
import kotlin.C5035o;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.C4627M;
import u0.C4631Q;
import u0.C4649o;
import u0.C4650p;
import u0.InterfaceC4622H;
import u0.InterfaceC4637c;
import u0.PointerInputChange;
import ua.C4696b;

/* compiled from: SelectionGestures.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\r\u001a,\u0010\u0010\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\t*\u00020\u0007H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u001e\u001a\u00020\u0019*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lb0/i;", "LH/b;", "mouseSelectionObserver", "LF/j;", "textDragObserver", "i", "(Lb0/i;LH/b;LF/j;)Lb0/i;", "Lu0/c;", "observer", "Lu0/o;", "down", "Loa/F;", "j", "(Lu0/c;LF/j;Lu0/o;Lta/d;)Ljava/lang/Object;", "LH/a;", "clicksCounter", "h", "(Lu0/c;LH/b;LH/a;Lu0/o;Lta/d;)Ljava/lang/Object;", "e", "(Lu0/c;Lta/d;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/i1;", "viewConfiguration", "Lu0/z;", "change1", "change2", "", "f", "(Landroidx/compose/ui/platform/i1;Lu0/z;Lu0/z;)Z", "g", "(Lu0/o;)Z", "isPrecisePointer", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {425}, m = "awaitDown")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f5195B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f5196C;

        /* renamed from: D, reason: collision with root package name */
        int f5197D;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5196C = obj;
            this.f5197D |= Integer.MIN_VALUE;
            return h.e(null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {158, 181}, m = "mouseSelection")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f5198B;

        /* renamed from: C, reason: collision with root package name */
        Object f5199C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f5200D;

        /* renamed from: E, reason: collision with root package name */
        int f5201E;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5200D = obj;
            this.f5201E |= Integer.MIN_VALUE;
            return h.h(null, null, null, null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/z;", "it", "Loa/F;", "a", "(Lu0/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<PointerInputChange, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ H.b f5202B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(H.b bVar) {
            super(1);
            this.f5202B = bVar;
        }

        public final void a(PointerInputChange pointerInputChange) {
            if (this.f5202B.b(pointerInputChange.getPosition())) {
                pointerInputChange.a();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/z;", "it", "Loa/F;", "a", "(Lu0/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<PointerInputChange, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ H.b f5203B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ H.g f5204C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H.b bVar, H.g gVar) {
            super(1);
            this.f5203B = bVar;
            this.f5204C = gVar;
        }

        public final void a(PointerInputChange pointerInputChange) {
            if (this.f5203B.d(pointerInputChange.getPosition(), this.f5204C)) {
                pointerInputChange.a();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1", f = "SelectionGestures.kt", l = {104}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/H;", "Loa/F;", "<anonymous>", "(Lu0/H;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f5205B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f5206C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ H.b f5207D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ F.j f5208E;

        /* compiled from: SelectionGestures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {Temperature.MAX_INTERNAL_SECOND_GEN_PROBE, 111, 113}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.k implements p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: C, reason: collision with root package name */
            int f5209C;

            /* renamed from: D, reason: collision with root package name */
            private /* synthetic */ Object f5210D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ H.b f5211E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ H.a f5212F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ F.j f5213G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(H.b bVar, H.a aVar, F.j jVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f5211E = bVar;
                this.f5212F = aVar;
                this.f5213G = jVar;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f5211E, this.f5212F, this.f5213G, interfaceC4588d);
                aVar.f5210D = obj;
                return aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r9.f5209C
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r4) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    oa.C4173r.b(r10)
                    goto L89
                L1e:
                    java.lang.Object r1 = r9.f5210D
                    u0.c r1 = (u0.InterfaceC4637c) r1
                    oa.C4173r.b(r10)
                    goto L39
                L26:
                    oa.C4173r.b(r10)
                    java.lang.Object r10 = r9.f5210D
                    r1 = r10
                    u0.c r1 = (u0.InterfaceC4637c) r1
                    r9.f5210D = r1
                    r9.f5209C = r4
                    java.lang.Object r10 = H.h.a(r1, r9)
                    if (r10 != r0) goto L39
                    return r0
                L39:
                    u0.o r10 = (u0.C4649o) r10
                    boolean r4 = H.h.g(r10)
                    r5 = 0
                    if (r4 == 0) goto L76
                    int r4 = r10.getButtons()
                    boolean r4 = u0.C4653s.b(r4)
                    if (r4 == 0) goto L76
                    java.util.List r4 = r10.c()
                    int r6 = r4.size()
                    r7 = 0
                L55:
                    if (r7 >= r6) goto L67
                    java.lang.Object r8 = r4.get(r7)
                    u0.z r8 = (u0.PointerInputChange) r8
                    boolean r8 = r8.p()
                    if (r8 == 0) goto L64
                    goto L76
                L64:
                    int r7 = r7 + 1
                    goto L55
                L67:
                    H.b r2 = r9.f5211E
                    H.a r4 = r9.f5212F
                    r9.f5210D = r5
                    r9.f5209C = r3
                    java.lang.Object r10 = H.h.c(r1, r2, r4, r10, r9)
                    if (r10 != r0) goto L89
                    return r0
                L76:
                    boolean r3 = H.h.g(r10)
                    if (r3 != 0) goto L89
                    F.j r3 = r9.f5213G
                    r9.f5210D = r5
                    r9.f5209C = r2
                    java.lang.Object r10 = H.h.d(r1, r3, r10, r9)
                    if (r10 != r0) goto L89
                    return r0
                L89:
                    oa.F r10 = oa.C4153F.f46609a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: H.h.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(H.b bVar, F.j jVar, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f5207D = bVar;
            this.f5208E = jVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(interfaceC4622H, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            e eVar = new e(this.f5207D, this.f5208E, interfaceC4588d);
            eVar.f5206C = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f5205B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC4622H interfaceC4622H = (InterfaceC4622H) this.f5206C;
                a aVar = new a(this.f5207D, new H.a(interfaceC4622H.getViewConfiguration()), this.f5208E, null);
                this.f5205B = 1;
                if (C5035o.c(interfaceC4622H, aVar, this) == objE) {
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

    /* compiled from: SelectionGestures.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {124, 128}, m = "touchSelection")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f5214B;

        /* renamed from: C, reason: collision with root package name */
        Object f5215C;

        /* renamed from: D, reason: collision with root package name */
        Object f5216D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f5217E;

        /* renamed from: F, reason: collision with root package name */
        int f5218F;

        f(InterfaceC4588d<? super f> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5217E = obj;
            this.f5218F |= Integer.MIN_VALUE;
            return h.j(null, null, null, this);
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/z;", "it", "Loa/F;", "a", "(Lu0/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.l<PointerInputChange, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ F.j f5219B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(F.j jVar) {
            super(1);
            this.f5219B = jVar;
        }

        public final void a(PointerInputChange pointerInputChange) {
            this.f5219B.c(C4650p.g(pointerInputChange));
            pointerInputChange.a();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(PointerInputChange pointerInputChange) {
            a(pointerInputChange);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(u0.InterfaceC4637c r7, ta.InterfaceC4588d<? super u0.C4649o> r8) {
        /*
            boolean r0 = r8 instanceof H.h.a
            if (r0 == 0) goto L13
            r0 = r8
            H.h$a r0 = (H.h.a) r0
            int r1 = r0.f5197D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5197D = r1
            goto L18
        L13:
            H.h$a r0 = new H.h$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5196C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f5197D
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f5195B
            u0.c r7 = (u0.InterfaceC4637c) r7
            oa.C4173r.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            oa.C4173r.b(r8)
        L38:
            u0.q r8 = u0.EnumC4651q.Main
            r0.f5195B = r7
            r0.f5197D = r3
            java.lang.Object r8 = r7.l0(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            u0.o r8 = (u0.C4649o) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            u0.z r6 = (u0.PointerInputChange) r6
            boolean r6 = u0.C4650p.b(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H.h.e(u0.c, ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(i1 i1Var, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2) {
        return C3476g.k(C3476g.q(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < C5030j.k(i1Var, pointerInputChange.getType());
    }

    public static final boolean g(C4649o c4649o) {
        List<PointerInputChange> listC = c4649o.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!C4627M.g(listC.get(i10).getType(), C4627M.INSTANCE.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(u0.InterfaceC4637c r7, H.b r8, H.a r9, u0.C4649o r10, ta.InterfaceC4588d<? super oa.C4153F> r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H.h.h(u0.c, H.b, H.a, u0.o, ta.d):java.lang.Object");
    }

    public static final b0.i i(b0.i iVar, H.b bVar, F.j jVar) {
        return C4631Q.d(iVar, bVar, jVar, new e(bVar, jVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(u0.InterfaceC4637c r8, F.j r9, u0.C4649o r10, ta.InterfaceC4588d<? super oa.C4153F> r11) {
        /*
            boolean r0 = r11 instanceof H.h.f
            if (r0 == 0) goto L13
            r0 = r11
            H.h$f r0 = (H.h.f) r0
            int r1 = r0.f5218F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5218F = r1
            goto L18
        L13:
            H.h$f r0 = new H.h$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f5217E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f5218F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.f5215C
            r9 = r8
            F.j r9 = (F.j) r9
            java.lang.Object r8 = r0.f5214B
            u0.c r8 = (u0.InterfaceC4637c) r8
            oa.C4173r.b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            goto La1
        L35:
            r8 = move-exception
            goto Ld4
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.f5216D
            u0.z r8 = (u0.PointerInputChange) r8
            java.lang.Object r9 = r0.f5215C
            F.j r9 = (F.j) r9
            java.lang.Object r10 = r0.f5214B
            u0.c r10 = (u0.InterfaceC4637c) r10
            oa.C4173r.b(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            r7 = r10
            r10 = r8
            r8 = r7
            goto L73
        L53:
            oa.C4173r.b(r11)
            java.util.List r10 = r10.c()     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r10 = kotlin.collections.r.j0(r10)     // Catch: java.util.concurrent.CancellationException -> L35
            u0.z r10 = (u0.PointerInputChange) r10     // Catch: java.util.concurrent.CancellationException -> L35
            long r5 = r10.getId()     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f5214B = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f5215C = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f5216D = r10     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f5218F = r4     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = kotlin.C5030j.d(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto L73
            return r1
        L73:
            u0.z r11 = (u0.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 == 0) goto Ld1
            androidx.compose.ui.platform.i1 r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = f(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Ld1
            long r4 = r11.getPosition()     // Catch: java.util.concurrent.CancellationException -> L35
            r9.b(r4)     // Catch: java.util.concurrent.CancellationException -> L35
            long r10 = r11.getId()     // Catch: java.util.concurrent.CancellationException -> L35
            H.h$g r2 = new H.h$g     // Catch: java.util.concurrent.CancellationException -> L35
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f5214B = r8     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f5215C = r9     // Catch: java.util.concurrent.CancellationException -> L35
            r4 = 0
            r0.f5216D = r4     // Catch: java.util.concurrent.CancellationException -> L35
            r0.f5218F = r3     // Catch: java.util.concurrent.CancellationException -> L35
            java.lang.Object r11 = kotlin.C5030j.h(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r11 != r1) goto La1
            return r1
        La1:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L35
            if (r10 == 0) goto Lce
            u0.o r8 = r8.V()     // Catch: java.util.concurrent.CancellationException -> L35
            java.util.List r8 = r8.c()     // Catch: java.util.concurrent.CancellationException -> L35
            int r10 = r8.size()     // Catch: java.util.concurrent.CancellationException -> L35
            r11 = 0
        Lb6:
            if (r11 >= r10) goto Lca
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L35
            u0.z r0 = (u0.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> L35
            boolean r1 = u0.C4650p.c(r0)     // Catch: java.util.concurrent.CancellationException -> L35
            if (r1 == 0) goto Lc7
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L35
        Lc7:
            int r11 = r11 + 1
            goto Lb6
        Lca:
            r9.a()     // Catch: java.util.concurrent.CancellationException -> L35
            goto Ld1
        Lce:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L35
        Ld1:
            oa.F r8 = oa.C4153F.f46609a
            return r8
        Ld4:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H.h.j(u0.c, F.j, u0.o, ta.d):java.lang.Object");
    }
}
