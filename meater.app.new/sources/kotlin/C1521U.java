package kotlin;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"LO/U;", "", "f", "()LO/U;", "group", "Loa/F;", "a", "(Ljava/lang/Object;)V", "LO/d;", "anchor", "", "e", "(LO/d;)Z", "LO/c1;", "writer", "", "i", "(LO/c1;I)V", "LO/Z0;", "table", "h", "(LO/Z0;I)V", "predecessor", "b", "(LO/c1;II)V", "g", "I", "d", "()I", "key", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "c", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "groups", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1521U {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Object> groups;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    private final void a(Object group) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(group);
    }

    private final boolean e(C1536d anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (C3862t.b(obj, anchor) || ((obj instanceof C1521U) && ((C1521U) obj).e(anchor))) {
                return true;
            }
        }
        return false;
    }

    private final C1521U f() {
        Object obj;
        C1521U c1521uF;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof C1521U) && !((C1521U) obj).closed) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        C1521U c1521u = obj instanceof C1521U ? (C1521U) obj : null;
        return (c1521u == null || (c1521uF = c1521u.f()) == null) ? this : c1521uF;
    }

    public final void b(SlotWriter writer, int predecessor, int group) {
        C1536d c1536dO1;
        ArrayList<Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.groups = arrayList;
        }
        int i10 = 0;
        if (predecessor >= 0 && (c1536dO1 = writer.o1(predecessor)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                Object obj = arrayList.get(i10);
                if (C3862t.b(obj, c1536dO1) || ((obj instanceof C1521U) && ((C1521U) obj).e(c1536dO1))) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        arrayList.add(i10, writer.E(group));
    }

    public final ArrayList<Object> c() {
        return this.groups;
    }

    /* renamed from: d, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    public final boolean g(C1536d anchor) {
        ArrayList<Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C1536d) {
                    if (C3862t.b(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof C1521U) && !((C1521U) obj).g(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }

    public final void h(Z0 table, int group) {
        f().a(table.c(group));
    }

    public final void i(SlotWriter writer, int group) {
        f().a(writer.E(group));
    }
}
