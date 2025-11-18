package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "", "d", "()Ljava/util/Set;", "", "elements", "g", "([Ljava/lang/Object;)Ljava/util/Set;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "e", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "f", "(Ljava/util/Set;)Ljava/util/Set;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes2.dex */
public class X extends W {
    public static <T> Set<T> d() {
        return F.f43928B;
    }

    public static <T> LinkedHashSet<T> e(T... elements) {
        C3862t.g(elements, "elements");
        return (LinkedHashSet) C3835p.B0(elements, new LinkedHashSet(M.d(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> f(Set<? extends T> set) {
        C3862t.g(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : V.c(set.iterator().next()) : V.d();
    }

    public static <T> Set<T> g(T... elements) {
        C3862t.g(elements, "elements");
        return C3831l.U0(elements);
    }
}
