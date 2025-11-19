package Qb;

import Ab.k;
import Rb.k;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C3862t;

/* compiled from: scopeUtils.kt */
/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C3862t.g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final k<Ab.k> b(Iterable<? extends Ab.k> scopes) {
        C3862t.g(scopes, "scopes");
        k<Ab.k> kVar = new k<>();
        for (Ab.k kVar2 : scopes) {
            Ab.k kVar3 = kVar2;
            if (kVar3 != null && kVar3 != k.b.f1150b) {
                kVar.add(kVar2);
            }
        }
        return kVar;
    }
}
