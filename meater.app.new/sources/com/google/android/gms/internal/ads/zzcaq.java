package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import cm.aptoide.p092pt.account.AccountAnalytics;
import com.google.android.gms.ads.internal.zzk;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcaq {

    /* renamed from: a */
    private final zzbbl f23972a;

    /* renamed from: b */
    private final zzcau f23973b;

    /* renamed from: c */
    private final zzcbd f23974c;

    public zzcaq(zzbbl zzbblVar, zzcau zzcauVar, zzcbd zzcbdVar) {
        this.f23972a = zzbblVar;
        this.f23973b = zzcauVar;
        this.f23974c = zzcbdVar;
    }

    /* renamed from: a */
    public final zzbbh<zzbyt> m18622a(final zzcxu zzcxuVar, final zzcxm zzcxmVar, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        zzbbh zzbbhVarM17378o;
        final zzbbh zzbbhVarSubmit = this.f23972a.submit(new Callable(this, zzcxuVar, zzcxmVar, jSONObject) { // from class: com.google.android.gms.internal.ads.lg

            /* renamed from: f */
            private final zzcaq f19839f;

            /* renamed from: g */
            private final zzcxu f19840g;

            /* renamed from: h */
            private final zzcxm f19841h;

            /* renamed from: i */
            private final JSONObject f19842i;

            {
                this.f19839f = this;
                this.f19840g = zzcxuVar;
                this.f19841h = zzcxmVar;
                this.f19842i = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws zzcmw {
                zzcxu zzcxuVar2 = this.f19840g;
                zzcxm zzcxmVar2 = this.f19841h;
                JSONObject jSONObject2 = this.f19842i;
                zzbyt zzbytVar = new zzbyt();
                zzbytVar.m18521M(jSONObject2.optInt("template_id", -1));
                zzbytVar.m18523P(jSONObject2.optString("custom_template_id"));
                zzcxv zzcxvVar = zzcxuVar2.f25288a.f25282a;
                if (!zzcxvVar.f25296g.contains(Integer.toString(zzbytVar.m18552w()))) {
                    int iM18552w = zzbytVar.m18552w();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid template ID: ");
                    sb.append(iM18552w);
                    throw new zzcmw(sb.toString(), 0);
                }
                if (zzbytVar.m18552w() == 3) {
                    if (zzbytVar.m18537e() == null) {
                        throw new zzcmw("No custom template id for custom template ad response.", 0);
                    }
                    if (!zzcxvVar.f25297h.contains(zzbytVar.m18537e())) {
                        throw new zzcmw("Unexpected custom template id in the response.", 0);
                    }
                }
                zzbytVar.m18547o(jSONObject2.optDouble("rating", -1.0d));
                String strOptString = jSONObject2.optString("headline", null);
                if (zzcxmVar2.f25232E) {
                    zzk.zzlg();
                    String strM17161m0 = zzaxi.m17161m0();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strM17161m0).length() + 3 + String.valueOf(strOptString).length());
                    sb2.append(strM17161m0);
                    sb2.append(" : ");
                    sb2.append(strOptString);
                    strOptString = sb2.toString();
                }
                zzbytVar.m18526T("headline", strOptString);
                zzbytVar.m18526T("body", jSONObject2.optString("body", null));
                zzbytVar.m18526T("call_to_action", jSONObject2.optString("call_to_action", null));
                zzbytVar.m18526T(AccountAnalytics.STORE, jSONObject2.optString(AccountAnalytics.STORE, null));
                zzbytVar.m18526T("price", jSONObject2.optString("price", null));
                zzbytVar.m18526T("advertiser", jSONObject2.optString("advertiser", null));
                return zzbytVar;
            }
        });
        final zzbbh<List<zzadw>> zzbbhVarM18634h = this.f23973b.m18634h(jSONObject, "images");
        final zzbbh<zzadw> zzbbhVarM18633g = this.f23973b.m18633g(jSONObject, "secondary_image");
        final zzbbh<zzadw> zzbbhVarM18633g2 = this.f23973b.m18633g(jSONObject, "app_icon");
        final zzbbh<zzadt> zzbbhVarM18635i = this.f23973b.m18635i(jSONObject, "attribution");
        final zzbbh<zzbgz> zzbbhVarM18636n = this.f23973b.m18636n(jSONObject);
        final zzcau zzcauVar = this.f23973b;
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            zzbbhVarM17378o = TextUtils.isEmpty(strOptString) ? zzbar.m17378o(null) : zzbar.m17366c(zzbar.m17378o(null), new zzbal(zzcauVar, strOptString) { // from class: com.google.android.gms.internal.ads.qg

                /* renamed from: a */
                private final zzcau f20391a;

                /* renamed from: b */
                private final String f20392b;

                {
                    this.f20391a = zzcauVar;
                    this.f20392b = strOptString;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final zzbbh zzf(Object obj) {
                    return this.f20391a.m18632f(this.f20392b, obj);
                }
            }, zzbbm.f22757a);
        } else {
            zzbbhVarM17378o = zzbar.m17378o(null);
        }
        final zzbbh zzbbhVar = zzbbhVarM17378o;
        final zzbbh<List<zzcbg>> zzbbhVarM18637a = this.f23974c.m18637a(jSONObject, "custom_assets");
        return zzbar.m17364a(zzbbhVarSubmit, zzbbhVarM18634h, zzbbhVarM18633g, zzbbhVarM18633g2, zzbbhVarM18635i, zzbbhVarM18636n, zzbbhVar, zzbbhVarM18637a).m17379a(new Callable(this, zzbbhVarSubmit, zzbbhVarM18634h, zzbbhVarM18633g2, zzbbhVarM18633g, zzbbhVarM18635i, jSONObject, zzbbhVarM18636n, zzbbhVar, zzbbhVarM18637a) { // from class: com.google.android.gms.internal.ads.mg

            /* renamed from: f */
            private final zzcaq f19914f;

            /* renamed from: g */
            private final zzbbh f19915g;

            /* renamed from: h */
            private final zzbbh f19916h;

            /* renamed from: i */
            private final zzbbh f19917i;

            /* renamed from: j */
            private final zzbbh f19918j;

            /* renamed from: k */
            private final zzbbh f19919k;

            /* renamed from: l */
            private final JSONObject f19920l;

            /* renamed from: m */
            private final zzbbh f19921m;

            /* renamed from: n */
            private final zzbbh f19922n;

            /* renamed from: o */
            private final zzbbh f19923o;

            {
                this.f19914f = this;
                this.f19915g = zzbbhVarSubmit;
                this.f19916h = zzbbhVarM18634h;
                this.f19917i = zzbbhVarM18633g2;
                this.f19918j = zzbbhVarM18633g;
                this.f19919k = zzbbhVarM18635i;
                this.f19920l = jSONObject;
                this.f19921m = zzbbhVarM18636n;
                this.f19922n = zzbbhVar;
                this.f19923o = zzbbhVarM18637a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzbbh zzbbhVar2 = this.f19915g;
                zzbbh zzbbhVar3 = this.f19916h;
                zzbbh zzbbhVar4 = this.f19917i;
                zzbbh zzbbhVar5 = this.f19918j;
                zzbbh zzbbhVar6 = this.f19919k;
                JSONObject jSONObject2 = this.f19920l;
                zzbbh zzbbhVar7 = this.f19921m;
                zzbbh zzbbhVar8 = this.f19922n;
                zzbbh zzbbhVar9 = this.f19923o;
                zzbyt zzbytVar = (zzbyt) zzbbhVar2.get();
                zzbytVar.m18546n((List) zzbbhVar3.get());
                zzbytVar.m18550u((zzaei) zzbbhVar4.get());
                zzbytVar.m18520L((zzaei) zzbbhVar5.get());
                zzbytVar.m18549t((zzaea) zzbbhVar6.get());
                zzbytVar.m18522N(zzcau.m18628k(jSONObject2));
                zzbytVar.m18548s(zzcau.m18629l(jSONObject2));
                zzbgz zzbgzVar = (zzbgz) zzbbhVar7.get();
                if (zzbgzVar != null) {
                    zzbytVar.m18524R(zzbgzVar);
                    zzbytVar.m18532Z(zzbgzVar.getView());
                    zzbytVar.m18519K(zzbgzVar.mo14911h());
                }
                zzbgz zzbgzVar2 = (zzbgz) zzbbhVar8.get();
                if (zzbgzVar2 != null) {
                    zzbytVar.m18525S(zzbgzVar2);
                }
                for (zzcbg zzcbgVar : (List) zzbbhVar9.get()) {
                    int i2 = zzcbgVar.f24000a;
                    if (i2 == 1) {
                        zzbytVar.m18526T(zzcbgVar.f24001b, zzcbgVar.f24002c);
                    } else if (i2 == 2) {
                        zzbytVar.m18551v(zzcbgVar.f24001b, zzcbgVar.f24003d);
                    }
                }
                return zzbytVar;
            }
        }, this.f23972a);
    }
}
