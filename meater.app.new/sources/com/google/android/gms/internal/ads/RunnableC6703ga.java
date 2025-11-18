package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ga */
/* loaded from: classes2.dex */
final class RunnableC6703ga implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18955f;

    /* renamed from: g */
    private final /* synthetic */ String f18956g;

    /* renamed from: h */
    private final /* synthetic */ String f18957h;

    /* renamed from: i */
    private final /* synthetic */ String f18958i;

    /* renamed from: j */
    private final /* synthetic */ zzbft f18959j;

    RunnableC6703ga(zzbft zzbftVar, String str, String str2, String str3, String str4) {
        this.f18959j = zzbftVar;
        this.f18955f = str;
        this.f18956g = str2;
        this.f18957h = str3;
        this.f18958i = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.f18955f);
        if (!TextUtils.isEmpty(this.f18956g)) {
            map.put("cachedSrc", this.f18956g);
        }
        zzbft zzbftVar = this.f18959j;
        map.put("type", zzbft.m17623A(this.f18957h));
        map.put("reason", this.f18957h);
        if (!TextUtils.isEmpty(this.f18958i)) {
            map.put("message", this.f18958i);
        }
        this.f18959j.m17626r("onPrecacheEvent", map);
    }
}
