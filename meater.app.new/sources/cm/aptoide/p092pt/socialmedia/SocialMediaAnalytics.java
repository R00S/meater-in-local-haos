package cm.aptoide.p092pt.socialmedia;

import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SocialMediaAnalytics.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/pt/socialmedia/SocialMediaAnalytics;", HttpUrl.FRAGMENT_ENCODE_SET, "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "navigationTracker", "Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "(Lcm/aptoide/analytics/AnalyticsManager;Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;)V", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "getNavigationTracker", "()Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "mapSocialMediaTypeToAction", HttpUrl.FRAGMENT_ENCODE_SET, "socialMediaType", "Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", "sendPromoteSocialMediaClickEvent", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class SocialMediaAnalytics {
    public static final String PROMOTE_SOCIAL_MEDIA_EVENT_NAME = "promote_social_media_click";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FACEBOOK_ACTION = "facebook";
    private static final String TWITTER_ACTION = "twitter";
    private static final String INSTAGRAM_ACTION = "instagram";
    private static final String TIKTOK_ACTION = "tiktok";
    private static final String ACTION = "action";
    private static final String CONTEXT = "context";

    /* compiled from: SocialMediaAnalytics.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/pt/socialmedia/SocialMediaAnalytics$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ACTION", HttpUrl.FRAGMENT_ENCODE_SET, "getACTION", "()Ljava/lang/String;", "CONTEXT", "getCONTEXT", "FACEBOOK_ACTION", "getFACEBOOK_ACTION", "INSTAGRAM_ACTION", "getINSTAGRAM_ACTION", "PROMOTE_SOCIAL_MEDIA_EVENT_NAME", "TIKTOK_ACTION", "getTIKTOK_ACTION", "TWITTER_ACTION", "getTWITTER_ACTION", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        public final String getACTION() {
            return SocialMediaAnalytics.ACTION;
        }

        public final String getCONTEXT() {
            return SocialMediaAnalytics.CONTEXT;
        }

        public final String getFACEBOOK_ACTION() {
            return SocialMediaAnalytics.FACEBOOK_ACTION;
        }

        public final String getINSTAGRAM_ACTION() {
            return SocialMediaAnalytics.INSTAGRAM_ACTION;
        }

        public final String getTIKTOK_ACTION() {
            return SocialMediaAnalytics.TIKTOK_ACTION;
        }

        public final String getTWITTER_ACTION() {
            return SocialMediaAnalytics.TWITTER_ACTION;
        }
    }

    /* compiled from: SocialMediaAnalytics.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialMediaView.SocialMediaType.values().length];
            iArr[SocialMediaView.SocialMediaType.FACEBOOK_CLICK.ordinal()] = 1;
            iArr[SocialMediaView.SocialMediaType.TWITTER_CLICK.ordinal()] = 2;
            iArr[SocialMediaView.SocialMediaType.INSTAGRAM_CLICK.ordinal()] = 3;
            iArr[SocialMediaView.SocialMediaType.TIKTOK_CLICK.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SocialMediaAnalytics(AnalyticsManager analyticsManager, NavigationTracker navigationTracker) {
        C9801m.m32346f(analyticsManager, "analyticsManager");
        C9801m.m32346f(navigationTracker, "navigationTracker");
        this.analyticsManager = analyticsManager;
        this.navigationTracker = navigationTracker;
    }

    private final String mapSocialMediaTypeToAction(SocialMediaView.SocialMediaType socialMediaType) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[socialMediaType.ordinal()];
        if (i2 == 1) {
            return FACEBOOK_ACTION;
        }
        if (i2 == 2) {
            return TWITTER_ACTION;
        }
        if (i2 == 3) {
            return INSTAGRAM_ACTION;
        }
        if (i2 == 4) {
            return TIKTOK_ACTION;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public final void sendPromoteSocialMediaClickEvent(SocialMediaView.SocialMediaType socialMediaType) {
        C9801m.m32346f(socialMediaType, "socialMediaType");
        HashMap map = new HashMap();
        map.put(ACTION, mapSocialMediaTypeToAction(socialMediaType));
        String str = CONTEXT;
        String viewName = this.navigationTracker.getViewName(true);
        C9801m.m32345e(viewName, "navigationTracker.getViewName(true)");
        map.put(str, viewName);
        this.analyticsManager.logEvent(map, PROMOTE_SOCIAL_MEDIA_EVENT_NAME, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }
}
