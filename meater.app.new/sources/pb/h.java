package pb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import ob.C4176a;

/* compiled from: JvmNameResolver.kt */
/* loaded from: classes3.dex */
public final class h {
    public static final List<C4176a.e.c> a(List<C4176a.e.c> list) {
        C3862t.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (C4176a.e.c cVar : list) {
            int iG = cVar.G();
            for (int i10 = 0; i10 < iG; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
