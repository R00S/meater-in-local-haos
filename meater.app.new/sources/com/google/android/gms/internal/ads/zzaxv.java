package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes2.dex */
public class zzaxv extends zzaxu {
    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: f */
    public final WebResourceResponse mo17195f(String str, String str2, int i2, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i2, str3, map, inputStream);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: g */
    public final zzbha mo17196g(zzbgz zzbgzVar, zzwj zzwjVar, boolean z) {
        return new zzbib(zzbgzVar, zzwjVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: n */
    public final CookieManager mo17202n(Context context) {
        if (zzaxo.m17189u()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbad.m17347c("Failed to obtain CookieManager.", th);
            zzk.zzlk().m17052e(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: v */
    public final int mo17207v() {
        return R.style.Theme.Material.Dialog.Alert;
    }
}
