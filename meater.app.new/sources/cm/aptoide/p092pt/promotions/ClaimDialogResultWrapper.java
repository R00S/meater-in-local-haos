package cm.aptoide.p092pt.promotions;

import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ClaimDialogResultWrapper {
    private String packageName;
    private boolean status;

    public ClaimDialogResultWrapper(String str, boolean z) {
        this.packageName = str;
        this.status = z;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isOk() {
        return this.status && !this.packageName.equals(HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
