package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzasj extends zzasl {

    /* renamed from: a */
    private final Object f22493a = new Object();

    /* renamed from: b */
    private final Context f22494b;

    /* renamed from: c */
    private SharedPreferences f22495c;

    /* renamed from: d */
    private final zzalj<JSONObject, JSONObject> f22496d;

    public zzasj(Context context, zzalj<JSONObject, JSONObject> zzaljVar) {
        this.f22494b = context.getApplicationContext();
        this.f22496d = zzaljVar;
    }

    /* renamed from: c */
    public static JSONObject m16917c(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbai.m17359y().f22750f);
            jSONObject.put("mf", zzyt.m20848e().m16421c(zzacu.f21619E2));
            jSONObject.put("cl", "248613007");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 11140);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m14713c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    /* renamed from: a */
    public final zzbbh<Void> mo16918a() throws JSONException {
        synchronized (this.f22493a) {
            if (this.f22495c == null) {
                this.f22495c = this.f22494b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzk.zzln().mo14608a() - this.f22495c.getLong("js_last_update", 0L) < ((Long) zzyt.m20848e().m16421c(zzacu.f21613D2)).longValue()) {
            return zzbar.m17378o(null);
        }
        return zzbar.m17367d(this.f22496d.mo16653a(m16917c(this.f22494b)), new zzbam(this) { // from class: com.google.android.gms.internal.ads.u3

            /* renamed from: a */
            private final zzasj f20607a;

            {
                this.f20607a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbam
            /* renamed from: a */
            public final Object mo14764a(Object obj) {
                return this.f20607a.m16919b((JSONObject) obj);
            }
        }, zzbbm.f22758b);
    }

    /* renamed from: b */
    final /* synthetic */ Void m16919b(JSONObject jSONObject) {
        zzacu.m16424b(this.f22494b, 1, jSONObject);
        this.f22495c.edit().putLong("js_last_update", zzk.zzln().mo14608a()).apply();
        return null;
    }
}
