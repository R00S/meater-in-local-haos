package com.flurry.sdk;

import android.text.TextUtils;

/* renamed from: com.flurry.sdk.k0 */
/* loaded from: classes2.dex */
public final class C6084k0 {

    /* renamed from: a */
    private static C6084k0 f16040a;

    /* renamed from: b */
    public String f16041b;

    /* renamed from: c */
    public String f16042c;

    private C6084k0() {
    }

    /* renamed from: a */
    public static C6084k0 m13141a() {
        if (f16040a == null) {
            f16040a = new C6084k0();
        }
        return f16040a;
    }

    /* renamed from: d */
    private static boolean m13142d() {
        return C6040f1.m13058a() == 0;
    }

    /* renamed from: b */
    public final String m13143b() {
        if (TextUtils.isEmpty(this.f16041b)) {
            m13144c();
        }
        C6021d1.m13030c(3, "APIKeyProvider", "Getting streaming apikey: " + this.f16041b);
        return this.f16041b;
    }

    /* renamed from: c */
    public final void m13144c() {
        if (TextUtils.isEmpty(this.f16041b)) {
            this.f16041b = this.f16042c;
            if (!m13142d()) {
                this.f16041b += "0";
            }
            C6021d1.m13030c(3, "APIKeyProvider", "Generating a streaming apikey: " + this.f16041b);
        }
    }
}
