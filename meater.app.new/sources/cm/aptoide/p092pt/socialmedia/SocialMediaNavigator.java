package cm.aptoide.p092pt.socialmedia;

import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.navigator.ExternalNavigator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SocialMediaNavigator.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m32267d2 = {"Lcm/aptoide/pt/socialmedia/SocialMediaNavigator;", HttpUrl.FRAGMENT_ENCODE_SET, "externalNavigator", "Lcm/aptoide/pt/navigator/ExternalNavigator;", "(Lcm/aptoide/pt/navigator/ExternalNavigator;)V", "getExternalNavigator", "()Lcm/aptoide/pt/navigator/ExternalNavigator;", "mapSocialMediaTypeToUrl", HttpUrl.FRAGMENT_ENCODE_SET, "socialMediaType", "Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", "navigateToSocialMediaWebsite", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SocialMediaNavigator {
    private final ExternalNavigator externalNavigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String FACEBOOK_URL = "https://facebook.com/aptoide/";
    private static String TWITTER_URL = "https://twitter.com/aptoide";
    private static String INSTAGRAM_URL = "https://www.instagram.com/aptoidestore";
    private static String TIKTOK_URL = "https://www.tiktok.com/@aptoidestore";

    /* compiled from: SocialMediaNavigator.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/pt/socialmedia/SocialMediaNavigator$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "FACEBOOK_URL", HttpUrl.FRAGMENT_ENCODE_SET, "getFACEBOOK_URL", "()Ljava/lang/String;", "setFACEBOOK_URL", "(Ljava/lang/String;)V", "INSTAGRAM_URL", "getINSTAGRAM_URL", "setINSTAGRAM_URL", "TIKTOK_URL", "getTIKTOK_URL", "setTIKTOK_URL", "TWITTER_URL", "getTWITTER_URL", "setTWITTER_URL", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        public final String getFACEBOOK_URL() {
            return SocialMediaNavigator.FACEBOOK_URL;
        }

        public final String getINSTAGRAM_URL() {
            return SocialMediaNavigator.INSTAGRAM_URL;
        }

        public final String getTIKTOK_URL() {
            return SocialMediaNavigator.TIKTOK_URL;
        }

        public final String getTWITTER_URL() {
            return SocialMediaNavigator.TWITTER_URL;
        }

        public final void setFACEBOOK_URL(String str) {
            C9801m.m32346f(str, "<set-?>");
            SocialMediaNavigator.FACEBOOK_URL = str;
        }

        public final void setINSTAGRAM_URL(String str) {
            C9801m.m32346f(str, "<set-?>");
            SocialMediaNavigator.INSTAGRAM_URL = str;
        }

        public final void setTIKTOK_URL(String str) {
            C9801m.m32346f(str, "<set-?>");
            SocialMediaNavigator.TIKTOK_URL = str;
        }

        public final void setTWITTER_URL(String str) {
            C9801m.m32346f(str, "<set-?>");
            SocialMediaNavigator.TWITTER_URL = str;
        }
    }

    /* compiled from: SocialMediaNavigator.kt */
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

    public SocialMediaNavigator(ExternalNavigator externalNavigator) {
        C9801m.m32346f(externalNavigator, "externalNavigator");
        this.externalNavigator = externalNavigator;
    }

    private final String mapSocialMediaTypeToUrl(SocialMediaView.SocialMediaType socialMediaType) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[socialMediaType.ordinal()];
        if (i2 == 1) {
            return FACEBOOK_URL;
        }
        if (i2 == 2) {
            return TWITTER_URL;
        }
        if (i2 == 3) {
            return INSTAGRAM_URL;
        }
        if (i2 == 4) {
            return TIKTOK_URL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ExternalNavigator getExternalNavigator() {
        return this.externalNavigator;
    }

    public final void navigateToSocialMediaWebsite(SocialMediaView.SocialMediaType socialMediaType) {
        C9801m.m32346f(socialMediaType, "socialMediaType");
        this.externalNavigator.navigateToExternalWebsite(mapSocialMediaTypeToUrl(socialMediaType));
    }
}
