package cm.aptoide.p092pt;

import cm.aptoide.p092pt.navigator.ExternalNavigator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: CatappultNavigator.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/pt/CatappultNavigator;", HttpUrl.FRAGMENT_ENCODE_SET, "externalNavigator", "Lcm/aptoide/pt/navigator/ExternalNavigator;", "(Lcm/aptoide/pt/navigator/ExternalNavigator;)V", "navigateToCatappultWebsite", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class CatappultNavigator {
    private final ExternalNavigator externalNavigator;

    public CatappultNavigator(ExternalNavigator externalNavigator) {
        C9801m.m32346f(externalNavigator, "externalNavigator");
        this.externalNavigator = externalNavigator;
    }

    public final void navigateToCatappultWebsite() {
        this.externalNavigator.navigateToExternalWebsite("https://catappult.io/?utm_source=vanilla");
    }
}
