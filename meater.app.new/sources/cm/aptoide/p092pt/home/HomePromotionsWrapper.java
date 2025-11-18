package cm.aptoide.p092pt.home;

/* loaded from: classes.dex */
public class HomePromotionsWrapper {
    private final String description;
    private final String featureGraphic;
    private final boolean hasPromotions;
    private final int promotions;
    private final boolean showDialog;
    private final String title;
    private final float totalUnclaimedAppcValue;

    public HomePromotionsWrapper(String str, String str2, boolean z, int i2, float f2, boolean z2, String str3) {
        this.title = str;
        this.featureGraphic = str2;
        this.hasPromotions = z;
        this.promotions = i2;
        this.totalUnclaimedAppcValue = f2;
        this.showDialog = z2;
        this.description = str3;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFeatureGraphic() {
        return this.featureGraphic;
    }

    public int getPromotions() {
        return this.promotions;
    }

    public String getTitle() {
        return this.title;
    }

    public float getTotalUnclaimedAppcValue() {
        return this.totalUnclaimedAppcValue;
    }

    public boolean hasPromotions() {
        return this.hasPromotions;
    }

    public boolean shouldShowDialog() {
        return this.showDialog;
    }
}
