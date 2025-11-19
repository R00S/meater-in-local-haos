package kotlin;

import kotlin.Metadata;
import s.AbstractC4403m;

/* compiled from: IntListExtension.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls/m;", "", "element", "fromIndex", "toIndex", "a", "(Ls/m;III)I", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4727P {
    public static final int a(AbstractC4403m abstractC4403m, int i10, int i11, int i12) {
        if (!(i11 <= i12)) {
            C4736Z.a("fromIndex(" + i11 + ") > toIndex(" + i12 + ')');
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: " + i11);
        }
        if (i12 > abstractC4403m.get_size()) {
            throw new IndexOutOfBoundsException("Index out of range: " + i12);
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iA = abstractC4403m.a(i14);
            if (iA < i10) {
                i11 = i14 + 1;
            } else {
                if (iA <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int b(AbstractC4403m abstractC4403m, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = abstractC4403m.get_size();
        }
        return a(abstractC4403m, i10, i11, i12);
    }
}
