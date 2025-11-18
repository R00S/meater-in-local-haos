package com.facebook.p157o0.p165q0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C5641a0;
import com.facebook.internal.C5668b0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.p157o0.C5813a0;
import com.facebook.p157o0.C5825g0;
import com.facebook.p157o0.p163o0.C5886i;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AutomaticAnalyticsLogger.kt */
/* renamed from: com.facebook.o0.q0.i */
/* loaded from: classes2.dex */
public final class C5904i {

    /* renamed from: a */
    public static final C5904i f15376a = new C5904i();

    /* renamed from: b */
    private static final String f15377b = C5904i.class.getCanonicalName();

    /* renamed from: c */
    private static final C5825g0 f15378c;

    /* compiled from: AutomaticAnalyticsLogger.kt */
    /* renamed from: com.facebook.o0.q0.i$a */
    private static final class a {

        /* renamed from: a */
        private BigDecimal f15379a;

        /* renamed from: b */
        private Currency f15380b;

        /* renamed from: c */
        private Bundle f15381c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            C9801m.m32346f(bigDecimal, "purchaseAmount");
            C9801m.m32346f(currency, "currency");
            C9801m.m32346f(bundle, "param");
            this.f15379a = bigDecimal;
            this.f15380b = currency;
            this.f15381c = bundle;
        }

        /* renamed from: a */
        public final Currency m12639a() {
            return this.f15380b;
        }

        /* renamed from: b */
        public final Bundle m12640b() {
            return this.f15381c;
        }

        /* renamed from: c */
        public final BigDecimal m12641c() {
            return this.f15379a;
        }
    }

    static {
        C5641a0 c5641a0 = C5641a0.f14199a;
        f15378c = new C5825g0(C5641a0.m11284c());
    }

    private C5904i() {
    }

    /* renamed from: a */
    private final a m12633a(String str, String str2) {
        return m12634b(str, str2, new HashMap());
    }

    /* renamed from: b */
    private final a m12634b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String strOptString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", strOptString);
            if (C9801m.m32341a(strOptString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String strOptString2 = jSONObject2.optString("introductoryPriceCycles");
                C9801m.m32345e(strOptString2, "introductoryPriceCycles");
                if (strOptString2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", strOptString2);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            double d2 = jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d2);
            BigDecimal bigDecimal = new BigDecimal(d2 / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            C9801m.m32345e(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e2) {
            Log.e(f15377b, "Error parsing in-app subscription data.", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static final boolean m12635c() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        String strM11285d = C5641a0.m11285d();
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5670c0 c5670c0M11417c = C5672d0.m11417c(strM11285d);
        return c5670c0M11417c != null && C5641a0.m11288g() && c5670c0M11417c.m11401e();
    }

    /* renamed from: d */
    public static final void m12636d() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        String strM11285d = C5641a0.m11285d();
        if (C5641a0.m11288g()) {
            if (contextM11284c instanceof Application) {
                C5813a0.f14908a.m12168b((Application) contextM11284c, strM11285d);
            } else {
                Log.w(f15377b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    /* renamed from: e */
    public static final void m12637e(String str, long j2) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        String strM11285d = C5641a0.m11285d();
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5670c0 c5670c0M11428o = C5672d0.m11428o(strM11285d, false);
        if (c5670c0M11428o == null || !c5670c0M11428o.m11397a() || j2 <= 0) {
            return;
        }
        C5825g0 c5825g0 = new C5825g0(contextM11284c);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        c5825g0.m12241c("fb_aa_time_spent_on_view", j2, bundle);
    }

    /* renamed from: f */
    public static final void m12638f(String str, String str2, boolean z) {
        a aVarM12633a;
        C9801m.m32346f(str, "purchase");
        C9801m.m32346f(str2, "skuDetails");
        C5904i c5904i = f15376a;
        if (m12635c() && (aVarM12633a = c5904i.m12633a(str, str2)) != null) {
            boolean z2 = false;
            if (z) {
                C5668b0 c5668b0 = C5668b0.f14356a;
                C5641a0 c5641a0 = C5641a0.f14199a;
                if (C5668b0.m11385b("app_events_if_auto_log_subs", C5641a0.m11285d(), false)) {
                    z2 = true;
                }
            }
            if (z2) {
                f15378c.m12247i(C5886i.f15313a.m12556m(str2) ? "StartTrial" : "Subscribe", aVarM12633a.m12641c(), aVarM12633a.m12639a(), aVarM12633a.m12640b());
            } else {
                f15378c.m12248j(aVarM12633a.m12641c(), aVarM12633a.m12639a(), aVarM12633a.m12640b());
            }
        }
    }
}
