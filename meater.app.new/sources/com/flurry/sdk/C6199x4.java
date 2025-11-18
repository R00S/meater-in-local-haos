package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.flurry.sdk.x4 */
/* loaded from: classes2.dex */
public final class C6199x4 implements InterfaceC6046f7<C6210z> {
    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6210z c6210z) {
        C6210z c6210z2 = c6210z;
        String str = c6210z2.f16530a;
        String str2 = c6210z2.f16531b;
        Map map = c6210z2.f16532c;
        if (map == null) {
            map = new HashMap();
        }
        map.put("fl.origin.attribute.version", str2);
        if (map.size() > 10) {
            int size = map.size();
            C6021d1.m13041n("OriginAttributeFrame", "MaxOriginParams exceeded: ".concat(String.valueOf(size)));
            map.clear();
            map.put("fl.parameter.limit.exceeded", String.valueOf(size));
        }
        C6104m2.m13180a().m13181b(new C6008b6(new C6017c6(str, map)));
        C6021d1.m13030c(4, "OriginAttributeObserver", "Origin attribute name: " + c6210z2.f16530a + ". Origin attribute version: " + c6210z2.f16531b + ". Origin attribute params: " + c6210z2.f16532c);
    }
}
