package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.fa */
/* loaded from: classes2.dex */
final class RunnableC6666fa implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18871f;

    /* renamed from: g */
    private final /* synthetic */ String f18872g;

    /* renamed from: h */
    private final /* synthetic */ long f18873h;

    /* renamed from: i */
    private final /* synthetic */ zzbft f18874i;

    RunnableC6666fa(zzbft zzbftVar, String str, String str2, long j2) {
        this.f18874i = zzbftVar;
        this.f18871f = str;
        this.f18872g = str2;
        this.f18873h = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f18871f);
        map.put("cachedSrc", this.f18872g);
        map.put("totalDuration", Long.toString(this.f18873h));
        this.f18874i.m17626r("onPrecacheEvent", map);
    }
}
