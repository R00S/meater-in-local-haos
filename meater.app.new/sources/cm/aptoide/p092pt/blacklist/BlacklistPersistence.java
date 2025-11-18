package cm.aptoide.p092pt.blacklist;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class BlacklistPersistence {
    private SharedPreferences sharedPreferences;

    public BlacklistPersistence(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public void addImpression(String str, int i2) {
        int i3 = this.sharedPreferences.getInt(str, i2);
        if (i3 > 0) {
            this.sharedPreferences.edit().putInt(str, i3 - 1).apply();
        }
    }

    public void blacklist(String str) {
        this.sharedPreferences.edit().putInt(str, 0).apply();
    }

    public boolean isBlacklisted(String str, int i2) {
        return this.sharedPreferences.getInt(str, i2) == 0;
    }
}
