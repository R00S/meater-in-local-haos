package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.d5 */
/* loaded from: classes2.dex */
public final class C6025d5 extends AbstractC6153r6 {
    private C6025d5(InterfaceC6169t6 interfaceC6169t6) {
        super(interfaceC6169t6);
    }

    /* renamed from: h */
    public static void m13045h() {
        String strM13192b = C6111n0.m13190a().m13192b();
        String str = C6111n0.m13190a().f16153b;
        if (TextUtils.isEmpty(str)) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Context contextM12964a = C6002b0.m12964a();
        int i2 = 0;
        try {
            i2 = contextM12964a.getPackageManager().getPackageInfo(contextM12964a.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
        C6104m2.m13180a().m13181b(new C6025d5(new C6035e5(strM13192b, str, String.valueOf(i2), C5995a2.m12952a(C6002b0.m12964a()))));
    }

    @Override // com.flurry.sdk.InterfaceC6177u6
    /* renamed from: a */
    public final EnumC6161s6 mo12961a() {
        return EnumC6161s6.APP_INFO;
    }
}
