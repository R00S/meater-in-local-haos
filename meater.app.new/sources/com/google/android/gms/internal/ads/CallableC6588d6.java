package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.gms.internal.ads.d6 */
/* loaded from: classes2.dex */
final class CallableC6588d6 implements Callable<String> {

    /* renamed from: f */
    private final /* synthetic */ Context f18493f;

    /* renamed from: g */
    private final /* synthetic */ Context f18494g;

    CallableC6588d6(zzazm zzazmVar, Context context, Context context2) {
        this.f18493f = context;
        this.f18494g = context2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f18493f != null) {
            zzawz.m17082m("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f18493f.getSharedPreferences("admob_user_agent", 0);
        } else {
            zzawz.m17082m("Attempting to read user agent from local cache.");
            sharedPreferences = this.f18494g.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", HttpUrl.FRAGMENT_ENCODE_SET);
        if (TextUtils.isEmpty(string)) {
            zzawz.m17082m("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f18494g);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                zzawz.m17082m("Persisting user agent.");
            }
        }
        return string;
    }
}
