package com.flurry.sdk;

import com.flurry.sdk.C6113n2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.z4 */
/* loaded from: classes2.dex */
public final class C6215z4 implements InterfaceC6046f7<C6029e> {
    C6215z4() {
    }

    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6029e c6029e) {
        C6029e c6029e2 = c6029e;
        if (c6029e2 == null) {
            C6021d1.m13030c(2, "SessionInfoFrame", "Session info data is null, do not send the frame.");
        } else {
            C6111n0.m13190a();
            int i2 = C6113n2.a.AGENT_REPORT_TYPE_MAIN_DEVICE.f16174j;
            C6110n c6110n = c6029e2.f15805d;
            if (c6110n != null && c6110n.f16150a) {
                i2 = C6113n2.a.AGENT_REPORT_TYPE_INSTANT_APP.f16174j;
            }
            C6104m2.m13180a().m13181b(new C6108m6(new C6117n6(c6029e2.f15802a, i2, c6029e2.f15803b, c6029e2.f15804c)));
        }
        C6021d1.m13030c(4, "SessionInfoObserver", "SessionInfoData".concat(String.valueOf(c6029e2)));
    }
}
