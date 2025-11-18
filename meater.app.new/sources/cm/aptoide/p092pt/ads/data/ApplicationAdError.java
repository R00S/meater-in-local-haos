package cm.aptoide.p092pt.ads.data;

import cm.aptoide.p092pt.view.app.AppsList;

/* loaded from: classes.dex */
public class ApplicationAdError {
    private final AppsList.Error minimalAdError;

    public ApplicationAdError(AppsList.Error error) {
        this.minimalAdError = error;
    }

    public String getErrorMessage() {
        AppsList.Error error = this.minimalAdError;
        if (error != null) {
            return error.name();
        }
        return null;
    }

    public boolean hasError() {
        return this.minimalAdError != null;
    }
}
