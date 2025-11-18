package cm.aptoide.p092pt.account.view.magiclink;

import android.content.Intent;
import cm.aptoide.p092pt.navigator.ActivityNavigator;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: CheckYourEmailNavigator.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailNavigator;", HttpUrl.FRAGMENT_ENCODE_SET, "activityNavigator", "Lcm/aptoide/pt/navigator/ActivityNavigator;", "(Lcm/aptoide/pt/navigator/ActivityNavigator;)V", "navigateToEmailApp", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CheckYourEmailNavigator {
    private final ActivityNavigator activityNavigator;

    public CheckYourEmailNavigator(ActivityNavigator activityNavigator) {
        this.activityNavigator = activityNavigator;
    }

    public final void navigateToEmailApp() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        ActivityNavigator activityNavigator = this.activityNavigator;
        if (activityNavigator != null) {
            activityNavigator.navigateWithIntent(intent);
        }
    }
}
