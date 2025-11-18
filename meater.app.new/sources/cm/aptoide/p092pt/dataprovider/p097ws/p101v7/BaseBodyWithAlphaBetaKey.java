package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;

/* loaded from: classes.dex */
public class BaseBodyWithAlphaBetaKey extends BaseBody {
    private String notApkTags;

    protected BaseBodyWithAlphaBetaKey(SharedPreferences sharedPreferences) {
        if (ManagerPreferences.getUpdatesFilterAlphaBetaKey(sharedPreferences)) {
            this.notApkTags = "alpha,beta";
        }
    }

    public String getNotApkTags() {
        return this.notApkTags;
    }

    public boolean shouldIncludeTag() {
        return true;
    }
}
