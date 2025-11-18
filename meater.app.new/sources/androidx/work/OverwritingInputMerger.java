package androidx.work;

import androidx.work.C0706e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC0804k {
    @Override // androidx.work.AbstractC0804k
    /* renamed from: b */
    public C0706e mo4757b(List<C0706e> list) {
        C0706e.a aVar = new C0706e.a();
        HashMap map = new HashMap();
        Iterator<C0706e> it = list.iterator();
        while (it.hasNext()) {
            map.putAll(it.next().m4832i());
        }
        aVar.m4838d(map);
        return aVar.m4835a();
    }
}
