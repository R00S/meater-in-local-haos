package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

@TargetApi(17)
/* loaded from: classes2.dex */
public class zzaxr extends zzaxt {
    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: a */
    public final String mo17190a(Context context) {
        zzazm zzazmVarM17284a = zzazm.m17284a();
        if (TextUtils.isEmpty(zzazmVarM17284a.f22719b)) {
            zzazmVarM17284a.f22719b = ClientLibraryUtils.m14607c() ? (String) zzazl.m17282a(context, new CallableC6551c6(zzazmVarM17284a, context)) : (String) zzazl.m17282a(context, new CallableC6588d6(zzazmVarM17284a, GooglePlayServicesUtilLight.getRemoteContext(context), context));
        }
        return zzazmVarM17284a.f22719b;
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: d */
    public final int mo17193d(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: e */
    public final Drawable mo17194e(Context context, Bitmap bitmap, boolean z, float f2) {
        if (!z || f2 <= 0.0f || f2 > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(f2);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxt, com.google.android.gms.internal.ads.zzaxo
    /* renamed from: k */
    public final boolean mo17200k(Context context, WebSettings webSettings) {
        super.mo17200k(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: m */
    public final void mo17201m(Context context) {
        zzazm zzazmVarM17284a = zzazm.m17284a();
        zzawz.m17082m("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(zzazmVarM17284a.f22719b)) {
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (ClientLibraryUtils.m14607c() || remoteContext == null) {
                SharedPreferences.Editor editorPutString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    editorPutString.apply();
                } else {
                    SharedPreferencesUtils.m14654a(context, editorPutString, "admob_user_agent");
                }
            }
            zzazmVarM17284a.f22719b = defaultUserAgent;
        }
        zzawz.m17082m("User agent is updated.");
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: o */
    public final int mo17203o(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }
}
