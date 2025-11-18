package cm.aptoide.p092pt.account;

/* loaded from: classes.dex */
public class FacebookSignUpException extends Exception {
    public static final int ERROR = 99;
    public static final int MISSING_REQUIRED_PERMISSIONS = 1;
    public static final int USER_CANCELLED = 2;
    private final int code;
    private final String facebookMessage;

    public FacebookSignUpException(int i2, String str) {
        this.code = i2;
        this.facebookMessage = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getFacebookMessage() {
        return this.facebookMessage;
    }
}
