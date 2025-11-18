package cm.aptoide.p092pt.home.bundles.base;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.view.app.Application;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: FeaturedAppcBundle.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/base/FeaturedAppcBundle;", "Lcm/aptoide/pt/home/bundles/base/AppBundle;", "title", HttpUrl.FRAGMENT_ENCODE_SET, DeepLinkIntentReceiver.DeepLinksTargets.APPS, HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/view/app/Application;", "type", "Lcm/aptoide/pt/home/bundles/base/HomeBundle$BundleType;", "event", "Lcm/aptoide/pt/dataprovider/model/v7/Event;", StoreTabGridRecyclerFragment.BundleCons.TAG, "actionTag", "bonusPercentage", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/util/List;Lcm/aptoide/pt/home/bundles/base/HomeBundle$BundleType;Lcm/aptoide/pt/dataprovider/model/v7/Event;Ljava/lang/String;Ljava/lang/String;I)V", "getBonusPercentage", "()I", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FeaturedAppcBundle extends AppBundle {
    private final int bonusPercentage;

    public FeaturedAppcBundle(String str, List<? extends Application> list, HomeBundle.BundleType bundleType, Event event, String str2, String str3, int i2) {
        super(str, list, bundleType, event, str2, str3);
        this.bonusPercentage = i2;
    }

    public final int getBonusPercentage() {
        return this.bonusPercentage;
    }
}
