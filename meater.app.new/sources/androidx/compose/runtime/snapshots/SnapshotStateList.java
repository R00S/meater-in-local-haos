package androidx.compose.runtime.snapshots;

import R.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.C1489A0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3853j;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SnapshotStateList.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001PB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u001eJ\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010(J%\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010\u0014J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J%\u00102\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00102\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b2\u0010\u0018J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u0010\u0007J\u0017\u00105\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u0010\u0014J\u001d\u00106\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b6\u0010\u0018J\u0017\u00107\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b7\u0010\u001cJ\u001d\u00108\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b8\u0010\u0018J \u00109\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J-\u0010?\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0000¢\u0006\u0004\b?\u0010@R$\u0010E\u001a\u00020\r2\u0006\u0010A\u001a\u00020\r8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b?\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\u00198@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR \u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000I8@X\u0080\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0007\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010G¨\u0006Q"}, d2 = {"Landroidx/compose/runtime/snapshots/k;", "T", "LZ/k;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Lkotlin/Function1;", "", "block", "y", "(LBa/l;)Z", "Landroidx/compose/runtime/snapshots/n;", "value", "Loa/F;", "h", "(Landroidx/compose/runtime/snapshots/n;)V", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "z", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "A", "(II)V", "start", "end", "B", "(Ljava/util/Collection;II)I", "<set-?>", "Landroidx/compose/runtime/snapshots/n;", "i", "()Landroidx/compose/runtime/snapshots/n;", "firstStateRecord", "x", "()I", "structure", "Landroidx/compose/runtime/snapshots/k$a;", "c", "()Landroidx/compose/runtime/snapshots/k$a;", "getReadable$runtime_release$annotations", "readable", "w", "size", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.k, reason: from toString */
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements Z.k, List<T>, RandomAccess, Ca.d {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private n firstStateRecord;

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006R\"\u0010\u0017\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/k$a;", "T", "Landroidx/compose/runtime/snapshots/n;", "LR/e;", "list", "<init>", "(LR/e;)V", "value", "Loa/F;", "c", "(Landroidx/compose/runtime/snapshots/n;)V", "d", "()Landroidx/compose/runtime/snapshots/n;", "LR/e;", "i", "()LR/e;", "l", "", "I", "j", "()I", "m", "(I)V", "modification", "e", "k", "n", "structuralChange", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.k$a */
    public static final class a<T> extends n {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private R.e<? extends T> list;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int modification;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int structuralChange;

        public a(R.e<? extends T> eVar) {
            this.list = eVar;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(n value) {
            synchronized (Z.h.f19558a) {
                C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.list = ((a) value).list;
                this.modification = ((a) value).modification;
                this.structuralChange = ((a) value).structuralChange;
                C4153F c4153f = C4153F.f46609a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.n
        public n d() {
            return new a(this.list);
        }

        public final R.e<T> i() {
            return this.list;
        }

        /* renamed from: j, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        /* renamed from: k, reason: from getter */
        public final int getStructuralChange() {
            return this.structuralChange;
        }

        public final void l(R.e<? extends T> eVar) {
            this.list = eVar;
        }

        public final void m(int i10) {
            this.modification = i10;
        }

        public final void n(int i10) {
            this.structuralChange = i10;
        }
    }

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.snapshots.k$b */
    static final class b extends AbstractC3864v implements Ba.l<List<T>, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f22633B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Collection<T> f22634C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, Collection<? extends T> collection) {
            super(1);
            this.f22633B = i10;
            this.f22634C = collection;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.addAll(this.f22633B, this.f22634C));
        }
    }

    /* compiled from: SnapshotStateList.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.snapshots.k$c */
    static final class c extends AbstractC3864v implements Ba.l<List<T>, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Collection<T> f22635B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Collection<? extends T> collection) {
            super(1);
            this.f22635B = collection;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<T> list) {
            return Boolean.valueOf(list.retainAll(this.f22635B));
        }
    }

    public SnapshotStateList() {
        R.e eVarA = R.a.a();
        a aVar = new a(eVarA);
        if (g.INSTANCE.e()) {
            a aVar2 = new a(eVarA);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.firstStateRecord = aVar;
    }

    private final boolean y(Ba.l<? super List<T>, Boolean> block) {
        int modification;
        R.e<T> eVarI;
        Boolean boolInvoke;
        g gVarC;
        boolean z10;
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            e.a<T> aVarT = eVarI.t();
            boolInvoke = block.invoke(aVarT);
            R.e<T> eVarE = aVarT.e();
            if (C3862t.b(eVarE, eVarI)) {
                break;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarE);
                        z10 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return boolInvoke.booleanValue();
    }

    public final void A(int fromIndex, int toIndex) {
        int modification;
        R.e<T> eVarI;
        g gVarC;
        boolean z10;
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            e.a<T> aVarT = eVarI.t();
            aVarT.subList(fromIndex, toIndex).clear();
            R.e<T> eVarE = aVarT.e();
            if (C3862t.b(eVarE, eVarI)) {
                return;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarE);
                        z10 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
    }

    public final int B(Collection<? extends T> elements, int start, int end) {
        int modification;
        R.e<T> eVarI;
        g gVarC;
        boolean z10;
        int size = size();
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            e.a<T> aVarT = eVarI.t();
            aVarT.subList(start, end).retainAll(elements);
            R.e<T> eVarE = aVarT.e();
            if (C3862t.b(eVarE, eVarI)) {
                break;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarE);
                        z10 = true;
                        aVar3.m(aVar3.getModification() + 1);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return size - size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T element) {
        int modification;
        R.e<T> eVarI;
        boolean z10;
        g gVarC;
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            R.e<T> eVarAdd = eVarI.add((R.e<T>) element);
            z10 = false;
            if (C3862t.b(eVarAdd, eVarI)) {
                return false;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarAdd);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z10 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int index, Collection<? extends T> elements) {
        return y(new b(index, elements));
    }

    public final a<T> c() {
        n firstStateRecord = getFirstStateRecord();
        C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (a) j.X((a) firstStateRecord, this);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        g gVarC;
        n firstStateRecord = getFirstStateRecord();
        C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        a aVar = (a) firstStateRecord;
        j.J();
        synchronized (j.I()) {
            gVarC = g.INSTANCE.c();
            a aVar2 = (a) j.h0(aVar, this, gVarC);
            synchronized (Z.h.f19558a) {
                aVar2.l(R.a.a());
                aVar2.m(aVar2.getModification() + 1);
                aVar2.n(aVar2.getStructuralChange() + 1);
            }
        }
        j.Q(gVarC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return c().i().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        return c().i().containsAll(elements);
    }

    @Override // java.util.List
    public T get(int index) {
        return c().i().get(index);
    }

    @Override // Z.k
    public void h(n value) {
        value.g(getFirstStateRecord());
        C3862t.e(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (a) value;
    }

    @Override // Z.k
    /* renamed from: i, reason: from getter */
    public n getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return c().i().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return c().i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return c().i().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new m(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return z(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        int modification;
        R.e<T> eVarI;
        boolean z10;
        g gVarC;
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            R.e<T> eVarRemoveAll = eVarI.removeAll((Collection<? extends T>) elements);
            z10 = false;
            if (C3862t.b(eVarRemoveAll, eVarI)) {
                return false;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarRemoveAll);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z10 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        return y(new c(elements));
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        R.e<T> eVarI;
        g gVarC;
        boolean z10;
        T t10 = get(index);
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            R.e<T> eVar = eVarI.set(index, (int) element);
            if (C3862t.b(eVar, eVarI)) {
                break;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVar);
                        z10 = true;
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return w();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            C1489A0.a("fromIndex or toIndex are out of bounds");
        }
        return new o(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C3853j.a(this);
    }

    public String toString() {
        n firstStateRecord = getFirstStateRecord();
        C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a) j.F((a) firstStateRecord)).i() + ")@" + hashCode();
    }

    public int w() {
        return c().i().size();
    }

    public final int x() {
        n firstStateRecord = getFirstStateRecord();
        C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((a) j.F((a) firstStateRecord)).getStructuralChange();
    }

    public T z(int index) {
        int modification;
        R.e<T> eVarI;
        g gVarC;
        boolean z10;
        T t10 = get(index);
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            R.e<T> eVarO0 = eVarI.o0(index);
            if (C3862t.b(eVarO0, eVarI)) {
                break;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarO0);
                        z10 = true;
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        int modification;
        R.e<T> eVarI;
        boolean z10;
        g gVarC;
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            R.e<T> eVarAddAll = eVarI.addAll(elements);
            z10 = false;
            if (C3862t.b(eVarAddAll, eVarI)) {
                return false;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarAddAll);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z10 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return new m(this, index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int modification;
        R.e<T> eVarI;
        boolean z10;
        g gVarC;
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            R.e<T> eVarRemove = eVarI.remove((R.e<T>) element);
            z10 = false;
            if (C3862t.b(eVarRemove, eVarI)) {
                return false;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarRemove);
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                        z10 = true;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C3853j.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int index, T element) {
        int modification;
        R.e<T> eVarI;
        g gVarC;
        boolean z10;
        do {
            synchronized (Z.h.f19558a) {
                n firstStateRecord = getFirstStateRecord();
                C3862t.e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                a aVar = (a) j.F((a) firstStateRecord);
                modification = aVar.getModification();
                eVarI = aVar.i();
                C4153F c4153f = C4153F.f46609a;
            }
            C3862t.d(eVarI);
            R.e<T> eVarAdd = eVarI.add(index, (int) element);
            if (C3862t.b(eVarAdd, eVarI)) {
                return;
            }
            n firstStateRecord2 = getFirstStateRecord();
            C3862t.e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            a aVar2 = (a) firstStateRecord2;
            j.J();
            synchronized (j.I()) {
                gVarC = g.INSTANCE.c();
                a aVar3 = (a) j.h0(aVar2, this, gVarC);
                synchronized (Z.h.f19558a) {
                    if (aVar3.getModification() == modification) {
                        aVar3.l(eVarAdd);
                        z10 = true;
                        aVar3.n(aVar3.getStructuralChange() + 1);
                        aVar3.m(aVar3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            j.Q(gVarC, this);
        } while (!z10);
    }
}
