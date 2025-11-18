package cm.aptoide.p092pt.dataprovider.util;

import cm.aptoide.p092pt.dataprovider.p097ws.RefreshBody;
import java.util.HashMap;

/* loaded from: classes.dex */
public class HashMapNotNull<K, V> extends HashMap<K, V> implements RefreshBody {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return v != null ? (V) super.put(k2, v) : v;
    }

    @Override // cm.aptoide.p092pt.dataprovider.p097ws.RefreshBody
    public void setRefresh(boolean z) {
    }
}
