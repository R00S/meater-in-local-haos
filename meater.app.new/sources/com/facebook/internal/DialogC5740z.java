package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.internal.DialogC5700r0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FacebookWebFallbackDialog.kt */
/* renamed from: com.facebook.internal.z */
/* loaded from: classes2.dex */
public final class DialogC5740z extends DialogC5700r0 {

    /* renamed from: v */
    public static final a f14649v = new a(null);

    /* renamed from: w */
    private static final String f14650w = DialogC5740z.class.getName();

    /* renamed from: x */
    private boolean f14651x;

    /* compiled from: FacebookWebFallbackDialog.kt */
    /* renamed from: com.facebook.internal.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final DialogC5740z m11831a(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
            C9801m.m32346f(context, "context");
            C9801m.m32346f(str, "url");
            C9801m.m32346f(str2, "expectedRedirectUrl");
            DialogC5700r0.b bVar = DialogC5700r0.f14506f;
            DialogC5700r0.m11667p(context);
            return new DialogC5740z(context, str, str2, null);
        }
    }

    private DialogC5740z(Context context, String str, String str2) {
        super(context, str);
        m11672A(str2);
    }

    public /* synthetic */ DialogC5740z(Context context, String str, String str2, C9789g c9789g) {
        this(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m11829E(DialogC5740z dialogC5740z) {
        C9801m.m32346f(dialogC5740z, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.DialogC5700r0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webViewM11674o = m11674o();
        if (!m11676r() || m11675q() || webViewM11674o == null || !webViewM11674o.isShown()) {
            super.cancel();
        } else {
            if (this.f14651x) {
                return;
            }
            this.f14651x = true;
            webViewM11674o.loadUrl(C9801m.m32354n("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    DialogC5740z.m11829E(this.f14363f);
                }
            }, 1500L);
        }
    }

    @Override // com.facebook.internal.DialogC5700r0
    /* renamed from: w */
    public Bundle mo11677w(String str) {
        Uri uri = Uri.parse(str);
        C5696p0 c5696p0 = C5696p0.f14478a;
        Bundle bundleM11585o0 = C5696p0.m11585o0(uri.getQuery());
        String string = bundleM11585o0.getString("bridge_args");
        bundleM11585o0.remove("bridge_args");
        if (!C5696p0.m11557a0(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                C5701s c5701s = C5701s.f14535a;
                bundleM11585o0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C5701s.m11699a(jSONObject));
            } catch (JSONException e2) {
                C5696p0 c5696p02 = C5696p0.f14478a;
                C5696p0.m11577k0(f14650w, "Unable to parse bridge_args JSON", e2);
            }
        }
        String string2 = bundleM11585o0.getString("method_results");
        bundleM11585o0.remove("method_results");
        C5696p0 c5696p03 = C5696p0.f14478a;
        if (!C5696p0.m11557a0(string2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(string2);
                C5701s c5701s2 = C5701s.f14535a;
                bundleM11585o0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C5701s.m11699a(jSONObject2));
            } catch (JSONException e3) {
                C5696p0 c5696p04 = C5696p0.f14478a;
                C5696p0.m11577k0(f14650w, "Unable to parse bridge_args JSON", e3);
            }
        }
        bundleM11585o0.remove("version");
        C5686k0 c5686k0 = C5686k0.f14437a;
        bundleM11585o0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", C5686k0.m11477s());
        return bundleM11585o0;
    }
}
