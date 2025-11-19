package kotlin;

import Ca.a;
import a0.InterfaceC1879a;
import a0.InterfaceC1880b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4380B;
import s.C4381C;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010(\n\u0002\b%\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u000b2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eH\u0000¢\u0006\u0004\b!\u0010\"J\u008f\u0001\u00101\u001a\u00020 2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b1\u00102J\u0087\u0001\u00103\u001a\u00020 2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00062\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u0006\u0010*\u001a\u00020\u00062\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.H\u0000¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0015¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0004\u0018\u00010\u001d2\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u0010\u0005J\r\u0010;\u001a\u00020 ¢\u0006\u0004\b;\u0010\u0005J!\u0010=\u001a\u0004\u0018\u00010(2\u0006\u00107\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00030?H\u0096\u0002¢\u0006\u0004\b@\u0010AR$\u0010%\u001a\u00020$2\u0006\u0010B\u001a\u00020$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010ER$\u0010&\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR4\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u0010J\u001a\u0004\bK\u0010LR$\u0010*\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bM\u0010IR\u0016\u0010N\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010GR$\u0010#\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bG\u00106R\"\u0010T\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010G\u001a\u0004\bQ\u0010I\"\u0004\bR\u0010SR2\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\b0+j\b\u0012\u0004\u0012\u00020\b`,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YRB\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010Z\u001a\u0004\bO\u0010[\"\u0004\b\\\u0010]R*\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u00106¨\u0006d"}, d2 = {"LO/Z0;", "La0/a;", "", "La0/b;", "<init>", "()V", "", "index", "LO/d;", "S", "(I)LO/d;", "LO/Y0;", "K", "()LO/Y0;", "LO/c1;", "L", "()LO/c1;", "c", "anchor", "h", "(LO/d;)I", "", "M", "(LO/d;)Z", "groupIndex", "J", "(ILO/d;)Z", "reader", "Ljava/util/HashMap;", "LO/U;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "Loa/F;", "i", "(LO/Y0;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Ls/B;", "Ls/C;", "calledByMap", "j", "(LO/c1;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Ls/B;)V", "O", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Ls/B;)V", "y", "()Z", "group", "R", "(I)LO/U;", "w", "x", "slotIndex", "Q", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "<set-?>", "B", "[I", "()[I", "C", "I", "D", "()I", "[Ljava/lang/Object;", "E", "()[Ljava/lang/Object;", "F", "readers", "G", "Z", "H", "setVersion$runtime_release", "(I)V", "version", "Ljava/util/ArrayList;", "z", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "Ls/B;", "A", "()Ls/B;", "setCalledByMap$runtime_release", "(Ls/B;)V", "isEmpty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z0 implements InterfaceC1879a, Iterable<InterfaceC1880b>, a {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int groupsSize;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int slotsSize;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int readers;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean writer;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private int version;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private HashMap<C1536d, C1521U> sourceInformationMap;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private C4380B<C4381C> calledByMap;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int[] groups = new int[0];

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Object[] slots = new Object[0];

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private ArrayList<C1536d> anchors = new ArrayList<>();

    private final C1536d S(int index) {
        int i10;
        if (this.writer) {
            C1560o.s("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i10 = this.groupsSize)) {
            return null;
        }
        return C1532b1.G(this.anchors, index, i10);
    }

    public final C4380B<C4381C> A() {
        return this.calledByMap;
    }

    /* renamed from: B, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    /* renamed from: D, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* renamed from: E, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    /* renamed from: F, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<C1536d, C1521U> G() {
        return this.sourceInformationMap;
    }

    /* renamed from: H, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean J(int groupIndex, C1536d anchor) {
        if (this.writer) {
            C1560o.s("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            C1560o.s("Invalid group index");
        }
        if (M(anchor)) {
            int I10 = C1532b1.I(this.groups, groupIndex) + groupIndex;
            int iA = anchor.getLocation();
            if (groupIndex <= iA && iA < I10) {
                return true;
            }
        }
        return false;
    }

    public final SlotReader K() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter L() {
        if (this.writer) {
            C1560o.s("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            C1560o.s("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean M(C1536d anchor) {
        int iU;
        return anchor.b() && (iU = C1532b1.U(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && C3862t.b(this.anchors.get(iU), anchor);
    }

    public final void O(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<C1536d> anchors, HashMap<C1536d, C1521U> sourceInformationMap, C4380B<C4381C> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final Object Q(int group, int slotIndex) {
        int iV = C1532b1.V(this.groups, group);
        int i10 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i10 < this.groupsSize ? C1532b1.F(this.groups, i10) : this.slots.length) - iV) ? InterfaceC1554l.INSTANCE.a() : this.slots[iV + slotIndex];
    }

    public final C1521U R(int group) {
        C1536d c1536dS;
        HashMap<C1536d, C1521U> map = this.sourceInformationMap;
        if (map == null || (c1536dS = S(group)) == null) {
            return null;
        }
        return map.get(c1536dS);
    }

    public final C1536d c(int index) {
        if (this.writer) {
            C1560o.s("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (index >= 0 && index < this.groupsSize) {
            z10 = true;
        }
        if (!z10) {
            C1489A0.a("Parameter index is out of range");
        }
        ArrayList<C1536d> arrayList = this.anchors;
        int iU = C1532b1.U(arrayList, index, this.groupsSize);
        if (iU >= 0) {
            return arrayList.get(iU);
        }
        C1536d c1536d = new C1536d(index);
        arrayList.add(-(iU + 1), c1536d);
        return c1536d;
    }

    public final int h(C1536d anchor) {
        if (this.writer) {
            C1560o.s("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.b()) {
            C1489A0.a("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final void i(SlotReader reader, HashMap<C1536d, C1521U> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            C1560o.s("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this) {
                try {
                    HashMap<C1536d, C1521U> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    C4153F c4153f = C4153F.f46609a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC1880b> iterator() {
        return new C1519S(this, 0, this.groupsSize);
    }

    public final void j(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<C1536d> anchors, HashMap<C1536d, C1521U> sourceInformationMap, C4380B<C4381C> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            C1489A0.a("Unexpected writer close()");
        }
        this.writer = false;
        O(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    public final void w() {
        this.calledByMap = new C4380B<>(0, 1, null);
    }

    public final void x() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean y() {
        return this.groupsSize > 0 && C1532b1.D(this.groups, 0);
    }

    public final ArrayList<C1536d> z() {
        return this.anchors;
    }
}
