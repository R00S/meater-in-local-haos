package com.facebook.internal.p147s0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C9801m;

/* compiled from: GateKeeperRuntimeCache.kt */
/* renamed from: com.facebook.internal.s0.b */
/* loaded from: classes2.dex */
public final class C5703b {

    /* renamed from: a */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, C5702a>> f14539a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final List<C5702a> m11703a(String str) {
        C9801m.m32346f(str, "appId");
        ConcurrentHashMap<String, C5702a> concurrentHashMap = this.f14539a.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        Iterator<Map.Entry<String, C5702a>> it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m11704b(String str, List<C5702a> list) {
        C9801m.m32346f(str, "appId");
        C9801m.m32346f(list, "gateKeeperList");
        ConcurrentHashMap<String, C5702a> concurrentHashMap = new ConcurrentHashMap<>();
        for (C5702a c5702a : list) {
            concurrentHashMap.put(c5702a.m11701a(), c5702a);
        }
        this.f14539a.put(str, concurrentHashMap);
    }
}
