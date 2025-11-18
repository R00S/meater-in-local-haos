package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzee extends zzcf<Integer, Long> {

    /* renamed from: b */
    public Long f26027b;

    /* renamed from: c */
    public Long f26028c;

    /* renamed from: d */
    public Long f26029d;

    /* renamed from: e */
    public Long f26030e;

    /* renamed from: f */
    public Long f26031f;

    /* renamed from: g */
    public Long f26032g;

    /* renamed from: h */
    public Long f26033h;

    /* renamed from: i */
    public Long f26034i;

    /* renamed from: j */
    public Long f26035j;

    /* renamed from: k */
    public Long f26036k;

    /* renamed from: l */
    public Long f26037l;

    public zzee() {
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: a */
    protected final void mo18718a(String str) {
        HashMap mapM18717b = zzcf.m18717b(str);
        if (mapM18717b != null) {
            this.f26027b = (Long) mapM18717b.get(0);
            this.f26028c = (Long) mapM18717b.get(1);
            this.f26029d = (Long) mapM18717b.get(2);
            this.f26030e = (Long) mapM18717b.get(3);
            this.f26031f = (Long) mapM18717b.get(4);
            this.f26032g = (Long) mapM18717b.get(5);
            this.f26033h = (Long) mapM18717b.get(6);
            this.f26034i = (Long) mapM18717b.get(7);
            this.f26035j = (Long) mapM18717b.get(8);
            this.f26036k = (Long) mapM18717b.get(9);
            this.f26037l = (Long) mapM18717b.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    /* renamed from: c */
    protected final HashMap<Integer, Long> mo18719c() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f26027b);
        map.put(1, this.f26028c);
        map.put(2, this.f26029d);
        map.put(3, this.f26030e);
        map.put(4, this.f26031f);
        map.put(5, this.f26032g);
        map.put(6, this.f26033h);
        map.put(7, this.f26034i);
        map.put(8, this.f26035j);
        map.put(9, this.f26036k);
        map.put(10, this.f26037l);
        return map;
    }

    public zzee(String str) {
        mo18718a(str);
    }
}
