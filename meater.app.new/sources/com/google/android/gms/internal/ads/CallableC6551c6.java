package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.c6 */
/* loaded from: classes2.dex */
final class CallableC6551c6 implements Callable<String> {

    /* renamed from: f */
    private final /* synthetic */ Context f18409f;

    CallableC6551c6(zzazm zzazmVar, Context context) {
        this.f18409f = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences = this.f18409f.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", HttpUrl.FRAGMENT_ENCODE_SET);
        if (!TextUtils.isEmpty(string)) {
            zzawz.m17082m("User agent is already initialized on Google Play Services.");
            return string;
        }
        zzawz.m17082m("User agent is not initialized on Google Play Services. Initializing.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f18409f);
        SharedPreferencesUtils.m14654a(this.f18409f, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}
