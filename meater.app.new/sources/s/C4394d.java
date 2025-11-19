package s;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t.C4532a;

/* compiled from: ArraySet.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Ls/b;", "", "hash", "b", "(Ls/b;I)I", "", "key", "c", "(Ls/b;Ljava/lang/Object;I)I", "d", "(Ls/b;)I", "size", "Loa/F;", "a", "(Ls/b;I)V", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4394d {
    public static final <E> void a(C4392b<E> c4392b, int i10) {
        C3862t.g(c4392b, "<this>");
        c4392b.z(new int[i10]);
        c4392b.y(new Object[i10]);
    }

    public static final <E> int b(C4392b<E> c4392b, int i10) {
        C3862t.g(c4392b, "<this>");
        try {
            return C4532a.a(c4392b.getHashes(), c4392b.w(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(C4392b<E> c4392b, Object obj, int i10) {
        C3862t.g(c4392b, "<this>");
        int iW = c4392b.w();
        if (iW == 0) {
            return -1;
        }
        int iB = b(c4392b, i10);
        if (iB < 0 || C3862t.b(obj, c4392b.getArray()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iW && c4392b.getHashes()[i11] == i10) {
            if (C3862t.b(obj, c4392b.getArray()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && c4392b.getHashes()[i12] == i10; i12--) {
            if (C3862t.b(obj, c4392b.getArray()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final <E> int d(C4392b<E> c4392b) {
        C3862t.g(c4392b, "<this>");
        return c(c4392b, null, 0);
    }
}
