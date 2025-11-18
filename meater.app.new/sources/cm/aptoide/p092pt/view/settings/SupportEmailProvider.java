package cm.aptoide.p092pt.view.settings;

/* loaded from: classes.dex */
public class SupportEmailProvider {
    private final String aptoideEmail;
    private final String email;

    public SupportEmailProvider(String str, String str2) {
        this.email = str;
        this.aptoideEmail = str2;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean isAptoideSupport() {
        return this.aptoideEmail.equals(this.email);
    }
}
