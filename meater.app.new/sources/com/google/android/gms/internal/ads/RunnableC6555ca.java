package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ca */
/* loaded from: classes2.dex */
final class RunnableC6555ca implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18424f;

    /* renamed from: g */
    private final /* synthetic */ String f18425g;

    /* renamed from: h */
    private final /* synthetic */ long f18426h;

    /* renamed from: i */
    private final /* synthetic */ long f18427i;

    /* renamed from: j */
    private final /* synthetic */ boolean f18428j;

    /* renamed from: k */
    private final /* synthetic */ int f18429k;

    /* renamed from: l */
    private final /* synthetic */ int f18430l;

    /* renamed from: m */
    private final /* synthetic */ zzbft f18431m;

    RunnableC6555ca(zzbft zzbftVar, String str, String str2, long j2, long j3, boolean z, int i2, int i3) {
        this.f18431m = zzbftVar;
        this.f18424f = str;
        this.f18425g = str2;
        this.f18426h = j2;
        this.f18427i = j3;
        this.f18428j = z;
        this.f18429k = i2;
        this.f18430l = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f18424f);
        map.put("cachedSrc", this.f18425g);
        map.put("bufferedDuration", Long.toString(this.f18426h));
        map.put("totalDuration", Long.toString(this.f18427i));
        map.put("cacheReady", this.f18428j ? "1" : "0");
        map.put("playerCount", Integer.toString(this.f18429k));
        map.put("playerPreparedCount", Integer.toString(this.f18430l));
        this.f18431m.m17626r("onPrecacheEvent", map);
    }
}
