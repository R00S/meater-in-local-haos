package ib;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C3862t;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, C3674h> f43276a;

    public j0(Map<Integer, C3674h> map) {
        C3862t.g(map, "map");
        this.f43276a = map;
    }

    public final j0 a() {
        Map<Integer, C3674h> map = this.f43276a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.M.d(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), C3674h.c((C3674h) entry.getValue(), null, null, false, true, 7, null));
        }
        return new j0(linkedHashMap);
    }

    public final Map<Integer, C3674h> b() {
        return this.f43276a;
    }
}
