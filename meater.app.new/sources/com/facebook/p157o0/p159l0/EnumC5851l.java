package com.facebook.p157o0.p159l0;

import java.util.Arrays;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.l */
/* loaded from: classes.dex */
public enum EnumC5851l {
    ANON_ID("anon_id"),
    FB_LOGIN_ID("fb_login_id"),
    MAD_ID("madid"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");


    /* renamed from: x */
    private final String f15117x;

    EnumC5851l(String str) {
        this.f15117x = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5851l[] valuesCustom() {
        EnumC5851l[] enumC5851lArrValuesCustom = values();
        return (EnumC5851l[]) Arrays.copyOf(enumC5851lArrValuesCustom, enumC5851lArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12362k() {
        return this.f15117x;
    }
}
