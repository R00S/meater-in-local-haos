package com.apptionlabs.meater_app.model;

import android.app.Activity;
import com.apptionlabs.meater_app.cloud.requests.ReviewActionRequest;
import com.apptionlabs.meater_app.data.ReviewReasonType;
import com.apptionlabs.meater_app.model.UserReviews;
import com.google.android.play.core.review.ReviewInfo;
import ih.u;
import kotlin.Metadata;
import lm.b;
import vh.l;
import wh.m;
import wh.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserReviews.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/play/core/review/ReviewInfo;", "kotlin.jvm.PlatformType", "it", "Lih/u;", "invoke", "(Lcom/google/android/play/core/review/ReviewInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class UserReviews$Companion$showRateAppDialog$1 extends o implements l<ReviewInfo, u> {
    final /* synthetic */ UserReviews.UserReviewAction $action;
    final /* synthetic */ Activity $activity;
    final /* synthetic */ UserReviews$Companion$showRateAppDialog$callback$1 $callback;
    final /* synthetic */ ReviewReasonType $reasonType;
    final /* synthetic */ dd.a $reviewManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserReviews.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Lih/u;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.model.UserReviews$Companion$showRateAppDialog$1$1, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class AnonymousClass1 extends o implements l<Void, u> {
        final /* synthetic */ UserReviews.UserReviewAction $action;
        final /* synthetic */ UserReviews$Companion$showRateAppDialog$callback$1 $callback;
        final /* synthetic */ ReviewReasonType $reasonType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UserReviews.UserReviewAction userReviewAction, ReviewReasonType reviewReasonType, UserReviews$Companion$showRateAppDialog$callback$1 userReviews$Companion$showRateAppDialog$callback$1) {
            super(1);
            this.$action = userReviewAction;
            this.$reasonType = reviewReasonType;
            this.$callback = userReviews$Companion$showRateAppDialog$callback$1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return u.a;
        }

        public final void invoke(Void r92) {
            lm.b.l(b.EnumC0292b.Y0, null, null, null, 8, null);
            UserReviews.client.p(new ReviewActionRequest(this.$action.getRaw(), "MAYBE", this.$reasonType.getReason(), null, 8, null)).enqueue(this.$callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserReviews$Companion$showRateAppDialog$1(dd.a aVar, Activity activity, UserReviews.UserReviewAction userReviewAction, ReviewReasonType reviewReasonType, UserReviews$Companion$showRateAppDialog$callback$1 userReviews$Companion$showRateAppDialog$callback$1) {
        super(1);
        this.$reviewManager = aVar;
        this.$activity = activity;
        this.$action = userReviewAction;
        this.$reasonType = reviewReasonType;
        this.$callback = userReviews$Companion$showRateAppDialog$callback$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(l lVar, Object obj) {
        m.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ReviewInfo) obj);
        return u.a;
    }

    public final void invoke(ReviewInfo reviewInfo) {
        gd.d a10 = this.$reviewManager.a(this.$activity, reviewInfo);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$action, this.$reasonType, this.$callback);
        a10.c(new gd.c() { // from class: com.apptionlabs.meater_app.model.g
            public final void a(Object obj) {
                UserReviews$Companion$showRateAppDialog$1.invoke$lambda$0(anonymousClass1, obj);
            }
        });
    }
}
