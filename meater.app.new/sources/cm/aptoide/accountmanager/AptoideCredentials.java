package cm.aptoide.accountmanager;

/* loaded from: classes.dex */
public class AptoideCredentials {
    private final String agent;
    private final String code;
    private final String email;
    private final boolean isChecked;
    private final String state;

    public AptoideCredentials(String str, String str2, boolean z, String str3, String str4) {
        this.email = str;
        this.code = str2;
        this.isChecked = z;
        this.agent = str3;
        this.state = str4;
    }

    public String getAgent() {
        return this.agent;
    }

    public String getCode() {
        return this.code;
    }

    public String getEmail() {
        return this.email;
    }

    public String getState() {
        return this.state;
    }

    public boolean isChecked() {
        return this.isChecked;
    }
}
