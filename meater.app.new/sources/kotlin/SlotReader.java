package kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\"¢\u0006\u0004\b'\u0010$J\r\u0010(\u001a\u00020\"¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\"¢\u0006\u0004\b+\u0010$J\u0015\u0010,\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\"¢\u0006\u0004\b/\u0010$J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010?R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0014\u0010D\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010?R6\u0010I\u001a\"\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u00010Ej\u0010\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020F\u0018\u0001`G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010HR$\u0010N\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010K\u001a\u0004\bL\u0010MR$\u0010P\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\bO\u0010*R$\u0010R\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\bQ\u0010*R$\u0010T\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bS\u0010*R\u0014\u0010W\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010VR\u0016\u0010Y\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0016\u0010[\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010?R\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010?R$\u0010`\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\b_\u0010MR\u0011\u0010b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\ba\u0010*R\u0011\u0010c\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b?\u0010MR\u0011\u0010e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bd\u0010MR\u0011\u0010g\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bf\u0010MR\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u0010*R\u0011\u0010j\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bZ\u0010*R\u0011\u0010k\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010*R\u0011\u0010m\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bl\u0010*R\u0011\u0010o\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bn\u0010MR\u0013\u0010p\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b^\u0010!R\u0013\u0010q\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bX\u0010!R\u0011\u0010s\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\br\u0010*R\u0011\u0010u\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bt\u0010*¨\u0006v"}, d2 = {"LO/Y0;", "", "LO/Z0;", "table", "<init>", "(LO/Z0;)V", "", "", "index", "M", "([II)Ljava/lang/Object;", "b", "O", "P", "(I)I", "", "J", "(I)Z", "N", "L", "(I)Ljava/lang/Object;", "E", "C", "G", "D", "z", "F", "e", "A", "group", "B", "(II)Ljava/lang/Object;", "K", "()Ljava/lang/Object;", "Loa/F;", "c", "()V", "f", "d", "U", "V", "S", "()I", "T", "Q", "(I)V", "R", "g", "", "LO/a0;", "h", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "LO/d;", "a", "(I)LO/d;", "LO/Z0;", "y", "()LO/Z0;", "[I", "groups", "I", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "Ljava/util/HashMap;", "LO/U;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sourceInformationMap", "<set-?>", "Z", "i", "()Z", "closed", "k", "currentGroup", "j", "currentEnd", "u", "parent", "LO/V;", "LO/V;", "currentSlotStack", "l", "emptyCount", "m", "currentSlot", "n", "currentSlotEnd", "o", "r", "hadNext", "x", "size", "isNode", "H", "isGroupEnd", "t", "inEmpty", "p", "groupSize", "groupEnd", "groupKey", "q", "groupSlotIndex", "s", "hasObjectKey", "groupObjectKey", "groupAux", "v", "parentNodes", "w", "remainingSlots", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.Y0, reason: from toString */
/* loaded from: classes.dex */
public final class SlotReader {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z0 table;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] groups;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int groupsSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object[] slots;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int slotsSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private HashMap<C1536d, C1521U> sourceInformationMap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private int current;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private int end;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private int parent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C1522V currentSlotStack;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int emptyCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean hadNext;

    public SlotReader(Z0 z02) {
        this.table = z02;
        this.groups = z02.getGroups();
        int groupsSize = z02.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = z02.getSlots();
        this.slotsSize = z02.getSlotsSize();
        this.end = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new C1522V();
    }

    private final Object M(int[] iArr, int i10) {
        return C1532b1.N(iArr, i10) ? this.slots[C1532b1.R(iArr, i10)] : InterfaceC1554l.INSTANCE.a();
    }

    private final Object O(int[] iArr, int i10) {
        if (C1532b1.L(iArr, i10)) {
            return this.slots[C1532b1.S(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        return C1532b1.J(iArr, i10) ? this.slots[C1532b1.B(iArr, i10)] : InterfaceC1554l.INSTANCE.a();
    }

    public final Object A(int index) {
        return B(this.current, index);
    }

    public final Object B(int group, int index) {
        int iV = C1532b1.V(this.groups, group);
        int i10 = group + 1;
        int i11 = iV + index;
        return i11 < (i10 < this.groupsSize ? C1532b1.F(this.groups, i10) : this.slotsSize) ? this.slots[i11] : InterfaceC1554l.INSTANCE.a();
    }

    public final int C(int index) {
        return C1532b1.O(this.groups, index);
    }

    public final Object D(int index) {
        return O(this.groups, index);
    }

    public final int E(int index) {
        return C1532b1.I(this.groups, index);
    }

    public final boolean F(int index) {
        return C1532b1.K(this.groups, index);
    }

    public final boolean G(int index) {
        return C1532b1.L(this.groups, index);
    }

    public final boolean H() {
        return t() || this.current == this.end;
    }

    public final boolean I() {
        return C1532b1.N(this.groups, this.current);
    }

    public final boolean J(int index) {
        return C1532b1.N(this.groups, index);
    }

    public final Object K() {
        int i10;
        if (this.emptyCount > 0 || (i10 = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return InterfaceC1554l.INSTANCE.a();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i10 + 1;
        return objArr[i10];
    }

    public final Object L(int index) {
        if (C1532b1.N(this.groups, index)) {
            return M(this.groups, index);
        }
        return null;
    }

    public final int N(int index) {
        return C1532b1.Q(this.groups, index);
    }

    public final int P(int index) {
        return C1532b1.T(this.groups, index);
    }

    public final void Q(int index) {
        if (!(this.emptyCount == 0)) {
            C1560o.s("Cannot reposition while in an empty region");
        }
        this.current = index;
        int iT = index < this.groupsSize ? C1532b1.T(this.groups, index) : -1;
        this.parent = iT;
        if (iT < 0) {
            this.end = this.groupsSize;
        } else {
            this.end = iT + C1532b1.I(this.groups, iT);
        }
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void R(int index) {
        int I10 = C1532b1.I(this.groups, index) + index;
        int i10 = this.current;
        if (!(i10 >= index && i10 <= I10)) {
            C1560o.s("Index " + index + " is not a parent of " + i10);
        }
        this.parent = index;
        this.end = I10;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int S() {
        if (!(this.emptyCount == 0)) {
            C1560o.s("Cannot skip while in an empty region");
        }
        int iQ = C1532b1.N(this.groups, this.current) ? 1 : C1532b1.Q(this.groups, this.current);
        int i10 = this.current;
        this.current = i10 + C1532b1.I(this.groups, i10);
        return iQ;
    }

    public final void T() {
        if (!(this.emptyCount == 0)) {
            C1560o.s("Cannot skip the enclosing group while in an empty region");
        }
        this.current = this.end;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void U() {
        C1521U c1521u;
        if (this.emptyCount <= 0) {
            int i10 = this.parent;
            int i11 = this.current;
            if (!(C1532b1.T(this.groups, i11) == i10)) {
                C1489A0.a("Invalid slot table detected");
            }
            HashMap<C1536d, C1521U> map = this.sourceInformationMap;
            if (map != null && (c1521u = map.get(a(i10))) != null) {
                c1521u.h(this.table, i11);
            }
            C1522V c1522v = this.currentSlotStack;
            int i12 = this.currentSlot;
            int i13 = this.currentSlotEnd;
            if (i12 == 0 && i13 == 0) {
                c1522v.j(-1);
            } else {
                c1522v.j(i12);
            }
            this.parent = i11;
            this.end = C1532b1.I(this.groups, i11) + i11;
            int i14 = i11 + 1;
            this.current = i14;
            this.currentSlot = C1532b1.V(this.groups, i11);
            this.currentSlotEnd = i11 >= this.groupsSize - 1 ? this.slotsSize : C1532b1.F(this.groups, i14);
        }
    }

    public final void V() {
        if (this.emptyCount <= 0) {
            if (!C1532b1.N(this.groups, this.current)) {
                C1489A0.a("Expected a node group");
            }
            U();
        }
    }

    public final C1536d a(int index) {
        ArrayList<C1536d> arrayListZ = this.table.z();
        int iU = C1532b1.U(arrayListZ, index, this.groupsSize);
        if (iU >= 0) {
            return arrayListZ.get(iU);
        }
        C1536d c1536d = new C1536d(index);
        arrayListZ.add(-(iU + 1), c1536d);
        return c1536d;
    }

    public final void c() {
        this.emptyCount++;
    }

    public final void d() {
        this.closed = true;
        this.table.i(this, this.sourceInformationMap);
    }

    public final boolean e(int index) {
        return C1532b1.D(this.groups, index);
    }

    public final void f() {
        if (!(this.emptyCount > 0)) {
            C1489A0.a("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void g() {
        if (this.emptyCount == 0) {
            if (!(this.current == this.end)) {
                C1560o.s("endGroup() not called at the end of a group");
            }
            int iT = C1532b1.T(this.groups, this.parent);
            this.parent = iT;
            this.end = iT < 0 ? this.groupsSize : C1532b1.I(this.groups, iT) + iT;
            int i10 = this.currentSlotStack.i();
            if (i10 < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = i10;
                this.currentSlotEnd = iT >= this.groupsSize - 1 ? this.slotsSize : C1532b1.F(this.groups, iT + 1);
            }
        }
    }

    public final List<C1528a0> h() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int I10 = this.current;
        int i10 = 0;
        while (I10 < this.end) {
            arrayList.add(new C1528a0(C1532b1.O(this.groups, I10), O(this.groups, I10), I10, C1532b1.N(this.groups, I10) ? 1 : C1532b1.Q(this.groups, I10), i10));
            I10 += C1532b1.I(this.groups, I10);
            i10++;
        }
        return arrayList;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: j, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: k, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final Object l() {
        int i10 = this.current;
        if (i10 < this.end) {
            return b(this.groups, i10);
        }
        return 0;
    }

    public final int m() {
        return this.end;
    }

    public final int n() {
        int i10 = this.current;
        if (i10 < this.end) {
            return C1532b1.O(this.groups, i10);
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.current;
        if (i10 < this.end) {
            return O(this.groups, i10);
        }
        return null;
    }

    public final int p() {
        return C1532b1.I(this.groups, this.current);
    }

    public final int q() {
        return this.currentSlot - C1532b1.V(this.groups, this.parent);
    }

    /* renamed from: r, reason: from getter */
    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean s() {
        int i10 = this.current;
        return i10 < this.end && C1532b1.L(this.groups, i10);
    }

    public final boolean t() {
        return this.emptyCount > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.current + ", key=" + n() + ", parent=" + this.parent + ", end=" + this.end + ')';
    }

    /* renamed from: u, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int v() {
        int i10 = this.parent;
        if (i10 >= 0) {
            return C1532b1.Q(this.groups, i10);
        }
        return 0;
    }

    public final int w() {
        return this.currentSlotEnd - this.currentSlot;
    }

    /* renamed from: x, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* renamed from: y, reason: from getter */
    public final Z0 getTable() {
        return this.table;
    }

    public final Object z(int index) {
        return b(this.groups, index);
    }
}
