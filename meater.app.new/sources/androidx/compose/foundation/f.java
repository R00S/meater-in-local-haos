package androidx.compose.foundation;

import A0.s0;
import A0.w0;
import Ba.q;
import F0.v;
import F0.x;
import h0.C3476g;
import kotlin.C5018A;
import kotlin.InterfaceC5038r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.InterfaceC4622H;
import ua.C4696b;
import w.InterfaceC4949B;
import z.InterfaceC5162k;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Bo\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u0004*\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017Jz\u0010\u0018\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0004*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/f;", "", "Landroidx/compose/foundation/a;", "Lkotlin/Function0;", "Loa/F;", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "Lz/k;", "interactionSource", "Lw/B;", "indicationNodeFactory", "", "enabled", "onClickLabel", "LF0/i;", "role", "<init>", "(LBa/a;Ljava/lang/String;LBa/a;LBa/a;Lz/k;Lw/B;ZLjava/lang/String;LF0/i;Lkotlin/jvm/internal/k;)V", "Lu0/H;", "w2", "(Lu0/H;Lta/d;)Ljava/lang/Object;", "K2", "(LBa/a;Ljava/lang/String;LBa/a;LBa/a;Lz/k;Lw/B;ZLjava/lang/String;LF0/i;)V", "LF0/x;", "v2", "(LF0/x;)V", "k0", "Ljava/lang/String;", "l0", "LBa/a;", "m0", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f extends androidx.compose.foundation.a implements s0 {

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private String onLongClickLabel;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onLongClick;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onDoubleClick;

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Boolean> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            Ba.a aVar = f.this.onLongClick;
            if (aVar != null) {
                aVar.invoke();
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/g;", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<C3476g, C4153F> {
        b() {
            super(1);
        }

        public final void a(long j10) {
            Ba.a aVar = f.this.onDoubleClick;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3476g c3476g) {
            a(c3476g.getPackedValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/g;", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<C3476g, C4153F> {
        c() {
            super(1);
        }

        public final void a(long j10) {
            Ba.a aVar = f.this.onLongClick;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3476g c3476g) {
            a(c3476g.getPackedValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.CombinedClickableNodeImpl$clickPointerInput$4", f = "Clickable.kt", l = {787}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx/r;", "Lh0/g;", "offset", "Loa/F;", "<anonymous>", "(Lx/r;Lh0/g;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.l implements q<InterfaceC5038r, C3476g, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f21961B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f21962C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ long f21963D;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        public final Object b(InterfaceC5038r interfaceC5038r, long j10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            d dVar = f.this.new d(interfaceC4588d);
            dVar.f21962C = interfaceC5038r;
            dVar.f21963D = j10;
            return dVar.invokeSuspend(C4153F.f46609a);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(InterfaceC5038r interfaceC5038r, C3476g c3476g, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return b(interfaceC5038r, c3476g.getPackedValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f21961B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC5038r interfaceC5038r = (InterfaceC5038r) this.f21962C;
                long j10 = this.f21963D;
                if (f.this.getEnabled()) {
                    f fVar = f.this;
                    this.f21961B = 1;
                    if (fVar.D2(interfaceC5038r, j10, this) == objE) {
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

    /* compiled from: Clickable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/g;", "it", "Loa/F;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<C3476g, C4153F> {
        e() {
            super(1);
        }

        public final void a(long j10) {
            if (f.this.getEnabled()) {
                f.this.C2().invoke();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3476g c3476g) {
            a(c3476g.getPackedValue());
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ f(Ba.a aVar, String str, Ba.a aVar2, Ba.a aVar3, InterfaceC5162k interfaceC5162k, InterfaceC4949B interfaceC4949B, boolean z10, String str2, F0.i iVar, C3854k c3854k) {
        this(aVar, str, aVar2, aVar3, interfaceC5162k, interfaceC4949B, z10, str2, iVar);
    }

    public void K2(Ba.a<C4153F> onClick, String onLongClickLabel, Ba.a<C4153F> onLongClick, Ba.a<C4153F> onDoubleClick, InterfaceC5162k interactionSource, InterfaceC4949B indicationNodeFactory, boolean enabled, String onClickLabel, F0.i role) {
        boolean z10;
        if (!C3862t.b(this.onLongClickLabel, onLongClickLabel)) {
            this.onLongClickLabel = onLongClickLabel;
            w0.b(this);
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            y2();
            w0.b(this);
            z10 = true;
        } else {
            z10 = false;
        }
        this.onLongClick = onLongClick;
        if ((this.onDoubleClick == null) != (onDoubleClick == null)) {
            z10 = true;
        }
        this.onDoubleClick = onDoubleClick;
        boolean z11 = getEnabled() != enabled ? true : z10;
        H2(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
        if (z11) {
            F2();
        }
    }

    @Override // androidx.compose.foundation.a
    public void v2(x xVar) {
        if (this.onLongClick != null) {
            v.q(xVar, this.onLongClickLabel, new a());
        }
    }

    @Override // androidx.compose.foundation.a
    public Object w2(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objI = C5018A.i(interfaceC4622H, (!getEnabled() || this.onDoubleClick == null) ? null : new b(), (!getEnabled() || this.onLongClick == null) ? null : new c(), new d(null), new e(), interfaceC4588d);
        return objI == C4696b.e() ? objI : C4153F.f46609a;
    }

    private f(Ba.a<C4153F> aVar, String str, Ba.a<C4153F> aVar2, Ba.a<C4153F> aVar3, InterfaceC5162k interfaceC5162k, InterfaceC4949B interfaceC4949B, boolean z10, String str2, F0.i iVar) {
        super(interfaceC5162k, interfaceC4949B, z10, str2, iVar, aVar, null);
        this.onLongClickLabel = str;
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
    }
}
