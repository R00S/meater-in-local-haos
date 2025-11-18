package cm.aptoide.p092pt.home.bundles.base;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: EditorialActionBundle.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/base/EditorialActionBundle;", "Lcm/aptoide/pt/home/bundles/base/ActionBundle;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "type", "Lcm/aptoide/pt/home/bundles/base/HomeBundle$BundleType;", "event", "Lcm/aptoide/pt/dataprovider/model/v7/Event;", StoreTabGridRecyclerFragment.BundleCons.TAG, "actionItem", "Lcm/aptoide/pt/home/bundles/base/ActionItem;", "bonusAppcModel", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "(Ljava/lang/String;Lcm/aptoide/pt/home/bundles/base/HomeBundle$BundleType;Lcm/aptoide/pt/dataprovider/model/v7/Event;Ljava/lang/String;Lcm/aptoide/pt/home/bundles/base/ActionItem;Lcm/aptoide/pt/bonus/BonusAppcModel;)V", "getBonusAppcModel", "()Lcm/aptoide/pt/bonus/BonusAppcModel;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EditorialActionBundle extends ActionBundle {
    private final BonusAppcModel bonusAppcModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorialActionBundle(String str, HomeBundle.BundleType bundleType, Event event, String str2, ActionItem actionItem, BonusAppcModel bonusAppcModel) {
        super(str, bundleType, event, str2, actionItem);
        C9801m.m32346f(str, "title");
        C9801m.m32346f(bundleType, "type");
        C9801m.m32346f(str2, StoreTabGridRecyclerFragment.BundleCons.TAG);
        C9801m.m32346f(actionItem, "actionItem");
        C9801m.m32346f(bonusAppcModel, "bonusAppcModel");
        this.bonusAppcModel = bonusAppcModel;
    }

    public final BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }
}
