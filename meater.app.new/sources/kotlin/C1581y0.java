package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import s.C4380B;
import s.C4388J;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b$\u0010*\"\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R-\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003048FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003098F¢\u0006\u0006\u001a\u0004\b5\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"LO/y0;", "", "", "LO/a0;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "d", "(ILjava/lang/Object;)LO/a0;", "keyInfo", "", "h", "(LO/a0;)Z", "from", "to", "Loa/F;", "k", "(II)V", "count", "j", "(III)V", "insertIndex", "i", "(LO/a0;I)V", "group", "newCount", "n", "(II)Z", "m", "(LO/a0;)I", "g", "o", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "e", "()I", "c", "l", "(I)V", "groupIndex", "usedKeys", "Ls/B;", "LO/Q;", "Ls/B;", "groupInfos", "LO/o0;", "f", "Loa/i;", "()Ls/J;", "keyMap", "", "used", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1581y0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<C1528a0> keyInfos;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<C1528a0> usedKeys;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C4380B<C1518Q> groupInfos;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i keyMap;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LO/o0;", "", "LO/a0;", "a", "()Ls/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.y0$a */
    static final class a extends AbstractC3864v implements Ba.a<C1561o0<Object, C1528a0>> {
        a() {
            super(0);
        }

        public final C4388J a() {
            C4388J c4388jK = C1560o.K(C1581y0.this.b().size());
            C1581y0 c1581y0 = C1581y0.this;
            int size = c1581y0.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                C1528a0 c1528a0 = c1581y0.b().get(i10);
                C1561o0.f(c4388jK, C1560o.C(c1528a0), c1528a0);
            }
            return c4388jK;
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C1561o0<Object, C1528a0> invoke() {
            return C1561o0.a(a());
        }
    }

    public C1581y0(List<C1528a0> list, int i10) {
        this.keyInfos = list;
        this.startIndex = i10;
        if (!(i10 >= 0)) {
            C1489A0.a("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        C4380B<C1518Q> c4380b = new C4380B<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C1528a0 c1528a0 = this.keyInfos.get(i11);
            c4380b.t(c1528a0.getLocation(), new C1518Q(i11, nodes, c1528a0.getNodes()));
            nodes += c1528a0.getNodes();
        }
        this.groupInfos = c4380b;
        this.keyMap = C4165j.a(new a());
    }

    /* renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<C1528a0> b() {
        return this.keyInfos;
    }

    public final C4388J c() {
        return ((C1561o0) this.keyMap.getValue()).getMap();
    }

    public final C1528a0 d(int key, Object dataKey) {
        return (C1528a0) C1561o0.e(c(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    /* renamed from: e, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<C1528a0> f() {
        return this.usedKeys;
    }

    public final int g(C1528a0 keyInfo) {
        C1518Q c1518qC = this.groupInfos.c(keyInfo.getLocation());
        if (c1518qC != null) {
            return c1518qC.getNodeIndex();
        }
        return -1;
    }

    public final boolean h(C1528a0 keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void i(C1528a0 keyInfo, int insertIndex) {
        this.groupInfos.t(keyInfo.getLocation(), new C1518Q(-1, insertIndex, 0));
    }

    public final void j(int from, int to, int count) {
        char c10 = 7;
        long j10 = -9187201950435737472L;
        if (from > to) {
            C4380B<C1518Q> c4380b = this.groupInfos;
            Object[] objArr = c4380b.values;
            long[] jArr = c4380b.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & j10) != j10) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j11 & 255) < 128) {
                            C1518Q c1518q = (C1518Q) objArr[(i10 << 3) + i12];
                            int nodeIndex = c1518q.getNodeIndex();
                            if (from <= nodeIndex && nodeIndex < from + count) {
                                c1518q.e((nodeIndex - from) + to);
                            } else if (to <= nodeIndex && nodeIndex < from) {
                                c1518q.e(nodeIndex + count);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                j10 = -9187201950435737472L;
            }
        } else {
            if (to <= from) {
                return;
            }
            C4380B<C1518Q> c4380b2 = this.groupInfos;
            Object[] objArr2 = c4380b2.values;
            long[] jArr2 = c4380b2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j12 = jArr2[i13];
                if ((((~j12) << c10) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j12 & 255) < 128) {
                            C1518Q c1518q2 = (C1518Q) objArr2[(i13 << 3) + i15];
                            int nodeIndex2 = c1518q2.getNodeIndex();
                            if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                                c1518q2.e((nodeIndex2 - from) + to);
                            } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to) {
                                c1518q2.e(nodeIndex2 - count);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i14 != 8) {
                        return;
                    }
                }
                if (i13 == length2) {
                    return;
                }
                i13++;
                c10 = 7;
            }
        }
    }

    public final void k(int from, int to) {
        char c10 = 7;
        long j10 = -9187201950435737472L;
        if (from > to) {
            C4380B<C1518Q> c4380b = this.groupInfos;
            Object[] objArr = c4380b.values;
            long[] jArr = c4380b.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j11 = jArr[i10];
                if ((((~j11) << 7) & j11 & j10) != j10) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((j11 & 255) < 128) {
                            C1518Q c1518q = (C1518Q) objArr[(i10 << 3) + i12];
                            int slotIndex = c1518q.getSlotIndex();
                            if (slotIndex == from) {
                                c1518q.f(to);
                            } else if (to <= slotIndex && slotIndex < from) {
                                c1518q.f(slotIndex + 1);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                j10 = -9187201950435737472L;
            }
        } else {
            if (to <= from) {
                return;
            }
            C4380B<C1518Q> c4380b2 = this.groupInfos;
            Object[] objArr2 = c4380b2.values;
            long[] jArr2 = c4380b2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j12 = jArr2[i13];
                if ((((~j12) << c10) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j12 & 255) < 128) {
                            C1518Q c1518q2 = (C1518Q) objArr2[(i13 << 3) + i15];
                            int slotIndex2 = c1518q2.getSlotIndex();
                            if (slotIndex2 == from) {
                                c1518q2.f(to);
                            } else if (from + 1 <= slotIndex2 && slotIndex2 < to) {
                                c1518q2.f(slotIndex2 - 1);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i14 != 8) {
                        return;
                    }
                }
                if (i13 == length2) {
                    return;
                }
                i13++;
                c10 = 7;
            }
        }
    }

    public final void l(int i10) {
        this.groupIndex = i10;
    }

    public final int m(C1528a0 keyInfo) {
        C1518Q c1518qC = this.groupInfos.c(keyInfo.getLocation());
        if (c1518qC != null) {
            return c1518qC.getSlotIndex();
        }
        return -1;
    }

    public final boolean n(int group, int newCount) {
        int nodeIndex;
        C1518Q c1518qC = this.groupInfos.c(group);
        if (c1518qC == null) {
            return false;
        }
        int nodeIndex2 = c1518qC.getNodeIndex();
        int nodeCount = newCount - c1518qC.getNodeCount();
        c1518qC.d(newCount);
        if (nodeCount == 0) {
            return true;
        }
        C4380B<C1518Q> c4380b = this.groupInfos;
        Object[] objArr = c4380b.values;
        long[] jArr = c4380b.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        C1518Q c1518q = (C1518Q) objArr[(i10 << 3) + i12];
                        if (c1518q.getNodeIndex() >= nodeIndex2 && !C3862t.b(c1518q, c1518qC) && (nodeIndex = c1518q.getNodeIndex() + nodeCount) >= 0) {
                            c1518q.e(nodeIndex);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final int o(C1528a0 keyInfo) {
        C1518Q c1518qC = this.groupInfos.c(keyInfo.getLocation());
        return c1518qC != null ? c1518qC.getNodeCount() : keyInfo.getNodes();
    }
}
