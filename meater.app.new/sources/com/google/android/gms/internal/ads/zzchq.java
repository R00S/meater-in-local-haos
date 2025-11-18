package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.io.StringReader;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzchq {

    /* renamed from: a */
    private final Context f24334a;

    /* renamed from: b */
    private final zzbai f24335b;

    /* renamed from: c */
    private final zzcxv f24336c;

    /* renamed from: d */
    private final Executor f24337d;

    public zzchq(Context context, zzbai zzbaiVar, zzcxv zzcxvVar, Executor executor) {
        this.f24334a = context;
        this.f24335b = zzbaiVar;
        this.f24336c = zzcxvVar;
        this.f24337d = executor;
    }

    /* renamed from: a */
    protected final zzbbh<zzcxu> m18797a() {
        zzalr zzalrVarM16656b = zzk.zzlt().m16656b(this.f24334a, this.f24335b);
        zzaln<JSONObject> zzalnVar = zzalo.f22107b;
        final zzalj zzaljVarM16658a = zzalrVarM16656b.m16658a("google.afma.response.normalize", zzalnVar, zzalnVar);
        final zzxt zzxtVar = this.f24336c.f25293d.f27420x;
        return zzbar.m17366c(zzbar.m17366c(zzbar.m17366c(zzbar.m17378o(HttpUrl.FRAGMENT_ENCODE_SET), new zzbal(this, zzxtVar) { // from class: com.google.android.gms.internal.ads.ej

            /* renamed from: a */
            private final zzchq f18820a;

            /* renamed from: b */
            private final zzxt f18821b;

            {
                this.f18820a = this;
                this.f18821b = zzxtVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) throws JSONException {
                zzxt zzxtVar2 = this.f18821b;
                String str = zzxtVar2.f27398f;
                String str2 = zzxtVar2.f27399g;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("headers", new JSONObject());
                jSONObject3.put("body", str);
                jSONObject2.put("base_url", HttpUrl.FRAGMENT_ENCODE_SET);
                jSONObject2.put("signals", new JSONObject(str2));
                jSONObject.put("request", jSONObject2);
                jSONObject.put("response", jSONObject3);
                jSONObject.put("flags", new JSONObject());
                return zzbar.m17378o(jSONObject);
            }
        }, this.f24337d), new zzbal(zzaljVarM16658a) { // from class: com.google.android.gms.internal.ads.fj

            /* renamed from: a */
            private final zzalj f18898a;

            {
                this.f18898a = zzaljVarM16658a;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f18898a.mo16653a((JSONObject) obj);
            }
        }, this.f24337d), new zzbal(this) { // from class: com.google.android.gms.internal.ads.gj

            /* renamed from: a */
            private final zzchq f18980a;

            {
                this.f18980a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.f18980a.m18798b((JSONObject) obj);
            }
        }, this.f24337d);
    }

    /* renamed from: b */
    final /* synthetic */ zzbbh m18798b(JSONObject jSONObject) throws Exception {
        return zzbar.m17378o(new zzcxu(new zzcxr(this.f24336c), zzcxs.m19023a(new StringReader(jSONObject.toString()))));
    }
}
