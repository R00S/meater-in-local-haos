package cm.aptoide.p092pt.app.view;

/* loaded from: classes.dex */
public class ReadMoreClickEvent {
    private String description;
    private boolean hasAppc;
    private String storeName;
    private String storeTheme;

    public ReadMoreClickEvent(String str, String str2, String str3, boolean z) {
        this.storeName = str;
        this.description = str2;
        this.storeTheme = str3;
        this.hasAppc = z;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreTheme() {
        return this.storeTheme;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }
}
