package cm.aptoide.p092pt.app.view;

import cm.aptoide.p092pt.app.AppCoinsAdvertisingModel;
import cm.aptoide.p092pt.bonus.BonusAppcModel;

/* loaded from: classes.dex */
public class AppCoinsViewModel {
    private final AppCoinsAdvertisingModel advertisingModel;
    private final BonusAppcModel bonusAppcModel;
    private final boolean hasBilling;
    private final boolean loading;

    public AppCoinsViewModel(boolean z, boolean z2, AppCoinsAdvertisingModel appCoinsAdvertisingModel, BonusAppcModel bonusAppcModel) {
        this.loading = z;
        this.hasBilling = z2;
        this.advertisingModel = appCoinsAdvertisingModel;
        this.bonusAppcModel = bonusAppcModel;
    }

    public AppCoinsAdvertisingModel getAdvertisingModel() {
        return this.advertisingModel;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }

    public boolean hasAdvertising() {
        AppCoinsAdvertisingModel appCoinsAdvertisingModel = this.advertisingModel;
        if (appCoinsAdvertisingModel != null) {
            return appCoinsAdvertisingModel.getHasAdvertising();
        }
        return false;
    }

    public boolean hasBilling() {
        return this.hasBilling;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public AppCoinsViewModel() {
        this.loading = false;
        this.hasBilling = false;
        this.advertisingModel = new AppCoinsAdvertisingModel();
        this.bonusAppcModel = new BonusAppcModel(false, 0);
    }
}
