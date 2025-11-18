package cm.aptoide.p092pt.dataprovider.p097ws.p101v7;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class BaseBodyWithApp extends BaseBodyWithAlphaBetaKey {
    private String storePassSha1;
    private String storeUser;

    public BaseBodyWithApp(SharedPreferences sharedPreferences) {
        super(sharedPreferences);
    }

    public String getStorePassSha1() {
        return this.storePassSha1;
    }

    public String getStoreUser() {
        return this.storeUser;
    }

    public void setStorePassSha1(String str) {
        this.storePassSha1 = str;
    }

    public void setStoreUser(String str) {
        this.storeUser = str;
    }
}
