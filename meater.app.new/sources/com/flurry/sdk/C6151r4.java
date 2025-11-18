package com.flurry.sdk;

import android.os.Bundle;
import com.flurry.sdk.C6128p;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.flurry.sdk.r4 */
/* loaded from: classes2.dex */
public final class C6151r4 implements InterfaceC6046f7<C6128p> {
    C6151r4() {
    }

    /* renamed from: b */
    private static void m13292b(C6128p c6128p) {
        Bundle bundle;
        Bundle bundle2 = c6128p.f16209b;
        if (bundle2 == null || (bundle = bundle2.getBundle("launch_options")) == null) {
            return;
        }
        C6021d1.m13030c(3, "LifecycleObserver", "Launch Options Bundle is present " + bundle.toString());
        for (String str : bundle.keySet()) {
            if (str != null) {
                Object obj = bundle.get(str);
                String string = obj != null ? obj.toString() : "null";
                ArrayList arrayList = new ArrayList();
                arrayList.add(string);
                if (str.isEmpty()) {
                    C6021d1.m13030c(2, "LaunchOptionsFrame", "Launch option key is empty, do not send the frame.");
                } else if (arrayList.size() == 0) {
                    C6021d1.m13030c(2, "LaunchOptionsFrame", "Launch option values is empty, do not send the frame.");
                } else {
                    C6104m2.m13180a().m13181b(new C6184v5(new C6192w5(str, arrayList)));
                }
                C6021d1.m13030c(3, "LifecycleObserver", "Launch options Key: " + str + ". Its value: " + string);
            }
        }
    }

    @Override // com.flurry.sdk.InterfaceC6046f7
    /* renamed from: a */
    public final /* synthetic */ void mo12962a(C6128p c6128p) {
        Bundle bundle;
        C6128p c6128p2 = c6128p;
        if (C6128p.a.APP_ORIENTATION_CHANGE.equals(c6128p2.f16208a) && (bundle = c6128p2.f16209b) != null && bundle.containsKey("orientation_name")) {
            int i2 = bundle.getInt("orientation_name");
            C6044f5.m13061h(i2);
            C6021d1.m13030c(5, "LifecycleObserver", c6128p2.f16208a.name() + " orientation: " + i2);
        }
        if (C6128p.a.CREATED.equals(c6128p2.f16208a)) {
            m13292b(c6128p2);
        }
    }
}
