package com.facebook.p157o0.p164p0;

import android.os.Bundle;
import com.facebook.C5641a0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: ProtectedModeManager.kt */
/* renamed from: com.facebook.o0.p0.c */
/* loaded from: classes2.dex */
public final class C5894c {

    /* renamed from: b */
    private static boolean f15344b;

    /* renamed from: d */
    private static HashSet<String> f15346d;

    /* renamed from: a */
    public static final C5894c f15343a = new C5894c();

    /* renamed from: c */
    private static final Lazy f15345c = C10550i.m37594b(a.f15347f);

    /* compiled from: ProtectedModeManager.kt */
    /* renamed from: com.facebook.o0.p0.c$a */
    static final class a extends Lambda implements Function0<HashSet<String>> {

        /* renamed from: f */
        public static final a f15347f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HashSet<String> invoke() {
            return C10822w0.m38918e("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_category", "fb_content_ids", "fb_content_name", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_search_string", "fb_state_of_vehicle", "fb_status", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
        }
    }

    private C5894c() {
    }

    /* renamed from: a */
    private final HashSet<String> m12593a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        int i2 = 0;
        int length = jSONArray.length();
        if (length > 0) {
            while (true) {
                int i3 = i2 + 1;
                String string = jSONArray.getString(i2);
                C9801m.m32345e(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public static final void m12594b() {
        C5894c c5894c = f15343a;
        f15344b = true;
        c5894c.m12595d();
    }

    /* renamed from: d */
    private final void m12595d() throws JSONException {
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5670c0 c5670c0M11428o = C5672d0.m11428o(C5641a0.m11285d(), false);
        if (c5670c0M11428o == null) {
            return;
        }
        HashSet<String> hashSetM12593a = m12593a(c5670c0M11428o.m11403g());
        if (hashSetM12593a == null) {
            hashSetM12593a = m12597c();
        }
        f15346d = hashSetM12593a;
    }

    /* renamed from: e */
    public static final void m12596e(Bundle bundle) {
        if (!f15344b || bundle == null || bundle.isEmpty() || f15346d == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Set<String> setKeySet = bundle.keySet();
        C9801m.m32345e(setKeySet, "parameters.keySet()");
        for (String str : setKeySet) {
            HashSet<String> hashSet = f15346d;
            C9801m.m32343c(hashSet);
            if (!hashSet.contains(str)) {
                C9801m.m32345e(str, "param");
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bundle.remove((String) it.next());
        }
        bundle.putString("pm", "1");
    }

    /* renamed from: c */
    public final HashSet<String> m12597c() {
        return (HashSet) f15345c.getValue();
    }
}
