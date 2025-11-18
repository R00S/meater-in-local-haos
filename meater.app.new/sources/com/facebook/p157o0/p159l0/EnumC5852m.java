package com.facebook.p157o0.p159l0;

import java.util.Arrays;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.m */
/* loaded from: classes.dex */
public enum EnumC5852m {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");


    /* renamed from: f */
    public static final a f15118f = new a(null);

    /* renamed from: y */
    private final String f15137y;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.m$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final EnumC5852m m12365a(String str) {
            C9801m.m32346f(str, "rawValue");
            for (EnumC5852m enumC5852m : EnumC5852m.valuesCustom()) {
                if (C9801m.m32341a(enumC5852m.m12364k(), str)) {
                    return enumC5852m;
                }
            }
            return null;
        }
    }

    EnumC5852m(String str) {
        this.f15137y = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5852m[] valuesCustom() {
        EnumC5852m[] enumC5852mArrValuesCustom = values();
        return (EnumC5852m[]) Arrays.copyOf(enumC5852mArrValuesCustom, enumC5852mArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12364k() {
        return this.f15137y;
    }
}
