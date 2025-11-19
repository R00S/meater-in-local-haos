package androidx.compose.runtime.snapshots;

import kotlin.C1533c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eRF\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010$R\u001a\u0010.\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R$\u0010;\u001a\u0002052\u0006\u00106\u001a\u0002058V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010@\u001a\u00020<2\u0006\u00106\u001a\u00020<8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010=\"\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010A¨\u0006C"}, d2 = {"Landroidx/compose/runtime/snapshots/q;", "Landroidx/compose/runtime/snapshots/g;", "previousSnapshot", "Lkotlin/Function1;", "", "Loa/F;", "specifiedReadObserver", "", "mergeParentObservers", "ownsPreviousSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/g;LBa/l;ZZ)V", "d", "()V", "LZ/k;", "state", "p", "(LZ/k;)V", "readObserver", "x", "(LBa/l;)Landroidx/compose/runtime/snapshots/g;", "o", "snapshot", "", "D", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "E", "g", "Landroidx/compose/runtime/snapshots/g;", "h", "Z", "i", "<set-?>", "j", "LBa/l;", "B", "()LBa/l;", "F", "(LBa/l;)V", "k", "writeObserver", "", "l", "J", "C", "()J", "threadId", "m", "getRoot", "()Landroidx/compose/runtime/snapshots/g;", "root", "A", "currentSnapshot", "", "value", "f", "()I", "setId$runtime_release", "(I)V", "id", "Landroidx/compose/runtime/snapshots/i;", "()Landroidx/compose/runtime/snapshots/i;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/i;)V", "invalid", "()Z", "readOnly", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q extends g {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g previousSnapshot;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsPreviousSnapshot;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Ba.l<Object, C4153F> readObserver;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Object, C4153F> writeObserver;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long threadId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final g root;

    public q(g gVar, Ba.l<Object, C4153F> lVar, boolean z10, boolean z11) {
        Ba.l<Object, C4153F> lVarH;
        super(0, i.INSTANCE.a(), null);
        this.previousSnapshot = gVar;
        this.mergeParentObservers = z10;
        this.ownsPreviousSnapshot = z11;
        this.readObserver = j.K(lVar, (gVar == null || (lVarH = gVar.h()) == null) ? ((a) j.f22619j.get()).h() : lVarH, z10);
        this.threadId = C1533c.a();
        this.root = this;
    }

    private final g A() {
        g gVar = this.previousSnapshot;
        return gVar == null ? (g) j.f22619j.get() : gVar;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Ba.l<Object, C4153F> h() {
        return this.readObserver;
    }

    /* renamed from: C, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    public void F(Ba.l<Object, C4153F> lVar) {
        this.readObserver = lVar;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        g gVar;
        t(true);
        if (!this.ownsPreviousSnapshot || (gVar = this.previousSnapshot) == null) {
            return;
        }
        gVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: f */
    public int getId() {
        return A().getId();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: g */
    public i getInvalid() {
        return A().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean i() {
        return A().i();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public Ba.l<Object, C4153F> k() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
        A().o();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(Z.k state) {
        A().p(state);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(Ba.l<Object, C4153F> readObserver) {
        Ba.l<Object, C4153F> lVarL = j.L(readObserver, h(), false, 4, null);
        return !this.mergeParentObservers ? j.D(A().x(null), lVarL, true) : A().x(lVarL);
    }
}
