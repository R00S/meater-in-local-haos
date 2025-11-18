package X1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;

/* compiled from: BundleCollectionUtil.java */
/* renamed from: X1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1806c {
    public static <T> AbstractC4009y<T> a(InterfaceC3914g<Bundle, T> interfaceC3914g, List<Bundle> list) {
        AbstractC4009y.a aVarY = AbstractC4009y.y();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarY.a(interfaceC3914g.apply((Bundle) C1804a.e(list.get(i10))));
        }
        return aVarY.k();
    }

    public static <T> ArrayList<Bundle> b(Collection<T> collection, InterfaceC3914g<T, Bundle> interfaceC3914g) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC3914g.apply(it.next()));
        }
        return arrayList;
    }
}
