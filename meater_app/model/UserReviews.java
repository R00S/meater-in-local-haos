package com.apptionlabs.meater_app.model;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import bn.s;
import cl.e0;
import com.apptionlabs.meater_app.activities.j;
import com.apptionlabs.meater_app.cloud.requests.ReviewActionRequest;
import com.apptionlabs.meater_app.cloud.requests.ReviewCheckRequest;
import com.apptionlabs.meater_app.cloud.responses.ReviewCheckResponse;
import com.apptionlabs.meater_app.data.ReviewReasonType;
import com.apptionlabs.meater_app.model.UserReviews;
import f8.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import lm.b;
import vh.l;
import wh.m;

/* compiled from: UserReviews.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/apptionlabs/meater_app/model/UserReviews;", "", "()V", "Companion", "UserReviewAction", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /tmp/meat/meat/classes.dex */
public final class UserReviews {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final v7.a client = lm.d.i(lm.d.f17383a, true, null, 2, null);
    private static final List<Long> cookIDs = new ArrayList();
    private static boolean hasPromptedForReviewInThisSession;

    /* compiled from: UserReviews.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/apptionlabs/meater_app/model/UserReviews$Companion;", "", "Lcom/apptionlabs/meater_app/data/ReviewReasonType;", "reasonType", "", "cookID", "Lih/u;", "askUserToReviewMEATERIfNeeded", "reason", "requestFailed", "Landroid/app/Activity;", "activity", "Lcom/apptionlabs/meater_app/model/UserReviews$UserReviewAction;", "action", "showRateAppDialog", "askUserToReviewMEATERIfNeededOnDeviceConnection", "askUserToReviewMEATERIfNeededOnCookFinished", "Lv7/a;", "client", "Lv7/a;", "", "cookIDs", "Ljava/util/List;", "", "hasPromptedForReviewInThisSession", "Z", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {

        /* compiled from: UserReviews.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: /tmp/meat/meat/classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReviewReasonType.values().length];
                try {
                    iArr[ReviewReasonType.DEVICE_CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReviewReasonType.COOK_FINISHED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(wh.g gVar) {
            this();
        }

        private final void askUserToReviewMEATERIfNeeded(final ReviewReasonType reviewReasonType, final long j10) {
            if (com.apptionlabs.meater_app.app.a.u().i0() && com.apptionlabs.meater_app.app.a.u().k() != null) {
                if (reviewReasonType == ReviewReasonType.DEVICE_CONNECTED) {
                    if (!UserReviews.hasPromptedForReviewInThisSession) {
                        UserReviews.hasPromptedForReviewInThisSession = true;
                    } else {
                        return;
                    }
                }
                if (reviewReasonType == ReviewReasonType.COOK_FINISHED) {
                    if (UserReviews.cookIDs.contains(Long.valueOf(j10))) {
                        return;
                    } else {
                        UserReviews.cookIDs.add(Long.valueOf(j10));
                    }
                }
                lm.b.l(b.EnumC0292b.V0, null, null, null, 8, null);
                UserReviews.client.D(new ReviewCheckRequest(null, reviewReasonType.getReason(), 1, null)).enqueue(new bn.d<ReviewCheckResponse>() { // from class: com.apptionlabs.meater_app.model.UserReviews$Companion$askUserToReviewMEATERIfNeeded$1
                    public void onFailure(bn.b<ReviewCheckResponse> bVar, Throwable th) {
                        m.f(bVar, "call");
                        m.f(th, "t");
                        k6.b.e(UserReviews$Companion$askUserToReviewMEATERIfNeeded$1.class.getSimpleName(), "Problem fetch review action: " + th.getLocalizedMessage());
                        UserReviews.INSTANCE.requestFailed(ReviewReasonType.this, j10);
                    }

                    public void onResponse(bn.b<ReviewCheckResponse> bVar, s<ReviewCheckResponse> sVar) {
                        String str;
                        m.f(bVar, "call");
                        m.f(sVar, "response");
                        ReviewCheckResponse reviewCheckResponse = (ReviewCheckResponse) sVar.a();
                        if (reviewCheckResponse == null || (str = reviewCheckResponse.getAction()) == null) {
                            str = "";
                        }
                        if (m.a(str, UserReviews.UserReviewAction.NoAction.getRaw())) {
                            lm.b.l(b.EnumC0292b.W0, null, null, null, 8, null);
                            return;
                        }
                        if (!m.a(str, UserReviews.UserReviewAction.AmazonReviewDialog.getRaw()) && !m.a(str, UserReviews.UserReviewAction.AppReviewDialog.getRaw())) {
                            UserReviews.INSTANCE.requestFailed(ReviewReasonType.this, j10);
                            return;
                        }
                        j l10 = com.apptionlabs.meater_app.app.a.l();
                        if (l10 != null) {
                            UserReviews.INSTANCE.showRateAppDialog(l10, UserReviews.UserReviewAction.INSTANCE.from(str), ReviewReasonType.this);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void requestFailed(ReviewReasonType reviewReasonType, long j10) {
            lm.b.l(b.EnumC0292b.X0, null, null, null, 8, null);
            int i10 = WhenMappings.$EnumSwitchMapping$0[reviewReasonType.ordinal()];
            if (i10 == 1) {
                UserReviews.hasPromptedForReviewInThisSession = false;
            } else if (i10 == 2) {
                UserReviews.cookIDs.remove(Long.valueOf(j10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r5v0, types: [com.apptionlabs.meater_app.model.UserReviews$Companion$showRateAppDialog$callback$1] */
        public final void showRateAppDialog(final Activity activity, final UserReviewAction userReviewAction, final ReviewReasonType reviewReasonType) {
            final ?? r52 = new bn.d<e0>() { // from class: com.apptionlabs.meater_app.model.UserReviews$Companion$showRateAppDialog$callback$1
                public void onFailure(bn.b<e0> bVar, Throwable th) {
                    m.f(bVar, "call");
                    m.f(th, "t");
                    k6.b.e(UserReviews$Companion$showRateAppDialog$callback$1.class.getSimpleName(), "Problem recording review action: " + th.getLocalizedMessage());
                }

                public void onResponse(bn.b<e0> bVar, s<e0> sVar) {
                    String str;
                    m.f(bVar, "call");
                    m.f(sVar, "response");
                    if (sVar.f()) {
                        k6.b.e("Recorded review action", new Object[0]);
                        return;
                    }
                    e0 d10 = sVar.d();
                    if (d10 != null) {
                        str = d10.j();
                    } else {
                        str = null;
                    }
                    onFailure(bVar, new Throwable(str));
                }
            };
            if (activity.getResources().getBoolean(2131034114)) {
                lm.b.l(b.EnumC0292b.Y0, null, null, null, 8, null);
                new AlertDialog.Builder(activity).setTitle(activity.getString(2132018486)).setMessage(activity.getString(userReviewAction.getDialogText())).setPositiveButton(activity.getString(2132018485), new DialogInterface.OnClickListener() { // from class: com.apptionlabs.meater_app.model.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        UserReviews.Companion.showRateAppDialog$lambda$0(UserReviews.UserReviewAction.this, reviewReasonType, r52, activity, dialogInterface, i10);
                    }
                }).setNegativeButton(activity.getString(2132017977), new DialogInterface.OnClickListener() { // from class: com.apptionlabs.meater_app.model.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        dialogInterface.cancel();
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.apptionlabs.meater_app.model.e
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        UserReviews.Companion.showRateAppDialog$lambda$2(UserReviews.UserReviewAction.this, reviewReasonType, r52, dialogInterface);
                    }
                }).show().setCanceledOnTouchOutside(false);
                return;
            }
            dd.a a10 = com.google.android.play.core.review.a.a(activity);
            m.e(a10, "create(...)");
            gd.d b10 = a10.b();
            final UserReviews$Companion$showRateAppDialog$1 userReviews$Companion$showRateAppDialog$1 = new UserReviews$Companion$showRateAppDialog$1(a10, activity, userReviewAction, reviewReasonType, r52);
            b10.c(new gd.c() { // from class: com.apptionlabs.meater_app.model.f
                public final void a(Object obj) {
                    UserReviews.Companion.showRateAppDialog$lambda$3(userReviews$Companion$showRateAppDialog$1, obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showRateAppDialog$lambda$0(UserReviewAction userReviewAction, ReviewReasonType reviewReasonType, UserReviews$Companion$showRateAppDialog$callback$1 userReviews$Companion$showRateAppDialog$callback$1, Activity activity, DialogInterface dialogInterface, int i10) {
            m.f(userReviewAction, "$action");
            m.f(reviewReasonType, "$reasonType");
            m.f(userReviews$Companion$showRateAppDialog$callback$1, "$callback");
            m.f(activity, "$activity");
            lm.b.l(b.EnumC0292b.Z0, null, null, null, 8, null);
            UserReviews.client.p(new ReviewActionRequest(userReviewAction.getRaw(), "YES", reviewReasonType.getReason(), null, 8, null)).enqueue(userReviews$Companion$showRateAppDialog$callback$1);
            l0.C(activity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showRateAppDialog$lambda$2(UserReviewAction userReviewAction, ReviewReasonType reviewReasonType, UserReviews$Companion$showRateAppDialog$callback$1 userReviews$Companion$showRateAppDialog$callback$1, DialogInterface dialogInterface) {
            m.f(userReviewAction, "$action");
            m.f(reviewReasonType, "$reasonType");
            m.f(userReviews$Companion$showRateAppDialog$callback$1, "$callback");
            lm.b.l(b.EnumC0292b.f17309a1, null, null, null, 8, null);
            UserReviews.client.p(new ReviewActionRequest(userReviewAction.getRaw(), "NOT-NOW", reviewReasonType.getReason(), null, 8, null)).enqueue(userReviews$Companion$showRateAppDialog$callback$1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showRateAppDialog$lambda$3(l lVar, Object obj) {
            m.f(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        public final void askUserToReviewMEATERIfNeededOnCookFinished(long j10) {
            askUserToReviewMEATERIfNeeded(ReviewReasonType.COOK_FINISHED, j10);
        }

        public final void askUserToReviewMEATERIfNeededOnDeviceConnection() {
            askUserToReviewMEATERIfNeeded(ReviewReasonType.DEVICE_CONNECTED, 0L);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserReviews.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/apptionlabs/meater_app/model/UserReviews$UserReviewAction;", "", "raw", "", "(Ljava/lang/String;ILjava/lang/String;)V", "dialogText", "", "getDialogText", "()I", "getRaw", "()Ljava/lang/String;", "NoAction", "AppReviewDialog", "AmazonReviewDialog", "Companion", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class UserReviewAction {
        private static final /* synthetic */ ph.a $ENTRIES;
        private static final /* synthetic */ UserReviewAction[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String raw;
        public static final UserReviewAction NoAction = new UserReviewAction("NoAction", 0, "NO-ACTION-NEEDED");
        public static final UserReviewAction AppReviewDialog = new UserReviewAction("AppReviewDialog", 1, "APP-REVIEW-DIALOG");
        public static final UserReviewAction AmazonReviewDialog = new UserReviewAction("AmazonReviewDialog", 2, "AMZ-REVIEW-DIALOG");

        /* compiled from: UserReviews.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/apptionlabs/meater_app/model/UserReviews$UserReviewAction$Companion;", "", "()V", "from", "Lcom/apptionlabs/meater_app/model/UserReviews$UserReviewAction;", "raw", "", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: /tmp/meat/meat/classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(wh.g gVar) {
                this();
            }

            public final UserReviewAction from(String raw) {
                UserReviewAction userReviewAction;
                m.f(raw, "raw");
                UserReviewAction[] values = UserReviewAction.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        userReviewAction = values[i10];
                        if (m.a(userReviewAction.getRaw(), raw)) {
                            break;
                        }
                        i10++;
                    } else {
                        userReviewAction = null;
                        break;
                    }
                }
                if (userReviewAction == null) {
                    return UserReviewAction.NoAction;
                }
                return userReviewAction;
            }
        }

        /* compiled from: UserReviews.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: /tmp/meat/meat/classes.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UserReviewAction.values().length];
                try {
                    iArr[UserReviewAction.NoAction.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UserReviewAction.AppReviewDialog.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UserReviewAction.AmazonReviewDialog.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ UserReviewAction[] $values() {
            return new UserReviewAction[]{NoAction, AppReviewDialog, AmazonReviewDialog};
        }

        static {
            UserReviewAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ph.b.a($values);
            INSTANCE = new Companion(null);
        }

        private UserReviewAction(String str, int i10, String str2) {
            this.raw = str2;
        }

        public static ph.a<UserReviewAction> getEntries() {
            return $ENTRIES;
        }

        public static UserReviewAction valueOf(String str) {
            return (UserReviewAction) Enum.valueOf(UserReviewAction.class, str);
        }

        public static UserReviewAction[] values() {
            return (UserReviewAction[]) $VALUES.clone();
        }

        public final int getDialogText() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return 2132018487;
                }
                throw new NoWhenBranchMatchedException();
            }
            return 2132018488;
        }

        public final String getRaw() {
            return this.raw;
        }
    }
}
