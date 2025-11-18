package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbih;
import okhttp3.HttpUrl;

@zzard
@TargetApi(17)
/* loaded from: classes2.dex */
public final class zzbht<WebViewT extends zzbhx & zzbif & zzbih> {

    /* renamed from: a */
    private final zzbhw f23063a;

    /* renamed from: b */
    private final WebViewT f23064b;

    private zzbht(WebViewT webviewt, zzbhw zzbhwVar) {
        this.f23063a = zzbhwVar;
        this.f23064b = webviewt;
    }

    /* renamed from: a */
    public static zzbht<zzbgz> m17713a(final zzbgz zzbgzVar) {
        return new zzbht<>(zzbgzVar, new zzbhw(zzbgzVar) { // from class: com.google.android.gms.internal.ads.hb

            /* renamed from: a */
            private final zzbgz f19067a;

            {
                this.f19067a = zzbgzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbhw
            /* renamed from: a */
            public final void mo15266a(Uri uri) {
                zzbii zzbiiVarMo14926p = this.f19067a.mo14926p();
                if (zzbiiVarMo14926p == null) {
                    zzbad.m17351g("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                } else {
                    zzbiiVarMo14926p.mo17679a(uri);
                }
            }
        });
    }

    /* renamed from: b */
    final /* synthetic */ void m17714b(String str) {
        this.f23063a.mo15266a(Uri.parse(str));
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzawz.m17082m("Click string is empty, not proceeding.");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        zzdh zzdhVarMo14903d = this.f23064b.mo14903d();
        if (zzdhVarMo14903d == null) {
            zzawz.m17082m("Signal utils is empty, ignoring.");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        zzdc zzdcVarM19455f = zzdhVarMo14903d.m19455f();
        if (zzdcVarM19455f == null) {
            zzawz.m17082m("Signals object is empty, ignoring.");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (this.f23064b.getContext() != null) {
            return zzdcVarM19455f.zza(this.f23064b.getContext(), str, this.f23064b.getView(), this.f23064b.mo14897a());
        }
        zzawz.m17082m("Context is null, ignoring.");
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @JavascriptInterface
    public final void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzbad.m17353i("URL is empty, ignoring message");
        } else {
            zzaxi.f22654a.post(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.ib

                /* renamed from: f */
                private final zzbht f19304f;

                /* renamed from: g */
                private final String f19305g;

                {
                    this.f19304f = this;
                    this.f19305g = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19304f.m17714b(this.f19305g);
                }
            });
        }
    }
}
