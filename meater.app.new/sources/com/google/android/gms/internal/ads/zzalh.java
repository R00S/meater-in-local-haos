package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzalh implements zzajq, zzalg {

    /* renamed from: f */
    private final zzalf f22100f;

    /* renamed from: g */
    private final HashSet<AbstractMap.SimpleEntry<String, zzaho<? super zzalf>>> f22101g = new HashSet<>();

    public zzalh(zzalf zzalfVar) {
        this.f22100f = zzalfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalg
    /* renamed from: F */
    public final void mo16652F() {
        Iterator<AbstractMap.SimpleEntry<String, zzaho<? super zzalf>>> it = this.f22101g.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, zzaho<? super zzalf>> next = it.next();
            String strValueOf = String.valueOf(next.getValue().toString());
            zzawz.m17082m(strValueOf.length() != 0 ? "Unregistering eventhandler: ".concat(strValueOf) : new String("Unregistering eventhandler: "));
            this.f22100f.mo16628i(next.getKey(), next.getValue());
        }
        this.f22101g.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzajq
    /* renamed from: X */
    public final void mo15685X(String str, String str2) {
        zzajr.m16610a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    /* renamed from: Y */
    public final void mo14895Y(String str, JSONObject jSONObject) {
        zzajr.m16612c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    /* renamed from: f */
    public final void mo16627f(String str, zzaho<? super zzalf> zzahoVar) {
        this.f22100f.mo16627f(str, zzahoVar);
        this.f22101g.add(new AbstractMap.SimpleEntry<>(str, zzahoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    /* renamed from: i */
    public final void mo16628i(String str, zzaho<? super zzalf> zzahoVar) {
        this.f22100f.mo16628i(str, zzahoVar);
        this.f22101g.remove(new AbstractMap.SimpleEntry(str, zzahoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzaji
    /* renamed from: j */
    public final void mo14915j(String str, JSONObject jSONObject) {
        zzajr.m16613d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzajq, com.google.android.gms.internal.ads.zzakg
    /* renamed from: k */
    public final void mo14917k(String str) {
        this.f22100f.mo14917k(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaji
    /* renamed from: y */
    public final void mo14940y(String str, Map map) {
        zzajr.m16611b(this, str, map);
    }
}
