package com.facebook.p157o0.p159l0;

import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import java.util.Arrays;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.j */
/* loaded from: classes.dex */
public enum EnumC5849j {
    UNLOCKED_ACHIEVEMENT("AchievementUnlocked"),
    ACTIVATED_APP("ActivateApp"),
    ADDED_PAYMENT_INFO("AddPaymentInfo"),
    ADDED_TO_CART("AddToCart"),
    ADDED_TO_WISHLIST("AddToWishlist"),
    COMPLETED_REGISTRATION("CompleteRegistration"),
    VIEWED_CONTENT("ViewContent"),
    INITIATED_CHECKOUT("InitiateCheckout"),
    ACHIEVED_LEVEL("LevelAchieved"),
    PURCHASED("Purchase"),
    RATED("Rate"),
    SEARCHED(SearchAnalytics.SEARCH),
    SPENT_CREDITS("SpentCredits"),
    COMPLETED_TUTORIAL("TutorialCompletion");


    /* renamed from: u */
    private final String f15092u;

    EnumC5849j(String str) {
        this.f15092u = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5849j[] valuesCustom() {
        EnumC5849j[] enumC5849jArrValuesCustom = values();
        return (EnumC5849j[]) Arrays.copyOf(enumC5849jArrValuesCustom, enumC5849jArrValuesCustom.length);
    }

    /* renamed from: k */
    public final String m12358k() {
        return this.f15092u;
    }
}
