package cm.aptoide.p092pt.promotions;

import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class PromotionsModel {
    private final List<PromotionApp> appsList;
    private final String description;
    private final String dialogDescription;
    private final String featureGraphic;
    private final boolean isError;
    private final boolean isWalletInstalled;
    private final String promotionId;
    private final String title;

    public PromotionsModel(String str, List<PromotionApp> list, String str2, String str3, boolean z, boolean z2, String str4, String str5) {
        this.promotionId = str;
        this.appsList = list;
        this.title = str2;
        this.featureGraphic = str3;
        this.isWalletInstalled = z;
        this.isError = z2;
        this.description = str4;
        this.dialogDescription = str5;
    }

    public static PromotionsModel ofError() {
        return new PromotionsModel("n/a", Collections.emptyList(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, true, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public List<PromotionApp> getAppsList() {
        return this.appsList;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDialogDescription() {
        return this.dialogDescription;
    }

    public String getFeatureGraphic() {
        return this.featureGraphic;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isError() {
        return this.isError;
    }

    public boolean isWalletInstalled() {
        return this.isWalletInstalled;
    }
}
