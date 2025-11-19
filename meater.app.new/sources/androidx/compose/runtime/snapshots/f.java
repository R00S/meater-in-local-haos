package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001c¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/g;", "", "id", "Landroidx/compose/runtime/snapshots/i;", "invalid", "Lkotlin/Function1;", "", "Loa/F;", "readObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/i;LBa/l;)V", "x", "(LBa/l;)Landroidx/compose/runtime/snapshots/g;", "o", "()V", "d", "snapshot", "m", "(Landroidx/compose/runtime/snapshots/g;)V", "n", "LZ/k;", "state", "p", "(LZ/k;)V", "g", "LBa/l;", "A", "()LBa/l;", "h", "I", "snapshots", "", "i", "()Z", "readOnly", "k", "writeObserver", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<Object, C4153F> readObserver;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    public f(int i10, i iVar, Ba.l<Object, C4153F> lVar) {
        super(i10, iVar, null);
        this.readObserver = lVar;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Ba.l<Object, C4153F> h() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (getDisposed()) {
            return;
        }
        n(this);
        super.d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean i() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public Ba.l<Object, C4153F> k() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void m(g snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void n(g snapshot) {
        int i10 = this.snapshots - 1;
        this.snapshots = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(Z.k state) {
        j.Z();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(Ba.l<Object, C4153F> readObserver) {
        j.g0(this);
        return new d(getId(), getInvalid(), j.L(readObserver, h(), false, 4, null), this);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
    }
}
