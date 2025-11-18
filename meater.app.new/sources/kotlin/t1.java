package kotlin;

import Ca.a;
import a0.InterfaceC1880b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0017¨\u0006&"}, d2 = {"LO/t1;", "", "La0/b;", "LO/Z0;", "table", "", "parent", "LO/U;", "group", "LO/u1;", "path", "<init>", "(LO/Z0;ILO/U;LO/u1;)V", "", "hasNext", "()Z", "b", "()La0/b;", "B", "LO/Z0;", "getTable", "()LO/Z0;", "C", "I", "getParent", "()I", "D", "LO/U;", "getGroup", "()LO/U;", "E", "LO/u1;", "getPath", "()LO/u1;", "F", "version", "G", "index", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class t1 implements Iterator<InterfaceC1880b>, a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Z0 table;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C1521U group;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final u1 path;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private int index;

    public t1(Z0 z02, int i10, C1521U c1521u, u1 u1Var) {
        this.table = z02;
        this.parent = i10;
        this.group = c1521u;
        this.path = u1Var;
        this.version = z02.getVersion();
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1880b next() {
        Object obj;
        ArrayList<Object> arrayListC = this.group.c();
        if (arrayListC != null) {
            int i10 = this.index;
            this.index = i10 + 1;
            obj = arrayListC.get(i10);
        } else {
            obj = null;
        }
        if (obj instanceof C1536d) {
            return new C1529a1(this.table, ((C1536d) obj).getLocation(), this.version);
        }
        if (obj instanceof C1521U) {
            return new v1(this.table, this.parent, (C1521U) obj, new P0(this.path, this.index - 1));
        }
        C1560o.t("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList<Object> arrayListC = this.group.c();
        return arrayListC != null && this.index < arrayListC.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
