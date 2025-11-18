package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzdx extends zzcf<Integer, Long> {

    /* renamed from: b */
    public Long f26005b;

    /* renamed from: c */
    public Long f26006c;

    public zzdx() {
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: a */
    protected final void mo18718a(String str) {
        HashMap mapM18717b = zzcf.m18717b(str);
        if (mapM18717b != null) {
            this.f26005b = (Long) mapM18717b.get(0);
            this.f26006c = (Long) mapM18717b.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: c */
    protected final HashMap<Integer, Long> mo18719c() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f26005b);
        map.put(1, this.f26006c);
        return map;
    }

    public zzdx(String str) {
        mo18718a(str);
    }
}
