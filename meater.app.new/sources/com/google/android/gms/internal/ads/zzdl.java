package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzdl extends zzcf<Integer, Long> {

    /* renamed from: b */
    public long f25641b;

    /* renamed from: c */
    public long f25642c;

    public zzdl() {
        this.f25641b = -1L;
        this.f25642c = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: a */
    protected final void mo18718a(String str) {
        HashMap mapM18717b = zzcf.m18717b(str);
        if (mapM18717b != null) {
            this.f25641b = ((Long) mapM18717b.get(0)).longValue();
            this.f25642c = ((Long) mapM18717b.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: c */
    protected final HashMap<Integer, Long> mo18719c() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, Long.valueOf(this.f25641b));
        map.put(1, Long.valueOf(this.f25642c));
        return map;
    }

    public zzdl(String str) {
        this();
        mo18718a(str);
    }
}
