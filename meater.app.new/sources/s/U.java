package s;

import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0011\"\u0014\u0010\u0017\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016\"\"\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a*\f\b\u0000\u0010\u001d\"\u00020\u001c2\u00020\u001c*\f\b\u0000\u0010\u001e\"\u00020\u001c2\u00020\u001c*\f\b\u0000\u0010\u001f\"\u00020\u001c2\u00020\u001c¨\u0006 "}, d2 = {"K", "V", "Ls/J;", "d", "()Ls/J;", "", "metadata", "", "capacity", "Loa/F;", "a", "([JI)V", "start", "end", "b", "([JII)I", "e", "(I)I", "n", "f", "c", "g", "[J", "EmptyGroup", "", "", "Ls/J;", "EmptyScatterMap", "", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f48663a = {-9187201950435737345L, -1};

    /* renamed from: b, reason: collision with root package name */
    private static final C4388J f48664b = new C4388J(0);

    public static final void a(long[] metadata, int i10) {
        C3862t.g(metadata, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = metadata[i12] & (-9187201950435737472L);
            metadata[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iB0 = C3831l.b0(metadata);
        int i13 = iB0 - 1;
        metadata[i13] = (metadata[i13] & 72057594037927935L) | (-72057594037927936L);
        metadata[iB0] = metadata[0];
    }

    public static final int b(long[] metadata, int i10, int i11) {
        C3862t.g(metadata, "metadata");
        while (i10 < i11) {
            if (((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int c(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    public static final <K, V> C4388J<K, V> d() {
        return new C4388J<>(0, 1, null);
    }

    public static final int e(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int f(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    public static final int g(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return i10 + ((i10 - 1) / 7);
    }
}
