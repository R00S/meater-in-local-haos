package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ea */
/* loaded from: classes2.dex */
final class RunnableC6629ea implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f18740f;

    /* renamed from: g */
    private final /* synthetic */ String f18741g;

    /* renamed from: h */
    private final /* synthetic */ int f18742h;

    /* renamed from: i */
    private final /* synthetic */ zzbft f18743i;

    RunnableC6629ea(zzbft zzbftVar, String str, String str2, int i2) {
        this.f18743i = zzbftVar;
        this.f18740f = str;
        this.f18741g = str2;
        this.f18742h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.f18740f);
        map.put("cachedSrc", this.f18741g);
        map.put("totalBytes", Integer.toString(this.f18742h));
        this.f18743i.m17626r("onPrecacheEvent", map);
    }
}
