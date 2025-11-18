package cm.aptoide.p092pt.networking;

/* loaded from: classes.dex */
public class Authentication {
    private final String accessToken;
    private final String email;
    private final String password;
    private final String refreshToken;
    private final String type;

    public Authentication(String str, String str2, String str3, String str4, String str5) {
        this.email = str;
        this.refreshToken = str2;
        this.accessToken = str3;
        this.password = str4;
        this.type = str5;
    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getType() {
        return this.type;
    }

    public boolean isAuthenticated() {
        return (isEmpty(this.email) || isEmpty(this.accessToken) || isEmpty(this.refreshToken) || isEmpty(this.password)) ? false : true;
    }
}
