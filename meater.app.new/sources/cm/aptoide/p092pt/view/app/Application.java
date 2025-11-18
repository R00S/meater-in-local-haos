package cm.aptoide.p092pt.view.app;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class Application {
    private final long appId;
    private final int downloads;
    private final boolean hasBilling;
    private final String icon;
    private final String name;
    private final String packageName;
    private final float rating;
    private final String tag;

    public Application(String str, String str2, float f2, int i2, String str3, long j2, String str4, boolean z) {
        this.name = str;
        this.icon = str2;
        this.rating = f2;
        this.downloads = i2;
        this.appId = j2;
        this.packageName = str3;
        this.tag = str4;
        this.hasBilling = z;
    }

    public long getAppId() {
        return this.appId;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public float getRating() {
        return this.rating;
    }

    public String getTag() {
        return this.tag;
    }

    public boolean hasAppcBilling() {
        return this.hasBilling;
    }

    public Application() {
        this.name = null;
        this.icon = null;
        this.rating = -1.0f;
        this.downloads = -1;
        this.appId = -1L;
        this.packageName = null;
        this.tag = HttpUrl.FRAGMENT_ENCODE_SET;
        this.hasBilling = false;
    }
}
