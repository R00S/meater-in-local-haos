package com.facebook.p157o0.p159l0;

import java.util.Arrays;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.e */
/* loaded from: classes.dex */
public enum EnumC5844e {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
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


    /* renamed from: f */
    public static final a f15003f = new a(null);

    /* renamed from: y */
    private final String f15022y;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final EnumC5844e m12307a(String str) {
            C9801m.m32346f(str, "rawValue");
            for (EnumC5844e enumC5844e : EnumC5844e.valuesCustom()) {
                if (C9801m.m32341a(enumC5844e.m12306k(), str)) {
                    return enumC5844e;
                }
            }
            return null;
        }
    }

    EnumC5844e(String str) {
        this.f15022y = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5844e[] valuesCustom() {
        EnumC5844e[] enumC5844eArrValuesCustom = values();
        return (EnumC5844e[]) Arrays.copyOf(enumC5844eArrValuesCustom, enumC5844eArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12306k() {
        return this.f15022y;
    }
}
