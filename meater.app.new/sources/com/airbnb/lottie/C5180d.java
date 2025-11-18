package com.airbnb.lottie;

import android.graphics.Rect;
import android.util.Log;
import com.airbnb.lottie.p112s.C5231c;
import com.airbnb.lottie.p112s.C5232d;
import com.airbnb.lottie.p112s.p115k.C5271d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0870d;
import p024c.p041e.C0874h;

/* compiled from: LottieComposition.java */
/* renamed from: com.airbnb.lottie.d */
/* loaded from: classes.dex */
public class C5180d {

    /* renamed from: a */
    private final C5189m f12332a = new C5189m();

    /* renamed from: b */
    private final HashSet<String> f12333b = new HashSet<>();

    /* renamed from: c */
    private Map<String, List<C5271d>> f12334c;

    /* renamed from: d */
    private Map<String, C5183g> f12335d;

    /* renamed from: e */
    private Map<String, C5231c> f12336e;

    /* renamed from: f */
    private C0874h<C5232d> f12337f;

    /* renamed from: g */
    private C0870d<C5271d> f12338g;

    /* renamed from: h */
    private List<C5271d> f12339h;

    /* renamed from: i */
    private Rect f12340i;

    /* renamed from: j */
    private float f12341j;

    /* renamed from: k */
    private float f12342k;

    /* renamed from: l */
    private float f12343l;

    /* renamed from: a */
    public void m9395a(String str) {
        Log.w("LOTTIE", str);
        this.f12333b.add(str);
    }

    /* renamed from: b */
    public Rect m9396b() {
        return this.f12340i;
    }

    /* renamed from: c */
    public C0874h<C5232d> m9397c() {
        return this.f12337f;
    }

    /* renamed from: d */
    public float m9398d() {
        return (long) ((m9399e() / this.f12343l) * 1000.0f);
    }

    /* renamed from: e */
    public float m9399e() {
        return this.f12342k - this.f12341j;
    }

    /* renamed from: f */
    public float m9400f() {
        return this.f12342k;
    }

    /* renamed from: g */
    public Map<String, C5231c> m9401g() {
        return this.f12336e;
    }

    /* renamed from: h */
    public float m9402h() {
        return this.f12343l;
    }

    /* renamed from: i */
    public Map<String, C5183g> m9403i() {
        return this.f12335d;
    }

    /* renamed from: j */
    public List<C5271d> m9404j() {
        return this.f12339h;
    }

    /* renamed from: k */
    public C5189m m9405k() {
        return this.f12332a;
    }

    /* renamed from: l */
    public List<C5271d> m9406l(String str) {
        return this.f12334c.get(str);
    }

    /* renamed from: m */
    public float m9407m() {
        return this.f12341j;
    }

    /* renamed from: n */
    public void m9408n(Rect rect, float f2, float f3, float f4, List<C5271d> list, C0870d<C5271d> c0870d, Map<String, List<C5271d>> map, Map<String, C5183g> map2, C0874h<C5232d> c0874h, Map<String, C5231c> map3) {
        this.f12340i = rect;
        this.f12341j = f2;
        this.f12342k = f3;
        this.f12343l = f4;
        this.f12339h = list;
        this.f12338g = c0870d;
        this.f12334c = map;
        this.f12335d = map2;
        this.f12337f = c0874h;
        this.f12336e = map3;
    }

    /* renamed from: o */
    public C5271d m9409o(long j2) {
        return this.f12338g.m5438g(j2);
    }

    /* renamed from: p */
    public void m9410p(boolean z) {
        this.f12332a.m9507b(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<C5271d> it = this.f12339h.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m9753v("\t"));
        }
        return sb.toString();
    }
}
