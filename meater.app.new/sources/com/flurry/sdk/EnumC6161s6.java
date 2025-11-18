package com.flurry.sdk;

/* renamed from: com.flurry.sdk.s6 */
/* loaded from: classes2.dex */
public enum EnumC6161s6 {
    UNKNOWN(0),
    FLUSH_FRAME(1),
    FRAME_COUNTER(2),
    SESSION_ID(128),
    APP_STATE(132),
    APP_INFO(133),
    ANALYTICS_EVENT(134),
    ANALYTICS_ERROR(137),
    DEVICE_PROPERTIES(139),
    REPORTED_ID(140),
    SESSION_INFO(141),
    SERVER_COOKIES(142),
    DYNAMIC_SESSION_INFO(143),
    REFERRER(145),
    USER_ID(146),
    SESSION_ORIGIN(147),
    LOCALE(148),
    NETWORK(149),
    LOCATION(150),
    PAGE_VIEW(152),
    SESSION_PROPERTIES(153),
    LAUNCH_OPTIONS(155),
    APP_ORIENTATION(156),
    SESSION_PROPERTIES_PARAMS(157),
    NOTIFICATION(158),
    ORIGIN_ATTRIBUTE(160),
    TIMEZONE(162),
    VARIANT_IDS(163),
    REPORTING(164),
    PREVIOUS_SUCCESSFUL_REPORT(166),
    NUM_ERRORS(167),
    GENDER(168),
    BIRTHDATE(169),
    EVENTS_SUMMARY(170),
    USER_PROPERTY(171),
    CONSENT(172),
    CCPA_OPTOUT(174),
    CCPA_DELETION(175),
    EOF(190);


    /* renamed from: T */
    public final int f16372T;

    EnumC6161s6(int i2) {
        this.f16372T = i2;
    }

    /* renamed from: g */
    public static EnumC6161s6 m13306g(int i2) {
        for (EnumC6161s6 enumC6161s6 : values()) {
            if (i2 == enumC6161s6.f16372T) {
                return enumC6161s6;
            }
        }
        return UNKNOWN;
    }
}
