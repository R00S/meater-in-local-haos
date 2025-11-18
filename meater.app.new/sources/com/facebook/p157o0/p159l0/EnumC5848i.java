package com.facebook.p157o0.p159l0;

import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import java.util.Arrays;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.i */
/* loaded from: classes.dex */
public enum EnumC5848i {
    VALUE_TO_SUM("value"),
    EVENT_TIME("event_time"),
    EVENT_NAME("event_name"),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE("content_type"),
    DESCRIPTION("description"),
    LEVEL("level"),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION),
    ORDER_ID("order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("currency");


    /* renamed from: x */
    private final String f15076x;

    EnumC5848i(String str) {
        this.f15076x = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5848i[] valuesCustom() {
        EnumC5848i[] enumC5848iArrValuesCustom = values();
        return (EnumC5848i[]) Arrays.copyOf(enumC5848iArrValuesCustom, enumC5848iArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12356k() {
        return this.f15076x;
    }
}
