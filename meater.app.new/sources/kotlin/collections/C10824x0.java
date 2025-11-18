package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sets.kt */
@Metadata(m32266d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, m32267d2 = {"minus", HttpUrl.FRAGMENT_ENCODE_SET, "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.w.x0 */
/* loaded from: classes2.dex */
public class C10824x0 extends C10822w0 {
    /* renamed from: j */
    public static <T> Set<T> m38923j(Set<? extends T> set, Iterable<? extends T> iterable) {
        C9801m.m32346f(set, "<this>");
        C9801m.m32346f(iterable, "elements");
        Collection<?> collectionM38788a = C10807p.m38788a(iterable, set);
        if (collectionM38788a.isEmpty()) {
            return C10782c0.m38574I0(set);
        }
        if (!(collectionM38788a instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionM38788a);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t : set) {
            if (!collectionM38788a.contains(t)) {
                linkedHashSet2.add(t);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: k */
    public static <T> Set<T> m38924k(Set<? extends T> set, T t) {
        C9801m.m32346f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10808p0.m38793e(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && C9801m.m32341a(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: l */
    public static <T> Set<T> m38925l(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        C9801m.m32346f(set, "<this>");
        C9801m.m32346f(iterable, "elements");
        Integer numM38912v = C10819v.m38912v(iterable);
        if (numM38912v != null) {
            size = set.size() + numM38912v.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10808p0.m38793e(size));
        linkedHashSet.addAll(set);
        C10827z.m38933z(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: m */
    public static <T> Set<T> m38926m(Set<? extends T> set, T t) {
        C9801m.m32346f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10808p0.m38793e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}
