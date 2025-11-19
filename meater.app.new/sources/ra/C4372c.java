package ra;

import Ba.l;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0002\u0010\u000e\u001a-\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "e", "(Ljava/lang/Object;Ljava/lang/Object;[LBa/l;)I", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "([LBa/l;)Ljava/util/Comparator;", "f", "()Ljava/util/Comparator;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: ra.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4372c {
    public static <T> Comparator<T> b(final l<? super T, ? extends Comparable<?>>... selectors) {
        C3862t.g(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: ra.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C4372c.c(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(l[] lVarArr, Object obj, Object obj2) {
        return e(obj, obj2, lVarArr);
    }

    public static <T extends Comparable<?>> int d(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    private static final <T> int e(T t10, T t11, l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int iD = C4370a.d(lVar.invoke(t10), lVar.invoke(t11));
            if (iD != 0) {
                return iD;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> f() {
        C4375f c4375f = C4375f.f48497B;
        C3862t.e(c4375f, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return c4375f;
    }
}
