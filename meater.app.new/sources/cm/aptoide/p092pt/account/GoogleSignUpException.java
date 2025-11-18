package cm.aptoide.p092pt.account;

/* loaded from: classes.dex */
public class GoogleSignUpException extends Exception {
    private final String error;
    private final int statusCode;

    public GoogleSignUpException(String str, int i2) {
        this.error = str;
        this.statusCode = i2;
    }

    public String getError() {
        return this.error;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
