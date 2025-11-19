package m8;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: SortedIterables.java */
/* loaded from: classes2.dex */
final class g0 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? U.d() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        l8.m.l(comparator);
        l8.m.l(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof f0)) {
                return false;
            }
            comparator2 = ((f0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
