package Ab;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: MemberScope.kt */
/* loaded from: classes3.dex */
public final class m {
    public static final Set<qb.f> a(Iterable<? extends k> iterable) {
        C3862t.g(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends k> it = iterable.iterator();
        while (it.hasNext()) {
            Set<qb.f> setE = it.next().e();
            if (setE == null) {
                return null;
            }
            kotlin.collections.r.D(hashSet, setE);
        }
        return hashSet;
    }
}
