package cm.aptoide.p092pt.view.app;

/* loaded from: classes.dex */
public class DetailedAppRequestResult {
    private final DetailedApp detailedApp;
    private final Error error;
    private final boolean loading;

    public enum Error {
        NETWORK,
        GENERIC
    }

    public DetailedAppRequestResult(Error error) {
        this.detailedApp = null;
        this.loading = false;
        this.error = error;
    }

    public DetailedApp getDetailedApp() {
        return this.detailedApp;
    }

    public Error getError() {
        return this.error;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public DetailedAppRequestResult(DetailedApp detailedApp) {
        this.detailedApp = detailedApp;
        this.loading = false;
        this.error = null;
    }

    public DetailedAppRequestResult(boolean z) {
        this.detailedApp = null;
        this.loading = z;
        this.error = null;
    }
}
