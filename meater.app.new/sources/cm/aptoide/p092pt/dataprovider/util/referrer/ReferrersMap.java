package cm.aptoide.p092pt.dataprovider.util.referrer;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ReferrersMap extends ConcurrentHashMap<String, List<Long>> {
    public void add(String str, long j2) {
        if (j2 == -1) {
            return;
        }
        if (!containsKey(str)) {
            put(str, new LinkedList());
        }
        get(str).add(Long.valueOf(j2));
    }
}
