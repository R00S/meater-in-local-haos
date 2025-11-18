package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzk;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@zzard
@TargetApi(11)
/* loaded from: classes2.dex */
public class zzbia extends zzbha {
    public zzbia(zzbgz zzbgzVar, zzwj zzwjVar, boolean z) {
        super(zzbgzVar, zzwjVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    protected final WebResourceResponse m17730L(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbgz)) {
            zzbad.m17353i("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbgz zzbgzVar = (zzbgz) webView;
        zzavb zzavbVar = this.f23042v;
        if (zzavbVar != null) {
            zzavbVar.mo16969a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.m17678I(str, map);
        }
        if (zzbgzVar.mo14926p() != null) {
            zzbgzVar.mo14926p().mo17682d();
        }
        if (zzbgzVar.mo14925o().m17741e()) {
            str2 = (String) zzyt.m20848e().m16421c(zzacu.f21756b0);
        } else if (zzbgzVar.mo14921m()) {
            str2 = (String) zzyt.m20848e().m16421c(zzacu.f21749a0);
        } else {
            str2 = (String) zzyt.m20848e().m16421c(zzacu.f21742Z);
        }
        zzk.zzlg();
        return zzaxi.m17132L(zzbgzVar.getContext(), zzbgzVar.mo14899b().f22750f, str2);
    }
}
