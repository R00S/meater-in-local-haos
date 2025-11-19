package kotlin;

import Ca.a;
import a0.InterfaceC1880b;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"LO/v1;", "La0/b;", "", "LO/Z0;", "table", "", "parent", "LO/U;", "sourceInformation", "LO/u1;", "identityPath", "<init>", "(LO/Z0;ILO/U;LO/u1;)V", "", "iterator", "()Ljava/util/Iterator;", "B", "LO/Z0;", "getTable", "()LO/Z0;", "C", "I", "getParent", "()I", "D", "LO/U;", "getSourceInformation", "()LO/U;", "E", "LO/u1;", "getIdentityPath", "()LO/u1;", "", "F", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "G", "Ljava/lang/Iterable;", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class v1 implements InterfaceC1880b, Iterable<InterfaceC1880b>, a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Z0 table;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int parent;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C1521U sourceInformation;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final u1 identityPath;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final Iterable<InterfaceC1880b> compositionGroups = this;

    public v1(Z0 z02, int i10, C1521U c1521u, u1 u1Var) {
        this.table = z02;
        this.parent = i10;
        this.sourceInformation = c1521u;
        this.identityPath = u1Var;
        this.key = Integer.valueOf(c1521u.getKey());
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC1880b> iterator() {
        return new t1(this.table, this.parent, this.sourceInformation, this.identityPath);
    }
}
