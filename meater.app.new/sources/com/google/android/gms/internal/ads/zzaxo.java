package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;
import okhttp3.HttpUrl;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public class zzaxo {
    private zzaxo() {
    }

    /* renamed from: l */
    public static boolean m17186l(zzbgz zzbgzVar) {
        if (zzbgzVar == null) {
            return false;
        }
        zzbgzVar.onPause();
        return true;
    }

    /* renamed from: p */
    public static boolean m17187p(zzbgz zzbgzVar) {
        if (zzbgzVar == null) {
            return false;
        }
        zzbgzVar.onResume();
        return true;
    }

    /* renamed from: q */
    public static zzaxo m17188q(int i2) {
        return i2 >= 28 ? new zzaxy() : i2 >= 26 ? new zzaxx() : i2 >= 24 ? new zzaxw() : i2 >= 21 ? new zzaxv() : i2 >= 19 ? new zzaxu() : i2 >= 18 ? new zzaxs() : i2 >= 17 ? new zzaxr() : i2 >= 16 ? new zzaxt() : new zzaxo();
    }

    /* renamed from: u */
    public static boolean m17189u() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    /* renamed from: a */
    public String mo17190a(Context context) {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: b */
    public boolean mo17191b(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: c */
    public void mo17192c(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: d */
    public int mo17193d(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    /* renamed from: e */
    public Drawable mo17194e(Context context, Bitmap bitmap, boolean z, float f2) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: f */
    public WebResourceResponse mo17195f(String str, String str2, int i2, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: g */
    public zzbha mo17196g(zzbgz zzbgzVar, zzwj zzwjVar, boolean z) {
        return new zzbhz(zzbgzVar, zzwjVar, z);
    }

    /* renamed from: h */
    public zzwx mo17197h(Context context, TelephonyManager telephonyManager) {
        return zzwx.ENUM_UNKNOWN;
    }

    /* renamed from: i */
    public void mo17198i(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: j */
    public boolean mo17199j(Activity activity, Configuration configuration) {
        return false;
    }

    /* renamed from: k */
    public boolean mo17200k(final Context context, final WebSettings webSettings) {
        return ((Boolean) zzazl.m17282a(context, new Callable(context, webSettings) { // from class: com.google.android.gms.internal.ads.j5

            /* renamed from: f */
            private final Context f19458f;

            /* renamed from: g */
            private final WebSettings f19459g;

            {
                this.f19458f = context;
                this.f19459g = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.f19458f;
                WebSettings webSettings2 = this.f19459g;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* renamed from: m */
    public void mo17201m(Context context) {
    }

    /* renamed from: n */
    public CookieManager mo17202n(Context context) {
        if (m17189u()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbad.m17347c("Failed to obtain CookieManager.", th);
            zzk.zzlk().m17052e(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: o */
    public int mo17203o(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    /* renamed from: r */
    public void mo17204r(Activity activity) {
    }

    /* renamed from: s */
    public int mo17205s() {
        return 5;
    }

    /* renamed from: t */
    public ViewGroup.LayoutParams mo17206t() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: v */
    public int mo17207v() {
        return 1;
    }
}
