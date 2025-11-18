package cm.aptoide.p092pt.navigator;

import android.content.Context;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.link.CustomTabsHelper;
import cm.aptoide.p092pt.themes.ThemeManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ExternalNavigator.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m32267d2 = {"Lcm/aptoide/pt/navigator/ExternalNavigator;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "(Landroid/content/Context;Lcm/aptoide/pt/themes/ThemeManager;)V", "getContext", "()Landroid/content/Context;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "navigateToExternalWebsite", HttpUrl.FRAGMENT_ENCODE_SET, "url", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class ExternalNavigator {
    private final Context context;
    private final ThemeManager themeManager;

    public ExternalNavigator(Context context, ThemeManager themeManager) {
        C9801m.m32346f(context, "context");
        C9801m.m32346f(themeManager, "themeManager");
        this.context = context;
        this.themeManager = themeManager;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final void navigateToExternalWebsite(String url) {
        C9801m.m32346f(url, "url");
        CustomTabsHelper.getInstance().openInChromeCustomTab(url, this.context, this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).resourceId);
    }
}
