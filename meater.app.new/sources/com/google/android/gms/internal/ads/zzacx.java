package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@zzard
/* loaded from: classes2.dex */
public final class zzacx {

    /* renamed from: a */
    private String f21910a = (String) zzyt.m20848e().m16421c(zzacu.f21784f0);

    /* renamed from: b */
    private Map<String, String> f21911b;

    /* renamed from: c */
    private Context f21912c;

    /* renamed from: d */
    private String f21913d;

    public zzacx(Context context, String str) {
        this.f21912c = null;
        this.f21913d = null;
        this.f21912c = context;
        this.f21913d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f21911b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.f21911b.put("v", "3");
        this.f21911b.put("os", Build.VERSION.RELEASE);
        this.f21911b.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.f21911b;
        zzk.zzlg();
        map.put("device", zzaxi.m17159k0());
        this.f21911b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.f21911b;
        zzk.zzlg();
        map2.put("is_lite_sdk", zzaxi.m17125E(context) ? "1" : "0");
        Future<zzase> futureM16916b = zzk.zzlr().m16916b(this.f21912c);
        try {
            this.f21911b.put("network_coarse", Integer.toString(futureM16916b.get().f22451o));
            this.f21911b.put("network_fine", Integer.toString(futureM16916b.get().f22452p));
        } catch (Exception e2) {
            zzk.zzlk().m17052e(e2, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* renamed from: a */
    final Context m16429a() {
        return this.f21912c;
    }

    /* renamed from: b */
    final String m16430b() {
        return this.f21913d;
    }

    /* renamed from: c */
    final String m16431c() {
        return this.f21910a;
    }

    /* renamed from: d */
    final Map<String, String> m16432d() {
        return this.f21911b;
    }
}
