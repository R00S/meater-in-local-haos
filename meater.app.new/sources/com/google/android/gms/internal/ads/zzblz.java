package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblz implements zzbls {

    /* renamed from: a */
    private final Context f23207a;

    public zzblz(Context context) {
        this.f23207a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    /* renamed from: a */
    public final void mo17873a(Map<String, String> map) {
        CookieManager cookieManagerMo17202n;
        String str = map.get("cookie");
        if (TextUtils.isEmpty(str) || (cookieManagerMo17202n = zzk.zzli().mo17202n(this.f23207a)) == null) {
            return;
        }
        cookieManagerMo17202n.setCookie("googleads.g.doubleclick.net", str);
    }
}
