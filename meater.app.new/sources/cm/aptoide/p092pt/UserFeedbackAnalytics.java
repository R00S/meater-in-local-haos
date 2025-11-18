package cm.aptoide.p092pt;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: UserFeedbackAnalytics.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, m32267d2 = {"Lcm/aptoide/pt/UserFeedbackAnalytics;", HttpUrl.FRAGMENT_ENCODE_SET, "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "navigationTracker", "Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "(Lcm/aptoide/analytics/AnalyticsManager;Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;)V", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "getNavigationTracker", "()Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "sendAppReviewReplyComment", HttpUrl.FRAGMENT_ENCODE_SET, "sendFirstLevelCommentEvent", "context", HttpUrl.FRAGMENT_ENCODE_SET, "sendRatingEvent", "sendReactionEvent", "sendStoreCommentEvent", "sendStoreCommentReplyEvent", "sendSubmitAppRateEvent", "hasComment", HttpUrl.FRAGMENT_ENCODE_SET, "sendUserFeedbackEvent", "type", "sendVoteDownEvent", "sendVoteUpEvent", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class UserFeedbackAnalytics {
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static String USER_FEEDBACK_EVENT_NAME = "user_feedback";
    private static String TYPE = "type";
    private static String CONTEXT = "context";
    private static String TYPE_COMMENT_LEVEL_1 = "comment_level_1";
    private static String TYPE_COMMENT_LEVEL_2 = "comment_level_2";
    private static String TYPE_RATE = "rate";
    private static String TYPE_VOTE_UP = "vote_up";
    private static String TYPE_VOTE_DOWN = "vote_down";
    private static String TYPE_REACTION = "reaction";
    private static String CONTEXT_APP = "app";
    private static String CONTEXT_STORES = "stores";
    private static String CONTEXT_EDITORIAL = DeepLinkIntentReceiver.DeepLinksTargets.EDITORIAL_DEEPLINK;

    /* compiled from: UserFeedbackAnalytics.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u0012\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m32267d2 = {"Lcm/aptoide/pt/UserFeedbackAnalytics$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "CONTEXT", HttpUrl.FRAGMENT_ENCODE_SET, "getCONTEXT", "()Ljava/lang/String;", "setCONTEXT", "(Ljava/lang/String;)V", "CONTEXT_APP", "getCONTEXT_APP", "setCONTEXT_APP", "CONTEXT_EDITORIAL", "getCONTEXT_EDITORIAL", "setCONTEXT_EDITORIAL", "CONTEXT_STORES", "getCONTEXT_STORES", "setCONTEXT_STORES", "TYPE", "getTYPE", "setTYPE", "TYPE_COMMENT_LEVEL_1", "getTYPE_COMMENT_LEVEL_1", "setTYPE_COMMENT_LEVEL_1", "TYPE_COMMENT_LEVEL_2", "getTYPE_COMMENT_LEVEL_2", "setTYPE_COMMENT_LEVEL_2", "TYPE_RATE", "getTYPE_RATE", "setTYPE_RATE", "TYPE_REACTION", "getTYPE_REACTION", "setTYPE_REACTION", "TYPE_VOTE_DOWN", "getTYPE_VOTE_DOWN", "setTYPE_VOTE_DOWN", "TYPE_VOTE_UP", "getTYPE_VOTE_UP", "setTYPE_VOTE_UP", "USER_FEEDBACK_EVENT_NAME", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        public final String getCONTEXT() {
            return UserFeedbackAnalytics.CONTEXT;
        }

        public final String getCONTEXT_APP() {
            return UserFeedbackAnalytics.CONTEXT_APP;
        }

        public final String getCONTEXT_EDITORIAL() {
            return UserFeedbackAnalytics.CONTEXT_EDITORIAL;
        }

        public final String getCONTEXT_STORES() {
            return UserFeedbackAnalytics.CONTEXT_STORES;
        }

        public final String getTYPE() {
            return UserFeedbackAnalytics.TYPE;
        }

        public final String getTYPE_COMMENT_LEVEL_1() {
            return UserFeedbackAnalytics.TYPE_COMMENT_LEVEL_1;
        }

        public final String getTYPE_COMMENT_LEVEL_2() {
            return UserFeedbackAnalytics.TYPE_COMMENT_LEVEL_2;
        }

        public final String getTYPE_RATE() {
            return UserFeedbackAnalytics.TYPE_RATE;
        }

        public final String getTYPE_REACTION() {
            return UserFeedbackAnalytics.TYPE_REACTION;
        }

        public final String getTYPE_VOTE_DOWN() {
            return UserFeedbackAnalytics.TYPE_VOTE_DOWN;
        }

        public final String getTYPE_VOTE_UP() {
            return UserFeedbackAnalytics.TYPE_VOTE_UP;
        }

        public final void setCONTEXT(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.CONTEXT = str;
        }

        public final void setCONTEXT_APP(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.CONTEXT_APP = str;
        }

        public final void setCONTEXT_EDITORIAL(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.CONTEXT_EDITORIAL = str;
        }

        public final void setCONTEXT_STORES(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.CONTEXT_STORES = str;
        }

        public final void setTYPE(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.TYPE = str;
        }

        public final void setTYPE_COMMENT_LEVEL_1(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_COMMENT_LEVEL_1 = str;
        }

        public final void setTYPE_COMMENT_LEVEL_2(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_COMMENT_LEVEL_2 = str;
        }

        public final void setTYPE_RATE(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_RATE = str;
        }

        public final void setTYPE_REACTION(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_REACTION = str;
        }

        public final void setTYPE_VOTE_DOWN(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_VOTE_DOWN = str;
        }

        public final void setTYPE_VOTE_UP(String str) {
            C9801m.m32346f(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_VOTE_UP = str;
        }
    }

    public UserFeedbackAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        C9801m.m32346f(analyticsManager, "analyticsManager");
        C9801m.m32346f(navigationTracker, "navigationTracker");
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private final void sendFirstLevelCommentEvent(String context) {
        sendUserFeedbackEvent(context, TYPE_COMMENT_LEVEL_1);
    }

    private final void sendRatingEvent(String context) {
        sendUserFeedbackEvent(context, TYPE_RATE);
    }

    private final void sendUserFeedbackEvent(String context, String type) {
        HashMap map = new HashMap();
        map.put(TYPE, type);
        map.put(CONTEXT, context);
        this.analyticsManager.logEvent(map, USER_FEEDBACK_EVENT_NAME, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public final void sendAppReviewReplyComment() {
        sendUserFeedbackEvent(CONTEXT_APP, TYPE_COMMENT_LEVEL_2);
    }

    public void sendReactionEvent() {
        sendUserFeedbackEvent(CONTEXT_EDITORIAL, TYPE_REACTION);
    }

    public final void sendStoreCommentEvent() {
        sendUserFeedbackEvent(CONTEXT_STORES, TYPE_COMMENT_LEVEL_1);
    }

    public final void sendStoreCommentReplyEvent() {
        sendUserFeedbackEvent(CONTEXT_STORES, TYPE_COMMENT_LEVEL_2);
    }

    public final void sendSubmitAppRateEvent(boolean hasComment) {
        sendRatingEvent(CONTEXT_APP);
        if (hasComment) {
            sendFirstLevelCommentEvent(CONTEXT_APP);
        }
    }

    public final void sendVoteDownEvent() {
        sendUserFeedbackEvent(CONTEXT_APP, TYPE_VOTE_DOWN);
    }

    public final void sendVoteUpEvent() {
        sendUserFeedbackEvent(CONTEXT_APP, TYPE_VOTE_UP);
    }
}
