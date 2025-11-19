package Ib;

import Hb.AbstractC1082f0;
import Hb.G;
import Hb.K;
import Hb.N;
import Hb.P0;
import Hb.X;
import Hb.Y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;

/* compiled from: IntersectionType.kt */
/* renamed from: Ib.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1202d {
    public static final P0 a(Collection<? extends P0> types) {
        AbstractC1082f0 abstractC1082f0W0;
        C3862t.g(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (P0) kotlin.collections.r.I0(types);
        }
        Collection<? extends P0> collection = types;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collection, 10));
        boolean z10 = false;
        boolean z11 = false;
        for (P0 p02 : collection) {
            z10 = z10 || Y.a(p02);
            if (p02 instanceof AbstractC1082f0) {
                abstractC1082f0W0 = (AbstractC1082f0) p02;
            } else {
                if (!(p02 instanceof K)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (G.a(p02)) {
                    return p02;
                }
                abstractC1082f0W0 = ((K) p02).W0();
                z11 = true;
            }
            arrayList.add(abstractC1082f0W0);
        }
        if (z10) {
            return Jb.l.d(Jb.k.f7745W0, types.toString());
        }
        if (!z11) {
            return B.f6969a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(N.d((P0) it.next()));
        }
        B b10 = B.f6969a;
        return X.e(b10.d(arrayList), b10.d(arrayList2));
    }
}
