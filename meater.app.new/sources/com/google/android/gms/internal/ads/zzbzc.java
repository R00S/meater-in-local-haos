package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import p024c.p041e.C0873g;

/* loaded from: classes2.dex */
public final class zzbzc {

    /* renamed from: a */
    public static final zzbzc f23850a = new zzbze().m18572b();

    /* renamed from: b */
    private final zzafl f23851b;

    /* renamed from: c */
    private final zzafi f23852c;

    /* renamed from: d */
    private final zzafx f23853d;

    /* renamed from: e */
    private final zzafu f23854e;

    /* renamed from: f */
    private final zzaje f23855f;

    /* renamed from: g */
    private final C0873g<String, zzafr> f23856g;

    /* renamed from: h */
    private final C0873g<String, zzafo> f23857h;

    private zzbzc(zzbze zzbzeVar) {
        this.f23851b = zzbzeVar.f23858a;
        this.f23852c = zzbzeVar.f23859b;
        this.f23853d = zzbzeVar.f23860c;
        this.f23856g = new C0873g<>(zzbzeVar.f23863f);
        this.f23857h = new C0873g<>(zzbzeVar.f23864g);
        this.f23854e = zzbzeVar.f23861d;
        this.f23855f = zzbzeVar.f23862e;
    }

    /* renamed from: a */
    public final zzafl m18562a() {
        return this.f23851b;
    }

    /* renamed from: b */
    public final zzafi m18563b() {
        return this.f23852c;
    }

    /* renamed from: c */
    public final zzafx m18564c() {
        return this.f23853d;
    }

    /* renamed from: d */
    public final zzafu m18565d() {
        return this.f23854e;
    }

    /* renamed from: e */
    public final zzaje m18566e() {
        return this.f23855f;
    }

    /* renamed from: f */
    public final ArrayList<String> m18567f() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f23853d != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f23851b != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f23852c != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f23856g.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f23855f != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList<String> m18568g() {
        ArrayList<String> arrayList = new ArrayList<>(this.f23856g.size());
        for (int i2 = 0; i2 < this.f23856g.size(); i2++) {
            arrayList.add(this.f23856g.m5473j(i2));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final zzafr m18569h(String str) {
        return this.f23856g.get(str);
    }

    /* renamed from: i */
    public final zzafo m18570i(String str) {
        return this.f23857h.get(str);
    }
}
