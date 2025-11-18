package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0000\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"", "", "index", "U", "(Ljava/util/List;I)I", "W", "V", "T", "S", "(Ljava/util/List;)Ljava/util/List;", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes2.dex */
public class z extends C3843y {
    public static <T> List<T> S(List<? extends T> list) {
        C3862t.g(list, "<this>");
        return new U(list);
    }

    public static <T> List<T> T(List<T> list) {
        C3862t.g(list, "<this>");
        return new T(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int U(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= r.o(list)) {
            return r.o(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new Ha.f(0, r.o(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(List<?> list, int i10) {
        return r.o(list) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int W(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new Ha.f(0, list.size()) + "].");
    }
}
