package androidx.compose.runtime.snapshots;

import kotlin.C1533c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import oa.C4153F;
import s.C4389K;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001b\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\"\u0010!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&RF\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.RF\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001a\u00106\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R$\u0010?\u001a\u00020:2\u0006\u0010;\u001a\u00020:8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b'\u0010>R$\u0010D\u001a\u00020@2\u0006\u0010;\u001a\u00020@8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\b)\u0010CR4\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010E2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010E8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010L\u001a\u00020:2\u0006\u0010;\u001a\u00020:8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bK\u0010=\"\u0004\b/\u0010>R\u0014\u0010O\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Landroidx/compose/runtime/snapshots/p;", "Landroidx/compose/runtime/snapshots/b;", "parentSnapshot", "Lkotlin/Function1;", "", "Loa/F;", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/b;LBa/l;LBa/l;ZZ)V", "d", "()V", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "LZ/k;", "state", "p", "(LZ/k;)V", "readObserver", "Landroidx/compose/runtime/snapshots/g;", "x", "(LBa/l;)Landroidx/compose/runtime/snapshots/g;", "writeObserver", "Q", "(LBa/l;LBa/l;)Landroidx/compose/runtime/snapshots/b;", "o", "snapshot", "", "V", "(Landroidx/compose/runtime/snapshots/g;)Ljava/lang/Void;", "W", "s", "Landroidx/compose/runtime/snapshots/b;", "t", "Z", "u", "<set-?>", "v", "LBa/l;", "H", "()LBa/l;", "X", "(LBa/l;)V", "w", "k", "Y", "", "J", "U", "()J", "threadId", "T", "()Landroidx/compose/runtime/snapshots/b;", "currentSnapshot", "", "value", "f", "()I", "(I)V", "id", "Landroidx/compose/runtime/snapshots/i;", "g", "()Landroidx/compose/runtime/snapshots/i;", "(Landroidx/compose/runtime/snapshots/i;)V", "invalid", "Ls/K;", "E", "()Ls/K;", "P", "(Ls/K;)V", "modified", "j", "writeCount", "i", "()Z", "readOnly", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p extends b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final b parentSnapshot;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean ownsParentSnapshot;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Ba.l<Object, C4153F> readObserver;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Ba.l<Object, C4153F> writeObserver;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long threadId;

    public p(b bVar, Ba.l<Object, C4153F> lVar, Ba.l<Object, C4153F> lVar2, boolean z10, boolean z11) {
        Ba.l<Object, C4153F> lVarK;
        Ba.l<Object, C4153F> lVarH;
        super(0, i.INSTANCE.a(), j.K(lVar, (bVar == null || (lVarH = bVar.h()) == null) ? ((a) j.f22619j.get()).h() : lVarH, z10), j.M(lVar2, (bVar == null || (lVarK = bVar.k()) == null) ? ((a) j.f22619j.get()).k() : lVarK));
        this.parentSnapshot = bVar;
        this.mergeParentObservers = z10;
        this.ownsParentSnapshot = z11;
        this.readObserver = super.h();
        this.writeObserver = super.k();
        this.threadId = C1533c.a();
    }

    private final b T() {
        b bVar = this.parentSnapshot;
        return bVar == null ? (b) j.f22619j.get() : bVar;
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        return T().C();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public C4389K<Z.k> E() {
        return T().E();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Ba.l<Object, C4153F> h() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.b
    public void P(C4389K<Z.k> c4389k) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public b Q(Ba.l<Object, C4153F> readObserver, Ba.l<Object, C4153F> writeObserver) {
        Ba.l<Object, C4153F> lVarL = j.L(readObserver, h(), false, 4, null);
        Ba.l<Object, C4153F> lVarM = j.M(writeObserver, k());
        return !this.mergeParentObservers ? new p(T().Q(null, lVarM), lVarL, lVarM, false, true) : T().Q(lVarL, lVarM);
    }

    /* renamed from: U, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Void m(g snapshot) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void n(g snapshot) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    public void X(Ba.l<Object, C4153F> lVar) {
        this.readObserver = lVar;
    }

    public void Y(Ba.l<Object, C4153F> lVar) {
        this.writeObserver = lVar;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        b bVar;
        t(true);
        if (!this.ownsParentSnapshot || (bVar = this.parentSnapshot) == null) {
            return;
        }
        bVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: f */
    public int getId() {
        return T().getId();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: g */
    public i getInvalid() {
        return T().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public boolean i() {
        return T().i();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: j */
    public int getWriteCount() {
        return T().getWriteCount();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public Ba.l<Object, C4153F> k() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void o() {
        T().o();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void p(Z.k state) {
        T().p(state);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void u(int i10) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void v(i iVar) {
        Z.i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void w(int i10) {
        T().w(i10);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public g x(Ba.l<Object, C4153F> readObserver) {
        Ba.l<Object, C4153F> lVarL = j.L(readObserver, h(), false, 4, null);
        return !this.mergeParentObservers ? j.D(T().x(null), lVarL, true) : T().x(lVarL);
    }
}
