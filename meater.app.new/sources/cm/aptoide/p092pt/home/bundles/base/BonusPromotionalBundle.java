package cm.aptoide.p092pt.home.bundles.base;

import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.view.app.ApplicationGraphic;

/* loaded from: classes.dex */
public class BonusPromotionalBundle extends PromotionalBundle {
    private final int bonusPercentage;

    public BonusPromotionalBundle(String str, HomeBundle.BundleType bundleType, Event event, String str2, ApplicationGraphic applicationGraphic, DownloadModel downloadModel, int i2) {
        super(str, bundleType, event, str2, applicationGraphic, downloadModel);
        this.bonusPercentage = i2;
    }

    public int getBonusPercentage() {
        return this.bonusPercentage;
    }
}
