package cm.aptoide.p092pt.downloadmanager;

/* loaded from: classes.dex */
public class DownloadError {
    private final Throwable errorException;
    private final String httpError;
    private final String urlError;

    public DownloadError(Throwable th, String str, String str2) {
        this.errorException = th;
        this.httpError = str;
        this.urlError = str2;
    }

    public Throwable getErrorException() {
        return this.errorException;
    }

    public String getHttpError() {
        return this.httpError;
    }

    public String getUrlError() {
        return this.urlError;
    }
}
