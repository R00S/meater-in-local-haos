package A0;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: OwnerSnapshotObserver.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0017\u001a\u00020\u0004\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001e\u0010\u001aR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\"¨\u0006-"}, d2 = {"LA0/o0;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Loa/F;", "onChangedExecutor", "<init>", "(LBa/l;)V", "LA0/G;", "node", "", "affectsLookahead", "block", "e", "(LA0/G;ZLBa/a;)V", "c", "g", "j", "(LA0/G;LBa/a;)V", "LA0/n0;", "T", "target", "onChanged", "i", "(LA0/n0;LBa/l;LBa/a;)V", "b", "()V", "a", "(Ljava/lang/Object;)V", "k", "l", "Landroidx/compose/runtime/snapshots/l;", "Landroidx/compose/runtime/snapshots/l;", "observer", "LBa/l;", "onCommitAffectingLookaheadMeasure", "onCommitAffectingMeasure", "d", "onCommitAffectingSemantics", "onCommitAffectingLayout", "f", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "h", "onCommitAffectingLookahead", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f654i = androidx.compose.runtime.snapshots.l.f22636k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.snapshots.l observer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<G, C4153F> onCommitAffectingLookaheadMeasure = f.f668B;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<G, C4153F> onCommitAffectingMeasure = g.f669B;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<G, C4153F> onCommitAffectingSemantics = h.f670B;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<G, C4153F> onCommitAffectingLayout = b.f664B;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<G, C4153F> onCommitAffectingLayoutModifier = c.f665B;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<G, C4153F> onCommitAffectingLayoutModifierInLookahead = d.f666B;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<G, C4153F> onCommitAffectingLookahead = e.f667B;

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Object, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f663B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((n0) obj).b0());
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "layoutNode", "Loa/F;", "a", "(LA0/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<G, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f664B = new b();

        b() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.b0()) {
                G.u1(g10, false, 1, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(G g10) {
            a(g10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "layoutNode", "Loa/F;", "a", "(LA0/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<G, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f665B = new c();

        c() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.b0()) {
                G.u1(g10, false, 1, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(G g10) {
            a(g10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "layoutNode", "Loa/F;", "a", "(LA0/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<G, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f666B = new d();

        d() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.b0()) {
                G.q1(g10, false, 1, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(G g10) {
            a(g10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "layoutNode", "Loa/F;", "a", "(LA0/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<G, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f667B = new e();

        e() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.b0()) {
                G.q1(g10, false, 1, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(G g10) {
            a(g10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "layoutNode", "Loa/F;", "a", "(LA0/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.l<G, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f668B = new f();

        f() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.b0()) {
                G.s1(g10, false, false, false, 7, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(G g10) {
            a(g10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "layoutNode", "Loa/F;", "a", "(LA0/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.l<G, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f669B = new g();

        g() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.b0()) {
                G.w1(g10, false, false, false, 7, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(G g10) {
            a(g10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OwnerSnapshotObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "layoutNode", "Loa/F;", "a", "(LA0/G;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.l<G, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f670B = new h();

        h() {
            super(1);
        }

        public final void a(G g10) {
            if (g10.b0()) {
                g10.I0();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(G g10) {
            a(g10);
            return C4153F.f46609a;
        }
    }

    public o0(Ba.l<? super Ba.a<C4153F>, C4153F> lVar) {
        this.observer = new androidx.compose.runtime.snapshots.l(lVar);
    }

    public static /* synthetic */ void d(o0 o0Var, G g10, boolean z10, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.c(g10, z10, aVar);
    }

    public static /* synthetic */ void f(o0 o0Var, G g10, boolean z10, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.e(g10, z10, aVar);
    }

    public static /* synthetic */ void h(o0 o0Var, G g10, boolean z10, Ba.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        o0Var.g(g10, z10, aVar);
    }

    public final void a(Object target) {
        this.observer.k(target);
    }

    public final void b() {
        this.observer.l(a.f663B);
    }

    public final void c(G node, boolean affectsLookahead, Ba.a<C4153F> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingLayoutModifier, block);
        } else {
            i(node, this.onCommitAffectingLayoutModifierInLookahead, block);
        }
    }

    public final void e(G node, boolean affectsLookahead, Ba.a<C4153F> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingLayout, block);
        } else {
            i(node, this.onCommitAffectingLookahead, block);
        }
    }

    public final void g(G node, boolean affectsLookahead, Ba.a<C4153F> block) {
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            i(node, this.onCommitAffectingMeasure, block);
        } else {
            i(node, this.onCommitAffectingLookaheadMeasure, block);
        }
    }

    public final <T extends n0> void i(T target, Ba.l<? super T, C4153F> onChanged, Ba.a<C4153F> block) {
        this.observer.o(target, onChanged, block);
    }

    public final void j(G node, Ba.a<C4153F> block) {
        i(node, this.onCommitAffectingSemantics, block);
    }

    public final void k() {
        this.observer.s();
    }

    public final void l() {
        this.observer.t();
        this.observer.j();
    }
}
