package com.facebook.p157o0.p159l0;

import com.facebook.EnumC5659g0;
import com.facebook.internal.C5684j0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.p159l0.EnumC5843d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10773s;
import kotlin.C10775u;
import kotlin.C9821b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10810q0;
import kotlin.collections.C10815t;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10545t;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.g */
/* loaded from: classes.dex */
public final class C5846g {

    /* renamed from: a */
    public static final C5846g f15026a = new C5846g();

    /* renamed from: b */
    private static final Map<EnumC5844e, c> f15027b;

    /* renamed from: c */
    public static final Map<EnumC5852m, b> f15028c;

    /* renamed from: d */
    public static final Map<String, EnumC5849j> f15029d;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$a */
    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* renamed from: f */
        public static final C11461a f15030f = new C11461a(null);

        /* renamed from: k */
        private final String f15035k;

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        /* renamed from: com.facebook.o0.l0.g$a$a, reason: collision with other inner class name */
        public static final class C11461a {
            private C11461a() {
            }

            public /* synthetic */ C11461a(C9789g c9789g) {
                this();
            }

            /* renamed from: a */
            public final a m12329a(String str) {
                C9801m.m32346f(str, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (C9801m.m32341a(aVar.m12328k(), str)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        a(String str) {
            this.f15035k = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }

        /* renamed from: k */
        public final String m12328k() {
            return this.f15035k;
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$b */
    public static final class b {

        /* renamed from: a */
        private EnumC5850k f15036a;

        /* renamed from: b */
        private EnumC5848i f15037b;

        public b(EnumC5850k enumC5850k, EnumC5848i enumC5848i) {
            C9801m.m32346f(enumC5848i, "field");
            this.f15036a = enumC5850k;
            this.f15037b = enumC5848i;
        }

        /* renamed from: a */
        public final EnumC5848i m12330a() {
            return this.f15037b;
        }

        /* renamed from: b */
        public final EnumC5850k m12331b() {
            return this.f15036a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15036a == bVar.f15036a && this.f15037b == bVar.f15037b;
        }

        public int hashCode() {
            EnumC5850k enumC5850k = this.f15036a;
            return ((enumC5850k == null ? 0 : enumC5850k.hashCode()) * 31) + this.f15037b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f15036a + ", field=" + this.f15037b + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$c */
    public static final class c {

        /* renamed from: a */
        private EnumC5850k f15038a;

        /* renamed from: b */
        private EnumC5851l f15039b;

        public c(EnumC5850k enumC5850k, EnumC5851l enumC5851l) {
            C9801m.m32346f(enumC5850k, "section");
            this.f15038a = enumC5850k;
            this.f15039b = enumC5851l;
        }

        /* renamed from: a */
        public final EnumC5851l m12332a() {
            return this.f15039b;
        }

        /* renamed from: b */
        public final EnumC5850k m12333b() {
            return this.f15038a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f15038a == cVar.f15038a && this.f15039b == cVar.f15039b;
        }

        public int hashCode() {
            int iHashCode = this.f15038a.hashCode() * 31;
            EnumC5851l enumC5851l = this.f15039b;
            return iHashCode + (enumC5851l == null ? 0 : enumC5851l.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f15038a + ", field=" + this.f15039b + ')';
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$d */
    public enum d {
        ARRAY,
        BOOL,
        INT;


        /* renamed from: f */
        public static final a f15040f = new a(null);

        /* compiled from: AppEventsConversionsAPITransformer.kt */
        /* renamed from: com.facebook.o0.l0.g$d$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }

            /* renamed from: a */
            public final d m12335a(String str) {
                C9801m.m32346f(str, "rawValue");
                if (!C9801m.m32341a(str, EnumC5844e.EXT_INFO.m12306k()) && !C9801m.m32341a(str, EnumC5844e.URL_SCHEMES.m12306k()) && !C9801m.m32341a(str, EnumC5852m.CONTENT_IDS.m12364k()) && !C9801m.m32341a(str, EnumC5852m.CONTENTS.m12364k()) && !C9801m.m32341a(str, a.OPTIONS.m12328k())) {
                    if (!C9801m.m32341a(str, EnumC5844e.ADV_TE.m12306k()) && !C9801m.m32341a(str, EnumC5844e.APP_TE.m12306k())) {
                        if (C9801m.m32341a(str, EnumC5852m.EVENT_TIME.m12364k())) {
                            return d.INT;
                        }
                        return null;
                    }
                    return d.BOOL;
                }
                return d.ARRAY;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] dVarArrValuesCustom = values();
            return (d[]) Arrays.copyOf(dVarArrValuesCustom, dVarArrValuesCustom.length);
        }
    }

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.g$e */
    public /* synthetic */ class e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15045a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15046b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f15047c;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            f15045a = iArr;
            int[] iArr2 = new int[EnumC5850k.valuesCustom().length];
            iArr2[EnumC5850k.APP_DATA.ordinal()] = 1;
            iArr2[EnumC5850k.USER_DATA.ordinal()] = 2;
            f15046b = iArr2;
            int[] iArr3 = new int[EnumC5843d.valuesCustom().length];
            iArr3[EnumC5843d.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[EnumC5843d.CUSTOM.ordinal()] = 2;
            f15047c = iArr3;
        }
    }

    static {
        EnumC5844e enumC5844e = EnumC5844e.ANON_ID;
        EnumC5850k enumC5850k = EnumC5850k.USER_DATA;
        EnumC5844e enumC5844e2 = EnumC5844e.ADV_TE;
        EnumC5850k enumC5850k2 = EnumC5850k.APP_DATA;
        f15027b = C10810q0.m38800l(C10773s.m38547a(enumC5844e, new c(enumC5850k, EnumC5851l.ANON_ID)), C10773s.m38547a(EnumC5844e.APP_USER_ID, new c(enumC5850k, EnumC5851l.FB_LOGIN_ID)), C10773s.m38547a(EnumC5844e.ADVERTISER_ID, new c(enumC5850k, EnumC5851l.MAD_ID)), C10773s.m38547a(EnumC5844e.PAGE_ID, new c(enumC5850k, EnumC5851l.PAGE_ID)), C10773s.m38547a(EnumC5844e.PAGE_SCOPED_USER_ID, new c(enumC5850k, EnumC5851l.PAGE_SCOPED_USER_ID)), C10773s.m38547a(enumC5844e2, new c(enumC5850k2, EnumC5851l.ADV_TE)), C10773s.m38547a(EnumC5844e.APP_TE, new c(enumC5850k2, EnumC5851l.APP_TE)), C10773s.m38547a(EnumC5844e.CONSIDER_VIEWS, new c(enumC5850k2, EnumC5851l.CONSIDER_VIEWS)), C10773s.m38547a(EnumC5844e.DEVICE_TOKEN, new c(enumC5850k2, EnumC5851l.DEVICE_TOKEN)), C10773s.m38547a(EnumC5844e.EXT_INFO, new c(enumC5850k2, EnumC5851l.EXT_INFO)), C10773s.m38547a(EnumC5844e.INCLUDE_DWELL_DATA, new c(enumC5850k2, EnumC5851l.INCLUDE_DWELL_DATA)), C10773s.m38547a(EnumC5844e.INCLUDE_VIDEO_DATA, new c(enumC5850k2, EnumC5851l.INCLUDE_VIDEO_DATA)), C10773s.m38547a(EnumC5844e.INSTALL_REFERRER, new c(enumC5850k2, EnumC5851l.INSTALL_REFERRER)), C10773s.m38547a(EnumC5844e.INSTALLER_PACKAGE, new c(enumC5850k2, EnumC5851l.INSTALLER_PACKAGE)), C10773s.m38547a(EnumC5844e.RECEIPT_DATA, new c(enumC5850k2, EnumC5851l.RECEIPT_DATA)), C10773s.m38547a(EnumC5844e.URL_SCHEMES, new c(enumC5850k2, EnumC5851l.URL_SCHEMES)), C10773s.m38547a(EnumC5844e.USER_DATA, new c(enumC5850k, null)));
        EnumC5852m enumC5852m = EnumC5852m.VALUE_TO_SUM;
        EnumC5850k enumC5850k3 = EnumC5850k.CUSTOM_DATA;
        f15028c = C10810q0.m38800l(C10773s.m38547a(EnumC5852m.EVENT_TIME, new b(null, EnumC5848i.EVENT_TIME)), C10773s.m38547a(EnumC5852m.EVENT_NAME, new b(null, EnumC5848i.EVENT_NAME)), C10773s.m38547a(enumC5852m, new b(enumC5850k3, EnumC5848i.VALUE_TO_SUM)), C10773s.m38547a(EnumC5852m.CONTENT_IDS, new b(enumC5850k3, EnumC5848i.CONTENT_IDS)), C10773s.m38547a(EnumC5852m.CONTENTS, new b(enumC5850k3, EnumC5848i.CONTENTS)), C10773s.m38547a(EnumC5852m.CONTENT_TYPE, new b(enumC5850k3, EnumC5848i.CONTENT_TYPE)), C10773s.m38547a(EnumC5852m.CURRENCY, new b(enumC5850k3, EnumC5848i.CURRENCY)), C10773s.m38547a(EnumC5852m.DESCRIPTION, new b(enumC5850k3, EnumC5848i.DESCRIPTION)), C10773s.m38547a(EnumC5852m.LEVEL, new b(enumC5850k3, EnumC5848i.LEVEL)), C10773s.m38547a(EnumC5852m.MAX_RATING_VALUE, new b(enumC5850k3, EnumC5848i.MAX_RATING_VALUE)), C10773s.m38547a(EnumC5852m.NUM_ITEMS, new b(enumC5850k3, EnumC5848i.NUM_ITEMS)), C10773s.m38547a(EnumC5852m.PAYMENT_INFO_AVAILABLE, new b(enumC5850k3, EnumC5848i.PAYMENT_INFO_AVAILABLE)), C10773s.m38547a(EnumC5852m.REGISTRATION_METHOD, new b(enumC5850k3, EnumC5848i.REGISTRATION_METHOD)), C10773s.m38547a(EnumC5852m.SEARCH_STRING, new b(enumC5850k3, EnumC5848i.SEARCH_STRING)), C10773s.m38547a(EnumC5852m.SUCCESS, new b(enumC5850k3, EnumC5848i.SUCCESS)), C10773s.m38547a(EnumC5852m.ORDER_ID, new b(enumC5850k3, EnumC5848i.ORDER_ID)), C10773s.m38547a(EnumC5852m.AD_TYPE, new b(enumC5850k3, EnumC5848i.AD_TYPE)));
        f15029d = C10810q0.m38800l(C10773s.m38547a("fb_mobile_achievement_unlocked", EnumC5849j.UNLOCKED_ACHIEVEMENT), C10773s.m38547a("fb_mobile_activate_app", EnumC5849j.ACTIVATED_APP), C10773s.m38547a("fb_mobile_add_payment_info", EnumC5849j.ADDED_PAYMENT_INFO), C10773s.m38547a("fb_mobile_add_to_cart", EnumC5849j.ADDED_TO_CART), C10773s.m38547a("fb_mobile_add_to_wishlist", EnumC5849j.ADDED_TO_WISHLIST), C10773s.m38547a("fb_mobile_complete_registration", EnumC5849j.COMPLETED_REGISTRATION), C10773s.m38547a("fb_mobile_content_view", EnumC5849j.VIEWED_CONTENT), C10773s.m38547a("fb_mobile_initiated_checkout", EnumC5849j.INITIATED_CHECKOUT), C10773s.m38547a("fb_mobile_level_achieved", EnumC5849j.ACHIEVED_LEVEL), C10773s.m38547a("fb_mobile_purchase", EnumC5849j.PURCHASED), C10773s.m38547a("fb_mobile_rate", EnumC5849j.RATED), C10773s.m38547a("fb_mobile_search", EnumC5849j.SEARCHED), C10773s.m38547a("fb_mobile_spent_credits", EnumC5849j.SPENT_CREDITS), C10773s.m38547a("fb_mobile_tutorial_completion", EnumC5849j.COMPLETED_TUTORIAL));
    }

    private C5846g() {
    }

    /* renamed from: b */
    private final List<Map<String, Object>> m12315b(Map<String, ? extends Object> map, List<? extends Map<String, ? extends Object>> list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    /* renamed from: c */
    private final List<Map<String, Object>> m12316c(Map<String, ? extends Object> map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(EnumC5848i.EVENT_NAME.m12356k(), EnumC5853n.MOBILE_APP_INSTALL.m12367k());
        linkedHashMap.put(EnumC5848i.EVENT_TIME.m12356k(), obj);
        return C10815t.m38883e(linkedHashMap);
    }

    /* renamed from: f */
    private final EnumC5843d m12317f(Map<String, ? extends Object> map, Map<String, Object> map2, Map<String, Object> map3, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map4) {
        Object obj = map.get(EnumC5853n.EVENT.m12367k());
        EnumC5843d.a aVar = EnumC5843d.f14998f;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        EnumC5843d enumC5843dM12304a = aVar.m12304a((String) obj);
        if (enumC5843dM12304a == EnumC5843d.OTHER) {
            return enumC5843dM12304a;
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            EnumC5844e enumC5844eM12307a = EnumC5844e.f15003f.m12307a(key);
            if (enumC5844eM12307a != null) {
                f15026a.m12326g(map2, map3, enumC5844eM12307a, value);
            } else {
                boolean zM32341a = C9801m.m32341a(key, EnumC5850k.CUSTOM_EVENTS.m12360k());
                boolean z = value instanceof String;
                if (enumC5843dM12304a == EnumC5843d.CUSTOM && zM32341a && z) {
                    ArrayList<Map<String, Object>> arrayListM12321k = m12321k((String) value);
                    if (arrayListM12321k != null) {
                        arrayList.addAll(arrayListM12321k);
                    }
                } else if (a.f15030f.m12329a(key) != null) {
                    map4.put(key, value);
                }
            }
        }
        return enumC5843dM12304a;
    }

    /* renamed from: h */
    private final void m12318h(Map<String, Object> map, EnumC5844e enumC5844e, Object obj) {
        c cVar = f15027b.get(enumC5844e);
        EnumC5851l enumC5851lM12332a = cVar == null ? null : cVar.m12332a();
        if (enumC5851lM12332a == null) {
            return;
        }
        map.put(enumC5851lM12332a.m12362k(), obj);
    }

    /* renamed from: i */
    private final void m12319i(Map<String, Object> map, EnumC5844e enumC5844e, Object obj) {
        if (enumC5844e == EnumC5844e.USER_DATA) {
            try {
                C5696p0 c5696p0 = C5696p0.f14478a;
                map.putAll(C5696p0.m11578l(new JSONObject((String) obj)));
                return;
            } catch (JSONException e2) {
                C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e2);
                return;
            }
        }
        c cVar = f15027b.get(enumC5844e);
        EnumC5851l enumC5851lM12332a = cVar == null ? null : cVar.m12332a();
        if (enumC5851lM12332a == null) {
            return;
        }
        map.put(enumC5851lM12332a.m12362k(), obj);
    }

    /* renamed from: j */
    private final String m12320j(String str) {
        Map<String, EnumC5849j> map = f15029d;
        if (!map.containsKey(str)) {
            return str;
        }
        EnumC5849j enumC5849j = map.get(str);
        return enumC5849j == null ? HttpUrl.FRAGMENT_ENCODE_SET : enumC5849j.m12358k();
    }

    /* renamed from: k */
    public static final ArrayList<Map<String, Object>> m12321k(String str) {
        C9801m.m32346f(str, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            C5696p0 c5696p0 = C5696p0.f14478a;
            for (String str2 : C5696p0.m11576k(new JSONArray(str))) {
                C5696p0 c5696p02 = C5696p0.f14478a;
                arrayList.add(C5696p0.m11578l(new JSONObject(str2)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList<Map<String, Object>> arrayList2 = new ArrayList<>();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str3 : map.keySet()) {
                    EnumC5852m enumC5852mM12365a = EnumC5852m.f15118f.m12365a(str3);
                    b bVar = f15028c.get(enumC5852mM12365a);
                    if (enumC5852mM12365a != null && bVar != null) {
                        EnumC5850k enumC5850kM12331b = bVar.m12331b();
                        if (enumC5850kM12331b == null) {
                            try {
                                String strM12356k = bVar.m12330a().m12356k();
                                if (enumC5852mM12365a == EnumC5852m.EVENT_NAME && ((String) map.get(str3)) != null) {
                                    C5846g c5846g = f15026a;
                                    Object obj = map.get(str3);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    linkedHashMap2.put(strM12356k, c5846g.m12320j((String) obj));
                                } else if (enumC5852mM12365a == EnumC5852m.EVENT_TIME && ((Integer) map.get(str3)) != null) {
                                    Object obj2 = map.get(str3);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    Object objM12322l = m12322l(str3, obj2);
                                    if (objM12322l == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    linkedHashMap2.put(strM12356k, objM12322l);
                                }
                            } catch (ClassCastException e2) {
                                C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", C9821b.m32368b(e2));
                            }
                        } else if (enumC5850kM12331b == EnumC5850k.CUSTOM_DATA) {
                            String strM12356k2 = bVar.m12330a().m12356k();
                            Object obj3 = map.get(str3);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            Object objM12322l2 = m12322l(str3, obj3);
                            if (objM12322l2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(strM12356k2, objM12322l2);
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(EnumC5850k.CUSTOM_DATA.m12360k(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e3) {
            C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str, e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    /* renamed from: l */
    public static final Object m12322l(String str, Object obj) {
        C9801m.m32346f(str, "field");
        C9801m.m32346f(obj, "value");
        d dVarM12335a = d.f15040f.m12335a(str);
        String str2 = obj instanceof String ? (String) obj : null;
        if (dVarM12335a == null || str2 == null) {
            return obj;
        }
        int i2 = e.f15045a[dVarM12335a.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return C10545t.m37503j(obj.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer numM37503j = C10545t.m37503j(str2);
            if (numM37503j != null) {
                return Boolean.valueOf(numM37503j.intValue() != 0);
            }
            return null;
        }
        try {
            C5696p0 c5696p0 = C5696p0.f14478a;
            List<String> listM11576k = C5696p0.m11576k(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            Iterator it = listM11576k.iterator();
            while (it.hasNext()) {
                ?? M11576k = (String) it.next();
                try {
                    try {
                        C5696p0 c5696p02 = C5696p0.f14478a;
                        M11576k = C5696p0.m11578l(new JSONObject((String) M11576k));
                    } catch (JSONException unused) {
                        C5696p0 c5696p03 = C5696p0.f14478a;
                        M11576k = C5696p0.m11576k(new JSONArray((String) M11576k));
                    }
                } catch (JSONException unused2) {
                }
                arrayList.add(M11576k);
            }
            return arrayList;
        } catch (JSONException e2) {
            C5684j0.f14429a.m11455c(EnumC5659g0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e2);
            return C10775u.f41439a;
        }
    }

    /* renamed from: a */
    public final List<Map<String, Object>> m12323a(EnumC5843d enumC5843d, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, List<? extends Map<String, ? extends Object>> list, Object obj) {
        C9801m.m32346f(enumC5843d, "eventType");
        C9801m.m32346f(map, "userData");
        C9801m.m32346f(map2, "appData");
        C9801m.m32346f(map3, "restOfData");
        C9801m.m32346f(list, "customEvents");
        Map<String, Object> mapM12324d = m12324d(map, map2, map3);
        int i2 = e.f15047c[enumC5843d.ordinal()];
        if (i2 == 1) {
            return m12316c(mapM12324d, obj);
        }
        if (i2 != 2) {
            return null;
        }
        return m12315b(mapM12324d, list);
    }

    /* renamed from: d */
    public final Map<String, Object> m12324d(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        C9801m.m32346f(map, "userData");
        C9801m.m32346f(map2, "appData");
        C9801m.m32346f(map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC5853n.ACTION_SOURCE.m12367k(), EnumC5853n.APP.m12367k());
        linkedHashMap.put(EnumC5850k.USER_DATA.m12360k(), map);
        linkedHashMap.put(EnumC5850k.APP_DATA.m12360k(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    /* renamed from: e */
    public final List<Map<String, Object>> m12325e(Map<String, ? extends Object> map) {
        C9801m.m32346f(map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        EnumC5843d enumC5843dM12317f = m12317f(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (enumC5843dM12317f == EnumC5843d.OTHER) {
            return null;
        }
        return m12323a(enumC5843dM12317f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(EnumC5853n.INSTALL_EVENT_TIME.m12367k()));
    }

    /* renamed from: g */
    public final void m12326g(Map<String, Object> map, Map<String, Object> map2, EnumC5844e enumC5844e, Object obj) {
        C9801m.m32346f(map, "userData");
        C9801m.m32346f(map2, "appData");
        C9801m.m32346f(enumC5844e, "field");
        C9801m.m32346f(obj, "value");
        c cVar = f15027b.get(enumC5844e);
        if (cVar == null) {
            return;
        }
        int i2 = e.f15046b[cVar.m12333b().ordinal()];
        if (i2 == 1) {
            m12318h(map2, enumC5844e, obj);
        } else {
            if (i2 != 2) {
                return;
            }
            m12319i(map, enumC5844e, obj);
        }
    }
}
