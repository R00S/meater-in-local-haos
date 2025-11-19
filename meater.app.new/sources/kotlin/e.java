package kotlin;

import Q.b;
import kotlin.InterfaceC0966d;
import kotlin.Metadata;

/* compiled from: IntervalList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "LQ/b;", "LC/d$a;", "", "itemIndex", "b", "(LQ/b;I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int b(b<InterfaceC0966d.a<T>> bVar, int i10) {
        int size = bVar.getSize() - 1;
        int i11 = 0;
        while (i11 < size) {
            int i12 = ((size - i11) / 2) + i11;
            int startIndex = bVar.t()[i12].getStartIndex();
            if (startIndex == i10) {
                return i12;
            }
            if (startIndex < i10) {
                i11 = i12 + 1;
                if (i10 < bVar.t()[i11].getStartIndex()) {
                    return i12;
                }
            } else {
                size = i12 - 1;
            }
        }
        return i11;
    }
}
