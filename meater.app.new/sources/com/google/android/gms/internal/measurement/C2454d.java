package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2454d {

    /* renamed from: a, reason: collision with root package name */
    private C2463e f34061a;

    /* renamed from: b, reason: collision with root package name */
    private C2463e f34062b;

    /* renamed from: c, reason: collision with root package name */
    private List<C2463e> f34063c;

    public C2454d() {
        this.f34061a = new C2463e("", 0L, null);
        this.f34062b = new C2463e("", 0L, null);
        this.f34063c = new ArrayList();
    }

    public final C2463e a() {
        return this.f34061a;
    }

    public final void b(C2463e c2463e) {
        this.f34061a = c2463e;
        this.f34062b = (C2463e) c2463e.clone();
        this.f34063c.clear();
    }

    public final void c(String str, long j10, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C2463e.c(str2, this.f34061a.b(str2), map.get(str2)));
        }
        this.f34063c.add(new C2463e(str, j10, map2));
    }

    public final /* synthetic */ Object clone() {
        C2454d c2454d = new C2454d((C2463e) this.f34061a.clone());
        Iterator<C2463e> it = this.f34063c.iterator();
        while (it.hasNext()) {
            c2454d.f34063c.add((C2463e) it.next().clone());
        }
        return c2454d;
    }

    public final C2463e d() {
        return this.f34062b;
    }

    public final void e(C2463e c2463e) {
        this.f34062b = c2463e;
    }

    public final List<C2463e> f() {
        return this.f34063c;
    }

    private C2454d(C2463e c2463e) {
        this.f34061a = c2463e;
        this.f34062b = (C2463e) c2463e.clone();
        this.f34063c = new ArrayList();
    }
}
