package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcpf {

    /* renamed from: a */
    private final zzclc f24848a;

    /* renamed from: b */
    private final Map<String, zzcpk> f24849b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<String, List<zzcpk>> f24850c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Executor f24851d;

    /* renamed from: e */
    private final Context f24852e;

    public zzcpf(zzclc zzclcVar, Executor executor, Context context) {
        this.f24848a = zzclcVar;
        this.f24851d = executor;
        this.f24852e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void m18911f() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectM17043f = zzk.zzlk().m17061r().mo17103q().m17043f();
        if (jSONObjectM17043f != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectM17043f.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i2);
                        String strOptString = jSONObject.optString("ad_unit_id", HttpUrl.FRAGMENT_ENCODE_SET);
                        String strOptString2 = jSONObject.optString("format", HttpUrl.FRAGMENT_ENCODE_SET);
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            bundle.putString(next, jSONObjectOptJSONObject2.optString(next, HttpUrl.FRAGMENT_ENCODE_SET));
                                        }
                                    }
                                    JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (jSONArrayOptJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                                            String strOptString3 = jSONArrayOptJSONArray3.optString(i4, HttpUrl.FRAGMENT_ENCODE_SET);
                                            if (!TextUtils.isEmpty(strOptString3)) {
                                                arrayList3.add(strOptString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        int i5 = 0;
                                        while (i5 < size) {
                                            Object obj = arrayList3.get(i5);
                                            i5++;
                                            String str = (String) obj;
                                            m18912g(str);
                                            zzcpk zzcpkVar = this.f24849b.get(str);
                                            if (zzcpkVar != null) {
                                                arrayList2.add(new zzcpk(str, strOptString2, bundle, zzcpkVar.f24859d));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f24850c.put(strOptString, arrayList);
                        }
                    }
                }
            } catch (JSONException e2) {
                zzawz.m17081l("Malformed config loading JSON.", e2);
            }
        }
    }

    /* renamed from: a */
    public final void m18907a() {
        zzk.zzlk().m17061r().mo17107u(new Runnable(this) { // from class: com.google.android.gms.internal.ads.um

            /* renamed from: f */
            private final zzcpf f20644f;

            {
                this.f20644f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20644f.m18910e();
            }
        });
        this.f24851d.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vm

            /* renamed from: f */
            private final zzcpf f20747f;

            {
                this.f20747f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20747f.m18909d();
            }
        });
    }

    /* renamed from: b */
    public final Map<String, List<zzcpk>> m18908b() {
        return this.f24850c;
    }

    /* renamed from: e */
    final /* synthetic */ void m18910e() {
        this.f24851d.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wm

            /* renamed from: f */
            private final zzcpf f20860f;

            {
                this.f20860f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20860f.m18911f();
            }
        });
    }

    /* renamed from: g */
    public final void m18912g(String str) {
        if (TextUtils.isEmpty(str) || this.f24849b.containsKey(str)) {
            return;
        }
        try {
            this.f24849b.put(str, new zzcpk(str, HttpUrl.FRAGMENT_ENCODE_SET, new Bundle(), this.f24848a.m18868d(str)));
        } catch (RemoteException unused) {
        }
    }
}
