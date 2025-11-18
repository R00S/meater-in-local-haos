package com.flurry.sdk;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import p241e.p252d.p253a.InterfaceC8779e;

/* renamed from: com.flurry.sdk.h2 */
/* loaded from: classes2.dex */
public final class C6059h2 {

    /* renamed from: a */
    private static boolean f15948a;

    /* renamed from: b */
    private static boolean f15949b;

    /* renamed from: a */
    public static synchronized void m13088a() {
        if (f15948a) {
            return;
        }
        try {
            C6049g1.m13077c(Class.forName("com.flurry.android.bridge.FlurryBridgeModule"));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            C6021d1.m13030c(3, "FlurrySDK", "Ads module not available");
        }
        f15948a = true;
    }

    /* renamed from: b */
    public static synchronized void m13089b(Context context) {
        C6049g1.m13078d(context);
    }

    /* renamed from: c */
    public static synchronized void m13090c(List<InterfaceC8779e> list) {
        if (f15949b) {
            return;
        }
        if (list != null) {
            Iterator<InterfaceC8779e> it = list.iterator();
            while (it.hasNext()) {
                C6049g1.m13076b((InterfaceC6058h1) it.next());
            }
        }
        f15949b = true;
    }
}
