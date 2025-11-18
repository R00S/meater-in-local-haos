package cm.aptoide.p092pt.view.app;

/* loaded from: classes.dex */
public class AppScreenshot {
    private final int height;
    private final String orientation;
    private final String url;
    private final int width;

    public AppScreenshot(int i2, int i3, String str, String str2) {
        this.height = i2;
        this.width = i3;
        this.orientation = str;
        this.url = str2;
    }

    public int getHeight() {
        return this.height;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }
}
