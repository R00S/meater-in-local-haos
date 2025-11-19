package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u0006\u001a1\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0013\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0013\u0010\u0012\u001a;\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u0019\u001a1\u0010\u001c\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"T", "", "", "elements", "", "D", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "", "E", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "F", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "O", "", "Lkotlin/Function1;", "predicate", "I", "(Ljava/lang/Iterable;LBa/l;)Z", "N", "predicateResultToRemove", "G", "(Ljava/lang/Iterable;LBa/l;Z)Z", "", "K", "(Ljava/util/List;)Ljava/lang/Object;", "L", "M", "J", "(Ljava/util/List;LBa/l;)Z", "H", "(Ljava/util/List;LBa/l;Z)Z", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3843y extends C3842x {
    public static <T> boolean D(Collection<? super T> collection, Iterable<? extends T> elements) {
        C3862t.g(collection, "<this>");
        C3862t.g(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean E(Collection<? super T> collection, T[] elements) {
        C3862t.g(collection, "<this>");
        C3862t.g(elements, "elements");
        return collection.addAll(C3831l.e(elements));
    }

    public static final <T> Collection<T> F(Iterable<? extends T> iterable) {
        C3862t.g(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = r.W0(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean G(Iterable<? extends T> iterable, Ba.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final <T> boolean H(List<T> list, Ba.l<? super T, Boolean> lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            C3862t.e(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return G(kotlin.jvm.internal.W.b(list), lVar, z10);
        }
        int iO = r.o(list);
        if (iO >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t10 = list.get(i11);
                if (lVar.invoke(t10).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iO2 = r.o(list);
        if (i10 > iO2) {
            return true;
        }
        while (true) {
            list.remove(iO2);
            if (iO2 == i10) {
                return true;
            }
            iO2--;
        }
    }

    public static <T> boolean I(Iterable<? extends T> iterable, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(iterable, "<this>");
        C3862t.g(predicate, "predicate");
        return G(iterable, predicate, true);
    }

    public static <T> boolean J(List<T> list, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(list, "<this>");
        C3862t.g(predicate, "predicate");
        return H(list, predicate, true);
    }

    public static <T> T K(List<T> list) {
        C3862t.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static <T> T L(List<T> list) {
        C3862t.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T M(List<T> list) {
        C3862t.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(r.o(list));
    }

    public static <T> boolean N(Iterable<? extends T> iterable, Ba.l<? super T, Boolean> predicate) {
        C3862t.g(iterable, "<this>");
        C3862t.g(predicate, "predicate");
        return G(iterable, predicate, false);
    }

    public static final <T> boolean O(Collection<? super T> collection, Iterable<? extends T> elements) {
        C3862t.g(collection, "<this>");
        C3862t.g(elements, "elements");
        return collection.retainAll(F(elements));
    }
}
