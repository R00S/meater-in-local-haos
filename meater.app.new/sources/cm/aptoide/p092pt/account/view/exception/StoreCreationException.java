package cm.aptoide.p092pt.account.view.exception;

/* loaded from: classes.dex */
public class StoreCreationException extends Exception {
    private final String errorCode;

    public StoreCreationException() {
        this.errorCode = null;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public boolean hasErrorCode() {
        return this.errorCode != null;
    }

    public StoreCreationException(String str) {
        this.errorCode = str;
    }
}
