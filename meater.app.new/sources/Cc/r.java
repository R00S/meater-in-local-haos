package Cc;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC3822c;
import kotlin.jvm.internal.C3854k;

/* compiled from: Options.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001bB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"LCc/r;", "Lkotlin/collections/c;", "LCc/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([LCc/h;[I)V", "", "index", "h", "(I)LCc/h;", "B", "[LCc/h;", "i", "()[LCc/h;", "C", "[I", "j", "()[I", "getSize", "()I", "size", "D", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r extends AbstractC3822c<h> implements RandomAccess {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final h[] byteStrings;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final int[] trie;

    /* compiled from: Options.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LCc/r$a;", "", "<init>", "()V", "", "nodeOffset", "LCc/e;", "node", "", "byteStringOffset", "", "LCc/h;", "byteStrings", "fromIndex", "toIndex", "indexes", "Loa/F;", "a", "(JLCc/e;ILjava/util/List;IILjava/util/List;)V", "", "LCc/r;", "d", "([LCc/h;)LCc/r;", "c", "(LCc/e;)J", "intCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cc.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final void a(long nodeOffset, C0982e node, int byteStringOffset, List<? extends h> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
            int i10;
            int i11;
            int i12;
            int i13;
            C0982e c0982e;
            int i14 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i15 = fromIndex; i15 < toIndex; i15++) {
                if (byteStrings.get(i15).J() < i14) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = byteStrings.get(fromIndex);
            h hVar2 = byteStrings.get(toIndex - 1);
            int i16 = -1;
            if (i14 == hVar.J()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i17 = fromIndex + 1;
                h hVar3 = byteStrings.get(i17);
                i10 = i17;
                i11 = iIntValue;
                hVar = hVar3;
            } else {
                i10 = fromIndex;
                i11 = -1;
            }
            if (hVar.t(i14) == hVar2.t(i14)) {
                int iMin = Math.min(hVar.J(), hVar2.J());
                int i18 = 0;
                for (int i19 = i14; i19 < iMin && hVar.t(i19) == hVar2.t(i19); i19++) {
                    i18++;
                }
                long jC = nodeOffset + c(node) + 2 + i18 + 1;
                node.U(-i18);
                node.U(i11);
                int i20 = i18 + i14;
                while (i14 < i20) {
                    node.U(hVar.t(i14) & 255);
                    i14++;
                }
                if (i10 + 1 == toIndex) {
                    if (i20 != byteStrings.get(i10).J()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.U(indexes.get(i10).intValue());
                    return;
                } else {
                    C0982e c0982e2 = new C0982e();
                    node.U(((int) (c(c0982e2) + jC)) * (-1));
                    a(jC, c0982e2, i20, byteStrings, i10, toIndex, indexes);
                    node.S(c0982e2);
                    return;
                }
            }
            int i21 = 1;
            for (int i22 = i10 + 1; i22 < toIndex; i22++) {
                if (byteStrings.get(i22 - 1).t(i14) != byteStrings.get(i22).t(i14)) {
                    i21++;
                }
            }
            long jC2 = nodeOffset + c(node) + 2 + (i21 * 2);
            node.U(i21);
            node.U(i11);
            for (int i23 = i10; i23 < toIndex; i23++) {
                byte bT = byteStrings.get(i23).t(i14);
                if (i23 == i10 || bT != byteStrings.get(i23 - 1).t(i14)) {
                    node.U(bT & 255);
                }
            }
            C0982e c0982e3 = new C0982e();
            while (i10 < toIndex) {
                byte bT2 = byteStrings.get(i10).t(i14);
                int i24 = i10 + 1;
                int i25 = i24;
                while (true) {
                    if (i25 >= toIndex) {
                        i12 = toIndex;
                        break;
                    } else {
                        if (bT2 != byteStrings.get(i25).t(i14)) {
                            i12 = i25;
                            break;
                        }
                        i25++;
                    }
                }
                if (i24 == i12 && i14 + 1 == byteStrings.get(i10).J()) {
                    node.U(indexes.get(i10).intValue());
                    i13 = i12;
                    c0982e = c0982e3;
                } else {
                    node.U(((int) (jC2 + c(c0982e3))) * i16);
                    i13 = i12;
                    c0982e = c0982e3;
                    a(jC2, c0982e3, i14 + 1, byteStrings, i10, i12, indexes);
                }
                c0982e3 = c0982e;
                i10 = i13;
                i16 = -1;
            }
            node.S(c0982e3);
        }

        static /* synthetic */ void b(Companion companion, long j10, C0982e c0982e, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            companion.a((i13 & 1) != 0 ? 0L : j10, c0982e, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C0982e c0982e) {
            return c0982e.getSize() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final Cc.r d(Cc.h... r17) {
            /*
                Method dump skipped, instructions count: 290
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Cc.r.Companion.d(Cc.h[]):Cc.r");
        }

        private Companion() {
        }
    }

    public /* synthetic */ r(h[] hVarArr, int[] iArr, C3854k c3854k) {
        this(hVarArr, iArr);
    }

    public static final r y(h... hVarArr) {
        return INSTANCE.d(hVarArr);
    }

    public /* bridge */ boolean c(h hVar) {
        return super.contains(hVar);
    }

    @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return c((h) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC3822c, kotlin.collections.AbstractC3820a
    /* renamed from: getSize */
    public int get_size() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public h get(int index) {
        return this.byteStrings[index];
    }

    /* renamed from: i, reason: from getter */
    public final h[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return w((h) obj);
        }
        return -1;
    }

    /* renamed from: j, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // kotlin.collections.AbstractC3822c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return x((h) obj);
        }
        return -1;
    }

    public /* bridge */ int w(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int x(h hVar) {
        return super.lastIndexOf(hVar);
    }

    private r(h[] hVarArr, int[] iArr) {
        this.byteStrings = hVarArr;
        this.trie = iArr;
    }
}
