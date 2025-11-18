package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B+\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "", "", "", "upperSet", "lowerSet", "lowerBound", "", "belowBound", "<init>", "(JJI[I)V", "bit", "", "z", "(I)Z", "D", "(I)Landroidx/compose/runtime/snapshots/i;", "y", "bits", "x", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/i;", "B", "", "iterator", "()Ljava/util/Iterator;", "default", "A", "(I)I", "", "toString", "()Ljava/lang/String;", "J", "C", "I", "E", "[I", "F", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i implements Iterable<Integer>, Ca.a {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    private static final i f22599G = new i(0, 0, 0, null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final long upperSet;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final long lowerSet;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final int lowerBound;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int[] belowBound;

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/i$a;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/i;", "EMPTY", "Landroidx/compose/runtime/snapshots/i;", "a", "()Landroidx/compose/runtime/snapshots/i;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final i a() {
            return i.f22599G;
        }

        private Companion() {
        }
    }

    /* compiled from: SnapshotIdSet.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {295, 300, 307}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTb/j;", "", "Loa/F;", "<anonymous>", "(LTb/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.k implements Ba.p<Tb.j<? super Integer>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: C, reason: collision with root package name */
        Object f22604C;

        /* renamed from: D, reason: collision with root package name */
        int f22605D;

        /* renamed from: E, reason: collision with root package name */
        int f22606E;

        /* renamed from: F, reason: collision with root package name */
        int f22607F;

        /* renamed from: G, reason: collision with root package name */
        private /* synthetic */ Object f22608G;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Tb.j<? super Integer> jVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(jVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = i.this.new b(interfaceC4588d);
            bVar.f22608G = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:19:0x0075). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ab -> B:30:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ca -> B:43:0x00ea). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e8 -> B:42:0x00e9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private i(long j10, long j11, int i10, int[] iArr) {
        this.upperSet = j10;
        this.lowerSet = j11;
        this.lowerBound = i10;
        this.belowBound = iArr;
    }

    public final int A(int i10) {
        int[] iArr = this.belowBound;
        if (iArr != null) {
            return iArr[0];
        }
        long j10 = this.lowerSet;
        if (j10 != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(j10);
        }
        long j11 = this.upperSet;
        return j11 != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(j11) : i10;
    }

    public final i B(i bits) {
        i iVarD;
        i iVar = f22599G;
        if (bits == iVar) {
            return this;
        }
        if (this == iVar) {
            return bits;
        }
        int i10 = bits.lowerBound;
        int i11 = this.lowerBound;
        if (i10 == i11) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new i(this.upperSet | bits.upperSet, this.lowerSet | bits.lowerSet, i11, iArr2);
            }
        }
        int i12 = 0;
        if (this.belowBound == null) {
            int[] iArr3 = this.belowBound;
            if (iArr3 != null) {
                for (int i13 : iArr3) {
                    bits = bits.D(i13);
                }
            }
            if (this.lowerSet != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if ((this.lowerSet & (1 << i14)) != 0) {
                        bits = bits.D(this.lowerBound + i14);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i12 < 64) {
                    if ((this.upperSet & (1 << i12)) != 0) {
                        bits = bits.D(i12 + 64 + this.lowerBound);
                    }
                    i12++;
                }
            }
            return bits;
        }
        int[] iArr4 = bits.belowBound;
        if (iArr4 != null) {
            iVarD = this;
            for (int i15 : iArr4) {
                iVarD = iVarD.D(i15);
            }
        } else {
            iVarD = this;
        }
        if (bits.lowerSet != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                if ((bits.lowerSet & (1 << i16)) != 0) {
                    iVarD = iVarD.D(bits.lowerBound + i16);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i12 < 64) {
                if ((bits.upperSet & (1 << i12)) != 0) {
                    iVarD = iVarD.D(i12 + 64 + bits.lowerBound);
                }
                i12++;
            }
        }
        return iVarD;
    }

    public final i D(int bit) {
        int i10;
        int[] iArrV0;
        int i11 = this.lowerBound;
        int i12 = bit - i11;
        long j10 = 0;
        if (i12 >= 0 && i12 < 64) {
            long j11 = 1 << i12;
            long j12 = this.lowerSet;
            if ((j12 & j11) == 0) {
                return new i(this.upperSet, j12 | j11, i11, this.belowBound);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j13 = 1 << (i12 - 64);
            long j14 = this.upperSet;
            if ((j14 & j13) == 0) {
                return new i(j14 | j13, this.lowerSet, i11, this.belowBound);
            }
        } else if (i12 < 128) {
            int[] iArr = this.belowBound;
            if (iArr == null) {
                return new i(this.upperSet, this.lowerSet, i11, new int[]{bit});
            }
            int iA = Z.f.a(iArr, bit);
            if (iA < 0) {
                int i13 = -(iA + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                C3831l.j(iArr, iArr2, 0, 0, i13);
                C3831l.j(iArr, iArr2, i13 + 1, i13, length);
                iArr2[i13] = bit;
                return new i(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
            }
        } else if (!z(bit)) {
            long j15 = this.upperSet;
            long j16 = this.lowerSet;
            int i14 = this.lowerBound;
            int i15 = ((bit + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j17 = j16;
            long j18 = j15;
            while (true) {
                if (i14 >= i15) {
                    i10 = i14;
                    break;
                }
                if (j17 != j10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.belowBound;
                        if (iArr3 != null) {
                            for (int i16 : iArr3) {
                                arrayList.add(Integer.valueOf(i16));
                            }
                        }
                    }
                    for (int i17 = 0; i17 < 64; i17++) {
                        if (((1 << i17) & j17) != 0) {
                            arrayList.add(Integer.valueOf(i17 + i14));
                        }
                    }
                    j10 = 0;
                }
                if (j18 == j10) {
                    i10 = i15;
                    j17 = j10;
                    break;
                }
                i14 += 64;
                j17 = j18;
                j18 = j10;
            }
            if (arrayList == null || (iArrV0 = r.V0(arrayList)) == null) {
                iArrV0 = this.belowBound;
            }
            return new i(j18, j17, i10, iArrV0).D(bit);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return Tb.k.b(new b(null)).iterator();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(r.x(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        sb2.append(Z.a.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    public final i x(i bits) {
        i iVarY;
        i iVar = f22599G;
        if (bits == iVar) {
            return this;
        }
        if (this == iVar) {
            return iVar;
        }
        int i10 = bits.lowerBound;
        int i11 = this.lowerBound;
        if (i10 == i11) {
            int[] iArr = bits.belowBound;
            int[] iArr2 = this.belowBound;
            if (iArr == iArr2) {
                return new i(this.upperSet & (~bits.upperSet), this.lowerSet & (~bits.lowerSet), i11, iArr2);
            }
        }
        int[] iArr3 = bits.belowBound;
        if (iArr3 != null) {
            iVarY = this;
            for (int i12 : iArr3) {
                iVarY = iVarY.y(i12);
            }
        } else {
            iVarY = this;
        }
        if (bits.lowerSet != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((bits.lowerSet & (1 << i13)) != 0) {
                    iVarY = iVarY.y(bits.lowerBound + i13);
                }
            }
        }
        if (bits.upperSet != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((bits.upperSet & (1 << i14)) != 0) {
                    iVarY = iVarY.y(i14 + 64 + bits.lowerBound);
                }
            }
        }
        return iVarY;
    }

    public final i y(int bit) {
        int[] iArr;
        int iA;
        int i10 = this.lowerBound;
        int i11 = bit - i10;
        if (i11 >= 0 && i11 < 64) {
            long j10 = 1 << i11;
            long j11 = this.lowerSet;
            if ((j11 & j10) != 0) {
                return new i(this.upperSet, j11 & (~j10), i10, this.belowBound);
            }
        } else if (i11 >= 64 && i11 < 128) {
            long j12 = 1 << (i11 - 64);
            long j13 = this.upperSet;
            if ((j13 & j12) != 0) {
                return new i(j13 & (~j12), this.lowerSet, i10, this.belowBound);
            }
        } else if (i11 < 0 && (iArr = this.belowBound) != null && (iA = Z.f.a(iArr, bit)) >= 0) {
            int length = iArr.length;
            int i12 = length - 1;
            if (i12 == 0) {
                return new i(this.upperSet, this.lowerSet, this.lowerBound, null);
            }
            int[] iArr2 = new int[i12];
            if (iA > 0) {
                C3831l.j(iArr, iArr2, 0, 0, iA);
            }
            if (iA < i12) {
                C3831l.j(iArr, iArr2, iA, iA + 1, length);
            }
            return new i(this.upperSet, this.lowerSet, this.lowerBound, iArr2);
        }
        return this;
    }

    public final boolean z(int bit) {
        int[] iArr;
        int i10 = bit - this.lowerBound;
        if (i10 >= 0 && i10 < 64) {
            return ((1 << i10) & this.lowerSet) != 0;
        }
        if (i10 >= 64 && i10 < 128) {
            return ((1 << (i10 - 64)) & this.upperSet) != 0;
        }
        if (i10 <= 0 && (iArr = this.belowBound) != null) {
            return Z.f.a(iArr, bit) >= 0;
        }
        return false;
    }
}
