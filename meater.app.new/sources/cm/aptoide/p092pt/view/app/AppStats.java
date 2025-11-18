package cm.aptoide.p092pt.view.app;

/* loaded from: classes.dex */
public class AppStats {
    private final int downloads;
    private final AppRating globalRating;
    private final int packageDownloads;
    private final AppRating rating;

    public AppStats(AppRating appRating, AppRating appRating2, int i2, int i3) {
        this.rating = appRating;
        this.globalRating = appRating2;
        this.downloads = i2;
        this.packageDownloads = i3;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public AppRating getGlobalRating() {
        return this.globalRating;
    }

    public int getPackageDownloads() {
        return this.packageDownloads;
    }

    public AppRating getRating() {
        return this.rating;
    }
}
