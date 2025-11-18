package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.da */
/* loaded from: classes2.dex */
final class RunnableC6592da implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18502f;

    /* renamed from: g */
    private final /* synthetic */ String f18503g;

    /* renamed from: h */
    private final /* synthetic */ int f18504h;

    /* renamed from: i */
    private final /* synthetic */ int f18505i;

    /* renamed from: j */
    private final /* synthetic */ long f18506j;

    /* renamed from: k */
    private final /* synthetic */ long f18507k;

    /* renamed from: l */
    private final /* synthetic */ boolean f18508l;

    /* renamed from: m */
    private final /* synthetic */ int f18509m;

    /* renamed from: n */
    private final /* synthetic */ int f18510n;

    /* renamed from: o */
    private final /* synthetic */ zzbft f18511o;

    RunnableC6592da(zzbft zzbftVar, String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        this.f18511o = zzbftVar;
        this.f18502f = str;
        this.f18503g = str2;
        this.f18504h = i2;
        this.f18505i = i3;
        this.f18506j = j2;
        this.f18507k = j3;
        this.f18508l = z;
        this.f18509m = i4;
        this.f18510n = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.f18502f);
        map.put("cachedSrc", this.f18503g);
        map.put("bytesLoaded", Integer.toString(this.f18504h));
        map.put("totalBytes", Integer.toString(this.f18505i));
        map.put("bufferedDuration", Long.toString(this.f18506j));
        map.put("totalDuration", Long.toString(this.f18507k));
        map.put("cacheReady", this.f18508l ? "1" : "0");
        map.put("playerCount", Integer.toString(this.f18509m));
        map.put("playerPreparedCount", Integer.toString(this.f18510n));
        this.f18511o.m17626r("onPrecacheEvent", map);
    }
}
