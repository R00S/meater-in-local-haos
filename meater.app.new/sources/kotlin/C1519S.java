package kotlin;

import Ca.a;
import a0.InterfaceC1880b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\u001e"}, d2 = {"LO/S;", "", "La0/b;", "LO/Z0;", "table", "", "start", "end", "<init>", "(LO/Z0;II)V", "Loa/F;", "d", "()V", "", "hasNext", "()Z", "b", "()La0/b;", "B", "LO/Z0;", "getTable", "()LO/Z0;", "C", "I", "getEnd", "()I", "D", "index", "E", "version", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1519S implements Iterator<InterfaceC1880b>, a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Z0 table;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public C1519S(Z0 z02, int i10, int i11) {
        this.table = z02;
        this.end = i11;
        this.index = i10;
        this.version = z02.getVersion();
        if (z02.getWriter()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1880b next() {
        d();
        int i10 = this.index;
        this.index = C1532b1.I(this.table.getGroups(), i10) + i10;
        return new C1529a1(this.table, i10, this.version);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
