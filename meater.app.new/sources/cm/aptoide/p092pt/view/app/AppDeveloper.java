package cm.aptoide.p092pt.view.app;

/* loaded from: classes.dex */
public class AppDeveloper {
    private final String email;
    private final String name;
    private final String privacy;
    private final String website;

    public AppDeveloper(String str, String str2, String str3, String str4) {
        this.name = str;
        this.email = str2;
        this.privacy = str3;
        this.website = str4;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getPrivacy() {
        return this.privacy;
    }

    public String getWebsite() {
        return this.website;
    }
}
