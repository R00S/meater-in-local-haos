package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C5641a0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: InstagramCustomTab.kt */
/* renamed from: com.facebook.internal.f0 */
/* loaded from: classes2.dex */
public final class C5676f0 extends C5731u {

    /* renamed from: c */
    public static final a f14415c = new a(null);

    /* compiled from: InstagramCustomTab.kt */
    /* renamed from: com.facebook.internal.f0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final Uri m11434a(String str, Bundle bundle) {
            C9801m.m32346f(str, "action");
            if (C9801m.m32341a(str, "oauth")) {
                C5696p0 c5696p0 = C5696p0.f14478a;
                C5692n0 c5692n0 = C5692n0.f14464a;
                return C5696p0.m11564e(C5692n0.m11520k(), "oauth/authorize", bundle);
            }
            C5696p0 c5696p02 = C5696p0.f14478a;
            C5692n0 c5692n02 = C5692n0.f14464a;
            String strM11520k = C5692n0.m11520k();
            StringBuilder sb = new StringBuilder();
            C5641a0 c5641a0 = C5641a0.f14199a;
            sb.append(C5641a0.m11295n());
            sb.append("/dialog/");
            sb.append(str);
            return C5696p0.m11564e(strM11520k, sb.toString(), bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5676f0(String str, Bundle bundle) {
        super(str, bundle);
        C9801m.m32346f(str, "action");
        m11799b(f14415c.m11434a(str, bundle == null ? new Bundle() : bundle));
    }
}
