package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* loaded from: classes2.dex */
public class zzbpc {

    /* renamed from: a */
    protected zzcxu f23439a;

    /* renamed from: b */
    protected zzcxm f23440b;

    /* renamed from: c */
    protected zzbry f23441c;

    /* renamed from: d */
    protected zzbso f23442d;

    /* renamed from: e */
    protected String f23443e;

    /* renamed from: e */
    private static String m18225e(zzcxm zzcxmVar) {
        try {
            return zzcxmVar.f25261s.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo18226a() {
        this.f23441c.m18306i0(null);
    }

    /* renamed from: b */
    public final String m18227b() {
        return this.f23443e;
    }

    /* renamed from: c */
    public void mo16095c() {
        this.f23442d.onAdLoaded();
    }

    /* renamed from: d */
    public final zzbry m18228d() {
        return this.f23441c;
    }

    /* renamed from: f */
    public final String m18229f() {
        String strM18225e = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(this.f23443e) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(this.f23443e) ? m18225e(this.f23440b) : null;
        return strM18225e == null ? this.f23443e : strM18225e;
    }
}
