package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetApp;

/* loaded from: classes.dex */
public class NewAppCoinsAppPromoItem extends AppPromoItem {
    private final BonusAppcModel bonusAppcModel;

    public NewAppCoinsAppPromoItem(GetApp getApp, BonusAppcModel bonusAppcModel) {
        super(getApp);
        this.bonusAppcModel = bonusAppcModel;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }
}
