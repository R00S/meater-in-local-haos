package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListApps;

/* loaded from: classes.dex */
public class BonusAppcBundle {
    private final BonusAppcModel bonusAppcModel;
    private final ListApps listApps;

    public BonusAppcBundle(ListApps listApps, BonusAppcModel bonusAppcModel) {
        this.listApps = listApps;
        this.bonusAppcModel = bonusAppcModel;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }

    public ListApps getListApps() {
        return this.listApps;
    }
}
