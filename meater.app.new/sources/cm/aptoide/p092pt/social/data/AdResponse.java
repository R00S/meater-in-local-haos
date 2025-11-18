package cm.aptoide.p092pt.social.data;

import android.view.View;

/* loaded from: classes.dex */
public class AdResponse {
    private final Status status;
    private final View view;

    public enum Status {
        error,
        ok
    }

    public AdResponse(View view, Status status) {
        this.view = view;
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    public View getView() {
        return this.view;
    }
}
