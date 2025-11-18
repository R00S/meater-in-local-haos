package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.C6182v3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p241e.p252d.p253a.EnumC8778d;

/* renamed from: com.flurry.sdk.u3 */
/* loaded from: classes2.dex */
public final class C6174u3 extends AbstractC6153r6 {

    /* renamed from: e */
    private static final AtomicInteger f16406e = new AtomicInteger(0);

    private C6174u3(InterfaceC6169t6 interfaceC6169t6) {
        super(interfaceC6169t6);
    }

    /* renamed from: h */
    public static EnumC8778d m13318h(String str, C6182v3.a aVar, Map<String, String> map, boolean z, boolean z2, long j2, long j3) {
        HashMap map2;
        if (map.size() > 10) {
            map2 = new HashMap();
            map2.put("fl.parameter.limit.exceeded", String.valueOf(map.size()));
            map.clear();
        } else {
            map2 = null;
        }
        C6104m2.m13180a().m13181b(new C6174u3(new C6182v3(C6013c2.m12986b(str), f16406e.incrementAndGet(), aVar, map, map2, new ArrayList(), z, z2, j2, j3)));
        return EnumC8778d.kFlurryEventRecorded;
    }

    /* renamed from: i */
    public static C6174u3 m13319i(String str, int i2, Map<String, String> map, Map<String, String> map2, long j2, long j3) {
        return new C6174u3(new C6182v3(str, i2, C6182v3.a.CUSTOM, map, map2, true, false, j2, SystemClock.elapsedRealtime(), j3));
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: a */
    public final EnumC6161s6 mo12961a() {
        return EnumC6161s6.ANALYTICS_EVENT;
    }
}
