package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzch extends zzcf<Integer, Object> {

    /* renamed from: b */
    public String f24301b;

    /* renamed from: c */
    public long f24302c;

    /* renamed from: d */
    public String f24303d;

    /* renamed from: e */
    public String f24304e;

    /* renamed from: f */
    public String f24305f;

    public zzch(String str) {
        this();
        mo18718a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: a */
    protected final void mo18718a(String str) {
        HashMap mapM18717b = zzcf.m18717b(str);
        if (mapM18717b != null) {
            this.f24301b = mapM18717b.get(0) == null ? "E" : (String) mapM18717b.get(0);
            this.f24302c = mapM18717b.get(1) == null ? -1L : ((Long) mapM18717b.get(1)).longValue();
            this.f24303d = mapM18717b.get(2) == null ? "E" : (String) mapM18717b.get(2);
            this.f24304e = mapM18717b.get(3) == null ? "E" : (String) mapM18717b.get(3);
            this.f24305f = mapM18717b.get(4) != null ? (String) mapM18717b.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: c */
    protected final HashMap<Integer, Object> mo18719c() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f24301b);
        map.put(4, this.f24305f);
        map.put(3, this.f24304e);
        map.put(2, this.f24303d);
        map.put(1, Long.valueOf(this.f24302c));
        return map;
    }

    public zzch() {
        this.f24301b = "E";
        this.f24302c = -1L;
        this.f24303d = "E";
        this.f24304e = "E";
        this.f24305f = "E";
    }
}
