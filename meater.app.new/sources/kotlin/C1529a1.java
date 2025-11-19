package kotlin;

import Ca.a;
import a0.InterfaceC1880b;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"LO/a1;", "La0/b;", "", "LO/Z0;", "table", "", "group", "version", "<init>", "(LO/Z0;II)V", "Loa/F;", "c", "()V", "", "iterator", "()Ljava/util/Iterator;", "B", "LO/Z0;", "getTable", "()LO/Z0;", "C", "I", "getGroup", "()I", "D", "getVersion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1529a1 implements InterfaceC1880b, Iterable<InterfaceC1880b>, a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Z0 table;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int group;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final int version;

    public C1529a1(Z0 z02, int i10, int i11) {
        this.table = z02;
        this.group = i10;
        this.version = i11;
    }

    private final void c() {
        if (this.table.getVersion() != this.version) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC1880b> iterator() {
        c();
        C1521U c1521uR = this.table.R(this.group);
        if (c1521uR != null) {
            Z0 z02 = this.table;
            int i10 = this.group;
            return new t1(z02, i10, c1521uR, new C1539e(i10));
        }
        Z0 z03 = this.table;
        int i11 = this.group;
        return new C1519S(z03, i11 + 1, i11 + C1532b1.I(z03.getGroups(), this.group));
    }
}
