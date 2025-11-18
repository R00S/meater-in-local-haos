package com.flurry.sdk;

import android.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.q4 */
/* loaded from: classes2.dex */
public final class C6142q4 implements InterfaceC6046f7<C6092l> {
    C6142q4() {
    }

    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6092l c6092l) {
        C6092l c6092l2 = c6092l;
        boolean z = c6092l2.f16102b;
        Map<EnumC6101m, String> mapM13171a = c6092l2.m13171a();
        if (mapM13171a == null || mapM13171a.size() == 0) {
            C6021d1.m13030c(2, "ReportedIDFrame", "Reported ids is empty, do not send the frame.");
        } else {
            C6104m2.m13180a().m13181b(new C6072i6(new C6081j6(mapM13171a, z)));
        }
        Map<EnumC6101m, String> mapM13171a2 = c6092l2.m13171a();
        HashMap map = new HashMap();
        for (Map.Entry<EnumC6101m, String> entry : mapM13171a2.entrySet()) {
            if (entry.getKey().equals(EnumC6101m.AndroidInstallationId)) {
                map.put(entry.getKey().name(), C6013c2.m12987c(Base64.decode(entry.getValue(), 2)).toUpperCase(Locale.getDefault()));
            } else {
                map.put(entry.getKey().name(), entry.getValue());
            }
        }
        C6048g0.m13065a();
        C6048g0.m13068f("Reported Ids", map);
        C6021d1.m13030c(4, "IdObserver", "IdProvider" + c6092l2.m13171a());
    }
}
