package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzclx implements zzclw<zzbyn> {

    /* renamed from: a */
    private final zzbxo f24691a;

    /* renamed from: b */
    private final zzbbl f24692b;

    /* renamed from: c */
    private final zzcaq f24693c;

    public zzclx(zzbxo zzbxoVar, zzbbl zzbblVar, zzcaq zzcaqVar) {
        this.f24691a = zzbxoVar;
        this.f24692b = zzbblVar;
        this.f24693c = zzcaqVar;
    }

    /* renamed from: f */
    private final zzbbh<zzbyn> m18873f(final zzcxu zzcxuVar, final zzcxm zzcxmVar, final JSONObject jSONObject) {
        final zzbbh<zzccj> zzbbhVarM19069b = this.f24691a.mo16094f().m19069b();
        final zzbbh<zzbyt> zzbbhVarM18622a = this.f24693c.m18622a(zzcxuVar, zzcxmVar, jSONObject);
        return zzbar.m17364a(zzbbhVarM19069b, zzbbhVarM18622a).m17379a(new Callable(this, zzbbhVarM18622a, zzbbhVarM19069b, zzcxuVar, zzcxmVar, jSONObject) { // from class: com.google.android.gms.internal.ads.kl

            /* renamed from: f */
            private final zzclx f19710f;

            /* renamed from: g */
            private final zzbbh f19711g;

            /* renamed from: h */
            private final zzbbh f19712h;

            /* renamed from: i */
            private final zzcxu f19713i;

            /* renamed from: j */
            private final zzcxm f19714j;

            /* renamed from: k */
            private final JSONObject f19715k;

            {
                this.f19710f = this;
                this.f19711g = zzbbhVarM18622a;
                this.f19712h = zzbbhVarM19069b;
                this.f19713i = zzcxuVar;
                this.f19714j = zzcxmVar;
                this.f19715k = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f19710f.m18876e(this.f19711g, this.f19712h, this.f19713i, this.f19714j, this.f19715k);
            }
        }, this.f24692b);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: a */
    public final zzbbh<List<zzbbh<zzbyn>>> mo18846a(final zzcxu zzcxuVar, final zzcxm zzcxmVar) {
        zzbbh<zzccj> zzbbhVarM19069b = this.f24691a.mo16094f().m19069b();
        this.f24691a.mo16094f().m19068a(zzbbhVarM19069b);
        return zzbar.m17366c(zzbar.m17366c(zzbbhVarM19069b, new zzbal(this, zzcxmVar) { // from class: com.google.android.gms.internal.ads.fl

            /* renamed from: a */
            private final zzclx f18902a;

            /* renamed from: b */
            private final zzcxm f18903b;

            {
                this.f18902a = this;
                this.f18903b = zzcxmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f18902a.m18874c(this.f18903b, (zzccj) obj);
            }
        }, this.f24692b), new zzbal(this, zzcxuVar, zzcxmVar) { // from class: com.google.android.gms.internal.ads.gl

            /* renamed from: a */
            private final zzclx f18982a;

            /* renamed from: b */
            private final zzcxu f18983b;

            /* renamed from: c */
            private final zzcxm f18984c;

            {
                this.f18982a = this;
                this.f18983b = zzcxuVar;
                this.f18984c = zzcxmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f18982a.m18875d(this.f18983b, this.f18984c, (JSONArray) obj);
            }
        }, this.f24692b);
    }

    @Override // com.google.android.gms.internal.ads.zzcjv
    /* renamed from: b */
    public final boolean mo18847b(zzcxu zzcxuVar, zzcxm zzcxmVar) {
        zzcxq zzcxqVar = zzcxmVar.f25258p;
        return (zzcxqVar == null || zzcxqVar.f25280c == null) ? false : true;
    }

    /* renamed from: c */
    final /* synthetic */ zzbbh m18874c(zzcxm zzcxmVar, zzccj zzccjVar) throws Exception {
        JSONObject jSONObjectM17262d = zzazc.m17262d("isNonagon", Boolean.TRUE);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzcxmVar.f25258p.f25280c);
        jSONObject.put("sdk_params", jSONObjectM17262d);
        return zzbar.m17366c(zzccjVar.m18670i("google.afma.nativeAds.preProcessJson", jSONObject), C6788il.f19388a, this.f24692b);
    }

    /* renamed from: d */
    final /* synthetic */ zzbbh m18875d(zzcxu zzcxuVar, zzcxm zzcxmVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzbar.m17375l(new zzcgm(3));
        }
        if (zzcxuVar.f25288a.f25282a.f25301l <= 1) {
            return zzbar.m17367d(m18873f(zzcxuVar, zzcxmVar, jSONArray.getJSONObject(0)), C6825jl.f19488a, this.f24692b);
        }
        int length = jSONArray.length();
        this.f24691a.mo16094f().m19070c(Math.min(length, zzcxuVar.f25288a.f25282a.f25301l));
        ArrayList arrayList = new ArrayList(zzcxuVar.f25288a.f25282a.f25301l);
        for (int i2 = 0; i2 < zzcxuVar.f25288a.f25282a.f25301l; i2++) {
            if (i2 < length) {
                arrayList.add(m18873f(zzcxuVar, zzcxmVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzbar.m17375l(new zzcgm(3)));
            }
        }
        return zzbar.m17378o(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    final /* synthetic */ zzbyn m18876e(zzbbh zzbbhVar, zzbbh zzbbhVar2, zzcxu zzcxuVar, zzcxm zzcxmVar, JSONObject jSONObject) throws Exception {
        zzbyt zzbytVar = (zzbyt) zzbbhVar.get();
        zzccj zzccjVar = (zzccj) zzbbhVar2.get();
        zzbyv zzbyvVarMo16089a = this.f24691a.mo16089a(new zzbpr(zzcxuVar, zzcxmVar, null), new zzbzf(zzbytVar), new zzbyc(jSONObject, zzccjVar));
        zzbyvVarMo16089a.mo16155h().m18661b();
        zzbyvVarMo16089a.mo16156i().m18672a(zzccjVar);
        zzbyvVarMo16089a.mo16157j().m18648c(zzbytVar.m18513A());
        return zzbyvVarMo16089a.mo14760g();
    }
}
