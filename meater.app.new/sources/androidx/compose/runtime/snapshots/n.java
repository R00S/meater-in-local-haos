package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H&¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/n;", "", "<init>", "()V", "value", "Loa/F;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", "d", "()Landroidx/compose/runtime/snapshots/n;", "", "a", "I", "f", "()I", "h", "(I)V", "snapshotId", "b", "Landroidx/compose/runtime/snapshots/n;", "e", "g", "next", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int snapshotId = j.H().getId();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private n next;

    public abstract void c(n value);

    public abstract n d();

    /* renamed from: e, reason: from getter */
    public final n getNext() {
        return this.next;
    }

    /* renamed from: f, reason: from getter */
    public final int getSnapshotId() {
        return this.snapshotId;
    }

    public final void g(n nVar) {
        this.next = nVar;
    }

    public final void h(int i10) {
        this.snapshotId = i10;
    }
}
